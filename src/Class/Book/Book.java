package Class.Book;

public class Book {
    private String BName;
    private String Writer;
    private String BNum;

    public String getCate() {
        return Cate;
    }

    public void setCate(String cate) {
        Cate = cate;
    }

    private  String Cate;

    public Book(String BName, String Writer, String BNum,String Cate) {
        this.BName = BName;
        this.Writer = Writer;
        this.BNum = BNum;
        this.Cate=Cate;
    }

    public String getBName() {
        return BName;
    }

    public void setBName(String BName) {
        this.BName = BName;
    }

    public String getWriter() {
        return Writer;
    }

    public void setWriter(String Writer) {
        Writer = Writer;
    }

    public String getBNum() {
        return BNum;
    }

    public void setBNum(String BNum) {
        this.BNum = BNum;
    }

    public String toString() {
        return " " + BName + " " + Writer + " " + BNum+" "+Cate;
    }
}
