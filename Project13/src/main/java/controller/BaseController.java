package controller;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class BaseController extends ActionSupport {

    /**
     * 查询条件
     */
    protected String searchText;
    /**
     * 类型
     */
    protected String type;
    /**
     * 主键Id
     */
    protected String id;

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
