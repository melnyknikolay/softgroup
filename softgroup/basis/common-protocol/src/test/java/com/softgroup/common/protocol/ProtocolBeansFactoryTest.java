package com.softgroup.common.protocol;

import com.softgroup.common.datamapper.DataMapper;
import com.softgroup.common.datamapper.JacksonDataMapper;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by nikmlk on 10.03.17.
 */

public class ProtocolBeansFactoryTest {

    private DataMapper mapper = new JacksonDataMapper();

    private Request<?> request = new Request.Builder()
            .setData("testData")
            .setHeader(new ActionHeader.Builder()
                                        .setCommand("command")
                                        .setOriginUuid("uuid")
                                        .setType("type")
                                        .setVersion("version")
                                        .build())
            .build();

    @Test
    public void getRequestTest(){
        Request<String> result = ProtocolBeansFactory.getRequest(this.request, mapper.convert(request.getData(), String.class));
        assertThat(result.getData() , isA(String.class));
        assertEquals(result.getHeader(), request.getHeader());
    }

    @Test
    public void getResponseOkTest(){
        Response<String> result = ProtocolBeansFactory.getResponse(request, "responseTestData");
        assertThat(result.getData() , isA(String.class));
        assertEquals("responseTestData", result.getData());
        assertThat(result.getStatus(), is(ResponseStatus.OK));
    }

    @Test
    public void getResponseWithStatusTest(){
        Response<Integer> result = ProtocolBeansFactory.getResponse(request, 524, ResponseStatus.NOT_IMPLEMENTED);
        assertThat(result.getData() , isA(Integer.class));
        assertEquals((long) 524, (long)result.getData());
        assertThat(result.getStatus(), is(ResponseStatus.NOT_IMPLEMENTED));
    }
}