package domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "res_record_download_new")
@ApiModel(value = "资源下载记录数据表")
public class ResourceResDownload extends BaseExtDomain {

    @ApiModelProperty(value = "资源id",required = true)
    @Column(name="res_id")
    private String resId;

    @ApiModelProperty(value = "下载类型")
    @Column(name="download_type")
    private Integer downloadType;

    @ApiModelProperty(value = "author")
    @Transient
    private String author;//作者

    @ApiModelProperty(value = "资源标题")
    @Transient
    private  String title;

    @ApiModelProperty(value = "类型id")
    @Transient
    private String fileId;


    @ApiModelProperty(value = "文件系统主键")
    @Transient
    private String typeId;

    @ApiModelProperty(value = "资源创建者id")
    @Transient
    private String resCreatorId;

    @ApiModelProperty(value = "资源创建者姓名")
    @Transient
    private String resCreatorName;

    @ApiModelProperty(value = "资源类型名称")
    @Transient
    private String typeName;

    @ApiModelProperty(value = "资源积分")
    @Transient
    private String price;


    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId == null ? null : resId.trim();
    }

    public Integer getDownloadType() {
        return downloadType;
    }

    public void setDownloadType(Integer downloadType) {
        this.downloadType = downloadType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getResCreatorId() {
        return resCreatorId;
    }

    public void setResCreatorId(String resCreatorId) {
        this.resCreatorId = resCreatorId;
    }

    public String getResCreatorName() {
        return resCreatorName;
    }

    public void setResCreatorName(String resCreatorName) {
        this.resCreatorName = resCreatorName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}