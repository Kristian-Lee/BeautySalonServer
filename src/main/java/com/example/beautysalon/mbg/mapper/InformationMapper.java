package com.example.beautysalon.mbg.mapper;

import com.example.beautysalon.mbg.model.Information;
import com.example.beautysalon.mbg.model.InformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InformationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table information
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    long countByExample(InformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table information
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    int deleteByExample(InformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table information
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table information
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    int insert(Information record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table information
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    int insertSelective(Information record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table information
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    List<Information> selectByExampleWithBLOBs(InformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table information
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    List<Information> selectByExample(InformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table information
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    Information selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table information
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    int updateByExampleSelective(@Param("record") Information record, @Param("example") InformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table information
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    int updateByExampleWithBLOBs(@Param("record") Information record, @Param("example") InformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table information
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    int updateByExample(@Param("record") Information record, @Param("example") InformationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table information
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    int updateByPrimaryKeySelective(Information record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table information
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    int updateByPrimaryKeyWithBLOBs(Information record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table information
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    int updateByPrimaryKey(Information record);
}