package josedlujan.compras.de.lista.app.com.ejemplocardview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerAdapter adapter;

    List<User> userList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

     

       recyclerView = (RecyclerView)findViewById(R.id.rv);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);


        initializeData();
        adapter = new RecyclerAdapter(userList,this);




        recyclerView.setAdapter(adapter);




       /* 2 columnas
        recyclerView = (RecyclerView)findViewById(R.id.rv);

        recyclerView.setHasFixedSize(true);

        GridLayoutManager glm = new GridLayoutManager(this,2);
        glm.setOrientation(LinearLayoutManager.VERTICAL);

      //  LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(glm);


        initializeData();
        adapter = new RecyclerAdapter(userList,this);




        recyclerView.setAdapter(adapter);

    */




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void initializeData() {
        userList = new ArrayList<>();
        userList.add(new User("Canada - Lago", "Este Texto es para probar solamente, Este Texto es para probar solamente, Este Texto es para probar solamente, Este Texto es para probar solamente,", R.drawable.paisaje1));
        userList.add(new User("Cancún - Playa", " Este Texto es para probar solamente, Este Texto es para probar solamente, Este Texto es para probar solamente, Este Texto es para probar solamente,", R.drawable.paisaje2));
        userList.add(new User("Europa - Montaña", " Este Texto es para probar solamente, Este Texto es para probar solamente, Este Texto es para probar solamente, Este Texto es para probar solamente,", R.drawable.paisaje3));
        userList.add(new User("Canada - Lago", "Este Texto es para probar solamente, Este Texto es para probar solamente, Este Texto es para probar solamente, Este Texto es para probar solamente,", R.drawable.paisaje1));
        userList.add(new User("Cancún - Playa", "Este Texto es para probar solamente, Este Texto es para probar solamente, Este Texto es para probar solamente, Este Texto es para probar solamente,", R.drawable.paisaje2));
        userList.add(new User("Europa - Montaña", "Este Texto es para probar solamente, Este Texto es para probar solamente, Este Texto es para probar solamente, Este Texto es para probar solamente,", R.drawable.paisaje3));
    }
}
