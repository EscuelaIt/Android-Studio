package datos.preferencias.plataforma.cursos.escuela.it.ejemplopreferenciasdatos;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button boton;
    EditText editText;
    TextView textView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = (Button) findViewById(R.id.boton);
        editText = (EditText) findViewById(R.id.editText);
        textView = (TextView) findViewById(R.id.textView);


        SharedPreferences preferences = getSharedPreferences("preferencias",Context.MODE_PRIVATE);
        textView.setText(preferences.getString("pepito","lo que sea"));








        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dato = editText.getText().toString();
                SharedPreferences sharedPreferences = getSharedPreferences("preferencias", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("pepito",dato);
                editor.commit();
            }
        });

    }
}
