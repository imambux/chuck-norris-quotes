package com.imambux.chucknorrisquotes.service;

import com.imambux.chucknorrisquotes.model.Quote;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisQuotesService {

    public Quote getRandomQuote() {
        Quote quote = new Quote();
        quote.setJoke(new ChuckNorrisQuotes().getRandomQuote());
        return quote;
    }

}
