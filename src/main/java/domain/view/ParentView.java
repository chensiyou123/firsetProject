package domain.view;

/**
 * @author Administrator
 * Created by F.S.Zhang on 2017/11/10.
 */
public class ParentView extends DomainView {

    private String mail;

    private String suId;

    private String sexCode;

    private String contactNumber;

    /**
     * 用户名称
     */
    private String userName;

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSuId() {
        return suId;
    }

    public void setSuId(String suId) {
        this.suId = suId;
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
