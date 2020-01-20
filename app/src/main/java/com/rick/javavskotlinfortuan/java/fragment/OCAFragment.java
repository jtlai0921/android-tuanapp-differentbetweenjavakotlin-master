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

public class OCAFragment extends ProductFragment implements Reportable {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);
        ((ImageView) view.findViewById(R.id.iv_pic)).setImageDrawable(getResources().getDrawable(productPic));
        ((TextView) view.findViewById(R.id.tv_ps)).setText(productName);
        return view;
    }

    private OCAFragment(int productIdx, int productPic, String productName) {
        super(productIdx, productPic, productName);
    }

    private static ProductFragment instance;

    public static ProductFragment getInstance() {
        if (instance == null) instance = new OCAFragment(0, R.drawable.ocaocp, "猛虎出柙 - Java 1z0-808原廠認證衝刺班");
        return instance;
    }
}
