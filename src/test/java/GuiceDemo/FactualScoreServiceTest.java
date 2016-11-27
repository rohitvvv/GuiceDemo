package GuiceDemo;

import junit.framework.TestCase;

/**
 * Created by ROHIT on 11/27/2016.
 */
public class FactualScoreServiceTest extends TestCase{
    public void testApp() {
        FactualScore factualScore = new FactualScoreService();
        assertTrue(0==factualScore.getFactualScore(""));
    }
}
