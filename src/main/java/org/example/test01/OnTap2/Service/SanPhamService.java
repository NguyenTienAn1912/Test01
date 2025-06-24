package org.example.test01.OnTap2.Service;

import org.example.test01.OnTap1.entity.SinhVien;
import org.example.test01.OnTap2.Entity.SanPham;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SanPhamService {

    private final List<SanPham> sanPhamList = new ArrayList<>();

    public void add(SanPham sanPham){
        if(sanPham == null){
            throw new IllegalArgumentException("Sản Phẩm Không được để trống");
        }
        sanPhamList.add(sanPham);
    }

    public Optional<SanPham> getOne(Integer id){
        return sanPhamList.stream().filter(sanPham -> sanPham.getId() == id).findFirst();
    }
    public void update (SanPham sanPham){
        if(sanPham == null){
            throw new IllegalArgumentException("Sản phẩm không được để trống");
        }
        Optional<SanPham> existingSanPham = getOne(sanPham.getId());

        if(existingSanPham.isPresent()){
            sanPhamList.set(sanPhamList.indexOf(existingSanPham.get()) , sanPham);
        }else {
            throw new IllegalArgumentException("Sản phẩm có id " + sanPham.getId() + " không tồn tại");

        }

    }
    public boolean delete(Integer id){
        return sanPhamList.removeIf(sanPham -> sanPham.getId() == id);
    }
    public List<SanPham> getAll(){
        return new ArrayList<>(sanPhamList);
    }
}
