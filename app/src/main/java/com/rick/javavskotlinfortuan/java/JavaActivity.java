package com.rick.javavskotlinfortuan.java;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.rick.javavskotlinfortuan.R;
import com.rick.javavskotlinfortuan.java.activity.JavaInputActivity;
import com.rick.javavskotlinfortuan.java.fragment.JetPackFragment;
import com.rick.javavskotlinfortuan.java.fragment.OCAFragment;
import com.rick.javavskotlinfortuan.java.fragment.OCPFragment;
import com.rick.javavskotlinfortuan.java.fragment.ProductFragment;
import com.rick.javavskotlinfortuan.java.spec.Reportable;
import com.rick.javavskotlinfortuan.java.vo.MyData;
import com.rick.javavskotlinfortuan.others.MyGestureListener;

import java.text.SimpleDateFormat;

public class JavaActivity extends AppCompatActivity {

    private static final String TAG = JavaActivity.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        findViews();

        tvTitle.setText("歡迎瀏覽「段維瀚老師」線上課程");
        tvDate.setText(new SimpleDateFormat("yyyy/MM/dd").format(System.currentTimeMillis()));
        tvPs.setText("by Java");

        detector = new GestureDetector(this, new MyGestureListener() {

            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                float xDiff = e1.getX() - e2.getX();
                if (Math.abs(xDiff) > FLIP_DISTANCE) {
                    transFragmentPage(currentFragment.getProductIdx() + (int) (xDiff / Math.abs(xDiff)));
                    return true;
                } else return false;
            }
        });

        transFragmentPage(0);
    }

    private TextView tvTitle;
    private TextView tvDate;
    private TextView tvPs;
    private Button btnSubmit;

    private void findViews() {
        tvTitle = (TextView) findViewById(R.id.tv_title);
        tvDate = (TextView) findViewById(R.id.tv_date);
        tvPs = (TextView) findViewById(R.id.tv_ps);
        btnSubmit = (Button) findViewById(R.id.btn_submit);
    }

    private ProductFragment currentFragment;

    private void transFragmentPage(int idx) {
        switch (idx) {
            case 0:
                currentFragment = OCAFragment.getInstance();
                break;
            case 1:
                currentFragment = OCPFragment.getInstance();
                break;
            case 2:
                currentFragment = JetPackFragment.getInstance();
                break;
            default:
                return;
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.container, currentFragment).commit();
    }


    private GestureDetector detector;

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        ((Reportable) currentFragment).report(currentFragment.getClass().getSimpleName());

        if (currentFragment instanceof Reportable) {
            ((Reportable) currentFragment).report(currentFragment.getClass().getSimpleName());
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return detector.onTouchEvent(event);
    }

    public void onClick(View view) {
        MyData mData = getMyData(tvTitle.getText().toString(), tvDate.getText().toString(), tvPs.getText().toString(),
                currentFragment.getProductIdx(), currentFragment.getProductPic(), currentFragment.getProductName());

        Bundle bundle = new Bundle();
        bundle.putSerializable("mData", mData);
        startActivity(new Intent(this, JavaInputActivity.class).putExtras(bundle));
    }

    private MyData getMyData(
            String title, String data, String ps,
            int productIdx, int productPic, String productName,
            long currentTime, String tag) {
        return new MyData(title, data, ps, productIdx, productPic, productName, currentTime, tag);
    }

    private MyData getMyData(
            String title, String data, String ps,
            int productIdx, int productPic, String productName) {
        long currentTime = System.currentTimeMillis();
        String tag = TAG;
        return getMyData(title, data, ps, productIdx, productPic, productName, currentTime, tag);
    }

    private MyData getMyData(
            String title, String data, String ps,
            int productIdx, int productPic, String productName,
            long currentTime) {
        String tag = TAG;
        return getMyData(title, data, ps, productIdx, productPic, productName, currentTime, tag);
    }

    private MyData getMyData(
            String title, String data, String ps,
            int productIdx, int productPic, String productName,
            String tag) {
        long currentTime = System.currentTimeMillis();
        return getMyData(title, data, ps, productIdx, productPic, productName, currentTime, tag);
    }
}
