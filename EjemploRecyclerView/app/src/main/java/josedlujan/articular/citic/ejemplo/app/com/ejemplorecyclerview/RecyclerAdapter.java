package josedlujan.articular.citic.ejemplo.app.com.ejemplorecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by jose on 26/10/15.
 */


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private String[] myData;

    public RecyclerAdapter(String[] Data){
    myData = Data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) { // CREAR LOS NUEVOS OBJETOS VIEWHOLDER
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {  //ENCARGADO DE ACTUALIZAR LOS DATOS DE UN VIEWHOLDER EXISTENTE
        holder.textView.setText(myData[position]);
    }

    @Override
    public int getItemCount() { //INDICA EL NUMERO DE ELEMENTOS DE LA COLECCION
        return myData.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textView;
        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.title);
        }
    }
}
