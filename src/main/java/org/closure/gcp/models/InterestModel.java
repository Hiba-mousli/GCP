package org.closure.gcp.models;

import java.util.List;
import java.util.Objects;

import org.closure.gcp.entities.QuestionEntity;
import org.closure.gcp.entities.UserEntity;

public class InterestModel {

    private Integer id;
    private UserEntity user;
    private String interest;
    private String logo;
    private List<QuestionEntity> questions;


    public InterestModel() {
    }

    public InterestModel(Integer id, UserEntity user, String interest, String logo, List<QuestionEntity> questions) {
        this.id = id;
        this.user = user;
        this.interest = interest;
        this.logo = logo;
        this.questions = questions;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserEntity getUser() {
        return this.user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public String getInterest() {
        return this.interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public List<QuestionEntity> getQuestions() {
        return this.questions;
    }

    public void setQuestions(List<QuestionEntity> questions) {
        this.questions = questions;
    }

    public InterestModel id(Integer id) {
        setId(id);
        return this;
    }

    public InterestModel user(UserEntity user) {
        setUser(user);
        return this;
    }

    public InterestModel interest(String interest) {
        setInterest(interest);
        return this;
    }

    public InterestModel logo(String logo) {
        setLogo(logo);
        return this;
    }

    public InterestModel questions(List<QuestionEntity> questions) {
        setQuestions(questions);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof InterestModel)) {
            return false;
        }
        InterestModel interestModel = (InterestModel) o;
        return Objects.equals(id, interestModel.id) && Objects.equals(user, interestModel.user) && Objects.equals(interest, interestModel.interest) && Objects.equals(logo, interestModel.logo) && Objects.equals(questions, interestModel.questions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, interest, logo, questions);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", user='" + getUser() + "'" +
            ", interest='" + getInterest() + "'" +
            ", logo='" + getLogo() + "'" +
            ", questions='" + getQuestions() + "'" +
            "}";
    }

    
}
