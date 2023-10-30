import java.text.DecimalFormat;
//Nguyen Hoang Thuong 20215146

public class Aims {

    public static void main(String[] args) {
        Cart cart = new Cart();// Tạo một số đĩa
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Movie 1", "Action", "Director 1", 19.99f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Movie 2", "Comedy", "Director 2", 14.99f);

        // Thêm đĩa vào giỏ hàng
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);

        // Tính tổng tiền của giỏ hàng
        String totalCost = cart.totalCost();
        System.out.println("Total cost of the cart: $" + totalCost);

        // Xóa một đĩa khỏi giỏ hàng
        cart.removeDigitalVideoDisc(dvd1);

        // In ra danh sách các đĩa còn lại trong giỏ hàng
        System.out.println("Remaining discs in the cart:");
        for (int i = 0; i < cart.qtyOrdered; i++) {
            System.out.println(cart.itemsOrdered[i].getTitle());
        }

    }
}

// Nguyen Hoang Thuong 20215146