package org.closure.gcp.models;

import java.util.Objects;

public class AnswerModel {
   private Integer id;
   private String status;
   private String answer;
   private QuestionModel question;



    public AnswerModel() {
    }

    public AnswerModel(Integer id, String status, String answer, QuestionModel question) {
        this.id = id;
        this.status = status;
        this.answer = answer;
        this.question = question;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAnswer() {
        return this.answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public QuestionModel getQuestion() {
        return this.question;
    }

    public void setQuestion(QuestionModel question) {
        this.question = question;
    }

    public AnswerModel id(Integer id) {
        setId(id);
        return this;
    }

    public AnswerModel status(String status) {
        setStatus(status);
        return this;
    }

    public AnswerModel answer(String answer) {
        setAnswer(answer);
        return this;
    }

    public AnswerModel question(QuestionModel question) {
        setQuestion(question);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AnswerModel)) {
            return false;
        }
        AnswerModel answerModel = (AnswerModel) o;
        return Objects.equals(id, answerModel.id) && Objects.equals(status, answerModel.status) && Objects.equals(answer, answerModel.answer) && Objects.equals(question, answerModel.question);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, answer, question);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", status='" + getStatus() + "'" +
            ", answer='" + getAnswer() + "'" +
            ", question='" + getQuestion() + "'" +
            "}";
    }
 
}
