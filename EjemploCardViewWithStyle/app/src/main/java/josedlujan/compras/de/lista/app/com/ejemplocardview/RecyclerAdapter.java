package josedlujan.compras.de.lista.app.com.ejemplocardview;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jose on 14/12/15.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
  List<User> users;
    Context context;
    int lastPosition = -1;

    public RecyclerAdapter(List<User> users, Context context){
        this.users = users;
        this.context = context;

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        ViewHolder viewHolder  = new ViewHolder(v);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.title.setText(users.get(position).title);
        holder.twitter.setText(users.get(position).twitter);
        holder.image.setImageResource(users.get(position).photoID);

        setAnimation(holder.cardView, position);
        //Animation animation = AnimationUtils.loadAnimation(context, R.anim.left);
        //animation.setDuration(500);
        //viewToAnimate.startAnimation(animation);
        //lastPosition = position;
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView){
        super.onAttachedToRecyclerView(recyclerView);

    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView title,twitter;
        public ImageView image;
        public CardView cardView;

        public ViewHolder(View itemView){
            super(itemView);
            cardView =  (CardView)itemView.findViewById(R.id.cardview);
            title = (TextView) itemView.findViewById(R.id.title);
            twitter = (TextView) itemView.findViewById(R.id.twitter);
            image = (ImageView) itemView.findViewById(R.id.image);
        }


    }


    private void setAnimation(View viewToAnimate, int position)
    {
        // If the bound view wasn't previously displayed on screen, it's animated
        if (position > lastPosition)
        {




            Animation animation = AnimationUtils.loadAnimation(context, R.anim.left);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        }
    }
}
