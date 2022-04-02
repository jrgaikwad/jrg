package basic_sele_practice;

public class KJ_BrowsersLaunch1 {

	public static void main(String [] args) throws InterruptedException {
		KJ_BrowsersLaunch m = new KJ_BrowsersLaunch();
		m.startBrowser();
		m.launchfirefox();
		m.launchChrome();
		m.endBrowser();
		}
}
