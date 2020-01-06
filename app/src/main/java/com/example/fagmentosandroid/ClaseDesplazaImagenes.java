package com.example.fagmentosandroid;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ClaseDesplazaImagenes extends FragmentPagerAdapter {

    public ClaseDesplazaImagenes(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new PerroFragment();
            case 1:
                return new GatoFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
