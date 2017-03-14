package com.softgroup.common.protocol;

import java.io.Serializable;

public class Request<T extends Serializable> extends RoutedAction<T> {
	private static final long serialVersionUID = -1024761631293962969L;

	private Request() {
	}

	public static class Builder<T extends Serializable>{

		private Request<T> request = new Request<T>();

		public Builder() {
		}

		public Builder setHeader(ActionHeader header) {
			request.setHeader(header);
			return this;
		}

		public Builder setData(T data) {
			request.setData(data);
			return this;
		}

		public Request<T> build() {
			return request;
		}
	}
}
