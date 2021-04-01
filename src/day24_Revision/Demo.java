package day24_Revision;

public class Demo {

    public static void main(String[] args) {

        String[] arr = {" ", "low", "medium", "high", "raju", "l"};

        if (arr.length != 0) {
            for (int i = 0; i < arr.length; i++) {

                if (arr[i].equals(" ")) {
                    continue;
                }

                String ch = arr[i];

                switch (ch) {
                    case "low":
                    case "l":
                        if (ch.length() == 3) {
                            System.out.println("this is low level");
                        }else{
                            System.out.println("r u l?");
                        }

                        break;
                    case "medium":
                        System.out.println("this is medium level");
                        break;
                    case "high":
                        System.out.println("this is high level");
                        break;
                    default:
                        System.out.println("no level here...");
                }
            }
        }

        System.out.println("program terminated");

    }
}
