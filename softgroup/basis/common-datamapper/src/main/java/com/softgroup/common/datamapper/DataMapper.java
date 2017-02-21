package com.softgroup.common.datamapper;

import java.io.InputStream;

/**
 * @author vlischyshyn
 */
public interface DataMapper {

	convertToMap(Object value);

	convert(map, Class<T> dataType);

	convert(map, dataType);

	mapData(String data, dataType);

	mapData(String data, dataType);

	mapData(byte[] message, dataType);

	readValue(InputStream src, valueType);

	String dataToString(data);

	String objectToString(data);

}
