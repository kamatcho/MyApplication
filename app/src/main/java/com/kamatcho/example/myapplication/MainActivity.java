package com.kamatcho.example.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void OnCliclButton(View view){
        double answer =0;

        EditText NumberOne = (EditText)findViewById(R.id.NumberOne);
        double a = Double.parseDouble(NumberOne.getText().toString());
        EditText NumberTwo = (EditText)findViewById(R.id.NumberTwo);
        double b = Double.parseDouble(NumberTwo.getText().toString());
        TextView Result = (TextView)findViewById(R.id.Result);
        Button Plus = (Button)findViewById(R.id.Plus);
        Button Min = (Button)findViewById(R.id.Min);
        Button Sub = (Button)findViewById(R.id.Sub);
        Button Div = (Button)findViewById(R.id.Div);

        if (view.getId()== R.id.Plus){
            answer = a + b ;
        } else if (view.getId()==R.id.Min){
            answer = a - b ;
        }else if (view.getId()== R.id.Sub){
            answer = a * b ;
        }else if (view.getId()== R.id.Div){
            answer = a / b ;
        }
        Result.setText(""+answer);
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
}
