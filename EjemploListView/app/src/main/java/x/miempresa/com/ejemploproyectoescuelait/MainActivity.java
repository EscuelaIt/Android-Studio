package x.miempresa.com.ejemploproyectoescuelait;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    ListView listView;
    TweetAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tweet tweets[]  = new Tweet[]{
            new Tweet(R.drawable.ic_launcher,"El primer tweet")  ,
                new Tweet(R.drawable.ic_launcher,"El primer tweet")  ,
                new Tweet(R.drawable.ic_launcher,"El segundo tweet")  ,
                new Tweet(R.drawable.ic_launcher,"El tercero tweet")  ,
                new Tweet(R.drawable.ic_launcher,"El cuarto tweet")  ,
                new Tweet(R.drawable.ic_launcher,"El quinto tweet")  ,
                new Tweet(R.drawable.ic_launcher,"El sexto tweet")  ,
                new Tweet(R.drawable.ic_launcher,"El septimo tweet")  ,
                new Tweet(R.drawable.ic_launcher,"El octavo tweet")  ,
                new Tweet(R.drawable.ic_launcher,"El noveno tweet")  ,
                new Tweet(R.drawable.ic_launcher,"El decimo tweet")  ,
                new Tweet(R.drawable.ic_launcher,"El primer tweet")  ,
                new Tweet(R.drawable.ic_launcher,"El primer tweet")  ,
                new Tweet(R.drawable.ic_launcher,"El primer tweet")  ,
                new Tweet(R.drawable.ic_launcher,"El primer tweet")  ,
                new Tweet(R.drawable.ic_launcher,"El primer tweet")  ,

        };

        adapter = new TweetAdapter(this,R.layout.listiview_item_row,tweets);

        listView = (ListView) findViewById(R.id.listview);
        View header = (View)getLayoutInflater().inflate(R.layout.list_header_row,null);
        listView.addHeaderView(header);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView texto = (TextView)view.findViewById(R.id.textView);
                Toast.makeText(getApplicationContext(),texto.getText(),Toast.LENGTH_SHORT).show();

            }
        });


    }
}
