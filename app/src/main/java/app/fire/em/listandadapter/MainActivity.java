package app.fire.em.listandadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import app.fire.em.listandadapter.model.Estudiante;

public class MainActivity extends AppCompatActivity {

    private EstudiantesAdapter estudiantesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView lista = (RecyclerView) findViewById(R.id.list_item);

        estudiantesAdapter = new EstudiantesAdapter( estudianteList(), getApplicationContext() , this );
        lista.setAdapter(estudiantesAdapter);
    }

    private List<Estudiante> estudianteList(){
        List<Estudiante> estudiantes = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            Estudiante estudiante1 = new Estudiante();
            estudiante1.setNombre("nombre " + i );
            estudiante1.setApellido("apellido " + i);
            estudiante1.setSexo("sexo " + i);
            estudiante1.setCarrera("Carrera " + i);
            estudiantes.add(estudiante1);
        }

        return estudiantes;
    }

}
