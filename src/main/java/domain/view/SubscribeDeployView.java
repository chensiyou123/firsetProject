package domain.view;

import com.hanboard.educloud.resource.domain.ManagerSubscribeDeploy;

import java.util.List;

public class SubscribeDeployView {


    private List<ManagerSubscribeDeploy> typeList;//资源类型

    private List<ManagerSubscribeDeploy> schoolYearList;//学年

    private List<ManagerSubscribeDeploy> courseList;//学科

    private List<ManagerSubscribeDeploy> gradeList;//年级

    private List<ManagerSubscribeDeploy> teacherList;//教师


    public List<ManagerSubscribeDeploy> getTypeList() {
        return typeList;
    }

    public void setTypeList(List<ManagerSubscribeDeploy> typeList) {
        this.typeList = typeList;
    }

    public List<ManagerSubscribeDeploy> getSchoolYearList() {
        return schoolYearList;
    }

    public void setSchoolYearList(List<ManagerSubscribeDeploy> schoolYearList) {
        this.schoolYearList = schoolYearList;
    }

    public List<ManagerSubscribeDeploy> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<ManagerSubscribeDeploy> courseList) {
        this.courseList = courseList;
    }

    public List<ManagerSubscribeDeploy> getGradeList() {
        return gradeList;
    }

    public void setGradeList(List<ManagerSubscribeDeploy> gradeList) {
        this.gradeList = gradeList;
    }

    public List<ManagerSubscribeDeploy> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<ManagerSubscribeDeploy> teacherList) {
        this.teacherList = teacherList;
    }
}
