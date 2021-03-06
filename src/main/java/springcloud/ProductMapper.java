package springcloud;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface ProductMapper {
    int countByExample(ProductExample example);

    int deleteByExample(ProductExample example);

    int deleteByPrimaryKey(Long proid);

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExampleWithRowbounds(ProductExample example, RowBounds rowBounds);

    List<Product> selectByExample(ProductExample example);

    Product selectByPrimaryKey(Long proid);

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}