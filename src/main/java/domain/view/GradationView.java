package domain.view;
import java.io.Serializable;

/**
 * 学段-实体类
 *
 * @author anowls
 */

public class GradationView extends DomainView implements Serializable {


    private String gradationName;
    private String code;

    private Integer leamAge;

    private Integer leamLen;

    private Integer sortNumber;

    private Boolean status;

    public String getGradationName() {
        return gradationName;
    }

    public void setGradationName(String gradationName) {
        this.gradationName = gradationName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getLeamAge() {
        return leamAge;
    }

    public void setLeamAge(Integer leamAge) {
        this.leamAge = leamAge;
    }

    public Integer getLeamLen() {
        return leamLen;
    }

    public void setLeamLen(Integer leamLen) {
        this.leamLen = leamLen;
    }

    public Integer getSortNumber() {
        return sortNumber;
    }

    public void setSortNumber(Integer sortNumber) {
        this.sortNumber = sortNumber;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
