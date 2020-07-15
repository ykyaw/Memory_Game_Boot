package iss.team1.ca.memorygame.boot.controller;

import iss.team1.ca.memorygame.boot.bean.Score;
import iss.team1.ca.memorygame.boot.bean.User;
import iss.team1.ca.memorygame.boot.comm.utils.TimeUtil;
import iss.team1.ca.memorygame.boot.service.interfaces.IScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ScoreController {

    @Autowired
    IScoreService scoreService;

    @GetMapping("/scores")
    public List<Score> hello(){
        List<Score> top10User = scoreService.getTop10User();
        for (Score score : top10User) {
            score.getOwner().setScores(null);
        }
        return top10User;
    }

    @PostMapping("/score")
    public Score submitScore(String uid,String score){
        int userId=Integer.parseInt(uid);
        int submitedScore=Integer.parseInt(score);
        long time=TimeUtil.getCurrentTimestamp();

        Score scoreEntity = new Score(0, new User(userId), time, submitedScore);
        scoreService.submitScore(scoreEntity);
        return scoreEntity;
    }
}
