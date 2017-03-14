package com.softgroup.common.protocol;

import java.io.Serializable;

public class Response<T extends Serializable> extends RoutedAction<T> {
	private static final long serialVersionUID = 8979170551734666755L;

	private ResponseStatus status;

	private Response() {
	}

	public ResponseStatus getStatus() {
		return status;
	}

	public void setStatus(ResponseStatus status) {
		this.status = status;
	}

	public static class Builder<T extends Serializable>{

		private Response<T> response = new Response<T>();

		public Builder() {
		}

		public Builder setHeader(ActionHeader header) {
			response.setHeader(header);
			return this;
		}

		public Builder setData(T data) {
			response.setData(data);
			return this;
		}

		public Builder setStatus(ResponseStatus status) {
			response.setStatus(status);
			return this;
		}

		public Response<T> build() {
			return response;
		}
	}
}
