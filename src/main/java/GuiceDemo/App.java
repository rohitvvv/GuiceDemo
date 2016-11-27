package GuiceDemo;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Hello world!
 *
 */




public class App {
    public static void main( String[] args ) {
        Injector injector = Guice.createInjector(new SentimentAnalysisModule());
        SentimentAnalysisUtility ulility = injector.getInstance(SentimentAnalysisUtility.class);
        System.out.println(ulility.getSentiment());
    }
}
