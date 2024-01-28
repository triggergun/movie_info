package top.wutunan.moviecore.web.service;


import top.wutunan.moviecore.Result.ApiResult;
import top.wutunan.moviecore.pojo.TbUpdataMovie;

import java.util.List;


public interface MovieInfoService  {


    /**
     * list 查询接口。小程序的搜索接口。
     * @param keyword
     * @return
     */
    ApiResult selectByKeyword(String keyword, Integer currentPage, Integer pageSize);

    public ApiResult getMovieList();

    public ApiResult getTbUpdataMoviePage(Integer currentPage, Integer pageSize);
}
