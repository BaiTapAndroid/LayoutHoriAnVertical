package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import book.adapter_18093421_LeVanTai.MyBookAdapter;


public class MyCategoryAdapter extends RecyclerView.Adapter<MyCategoryAdapter.MyHolderView> {

    private List<Category> listCategory;
    private Context context;
    public MyCategoryAdapter(Context context,List<Category> listCategory){
        this.context=context;
     this.listCategory = listCategory;
    }
//    public void setData(List<Category> listCategory)
//    {
//        this.listCategory = listCategory;
//        notifyDataSetChanged();
//    }
    @NonNull
    @Override
    public MyHolderView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_category, parent, false);
        return new MyHolderView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolderView holder, int position) {
        Category category = listCategory.get(position);
        holder.txtCategory.setText(category.getNameCategory());
        MyBookAdapter myBookAdapter = new MyBookAdapter(context,category.getNameArrayCategory());
       // myBookAdapter.setData(category.getNameArrayCategory());
        holder.rcv_line.setAdapter(myBookAdapter);
        holder.rcv_line.setLayoutManager(new LinearLayoutManager(context, RecyclerView.HORIZONTAL, false));

    }

    @Override
    public int getItemCount() {
        if (listCategory==null)
        return 0;
        return listCategory.size();
    }

    public class MyHolderView extends  RecyclerView.ViewHolder{
        private TextView txtCategory;
        private RecyclerView rcv_line;
        public MyHolderView(@NonNull View itemView) {
            super(itemView);
            txtCategory = itemView.findViewById(R.id.txtCategory);
            rcv_line = itemView.findViewById(R.id.rcv_line);
        }
    }
}
