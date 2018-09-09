package com.example.frankxu.socialconnect.view;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.frankxu.socialconnect.R;

/**
 * Created by frankxu on 2018-09-09.
 */

public class SnapchatDialogFragment extends Fragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dialog_snapchat, container, false);

        View signInBtn = view.findViewById(R.id.sign_in_btn);
        signInBtn.setOnClickListener(this);
        
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.sign_in_btn:
                break;
        }
    }
}
