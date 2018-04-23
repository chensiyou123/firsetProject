package domain.view;
import java.io.Serializable;
import java.util.Date;

/**
 * 学期计划-实体类
 *
 * @author anowls
 */
public class TermPlanView extends DomainView implements Serializable {


    private String schoolId;

    private String campusId;

    private String gradationId;


    private String leamYearId;


    private String termId;


    private Date startDate;


    private Date endDate;


    private Date weekStartDate;


    private Date weekEndDate;


    private Integer dayNum;


    private Integer mornNum;


    private Integer amNum;


    private Integer pmNum;


    private Integer nightNum;


    private Integer total;


    private Boolean status;

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getCampusId() {
        return campusId;
    }

    public void setCampusId(String campusId) {
        this.campusId = campusId;
    }

    public String getGradationId() {
        return gradationId;
    }

    public void setGradationId(String gradationId) {
        this.gradationId = gradationId;
    }

    public String getLeamYearId() {
        return leamYearId;
    }

    public void setLeamYearId(String leamYearId) {
        this.leamYearId = leamYearId;
    }

    public String getTermId() {
        return termId;
    }

    public void setTermId(String termId) {
        this.termId = termId;
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

    public Date getWeekStartDate() {
        return weekStartDate;
    }

    public void setWeekStartDate(Date weekStartDate) {
        this.weekStartDate = weekStartDate;
    }

    public Date getWeekEndDate() {
        return weekEndDate;
    }

    public void setWeekEndDate(Date weekEndDate) {
        this.weekEndDate = weekEndDate;
    }

    public Integer getDayNum() {
        return dayNum;
    }

    public void setDayNum(Integer dayNum) {
        this.dayNum = dayNum;
    }

    public Integer getMornNum() {
        return mornNum;
    }

    public void setMornNum(Integer mornNum) {
        this.mornNum = mornNum;
    }

    public Integer getAmNum() {
        return amNum;
    }

    public void setAmNum(Integer amNum) {
        this.amNum = amNum;
    }

    public Integer getPmNum() {
        return pmNum;
    }

    public void setPmNum(Integer pmNum) {
        this.pmNum = pmNum;
    }

    public Integer getNightNum() {
        return nightNum;
    }

    public void setNightNum(Integer nightNum) {
        this.nightNum = nightNum;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}
