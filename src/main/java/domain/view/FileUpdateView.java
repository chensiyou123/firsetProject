package domain.view;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class FileUpdateView {
    private String account;
    private String gns;
    private List<MultipartFile> files;


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getGns() {
        return gns;
    }

    public void setGns(String gns) {
        this.gns = gns;
    }

    public List<MultipartFile> getFiles() {
        return files;
    }

    public void setFiles(List<MultipartFile> files) {
        this.files = files;
    }
}
