import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuContext {
    private Map<String, List<Menu>> menus;
    private Map<String, List<Product>> menuProduct;
    private List<Product> cart;
    private double totalPrice;
    private int orderNumber;

    public MenuContext() {
        menus = new HashMap<>();
        menuProduct = new HashMap<>();
        cart = new ArrayList<>();
        totalPrice = 0.0;
        orderNumber = 0;

        initializeMenuItens();
    }

    private void initializeMenuItens() {
        List<Menu> mainMenus = new ArrayList<>();
        mainMenus.add(new Menu("커피", "뉴 크롭 원두를 사용하여 더욱더 신선한 커피 메뉴를 만나보세요."));
        mainMenus.add(new Menu("음료", "퀄리티 높은 식자재를 사용하여 맛있는 음료를 제공합니다."));
        mainMenus.add(new Menu("아이스크림/디저트", "달콤 아이스크림부터 든든 브레드까지 다양하게 즐기세요."));
        mainMenus.add(new Menu("빽스치노", "오직 빽다방에서만 만나보실 수 있는 시그니처 메뉴입니다."));

        List<Menu> orderMenus = new ArrayList<>();
        orderMenus.add(new Menu("카트", "장바구니를 확인 후 주문합니다."));
        orderMenus.add(new Menu("취소", "진행중인 주문을 취소합니다."));

        menus.put("카테고리", mainMenus);
        menus.put("주문", orderMenus);
        //커피
        List<Product> coffeMenus = new ArrayList<>();
        coffeMenus.add(new Product("더블에스프레소", 1.5, "브라질 원두 블렌딩으로 다크초콜릿, 카라멜, 견과류의 고소함을 느낄 수 있는 에스프레소"));
        coffeMenus.add(new Product("앗!메리카노", 1.5, "빽다방만의 맛과 향을 더한 100% 아라비카 로스팅 원두로 뽑아내 깊고 진한 맛의 아메리카노"));
        coffeMenus.add(new Product("원조커피", 2.5, "달콤한 빽다방 대표메뉴, 믹스커피 종결자!"));
        coffeMenus.add(new Product("빽's카페라떼", 3.0, "진한 에스프레소와 우유가 어우러져 탄생한 부드러운 빽다방 라떼"));
        coffeMenus.add(new Product( "바닐라라떼", 3.7, "부드러운 우유와 달콤하고 은은한 바닐라가 조화를 이루는 커피"));
        coffeMenus.add(new Product("달달연유라떼", 3.7, "달달하고 향긋한 베트남식 연유라떼"));
        coffeMenus.add(new Product("카페모카", 3.5, "초콜릿과 진한 에스프레소, 부드러운 우유가 더해진 달콤한 맛의 커피"));
        coffeMenus.add(new Product("카라멜마끼아또", 3.5, "카라멜소스와 신선한 우유, 에스프레소로 맛을 낸 빽다방 인기메뉴"));
        coffeMenus.add(new Product("콜드브루", 4.0, "장시간 추출해 맛과 향이 풍부한 콜드브루"));
        coffeMenus.add(new Product("콜드브루라떼", 4.5, "콜드브루에 신선한 우유를 더한 콜드브루라떼"));
        coffeMenus.add(new Product("아이스티샷추가(아샷추)", 3.0, "별미중의 별미! 달콤한 복숭아 맛 아이스티에 에스프레소 샷 추가~"));
        //음료
        List<Product> beverageMenus = new ArrayList<>();
        beverageMenus.add(new Product("크림소다", 4.5, "소다맛 에이드에 아이스크림과 토핑이 더해진 부드러운 크림소다"));
        beverageMenus.add(new Product("키르시 블렌딩 파인", 3.5, "체리베이스가 블렌딩되어 상큼하게 즐기는 파인애플맛 슬러시"));
        beverageMenus.add(new Product("키르시 블렌딩 콜라", 3.5, "에스프레소 샷과 체리베이스가 블렌딩된 색다른 맛의 콜라맛 슬러시"));
        beverageMenus.add(new Product("디아블로 에너지드링크", 3.8,"카페인이 함유된 강력한 레드컬러의 레몬맛 스포츠 음료"));
        beverageMenus.add(new Product("완전대봉주스", 4.4,"국내산 대봉의 맛을 오롯이 느낄 수 있는 주스"));
        beverageMenus.add(new Product("아이스크러시멜론",3.0,"잘게 부서진 얼음으로 더욱 시원하게 즐기는 멜론맛 음료"));
        beverageMenus.add(new Product("블루캔디소다", 3.5, "캔디처럼 달콤하고 하늘처럼 청량한 블루캔디소다"));
        beverageMenus.add(new Product("초코라떼", 3.5, "초코에 퐁당 빠지고 싶을때~!? 진짜~! 완~전 진한 초코라떼"));
        beverageMenus.add(new Product("미숫가루", 2.7, "고소하고 진한 맛의 미숫가루!"));
        beverageMenus.add(new Product("밀크티", 3.5, "얼그레이의 향긋함을 더한 부드러운 밀크티"));
        beverageMenus.add(new Product("달콤아이스티", 2.5, "시원하게 즐기는 복숭아 맛 아이스티"));
        //아이스크림&디저트
        List<Product> icecreamDessertMenus = new ArrayList<>();
        icecreamDessertMenus.add(new Product("크리미슈", 2.0, "비스킷과 부드러운 크림의 환상 조합!"));
        icecreamDessertMenus.add(new Product("크리미단팥빵", 2.0, "달콤한 팥과 크림이 듬뿍~"));
        icecreamDessertMenus.add(new Product("사라다빵", 3.5, "어린시절 빵집에서 사먹던 추억의 감자 사라다빵"));
        icecreamDessertMenus.add(new Product("예산사과샌드", 2.5, "아삭하게 씹히는 예산 사과의 풍미를 더하는 시나몬이 들어있는 샌드"));
        icecreamDessertMenus.add(new Product("크룽지", 2.8, "황설탕 카라멜라이징으로 더 달콤고소한 빅사이즈 크룽지"));
        icecreamDessertMenus.add(new Product("큰마들렌(오리지널)", 2.8, "약13cm의 큰!마들렌 촉촉하고 부드러운 플레인 맛으로 커피 메뉴와 함께 즐겨보세요"));
        icecreamDessertMenus.add(new Product("고메버터소금빵", 2.5, "프랑스산 고급 발효버터와 안데스산맥 빙하소금의 풍미가 가득");
        icecreamDessertMenus.add(new Product("맛카롱(순우유)", 2.5, "진한 우유 향과 맛을 그대로 간직한 맛카롱"));
        icecreamDessertMenus.add(new Product("맛카롱(초코크런치)", 2.5, "입안 가득한 달달함! 달콤 폭발 초코 맛카롱"));
        icecreamDessertMenus.add(new Product("노말한소프트", 2.0, "입안에서 부드럽게 사르륵 녹는 마성의 아이스크림"));
        icecreamDessertMenus.add(new Product("달고나크런치", 2.5, "바삭한 달고나와 부드러운 아이스크림이 잘 어울리는 달고나크런치"));
        //빽스치노
        List<Product> paikSccinoMenus = new ArrayList<>();
        paikSccinoMenus.add(new Product("원조빽스치노", 3.5, "원조커피의 시원한 변신~! 매력만점 커피 빽스치노"));
        paikSccinoMenus.add(new Product("딸기바나나빽스치노", 3.8, "상큼한 딸기와 달달한 바나나의 완전 시원한 만남!"));
        paikSccinoMenus.add(new Product("초코바나나빽스치노", 3.8, "달콤한 초코와 달달한 바나나의 완전 시원한 만남!"));
        paikSccinoMenus.add(new Product("피스타치오빽스치노", 4.5, "고소한 피스타치오와 진한 카카오닙스의 만남!"));
        paikSccinoMenus.add(new Product("녹차빽스치노", 3.8, "100% 국내산 녹차를 사용하여 부드럽고 진한 빽스치노"));
        paikSccinoMenus.add(new Product("민트초코빽스치노", 3.8, "초코칩으로 더한 깊은 초콜릿의 맛과 민트의 상쾌함이 어우러진 진한 민트초코 빽스치노"));
        paikSccinoMenus.add(new Product("쿠키크런치빽스치노", 3.8, "달콤한 쿠키 크런치가 듬뿍 들어간 빽스치노"));
        paikSccinoMenus.add(new Product("퐁당치노", 3.8, "빽다방 대표 시그니처 메뉴에 아낌없이 퐁당!"));

        menuProduct.put("Coffe", coffeMenus);
        menuProduct.put("Beverage", beverageMenus);
        menuProduct.put("IcecreamDessert / 디저트", icecreamDessertMenus);
        menuProduct.put("PaikSccino", paikSccinoMenus);
    }
    public List<Menu> getMenus(String key) {
        return menus.get(key);
    }
    public List<Product> getMenuProducts(String key) {
        return menuProduct.get(key);
    }
    public Map<String, List<Product>> getMenuProductMap() {
        return menuProduct;
    }
    public List<Product> gerCart() {
        return cart;
    }
    public void addMenu(String key, String menuExplanation) {
        menus.get("Main").add(new Menu(key, menuExplanation));
        menuProduct.put(key, new ArrayList<>());
    }
}
