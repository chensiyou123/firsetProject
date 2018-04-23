package domain.view;

public class SocialDynamicAttachmentView {
    private String attachmentId;
    private String fileName;
    private Byte attachmentType;
    private Integer voiceNum;

    public String getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Byte getAttachmentType() {
        return attachmentType;
    }

    public void setAttachmentType(Byte attachmentType) {
        this.attachmentType = attachmentType;
    }

    public Integer getVoiceNum() {
        return voiceNum;
    }

    public void setVoiceNum(Integer voiceNum) {
        this.voiceNum = voiceNum;
    }
}
