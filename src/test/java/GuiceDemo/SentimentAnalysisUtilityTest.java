package GuiceDemo;

import GuiceDemo.*;
import junit.framework.TestCase;
import static org.mockito.Mockito.*;
/**
 * Created by ROHIT on 11/27/2016.
 */
public class SentimentAnalysisUtilityTest extends TestCase{
    SocialSentiment socialSentimentMock = mock(SocialSentimentService.class);
    FactualScore factualScoreMock = mock(FactualScoreService.class);

    public void testSentimentAnalysisUtility(){
        //Define behaviour for the mock objects
        when(socialSentimentMock.getCloutScore("")).thenReturn(0);
        when(factualScoreMock.getFactualScore("")).thenReturn(0);
        SentimentAnalysisUtility utility1 = new SentimentAnalysisUtility(socialSentimentMock,factualScoreMock);
        assertEquals(true,utility1.getSentiment());
        when(socialSentimentMock.getCloutScore("")).thenReturn(1);
        SentimentAnalysisUtility utility2 = new SentimentAnalysisUtility(socialSentimentMock,factualScoreMock);
        assertEquals(false,utility2.getSentiment());
    }
}
