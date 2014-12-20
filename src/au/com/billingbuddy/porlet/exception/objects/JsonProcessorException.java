package au.com.billingbuddy.porlet.exception.objects;

public class JsonProcessorException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8765095121320680677L;
	private String errorCode;
	private String errorMessage;

	
	public JsonProcessorException(Exception e) {
		super(e);
	}

	public JsonProcessorException(String message) {
		super(message);
	}

	public JsonProcessorException(String message, Throwable cause) {
		super(message, cause);
	}

	public JsonProcessorException(Throwable cause) {
		super(cause);
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
