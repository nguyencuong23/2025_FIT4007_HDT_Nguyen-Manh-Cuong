import java.util.InputMismatchException;
import java.util.Scanner;

class TaiKhoanNganHang {
    private String soTaiKhoan;
    private String tenChuKhoan;
    private double soDu;

    public TaiKhoanNganHang(String soTaiKhoan, String tenChuKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuKhoan = tenChuKhoan;
        this.soDu = soDu;
    }

    public void guiTien(double soTien) throws Exception {
        if (soTien <= 0) throw new Exception("Số tiền gửi phải lớn hơn 0.");
        soDu += soTien;
        System.out.println("Đã gửi " + soTien + " vào tài khoản.");
    }

    public void rutTien(double soTien) throws Exception {
        if (soTien <= 0) throw new Exception("Số tiền rút phải lớn hơn 0.");
        if (soTien > soDu) throw new Exception("Số dư không đủ để rút.");
        soDu -= soTien;
        System.out.println("Đã rút " + soTien + " từ tài khoản.");
    }

    public void hienThiThongTin() {
        System.out.println("\nSố tài khoản: " + soTaiKhoan);
        System.out.println("Tên chủ khoản: " + tenChuKhoan);
        System.out.println("Số dư hiện tại: " + soDu);
    }
}

public class NgoaiLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaiKhoanNganHang tk = new TaiKhoanNganHang("987654321", "Nguyen Van A", 500000);
        int luaChon = -1;

        do {
            try {
                System.out.println("\n===== MENU NGÂN HÀNG =====");
                System.out.println("1. Gửi tiền");
                System.out.println("2. Rút tiền");
                System.out.println("3. Hiển thị thông tin");
                System.out.println("0. Thoát");
                System.out.print("Chọn: ");
                luaChon = sc.nextInt();

                switch (luaChon) {
                    case 1:
                        System.out.print("Nhập số tiền gửi: ");
                        tk.guiTien(sc.nextDouble());
                        break;
                    case 2:
                        System.out.print("Nhập số tiền rút: ");
                        tk.rutTien(sc.nextDouble());
                        break;
                    case 3:
                        tk.hienThiThongTin();
                        break;
                    case 0:
                        System.out.println("Tạm biệt");
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ!");
                }

            } catch (InputMismatchException e) {
                System.out.println("Lỗi nhập dữ liệu! Vui lòng nhập số hợp lệ.");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } while (luaChon != 0);

        sc.close();
    }
}
