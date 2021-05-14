package com.example.beautysalon.mbg.mapper;

import com.example.beautysalon.mbg.model.Services;
import com.example.beautysalon.mbg.model.ServicesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServicesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table services
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    long countByExample(ServicesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table services
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    int deleteByExample(ServicesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table services
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table services
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    int insert(Services record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table services
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    int insertSelective(Services record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table services
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    List<Services> selectByExample(ServicesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table services
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    Services selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table services
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    int updateByExampleSelective(@Param("record") Services record, @Param("example") ServicesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table services
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    int updateByExample(@Param("record") Services record, @Param("example") ServicesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table services
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    int updateByPrimaryKeySelective(Services record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table services
     *
     * @mbg.generated Thu May 13 00:55:17 CST 2021
     */
    int updateByPrimaryKey(Services record);
}