package cn.study.design.group;

/**
 * @author CAT
 * @description
 * @date 2022/5/3
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright CodeDesign
 */
public class Link {

    private String fromId;
    private String toId;

    public Link(String fromId, String toId) {
        this.fromId = fromId;
        this.toId = toId;
    }

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public String getToId() {
        return toId;
    }

    public void setToId(String toId) {
        this.toId = toId;
    }

}
