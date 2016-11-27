package GuiceDemo;

import com.google.inject.Inject;

/**
 * Created by ROHIT on 11/27/2016.
 */
public class SentimentAnalysisUtility {//implements SentimentAnalysis {
    private FactualScore factualScore;
    private SocialSentiment socialSentiment;
    @Inject
    public void SentimentAnalysisUtility(SocialSentiment sentimentObject, FactualScore factualObject) {
        this.factualScore = factualObject;
        this.socialSentiment=sentimentObject;
    }
    public boolean getSentiment(){
        return true;
    }
}
