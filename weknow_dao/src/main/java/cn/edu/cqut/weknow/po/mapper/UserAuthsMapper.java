package cn.edu.cqut.weknow.po.mapper;

import cn.edu.cqut.weknow.po.UserAuths;
import cn.edu.cqut.weknow.po.UserAuthsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAuthsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_auths
     *
     * @mbggenerated Wed Aug 30 08:56:41 CST 2017
     */
    int countByExample(UserAuthsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_auths
     *
     * @mbggenerated Wed Aug 30 08:56:41 CST 2017
     */
    int deleteByExample(UserAuthsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_auths
     *
     * @mbggenerated Wed Aug 30 08:56:41 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_auths
     *
     * @mbggenerated Wed Aug 30 08:56:41 CST 2017
     */
    int insert(UserAuths record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_auths
     *
     * @mbggenerated Wed Aug 30 08:56:41 CST 2017
     */
    int insertSelective(UserAuths record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_auths
     *
     * @mbggenerated Wed Aug 30 08:56:41 CST 2017
     */
    List<UserAuths> selectByExample(UserAuthsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_auths
     *
     * @mbggenerated Wed Aug 30 08:56:41 CST 2017
     */
    UserAuths selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_auths
     *
     * @mbggenerated Wed Aug 30 08:56:41 CST 2017
     */
    int updateByExampleSelective(@Param("record") UserAuths record, @Param("example") UserAuthsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_auths
     *
     * @mbggenerated Wed Aug 30 08:56:41 CST 2017
     */
    int updateByExample(@Param("record") UserAuths record, @Param("example") UserAuthsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_auths
     *
     * @mbggenerated Wed Aug 30 08:56:41 CST 2017
     */
    int updateByPrimaryKeySelective(UserAuths record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_auths
     *
     * @mbggenerated Wed Aug 30 08:56:41 CST 2017
     */
    int updateByPrimaryKey(UserAuths record);
}