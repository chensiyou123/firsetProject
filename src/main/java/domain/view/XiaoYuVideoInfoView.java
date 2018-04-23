package domain.view;

/**
 * Created by pz on 2018/3/8.
 */
public class XiaoYuVideoInfoView {
    private long vodId;
    private String displayName;
    private long startTime;
    private long endTime;
    private long fileSize;
    private String meetingRoomNumber;
    private String nemoNumber;
    private String thumbnailId;
    private String fileId;
    private Integer downloadCount;

    public long getVodId() {
        return vodId;
    }

    public void setVodId(long vodId) {
        this.vodId = vodId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public String getMeetingRoomNumber() {
        return meetingRoomNumber;
    }

    public void setMeetingRoomNumber(String meetingRoomNumber) {
        this.meetingRoomNumber = meetingRoomNumber;
    }

    public String getNemoNumber() {
        return nemoNumber;
    }

    public void setNemoNumber(String nemoNumber) {
        this.nemoNumber = nemoNumber;
    }

    public String getThumbnailId() {
        return thumbnailId;
    }

    public void setThumbnailId(String thumbnailId) {
        this.thumbnailId = thumbnailId;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public Integer getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(Integer downloadCount) {
        this.downloadCount = downloadCount;
    }
}
