package x.miempresa.com.ejemploproyectoescuelait;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by jose on 12/12/16.
 */

public class TweetAdapter extends ArrayAdapter<Tweet> {
    Context context;
    int layoutResourceID;
    Tweet[] data = null;


    public TweetAdapter(Context context, int layoutResourceID, Tweet[] data) {
        super(context, layoutResourceID, data);
        this.context = context;
        this.layoutResourceID = layoutResourceID;
        this.data = data;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View row = convertView;
        TweetHolder holder = null;

        if(row==null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceID,parent,false);
            holder = new TweetHolder();
            holder.imageView = (ImageView)row.findViewById(R.id.imageView);
            holder.textView = (TextView)row.findViewById(R.id.textView);
            row.setTag(holder);

        }else{
            holder=(TweetHolder)row.getTag();

        }

        Tweet tweet = data[position];
        holder.textView.setText(tweet.title);
        holder.imageView.setImageResource(tweet.image);

        return row;


    }


    static class TweetHolder{
        ImageView imageView;
        TextView textView;
    }

}
