package rs.edu.raf.StockService.cucumber;


import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
//C:\Users\petar\Desktop\Banka-2-Backend\StockService\src\test\resources
//C:\Users\petar\Desktop\Banka-2-Backend\StockService\src\test\java\rs\edu\raf\StockService\cucumber\CucumberIntegrationTest.java
@CucumberOptions(features = "src/test/resources", glue = "rs.edu.raf.StockService.cucumber", tags = "not @Ignore")
@RunWith(Cucumber.class)
public class CucumberIntegrationTest {
}
