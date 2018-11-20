package tech.wetech.weshop.query;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author cjbi
 */
public class AddressPageQuery {

    @ApiModelProperty("页面大小")
    private Integer pageSize = 10;

    @ApiModelProperty("页码")
    private Integer pageNum = 1;

    private Integer userId;

    private String name;

    private String mobile;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}