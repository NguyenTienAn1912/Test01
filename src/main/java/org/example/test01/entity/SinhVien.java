package org.example.test01.entity;

public class SinhVien {
    private Long id;
    private String maSV;
    private String ten ;
    private Integer tuoi;
    private Float diemTrungBinh;
    private Integer kyHoc;
    private String chuyenNganh;

    public SinhVien(Long id, String maSV, String ten, Integer tuoi, Float diemTrungBinh, Integer kyHoc, String chuyenNganh) {
        this.id = id;
        setMaSV(maSV);
        setTen(ten);
        setTuoi(tuoi);
        setDiemTrungBinh(diemTrungBinh);
        setKyHoc(kyHoc);
        setChuyenNganh(chuyenNganh);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        if(maSV == null || maSV.isEmpty()){
            throw new IllegalArgumentException("Mã Sinh viên không được để trống");
        }
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if(ten == null || ten.isEmpty()){
            throw new IllegalArgumentException("Tên không được để trống");
        }
        this.ten = ten;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        if(tuoi <18){
            throw new IllegalArgumentException("Tuổi phải lớn hơn 18");
        }
        this.tuoi = tuoi;
    }

    public Float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(Float diemTrungBinh) {
        if(diemTrungBinh < 0 || diemTrungBinh >10){
            throw new IllegalArgumentException("Điểm trung bình không hợp lệ");
        }
        this.diemTrungBinh = diemTrungBinh;
    }

    public Integer getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(Integer kyHoc) {
        if(kyHoc < 0){
            throw new IllegalArgumentException("Kỳ học lớn hơn 0");
        }
        this.kyHoc = kyHoc;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        if(chuyenNganh == null || chuyenNganh.isEmpty()){
            throw new IllegalArgumentException("Chuyên ngành không được để trống");
        }
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id=" + id +
                ", maSV='" + maSV + '\'' +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", diemTrungBinh=" + diemTrungBinh +
                ", kyHoc=" + kyHoc +
                ", chuyenNganh='" + chuyenNganh + '\'' +
                '}';
    }
}
