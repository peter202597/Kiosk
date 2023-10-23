import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderSelection;

    public Order(String orderSelection) {
        this.orderSelection = orderSelection;
    }

    public String getOrderSelection() {
        return orderSelection;
    }
    public void printOrder() {
        System.out.println("장바구니에 담으시겠습니까?");
        System.out.print("1. 담기" + "\t" + "2. 취소");
    }
}
//public class Order {
//    private List<Product> temp;
//    private int orderNumber;
//    private double totalPrice;
//    public Order() {
//        temp = new ArrayList<>();
//        orderNumber = 1;
//    }
//    public List<Product> getTemp() {
//        return temp;
//    }
//    public int getOrderNumber() {
//        return orderNumber;
//    }
//    public void setOrderNumber(int orderNumber) {
//        this.orderNumber = orderNumber;
//    }
//    public double getTotalPrice() {
//        return totalPrice;
//    }
//    public void setTotalPrice(double totalPrice) {
//        this.totalPrice = totalPrice;
//    }
//    public void addOrder(Product product){
//        temp.add(product);
//    }
//    public double CalcTotalPrice(){
//        for(Product product : temp){
//            totalPrice += product.getMenuPrice();
//        }
//        return totalPrice;
//    }
//    public void clearTemp(){ temp.clear();}
//}