package day12_Git;

import day22_AccessModifierSamePackage.Demo;

import java.util.Arrays;

public class ProjectDemo {

    public static void main(String[] args) {
        Demo.greet();
        String cvxList = "207,208,209,210,234";
        String reg = "207|208|209|210";
        String[] cvx = cvxList.split(",");
        System.out.println(Arrays.toString(cvx));

        int counter = 0;

        for (int i = 0; i < cvx.length; i++) {
            if (cvx[i].matches(reg)) {
                counter++;
            }
        }

        if (counter == 4) {
            System.out.println("test pass");
        } else {
            System.out.println("test fail");
        }

    }

}
