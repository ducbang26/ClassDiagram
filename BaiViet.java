package ClassDiagram;

public class BaiViet {
    private int id;
    public String TenBaiViet;
    ThanhVien tacgia;
    ChuDe chude;

    public BaiViet() {}
    
    public BaiViet(int id, String TenBaiViet, ThanhVien tacgia, ChuDe chude) {
        this.id = id;
        this.TenBaiViet = TenBaiViet;
        this.tacgia = tacgia;
        this.chude = chude;   
    }

    public ThanhVien getTacGia() {
        return tacgia;
    }

    public ChuDe getChude() {
        return chude;
    }
    
}
