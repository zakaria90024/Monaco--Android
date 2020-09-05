package com.copypasteit.monaco.HomeActivity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.copypasteit.monaco.R;

import org.sufficientlysecure.htmltextview.HtmlTextView;


public class ViewHolder extends RecyclerView.ViewHolder {
    TextView monako_name, monako_slug;
    HtmlTextView monako_detils;
    ImageView monako_image;
    View mView;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        mView = itemView;

        monako_name = itemView.findViewById(R.id.txt_title_id);
        monako_slug = itemView.findViewById(R.id.txt_details_id);
        monako_detils = itemView.findViewById(R.id.html_text);
        monako_image = itemView.findViewById(R.id.imageView2);

       itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mClickListener.onItemClick(v, getAdapterPosition());
           }
       });
    }
    private ViewHolder.ClickListener mClickListener;

    public interface ClickListener{
        void  onItemClick(View view, int position);
    }

    public void setOnClickListener(ViewHolder.ClickListener clickListener){
        mClickListener = clickListener;
    }


}
