package cn.edu.cqut.weknow.po;

public class Admins {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admins.id
     *
     * @mbggenerated Wed Aug 30 08:56:41 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admins.userName
     *
     * @mbggenerated Wed Aug 30 08:56:41 CST 2017
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admins.userPwd
     *
     * @mbggenerated Wed Aug 30 08:56:41 CST 2017
     */
    private String userpwd;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admins.id
     *
     * @return the value of admins.id
     *
     * @mbggenerated Wed Aug 30 08:56:41 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admins.id
     *
     * @param id the value for admins.id
     *
     * @mbggenerated Wed Aug 30 08:56:41 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admins.userName
     *
     * @return the value of admins.userName
     *
     * @mbggenerated Wed Aug 30 08:56:41 CST 2017
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admins.userName
     *
     * @param username the value for admins.userName
     *
     * @mbggenerated Wed Aug 30 08:56:41 CST 2017
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admins.userPwd
     *
     * @return the value of admins.userPwd
     *
     * @mbggenerated Wed Aug 30 08:56:41 CST 2017
     */
    public String getUserpwd() {
        return userpwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admins.userPwd
     *
     * @param userpwd the value for admins.userPwd
     *
     * @mbggenerated Wed Aug 30 08:56:41 CST 2017
     */
    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd == null ? null : userpwd.trim();
    }
}