package com.android45.android45_b7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodHomeAdater extends RecyclerView.Adapter<FoodHomeAdater.ViewHolder> {


    List<Food> foodList;

    public FoodHomeAdater(List<Food> foodList) {
        this.foodList = foodList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.icon_food_home, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);
        return  viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Food food = foodList.get(position);

        holder.tvNameIconHome.setText(food.getNameFood());
        holder.tvPriceIconHome.setText("$ "+String.valueOf(food.getPrice()));
        holder.imgImageIconHome.setImageResource(food.getImageFood());

    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNameIconHome, tvPriceIconHome;
        ImageView imgImageIconHome;
        ImageButton btnLike, btnAdd;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNameIconHome = itemView.findViewById(R.id.tvNameIconHome);
            tvPriceIconHome = itemView.findViewById(R.id.tvPriceIconHome);
            imgImageIconHome = itemView.findViewById(R.id.imgImageIconHome);
            btnAdd = itemView.findViewById(R.id.btnAdd);
            btnLike = itemView.findViewById(R.id.btnLike);
        }
    }
}
