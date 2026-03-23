package sganalytics.exceptions;
/**
 * This exception will be thrown when user passed invalid browser name
 * Valid browser name supported by this framework are
 * <ul>
 * 		<li>Chrome</li>
 * 		<li>firefox</li>
 * 		<li>Edge</li>
 * </ul>
 */

public class InvalidBrowserNameException extends RuntimeException {
	private String browserName;
	
	public InvalidBrowserNameException(String browserName) {
		this.browserName = browserName;
	}
	
	@Override
		public String getMessage() {
			return this.browserName+" browser is not supported";
		}
	
	

}
