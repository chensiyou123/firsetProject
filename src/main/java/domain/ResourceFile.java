package domain;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "res_file_new")
@ApiModel(description = "文件信息数据表")
public class ResourceFile  {

    @ApiModelProperty(value = "id",required = true)
    @Id
    private String id;

    @ApiModelProperty(value = "文件名",required = true)
    @Column(name = "file_name")
    private String fileName;

    @ApiModelProperty(value = "后缀",required = true)
    private String suffix;

    @ApiModelProperty(value = "文件大小",required = true)
    @Column(name = "file_size")
    private BigDecimal fileSize;

    @ApiModelProperty(value = "播放时长")
    @Column(name = "play_length")
    private BigDecimal playLength;//播放时长

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix == null ? null : suffix.trim();
    }

    public BigDecimal getFileSize() {
        return fileSize;
    }

    public void setFileSize(BigDecimal fileSize) {
        this.fileSize = fileSize;
    }

    public BigDecimal getPlayLength() {
        return playLength;
    }

    public void setPlayLength(BigDecimal playLength) {
        this.playLength = playLength;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}