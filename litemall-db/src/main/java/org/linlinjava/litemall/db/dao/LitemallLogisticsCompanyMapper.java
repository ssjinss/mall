package org.linlinjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.linlinjava.litemall.db.domain.LitemallLogisticsCompany;
import org.linlinjava.litemall.db.domain.LitemallLogisticsCompanyExample;

public interface LitemallLogisticsCompanyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logistics_company
     *
     * @mbg.generated
     */
    long countByExample(LitemallLogisticsCompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logistics_company
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallLogisticsCompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logistics_company
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logistics_company
     *
     * @mbg.generated
     */
    int insert(LitemallLogisticsCompany record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logistics_company
     *
     * @mbg.generated
     */
    int insertSelective(LitemallLogisticsCompany record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logistics_company
     *
     * @mbg.generated
     */
    LitemallLogisticsCompany selectOneByExample(LitemallLogisticsCompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logistics_company
     *
     * @mbg.generated
     */
    LitemallLogisticsCompany selectOneByExampleSelective(@Param("example") LitemallLogisticsCompanyExample example, @Param("selective") LitemallLogisticsCompany.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logistics_company
     *
     * @mbg.generated
     */
    List<LitemallLogisticsCompany> selectByExampleSelective(@Param("example") LitemallLogisticsCompanyExample example, @Param("selective") LitemallLogisticsCompany.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logistics_company
     *
     * @mbg.generated
     */
    List<LitemallLogisticsCompany> selectByExample(LitemallLogisticsCompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logistics_company
     *
     * @mbg.generated
     */
    LitemallLogisticsCompany selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallLogisticsCompany.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logistics_company
     *
     * @mbg.generated
     */
    LitemallLogisticsCompany selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logistics_company
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallLogisticsCompany record, @Param("example") LitemallLogisticsCompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logistics_company
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallLogisticsCompany record, @Param("example") LitemallLogisticsCompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logistics_company
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallLogisticsCompany record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logistics_company
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallLogisticsCompany record);
}