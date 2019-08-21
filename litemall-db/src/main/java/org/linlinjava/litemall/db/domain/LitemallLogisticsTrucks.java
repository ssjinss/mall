package org.linlinjava.litemall.db.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class LitemallLogisticsTrucks {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_logistics_trucks.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_logistics_trucks.company_id
     *
     * @mbg.generated
     */
    private Integer companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_logistics_trucks.license_plate_number
     *
     * @mbg.generated
     */
    private String licensePlateNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_logistics_trucks.driver
     *
     * @mbg.generated
     */
    private String driver;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_logistics_trucks.phone
     *
     * @mbg.generated
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_logistics_trucks.load
     *
     * @mbg.generated
     */
    private String load;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_logistics_trucks.create_user
     *
     * @mbg.generated
     */
    private String createUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_logistics_trucks.create_time
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_logistics_trucks.area_code
     *
     * @mbg.generated
     */
    private String areaCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_logistics_trucks.province
     *
     * @mbg.generated
     */
    private String province;


    /*
    新增的逻辑删除
     */
    private  int deleted;
    public  Integer getDeleted(){return  deleted;}
    public void setDeleted(Integer deleted){
        this.deleted=deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_logistics_trucks.id
     *
     * @return the value of litemall_logistics_trucks.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_logistics_trucks.id
     *
     * @param id the value for litemall_logistics_trucks.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_logistics_trucks.company_id
     *
     * @return the value of litemall_logistics_trucks.company_id
     *
     * @mbg.generated
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_logistics_trucks.company_id
     *
     * @param companyId the value for litemall_logistics_trucks.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_logistics_trucks.license_plate_number
     *
     * @return the value of litemall_logistics_trucks.license_plate_number
     *
     * @mbg.generated
     */
    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_logistics_trucks.license_plate_number
     *
     * @param licensePlateNumber the value for litemall_logistics_trucks.license_plate_number
     *
     * @mbg.generated
     */
    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_logistics_trucks.driver
     *
     * @return the value of litemall_logistics_trucks.driver
     *
     * @mbg.generated
     */
    public String getDriver() {
        return driver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_logistics_trucks.driver
     *
     * @param driver the value for litemall_logistics_trucks.driver
     *
     * @mbg.generated
     */
    public void setDriver(String driver) {
        this.driver = driver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_logistics_trucks.phone
     *
     * @return the value of litemall_logistics_trucks.phone
     *
     * @mbg.generated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_logistics_trucks.phone
     *
     * @param phone the value for litemall_logistics_trucks.phone
     *
     * @mbg.generated
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_logistics_trucks.load
     *
     * @return the value of litemall_logistics_trucks.load
     *
     * @mbg.generated
     */
    public String getLoad() {
        return load;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_logistics_trucks.load
     *
     * @param load the value for litemall_logistics_trucks.load
     *
     * @mbg.generated
     */
    public void setLoad(String load) {
        this.load = load;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_logistics_trucks.create_user
     *
     * @return the value of litemall_logistics_trucks.create_user
     *
     * @mbg.generated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_logistics_trucks.create_user
     *
     * @param createUser the value for litemall_logistics_trucks.create_user
     *
     * @mbg.generated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_logistics_trucks.create_time
     *
     * @return the value of litemall_logistics_trucks.create_time
     *
     * @mbg.generated
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_logistics_trucks.create_time
     *
     * @param createTime the value for litemall_logistics_trucks.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_logistics_trucks.area_code
     *
     * @return the value of litemall_logistics_trucks.area_code
     *
     * @mbg.generated
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_logistics_trucks.area_code
     *
     * @param areaCode the value for litemall_logistics_trucks.area_code
     *
     * @mbg.generated
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_logistics_trucks.province
     *
     * @return the value of litemall_logistics_trucks.province
     *
     * @mbg.generated
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_logistics_trucks.province
     *
     * @param province the value for litemall_logistics_trucks.province
     *
     * @mbg.generated
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logistics_trucks
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", companyId=").append(companyId);
        sb.append(", licensePlateNumber=").append(licensePlateNumber);
        sb.append(", driver=").append(driver);
        sb.append(", phone=").append(phone);
        sb.append(", load=").append(load);
        sb.append(", createUser=").append(createUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", areaCode=").append(areaCode);
        sb.append(", province=").append(province);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logistics_trucks
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        LitemallLogisticsTrucks other = (LitemallLogisticsTrucks) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getLicensePlateNumber() == null ? other.getLicensePlateNumber() == null : this.getLicensePlateNumber().equals(other.getLicensePlateNumber()))
            && (this.getDriver() == null ? other.getDriver() == null : this.getDriver().equals(other.getDriver()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getLoad() == null ? other.getLoad() == null : this.getLoad().equals(other.getLoad()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getAreaCode() == null ? other.getAreaCode() == null : this.getAreaCode().equals(other.getAreaCode()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logistics_trucks
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getLicensePlateNumber() == null) ? 0 : getLicensePlateNumber().hashCode());
        result = prime * result + ((getDriver() == null) ? 0 : getDriver().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getLoad() == null) ? 0 : getLoad().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getAreaCode() == null) ? 0 : getAreaCode().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table litemall_logistics_trucks
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        companyId("company_id", "companyId", "INTEGER", false),
        licensePlateNumber("license_plate_number", "licensePlateNumber", "VARCHAR", false),
        driver("driver", "driver", "VARCHAR", false),
        phone("phone", "phone", "VARCHAR", false),
        load("load", "load", "VARCHAR", true),
        createUser("create_user", "createUser", "VARCHAR", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        areaCode("area_code", "areaCode", "VARCHAR", false),
        province("province", "province", "VARCHAR", false),
        deleted("deleted", "deleted", "VARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_logistics_trucks
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_logistics_trucks
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_logistics_trucks
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_logistics_trucks
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_logistics_trucks
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_logistics_trucks
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_logistics_trucks
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_logistics_trucks
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_logistics_trucks
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_logistics_trucks
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_logistics_trucks
         *
         * @mbg.generated
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_logistics_trucks
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_logistics_trucks
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_logistics_trucks
         *
         * @mbg.generated
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_logistics_trucks
         *
         * @mbg.generated
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_logistics_trucks
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}