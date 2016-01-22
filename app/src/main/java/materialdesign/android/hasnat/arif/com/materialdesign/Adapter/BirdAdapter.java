package materialdesign.android.hasnat.arif.com.materialdesign.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Collections;
import java.util.List;

import materialdesign.android.hasnat.arif.com.materialdesign.Model.BirdModel;
import materialdesign.android.hasnat.arif.com.materialdesign.R;

/**
 * Created by Arif on 22/01/2016.
 */
public class BirdAdapter extends RecyclerView.Adapter<BirdHolder> {

    private LayoutInflater mLayoutInflater;
    List<BirdModel> birdModels= Collections.emptyList();
    Context context;


    public BirdAdapter(Context context,List<BirdModel> birdModels) {

        this.context=context;
        this.birdModels = birdModels;


    }

    @Override
    public BirdHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mLayoutInflater= LayoutInflater.from(parent.getContext());
        View view=mLayoutInflater.inflate(R.layout.bird_row_items,parent,false);
        BirdHolder birdHolder=new BirdHolder(view);
        return birdHolder;
    }

    @Override
    public void onBindViewHolder(BirdHolder holder, int position) {

        BirdModel birdModel=birdModels.get(position);
        holder.imageView.setImageResource(birdModel.iconId);
        holder.textView.setText(birdModel.title);

    }

    @Override
    public int getItemCount() {
        return birdModels.size();
    }
}
