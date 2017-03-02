package com.softgroup.common.protocol;

import java.io.Serializable;

public class Request<T extends Serializable> extends RoutedAction<T> {
	private static final long serialVersionUID = -1024761631293962969L;

	public Request() {
	}

	private Request(ActionHeader header, T data) {
		this.setHeader(header);
		this.setData(data);
	}

	public static class Builder<T extends Serializable>{

		private ActionHeader header;
		private T data;

		public Builder() {
		}

		public Builder setHeader(ActionHeader header) {
			this.header = header;
			return this;
		}

		public Builder setData(T data) {
			this.data = data;
			return this;
		}

		public Request<T> build() {
			return new Request<T>(header, data);
		}
	}
}
