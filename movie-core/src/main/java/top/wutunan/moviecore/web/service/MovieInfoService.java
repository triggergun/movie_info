package top.wutunan.moviecore.web.service;


import top.wutunan.moviecore.Result.ApiResult;


public interface MovieInfoService  {

    public ApiResult getMovieList();

    public ApiResult getTbUpdataMoviePage(Integer currentPage, Integer pageSize);
}
