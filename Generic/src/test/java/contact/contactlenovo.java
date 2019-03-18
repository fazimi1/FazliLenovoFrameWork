package contact;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class contactlenovo extends CommonAPI {
    @Test
    public void search() {
        driver.findElement(By.id("contact")).click();

        driver.findElement(By.linkText("CHAT Available 24/7")).click();


        driver.findElement(By.id("pFirstName")).sendKeys("Hi");


            }
        }



