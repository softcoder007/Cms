package com.example.cms.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.support.v4.app.Fragment;

import com.example.cms.R;

public class PoliceFrag extends Fragment {
    View v;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v =inflater.inflate(R.layout.policefragment,container,false);
        return v;
    }
}
