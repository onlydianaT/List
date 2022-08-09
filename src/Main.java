import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        String[] products = {"Cheese", "Milk", "Cottage cheese", "Butter", "Kefir"};
        String[] action = {"1.Add", "2.Show", "3.Remove", "4.Surch"};
        List<String> list = new LinkedList<>();

        for (int i = 0; i < action.length; i++) {
            System.out.println(action[i]);
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose one of option, input number or input end");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            int ActionNumber = Integer.parseInt(input) - 1;
            if (ActionNumber == 0) {
                System.out.println("What product do you want to add? List of available products: ");
                for (String p : products) {
                    System.out.println(p);
                }
                String inputProduct = scanner.nextLine();
                list.add(inputProduct);
                System.out.println("Total list of products: " + list.size());
            }

            if (ActionNumber == 1) {
                System.out.println("List of products: ");
//                print();
                for (String i : list) {
                    System.out.println(i);
                }
            }
            if (ActionNumber == 2) {
                System.out.println("List of products: ");
                //print();
                for (String i : list) {
                    System.out.println(i);
                }
                System.out.println("What number of product do you want to remove? Input number or name of product");
                String inputRemove = scanner.nextLine();
                list.remove(inputRemove);
                System.out.println("Purchase " + inputRemove + " is removed, list of products: ");
                //print();
                for (String i : list) {
                    System.out.println(i);
                }
                try {
                    int productRemove = Integer.parseInt(inputRemove) - 1;
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i) == list.get(productRemove)) {
                            String t = list.get(i);
                            list.remove(productRemove);
                            System.out.println("Purchase " + t + " is removed, list of products: ");
                        }
                    }
                    //print();
                    for (String i : list) {
                        System.out.println(i);
                    }
                } catch (NumberFormatException e) {
                    continue;
                }
            }

            if (ActionNumber == 3) {
                System.out.println("Input text to search: ");
                String inputSearch = scanner.nextLine();
                System.out.println("Naideno: ");
                for (int i = 0; i < list.size(); i++) {
                    String puchaceToLowerCase = list.get(i).toLowerCase();
                    String inputSurchToLowerCase = inputSearch.toLowerCase();
                    if (puchaceToLowerCase.contains(inputSurchToLowerCase)) {
                        System.out.println(puchaceToLowerCase);
                    }
                }
            }
        }
    }
//    private static void print() {
//        for (String i : list) {
//            System.out.println(i);
//        }
//
//    }
}