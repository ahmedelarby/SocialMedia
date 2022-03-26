package com.test.socialmedia.Ui.Main;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.navigation.Navigation;

import com.test.socialmedia.Calls;
import com.test.socialmedia.Massage;
import com.test.socialmedia.Posts;
import com.test.socialmedia.R;

public class pageAdapter extends FragmentPagerAdapter {

    private int tabnambers;
    View view;
    public pageAdapter(@NonNull FragmentManager fm, int behavior, int tabs) {
        super(fm, behavior);
        this .tabnambers =tabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:

                return new Posts();
            case 1:
                return new Massage();
            case 2:
                return new Calls();
                default:
                    return null;


        }


    }

    @Override
    public int getCount() {
        return tabnambers;
    }
}
