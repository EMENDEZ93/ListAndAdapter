package app.fire.em.listandadapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import app.fire.em.listandadapter.model.Estudiante;

public class EstudiantesAdapter extends RecyclerView.Adapter<EstudiantesAdapter.ViewHolder> {

    private static List<Estudiante> items;
    private Context context;
    private MainActivity mainActivity;


    public EstudiantesAdapter(List<Estudiante> items, Context context, MainActivity mainActivity){
        this.items = items;
        this.context = context;
        this.mainActivity = mainActivity;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_estudiante, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Estudiante estudiante = items.get(position);
        holder.nombre.setText(estudiante.getNombre());
        holder.apellido.setText(estudiante.getApellido());
        holder.sexo.setText(estudiante.getSexo());
        holder.carrera.setText(estudiante.getCarrera());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView nombre;
        public TextView apellido;
        public TextView sexo;
        public TextView carrera;

        public ViewHolder(final View itemView) {
            super(itemView);
            nombre = (TextView) itemView.findViewById(R.id.nombre);
            apellido = (TextView) itemView.findViewById(R.id.apellido);
            sexo = (TextView) itemView.findViewById(R.id.sexo);
            carrera = (TextView) itemView.findViewById(R.id.carrera);

        }
    }

}
