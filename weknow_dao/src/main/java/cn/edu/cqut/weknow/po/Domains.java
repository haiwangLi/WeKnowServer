package cn.edu.cqut.weknow.po;

public class Domains {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column domains.id
     *
     * @mbggenerated Wed Aug 30 08:56:41 CST 2017
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column domains.parentId
     *
     * @mbggenerated Wed Aug 30 08:56:41 CST 2017
     */
    private String parentid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column domains.name
     *
     * @mbggenerated Wed Aug 30 08:56:41 CST 2017
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column domains.id
     *
     * @return the value of domains.id
     *
     * @mbggenerated Wed Aug 30 08:56:41 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column domains.id
     *
     * @param id the value for domains.id
     *
     * @mbggenerated Wed Aug 30 08:56:41 CST 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column domains.parentId
     *
     * @return the value of domains.parentId
     *
     * @mbggenerated Wed Aug 30 08:56:41 CST 2017
     */
    public String getParentid() {
        return parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column domains.parentId
     *
     * @param parentid the value for domains.parentId
     *
     * @mbggenerated Wed Aug 30 08:56:41 CST 2017
     */
    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column domains.name
     *
     * @return the value of domains.name
     *
     * @mbggenerated Wed Aug 30 08:56:41 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column domains.name
     *
     * @param name the value for domains.name
     *
     * @mbggenerated Wed Aug 30 08:56:41 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}