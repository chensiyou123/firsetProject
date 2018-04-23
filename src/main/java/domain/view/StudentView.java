package domain.view;
import javax.persistence.Transient;

/**
 * Created by F.S.Zhang on 2017/11/10.
 */

public class StudentView extends DomainView {


    private String suId;


    private String sexCode;

    private String contactNumber;

    private String mail;


    /**
     * 姓名
     */
    @Transient
    private String userName;

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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
