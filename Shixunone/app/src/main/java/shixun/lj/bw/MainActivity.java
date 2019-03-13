package shixun.lj.bw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {

    private EditText name;
    private EditText pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        pwd = findViewById(R.id.pwd);
        findViewById(R.id.login).setOnClickListener(this);
        findViewById(R.id.reg).setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login:
                String name1 = name.getText().toString();
                String pwd1 = pwd.getText().toString();
                startActivity(new Intent(MainActivity.this, Showactivity.class));
                Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
                finish();
                break;
            case R.id.reg:

                break;
        }

    }
}
