package basic_sele_practice;

public interface KJ_CommonProperties {
	String key1 = "webdriver.chrome.driver";
	String key2 = "webdriver.gecko.driver";
	String value1 = "F:\\SW Testing\\Browser Drivers\\chromedriver.exe";
	
	String value2 = "F:\\SW Testing\\Browser Drivers\\geckodriver.exe";
	
	void startBrowser();
	public void launchChrome() throws InterruptedException;
	void launchfirefox() throws InterruptedException;
	void endBrowser();
}
