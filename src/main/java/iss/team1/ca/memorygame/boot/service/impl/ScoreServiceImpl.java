package iss.team1.ca.memorygame.boot.service.impl;

import iss.team1.ca.memorygame.boot.bean.Score;
import iss.team1.ca.memorygame.boot.bean.User;
import iss.team1.ca.memorygame.boot.mapper.ScoreMapper;
import iss.team1.ca.memorygame.boot.service.interfaces.IScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ScoreServiceImpl implements IScoreService {

    @Autowired
    ScoreMapper scoreMapper;

    @Override
    public List<Score> getTop10User() {
        List<Score> top10Users=scoreMapper.getTop10Users();
        return top10Users;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void submitScore(Score score) {
        scoreMapper.submitScore(score);
    }
}
