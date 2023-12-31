package top.wutunan.moviecore.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.wutunan.moviecore.Result.ApiResult;
import top.wutunan.moviecore.web.service.Impl.MovieInfoServiceImpl;

@RestController
@RequestMapping("/movie")
public class MovieInfoController {

    @Autowired
    private MovieInfoServiceImpl movieInfoService;

    @GetMapping("/list")
    public ApiResult getMovieList(){

        ApiResult movieList = movieInfoService.getMovieList();
        return movieList;
    }

    @GetMapping("/page/list")
    public ApiResult getMoviePageList(Integer currentPage,Integer pageSize){

        ApiResult movieList = movieInfoService.getTbUpdataMoviePage(currentPage,pageSize);
        return movieList;
    }

}
