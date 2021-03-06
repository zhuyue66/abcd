package com.bean;

public class OrderRecipients {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_recipients.recipients_id
     *
     * @mbg.generated
     */
    private Integer recipientsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_recipients.recipients_name
     *
     * @mbg.generated
     */
    private String recipientsName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_recipients.recipients_address
     *
     * @mbg.generated
     */
    private String recipientsAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_recipients.recipients_phone
     *
     * @mbg.generated
     */
    private String recipientsPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_recipients.recipients_user
     *
     * @mbg.generated
     */
    private Integer recipientsUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_recipients.recipients_checked
     *
     * @mbg.generated
     */
    private Integer recipientsChecked;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_recipients.recipients_id
     *
     * @return the value of order_recipients.recipients_id
     *
     * @mbg.generated
     */
    public Integer getRecipientsId() {
        return recipientsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_recipients.recipients_id
     *
     * @param recipientsId the value for order_recipients.recipients_id
     *
     * @mbg.generated
     */
    public void setRecipientsId(Integer recipientsId) {
        this.recipientsId = recipientsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_recipients.recipients_name
     *
     * @return the value of order_recipients.recipients_name
     *
     * @mbg.generated
     */
    public String getRecipientsName() {
        return recipientsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_recipients.recipients_name
     *
     * @param recipientsName the value for order_recipients.recipients_name
     *
     * @mbg.generated
     */
    public void setRecipientsName(String recipientsName) {
        this.recipientsName = recipientsName == null ? null : recipientsName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_recipients.recipients_address
     *
     * @return the value of order_recipients.recipients_address
     *
     * @mbg.generated
     */
    public String getRecipientsAddress() {
        return recipientsAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_recipients.recipients_address
     *
     * @param recipientsAddress the value for order_recipients.recipients_address
     *
     * @mbg.generated
     */
    public void setRecipientsAddress(String recipientsAddress) {
        this.recipientsAddress = recipientsAddress == null ? null : recipientsAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_recipients.recipients_phone
     *
     * @return the value of order_recipients.recipients_phone
     *
     * @mbg.generated
     */
    public String getRecipientsPhone() {
        return recipientsPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_recipients.recipients_phone
     *
     * @param recipientsPhone the value for order_recipients.recipients_phone
     *
     * @mbg.generated
     */
    public void setRecipientsPhone(String recipientsPhone) {
        this.recipientsPhone = recipientsPhone == null ? null : recipientsPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_recipients.recipients_user
     *
     * @return the value of order_recipients.recipients_user
     *
     * @mbg.generated
     */
    public Integer getRecipientsUser() {
        return recipientsUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_recipients.recipients_user
     *
     * @param recipientsUser the value for order_recipients.recipients_user
     *
     * @mbg.generated
     */
    public void setRecipientsUser(Integer recipientsUser) {
        this.recipientsUser = recipientsUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_recipients.recipients_checked
     *
     * @return the value of order_recipients.recipients_checked
     *
     * @mbg.generated
     */
    public Integer getRecipientsChecked() {
        return recipientsChecked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_recipients.recipients_checked
     *
     * @param recipientsChecked the value for order_recipients.recipients_checked
     *
     * @mbg.generated
     */
    public void setRecipientsChecked(Integer recipientsChecked) {
        this.recipientsChecked = recipientsChecked;
    }

    @Override
    public String toString() {
        return "OrderRecipients{" +
                "recipientsId=" + recipientsId +
                ", recipientsName='" + recipientsName + '\'' +
                ", recipientsAddress='" + recipientsAddress + '\'' +
                ", recipientsPhone='" + recipientsPhone + '\'' +
                ", recipientsUser=" + recipientsUser +
                ", recipientsChecked=" + recipientsChecked +
                '}';
    }
}