package domain.view;

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
 * 3) 如果实体域为数据库中的表结构不一致，则需要添加@Table注解和@Entity注解；如果不是，则不需要添加。
 * 4）如果字段中包含类型这种字段，需要添加一个对应类型的枚举，然后用枚举来赋值：如类型字段，需要
 * 扩展一个类型枚举 xxxType{ One= 1 ,Two =2 } 。
 */
public class DomainView {

    private String id;

    private Long workId;

    private String creatorId;

    private Timestamp createTime;

    private String modifierId;

    private Timestamp modifyTime;

    private Boolean deleted;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getWorkId() {
        return workId;
    }

    public void setWorkId(Long workId) {
        this.workId = workId;
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

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean delete) {
        deleted = delete;
    }
}
