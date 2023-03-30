package scm.com.ojt.classobject;

import java.util.*;

public class Japan implements Country {

    @Override
    public void showPopulation() {
        System.out.println("Population of Japan in 2023 is 125,420,568.");
    }

    @Override
    public void showCountryInfo() {
        ArrayList<String> capital = new ArrayList<>();
        capital.add("Oosaka");
        capital.add("Tokyou");
        capital.add("Hiroshima");
        capital.add("Aomori");
        capital.add("Okayama");

        // output string using for each loop
        System.out.println("Capitals in Japan are....");
        for (String i : capital) {
            System.out.print("\t" + i);
        }
        System.out.println();
    }

}
