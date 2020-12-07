package com.example.lcoworkoutapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class YogaAdapter extends RecyclerView.Adapter<YogaAdapter.YogaHolder> {
    private Context context;
    private String[] YogaName;
    private int[] yogaImageValue ={
            R.drawable.chakrasana,
            R.drawable.vajrasana,
            R.drawable.uttanasana,
            R.drawable.paschimottanasana,
            R.drawable.uthita_hasta_padangustasana,
            R.drawable.parighasana,
            R.drawable.parivritta_janu_sirsasana,
            R.drawable.parsvottanasana,
            R.drawable.natarajasana,
            R.drawable.pinch_mayurasana

    };

    public YogaAdapter(Context context){
        this.context = context;
        this.YogaName = context.getResources().getStringArray(R.array.yoga_name);
    }
    @NonNull
    @Override
    public YogaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new YogaHolder(LayoutInflater.from(context).inflate(R.layout.cell_yoga,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull YogaHolder holder, int position) {
        String currentYogaName = YogaName[position];
        holder.mTvYogaName.setText(currentYogaName);
        holder.mIvYogaImage.setImageResource(yogaImageValue[position]);
    }

    @Override
    public int getItemCount() {
        return YogaName.length;
    }

    public class YogaHolder extends RecyclerView.ViewHolder {
        private TextView mTvYogaName;
        private ImageView mIvYogaImage;

        public YogaHolder(@NonNull View itemView) {
            super(itemView);

            mTvYogaName = itemView.findViewById(R.id.tv_yoga_name);
            mIvYogaImage = itemView.findViewById(R.id.iv_yoga_image);
        }
    }
}
