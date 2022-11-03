package amazon;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testAmazon {

	@Test
	public static void testMin() throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thiva\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");

		WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iphone 13");
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		List<String> allPriceList=new ArrayList<String>();
		
		List<WebElement> priceList=driver.findElements(By.xpath("//*[@class='a-price-whole']"));

		for (WebElement individualPrice : priceList) {
			String phonePrice=individualPrice.getText();
			allPriceList.add(phonePrice);

		}
		Thread.sleep(1000);
		
		System.out.println(allPriceList);
		System.out.println(allPriceList.size());
		String[] phonePriceArr=new String[allPriceList.size()];
		allPriceList.toArray(phonePriceArr);
		Arrays.sort(phonePriceArr);
		
		int min=Integer.MAX_VALUE;
		int s_min=Integer.MAX_VALUE;
		
for (int i = 0; i < phonePriceArr.length; i++) {
int convertedInteger=Integer.parseInt(phonePriceArr[i].replace(",", ""));
	if (convertedInteger<min) {
		min=convertedInteger;
		}
	if (convertedInteger>min && convertedInteger<s_min) {
		s_min=convertedInteger;
		
	}	
}
		System.out.println(s_min);
		Thread.sleep(1000);
		String secondMinPrice= NumberFormat.getIntegerInstance().format(s_min);
		System.out.println(secondMinPrice);
		////*[normalize-space()='69,900']
	String secondMinPriceXpath="//*[normalize-space()="+"\""+secondMinPrice+"\""+"]";	
	System.out.println(secondMinPriceXpath);
		WebElement clickIphone=driver.findElement(By.xpath(secondMinPriceXpath));
		clickIphone.click();
	}

}
