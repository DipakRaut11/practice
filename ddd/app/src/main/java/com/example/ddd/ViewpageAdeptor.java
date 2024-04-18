package com.example.ddd;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewpageAdeptor extends FragmentPagerAdapter {
    public ViewpageAdeptor(@NonNull FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
      if (position == 0){
          return new Fragment();
      }
      else if (position == 1){
          return  new BlankFragment2();
      }
      else {
          return new BlankFragment3();
      }
    }

    @Override
    public int getCount() {
        return 3;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return
                    "Hey";
        }
        else if (position == 1){
            return  "Heeeeeeeee";
        }
        else {
            return "kkkkkkkkkkkkkkkkkkkkkk";
        }
    }
}
