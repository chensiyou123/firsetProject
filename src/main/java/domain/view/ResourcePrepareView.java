package domain.view;

import com.hanboard.educloud.resource.domain.ResourcePrepareInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * 教学包实体
 */
public class ResourcePrepareView {

    private List<ResourcePrepareInfo> desigList = new ArrayList<>();//教学设计

    private List<ResourcePrepareInfo> caseList = new ArrayList<>();//学案

    private List<ResourcePrepareInfo> coursewareList = new ArrayList<>();//课件

    private List<ResourcePrepareInfo> materialList = new ArrayList<>();//素材

    private List<ResourcePrepareInfo> paperQuestionList = new ArrayList<>();//试题

    private List<ResourcePrepareInfo> paperExamList = new ArrayList<>();//作业

    public List<ResourcePrepareInfo> getCoursewareList() {
        return coursewareList;
    }

    public void setCoursewareList(List<ResourcePrepareInfo> coursewareList) {
        this.coursewareList = coursewareList;
    }

    public List<ResourcePrepareInfo> getMaterialList() {
        return materialList;
    }

    public void setMaterialList(List<ResourcePrepareInfo> materialList) {
        this.materialList = materialList;
    }

    public List<ResourcePrepareInfo> getPaperQuestionList() {
        return paperQuestionList;
    }

    public void setPaperQuestionList(List<ResourcePrepareInfo> paperQuestionList) {
        this.paperQuestionList = paperQuestionList;
    }

    public List<ResourcePrepareInfo> getPaperExamList() {
        return paperExamList;
    }

    public void setPaperExamList(List<ResourcePrepareInfo> paperExamList) {
        this.paperExamList = paperExamList;
    }

    public List<ResourcePrepareInfo> getDesigList() {
        return desigList;
    }

    public void setDesigList(List<ResourcePrepareInfo> desigList) {
        this.desigList = desigList;
    }

    public List<ResourcePrepareInfo> getCaseList() {
        return caseList;
    }

    public void setCaseList(List<ResourcePrepareInfo> caseList) {
        this.caseList = caseList;
    }
}
