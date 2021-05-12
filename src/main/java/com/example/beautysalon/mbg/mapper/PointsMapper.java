package com.example.beautysalon.mbg.mapper;

import com.example.beautysalon.mbg.model.Points;
import com.example.beautysalon.mbg.model.PointsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PointsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table points
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    long countByExample(PointsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table points
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    int deleteByExample(PointsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table points
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table points
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    int insert(Points record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table points
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    int insertSelective(Points record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table points
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    List<Points> selectByExample(PointsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table points
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    Points selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table points
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    int updateByExampleSelective(@Param("record") Points record, @Param("example") PointsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table points
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    int updateByExample(@Param("record") Points record, @Param("example") PointsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table points
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    int updateByPrimaryKeySelective(Points record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table points
     *
     * @mbg.generated Wed May 12 19:03:49 CST 2021
     */
    int updateByPrimaryKey(Points record);
}