package domain.view;

import java.util.List;
import java.util.Map;

/**
 * @Author: Young
 * @Description: 导出excel实体
 * @Date: Created at 2017/8/11 9:46
 */
public class ActExcelExport {
    private List<Map> dataList;     //导出的数据

    private Integer dataStart;

    private String sheetName;       //表头名称

    private String[] head0;         //表头第一行列名

    private String[] headnum0;      //第一行合并单元格的参数

    private String[] head1;         //表头第二行列名

    private String[] headnum1;      //第二行合并单元格的参数

    private Integer twoStart;

    private Integer twoEnd;

    private String[] detail;        //导出的表体字段

    private String date;

    public List<Map> getDataList() {
        return dataList;
    }

    public void setDataList(List<Map> dataList) {
        this.dataList = dataList;
    }

    public Integer getDataStart() {
        return dataStart;
    }

    public void setDataStart(Integer dataStart) {
        this.dataStart = dataStart;
    }

    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    public String[] getHead0() {
        return head0;
    }

    public void setHead0(String[] head0) {
        this.head0 = head0;
    }

    public String[] getHeadnum0() {
        return headnum0;
    }

    public void setHeadnum0(String[] headnum0) {
        this.headnum0 = headnum0;
    }

    public String[] getHead1() {
        return head1;
    }

    public void setHead1(String[] head1) {
        this.head1 = head1;
    }

    public String[] getHeadnum1() {
        return headnum1;
    }

    public void setHeadnum1(String[] headnum1) {
        this.headnum1 = headnum1;
    }

    public Integer getTwoStart() {
        return twoStart;
    }

    public void setTwoStart(Integer twoStart) {
        this.twoStart = twoStart;
    }

    public Integer getTwoEnd() {
        return twoEnd;
    }

    public void setTwoEnd(Integer twoEnd) {
        this.twoEnd = twoEnd;
    }

    public String[] getDetail() {
        return detail;
    }

    public void setDetail(String[] detail) {
        this.detail = detail;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
