package io.github.bote795.myapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class DisplayData extends ActionBarActivity {
    private Integer speed_index;
    private Integer might_index;
    private Integer knowledge_index;
    private Integer sanity_index;
    private characters currentUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_data);
        Bundle UserData = getIntent().getExtras();
        if(UserData == null){
            return;
        }
        Db data = new Db();
        Integer position = UserData.getInt("index");
        currentUser= data.stats[position];

        //setting up age
        TextView age_TextView= (TextView) findViewById(R.id.age_textView);
        age_TextView.setText("Age: "+currentUser.AGE);

        //setting up height
        TextView height_TextView= (TextView) findViewById(R.id.height_textView);
        height_TextView.setText("Height: "+currentUser.HEIGHT);

        //setting up weight
        TextView weight_TextView= (TextView) findViewById(R.id.weight_textView);
        weight_TextView.setText("Weight: "+currentUser.WEIGHT);

        //setting up bday
        TextView bday_TextView= (TextView) findViewById(R.id.bday_textView);
        bday_TextView.setText("Birth Day: "+currentUser.BIRTHDAY);

        //setting up hobbies
        TextView hobbies_TextView= (TextView) findViewById(R.id.hobbies_textView);
        hobbies_TextView.setText("Hobbies: "+currentUser.HOBBIES);

        //setting up speed_textView
        TextView speed_TextView= (TextView) findViewById(R.id.speed_textView);
        speed_TextView.setText(currentUser.SPEED_VALUES[currentUser.SPEED_DEFAULT].toString() );
        speed_index=currentUser.SPEED_DEFAULT;

        //setting up might_textView
        TextView meight_TextView= (TextView) findViewById(R.id.might_textView);
        meight_TextView.setText(currentUser.MIGHT_VALUES[currentUser.MIGHT_DEFAULT].toString());
        might_index= currentUser.MIGHT_DEFAULT;

        //setting up knowledge_textView
        TextView knowledge_TextView= (TextView) findViewById(R.id.knowledge_textView);
        knowledge_TextView.setText(currentUser.KNOWLEDGE_VALUES[currentUser.KNOWLEDGE_DEFAULT].toString());
        knowledge_index = currentUser.KNOWLEDGE_DEFAULT;

        //setting up sanity_textView
        TextView sanity_TextView= (TextView) findViewById(R.id.sanity_textView);
        sanity_TextView.setText(currentUser.SANITY_VALUES[currentUser.SANITY_DEFAULT].toString());
        sanity_index = currentUser.SANITY_DEFAULT;

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display_data, menu);
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
    public void incSpeed(View view){
        speed_index++;
        if(speed_index > 7 )
            speed_index =7;
        else if (speed_index <0)
            speed_index=0;
        //setting up speed_textView
        TextView speed_TextView= (TextView) findViewById(R.id.speed_textView);
        speed_TextView.setText(currentUser.SPEED_VALUES[speed_index].toString() );

    }
    public void decSpeed(View view){
        speed_index--;
        if(speed_index > 7 )
            speed_index =7;
        else if (speed_index <0)
            speed_index=0;
        //setting up speed_textView
        TextView speed_TextView= (TextView) findViewById(R.id.speed_textView);
        speed_TextView.setText(currentUser.SPEED_VALUES[speed_index].toString() );
    }
    public void incMight(View view){
        might_index=increase(might_index);
        if(might_index > 7 )
            might_index =7;
        else if (might_index <0)
            might_index=0;
        //setting up speed_textView
        TextView speed_TextView= (TextView) findViewById(R.id.might_textView);
        speed_TextView.setText(currentUser.MIGHT_VALUES[might_index].toString() );

    }
    public void decMight(View view){
        might_index=decrease(might_index);

        //setting up speed_textView
        TextView speed_TextView= (TextView) findViewById(R.id.might_textView);
        speed_TextView.setText(currentUser.MIGHT_VALUES[might_index].toString() );
    }
    public void incKnowledge(View view){
        knowledge_index =increase(knowledge_index);
        //setting up speed_textView
        TextView speed_TextView= (TextView) findViewById(R.id.knowledge_textView);
        speed_TextView.setText(currentUser.MIGHT_VALUES[knowledge_index].toString() );

    }
    public void decKnowledge(View view){
        knowledge_index= decrease(knowledge_index);
        //setting up speed_textView
        TextView speed_TextView= (TextView) findViewById(R.id.knowledge_textView);
        speed_TextView.setText(currentUser.MIGHT_VALUES[knowledge_index].toString() );
    }
    public void incSanity(View view){
        sanity_index =increase(sanity_index);
        //setting up speed_textView
        TextView speed_TextView= (TextView) findViewById(R.id.sanity_textView);
        speed_TextView.setText(currentUser.SANITY_VALUES[sanity_index].toString() );

    }
    public void decSanity(View view){
        sanity_index= decrease(sanity_index);
        //setting up speed_textView
        TextView speed_TextView= (TextView) findViewById(R.id.sanity_textView);
        speed_TextView.setText(currentUser.SANITY_VALUES[sanity_index].toString() );
    }

    private Integer increase(int index){
        index++;
        if(index > 7 )
            return 7;
        else if (index <0)
            return 0;
        else
            return index;
    }
    private Integer decrease(int index){
        index--;
        if(index > 7 )
            return 7;
        else if (index <0)
            return 0;
        else
            return index;
    }
}
