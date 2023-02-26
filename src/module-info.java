//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import com.mystore.Base.BaseClass;
//import com.mystore.PageObjects.IndexPage;
//
//module ExampleProject {
//	
//	public class IndexPageTest extends BaseClass{
//
//		IndexPage indexpage;
//		
//		
//		@BeforeMethod
//		public void setup() {
//			launchApp();
//		}
//		
//		@AfterMethod
//		public void teardown() {
//			driver.quit();
//		}
//		
//		@Test
//		public void QuizTesting1() throws Throwable {
//			 indexpage = new IndexPage();
//			 indexpage.Assessment();
//			 
//			 
//		}
//}