import CommonFunctions.FunctionLibrary;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.net.MalformedURLException;

public class TestFramework {

   FunctionLibrary functions = new FunctionLibrary();

    @Before
    public void beforeTest() throws Exception
    {
        functions.setUp();
    }

    @After
    public void afterTest()
    {
    }

}
