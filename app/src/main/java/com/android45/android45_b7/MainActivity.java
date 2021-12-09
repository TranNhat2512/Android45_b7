package com.android45.android45_b7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.android45.android45_b7.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    RecyclerView rvRecommend, rvNew;
    FoodHomeAdater foodHomeAdater1, foodHomeAdater2;
    List<Food> foodListRecommended, foodListNew;
    Food food1, food2, food3, food4, food5, food6, food7, food8, food9, food10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        foodListRecommended = new ArrayList<>();
        foodListNew = new ArrayList<>();

        food1 = new Food("Food1", "100g", 10, 0,
                R.drawable.food1, R.drawable.ic_baseline_add2_24, R.drawable.ic_baseline_favorite_border_24);
        food2 = new Food("Food2", "120g", 10, 0,
                R.drawable.food2, R.drawable.ic_baseline_add2_24, R.drawable.ic_baseline_favorite_border_24);
        food3 = new Food("Food3", "150g", 10, 0,
                R.drawable.food3, R.drawable.ic_baseline_add2_24, R.drawable.ic_baseline_favorite_border_24);
        food4 = new Food("Food4", "80g", 10, 0,
                R.drawable.food4, R.drawable.ic_baseline_add2_24, R.drawable.ic_baseline_favorite_border_24);
        food5 = new Food("Food5", "106g", 10, 0,
                R.drawable.food5, R.drawable.ic_baseline_add2_24, R.drawable.ic_baseline_favorite_border_24);
        food6 = new Food("Food6", "160g", 10, 0,
                R.drawable.food6, R.drawable.ic_baseline_add2_24, R.drawable.ic_baseline_favorite_border_24);
        food7 = new Food("Food7", "90g", 10, 0,
                R.drawable.food7, R.drawable.ic_baseline_add2_24, R.drawable.ic_baseline_favorite_border_24);
        food8 = new Food("Food8", "220g", 10, 0,
                R.drawable.food8, R.drawable.ic_baseline_add2_24, R.drawable.ic_baseline_favorite_border_24);
        food9 = new Food("Food9", "210g", 10, 0,
                R.drawable.food9, R.drawable.ic_baseline_add2_24, R.drawable.ic_baseline_favorite_border_24);
        food10 = new Food("Food10", "200g", 10, 0,
                R.drawable.food10, R.drawable.ic_baseline_add2_24, R.drawable.ic_baseline_favorite_border_24);

        foodListRecommended.add(food1);
        foodListRecommended.add(food2);
        foodListRecommended.add(food3);
        foodListRecommended.add(food4);
        foodListRecommended.add(food5);
        foodListNew.add(food6);
        foodListNew.add(food7);
        foodListNew.add(food8);
        foodListNew.add(food9);
        foodListNew.add(food10);

        RecyclerView.LayoutManager layoutManager1 = new GridLayoutManager(getBaseContext(), 1,
                RecyclerView.HORIZONTAL, false);

        foodHomeAdater1 = new FoodHomeAdater(foodListRecommended);
        rvRecommend = findViewById(R.id.rvRecommend);
        rvRecommend.setLayoutManager(layoutManager1);
        rvRecommend.setAdapter(foodHomeAdater1);

        RecyclerView.LayoutManager layoutManager2 = new GridLayoutManager(getBaseContext(), 1,
                RecyclerView.HORIZONTAL, false);

        foodHomeAdater2 = new FoodHomeAdater(foodListNew);
        rvNew = findViewById(R.id.rvNew);
        rvNew.setLayoutManager(layoutManager2);
        rvNew.setAdapter(foodHomeAdater2);


//      home
        binding.tvHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        });


//      hiển thị trên fragment1
        binding.btnCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment1(CartFragment.newInstance());
            }
        });

        binding.tvChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment1(ChatFragment.newInstance());
            }
        });


//      hiển thị trên fragment2
        binding.imgUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment2(ProfileFragment.newInstance());
            }
        });


//        hiển thị trên fragment3
        binding.tvMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment3(MenuFragment.newInstance());
            }
        });

        binding.tvFavorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment3(FavoritesFragment.newInstance());
            }
        });


    }

    //    tạo hàm getFragment
    public void getFragment1(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.framentID1, fragment).commit();
    }

    public void getFragment2(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.framentID2, fragment).commit();
    }

    public void getFragment3(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.framentID3, fragment).commit();
    }
}