package GuiceDemo;

import com.google.inject.Inject;

/**
 * Created by ROHIT on 11/27/2016.
 */
public class SentimentAnalysisUtility {//implements SentimentAnalysis {
    private FactualScore factualScore;
    private SocialSentiment socialSentiment;

    @Inject
    public SentimentAnalysisUtility(SocialSentiment sentimentObject, FactualScore factualObject) {
        this.factualScore = factualObject;
        this.socialSentiment=sentimentObject;
    }

    public boolean getSentiment(){
        if(0==factualScore.getFactualScore("")&&0==socialSentiment.getCloutScore(""))
            return true;
        else
            return false;
    }
}
