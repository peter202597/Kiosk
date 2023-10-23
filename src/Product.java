public class Product extends Menu {
    private double menuPrice;
    private int menuNumber1;
//  private String menuCategory;

    public Product(int menuNumber, String menuName, double menuPrice, String menuExplanation) {
        super(menuNumber, menuName, menuExplanation);
        this.menuPrice = menuPrice;
//      this.menuCategory = menuCategory;
    }

//  게터 세터
//    @Override
//    public String getMenuName() {
//        return super.getMenuName();
//    }
//    @Override
//    public String getMenuExplanation() {
//        return super.getMenuExplanation();
//    }
//    public double getMenuPrice() {
//        return menuPrice;
//    }
//    @Override
//    public void setMenuName(String menuName) {
//        super.setMenuName(menuName);
//    }
//    @Override
//    public void setMenuExplanation(String menuExplanation) {
//        super.setMenuExplanation(menuExplanation);
//    }
//    public void setMenuPrice(double setMenuPrice) {
//        this.menuPrice = setMenuPrice;
//    }
//    public String getCategory() {
//        return menuCategory;
//    }
//    프린트프로덕트
    public void printProduct() {
        System.out.println(this.menuNumber +". " + this.menuName + " | W " + this.menuPrice/1000 + " | " + this.menuExplanation);
    }

//    @Override
//    public String toString() {
//        return super.toString() + " | Price: ₩ " + menuPrice + "|";
//    }
}

//menuNumber, int menuNumber,
// " | ₩ " + " | " +
//, String menuCategory