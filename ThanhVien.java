package ClassDiagram;

public class ThanhVien extends NguoiDung{
    protected int id;
    public String username;
    protected String password;
    protected int quyen;

    public ThanhVien() {}
    
    public ThanhVien(int id, String username, String password, int quyen) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.quyen = quyen;
    }

    public void ThemBinhLuan() {
    }
    
    @Override 
    public void XemBaiViet() {
    }
}
