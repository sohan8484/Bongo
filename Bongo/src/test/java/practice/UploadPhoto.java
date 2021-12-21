package practice;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadPhoto {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/mens-footwear/pr?sid=osp,cil&otracker=nmenu_sub_Men_0_Footwear&fm=neo%2Fmerchandising&iid=M_5586dbfd-e3be-4a01-8786-e0070b19954b_1_372UD5BXDFYS_MC.PR9Y9GHWCY6G&otracker=hp_rich_navigation_5_1.navigationCard.RICH_NAVIGATION_Fashion~Men%2BFootwear_PR9Y9GHWCY6G&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_5_L1_view-all&cid=PR9Y9GHWCY6G");
		 List<WebElement> price = driver.findElements(By.xpath("//div[.='BRUTON']/ancestor::div[@class='_1xHGtK _373qXS']/descendant::div[@class='_30jeq3']"));
		
		for (WebElement webElement : price) {
			String text = webElement.getText();
			System.out.println(text);
		}
		
		
		driver.close();
		//		driver.get("file:///E:/TYSS_work/htmlLinks/upload.html");
//		File fl = new File("./src/main/resources/fileupload.docx");
//		String path=fl.getAbsolutePath();
//		driver.findElement(By.id("cv")).sendKeys(path);
//		driver.close();
}
}
