package ClassDiagram;

public class BinhLuan {
    private int id;
    public ThanhVien NguoiViet;
    public String NoiDung;

    public BinhLuan() {}
    
    public BinhLuan(int id, String NoiDung, ThanhVien NguoiViet) {
        this.id = id;
        this.NoiDung = NoiDung;
        this.NguoiViet = NguoiViet; 
    }

}
