package org.closure.gcp.models;

import java.util.List;
import java.util.Objects;

import javax.xml.crypto.Data;

import org.closure.gcp.entities.LevelEntity;
import org.closure.gcp.entities.RankEntity;
import org.closure.gcp.entities.UserEntity;

public class ContestModel {

    private Integer id;
    private String name;
    private Data start_date;
    private List<UserEntity> participents;
    private List<LevelEntity> levels;
    private List<QuestionModel> questions;
    private List<RankEntity> rank;
    

    public ContestModel() {
    }

    public ContestModel(Integer id, String name, Data start_date, List<UserEntity> participents, List<LevelEntity> levels, List<QuestionModel> questions, List<RankEntity> rank) {
        this.id = id;
        this.name = name;
        this.start_date = start_date;
        this.participents = participents;
        this.levels = levels;
        this.questions = questions;
        this.rank = rank;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Data getStart_date() {
        return this.start_date;
    }

    public void setStart_date(Data start_date) {
        this.start_date = start_date;
    }

    public List<UserEntity> getParticipents() {
        return this.participents;
    }

    public void setParticipents(List<UserEntity> participents) {
        this.participents = participents;
    }

    public List<LevelEntity> getLevels() {
        return this.levels;
    }

    public void setLevels(List<LevelEntity> levels) {
        this.levels = levels;
    }

    public List<QuestionModel> getQuestions() {
        return this.questions;
    }

    public void setQuestions(List<QuestionModel> questions) {
        this.questions = questions;
    }

    public List<RankEntity> getRank() {
        return this.rank;
    }

    public void setRank(List<RankEntity> rank) {
        this.rank = rank;
    }

    public ContestModel id(Integer id) {
        setId(id);
        return this;
    }

    public ContestModel name(String name) {
        setName(name);
        return this;
    }

    public ContestModel start_date(Data start_date) {
        setStart_date(start_date);
        return this;
    }

    public ContestModel participents(List<UserEntity> participents) {
        setParticipents(participents);
        return this;
    }

    public ContestModel levels(List<LevelEntity> levels) {
        setLevels(levels);
        return this;
    }

    public ContestModel questions(List<QuestionModel> questions) {
        setQuestions(questions);
        return this;
    }

    public ContestModel rank(List<RankEntity> rank) {
        setRank(rank);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ContestModel)) {
            return false;
        }
        ContestModel contestModel = (ContestModel) o;
        return Objects.equals(id, contestModel.id) && Objects.equals(name, contestModel.name) && Objects.equals(start_date, contestModel.start_date) && Objects.equals(participents, contestModel.participents) && Objects.equals(levels, contestModel.levels) && Objects.equals(questions, contestModel.questions) && Objects.equals(rank, contestModel.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, start_date, participents, levels, questions, rank);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", start_date='" + getStart_date() + "'" +
            ", participents='" + getParticipents() + "'" +
            ", levels='" + getLevels() + "'" +
            ", questions='" + getQuestions() + "'" +
            ", rank='" + getRank() + "'" +
            "}";
    }

}
