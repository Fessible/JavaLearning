package cn.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.model.Customer;
import test.model.CustomerExample;
import test.model.CustomerWithBLOBs;

public interface CustomerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu May 16 23:05:20 CST 2019
     */
    long countByExample(CustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu May 16 23:05:20 CST 2019
     */
    int deleteByExample(CustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu May 16 23:05:20 CST 2019
     */
    int deleteByPrimaryKey(String user);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu May 16 23:05:20 CST 2019
     */
    int insert(CustomerWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu May 16 23:05:20 CST 2019
     */
    int insertSelective(CustomerWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu May 16 23:05:20 CST 2019
     */
    List<CustomerWithBLOBs> selectByExampleWithBLOBs(CustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu May 16 23:05:20 CST 2019
     */
    List<Customer> selectByExample(CustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu May 16 23:05:20 CST 2019
     */
    CustomerWithBLOBs selectByPrimaryKey(String user);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu May 16 23:05:20 CST 2019
     */
    int updateByExampleSelective(@Param("record") CustomerWithBLOBs record, @Param("example") CustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu May 16 23:05:20 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") CustomerWithBLOBs record, @Param("example") CustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu May 16 23:05:20 CST 2019
     */
    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu May 16 23:05:20 CST 2019
     */
    int updateByPrimaryKeySelective(CustomerWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu May 16 23:05:20 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(CustomerWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu May 16 23:05:20 CST 2019
     */
    int updateByPrimaryKey(Customer record);
}