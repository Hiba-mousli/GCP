package org.closure.gcp.controllers;


import org.closure.gcp.exceptions.AnswerException;
import org.closure.gcp.models.AnswerModel;
import org.closure.gcp.services.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@RestController
@RequestMapping(path = "/api/v1/answers")
public class AnswerController {
    
    @Autowired
    AnswerService answerService;

    @RequestMapping(value="/addanswer", method=RequestMethod.POST)
    public Object requestMethodCreat(@RequestBody AnswerModel answer) {
        return answerService.createAnswer(answer);
    }
    @RequestMapping(value="/addanswerwithquestion/{Question}", method=RequestMethod.POST)
    public Object requestMethodCreat(@RequestBody AnswerModel answer,@PathVariable(name = "Question") String Question)  {
        try {
            return answerService.createAnswerWithQuestion(answer,Question);
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    @RequestMapping(value="/readanswer", method=RequestMethod.POST)
    public Object requestMethodRead(@RequestBody AnswerModel answer) {
        try {
            return answerService.ReadAnswer(answer);
        } catch (AnswerException e) {
           return e.getMessage();
        }
    }
    

    @RequestMapping(value="/updateanswer", method=RequestMethod.POST)
    public Object requestMethodUpdate(@RequestBody AnswerModel answer) {
        try {
            return answerService.updateAnswer(answer);
        } catch (AnswerException e) {
           return e.getMessage();
        }
    }
    @RequestMapping(value="/deleteanswer", method=RequestMethod.POST)
    public Object requestMethodDelete(@RequestBody AnswerModel answer) {
        try {
            return answerService.DeleteAnswer(answer);
        } catch (AnswerException e) {
            return e.getMessage();
        }
    }

}
