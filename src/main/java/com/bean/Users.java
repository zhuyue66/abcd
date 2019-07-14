package com.bean;

public class Users {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.user_name
     *
     * @mbg.generated
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.user_pass
     *
     * @mbg.generated
     */
    private String userPass;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.user_address
     *
     * @mbg.generated
     */
    private String userAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.user_phone
     *
     * @mbg.generated
     */
    private String userPhone;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.user_id
     *
     * @return the value of users.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.user_id
     *
     * @param userId the value for users.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.user_name
     *
     * @return the value of users.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.user_name
     *
     * @param userName the value for users.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.user_pass
     *
     * @return the value of users.user_pass
     *
     * @mbg.generated
     */
    public String getUserPass() {
        return userPass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.user_pass
     *
     * @param userPass the value for users.user_pass
     *
     * @mbg.generated
     */
    public void setUserPass(String userPass) {
        this.userPass = userPass == null ? null : userPass.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.user_address
     *
     * @return the value of users.user_address
     *
     * @mbg.generated
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.user_address
     *
     * @param userAddress the value for users.user_address
     *
     * @mbg.generated
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.user_phone
     *
     * @return the value of users.user_phone
     *
     * @mbg.generated
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.user_phone
     *
     * @param userPhone the value for users.user_phone
     *
     * @mbg.generated
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }


    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPass='" + userPass + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userPhone='" + userPhone + '\'' +
                '}';
    }
}