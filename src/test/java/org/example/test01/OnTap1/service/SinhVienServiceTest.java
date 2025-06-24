package org.example.test01.OnTap1.service;

import org.example.test01.OnTap1.entity.SinhVien;
import org.example.test01.OnTap1.service.SinhVienService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class SinhVienServiceTest {

    private SinhVienService sinhVienService;

    @BeforeEach
    void setUp() {
        sinhVienService = new SinhVienService();
    }

    @Test
    void addWithValid() {
        SinhVien sinhVien = new SinhVien(1L, "PH5921" , "An" , 23 , 8.5F , 5 , "PTPM" );
        sinhVienService.add(sinhVien);
        assertEquals(1 , sinhVienService.getAll().size());
        assertEquals("An", sinhVienService.getOne(1L).get().getTen());
    }
    @Test
    void addWithNull() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> sinhVienService.add(null));
        assertEquals("Sinh viên không được để trống", exception.getMessage());

    }
    @Test
    void addWithInvalid() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> sinhVienService.add(new SinhVien(1L, "PH56921" , "" , 23 , 8.0F , 2 , "PTPM"  )));
        assertEquals("Tên không được để trống", exception.getMessage());
    }
    @Test
    void addWithInvalidTuoi() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> sinhVienService.add(new SinhVien(1L, "PH56921" , "AN" , 11 , 8.0F , 2 , "PTPM"  )));
        assertEquals("Tuổi phải lớn hơn 18", exception.getMessage());
    }

    @Test
    void getOneWithValid() {
        SinhVien sinhVien = new SinhVien(1L, "PH5921", "An", 23, 8.5F, 5, "PTPM");
        sinhVienService.add(sinhVien);

        assertEquals("An" , sinhVienService.getOne(1L).get().getTen());
        assertEquals(Optional.of(sinhVien), sinhVienService.getOne(1L));
    }
    @Test
    void getOneWithInValid() {
        SinhVien sinhVien = new SinhVien(1L, "PH5921", "An", 23, 8.5F, 5, "PTPM");
        sinhVienService.add(sinhVien);
        assertEquals(Optional.empty(), sinhVienService.getOne(10L));
    }
    @Test
    void updateWithValid() {
        SinhVien sinhVien = new SinhVien(1L, "PH5921" , "An" , 23 , 8.5F , 5 , "PTPM"  );
        sinhVienService.add(sinhVien);

        sinhVien.setTen("ASS");
        sinhVien.setTuoi(20);
        sinhVien.setDiemTrungBinh(9.0F);
        sinhVienService.update(sinhVien);

        assertEquals("ASS" , sinhVienService.getOne(1).get().getTen());
        assertEquals(20 , sinhVienService.getOne(1).get().getTuoi());
        assertEquals(9.0F , sinhVienService.getOne(1).get().getDiemTrungBinh());
    }

    @Test
    void updateWithNull() {
      Exception exception = assertThrows(IllegalArgumentException.class , () -> sinhVienService.update(null));
      assertEquals("Sinh Viên không dược để trống" , exception.getMessage());
    }
    @Test
    void updateWithInvalid() {
        SinhVien sinhVien = new SinhVien(1L, "PH5921" , "An" , 23 , 8.5F , 5 , "PTPM");
        sinhVienService.add(sinhVien);
        Exception exception = assertThrows(IllegalArgumentException.class , () -> sinhVienService.update(new SinhVien(2L , "PH5921" , "BOB" , 23 , 8.5F , 5 , "PTPM")));
        assertEquals("Sinh Viên có id 2 không tồn tại" , exception.getMessage());

    }
    @Test
    void updateWithInvalidTuoi() {
        SinhVien sinhVien = new SinhVien(1L, "PH5921" , "An" , 23 , 8.5F , 5 , "PTPM");
        sinhVienService.add(sinhVien);
        Exception exception = assertThrows(IllegalArgumentException.class , () -> sinhVienService.update(new SinhVien(1L , "PH5921" , "BOB" , 11 , 8.5F , 5 , "PTPM")));
        assertEquals("Tuổi phải lớn hơn 18" , exception.getMessage());
    }
    @Test
    void deleteWithValid() {
        SinhVien sinhVien = new SinhVien(1L, "PH5921", "An", 23, 8.5F, 5, "PTPM");
        sinhVienService.add(sinhVien);

        sinhVienService.delete(1L);

        assertEquals(0, sinhVienService.getAll().size());

    }
    @Test
    void deleteWithInValid() {
        SinhVien sinhVien = new SinhVien(1L, "PH5921", "An", 23, 8.5F, 5, "PTPM");
        sinhVienService.add(sinhVien);

        sinhVienService.delete(10L);

        assertFalse(sinhVienService.delete(10));
        assertEquals("An" , sinhVienService.getOne(1L).get().getTen());
    }

    @Test
    void getAll() {
        SinhVien sv1 = new SinhVien(1L, "PH5921", "An", 23, 8.5F, 5, "PTPM");
        SinhVien sv2 = new SinhVien(2L, "PH5922", "Bình", 24, 7.5F, 4, "LTMT");
        sinhVienService.add(sv1);
        sinhVienService.add(sv2);

        assertEquals(2, sinhVienService.getAll().size());
        assertEquals("An", sinhVienService.getAll().get(0).getTen());
        assertEquals("Bình", sinhVienService.getAll().get(1).getTen());
    }
}