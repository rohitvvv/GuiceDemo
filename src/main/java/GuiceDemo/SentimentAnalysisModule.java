package GuiceDemo;

import com.google.inject.AbstractModule;

/**
 * Created by ROHIT on 11/27/2016.
 */
public class SentimentAnalysisModule extends AbstractModule {
    protected void configure() {
        bind(FactualScore.class).to(FactualScoreService.class);
        bind(SocialSentiment.class).to(SocialSentimentService.class);
    }
}
