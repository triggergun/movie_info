package top.wutunan.moviecore.web.service.Impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.wutunan.moviecore.Result.ApiResult;
import top.wutunan.moviecore.dao.TbUpdataMovieDao;
import top.wutunan.moviecore.pojo.TbUpdataMovie;
import top.wutunan.moviecore.web.service.MovieInfoService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MovieInfoServiceImpl implements MovieInfoService {


    @Autowired
    private TbUpdataMovieDao tbUpdataMovieDao;

    @Override
    public ApiResult getMovieList() {

        QueryWrapper<TbUpdataMovie> tbUpdataMovieQueryWrapper = new QueryWrapper<>();
        List<TbUpdataMovie> tbUpdataMovies = tbUpdataMovieDao.selectList(tbUpdataMovieQueryWrapper);
        ApiResult apiResult = new ApiResult();
        apiResult.setData(tbUpdataMovies);
        return apiResult;
    }


    @Override
    public ApiResult getTbUpdataMoviePage(Integer currentPage, Integer pageSize) {

        currentPage =  currentPage == null ? 1: currentPage;
        pageSize =  pageSize == null ? 20: pageSize;
        // page info object
        top.wutunan.moviecore.bean.Page page = new top.wutunan.moviecore.bean.Page(currentPage, pageSize);
        QueryWrapper<TbUpdataMovie> tbUpdataMovieQueryWrapper = new QueryWrapper<>();
        tbUpdataMovieQueryWrapper.orderByDesc("get_time");
        PageHelper.startPage(page.getPageNum(), page.getPageSize());
        List<TbUpdataMovie> tbUpdataMovies = tbUpdataMovieDao.selectList(tbUpdataMovieQueryWrapper);

        page.setTotal(new PageInfo<>(tbUpdataMovies).getTotal());  // 总共多少条记录
        Map<String, Object> map = new HashMap<>(2);
        map.put("list", tbUpdataMovies);
        map.put("page", page);
        System.out.println(page.toString());
        return new ApiResult(map);
    }
}
