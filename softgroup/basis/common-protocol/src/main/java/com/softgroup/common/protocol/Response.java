package com.softgroup.common.protocol;

import java.io.Serializable;

public class Response<T extends Serializable> extends RoutedAction<T> {
	private static final long serialVersionUID = 8979170551734666755L;

	private ResponseStatus status;

	private Response(ActionHeader header, T data, ResponseStatus status) {
		this.setHeader(header);
		this.setData(data);
		this.status = status;
	}

	public ResponseStatus getStatus() {
		return status;
	}

	public void setStatus(ResponseStatus status) {
		this.status = status;
	}

	public static class Builder<T extends Serializable>{

		private Response<T> response;
		private ActionHeader header;
		private T data;
		private ResponseStatus status;

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

		public Builder setStatus(ResponseStatus status) {
			this.status = status;
			return this;
		}

		public Response<T> build() {
			response = new Response<T>(header, data, status);
			return response;
		}
	}
}
