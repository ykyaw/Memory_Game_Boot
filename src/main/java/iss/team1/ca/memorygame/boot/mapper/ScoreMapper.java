package iss.team1.ca.memorygame.boot.mapper;

import iss.team1.ca.memorygame.boot.bean.Score;
import iss.team1.ca.memorygame.boot.bean.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface ScoreMapper {

    @Select("select ownerId,MIN(score) as score from score c GROUP BY c.ownerId ORDER BY score")
    @Results(id = "score",
            value = {
                    @Result(id = true,column = "uid",property = "uid"),
                    @Result(column = "ownerId",property = "owner",
                            one = @One(select="iss.team1.ca.memorygame.boot.mapper.UserMapper.getUser",
                                    fetchType = FetchType.LAZY)),
            })
    List<Score> getTop10Users();

    @Select("select * from score where ownerId=#{ownerId}")
    @ResultMap("score")
    List<Score> getScoreByOwnerId(int ownerId);

    @Insert("insert into score(ownerId,time,score) values(#{owner.uid},#{time},#{score})")
    @Options(useGeneratedKeys=true, keyProperty="uid")
    void submitScore(Score score);
}
