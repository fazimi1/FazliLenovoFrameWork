package signin;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class signinlenovo extends CommonAPI {
    @Test
    public void search() {
        driver.findElement(By.linkText("Account")).click();
        driver.findElement(By.name("j_username")).sendKeys("12342@gmail.com");
        driver.findElement(By.name("j_password")).sendKeys("1234");
        driver.findElement(By.xpath("//*[@id=\"nemoLoginForm\"]/button")).click();
    }
}