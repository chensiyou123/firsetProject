package domain.view;

import java.io.Serializable;
import java.util.Map;

/**
 * 更新solr字段
 */
public class UpdateSolrIndex implements Serializable{
    //资源id
    private String id;
    //{key:字段名称；value:字段值}
    private Map<String,Object> setValues;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, Object> getSetValues() {
        return setValues;
    }

    public void setSetValues(Map<String, Object> setValues) {
        this.setValues = setValues;
    }
}
