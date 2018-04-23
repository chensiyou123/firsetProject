package domain;

import java.util.List;

/**
 * @author F.S.Zhang
 * @date 2018/2/8
 * @copyright Hanboard
 * Created by F.S.Zhang on 2018/2/8.
 */
public class ResourcePush {
    /**
     * 作品集合
     */
    private List<ActivityWork> activityWorks;
    /**
     * 类型id
     */
    private List<String> typeIds;

    public List<ActivityWork> getActivityWorks() {
        return activityWorks;
    }

    public void setActivityWorks(List<ActivityWork> activityWorks) {
        this.activityWorks = activityWorks;
    }

    public List<String> getTypeIds() {
        return typeIds;
    }

    public void setTypeIds(List<String> typeIds) {
        this.typeIds = typeIds;
    }
}
