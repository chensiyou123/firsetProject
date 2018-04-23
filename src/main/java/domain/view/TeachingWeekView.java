package domain.view;
import java.io.Serializable;
import java.util.Date;

/**
 * 教学周-实体
 *
 * @author anowls
 */

public class TeachingWeekView extends DomainView implements Serializable {

    private String termPlanId;

    private String gradeId;

    private short weekNum;

    private Date startDate;

    private Date endDate;

    private short isDouble;

    private boolean status;

    public String getTermPlanId() {
        return termPlanId;
    }

    public void setTermPlanId(String termPlanId) {
        this.termPlanId = termPlanId;
    }

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    public short getWeekNum() {
        return weekNum;
    }

    public void setWeekNum(short weekNum) {
        this.weekNum = weekNum;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public short getDouble() {
        return isDouble;
    }

    public void setDouble(short isDouble) {
        this.isDouble = isDouble;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
