package com.bean;

public class Admins {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admins.admin_id
     *
     * @mbg.generated
     */
    private Integer adminId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admins.admin_name
     *
     * @mbg.generated
     */
    private String adminName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admins.admin_pass
     *
     * @mbg.generated
     */
    private String adminPass;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admins.admin_role
     *
     * @mbg.generated
     */
    private Integer adminRole;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admins.admin_id
     *
     * @return the value of admins.admin_id
     *
     * @mbg.generated
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admins.admin_id
     *
     * @param adminId the value for admins.admin_id
     *
     * @mbg.generated
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admins.admin_name
     *
     * @return the value of admins.admin_name
     *
     * @mbg.generated
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admins.admin_name
     *
     * @param adminName the value for admins.admin_name
     *
     * @mbg.generated
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admins.admin_pass
     *
     * @return the value of admins.admin_pass
     *
     * @mbg.generated
     */
    public String getAdminPass() {
        return adminPass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admins.admin_pass
     *
     * @param adminPass the value for admins.admin_pass
     *
     * @mbg.generated
     */
    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass == null ? null : adminPass.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admins.admin_role
     *
     * @return the value of admins.admin_role
     *
     * @mbg.generated
     */
    public Integer getAdminRole() {
        return adminRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admins.admin_role
     *
     * @param adminRole the value for admins.admin_role
     *
     * @mbg.generated
     */
    public void setAdminRole(Integer adminRole) {
        this.adminRole = adminRole;
    }
}