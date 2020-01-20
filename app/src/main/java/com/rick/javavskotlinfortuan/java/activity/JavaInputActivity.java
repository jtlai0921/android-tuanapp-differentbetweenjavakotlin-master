package com.rick.javavskotlinfortuan.java.activity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.rick.javavskotlinfortuan.R;
import com.rick.javavskotlinfortuan.java.utils.EditTextUtil;
import com.rick.javavskotlinfortuan.java.vo.MyData;

public class JavaInputActivity extends AppCompatActivity {

    private static final String TAG = JavaInputActivity.class.getSimpleName();

    private EditText edName;
    private EditText edHeight;
    private EditText edWeight;
    private EditText edAge;
    private EditText edPhone;
    private EditText edProductName;
    private EditText edDate;
    private EditText edGender;

    private void findViews() {
        edName = findViewById(R.id.ed_name);
        edHeight = findViewById(R.id.ed_height);
        edWeight = findViewById(R.id.ed_weight);
        edAge = findViewById(R.id.ed_age);
        edPhone = findViewById(R.id.ed_phone);
        edProductName = findViewById(R.id.ed_productName);
        edDate = findViewById(R.id.ed_date);
        edGender = findViewById(R.id.ed_gender);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            MyData mData = (MyData) bundle.get("mData");
            Log.d(TAG, "onCreate: " + mData);
        }

        findViews();

        edName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                // code here...
            }
        });

        edHeight.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                // code here...
            }
        });

        edWeight.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                // code here...
            }
        });

        EditTextUtil.setOnTextChangeListener(edAge, text -> {
            // code here...
        });

        EditTextUtil.setOnTextChangeListener(edPhone, text -> {
            // code here...
        });

        EditTextUtil.setOnTextChangeListener(edProductName, text -> {
            // code here...
        });

        EditTextUtil.setOnTextChangeListener(edDate, text -> {
            // code here...
        });

        EditTextUtil.setOnTextChangeListener(edGender, text -> {
            // code here...
        });
    }


}
