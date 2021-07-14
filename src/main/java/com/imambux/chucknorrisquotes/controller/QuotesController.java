package com.imambux.chucknorrisquotes.controller;

import com.imambux.chucknorrisquotes.model.Quote;
import com.imambux.chucknorrisquotes.service.ChuckNorrisQuotesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QuotesController {

    public final ChuckNorrisQuotesService chuckNorrisQuotesService;

    public QuotesController(ChuckNorrisQuotesService chuckNorrisQuotesService) {
        this.chuckNorrisQuotesService = chuckNorrisQuotesService;
    }

    @RequestMapping
    public ModelAndView getQuote() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("quote", chuckNorrisQuotesService.getRandomQuote());
        return modelAndView;
    }

}
