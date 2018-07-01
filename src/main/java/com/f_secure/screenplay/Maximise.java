package com.f_secure.screenplay;

import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Ability;
import org.openqa.selenium.WebDriver;

@Slf4j
public class Maximise implements Ability {
    private final WebDriver webDriver;

    private Maximise(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public Ability toFullScreen(){
        webDriver.manage().window().fullscreen();
        log.info("Windows has been maximise.");
        return this;
    }

    public static Maximise driver(WebDriver webDriver){
        return new Maximise(webDriver);
    }
}
