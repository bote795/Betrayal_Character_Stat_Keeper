package io.github.bote795.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;


public class ChooseCharacter  extends ActionBarActivity {
    private final String LOG_TAG = ChooseCharacter.class.getSimpleName();

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_character);
        String[] foods = Db.NAMES;

        ListAdapter characterAdapter = new customAdapter(this, foods);

        ListView characterListView = (ListView) findViewById(R.id.characterListView);
        characterListView.setAdapter(characterAdapter);

        characterListView.setOnItemClickListener(

                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent,View view, int position, long id){
                        String food = String.valueOf(parent.getItemAtPosition(position));
                        Intent i = new Intent(getBaseContext(), DisplayData.class);
                        i.putExtra("index", position);
                        startActivity(i);
                    }
                }
        );
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem item= menu.findItem(R.id.action_settings);
        item.setVisible(false);
        return super.onPrepareOptionsMenu(menu);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_choose_character, menu);
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
