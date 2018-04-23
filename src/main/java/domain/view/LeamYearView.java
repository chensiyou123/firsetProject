package domain.view;

/**
 * @author Administrator
 * Created by F.S.Zhang on 2017/11/6.
 */
public class LeamYearView extends DomainView {
    private String yearName;

    private Integer sortNumber;
    private Integer status;

    public String getYearName() {
        return yearName;
    }

    public void setYearName(String yearName) {
        this.yearName = yearName;
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

}
