import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagExpo {
	public static WebDriver driver;
	
	public static void importStatement() {
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Dinesh K\\eclipse-workspace\\TagExpo\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://tagexpo.in/");
		driver.manage().window().maximize();
	}
	
	public static void signUp() {
		WebElement signup = driver.findElement(By.xpath("(//a[@href='sign-in'])[1]"));
		signup.click();
		WebElement email = driver.findElement(By.xpath("(//input[@class='login__input'])[1]"));
		email.sendKeys("ksaravanaprasadinfinityhub@gmail.com");
		WebElement passward = driver.findElement(By.xpath("(//input[@class='login__input'])[2]"));
		passward.sendKeys("12345678");
		WebElement submit = driver.findElement(By.xpath("//span[@class='button__text']"));
		submit.click();
	}
	public static void navigate() { 
		driver.navigate().back();
		driver.navigate().refresh();
	}
    public static void forVisitorHomeButton() {
    	WebElement homeButton = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/ol/li[1]/a"));
		homeButton.click();
}
    public static void forVisitor() throws InterruptedException {
    	WebElement forvisior = driver.findElement(By.xpath("//a[@href='/visitor']"));
        forvisior.click();    	
        WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
        name.sendKeys("dinesh");
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("dineeeh@gmail.com");
        WebElement phnumber= driver.findElement(By.xpath("//input[@name='phone_no']"));
        phnumber.sendKeys("6379732891");
        WebElement company = driver.findElement(By.xpath("//input[@name='company']"));
        company.sendKeys("infinityhub");
        WebElement message = driver.findElement(By.xpath("//textarea[@name='message']"));
        message.sendKeys("Hii");
        Thread.sleep(3000);
        WebElement submit = driver.findElement(By.xpath("//span[@class='button__text']"));
        submit.click();
        Thread.sleep(3000);
        WebElement download = driver.findElement(By.xpath("//button[@id='printdiv']"));
        download.click();
		}
    public static void forBuyer() {
   WebElement buyer = driver.findElement(By.linkText("For Buyers"));
   buyer.click();
	}
    public static void forExhibitors() throws InterruptedException {
     WebElement forexhibitor = driver.findElement(By.xpath("(//a[@href='/exhibitor'])[1]"));
     forexhibitor.click();
     WebElement companyName = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
     companyName.sendKeys("infinity");
     WebElement brandName= driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
     brandName.sendKeys("Addidas");
     WebElement address = driver.findElement(By.xpath("(//input[@class='form-control'])[3]"));
     address.sendKeys("erode");
     WebElement managingDirector= driver.findElement(By.xpath("(//input[@class='form-control'])[4]"));
     managingDirector.sendKeys("Sachithananthan");
     WebElement mobileNumber = driver.findElement(By.xpath("(//input[@class='form-control'])[5]"));
     mobileNumber.sendKeys("6379732891");     
     WebElement contactPerson = driver.findElement(By.xpath("(//input[@class='form-control'])[6]"));
     contactPerson.sendKeys("hr department");
     WebElement panNo= driver.findElement(By.xpath("(//input[@class='form-control'])[7]"));
     panNo.sendKeys("5849596565645856");
     WebElement gstNO = driver.findElement(By.xpath("(//input[@class='form-control'])[9]"));
     gstNO.sendKeys("84565456465465");
     WebElement phNumber = driver.findElement(By.xpath("(//input[@class='form-control'])[10]"));
     phNumber.sendKeys("6379732892");
     WebElement eMail = driver.findElement(By.xpath("(//input[@class='form-control'])[11]"));
     eMail.sendKeys("dinessh@gmail.com");
     WebElement webSite= driver.findElement(By.xpath("(//input[@class='form-control'])[12]"));
     webSite.sendKeys("dinesh@yahoo.com");
     WebElement passward = driver.findElement(By.xpath("(//input[@class='form-control'])[13]"));
     passward.sendKeys("Dinesh@005");
     WebElement register= driver.findElement(By.xpath("(//button[@class='next action-button'])[1]"));
     register.click();
     
     //2.steps
     WebElement category= driver.findElement(By.xpath("(//input[@class='checkbox '])[1]"));
     category.click();
     Thread.sleep(3000);
     WebElement productOnDisplay= driver.findElement(By.xpath("(//input[@class='checkbox '])[10]"));
     productOnDisplay.click();
     WebElement continueButton = driver.findElement(By.xpath("(//button[@class='next action-button'])[2]"));
     continueButton.click();
      
      
     
     
     
     
     
	}
    
    public static void main(String[] args) throws InterruptedException {
    	importStatement();
    	//forVisitor();
    	//forBuyer();
    	//forExhibitors();
    	  signUp();
    	
		
	}
		 
		
		
		
	
  
	  
}
