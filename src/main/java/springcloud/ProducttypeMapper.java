package springcloud;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface ProducttypeMapper {
    int countByExample(ProducttypeExample example);

    int deleteByExample(ProducttypeExample example);

    int deleteByPrimaryKey(Long typeid);

    int insert(Producttype record);

    int insertSelective(Producttype record);

    List<Producttype> selectByExampleWithRowbounds(ProducttypeExample example, RowBounds rowBounds);

    List<Producttype> selectByExample(ProducttypeExample example);

    Producttype selectByPrimaryKey(Long typeid);

    int updateByExampleSelective(@Param("record") Producttype record, @Param("example") ProducttypeExample example);

    int updateByExample(@Param("record") Producttype record, @Param("example") ProducttypeExample example);

    int updateByPrimaryKeySelective(Producttype record);

    int updateByPrimaryKey(Producttype record);
}