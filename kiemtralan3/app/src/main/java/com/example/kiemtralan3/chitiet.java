package com.example.kiemtralan3;

public class chitiet {
    private String tentacpham, noidungchitiet;

    public chitiet(String tentacpham, String noidungchitiet) {
        this.tentacpham = tentacpham;
        this.noidungchitiet = noidungchitiet;
    }

    public String getTentacpham() {
        return tentacpham;
    }

    public void setTentacpham(String tentacpham) {
        this.tentacpham = tentacpham;
    }

    public String getNoidungchitiet() {
        return noidungchitiet;
    }

    public void setNoidungchitiet(String noidungchitiet) {
        this.noidungchitiet = noidungchitiet;
    }
}
