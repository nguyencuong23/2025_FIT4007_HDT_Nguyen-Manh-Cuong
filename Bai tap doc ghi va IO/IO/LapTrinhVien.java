package IO;

public class LapTrinhVien extends NhanVien {

    private double thuongThem;

    public LapTrinhVien(String maNV, String ten, double luongCoBan, double thuongThem) {
        super(maNV, ten, luongCoBan);
        this.thuongThem = thuongThem;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + thuongThem;
    }

    @Override
    public String toString() {
        return "LapTrinhVien{" +
                "maNV='" + maNV + '\'' +
                ", ten='" + ten + '\'' +
                ", luongCoBan=" + luongCoBan +
                ", thuongThem=" + thuongThem +
                ", tongLuong=" + tinhLuong() +
                '}';
    }
}
