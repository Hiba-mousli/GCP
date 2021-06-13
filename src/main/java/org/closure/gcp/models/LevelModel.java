package org.closure.gcp.models;

import java.util.List;
import java.util.Objects;
import org.closure.gcp.entities.UserEntity;

public class LevelModel {

    private Integer id;
    private List<UserEntity> user;
    private List<QuestionModel> questions;
    private String level;
    private ContestModel contest;


    public LevelModel() {
    }

    public LevelModel(Integer id, List<UserEntity> user, List<QuestionModel> questions, String level, ContestModel contest) {
        this.id = id;
        this.user = user;
        this.questions = questions;
        this.level = level;
        this.contest = contest;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<UserEntity> getUser() {
        return this.user;
    }

    public void setUser(List<UserEntity> user) {
        this.user = user;
    }

    public List<QuestionModel> getQuestions() {
        return this.questions;
    }

    public void setQuestions(List<QuestionModel> questions) {
        this.questions = questions;
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public ContestModel getContest() {
        return this.contest;
    }

    public void setContest(ContestModel contest) {
        this.contest = contest;
    }

    public LevelModel id(Integer id) {
        setId(id);
        return this;
    }

    public LevelModel user(List<UserEntity> user) {
        setUser(user);
        return this;
    }

    public LevelModel questions(List<QuestionModel> questions) {
        setQuestions(questions);
        return this;
    }

    public LevelModel level(String level) {
        setLevel(level);
        return this;
    }

    public LevelModel contest(ContestModel contest) {
        setContest(contest);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof LevelModel)) {
            return false;
        }
        LevelModel levelModel = (LevelModel) o;
        return Objects.equals(id, levelModel.id) && Objects.equals(user, levelModel.user) && Objects.equals(questions, levelModel.questions) && Objects.equals(level, levelModel.level) && Objects.equals(contest, levelModel.contest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, questions, level, contest);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", user='" + getUser() + "'" +
            ", questions='" + getQuestions() + "'" +
            ", level='" + getLevel() + "'" +
            ", contest='" + getContest() + "'" +
            "}";
    }

    
}
