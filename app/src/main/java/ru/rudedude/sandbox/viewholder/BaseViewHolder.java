package ru.rudedude.sandbox.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import ru.rudedude.sandbox.model.GithubRepo;

public abstract class BaseViewHolder extends RecyclerView.ViewHolder {

    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void bind(GithubRepo repo);
}
