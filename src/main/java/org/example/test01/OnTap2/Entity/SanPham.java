package org.example.test01.OnTap2.Entity;

public class SanPham {
    private Integer id;
    private String ma;
    private String ten;
    private Integer namBaoHanh;
    private Float gia;
    private Integer soLuong;
    private String danhMuc;

    public SanPham(Integer id, String ma, String ten, Integer namBaoHanh, Float gia, Integer soLuong, String danhMuc) {
        this.id = id;
        setMa(ma);
        setTen(ten);
        setNamBaoHanh(namBaoHanh);
        setGia(gia);
        setSoLuong(soLuong);
        setDanhMuc(danhMuc);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        if(ma == null || ma.isEmpty()){
            throw new IllegalArgumentException("Mã không được để trống");
        }
        this.ma = ma;
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

    public Integer getNamBaoHanh() {
        return namBaoHanh;
    }

    public void setNamBaoHanh(Integer namBaoHanh) {
        if(namBaoHanh < 0 || namBaoHanh > 10){
            throw new IllegalArgumentException("Năm bảo hành không hợp lệ");
        }
        this.namBaoHanh = namBaoHanh;
    }

    public Float getGia() {
        return gia;
    }

    public void setGia(Float gia) {
        if(gia < 0){
            throw new IllegalArgumentException("Giá phải lớn hơn 0");
        }
        this.gia = gia;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        if(soLuong < 0){
            throw new IllegalArgumentException("Số lượng phải lớn hơn 0");
        }
        this.soLuong = soLuong;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        if(danhMuc == null || danhMuc.isEmpty()){
            throw new IllegalArgumentException("Danh mục không được để trống");
        }
        this.danhMuc = danhMuc;
    }
}
