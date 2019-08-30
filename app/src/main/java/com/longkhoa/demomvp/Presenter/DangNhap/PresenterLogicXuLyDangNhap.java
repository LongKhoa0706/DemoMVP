package com.longkhoa.demomvp.Presenter.DangNhap;

import com.longkhoa.demomvp.View.DangNhap.MainActivity;
import com.longkhoa.demomvp.View.DangNhap.ViewXuLyDangNhap;

public class PresenterLogicXuLyDangNhap implements PresenterImpXuLyDangNhap {
    ViewXuLyDangNhap viewXuLyDangNhap;

    public PresenterLogicXuLyDangNhap(ViewXuLyDangNhap viewXuLyDangNhap) {
        this.viewXuLyDangNhap = viewXuLyDangNhap;
    }

    @Override
    public void kiemTraDangNhap(String tenDangNhap, String mk) {
        // gọi tới model để lấy dữ liệu
        if (tenDangNhap.length() == 0 && mk.length() == 0) {
            // trả ra view đăng nhập thất bại
            viewXuLyDangNhap.dangNhapThatBai();
        } else {
            // trả ra view đăng nhập thành công
            viewXuLyDangNhap.dangNhapThanhCong(MainActivity.edttendangnhap.getText().toString());
        }
    }
}
