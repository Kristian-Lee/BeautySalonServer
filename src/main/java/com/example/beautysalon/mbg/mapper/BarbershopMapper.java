package com.example.beautysalon.mbg.mapper;

import com.example.beautysalon.mbg.model.Barbershop;
import com.example.beautysalon.mbg.model.BarbershopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BarbershopMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table barbershop
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    long countByExample(BarbershopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table barbershop
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    int deleteByExample(BarbershopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table barbershop
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    int deleteByPrimaryKey(Integer barbershopId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table barbershop
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    int insert(Barbershop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table barbershop
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    int insertSelective(Barbershop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table barbershop
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    List<Barbershop> selectByExample(BarbershopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table barbershop
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    Barbershop selectByPrimaryKey(Integer barbershopId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table barbershop
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    int updateByExampleSelective(@Param("record") Barbershop record, @Param("example") BarbershopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table barbershop
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    int updateByExample(@Param("record") Barbershop record, @Param("example") BarbershopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table barbershop
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    int updateByPrimaryKeySelective(Barbershop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table barbershop
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    int updateByPrimaryKey(Barbershop record);
}