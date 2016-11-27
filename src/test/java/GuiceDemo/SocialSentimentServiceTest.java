package GuiceDemo;

import junit.framework.TestCase;

/**
 * Created by ROHIT on 11/27/2016.
 */
public class SocialSentimentServiceTest extends TestCase{
    public void testApp() {
        SocialSentiment socialSentiment = new SocialSentimentService();
        assertTrue(0==socialSentiment.getCloutScore(""));
    }
}
