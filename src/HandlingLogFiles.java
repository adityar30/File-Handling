import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class HandlingLogFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*ExtentReports ex=new ExtentReports("E:\\FilesConcept\\Report.html");
		ExtentTest ext=ex.startTest("AutomationReport");
		ext.log(LogStatus.PASS, "Browser opened successfully");
		ext.log(LogStatus.PASS, "App openend successfully");
		ext.log(LogStatus.PASS, "Enter Username");
		ext.log(LogStatus.FAIL, "Click on Login");
		ex.endTest(ext);
		ex.flush();
		ex.close();*/
		
		ExtentReports a = new ExtentReports("E:\\FilesConcept\\Report.html");
		ExtentTest b=a.startTest("AutomationTest");
		b.log(LogStatus.PASS, "Browser opened successfully");
		b.log(LogStatus.PASS, "App openend successfully");
		b.log(LogStatus.PASS, "Enter Username");
		b.log(LogStatus.FAIL, "Click on Login");
		a.endTest(b);
		a.flush();
		a.close();
		
	}

}
