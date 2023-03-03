package com.ithe.dao;

import com.ithe.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AccountDao {

    @Insert("insert into tbl_account(name,money) values(#{name},#{money})")
    void save(Account account);

    @Insert("delete from tbl_account where id = #{id}")
    void delete(Integer id);

    @Update("update tbl_account set name = #{name} , money =#{money} where id = #{id}")
    void update(Account account);

    @Select("select * from tbl_account where id =#{id}")
    Account finById(Integer id);

    @Select("select * from tbl_account")
    List<Account> findAll();

    @Update("update tbl_account set money = money + #{money} where name = #{name}")
    void inMoney(@Param("name")String name ,@Param("money") Double money);

    @Update("update tbl_account set money = money - #{money} where name = #{name}")
    void outMoney(@Param("name")String name ,@Param("money") Double money);
}
