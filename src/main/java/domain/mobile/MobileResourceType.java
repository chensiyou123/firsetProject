package domain.mobile;

import java.util.ArrayList;
import java.util.List;

public class MobileResourceType {
    private String id;
    private String parentId;
    private String code;
    private String name;
    private Long sorted = new Long(0);
    private Long grade = new Long(0);
    private List<MobileResourceType> resourceTypes = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSorted() {
        return sorted;
    }

    public void setSorted(Long sorted) {
        this.sorted = sorted;
    }

    public Long getGrade() {
        return grade;
    }

    public void setGrade(Long grade) {
        this.grade = grade;
    }

    public List<MobileResourceType> getResourceTypes() {
        return resourceTypes;
    }

    public void setResourceTypes(List<MobileResourceType> resourceTypes) {
        this.resourceTypes = resourceTypes;
    }
}
