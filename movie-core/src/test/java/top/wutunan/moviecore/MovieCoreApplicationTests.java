//package top.wutunan.moviecore;
//
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import top.wutunan.moviecore.Result.ApiResult;
//import top.wutunan.moviecore.dao.TbUpdataMovieDao;
//import top.wutunan.moviecore.pojo.TbUpdataMovie;
//import top.wutunan.moviecore.web.service.Impl.MovieInfoServiceImpl;
//
//import java.util.List;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//class MovieCoreApplicationTests {
//
//    @Autowired
//    private TbUpdataMovieDao tbUpdataMovieDao;
//
//    @Autowired
//    private MovieInfoServiceImpl movieInfoService;
//
//    @Test
//    void contextLoads() {
//        TbUpdataMovie tbUpdataMovie = tbUpdataMovieDao.selectByPrimaryKey(23);
//        System.out.println(tbUpdataMovie.toString());
//    }
//
//
//    @Test
//    void contextLoads01() {
//        ApiResult movieList = movieInfoService.getMovieList();
//        System.out.println(movieList.toString());
//    }
//
//
//    /**
//     * 分页查询接口
//     */
//    @Test
//    void contextLoads02() {
//        ApiResult movieList = movieInfoService.getTbUpdataMoviePage(2,50);
//        System.out.println(movieList.toString());
//    }
//
//
//    /**
//     * 分页查询接口
//     *
//     * 通过电影名字。
//     * 电影的获取时间。
//     */
//    @Test
//    void contextLoads03() {
//        List<TbUpdataMovie> list = tbUpdataMovieDao.selectByKeyword("1");
//
//        for (TbUpdataMovie tbUpdataMovie : list) {
//
//            System.out.println(tbUpdataMovie);
//        }
//    }
//
//
//
//}
