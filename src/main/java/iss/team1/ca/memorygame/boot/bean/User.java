package iss.team1.ca.memorygame.boot.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;


@JsonIgnoreProperties(value = { "handler" })
public class User implements Serializable {

    private int uid;
    private String username;
    private List<Score> scores;

    public User() {
    }

    public User(int uid) {
        this.uid = uid;
    }

    public User(int uid, String username, List<Score> scores) {
        this.uid = uid;
        this.username = username;
        this.scores = scores;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }
}
