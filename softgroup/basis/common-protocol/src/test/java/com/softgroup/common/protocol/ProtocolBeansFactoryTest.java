package com.softgroup.common.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.Serializable;

import static org.junit.Assert.*;

/**
 * Created by nikmlk on 10.03.17.
 */

@RunWith(SpringJUnit4ClassRunner.class)
public class ProtocolBeansFactoryTest {

    Request<?> request = new Request.Builder()
            .setData("fwknk")
            .setHeader(new ActionHeader.Builder()
                                        .setCommand("command")
                                        .setOriginUuid("uuid")
                                        .setType("type")
                                        .setVersion("version")
                                        .build())
            .build();
    @Test
    public void serverErrorTest(){
        Response<Serializable> serializableResponse = ProtocolBeansFactory.serverError(request);
    }
}