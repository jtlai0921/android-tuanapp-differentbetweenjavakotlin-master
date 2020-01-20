package com.rick.javavskotlinfortuan.java.fragment;

import androidx.fragment.app.Fragment;

public class ProductFragment extends Fragment {

    protected int productIdx;
    protected int productPic;
    protected String productName;

    public ProductFragment(int productIdx, int productPic, String productName) {
        this.productIdx = productIdx;
        this.productPic = productPic;
        this.productName = productName;
    }

    public int getProductIdx() {
        return productIdx;
    }

    public int getProductPic() {
        return productPic;
    }

    public String getProductName() {
        return productName;
    }
}
