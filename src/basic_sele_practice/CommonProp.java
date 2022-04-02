package basic_sele_practice;

public interface CommonProp {
	
	void start();
	void end();
	void launchChrome() throws InterruptedException;
	void launchFireFox() throws InterruptedException;
	static String brow1key = "webdriver.gecko.driver";
	static String brow2key = "webdriver.chrome.driver";
	
	static String brow1val = "F:\\SW Testing\\Browser Drivers\\geckodriver.exe";
	static String brow2val = "F:\\SW Testing\\Browser Drivers\\chromedriver.exe";
	
	static String url1= "https://in.indeed.com";
	static String url2= "https://in.indeed.com";

}
