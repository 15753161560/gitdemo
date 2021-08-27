package springcloud;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface ComeindetailMapper {
    int countByExample(ComeindetailExample example);

    int deleteByExample(ComeindetailExample example);

    int deleteByPrimaryKey(Long cdid);

    int insert(Comeindetail record);

    int insertSelective(Comeindetail record);

    List<Comeindetail> selectByExampleWithRowbounds(ComeindetailExample example, RowBounds rowBounds);

    List<Comeindetail> selectByExample(ComeindetailExample example);

    Comeindetail selectByPrimaryKey(Long cdid);

    int updateByExampleSelective(@Param("record") Comeindetail record, @Param("example") ComeindetailExample example);

    int updateByExample(@Param("record") Comeindetail record, @Param("example") ComeindetailExample example);

    int updateByPrimaryKeySelective(Comeindetail record);

    int updateByPrimaryKey(Comeindetail record);
}