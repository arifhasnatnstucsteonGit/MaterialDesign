package materialdesign.android.hasnat.arif.com.materialdesign.Adapter;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import materialdesign.android.hasnat.arif.com.materialdesign.R;

/**
 * Created by Arif on 22/01/2016.
 */
public class BirdHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView textView;


    public BirdHolder(View itemView) {
        super(itemView);
        imageView=(ImageView) itemView.findViewById(R.id.imageBird);



    }
}
