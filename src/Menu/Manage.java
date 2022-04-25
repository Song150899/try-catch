package Menu;

import java.util.Scanner;

public class Manage {
    public static void main(String[] args) {
        System.out.println("\uD83D\uDE00" +
                "           -----------------Menu-----------------\n" +
                "           *  Hiển thị \n" +
                "           *  Thêm \n" +
                "           "+
                "\u2699"+ "  Sửa \n" +
                "           "+
                "\uD83D\uDDD1"+"  Xóa \n" +
                "           -----------------Thoát-----------------");
        Scanner scanner = new Scanner(System.in);
        boolean cont = true;
        do {
            System.out.println("Chọn chức năng:[1-4] ");
            int chon = -1;
            try {

                chon = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Nhập số đi");
            }

            switch (chon) {

                case 1:
                    System.out.println(" Thêm: ");
                    break;
                case 2:
                    System.out.println(" Sửa: ");
                    break;
                case 3:
                    System.out.println(" Xóa: ");
                    break;
                case 0:
                    System.out.println(" Thoát ");
                    cont = false;
                    break;

            }
        }
        while (cont);

    }
}
