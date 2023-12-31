package top.wutunan.moviecore.bean;


import org.springframework.stereotype.Component;

/**
 *返回给前端分页对象
 */
@Component
public class Page {

    private int pageNum = 1;
    private int pageSize = 20;
    private int pages;
    private long total;

    public Page() {
    }

    public Page(Integer pageNum, Integer pageSize) {
        this.pageNum = pageNum != null ? pageNum : 1;
        this.pageSize = pageSize != null ? pageSize : 20;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
        // 在设置总页数的时候计算出对应的总页数，在下面的三目运算中加法拥有更高的优先级，所以最后可以不加括号。
        long temp = total % pageSize == 0 ? total / pageSize : total / pageSize + 1;
        this.pages = (int) temp;
    }

}
