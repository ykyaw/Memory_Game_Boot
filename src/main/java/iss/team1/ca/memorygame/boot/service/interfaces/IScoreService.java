package iss.team1.ca.memorygame.boot.service.interfaces;

import iss.team1.ca.memorygame.boot.bean.Score;
import iss.team1.ca.memorygame.boot.bean.User;

import java.util.List;

public interface IScoreService {

    List<Score> getTop10User();

    void submitScore(Score score);
}
