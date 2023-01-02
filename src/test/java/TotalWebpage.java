import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalWebpage {
	public static WebDriver driver;
	private  static void importStatement() {
		try {
			WebDriverManager.chromedriver().setup();
            driver =new ChromeDriver();
            driver.get("https://empowertherapy.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
             List<WebElement> total = driver.findElements(By.tagName("a"));
             for (int i = 0; i < total.size(); i++) {
     			System.out.println(total.get(i).getText());}
            int count =total.size();
           System.out.println(count+ "total no links");
			
		} catch (Exception e) {
			 System.out.println("Not working");
		}
		     
            
	}
	public static void main(String[] args) {
		importStatement();
	}

}
