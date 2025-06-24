package org.example.test01.OnTap2.Utils;

public class MyUtils {
    public int tinhTongSoLe(int n) {
        int tong = 0;
        for (int i = 1; i <= n; i += 2) {
            tong += i;
        }
        return tong;
    }

    public void main(String[] args) {
        int n = 10;
        System.out.println("Tổng số lẻ từ 1 đến " + n + " là: " + tinhTongSoLe(n));
    }
}
