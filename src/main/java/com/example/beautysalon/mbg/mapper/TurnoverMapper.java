package com.example.beautysalon.mbg.mapper;

import com.example.beautysalon.mbg.model.Turnover;
import com.example.beautysalon.mbg.model.TurnoverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TurnoverMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table turnover
     *
     * @mbg.generated Mon May 03 23:06:28 CST 2021
     */
    long countByExample(TurnoverExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table turnover
     *
     * @mbg.generated Mon May 03 23:06:28 CST 2021
     */
    int deleteByExample(TurnoverExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table turnover
     *
     * @mbg.generated Mon May 03 23:06:28 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table turnover
     *
     * @mbg.generated Mon May 03 23:06:28 CST 2021
     */
    int insert(Turnover record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table turnover
     *
     * @mbg.generated Mon May 03 23:06:28 CST 2021
     */
    int insertSelective(Turnover record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table turnover
     *
     * @mbg.generated Mon May 03 23:06:28 CST 2021
     */
    List<Turnover> selectByExample(TurnoverExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table turnover
     *
     * @mbg.generated Mon May 03 23:06:28 CST 2021
     */
    Turnover selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table turnover
     *
     * @mbg.generated Mon May 03 23:06:28 CST 2021
     */
    int updateByExampleSelective(@Param("record") Turnover record, @Param("example") TurnoverExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table turnover
     *
     * @mbg.generated Mon May 03 23:06:28 CST 2021
     */
    int updateByExample(@Param("record") Turnover record, @Param("example") TurnoverExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table turnover
     *
     * @mbg.generated Mon May 03 23:06:28 CST 2021
     */
    int updateByPrimaryKeySelective(Turnover record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table turnover
     *
     * @mbg.generated Mon May 03 23:06:28 CST 2021
     */
    int updateByPrimaryKey(Turnover record);
}