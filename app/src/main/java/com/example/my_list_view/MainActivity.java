package com.example.my_list_view;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView myListView;
    String[] Console;
    String[] Price;
    String[] Developer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        myListView = (ListView) findViewById(R.id.myListview);
        Console = res.getStringArray(R.array.Console);
        Developer = res.getStringArray(R.array.Developer);
        Price = res.getStringArray(R.array.Price);

        ItemAdapter itemAdapter = new ItemAdapter(this,Console,Price,Developer);
        myListView.setAdapter(itemAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent showDetailActivity=new Intent(getApplicationContext(),DetailActivity.class);
                showDetailActivity.putExtra("com.example.my_list_view.ITEM_INDEX",i);
                startActivity(showDetailActivity);
            }
        });

    }
}
