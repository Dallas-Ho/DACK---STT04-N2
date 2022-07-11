/*
    Test Steps
    Step 1. Go to https://giacmosuaviet.com.vn/
    Step 2. Click on -> Tài khoản
    Step 3. Click on -> Đăng ký
    Step 4. Login in application using previously created credential
    Step 5. Quick
 */
package KIEMTRA;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class testcase1_kiemtra {
    public static void  test_dangky() {
        int scc=0;
        StringBuffer verificationErrors = new StringBuffer();

        WebDriver driver= driverFactory.getChromeDriver();
        try {
            //Step 1. Go to https://giacmosuaviet.com.vn/
            driver.get("https://giacmosuaviet.com.vn/ ");


            //Step 2. Click on -> Tài khoản
            driver.findElement(By.linkText("Tài khoản")).click();
            Thread.sleep(2000);

            //Step 3. Click on -> Đăng ký
            driver.findElement(By.linkText("Đăng ký")).click();
            Thread.sleep(2000);

            //Step 4. Login in application using previously created credential
            By LastName= new By.ByXPath("//*[@id=\"last_name\"]");
            WebElement values1 = driver.findElement(LastName);
            values1.sendKeys("Nguyen Tran Hoang");

            By Name= new By.ByXPath("//*[@id=\"first_name\"]");
            WebElement values2 = driver.findElement(Name);
            values2.sendKeys("Vinh");

            By Email= new By.ByXPath("//*[@id=\"email\"]");
            WebElement values3 = driver.findElement(Email);
            values3.sendKeys("nguyenvinh20072002@gmail.com");

            By Phone= new By.ByXPath("//*[@id=\"phone_ac\"]");
            WebElement values4 = driver.findElement(Phone);
            values4.sendKeys("0373261060");

            By Birth= new By.ByXPath("//*[@id=\"birthdate\"]");
            WebElement values5 = driver.findElement(Birth);
            values5.sendKeys("20/07/2008");

            By Password= new By.ByXPath("//*[@id=\"password\"]");
            WebElement values6 = driver.findElement(Password);
            values6.sendKeys("vinh2007!@#");

            driver.findElement(By.xpath("//*[@id=\"create_customer\"]/div[4]/div[1]/label")).click();
            Thread.sleep(2000);

            driver.findElement(By.xpath("//*[@id=\"create_customer\"]/div[4]/div[2]")).click();
            Thread.sleep(2000);

        }catch (Exception e){
            e.printStackTrace();
        }
        //Step 5. Quick
        driver.quit();
    }
}
