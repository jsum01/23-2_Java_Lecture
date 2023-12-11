package java231106;

public class Code1106_3 {
    public static void main(String[] args)  {
        City.nation = "korea"; // static을 사용했기 때문에 class소속의 변수로 생성된다.


        City u = new City();
        u.name = "ulsan";
        u.su = 110;

        City b = new City();
        b.name = "busan";
        b.su = 340;

        City s = new City();
        s.name = "seoul";
        s.su = 970;

        u.printCityDetail();
        b.printCityDetail();
        s.printCityDetail();
    }
}
