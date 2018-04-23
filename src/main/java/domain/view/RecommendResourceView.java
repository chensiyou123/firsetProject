package domain.view;

import java.util.List;

public class RecommendResourceView {
    private String userId;
    private String courseId;
    private List<String> recommendTypes;
    private List<String> originResIds;
    private Integer count;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<String> getRecommendTypes() {
        return recommendTypes;
    }

    public void setRecommendTypes(List<String> recommendTypes) {
        this.recommendTypes = recommendTypes;
    }

    public List<String> getOriginResIds() {
        return originResIds;
    }

    public void setOriginResIds(List<String> originResIds) {
        this.originResIds = originResIds;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
