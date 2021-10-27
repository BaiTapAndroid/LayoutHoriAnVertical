package book.adapter_18093421_LeVanTai;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.List;

public class MyBookAdapter extends RecyclerView.Adapter<MyBookAdapter.MyViewHolder> {

    private List<Book> bookArray;
    private Context context;
    public MyBookAdapter(Context context, List<Book> bookArray){
        this.context = context;
        this.bookArray = bookArray;
    }
//    public void setData(List<Book> bookArray)
//    {
//        this.bookArray = bookArray;
//        notifyDataSetChanged();
//    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_book, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Book book =bookArray.get(position);
        holder.txtTitleBook.setText(book.getTitle());
        holder.imageViewBook.setImageResource(book.getImages());
    }

    @Override
    public int getItemCount() {
        if (bookArray!=null)
        return bookArray.size();
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView txtTitleBook;
        ImageView imageViewBook;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitleBook = itemView.findViewById(R.id.txtTitleBook);
            imageViewBook = itemView.findViewById(R.id.imageViewBook);
        }
    }
}
