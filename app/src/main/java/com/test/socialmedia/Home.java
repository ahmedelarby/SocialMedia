package com.test.socialmedia;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.test.socialmedia.databinding.FragmentHomeBinding;


public class Home extends Fragment {
FragmentHomeBinding binding;


    public Home() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       binding = DataBindingUtil.inflate(inflater,R.layout.fragment_home,container,false);
        NavHostFragment navHostFragment =
                (NavHostFragment) getChildFragmentManager().findFragmentById(binding.navHostFragment.getId());
        NavController navController = navHostFragment.getNavController();
        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() {
            @Override
            public void onDestinationChanged(@NonNull NavController controller, @NonNull NavDestination destination, @Nullable Bundle arguments) {
                if (destination.getId()==R.id.createPost2)
                {
                    binding.BottomNavigation.setVisibility(View.GONE);

                }
                else {
                    binding.BottomNavigation.setVisibility(View.VISIBLE);

                }
            }
        });

        NavigationUI.setupWithNavController(binding.BottomNavigation,navController);






       return binding.getRoot();
    }

}