package org.example.test01.OnTap2.Service;

import org.example.test01.OnTap2.Entity.SanPham;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SanPhamServiceTest {
    private SanPhamService sanPhamService;

    @BeforeEach
    void setUp() {
        sanPhamService = new SanPhamService();
    }

    @Test
    void addWithValid() {
        SanPham sanPham = new SanPham(1, "SP01" , "Laptop Dell" , 5 , 2000000F , 5 , "May Tinh");
        sanPhamService.add(sanPham);
        assertEquals(1 , sanPhamService.getAll().size());
        assertEquals("Laptop Dell", sanPhamService.getOne(1).get().getTen());
    }
    @Test
    void addWithNull(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> sanPhamService.add(null));
        assertEquals("Sản Phẩm Không được để trống", exception.getMessage());
    }
    @Test
    void addWithInvalidTen(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> sanPhamService.add(new SanPham(1, "SP01" , "" , 5 , 2000000F , 5 , "May Tinh")));
        assertEquals("Tên không được để trống", exception.getMessage());
    }
    @Test
    void getOne() {
    }

    @Test
    void updateWithValid() {
        SanPham sanPham = new SanPham(1, "SP01" , "Laptop Dell" , 5 , 2000000F , 5 , "May Tinh");
        sanPhamService.add(sanPham);

        sanPham.setTen("May Tinh Xach Tay Dell");
        sanPham.setSoLuong(8);
        sanPham.setNamBaoHanh(3);
        sanPhamService.update(sanPham);

        assertEquals("May Tinh Xach Tay Dell" , sanPhamService.getOne(1).get().getTen());
    }

    @Test
    void updateWithNull(){
        Exception exception = assertThrows(IllegalArgumentException.class , () -> sanPhamService.update(null));
        assertEquals("Sản phẩm không được để trống" , exception.getMessage());
    }
    @Test
    void updateWithInvalidSoLuong(){
        SanPham sanPham = new SanPham(1, "SP01" , "Laptop Dell" , 5 , 2000000F , 5 , "May Tinh");
        sanPhamService.add(sanPham);
        Exception exception = assertThrows(IllegalArgumentException.class , () -> sanPhamService.update(new SanPham(1, "SP01" , "Laptop Dell" , 5 , 2000000F , -2, "May Tinh")));
        assertEquals("Số lượng phải lớn hơn 0" , exception.getMessage());
    }
    @Test
    void deleteWithValid() {
        SanPham sanPham = new SanPham(1, "SP01" , "Laptop Dell" , 5 , 2000000F , 5 , "May Tinh");
        sanPhamService.add(sanPham);

        sanPhamService.delete(1);
        assertEquals(0 , sanPhamService.getAll().size());
    }

    @Test
    void deleteWithInvalid(){
        SanPham sanPham = new SanPham(1, "SP01" , "Laptop Dell" , 5 , 2000000F , 5 , "May Tinh");
        sanPhamService.add(sanPham);

        sanPhamService.delete(10);
        assertFalse(sanPhamService.delete(10));
        assertEquals("SP01" , sanPhamService.getOne(1).get().getMa());
    }
    @Test
    void getAll() {
        SanPham sp1 = new SanPham(1, "SP01" , "Laptop Dell" , 5 , 2000000F , 5 , "May Tinh");
        SanPham sp2 = new SanPham(2, "SP02" , "Laptop ASUS" , 5 , 3000000F , 5 , "LapTop");

        sanPhamService.add(sp1);
        sanPhamService.add(sp2);

        assertEquals(2 , sanPhamService.getAll().size());
        assertEquals("Laptop Dell" , sanPhamService.getOne(1).get().getTen());
        assertEquals("Laptop ASUS" , sanPhamService.getOne(2).get().getTen());

    }
}