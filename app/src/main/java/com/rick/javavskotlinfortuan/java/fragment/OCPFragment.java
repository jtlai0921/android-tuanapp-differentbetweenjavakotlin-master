package com.rick.javavskotlinfortuan.java.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rick.javavskotlinfortuan.R;
import com.rick.javavskotlinfortuan.java.spec.Reportable;

public class OCPFragment extends ProductFragment implements Reportable {

    private OCPFragment(int productIdx, int productPic, String productName) {
        super(productIdx, productPic, productName);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);
        ((ImageView) view.findViewById(R.id.iv_pic)).setImageDrawable(getResources().getDrawable(productPic));
        ((TextView) view.findViewById(R.id.tv_ps)).setText(productName);
        return view;
    }

    private static ProductFragment instance;

    public static ProductFragment getInstance() {
        if (instance == null) instance = new OCPFragment(1, R.drawable.ocaocp, "猛虎出柙 - 邁向Java 8專業認證1z0-809");
        return instance;
    }
}
