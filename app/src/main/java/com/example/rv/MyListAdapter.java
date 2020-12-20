package com.example.rv;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder>{


    private MyListData[] listData;


    public  MyListAdapter(MyListData[] listData)
    {
        this.listData=listData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listitem=layoutInflater.inflate(R.layout.list_item,parent,false);
        ViewHolder viewHolder=new ViewHolder(listitem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
           MyListData myListData = listData[position];
           holder.text.setText(listData[position].getDescripition());
           holder.img.setImageResource(listData[position].getImgid());
//         //  holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
//               @Override
//               public void onClick(View v) {
//                   Toast.makeText(v.getContext(), "Clicked", Toast.LENGTH_SHORT).show();
//               }
//           });
    }

    @Override
    public int getItemCount()
    {
        return listData.length;
    }

    public  static  class  ViewHolder extends RecyclerView.ViewHolder{

        public TextView text;
        public ImageView img;
        public RelativeLayout relativeLayout;
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            this.text=(TextView)itemView.findViewById(R.id.text);
            this.img= (ImageView)itemView.findViewById(R.id.imageview);
          //  this.relativeLayout=(RelativeLayout)itemView.findViewById(R.id.relativelayout);
        }
    }
}
