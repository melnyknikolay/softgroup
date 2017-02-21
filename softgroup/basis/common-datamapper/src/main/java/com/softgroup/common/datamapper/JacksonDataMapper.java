package com.softgroup.common.datamapper;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.softgroup.common.exceptions.MapperException;

import java.io.InputStream;
import java.util.Map;

/**
 * @author Arthas
 */
public class JacksonDataMapper implements DataMapper {
	private static final String CPJ = "Can't parse json";

	private final ObjectMapper mapper;

	public JacksonDataMapper() {
		mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
		mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
		mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
	}

	public ObjectMapper getMapper() {
		return mapper;
	}

	@Override
	public Map<convertToMap(final value) {
		try {
			return (Map<String, Object>) mapper.convertValue(value, Map.class);
		} catch (Exception ex) {
			throw new MapperException("Can't convert to map ", ex);
		}
	}

	@Override
	public convert(map, dataType) {
		try {
			return mapper.convertValue(map, dataType);
		} catch (Exception ex) {
			throw new MapperException("Can't convert map ", ex);
		}
	}

	@Override
	public convert(map, dataType) {
		try {
			return mapper.convertValue(map, dataType);
		} catch (Exception ex) {
			throw new MapperException("Can't convert map ", ex);
		}
	}

	@Override
	public mapData(String data, dataType) {
		try {
			return mapper.readValue(data, dataType);
		} catch (Exception ex) {
			throw new MapperException(CPJ, ex);
		}
	}

	@Override
	public mapData(String data, dataType) {
		try {
			return mapper.readValue(data, dataType);
		} catch (Exception ex) {
			throw new MapperException(CPJ, ex);
		}
	}

	@Override
	public mapData(byte[] message, dataType) {
		try {
			return mapper.readValue(message, dataType);
		} catch (Exception ex) {
			throw new MapperException(CPJ, ex);
		}
	}

	@Override
	public readValue(InputStream src, valueType) {
		try {
			return mapper.readValue(src, valueType);
		} catch (Exception ex) {
			throw new MapperException("Can't read from stream ", ex);
		}
	}

	@Override
	public String dataToString(data) {
		try {
			return new String(mapper.writeValueAsBytes(data), "UTF-8");
		} catch (Exception ex) {
			throw new MapperException("Can't convert object to json string", ex);
		}
	}

	@Override
	public String objectToString(data) {
		try {
			return mapper.writeValueAsString(data);
		} catch (Exception e) {
			throw new MapperException("Can`t create string", e);
		}
	}

}