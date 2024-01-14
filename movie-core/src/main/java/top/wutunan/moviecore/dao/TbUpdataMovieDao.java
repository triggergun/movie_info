package top.wutunan.moviecore.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import top.wutunan.moviecore.pojo.TbUpdataMovie;

import java.util.List;

@Mapper
public interface TbUpdataMovieDao extends BaseMapper<TbUpdataMovie> {


    List<TbUpdataMovie> selectByKeyword(String keyword);

    int deleteByPrimaryKey(Integer id);


    int insert(TbUpdataMovie record);


    /**
     * 根据实体类  添加
     * @param record
     * @return
     */
    int insertSelective(TbUpdataMovie record);


    /**
     * 通过主键查询
     * @param id
     * @return
     */
    TbUpdataMovie selectByPrimaryKey(Integer id);


    /**
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(TbUpdataMovie record);


    int updateByPrimaryKey(TbUpdataMovie record);
}