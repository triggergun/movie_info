package top.wutunan.moviecore.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * tb_updata_movie
 * @author 
 */
@Data
public class TbUpdataMovie implements Serializable {
    private Integer id;

    private String source;

    private String imageUrl;

    private String movieName;

    private String updataTime;

    private String number;

    private String context;

    private String type;


    /**
     * String  不要时间转换。直接就是写入时的格式。
     */
    private String getTime;

    private static final long serialVersionUID = 1L;
}