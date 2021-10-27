package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import book.adapter_18093421_LeVanTai.Book;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewTong;
    MyCategoryAdapter myCategoryAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewTong = findViewById(R.id.recyclerViewTong);
        myCategoryAdapter = new MyCategoryAdapter(MainActivity.this,getList());
        //myCategoryAdapter.setData(getList());
        recyclerViewTong.setAdapter(myCategoryAdapter);
        recyclerViewTong.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
    }
    public List<Category> getList()
    {
        List<Category> lstCategory = new ArrayList<>();
        List<Book> lstBook = new ArrayList<>();
        lstBook.add(new Book("Book1",R.drawable.sach1));
        lstBook.add(new Book("Book2",R.drawable.sach2));
        lstBook.add(new Book("Book3",R.drawable.sach3));
        lstBook.add(new Book("Book4",R.drawable.sach4));
        List<Book> lstBook1 = new ArrayList<>();
        lstBook1.add(new Book("Book5",R.drawable.sach5));
        lstBook1.add(new Book("Book6",R.drawable.sach6));
        lstBook1.add(new Book("Book7",R.drawable.sach7));
        lstBook1.add(new Book("Book8",R.drawable.sach8));

        lstCategory.add(new Category("Category1",lstBook1));
        lstCategory.add(new Category("Category2",lstBook));
        lstCategory.add(new Category("Category3",lstBook));
        lstCategory.add(new Category("Category4",lstBook1));
        return lstCategory;
    }
}