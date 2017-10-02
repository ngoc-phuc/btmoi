package example.com.btmoi;

/**
 * Created by Administrator on 27/09/2017.
 */

public class ThongTin {
    private String anh;
    private String tieude;
    private String noidung;

    public ThongTin(String anh, String tieude, String noidung) {
        this.anh = anh;
        this.tieude = tieude;
        this.noidung = noidung;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }
}
