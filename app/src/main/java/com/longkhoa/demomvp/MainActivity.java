package com.longkhoa.demomvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.longkhoa.demomvp.XuLyDangNhap.PresenterLogicXuLyDangNhap;
import com.longkhoa.demomvp.XuLyDangNhap.ViewXuLyDangNhap;

public class MainActivity extends AppCompatActivity implements ViewXuLyDangNhap {

    // tổ chúc thư mục theo hướng chức năng
    // 2 interface View,presenter

    Button btndongy;
   public static EditText edttendangnhap,edtmk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btndongy = findViewById(R.id.btndongy);
        edttendangnhap = findViewById(R.id.edttendangnhap);
        edtmk = findViewById(R.id.edtmk);

        final PresenterLogicXuLyDangNhap presenterLogicXuLyDangNhap = new PresenterLogicXuLyDangNhap(this);

        btndongy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tendangnhap = edttendangnhap.getText().toString();
                String mk = edtmk.getText().toString();

                presenterLogicXuLyDangNhap.kiemTraDangNhap(tendangnhap,mk);
            }
        });

    }


    @Override
    public void dangNhapThanhCong(String thongBaoLayTenDangNhap) {
        Toast.makeText(this, "Đăng Nhập Thành Công " + thongBaoLayTenDangNhap , Toast.LENGTH_SHORT).show();
    }

    @Override
    public void dangNhapThatBai() {
        Toast.makeText(this, "Đăng nhập thất bại", Toast.LENGTH_SHORT).show();
    }
}
