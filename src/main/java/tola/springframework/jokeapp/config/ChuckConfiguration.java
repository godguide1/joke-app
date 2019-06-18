package tola.springframework.jokeapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * Created by Adetola on 18/06/2019
 */
//@Configuration
public class ChuckConfiguration {

    //@Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
}
