package com.test.socialmedia;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.navigation.Navigation;
import androidx.viewpager.widget.PagerAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.test.socialmedia.Ui.Main.pageAdapter;
import com.test.socialmedia.databinding.FragmentHomeAccountBinding;


public class HomeAccount extends Fragment {
FragmentHomeAccountBinding binding;
PagerAdapter adapter;


    public HomeAccount() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_home_account,container,false);
        adapter = new pageAdapter(getChildFragmentManager(), FragmentPagerAdapter
                .BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT,binding.tablayout.getTabCount());
        binding.viewpager.setAdapter(adapter);
        binding.tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                binding.viewpager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        binding.viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.tablayout));


        return binding.getRoot();
    }
}