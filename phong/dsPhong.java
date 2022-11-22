package phong;

import java.util.ArrayList;

public class dsPhong {
    ArrayList<Phong> dsphong =new ArrayList<>();
    public dsPhong(ArrayList<Phong> dsPhong)
    {
        this.dsphong=dsPhong;
    }
    public dsPhong()
    {
        dsphong=null;
    }
   
    public void setdsPhong(ArrayList<Phong> dsphong)
    {
        this.dsphong=dsphong;
    }

    public ArrayList<Phong> getdsPhong(ArrayList<Phong> dsphong)
    {
        return dsphong;
    }
  
    public void addPhong(Phong phong)
    {
        dsphong.add(phong);
    }
}
