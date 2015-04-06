package de.udos.democardlist;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;


public class CardViewItemAdapter extends RecyclerView.Adapter<CardViewItemAdapter.ViewHolder> {

    private Context mContext;
    private String[] mData;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        //private final TextView mTextView;
        //private final TextView mTextViewRating;

        public ViewHolder(View v) {

            super(v);
            //mTextView = (TextView) v.findViewById(R.id.text_view);
            //mTextViewRating = (TextView) v.findViewById(R.id.tv_rating);
        }
    }

    public CardViewItemAdapter(Context context, String[] data) {

        mContext = context;
        mData = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemRootView = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.cardview_item, parent, false);

        return new ViewHolder(itemRootView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        //holder.mTextView.setText(mData[position]);
        //holder.mTextViewRating.setText("85%");

        Animation anim = AnimationUtils.loadAnimation(mContext, android.R.anim.fade_in);
        anim.setStartOffset(200 * position);
        holder.itemView.startAnimation(anim);
    }

    @Override
    public int getItemCount() {
        return mData.length;
    }

}
