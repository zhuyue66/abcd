package com.bean;

public class GoodsType {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_type.type_id
     *
     * @mbg.generated
     */
    private Integer typeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_type.type_name
     *
     * @mbg.generated
     */
    private String typeName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_type.type_pid
     *
     * @mbg.generated
     */
    private Integer typePid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_type.type_lv
     *
     * @mbg.generated
     */
    private Integer typeLv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods_type.type_path
     *
     * @mbg.generated
     */
    private String typePath;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_type.type_id
     *
     * @return the value of goods_type.type_id
     *
     * @mbg.generated
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_type.type_id
     *
     * @param typeId the value for goods_type.type_id
     *
     * @mbg.generated
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_type.type_name
     *
     * @return the value of goods_type.type_name
     *
     * @mbg.generated
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_type.type_name
     *
     * @param typeName the value for goods_type.type_name
     *
     * @mbg.generated
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_type.type_pid
     *
     * @return the value of goods_type.type_pid
     *
     * @mbg.generated
     */
    public Integer getTypePid() {
        return typePid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_type.type_pid
     *
     * @param typePid the value for goods_type.type_pid
     *
     * @mbg.generated
     */
    public void setTypePid(Integer typePid) {
        this.typePid = typePid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_type.type_lv
     *
     * @return the value of goods_type.type_lv
     *
     * @mbg.generated
     */
    public Integer getTypeLv() {
        return typeLv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_type.type_lv
     *
     * @param typeLv the value for goods_type.type_lv
     *
     * @mbg.generated
     */
    public void setTypeLv(Integer typeLv) {
        this.typeLv = typeLv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods_type.type_path
     *
     * @return the value of goods_type.type_path
     *
     * @mbg.generated
     */
    public String getTypePath() {
        return typePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods_type.type_path
     *
     * @param typePath the value for goods_type.type_path
     *
     * @mbg.generated
     */
    public void setTypePath(String typePath) {
        this.typePath = typePath == null ? null : typePath.trim();
    }
}