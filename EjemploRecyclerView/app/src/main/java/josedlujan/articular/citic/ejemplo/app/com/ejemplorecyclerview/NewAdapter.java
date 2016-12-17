package josedlujan.articular.citic.ejemplo.app.com.ejemplorecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jose on 13/12/16.
 */

public class NewAdapter extends RecyclerView.Adapter<NewAdapter.ViewHolder> {


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
