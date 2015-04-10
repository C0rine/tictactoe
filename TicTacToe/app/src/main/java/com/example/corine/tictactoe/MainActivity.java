package com.example.corine.tictactoe;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;


public class MainActivity extends ActionBarActivity {

    // Declare all elements
    private Button startNewGame;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private GridLayout grid;

    // Create counter to keep track of who's turn it is
    // If the turn value is an even number its O's turn, if its uneven it's X's turn
    // X always has the first turn
    Integer turn = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize all the elements
        startNewGame = (Button) findViewById(R.id.new_game);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        grid = (GridLayout) findViewById(R.id.grid);

        // Initially hide the grid for the game until the user presses 'Start new game'
        grid.setVisibility(View.GONE);
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

    // Reset all the buttons upon pressing start new game
    public void onStartNewGame(View view) {

        grid.setVisibility(View.VISIBLE);

        button1.setText("·");
        button2.setText("·");
        button3.setText("·");
        button4.setText("·");
        button5.setText("·");
        button6.setText("·");
        button7.setText("·");
        button8.setText("·");
        button9.setText("·");
    }

    // Change character in tic tac toe buttons depending on who's turn it is
    public void onClickButton1(View view) {

        if (turn%2 == 0 && button1.getText()=="·"){
            button1.setText("O");
            turn++;
        }
        else if (button1.getText()=="·"){
            button1.setText("X");
            turn++;
        }

    }

    // Repeating for all tic tac toe buttons...

    public void onClickButton2(View view) {

        if (turn%2 == 0 && button2.getText()=="·"){
            button2.setText("O");
            turn++;
        }
        else if (button2.getText()=="·"){
            button2.setText("X");
            turn++;
        }

    }

    public void onClickButton3(View view) {

        if (turn%2 == 0 && button3.getText()=="·"){
            button3.setText("O");
            turn++;
        }
        else if (button3.getText()=="·"){
            button3.setText("X");
            turn++;
        }

    }

    public void onClickButton4(View view) {

        if (turn%2 == 0 && button4.getText()=="·"){
            button4.setText("O");
            turn++;
        }
        else if (button4.getText()=="·"){
            button4.setText("X");
            turn++;
        }

    }

    public void onClickButton5(View view) {

        if (turn%2 == 0 && button5.getText()=="·"){
            button5.setText("O");
            turn++;
        }
        else if (button5.getText()=="·"){
            button5.setText("X");
            turn++;
        }

    }

    public void onClickButton6(View view) {

        if (turn%2 == 0 && button6.getText()=="·"){
            button6.setText("O");
            turn++;
        }
        else if (button6.getText()=="·"){
            button6.setText("X");
            turn++;
        }

    }

    public void onClickButton7(View view) {

        if (turn%2 == 0 && button7.getText()=="·"){
            button7.setText("O");
            turn++;
        }
        else if (button7.getText()=="·"){
            button7.setText("X");
            turn++;
        }

    }

    public void onClickButton8(View view) {

        if (turn%2 == 0 && button8.getText()=="·"){
            button8.setText("O");
            turn++;
        }
        else if (button8.getText()=="·"){
            button8.setText("X");
            turn++;
        }

    }

    public void onClickButton9(View view) {

        if (turn%2 == 0 && button9.getText()=="·"){
            button9.setText("O");
            turn++;
        }
        else if (button9.getText()=="·"){
            button9.setText("X");
            turn++;
        }

    }

}