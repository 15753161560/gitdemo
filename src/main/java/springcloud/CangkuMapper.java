package springcloud;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface CangkuMapper {
    int countByExample(CangkuExample example);

    int deleteByExample(CangkuExample example);

    int deleteByPrimaryKey(Long ckid);

    int insert(Cangku record);

    int insertSelective(Cangku record);

    List<Cangku> selectByExampleWithRowbounds(CangkuExample example, RowBounds rowBounds);

    List<Cangku> selectByExample(CangkuExample example);

    Cangku selectByPrimaryKey(Long ckid);

    int updateByExampleSelective(@Param("record") Cangku record, @Param("example") CangkuExample example);

    int updateByExample(@Param("record") Cangku record, @Param("example") CangkuExample example);

    int updateByPrimaryKeySelective(Cangku record);

    int updateByPrimaryKey(Cangku record);
}