package vd;
import java.util.Scanner;

public class TheLoai implements INhap, IXuat{
    private Scanner sc = new Scanner(System.in);
    private String maTheLoai;
    private String tenTheLoai;

    public TheLoai(String maTacGia, String tenTheLoai) {
        this.maTheLoai = maTacGia;
        this.tenTheLoai = tenTheLoai;
    }

    public TheLoai() {
        this.maTheLoai = "";
        this.tenTheLoai = "";
    }

    public String getMaTheLoai() {
        return this.maTheLoai;
    }
    
    public void setMaTheLoai(String maTheLoai) {
        this.maTheLoai = maTheLoai;
    }

    public String getTenTheLoai() {
        return this.tenTheLoai;
    }

    public void setTenTheLoai(String tenTheLoai) {
        this.tenTheLoai = tenTheLoai;
    }

    @Override
    public void nhap()
    {        
        while(true) {
            System.out.print("Nhap ma the loai: ");
            String ma = sc.nextLine().toUpperCase();
            
            TheLoai[] danhSachTheLoai = DanhSachTheLoai.getDanhSachTheLoai();
            boolean isHas = false;

            for (TheLoai pb : danhSachTheLoai) {
                if (pb.getMaTheLoai().compareTo(ma) == 0) {
                    isHas = true;
                    break;
                }
            }
            
            if (!isHas) {
                this.maTheLoai = ma;
                break;
            }
            
            System.out.println("Ma the loai da ton tai moi nhap lai!!");
        }
        
        System.out.print("Ten the loai: ");
        this.tenTheLoai = sc.nextLine();
    }

    @Override
    public void xuat()
    {
        System.out.format("| %7s | %40s |\n", this.maTheLoai, this.tenTheLoai);
    }
}
