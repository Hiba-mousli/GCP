package org.closure.gcp.controllers;

import org.closure.gcp.exceptions.QuestionException;
import org.closure.gcp.models.QuestionModel;
import org.closure.gcp.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/question")
public class QuestionController {
    

    @Autowired
    QuestionService questionService ;
    
    @RequestMapping(value = "/addquestion", method = RequestMethod.POST)
    public Object requestMethodCreat(@RequestBody QuestionModel question)
    {
        return questionService.createquestion(question);
    }

    @RequestMapping(value = "/readquestion", method = RequestMethod.POST)
    public Object requestMethodRead (@RequestBody QuestionModel question)
    {
        try {
            return questionService.readquestion(question);
        } catch (QuestionException e) {
            return e.getMessage();
        }
    }

    @RequestMapping(value = "/updatequestion", method = RequestMethod.POST)
    public Object requestMethodUpdate (@RequestBody QuestionModel question)
    {
        try {
            return questionService.updatequestion(question);
        } catch (QuestionException e) {
            return e.getMessage();
        }
    }

    @RequestMapping(value =  "/deletquestion", method = RequestMethod.POST)
    public void requestMethodDelete(@RequestBody QuestionModel question)
    {
        try {
            questionService.deletequestion(question);
           } catch (QuestionException e) {
               e.getMessage();
           }
    }

}

