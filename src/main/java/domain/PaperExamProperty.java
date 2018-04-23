package domain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 试卷属性
 */
@ApiModel(description = "试卷属性")
@Entity
@Table(name = "paper_exam_property")
public class PaperExamProperty extends BaseExtDomain {

    @ApiModelProperty(value = "编号",required = true)
    private String code;

    @ApiModelProperty(value = "名称",required = true)
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}