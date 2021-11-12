package com.example.retrofitapisample.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofitapisample.Model.Photo;
import com.example.retrofitapisample.R;
import com.squareup.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CustomAdaper extends RecyclerView.Adapter<CustomAdaper.CustomViewHolder> {
    private List<Photo> dataList;
    private Context context;

    public CustomAdaper(List<Photo> dataList, Context context) {
        this.dataList = dataList;
        this.context = context;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder{
        TextView texttitle;
        ImageView image;
        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);

            texttitle=itemView.findViewById(R.id.text);
            image=itemView.findViewById(R.id.image);

        }
    }





    @NonNull
    @Override
    public CustomAdaper.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.recycler_item,parent,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdaper.CustomViewHolder holder, int position) {
        holder.texttitle.setText(dataList.get(position).getTitle());
        Picasso.Builder builder=new Picasso.Builder(context);
        builder.downloader(new OkHttp3Downloader(context));
        builder.build().load(dataList.get(position).getThumbnailUrl())
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
