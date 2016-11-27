package GuiceDemo;

import junit.framework.TestCase;

/**
 * Created by ROHIT on 11/27/2016.
 */
public class SocialSentimentServiceTest extends TestCase{
    public void testSocialSentimentService() {
        SocialSentiment socialSentiment = new SocialSentimentService();
        assertTrue(0==socialSentiment.getCloutScore(""));
    }
}
