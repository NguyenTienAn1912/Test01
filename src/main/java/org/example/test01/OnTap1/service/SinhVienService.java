package org.example.test01.OnTap1.service;

import org.example.test01.OnTap1.entity.SinhVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SinhVienService {

    private List<SinhVien> sinhViens = new ArrayList<>();

    public void add(SinhVien sinhVien) {
        if(sinhVien == null){
            throw  new IllegalArgumentException("Sinh viên không được để trống");
        }
        sinhViens.add(sinhVien);
    }
    public Optional<SinhVien> getOne(long id){
        return sinhViens.stream().filter(sinhVien -> sinhVien.getId() == id).findFirst();
    }
    public void update(SinhVien sinhVien){
        if(sinhVien == null){
            throw  new IllegalArgumentException("Sinh Viên không dược để trống");
        }
        Optional<SinhVien> existingSinhVien = getOne(sinhVien.getId());
        if (existingSinhVien.isPresent()){
            sinhViens.set(sinhViens.indexOf(existingSinhVien.get()), sinhVien);
        }else {
            throw new IllegalArgumentException("Sinh Viên có id " + sinhVien.getId() + " không tồn tại");
        }
    }
    public boolean delete(long id){
        return sinhViens.removeIf(sinhVien -> sinhVien.getId() == id);
    }
    public List<SinhVien> getAll(){
        return new ArrayList<>(sinhViens);
    }
}
