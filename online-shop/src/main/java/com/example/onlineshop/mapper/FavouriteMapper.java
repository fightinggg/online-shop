package com.example.onlineshop.mapper;

import com.example.onlineshop.entity.Favourite;
import com.example.onlineshop.entity.FavouriteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FavouriteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favourite
     *
     * @mbggenerated Sat May 02 15:06:53 CST 2020
     */
    int countByExample(FavouriteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favourite
     *
     * @mbggenerated Sat May 02 15:06:53 CST 2020
     */
    int deleteByExample(FavouriteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favourite
     *
     * @mbggenerated Sat May 02 15:06:53 CST 2020
     */
    int insert(Favourite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favourite
     *
     * @mbggenerated Sat May 02 15:06:53 CST 2020
     */
    int insertSelective(Favourite record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favourite
     *
     * @mbggenerated Sat May 02 15:06:53 CST 2020
     */
    List<Favourite> selectByExample(FavouriteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favourite
     *
     * @mbggenerated Sat May 02 15:06:53 CST 2020
     */
    int updateByExampleSelective(@Param("record") Favourite record, @Param("example") FavouriteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table favourite
     *
     * @mbggenerated Sat May 02 15:06:53 CST 2020
     */
    int updateByExample(@Param("record") Favourite record, @Param("example") FavouriteExample example);
}