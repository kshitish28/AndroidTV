package com.kshitish.ozel.movieparadise.ui.detail;

import androidx.leanback.widget.Presenter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kshitish.ozel.movieparadise.R;
import com.kshitish.ozel.movieparadise.data.models.MovieDetails;


public class DetailDescriptionPresenter extends Presenter {

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_detail, parent, false);
        return new DetailViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, Object item) {
        MovieDetails movieDetails = (MovieDetails) item;
        DetailViewHolder holder = (DetailViewHolder) viewHolder;
        holder.bind(movieDetails);
    }

    @Override
    public void onUnbindViewHolder(ViewHolder viewHolder) {}
}
