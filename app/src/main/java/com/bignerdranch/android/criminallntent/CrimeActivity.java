package com.bignerdranch.android.criminallntent;

import android.support.v4.app.Fragment;

public class CrimeActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
