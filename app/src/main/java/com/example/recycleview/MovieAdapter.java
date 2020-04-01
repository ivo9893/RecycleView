package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    private List<Movie> movieList;

    public MovieAdapter(List<Movie> movies){
        this.movieList = movies;
    }

    @NonNull
    @Override
    public MovieAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.itm_recycler_view, parent, false);

        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.ViewHolder holder, int position) {

        final Movie movie = movieList.get(position);

        ImageView image = holder.image;
        image.setImageResource(movie.getImgID());

        TextView title = holder.title;
        title.setText(movie.getTitle());

        TextView length = holder.length;
        length.setText(movie.getLength());

        TextView genre = holder.genre;
        genre.setText(movie.getGenre());

        holder.itemView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Toast.makeText(v.getContext(), movie.getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView image;
        public TextView title;
        public TextView genre;
        public TextView length;

        public ViewHolder(View itemView){
            super(itemView);

            image = itemView.findViewById(R.id.picture);
            title = itemView.findViewById(R.id.tvTitle);
            genre = itemView.findViewById(R.id.genre);
            length = itemView.findViewById(R.id.length);

        }


    }


}
