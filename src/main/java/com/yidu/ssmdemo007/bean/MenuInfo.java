package com.yidu.ssmdemo007.bean;

public class MenuInfo {
   private String menuid;
   private String title;
   private int  state;
   private String url ;
   private String pid ;
   private String iconCls;

    public MenuInfo() {
    }

    public MenuInfo(String menuid, String title, int state, String url, String pid, String iconCls) {
        this.menuid = menuid;
        this.title = title;
        this.state = state;
        this.url = url;
        this.pid = pid;
        this.iconCls = iconCls;
    }

    public String getMenuid() {
        return menuid;
    }

    public void setMenuid(String menuid) {
        this.menuid = menuid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    @Override
    public String toString() {
        return "MenuInfo{" +
                "menuid='" + menuid + '\'' +
                ", title='" + title + '\'' +
                ", state=" + state +
                ", url='" + url + '\'' +
                ", pid='" + pid + '\'' +
                ", iconCls='" + iconCls + '\'' +
                '}';
    }
}
