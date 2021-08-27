package springcloud;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface GooutdetailMapper {
    int countByExample(GooutdetailExample example);

    int deleteByExample(GooutdetailExample example);

    int deleteByPrimaryKey(Long godid);

    int insert(Gooutdetail record);

    int insertSelective(Gooutdetail record);

    List<Gooutdetail> selectByExampleWithRowbounds(GooutdetailExample example, RowBounds rowBounds);

    List<Gooutdetail> selectByExample(GooutdetailExample example);

    Gooutdetail selectByPrimaryKey(Long godid);

    int updateByExampleSelective(@Param("record") Gooutdetail record, @Param("example") GooutdetailExample example);

    int updateByExample(@Param("record") Gooutdetail record, @Param("example") GooutdetailExample example);

    int updateByPrimaryKeySelective(Gooutdetail record);

    int updateByPrimaryKey(Gooutdetail record);
}