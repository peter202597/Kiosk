import java.util.List;
import java.util.Scanner;

public class PaikDabangApplication {
    private static MenuContext menuContext;
    public static void main(String[] args) {
        menuContext = new MenuContext();
        displayMainMenu();
    }

    private static void displayMainMenu() {
        System.out.println("빽다방에 오신것을 환영합니다.");
        System.out.println("아래 카테고리를 선택 후 메뉴를 주문해 주세요.");
        System.out.println("");
        System.out.println("[ 빽다방 메뉴 ]");
        List<Menu> mainMenus = menuContext.getMenus("Main");
        int nextNum = printMenu(mainMenus, nextNum);
        handleMainMenuInput();
    }

    private static int printMenu(List<Menu> menus, int num) {
        for (int i = 0; i < menus.size(); i++) ;
        {
            System.out.println(num++ + ". " + menus.get(i).menuName + "\t|" + menus.get(i).menuExplanation);
        }
        return num;
    }
    private  static void handleMainMenuInput() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                displayCoffeMenu();
                break;
            case 2:
                displayBeverageMenus();
                break;
            case 3:
                displayIcecreamDessertMenus();
                break;
            case 4:
                displaypaikSccinoMenus();
                break;
            case 5:
                displayOrderMenu();
                break;
            case 6:
                handleCancelMenuInput();
                break;
            default:
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                handleMainMenuInput();
                break;
        }
    }
    private static  void displayCoffeMenu() {
        System.out.println("빽다방에 오신것을 환영합니다.");
        System.out.println("아래 상품을 선택해 주세요.");
        System.out.println("");
        System.out.println("[ 커피 ]");
        List<Product> coffeMenus = menuContext.getMenuProducts("Coffe");
        printMenuProducts(products);

        handleMainProductInput(products);
    }

}