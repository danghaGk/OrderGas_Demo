package android.hazardphan.ordergas;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by dangha.dev on 04/04/2017.
 */

public class CreateAcc extends AppCompatActivity {  EditText edtHoten, edtEmail, edtMatKhau, edtDiachi;
    Button btnDangky, btnHuy;
    Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_acc);
        toolbar = (Toolbar) findViewById(R.id.id_toolbarDangKy);
        toolbar.setTitleTextColor(Color.WHITE);
        edtHoten = (EditText) findViewById(R.id.edt_hoTen);
        edtEmail = (EditText) findViewById(R.id.edt_email);
        edtMatKhau = (EditText) findViewById(R.id.edt_pass);
        edtDiachi = (EditText) findViewById(R.id.edt_diaChi);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);

    }

}
