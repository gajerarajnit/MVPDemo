package mvpdemo.rajnit.com.mvpblogdemo.view.activities;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import mvpdemo.rajnit.com.mvpblogdemo.R;
import mvpdemo.rajnit.com.mvpblogdemo.presenter.MainPresenter;
import mvpdemo.rajnit.com.mvpblogdemo.presenter.Presenter;
import mvpdemo.rajnit.com.mvpblogdemo.view.activities.views.MainActivityView;

public class MainActivity extends AbstractActivity implements MainActivityView {

    ImageView imgBack;
    Button btnAddNote;
    EditText edtNote;
    RecyclerView recyclerViewNote;

    MainPresenter mPresenter = new MainPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgBack = findViewById(R.id.imgBack);
        btnAddNote = findViewById(R.id.btnAddNote);
        edtNote = findViewById(R.id.edtNote);
        recyclerViewNote = findViewById(R.id.recyclerViewNote);

        initListener();

    }

    @Override
    Presenter getPresenter() {
        return mPresenter;
    }

    private void initListener() {
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnAddNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!TextUtils.isEmpty(edtNote.getText().toString())){

                }else
                {

                }
            }
        });
    }


    @Override
    public void showLoginActivity() {

    }

    @Override
    public void finishActivity() {

    }
}
