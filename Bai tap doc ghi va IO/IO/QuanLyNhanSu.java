package IO;

import java.io.*; // TODO: Phai import de su dung cac lop trong java.io
import java.util.ArrayList;

public class QuanLyNhanSu {
    
    // ArrayList tu dong cung la Serializable roi
    private ArrayList<NhanVien> danhSach;

    public QuanLyNhanSu() {
        this.danhSach = new ArrayList<>();
    }
    
    // Ham tu Bai 12
    public void themNhanVien(NhanVien nv) {
        this.danhSach.add(nv);
    }
    
    // Ham tu Bai 12
    public void inDanhSach() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach rong!");
            return;
        }
        for (NhanVien nv : this.danhSach) {
            System.out.println("Ten: " + nv.getTen() + ", Luong: " + nv.tinhLuong());
        }
    }

    // TODO 2: Tao phuong thuc 'public void luuFile(String tenFile)'
    // Dung de luu toan bo danh sach nhan vien xuong file bang ObjectOutputStream
    public void luuFile(String tenFile) {
        // TODO: Su dung try-with-resources de tu dong dong file sau khi ket thuc
        try (FileOutputStream fos = new FileOutputStream(tenFile);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            
            // TODO 3: Goi phuong thuc 'writeObject()' de ghi
            // TOAN BO doi tuong 'danhSach' (ArrayList) xuong file
            oos.writeObject(this.danhSach);
            
            System.out.println("✅ Luu file thanh cong!");
            
        } catch (IOException e) {
            System.out.println("❌ Loi khi luu file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // TODO 4: Tao phuong thuc 'public void docFile(String tenFile)'
    // Dung de doc danh sach nhan vien tu file len bo nho chuong trinh
    public void docFile(String tenFile) {
        // TODO: Su dung try-with-resources de tu dong dong file sau khi ket thuc
        try (FileInputStream fis = new FileInputStream(tenFile);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            
            // TODO 5: Goi phuong thuc 'readObject()' de doc doi tuong tu file
            // Sau do EP KIEU (cast) ve 'ArrayList<NhanVien>'
            // roi gan lai cho 'this.danhSach'
            this.danhSach = (ArrayList<NhanVien>) ois.readObject();
            
            System.out.println("✅ Doc file thanh cong!");

        } catch (FileNotFoundException e) {
            System.out.println("⚠️ Khong tim thay file de doc! Tao danh sach moi.");
            this.danhSach = new ArrayList<>(); // Khoi tao danh sach rong neu file chua ton tai
        } catch (IOException | ClassNotFoundException e) {
            // TODO: Bat 2 loai Exception cung luc (IO + ClassNotFound)
            System.out.println("❌ Loi khi doc file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
