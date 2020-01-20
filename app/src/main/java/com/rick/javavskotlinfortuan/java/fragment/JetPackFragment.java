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

public class JetPackFragment extends ProductFragment {

    public JetPackFragment(int productIdx, int productPic, String productName) {
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
        if (instance == null) instance = new JetPackFragment(2, R.drawable.jetpack, "Google AAD證照暨Jetpack軟體應用實務開發");
        return instance;
    }
}

