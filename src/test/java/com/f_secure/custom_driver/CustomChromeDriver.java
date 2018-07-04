package com.f_secure.custom_driver;
import lombok.extern.slf4j.Slf4j;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@Slf4j
public class CustomChromeDriver implements DriverSource {
    private final static String WEB_DRIVER_PROVIDED_TYPE ="webdriver.provided.type";
    private final static String WEB_DRIVER_CHROME_DRIVER ="webdriver.chrome.driver";
    private final static String MY_DRIVER ="mydriver";
    private final static String USE_AUTOMATION_EXTENSION ="useAutomationExtension";

    @Override
    public WebDriver newDriver() {
        setSystemChromeProperty();
        return new ChromeDriver(disableChromeAutomationExtension());
    }

    private void setSystemChromeProperty(){
        String path="E:\\practice-code\\f-secure\\chromedriver.exe";
        System.setProperty(WEB_DRIVER_PROVIDED_TYPE,MY_DRIVER);
        System.setProperty(WEB_DRIVER_CHROME_DRIVER,path);
    }

    private ChromeOptions disableChromeAutomationExtension(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption(USE_AUTOMATION_EXTENSION,false);
        log.info("'useAutomationExtension' flag is disabled");
        return chromeOptions;
    }

    @Override
    public boolean takesScreenshots() {
        return false;
    }
}