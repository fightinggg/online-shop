package com.shop.integral.mapper;

import com.shop.integral.entity.BuyerIntegral;
import com.shop.integral.entity.BuyerIntegralExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuyerIntegralMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table buyerIntegral
     *
     * @mbggenerated Fri May 08 17:02:09 CST 2020
     */
    int countByExample(BuyerIntegralExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table buyerIntegral
     *
     * @mbggenerated Fri May 08 17:02:09 CST 2020
     */
    int deleteByExample(BuyerIntegralExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table buyerIntegral
     *
     * @mbggenerated Fri May 08 17:02:09 CST 2020
     */
    int deleteByPrimaryKey(Integer buyerid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table buyerIntegral
     *
     * @mbggenerated Fri May 08 17:02:09 CST 2020
     */
    int insert(BuyerIntegral record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table buyerIntegral
     *
     * @mbggenerated Fri May 08 17:02:09 CST 2020
     */
    int insertSelective(BuyerIntegral record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table buyerIntegral
     *
     * @mbggenerated Fri May 08 17:02:09 CST 2020
     */
    List<BuyerIntegral> selectByExample(BuyerIntegralExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table buyerIntegral
     *
     * @mbggenerated Fri May 08 17:02:09 CST 2020
     */
    BuyerIntegral selectByPrimaryKey(Integer buyerid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table buyerIntegral
     *
     * @mbggenerated Fri May 08 17:02:09 CST 2020
     */
    int updateByExampleSelective(@Param("record") BuyerIntegral record, @Param("example") BuyerIntegralExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table buyerIntegral
     *
     * @mbggenerated Fri May 08 17:02:09 CST 2020
     */
    int updateByExample(@Param("record") BuyerIntegral record, @Param("example") BuyerIntegralExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table buyerIntegral
     *
     * @mbggenerated Fri May 08 17:02:09 CST 2020
     */
    int updateByPrimaryKeySelective(BuyerIntegral record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table buyerIntegral
     *
     * @mbggenerated Fri May 08 17:02:09 CST 2020
     */
    int updateByPrimaryKey(BuyerIntegral record);
}