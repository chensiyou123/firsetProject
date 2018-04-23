package domain.view;

/**
 * 备课信息扩展属性
 */
public class PrepareLessonExtView {

    private String id;//主键

    private String konwledgePoint;//知识点

    private String target;//教学目标

    private String keynote;//教学重点

    private String teaching;//教学反思

    private Integer cDownload;//下载次数

    private Integer cShare;//分享次数

    private Integer cCollect;//收藏次数

    private Integer cComment;//评论次数

    private Integer finishStatus;//完成状态

    private Integer excellenceStatus;//推优状态

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getKonwledgePoint() {
        return konwledgePoint;
    }

    public void setKonwledgePoint(String konwledgePoint) {
        this.konwledgePoint = konwledgePoint == null ? null : konwledgePoint.trim();
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }

    public String getKeynote() {
        return keynote;
    }

    public void setKeynote(String keynote) {
        this.keynote = keynote == null ? null : keynote.trim();
    }

    public String getTeaching() {
        return teaching;
    }

    public void setTeaching(String teaching) {
        this.teaching = teaching == null ? null : teaching.trim();
    }

    public Integer getcDownload() {
        return cDownload;
    }

    public void setcDownload(Integer cDownload) {
        this.cDownload = cDownload;
    }

    public Integer getcShare() {
        return cShare;
    }

    public void setcShare(Integer cShare) {
        this.cShare = cShare;
    }

    public Integer getcCollect() {
        return cCollect;
    }

    public void setcCollect(Integer cCollect) {
        this.cCollect = cCollect;
    }

    public Integer getcComment() {
        return cComment;
    }

    public void setcComment(Integer cComment) {
        this.cComment = cComment;
    }

    public Integer getFinishStatus() {
        return finishStatus;
    }

    public void setFinishStatus(Integer finishStatus) {
        this.finishStatus = finishStatus;
    }

    public Integer getExcellenceStatus() {
        return excellenceStatus;
    }

    public void setExcellenceStatus(Integer excellenceStatus) {
        this.excellenceStatus = excellenceStatus;
    }
}