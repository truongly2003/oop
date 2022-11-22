package vd;

import java.util.Arrays;
import java.util.Scanner;

public class DanhSachTheLoai {
    private static Scanner sc = new Scanner(System.in);
    private static int soLuongTheLoai = 0;
    private static TheLoai[] danhSachTheLoai = new TheLoai[0];

    public DanhSachTheLoai () {
    }

    public static int getSoLuongTheLoai() {
            return soLuongTheLoai;
    }
    public static TheLoai[] getDanhSachTheLoai() {
            return danhSachTheLoai;
    }
    
    private static void inMenuTheLoai() {
        System.out.println("================MENU The Loai=================");
        System.out.println("1. Xuat danh sach.");
        System.out.println("2. Them 1 the loai vao danh sach.");
        System.out.println("3. Xoa 1 the loai khoi danh sach.");
        System.out.println("4. Chinh sua 1 the loai trong danh sach.");
        System.out.println("5. Tim kiem cac the loai theo dieu kien.");
        System.out.println("6. Sap xep danh sach theo dieu kien.");
        System.out.println("==================0.EXIT==================");
        System.out.print("Moi ban nhap (0 - 6): ");
    }
    
    public static void handleTheLoai() {
        boolean isRunning = true;
        
        byte choose;
        while(isRunning) {
            inMenuTheLoai();
            try {
                choose = Byte.parseByte(sc.nextLine());
                switch (choose) {
                    case 0 -> {
                        isRunning = false;
                        break;
                    }
                    
                    case 1 -> {
                        DanhSachTheLoai.xuatDanhSach();
                        break;
                    }
                    
                    case 2 -> {
                        DanhSachTheLoai.add();
                        break;
                    }
                    
                    case 3 -> {
                        DanhSachTheLoai.remove();
                        break;
                    }
                    
                    case 4 -> {
                        DanhSachTheLoai.update();
                        break;
                    }
                    
                    case 5 -> {
                        DanhSachTheLoai.searchByCondition();
                        break;
                    }
                    
                    case 6 -> {
                        DanhSachTheLoai.sortByCondition();
                        break;
                    }
                    
                    default -> System.out.println("Ban nhap gia tri khong khop voi menu!!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ban da nhap sai format!!!");
            }
        }
    }

    public static void add() {
        System.out.println("--------------------------------------------------");
        System.out.println("Add");
        TheLoai tl = new TheLoai();
        tl.nhap();
        danhSachTheLoai = Arrays.copyOf(danhSachTheLoai, ++soLuongTheLoai);
        danhSachTheLoai[soLuongTheLoai - 1] = tl;
    }

    public static void add(TheLoai tl) {
        danhSachTheLoai = Arrays.copyOf(danhSachTheLoai, ++soLuongTheLoai);
        danhSachTheLoai[soLuongTheLoai - 1] = tl;
    }

    
    public static int isContainsInList(String maTheLoai) {
        int idx = -1;
        for (int i = 0; i < soLuongTheLoai; i++) {
            if (maTheLoai.compareToIgnoreCase(danhSachTheLoai[i].getMaTheLoai()) == 0) {
                return i;
            }
        }
        return idx;
    }
    
    public static void remove() {
        System.out.println("--------------------------------------------------");
        System.out.println("Remove");
        
        DanhSachTheLoai.xuatDanhSach();
        
        System.out.print("Nhap ma the loai: ");
        String maTheLoai = sc.nextLine();
        int idxRemove = isContainsInList(maTheLoai);
        if (idxRemove == -1) {
            System.out.println("Ma khong co trong danh sach!");
            return;
        }
        
        danhSachTheLoai[idxRemove] = danhSachTheLoai[soLuongTheLoai - 1];
        danhSachTheLoai = Arrays.copyOf(danhSachTheLoai, --soLuongTheLoai);
    }
    
    private static void inMenuUpdate() {
    	System.out.println("1. Thay doi ma the loai");
    	System.out.println("2. Thay doi ten the loai");
    	System.out.println("3. Thay doi tat ca");
    	System.out.println("0. Thoat");
    	System.out.print("Moi ban chon (0 - 3): ");
    }
    
    public static void update() {
        System.out.println("--------------------------------------------------");
        System.out.println("Update");
        
        DanhSachTheLoai.xuatDanhSach();
        
        System.out.print("Nhap ma the loai: ");
        String maTheLoai = sc.nextLine();
        
        int idxUpdate = isContainsInList(maTheLoai);
        if (idxUpdate == -1) {
            System.out.println("Ma khong co trong danh sach!");
            return;
        }
        
        boolean isChoosing = true;        
        while (isChoosing) {
            inMenuUpdate();
            try {
                byte choose = Byte.parseByte(sc.nextLine());
                switch (choose) {
                    case 0 -> {
                        isChoosing = false;
                        break;
                    }
                    
                    case 1 -> {
                        while(true) {
                            System.out.print("Nhap ma the loai: ");
                            String ma = sc.nextLine().toUpperCase();

                            boolean isHas = false;

                            for (TheLoai pb : danhSachTheLoai) {
                                if (pb.getMaTheLoai().compareTo(ma) == 0) {
                                    isHas = true;
                                    break;
                                }
                            }

                            if (!isHas) {
                                danhSachTheLoai[idxUpdate].setMaTheLoai(ma);
                                break;
                            }

                            System.out.println("Ma da ton tai moi nhap lai!!");
                        }
                        break;
                    }

                    case 2 -> {
                        System.out.print("Nhap ten the loai: ");
                        String tenTheLoai = sc.nextLine();
                        danhSachTheLoai[idxUpdate].setTenTheLoai(tenTheLoai);
                        break;
                    }
                    
                    case 3 -> {
                        while(true) {
                            System.out.print("Nhap ma the loai: ");
                            String ma = sc.nextLine().toUpperCase();

                            boolean isHas = false;

                            for (TheLoai pb : danhSachTheLoai) {
                                if (pb.getMaTheLoai().compareTo(ma) == 0) {
                                    isHas = true;
                                    break;
                                }
                            }

                            if (!isHas) {
                                danhSachTheLoai[idxUpdate].setMaTheLoai(ma);
                                break;
                            }

                            System.out.println("Ma da ton tai moi nhap lai!!");
                        }
                        
                        System.out.print("Nhap ten the loai: ");
                        String tenTheLoai = sc.nextLine();
                        danhSachTheLoai[idxUpdate].setTenTheLoai(tenTheLoai);
                        break;
                    }
                    
                    default -> System.out.println("Ban nhap khong hop le moi nhap lai!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ban nhap sai format!!!");
            }
        }
    }
    
    private static void inMenuSearch() {
    	System.out.println("1. Tim kiem theo ma the loai");
    	System.out.println("2. Tim kiem theo ten the loai");
    	System.out.println("0. Thoat");
    	System.out.print("Moi ban chon (0 - 2): ");
    }
    
    private static void searchByID() {
    	System.out.print("Nhap ma the loai: ");
    	String maTheLoai = sc.nextLine();
        
    	int idxUpdate = isContainsInList(maTheLoai);
    	if (idxUpdate == -1) {
            System.out.println("Ma khong co trong danh sach!");
            return;
    	}
    	danhSachTheLoai[idxUpdate].xuat();
    }
    
    private static void searchByName() {
    	System.out.print("Nhap ten the loai: ");
    	String tenTheLoai = sc.nextLine();
        
    	boolean flag = false;
    	for (TheLoai tl: danhSachTheLoai) {
            if (tl.getTenTheLoai().contains(tenTheLoai)) {
                tl.xuat();
                flag = true;
            }
        }
            
    	if (!flag) System.out.println("Khong ton tai the loai!");
    }
    
    public static void searchByCondition() {
    	System.out.println("--------------------------------------------------");
        System.out.println("Searh");
        
        boolean isChoosing = true;
        while (isChoosing) {
            inMenuSearch();
            try {
            	byte choose = Byte.parseByte(sc.nextLine());
            	switch (choose) {
                    case 0 -> {
                        isChoosing = false;
                        break;
                    }

                    case 1 -> {
                        searchByID();
                        break;
                    }

                    case 2 -> {
                        searchByName();
                        break;
                    }

                    default -> System.out.println("Ban nhap khong hop le moi nhap lai!!");
            	}
            }
            catch (NumberFormatException e) {
                System.out.println("Ban nhap sai format!!!");
            }
        }
    }
    
    private static void inMenuSort() {
        System.out.println("1. Sap xep theo ten the loai tang dan");
        System.out.println("0. Thoat");
        System.out.print("Moi ban chon (0 - 1): ");
    }
    
    private static void sapXepTheoTenTangDan() {
        for (int i = 0; i < danhSachTheLoai.length; i++)
            for (int j = i; j < danhSachTheLoai.length; j++)
                if (danhSachTheLoai[i].getTenTheLoai().compareTo(danhSachTheLoai[j].getTenTheLoai()) > 0) {
                    TheLoai tmp = danhSachTheLoai[i];
                    danhSachTheLoai[i] = danhSachTheLoai[j];
                    danhSachTheLoai[j] = tmp;
                }
    }
    
    public static void sortByCondition() {
        boolean isChoosing = true;
        while (isChoosing) {
            inMenuSort();
            try {
                byte choose = Byte.parseByte(sc.nextLine());
                switch (choose) {
                    case 0 -> {
                        isChoosing = false;
                        break;
                    }

                    case 1 -> {
                        sapXepTheoTenTangDan();
                        DanhSachTheLoai.xuatDanhSach();
                        break;
                    }

                    default -> System.out.println("Nhap khong hop le!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ban nhap sai format!!!");
            }
        }
    }
    
    public static void xuatDanhSach() {
        System.out.println("------------------------------------------------------");
        System.out.format("| %7s | %40s |\n", "Ma TL", "Ten The Loai");
        System.out.println("|----------------------------------------------------|");
        for (TheLoai tl : danhSachTheLoai) {
            tl.xuat();
        }
        System.out.println("------------------------------------------------------");
    }
}
