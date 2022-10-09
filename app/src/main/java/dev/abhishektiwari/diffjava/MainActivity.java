package dev.abhishektiwari.diffjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private HomeRecyclerAdapter recyclerAdapter;
    private Button btn_refresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_refresh = findViewById(R.id.btn_refresh);

        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerAdapter = new HomeRecyclerAdapter(new Contact().getContacts());
        recyclerView.setAdapter(recyclerAdapter);


        btn_refresh.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View view) {
                recyclerAdapter.updateContacts(new Contact(  ).getUpdateContacts());
            }
        });
    }
}