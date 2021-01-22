import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Testing {

	public static void main(String[] args) throws MalformedURLException {
		File appDir = new File("src");
		File app = new File(appDir, "ApiDemos-debug.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		// call driver by name Ex: android or IOS
		// Here we will use Android Driver and connect to server 127.0.0.1
		//driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		AndroidDriver <AndroidElement> driver = new AndroidDriver<> (new URL("http://127.0.0.1:4723/wd/hub"), cap);
		//return driver;
		

	}

}
