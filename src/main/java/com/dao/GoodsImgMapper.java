package com.dao;

import com.bean.GoodsImg;
import java.util.List;

public interface GoodsImgMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_img
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer imgId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_img
     *
     * @mbg.generated
     */
    int insert(GoodsImg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_img
     *
     * @mbg.generated
     */
    GoodsImg selectByPrimaryKey(Integer imgId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_img
     *
     * @mbg.generated
     */
    List<GoodsImg> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_img
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(GoodsImg record);
}