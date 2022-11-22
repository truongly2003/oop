package phong;

import java.util.Scanner;

public class Phong {
    private String soPhong;
    private String loaiPhong;
    private String tinhTrang;
    private double giaTien;
    
    // tiện ghi
    Scanner sc = new Scanner(System.in);
    protected TienNghi TienNghi;
    public Phong()
    {
        soPhong=loaiPhong=tinhTrang=null;
        giaTien=0;
    }
    public Phong(String soPhong,String loaiPhong,String tinhTrang,double giaTien)
    {
        this.soPhong=soPhong;
        this.loaiPhong=loaiPhong;
        this.tinhTrang=tinhTrang;
        this.giaTien=giaTien;
    }
    public void setsoPhong(String soPhong)
    {
        this.soPhong=soPhong;
    }
    public String getsoPhong()
    {
        return soPhong;
    }

    public void setloaiPhong(String loaiPhong)
    {
        this.loaiPhong=loaiPhong;
    }
    public String getloaiPhong()
    {
        return loaiPhong;
    }

    public void settinhTrang(String tinhTrang)
    {
        this.tinhTrang=tinhTrang;
    }
    public String gettinhTrang()
    {
        return tinhTrang;
    }

    public void setgiaTien(double giaTien)
    {
        this.giaTien=giaTien;
    }
    public double getgiaTien()
    {
        return giaTien;
    }
    public void nhapPhong()
    {
        System.out.println("nhap so phong: ");
        sc.nextLine();
        System.out.println("nhap loai phong: ");
        sc.nextLine();
        System.out.println("nhap tinh trang: ");
        sc.nextLine();
        System.out.println("nhap gia tien: ");
        sc.nextInt();
    }
    public void xuat()
    {
        System.out.println("so phong la: "+soPhong);
        System.out.println("loai phong la: "+loaiPhong);
        System.out.println("tinh trang: "+tinhTrang);
        System.out.println("gia tien la: "+giaTien);
    }
    public void themphong()
    {

    }
    public void suaphong()
    {

    }
    public void xoaphong()
    {

    }
    public void timkiemphong()
    {
        
    }
    
}
