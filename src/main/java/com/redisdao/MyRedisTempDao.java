package com.redisdao;

/**
 * The interface My redis temp dao.
 *
 * @Author: zhuda
 * @Description:
 * @Date: Create in 8:59 2019/7/6
 */
public interface MyRedisTempDao {


    /**
     * Sets value.
     *
     * @param key   the key
     * @param value the value
     * @param s     the s
     */
    void setValue(String key, String value, long s);

    /**
     * 根据键获取值
     *
     * @param key the key
     * @return the value
     */
    String getValue(String key);


}
