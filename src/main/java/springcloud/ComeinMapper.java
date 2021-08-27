package springcloud;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface ComeinMapper {
    int countByExample(ComeinExample example);

    int deleteByExample(ComeinExample example);

    int deleteByPrimaryKey(Long ciid);

    int insert(Comein record);

    int insertSelective(Comein record);

    List<Comein> selectByExampleWithRowbounds(ComeinExample example, RowBounds rowBounds);

    List<Comein> selectByExample(ComeinExample example);

    Comein selectByPrimaryKey(Long ciid);

    int updateByExampleSelective(@Param("record") Comein record, @Param("example") ComeinExample example);

    int updateByExample(@Param("record") Comein record, @Param("example") ComeinExample example);

    int updateByPrimaryKeySelective(Comein record);

    int updateByPrimaryKey(Comein record);
}