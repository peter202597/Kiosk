public class Menu {
    protected int menuNumber;
    protected String menuName;
    protected String menuExplanation;
    public Menu(int menuNumber, String menuName, String menuExplanation) {
        this.menuNumber = menuNumber;
        this.menuName = menuName;
        this.menuExplanation = menuExplanation;
    }
//  게터 세터
//    public String getMenuName() {
//        return menuName;
//    }
//    public String getMenuExplanation() {
//        return menuExplanation;
//    }
//    public void setMenuName(String menuName) {
//        this.menuName = menuName;
//    }
//    public void setMenuExplanation(String menuExplanation) {
//        this.menuExplanation = menuExplanation;
//    }
//    프린트메뉴
    public void printMenu() {
        System.out.println(this.menuNumber + ". " + this.menuName + "\t | " + this.menuExplanation);
    }
//    @Override
//    public String toString() {
//        return menuName + ": " + menuExplanation;
//    }
}
