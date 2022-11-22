package dichvu;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // int n;
        Scanner sc=new Scanner(System.in);
        ArrayList<dichVu> dsdv=new ArrayList<>();
        System.out.println("nhap so luong dich vu: ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++)
        {
            dichVu dv= new dichVu();
            System.out.println("nhap dich vu thu: "+(i+1)+":");
            dv.nhapDV();
            dsdv.add(dv);
        }
        for(int i=0;i<dsdv.size();i++)
        {
            System.out.println("\n thong tin dich vu thu: "+(i+1)+":");
            dsdv.get(i).xuatDV();
        }
    }
}
