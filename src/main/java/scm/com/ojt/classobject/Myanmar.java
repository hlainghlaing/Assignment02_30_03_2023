package scm.com.ojt.classobject;

import java.util.*;

public class Myanmar implements Country {

    private String countrySize;
    private String countryFlag;

    public Myanmar() {
    }

    public Myanmar(String countrySize, String countryFlag) {
        super();
        this.countrySize = countrySize;
        this.countryFlag = countryFlag;
    }

    public String getCountrySize() {
        return countrySize;
    }

    public void setCountrySize(String countrySize) {
        this.countrySize = countrySize;
    }

    public String getCountryFlag() {
        return countryFlag;
    }

    public void setCountryFlag(String countryFlag) {
        this.countryFlag = countryFlag;
    }

    @Override
    public void showPopulation() {
        System.out.println("Population of Myanmar in 2023 is 54.38 million.");
    }

    @Override
    public void showCountryInfo() {
        ArrayList<String> capital = new ArrayList<>();
        capital.add("Yangon");
        capital.add("Mandalay");
        capital.add("Naypitaw");
        capital.add("Banmaw");
        capital.add("ShweBo");
        capital.add("Sagaing");
        capital.add("Pathein");

        // output string using for each loop
        System.out.println("Capitals in Myanmar are....");
        for (String i : capital) {
            System.out.print("\t" + i);
        }
        System.out.println();
    }

}
