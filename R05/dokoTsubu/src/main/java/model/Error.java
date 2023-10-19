package model;

import java.io.Serializable;

public class Error implements Serializable {
	private String error = "";
	public Error() {}
	public void setError(String error) {
		this.error = error;
	}
	public String getError() {
		return this.error;
	}
}
