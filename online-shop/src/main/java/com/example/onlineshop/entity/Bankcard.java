package com.example.onlineshop.entity;

public class Bankcard {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bankCard.id
     *
     * @mbggenerated Sat May 02 15:06:53 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bankCard.buyerId
     *
     * @mbggenerated Sat May 02 15:06:53 CST 2020
     */
    private Integer buyerid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bankCard.bankName
     *
     * @mbggenerated Sat May 02 15:06:53 CST 2020
     */
    private String bankname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bankCard.bankId
     *
     * @mbggenerated Sat May 02 15:06:53 CST 2020
     */
    private Integer bankid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bankCard.id
     *
     * @return the value of bankCard.id
     *
     * @mbggenerated Sat May 02 15:06:53 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bankCard.id
     *
     * @param id the value for bankCard.id
     *
     * @mbggenerated Sat May 02 15:06:53 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bankCard.buyerId
     *
     * @return the value of bankCard.buyerId
     *
     * @mbggenerated Sat May 02 15:06:53 CST 2020
     */
    public Integer getBuyerid() {
        return buyerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bankCard.buyerId
     *
     * @param buyerid the value for bankCard.buyerId
     *
     * @mbggenerated Sat May 02 15:06:53 CST 2020
     */
    public void setBuyerid(Integer buyerid) {
        this.buyerid = buyerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bankCard.bankName
     *
     * @return the value of bankCard.bankName
     *
     * @mbggenerated Sat May 02 15:06:53 CST 2020
     */
    public String getBankname() {
        return bankname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bankCard.bankName
     *
     * @param bankname the value for bankCard.bankName
     *
     * @mbggenerated Sat May 02 15:06:53 CST 2020
     */
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bankCard.bankId
     *
     * @return the value of bankCard.bankId
     *
     * @mbggenerated Sat May 02 15:06:53 CST 2020
     */
    public Integer getBankid() {
        return bankid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bankCard.bankId
     *
     * @param bankid the value for bankCard.bankId
     *
     * @mbggenerated Sat May 02 15:06:53 CST 2020
     */
    public void setBankid(Integer bankid) {
        this.bankid = bankid;
    }
}