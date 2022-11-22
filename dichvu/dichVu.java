package dichvu;

import java.util.Scanner;

public class dichVu {
    private String maDV;   
    private String tenDV;   
    private double giaDV;  
    Scanner sc = new Scanner(System.in); 
    public dichVu()
    {
        maDV=tenDV=null;
        giaDV=0;
    }
    public dichVu(String maDV,String tenDV,Double giaDV)
    {
        this.maDV=maDV;
        this.tenDV=tenDV;
        this.giaDV=giaDV;
    }
    public void setmaDV(String maDV)
    {
        this.maDV=maDV;
    }
    public String getmaDV()
    {
        return maDV;
    }

    public void settenDV(String tenDV)
    {
        this.tenDV=tenDV;
    }
    public String gettenDV()
    {
        return tenDV;
    }

    public void setgiaDV(Double giaDV)
    {
        this.giaDV=giaDV;
    }
    public double getgiaDV()
    {
        return giaDV;
    }
    public void nhapDV()
    {
        System.out.println("nhap ten dich vu: ");
        sc.nextLine();
        System.out.println("nhap ma dich vu: ");
        sc.nextLine();
        System.out.println("nhap gia dich vu: ");
        sc.nextDouble();
    }
    public void xuatDV()
    {
        System.out.println("ten dich vu"+tenDV);
        System.out.println("ma dich vu"+maDV);
        System.out.println("gia dich vu"+giaDV);
    }
    public void themDV()
    {
       
    }
    public void suaDV()
    {
        
    }
    public void xoaDV()
    {
        
    }
    public void chitietDV()
    {
        
    }
}
