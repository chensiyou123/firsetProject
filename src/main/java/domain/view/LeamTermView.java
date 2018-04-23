package domain.view;

/**
 * @author Administrator
 * Created by F.S.Zhang on 2017/11/6.
 */
public class LeamTermView extends DomainView {

    private String yearId;

    private String leamTermName;

    private Integer sortNumber;

    private Integer status;


    private String yearName;

    public String getYearId() {
        return yearId;
    }

    public void setYearId(String yearId) {
        this.yearId = yearId;
    }

    public String getLeamTermName() {
        return leamTermName;
    }

    public void setLeamTermName(String leamTermName) {
        this.leamTermName = leamTermName;
    }

    public Integer getSortNumber() {
        return sortNumber;
    }

    public void setSortNumber(Integer sortNumber) {
        this.sortNumber = sortNumber;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }



    public String getYearName() {
        return yearName;
    }

    public void setYearName(String yearName) {
        this.yearName = yearName;
    }
}
