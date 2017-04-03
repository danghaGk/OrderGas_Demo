package android.hazardphan.ordergas;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by dangha.dev on 04/04/2017.
 */

public class Login_Activity extends AppCompatActivity implements View.OnClickListener{
    Context context;
    Button btnDangKy, btnDangNhap;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);
        btnDangKy  = (Button) findViewById(R.id.btn_dangKy);
        btnDangNhap = (Button) findViewById(R.id.btn_dangNhap);
        btnDangKy.setOnClickListener(this);
        btnDangNhap.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_dangNhap:
                Toast.makeText(getApplicationContext(),"Đăng Nhập",Toast.LENGTH_SHORT).show();
                //Code something
                break;
            case R.id.btn_dangKy:
                Intent intent = new Intent(getApplicationContext(),CreateAcc.class);
                startActivity(intent);
                break;
        }
    }
}
