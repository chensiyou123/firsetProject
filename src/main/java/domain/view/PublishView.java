package domain.view;

import java.io.Serializable;

/**
 * 出版社-实体
 *
 * @author anowls
 */
public class PublishView extends DomainView implements Serializable {

    private String publishName;
    private String publishCode;
    private String shortName;
    private String remark;
    private Boolean status;

    public String getPublishName() {
        return publishName;
    }

    public void setPublishName(String publishName) {
        this.publishName = publishName;
    }

    public String getPublishCode() {
        return publishCode;
    }

    public void setPublishCode(String publishCode) {
        this.publishCode = publishCode;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
