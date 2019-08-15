package org.linlinjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.linlinjava.litemall.db.domain.LitemallLogicsticsTransport;
import org.linlinjava.litemall.db.domain.LitemallLogicsticsTransportExample;

public interface LitemallLogicsticsTransportMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logicstics_transport
     *
     * @mbg.generated
     */
    long countByExample(LitemallLogicsticsTransportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logicstics_transport
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallLogicsticsTransportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logicstics_transport
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logicstics_transport
     *
     * @mbg.generated
     */
    int insert(LitemallLogicsticsTransport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logicstics_transport
     *
     * @mbg.generated
     */
    int insertSelective(LitemallLogicsticsTransport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logicstics_transport
     *
     * @mbg.generated
     */
    LitemallLogicsticsTransport selectOneByExample(LitemallLogicsticsTransportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logicstics_transport
     *
     * @mbg.generated
     */
    LitemallLogicsticsTransport selectOneByExampleSelective(@Param("example") LitemallLogicsticsTransportExample example, @Param("selective") LitemallLogicsticsTransport.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logicstics_transport
     *
     * @mbg.generated
     */
    List<LitemallLogicsticsTransport> selectByExampleSelective(@Param("example") LitemallLogicsticsTransportExample example, @Param("selective") LitemallLogicsticsTransport.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logicstics_transport
     *
     * @mbg.generated
     */
    List<LitemallLogicsticsTransport> selectByExample(LitemallLogicsticsTransportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logicstics_transport
     *
     * @mbg.generated
     */
    LitemallLogicsticsTransport selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallLogicsticsTransport.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logicstics_transport
     *
     * @mbg.generated
     */
    LitemallLogicsticsTransport selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logicstics_transport
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallLogicsticsTransport record, @Param("example") LitemallLogicsticsTransportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logicstics_transport
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallLogicsticsTransport record, @Param("example") LitemallLogicsticsTransportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logicstics_transport
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallLogicsticsTransport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_logicstics_transport
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallLogicsticsTransport record);
}