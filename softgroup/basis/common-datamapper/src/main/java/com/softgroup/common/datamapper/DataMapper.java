package com.softgroup.common.datamapper;

import java.io.InputStream;
import java.util.Map;

/**
 * @author vlischyshyn
 */
public interface DataMapper<T> {

	Map convertToMap(final T value);

	<T> T convert(Map<String, T> map, Class<T> dataType);

	<T>T mapData(String data, Class<T> dataType);

	<T> T mapData(byte[] message, Class<T> dataType);

	<T> T readValue(InputStream src, Class<T> valueType);

	String dataToString(T data);

	String objectToString(T data);

}
