import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();
        do {
            int check = check();
            switch (check) {
                case 1:
                    System.out.println("Nhập số lượng đầu sách mới: ");
                    Controller.readers = scanner.nextInt();
                    controller.insertBooks();
                    controller.inBook();
                    break;
                case 2:
                    System.out.println("Nhập số lượng bạn đọc: ");
                    Controller.readers = scanner.nextInt();
                    controller.insertBooks();
                    controller.inReader();
                    break;
                case 3:
                    controller.borrowBooks();
                    System.out.println("Danh sách mượn sách vừa nhập: ");
                    controller.inDanhSachMuonSach();
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    System.exit(0);
            }
        } while (true);
    }

    private static int check() {
        System.out.println("--------Quản lý mượn sách thư viện--------");
        System.out.println("1.Nhập danh đầu sách mới.In ra danh sách hiện có");
        System.out.println("2.Nhập danh bạn đọc mới. In ra danh sách hiện có");
        System.out.println("3.Quản lý mượn sách cho từng bạn đọc");
        System.out.println("4.Sắp xếp theo tên bạn đọc");
        System.out.println("5.Sắp xếp theo số lượng mượn giảm dần");
        System.out.println("6.Tìm kiếm và hiển thị danh sách theo tên bạn đọc");
        System.out.println("7.Thoát");
        int check;
        do {
            check = new Scanner(System.in).nextInt();
            if (check < 1 || check > 7) {
                System.out.print("Vui lòng chọn từ 1 -7: ");
            }
            break;
        } while (true);
        return check;
    }
}