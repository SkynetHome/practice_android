package com.mikevandusen.lovesarah;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class LoveSarah extends ActionBarActivity {

    public static final String TAG = LoveSarah.class.getSimpleName();

    private LoveNoteBook mLoveNoteBook = new LoveNoteBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love_sarah);

        //Declare View variables and assign them the views from the layout file
        final TextView noteLabel = (TextView) findViewById(R.id.noteTextView);
        final Button showNoteButon = (Button) findViewById(R.id.showNoteButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            public void onClick(View view) {
                String note = mLoveNoteBook.getQuote();
                //Updates the label with our dynamic fact change if you want to determine order
                noteLabel.setText(note);

                int color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showNoteButon.setTextColor(color);
            }
        };
        showNoteButon.setOnClickListener(listener);

        //Toast.makeText (this, "My activity was created", Toast.LENGTH_LONG).show();
        Log.d(TAG, "This is logging from the onCreate() method");

    }
}
