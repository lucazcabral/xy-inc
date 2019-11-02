package br.com.lucas.xyinc.poi.exceptions;

public class PointInterestServiceException extends Exception {

	private static final long serialVersionUID = 1L;

	public PointInterestServiceException() {
		super();
	}

	public PointInterestServiceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PointInterestServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public PointInterestServiceException(String message) {
		super(message);
	}

	public PointInterestServiceException(Throwable cause) {
		super(cause);
	}

	
}
