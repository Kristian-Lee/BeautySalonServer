package com.example.beautysalon.mbg.mapper;

import com.example.beautysalon.mbg.model.Reserve;
import com.example.beautysalon.mbg.model.ReserveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReserveMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reserve
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    long countByExample(ReserveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reserve
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    int deleteByExample(ReserveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reserve
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reserve
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    int insert(Reserve record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reserve
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    int insertSelective(Reserve record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reserve
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    List<Reserve> selectByExample(ReserveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reserve
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    Reserve selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reserve
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    int updateByExampleSelective(@Param("record") Reserve record, @Param("example") ReserveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reserve
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    int updateByExample(@Param("record") Reserve record, @Param("example") ReserveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reserve
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    int updateByPrimaryKeySelective(Reserve record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reserve
     *
     * @mbg.generated Wed May 12 15:43:13 CST 2021
     */
    int updateByPrimaryKey(Reserve record);
}