package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownPractice {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropDown = new Select(staticDropDown);
        dropDown.selectByIndex(3);
        System.out.println(dropDown.getFirstSelectedOption().getText());




        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        for (int i = 0; i < 5; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        // driver.quit();
    }

}
