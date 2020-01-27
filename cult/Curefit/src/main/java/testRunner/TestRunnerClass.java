package testRunner;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.BaseclassRunner;

public class TestRunnerClass extends BaseclassRunner{

	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		initialization();
	}

	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

	@Test
	public void curefit()
	{
		
		try
		{
			driver.navigate().to("https://www.cure.fit/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			cure.obj_eatfit.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
			cure.obj_Wellness.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			cure.obj_Buy.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			cure.obj_cart.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			cure.obj_cart_wrapper.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			WebElement obj_plus_sign = driver.findElement(By.xpath("//img[@class='plus-sign']"));
			for(int i=1;i<3;i++)
			{
				obj_plus_sign.click();
				//Thread.sleep(2000);
				driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			}
			cure.obj_cart_checkout.click();
			Thread.sleep(2000);
			//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

			cure.obj_sngoogle.click();
			//Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


			cure.obj_agree.click();
			//Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

			String P_W = driver.getWindowHandle();
			for(String C_W:driver.getWindowHandles())
			{
				driver.switchTo().window(C_W);
			}
			
			cure.obj_gmail.sendKeys("mahirssmm28@gmail.com");
			//Thread.sleep(1000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			cure.obj_next.click();
			//Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			cure.obj_pwd.sendKeys("mahirsm123@");
			//Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			cure.obj_next.click();
			//Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

			driver.switchTo().window(P_W);
			//Thread.sleep(6000);
			driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

			cure.obj_address.click();
			//Thread.sleep(4000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			cure.obj_btnaddress.click();
			//Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			cure.obj_btnloc.click();
			//Thread.sleep(4000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			cure.obj_flat.sendKeys("Vijayanagar");
			//Thread.sleep(4000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			cure.obj_checkmark.click();
			//Thread.sleep(4000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			cure.obj_saveaddress.click();
			//Thread.sleep(4000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			cure.obj_checkout.click();
			//Thread.sleep(4000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			cure.obj_NetBanking.click();
			//Thread.sleep(4000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			cure.obj_Axis.click();
			//Thread.sleep(4000);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			String A = driver.findElement(By.id("bank-select")).getText();
			if(A.equals("Axis Bank"))
			{
				System.out.println("Axis Bank Selected");
			}
			else
			{
				System.out.println("Not Selected");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
