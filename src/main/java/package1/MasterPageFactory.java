
    package package1;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.SearchContext;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class MasterPageFactory {




		public MasterPageFactory(WebDriver driver) {
			PageFactory.initElements(driver,this);
			
			
		}
		
		@FindBy(xpath="(//*[contains (text(),' Signup / Login')])[1]")
		private WebElement loginBtn1;
		
		@FindBy(xpath="(//*[@name='email'])[1]")
		private WebElement emailField;
		
		@FindBy(xpath="//*[@name='password']")
		private WebElement passwordField;
		
		@FindBy(xpath ="(//*[@class='btn btn-default'])[1]")
		private WebElement lognBtn2;
		
		@FindBy(xpath="//div[contains(text(),'Oslo')and@id='box1']")
		private WebElement dragOslo;
		
		@FindBy(xpath="//div[contains(text(),'Norway')]")
		private WebElement dropNorway;
		
		@FindBy(xpath="(//div[contains(text(),'Washington')])[2]")
		private WebElement dragWashington;
		
		public WebElement getDragWashington() {
			return dragWashington;
		}

		@FindBy(xpath="(//div[@class='dragableBoxRight'])[7]")
	    private WebElement dropUnitedState;
		
		//zoopla 
		
		@FindBy(xpath="//span[contains(text(),'Accept all cookies')]")
		private List< WebElement >acceptCookiesBtn;
		
		@FindBy(xpath="(//span[contains(text(),'Sign in')])[2]")
		private WebElement zooplaLogin;
		
		@FindBy(xpath="//input[@name='email']")
		private WebElement zooplaemail;
		
		
		@FindBy(xpath="//input[@id='current-password']")
		private WebElement zooplaPassword;
		
		
		@FindBy(xpath="//button[@class='_1erwn750 _1erwn751 _1erwn752 _1erwn75a _1dgm2fc8']")
	    public WebElement zooplaLoginbtn2;
		
		//costco
		@FindBy(xpath="(//*[@class='nav-flyout'])[4]")
		public WebElement Services;


		public WebElement getServices() {
			return Services;
		}

		public WebElement getZooplaemail() {
			return zooplaemail;
		}

		public WebElement getZooplaPassword() {
			return zooplaPassword;
		}

		public WebElement getZooplaLoginbtn2() {
			return zooplaLoginbtn2;
		}

		public WebElement getZooplaLogin() {
			return zooplaLogin;
		}

		public List <WebElement> getAcceptCookiesBtn() {
			return acceptCookiesBtn;
		}

		public WebElement getDropUnitedState() {
			return dropUnitedState;
		}

		public WebElement getPasswordField() {
			return passwordField;
		}

		public WebElement getDragOslo() {
			return dragOslo;
		}

		public WebElement getDropNorway() {
			return dropNorway;
		}

		public WebElement getEmailField() {
			return emailField;
		}

		public WebElement getPasswordfield() {
			return passwordField;
		}

		public WebElement getLognBtn2() {
			return lognBtn2;
		}

		public WebElement getLoginBtn1() {
			return loginBtn1;
		}

		
	}
	
	
	
	
	
	
	


