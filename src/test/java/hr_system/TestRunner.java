package hr_system;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import com.user.controller.HomeController;

public class TestRunner {

	public static void main(String[] args) {

		Result result = JUnitCore.runClasses(HomeController.class, UserDAOTest.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(result.wasSuccessful());

		}
	}

}
