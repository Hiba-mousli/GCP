package org.closure.gcp.models;

import java.util.List;
import java.util.Objects;

public class QuestionModel {

    private Integer id;
    private String question;
    private String question_type;
    private InterestModel interest;
    private LevelModel level;
    private String sup_file;
    private int points;
    private List<ContestModel> contest;
    private List<AnswerModel> answers;


    public QuestionModel() {
    }

    public QuestionModel(Integer id, String question, String question_type, InterestModel interest, LevelModel level, String sup_file, int points, List<ContestModel> contest, List<AnswerModel> answers) {
        this.id = id;
        this.question = question;
        this.question_type = question_type;
        this.interest = interest;
        this.level = level;
        this.sup_file = sup_file;
        this.points = points;
        this.contest = contest;
        this.answers = answers;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestion() {
        return this.question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestion_type() {
        return this.question_type;
    }

    public void setQuestion_type(String question_type) {
        this.question_type = question_type;
    }

    public InterestModel getInterest() {
        return this.interest;
    }

    public void setInterest(InterestModel interest) {
        this.interest = interest;
    }

    public LevelModel getLevel() {
        return this.level;
    }

    public void setLevel(LevelModel level) {
        this.level = level;
    }

    public String getSup_file() {
        return this.sup_file;
    }

    public void setSup_file(String sup_file) {
        this.sup_file = sup_file;
    }

    public int getPoints() {
        return this.points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public List<ContestModel> getContest() {
        return this.contest;
    }

    public void setContest(List<ContestModel> contest) {
        this.contest = contest;
    }

    public List<AnswerModel> getAnswers() {
        return this.answers;
    }

    public void setAnswers(List<AnswerModel> answers) {
        this.answers = answers;
    }

    public QuestionModel id(Integer id) {
        setId(id);
        return this;
    }

    public QuestionModel question(String question) {
        setQuestion(question);
        return this;
    }

    public QuestionModel question_type(String question_type) {
        setQuestion_type(question_type);
        return this;
    }

    public QuestionModel interest(InterestModel interest) {
        setInterest(interest);
        return this;
    }

    public QuestionModel level(LevelModel level) {
        setLevel(level);
        return this;
    }

    public QuestionModel sup_file(String sup_file) {
        setSup_file(sup_file);
        return this;
    }

    public QuestionModel points(int points) {
        setPoints(points);
        return this;
    }

    public QuestionModel contest(List<ContestModel> contest) {
        setContest(contest);
        return this;
    }

    public QuestionModel answers(List<AnswerModel> answers) {
        setAnswers(answers);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof QuestionModel)) {
            return false;
        }
        QuestionModel questionModel = (QuestionModel) o;
        return Objects.equals(id, questionModel.id) && Objects.equals(question, questionModel.question) && Objects.equals(question_type, questionModel.question_type) && Objects.equals(interest, questionModel.interest) && Objects.equals(level, questionModel.level) && Objects.equals(sup_file, questionModel.sup_file) && points == questionModel.points && Objects.equals(contest, questionModel.contest) && Objects.equals(answers, questionModel.answers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, question, question_type, interest, level, sup_file, points, contest, answers);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", question='" + getQuestion() + "'" +
            ", question_type='" + getQuestion_type() + "'" +
            ", interest='" + getInterest() + "'" +
            ", level='" + getLevel() + "'" +
            ", sup_file='" + getSup_file() + "'" +
            ", points='" + getPoints() + "'" +
            ", contest='" + getContest() + "'" +
            ", answers='" + getAnswers() + "'" +
            "}";
    }

}