package iss.team1.ca.memorygame.boot.mapper;

import iss.team1.ca.memorygame.boot.bean.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

public interface UserMapper {

    @Select("select * from user where uid=#{uid}")
    @Results(id = "user",
            value = {
                    @Result(id = true,column = "uid",property = "uid"),
                    @Result(column = "uid",property = "scores",
                            many = @Many(select="iss.team1.ca.memorygame.boot.mapper.ScoreMapper.getScoreByOwnerId",
                                    fetchType = FetchType.LAZY)),
            })
    User getUser(int uid);

    @Insert("insert into user(username) values(#{username})")
    @Options(useGeneratedKeys=true, keyProperty="uid")
    void createAccount(User user);
}
