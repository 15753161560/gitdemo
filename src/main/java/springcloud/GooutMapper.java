package springcloud;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface GooutMapper {
    int countByExample(GooutExample example);

    int deleteByExample(GooutExample example);

    int deleteByPrimaryKey(Long goid);

    int insert(Goout record);

    int insertSelective(Goout record);

    List<Goout> selectByExampleWithRowbounds(GooutExample example, RowBounds rowBounds);

    List<Goout> selectByExample(GooutExample example);

    Goout selectByPrimaryKey(Long goid);

    int updateByExampleSelective(@Param("record") Goout record, @Param("example") GooutExample example);

    int updateByExample(@Param("record") Goout record, @Param("example") GooutExample example);

    int updateByPrimaryKeySelective(Goout record);

    int updateByPrimaryKey(Goout record);
}