package iss.team1.ca.memorygame.boot.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(value = { "handler" })
public class Score implements Serializable {

    private int uid;
    private User owner;
    private Long time;
    private int score;

    public Score() {
    }

    public Score(int uid) {
        this.uid = uid;
    }

    public Score(User owner,  int score) {
        this.owner = owner;
        this.score = score;
    }

    public Score(int uid, User owner, Long time, int score) {
        this.uid = uid;
        this.owner = owner;
        this.time = time;
        this.score = score;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
