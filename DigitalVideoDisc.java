// Lớp DigitalVideoDisc biểu diễn một đĩa 
//Nguyen Hoang Thuong 20215146
public class DigitalVideoDisc {
    // Các thuộc tính của lớp
    private String title; // Tên của đĩa
    private String catetory; // Thể loại của đĩa
    private String director; // Đạo diễn của đĩa
    private int length; // Thời gian của đĩa
    private float cost; // Giá tiền của đĩa

    // Method truy cập và cập nhật cho các thuộc tính
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCatetory() {
        return catetory;
    }

    public void setCatetory(String catetory) {
        this.catetory = catetory;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    //
    // Các hàm tạo cho lớp
    // Hàm tạo với các tham số: tên, thể loại, đạo diễn, giá tiền
    public DigitalVideoDisc(String title, String catetory, String director, float cost) {
        this.title = title;
        this.catetory = catetory;
        this.director = director;
        this.cost = cost;
    }

    // Nguyen Hoang Thuong 20215146
    // Hàm tạo với các tham số: tên, thể loại, giá tiền
    public DigitalVideoDisc(String title, String catetory, float cost) {
        this.title = title;
        this.catetory = catetory;
        this.cost = cost;
    }

    // Hàm tạo với tham số: tên
    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    // Hàm tạo với các tham số: tên, thể loại, tác giả, thời lượng, giá tiền
    public DigitalVideoDisc(String title, String catetory, String director, int length, float cost) {
        this.title = title;
        this.catetory = catetory;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    // Phương thức truy cập và cập nhật cho thuộc tính giá tiền
    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
