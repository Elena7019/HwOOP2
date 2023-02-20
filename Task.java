package DomashkiJava.Hw6Java;

import java.util.HashSet;
import java.util.Set;

public class Task {
    public static void main(String[] args) {

        Laptop hp_envy_360 = new Laptop("hp_envy_360", 15, "4k",
                true, 500, "8", "Windows", "black");
        Brand brandHp = new Brand("HP", "U.S.A.", "AmericaLanguage");
        hp_envy_360.addBrand(brandHp);
        Laptop lenovo_B_50_30 = new Laptop("lenovo_B_50_30", 16, "FullHD",
                true, 700, "8", "Windows", "white");
        Brand brandLenovo = new Brand("Lenovo", "China", "ChinaLanguage");
        lenovo_B_50_30.addBrand(brandLenovo);
        Laptop hp_giper_expertBook = new Laptop("hp_giper_expertBook ", 15, "FullHD",
                true, 500, "8", "Windows", "white");
        hp_giper_expertBook.addBrand(brandHp);
        Laptop samsung_a52 = new Laptop("samsung_a52", 18, "FullHD",
                true, 300, "8", "Windows", "black");
        Brand brandSamsung = new Brand("Samsung", "Korea", "KoreaLanguage");
        samsung_a52.addBrand(brandSamsung);
        Laptop macbook_14pro = new Laptop("macbook_14pro", 17, "4k",
                false, 1000, "8", "iOS", "white");
        Brand brandMacbook = new Brand("Apple", "U.S.A.", "AmericaLanguage");
        macbook_14pro.addBrand(brandMacbook);
        Laptop samsung_m31s = new Laptop("samsung_m31s", 16, "4k",
                false, 1000, "16", "Linux", "black");
        samsung_m31s.addBrand(brandSamsung);
        Laptop acer_air5 = new Laptop("acer_air5", 19, "FullHD",
                true, 600, "8", "Windows", "black");
        Brand brandAcer = new Brand("Acer", "taiwan", "ChinaLanguage");
        acer_air5.addBrand(brandAcer);
        Laptop acer_a313 = new Laptop("acer_a313", 16, "FullHD",
                true, 500, "8", "Windows", "black");
        acer_a313.addBrand(brandAcer);
        Laptop asus_x515 = new Laptop("asus_x515", 17, "FullHD",
                true, 300, "4", "Windows", "black");
        Brand brandAsus = new Brand("Asus", "taiwan", "ChinaLanguage");
        asus_x515.addBrand(brandAsus);
        Laptop acer_air6 = new Laptop("acer_air6", 18, "4k",
                false, 500, "16", "Windows", "black");
        acer_air6.addBrand(brandAcer);

        Set<Laptop> laptop = new HashSet<>();
        laptop.add(hp_envy_360);
        laptop.add(lenovo_B_50_30);
        laptop.add(hp_giper_expertBook);
        laptop.add(samsung_a52);
        laptop.add(macbook_14pro);
        laptop.add(samsung_m31s);
        laptop.add(acer_air5);
        laptop.add(acer_a313);
        laptop.add(asus_x515);
        laptop.add(acer_air6);

        Laptop FilterLaptop = new Laptop();

        System.out.println(FilterLaptop.newFilter(laptop));
    }
}
