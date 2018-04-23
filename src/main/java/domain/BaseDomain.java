package domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 实体域基类
 * 1 实体域字段定义要求：
 * 1) String: VARCHAR,CHAR,TEXT
 * 2) Boolean: BIT
 * 3) Long: INTEGER
 * 4) Integer: TINYINT,SMALLINT,MEDIUMINT
 * 5) BigDecimal: DECIMAL
 * 6) java.sql.Date: DATE,YEAR
 * 7) java.sql.Time: TIME
 * 8) java.sql.Timestamp: DATETIME,TIMESTAMP
 * 2 实体域说明：
 * 1）如果字段名称和数据库一致（忽略大小写），则不需要写@Column注解；如果不一致，则需要写@Column注解。
 * 2) 如果字段名称在数据库中不存在（即扩展出的字段），则需要添加@Transient注解。
 * 3) 如果实体域为数据库中的表结构，则需要添加@Table注解和@Entity注解；如果不是，则不需要添加。
 * 4）如果字段中包含类型这种字段，需要添加一个对应类型的枚举，然后用枚举来赋值：如资源类型字段，需要
 * 扩展一个资源类型枚举 ResourceType{ RESOURCE= 1 资源系统,ACTIVITY =2 资源评比} 。
 */
@MappedSuperclass
public class BaseDomain implements Serializable{

    @ApiModelProperty(value = "id",required = true)
    @Id
    private String id;

    @ApiModelProperty(value = "序号")
    @Column(name = "sort_number")
    private Long sortNumber;

    @ApiModelProperty(value = "创建人id" ,required = true)
    @Column(name = "creator_id")
    private String creatorId;

    @ApiModelProperty(value = "创建人")
    @Transient
    private String creatorName;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @ApiModelProperty(value = "创建时间",required = true)
    @Column(name = "create_time")
    private Timestamp createTime;

    @ApiModelProperty(value = "修改人id")
    @Column(name = "modifier_id")
    private String modifierId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @ApiModelProperty(value = "修改时间")
    @Column(name = "modify_time")
    private Timestamp modifyTime;

    @ApiModelProperty(value = "是否删除")
    @Column(name = "is_delete")
    private Boolean isDelete;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getSortNumber() {
        return sortNumber;
    }

    public void setSortNumber(Long sortNumber) {
        this.sortNumber = sortNumber;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getModifierId() {
        return modifierId;
    }

    public void setModifierId(String modifierId) {
        this.modifierId = modifierId;
    }

    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }
}
