package com.shop.integral.mapper;

import com.shop.integral.entity.IntegralTransaction;
import com.shop.integral.entity.IntegralTransactionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntegralTransactionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table integralTransaction
     *
     * @mbggenerated Fri May 08 17:02:09 CST 2020
     */
    int countByExample(IntegralTransactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table integralTransaction
     *
     * @mbggenerated Fri May 08 17:02:09 CST 2020
     */
    int deleteByExample(IntegralTransactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table integralTransaction
     *
     * @mbggenerated Fri May 08 17:02:09 CST 2020
     */
    int deleteByPrimaryKey(Integer ordersid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table integralTransaction
     *
     * @mbggenerated Fri May 08 17:02:09 CST 2020
     */
    int insert(IntegralTransaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table integralTransaction
     *
     * @mbggenerated Fri May 08 17:02:09 CST 2020
     */
    int insertSelective(IntegralTransaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table integralTransaction
     *
     * @mbggenerated Fri May 08 17:02:09 CST 2020
     */
    List<IntegralTransaction> selectByExample(IntegralTransactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table integralTransaction
     *
     * @mbggenerated Fri May 08 17:02:09 CST 2020
     */
    int updateByExampleSelective(@Param("record") IntegralTransaction record, @Param("example") IntegralTransactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table integralTransaction
     *
     * @mbggenerated Fri May 08 17:02:09 CST 2020
     */
    int updateByExample(@Param("record") IntegralTransaction record, @Param("example") IntegralTransactionExample example);
}