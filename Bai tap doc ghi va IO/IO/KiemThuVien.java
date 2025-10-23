package IO;

public class KiemThuVien extends NhanVien {

    private double phuCap;

    public KiemThuVien(String maNV, String ten, double luongCoBan, double phuCap) {
        super(maNV, ten, luongCoBan);
        this.phuCap = phuCap;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + phuCap;
    }

    @Override
    public String toString() {
        return "KiemThuVien{" +
                "maNV='" + maNV + '\'' +
                ", ten='" + ten + '\'' +
                ", luongCoBan=" + luongCoBan +
                ", phuCap=" + phuCap +
                ", tongLuong=" + tinhLuong() +
                '}';
    }
}
