import java.text.DecimalFormat;

//Nguyen Hoang Thuong 20215146
//lớp cart biểu diễn giỏ hàng chứa các đĩa video số
public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;// Số lượng max =20
    public int qtyOrdered;// Biến lưu số lượng đĩa tối đa
    public DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];// Mảng lưu đĩa
    // Method thêm đĩa

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered - 1 == MAX_NUMBER_ORDERED) {// kiểm tra giỏ hàng đầy không
            System.out.println("The cart is almost full");// In thông báo nếu hàng đầy
        } else {
            itemsOrdered[qtyOrdered] = disc;// thêm đĩa vào vị trí cuối
            qtyOrdered++;// tăng 1
            System.out.println("The disc has been added");// Thông báo
        }
    }

    // Xóa đĩa giỏ hàng
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int check = 0;// Biến lưu vị trí của đĩa
        for (int i = 0; i <= qtyOrdered; i++) {
            if (disc.equals(itemsOrdered[i])) {// so sánh đĩa cần xóa
                check = i;
            }
        }
        if (check >= 0) {
            for (int i = check; i <= qtyOrdered; i++) {
                itemsOrdered[i] = itemsOrdered[i + 1];
                System.out.println("The disc has been deleted");
            }
        } else {
            System.out.println("Don't have the disc in the cart");
        }
        qtyOrdered--;
    }

    // Nguyen Hoang Thuong 20215146
    // tính tổng tiền các đĩa trong giỏ hàng
    public String totalCost() {
        double totalCost = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            totalCost += itemsOrdered[i].getCost();// cộng tiền từng đĩa
        }
        double number = totalCost;
        DecimalFormat df = new DecimalFormat("0.00");

        // Sử dụng mẫu định dạng để định dạng số
        String formattedNumber = df.format(number);
        // System.out.println(formattedNumber);
        // System.out.println("total cost: " + totalCost);
        return formattedNumber;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (int i = 0; i < dvdList.length; i++) {
            itemsOrdered[qtyOrdered] = dvdList[i];// thêm từng đĩa vào vị trí cuối cùng
            qtyOrdered++;
        }
        System.out.println("Add list complete");// thông báo thêm thành công
    }

    // Thêm 2 đĩa
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        itemsOrdered[qtyOrdered] = dvd1;
        itemsOrdered[qtyOrdered + 1] = dvd2;
        qtyOrdered += 2;
    }

}