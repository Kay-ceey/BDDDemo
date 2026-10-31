package hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks {
    @Before
    public void setUp(){
        System.out.println("starting test");
    }

    @After
    public void tearDown(){
        System.out.println("Tearing down");
    }
}
