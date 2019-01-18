package firstapp.com.myfirstgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1, button2,button3, button4, button5, button6, button7, button8, button9;
    static int getChance = 0;
    static Boolean someOneWon = false;
    static char c = 'X';
    static final char d = 'X';
    static final char b = 'O';
    static int totalClick = 0;
    static char a[] = new char[9];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);

        initializeA();


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getChance % 2 == 0){
                    button1.setText("X");
                    a[0] = 'X';
                    c = d;
                    getChance++;
                    button1.setClickable(false);


                }else{
                    button1.setText("O");
                    a[0] = 'O';
                    c = b;
                getChance++;
                button1.setClickable(false);

            }
                totalClick++;
            if(getAnswer(0, c))serverDown();

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getChance % 2 == 0){
                    button2.setText("X");
                    a[1] = 'X';c = d;
                    getChance++;
                    button2.setClickable(false);
                }else{
                    button2.setText("O");
                    a[1] = 'O';c = b;
                    getChance++;
                    button2.setClickable(false);
            }
                totalClick++;
            if(getAnswer(1, c))serverDown();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getChance % 2 == 0){
                    button3.setText("X");
                    a[2] = 'X';
                    getChance++;c = d;
                    button3.setClickable(false);
                }else{
                    button3.setText("O");
                    a[2] = 'O';c = b;
                    getChance++;
                    button3.setClickable(false);
            }
                totalClick++;
            if(getAnswer(2, c))serverDown();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getChance % 2 == 0){
                    button4.setText("X");
                    a[3] = 'X';
                    getChance++;c = d;
                    button4.setClickable(false);
                }else {
                    button4.setText("O");
                    getChance++;
                    a[3] = 'O';c = b;
                    button4.setClickable(false);
                }
                totalClick++;
                if(getAnswer(3, c))serverDown();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getChance % 2 == 0){
                    button5.setText("X");
                    getChance++;c = d;
                    a[4] = 'X';
                    button5.setClickable(false);
                }else{
                    button5.setText("O");
                getChance++;c = b;
                a[4] = 'O';
                button5.setClickable(false);
            }
            totalClick++;
            if(getAnswer(4, c))serverDown();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getChance % 2 == 0){
                    button6.setText("X");
                    getChance++;c = d;
                    a[5] = 'X';
                    button6.setClickable(false);
                }else{
                    button6.setText("O");
                getChance++;c = b;
                a[5] = 'O';
                button6.setClickable(false);
            }
                totalClick++;
            if(getAnswer(5, c))serverDown();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getChance % 2 == 0){
                    button7.setText("X");
                    getChance++;
                    a[6] = 'X';c = d;
                    button7.setClickable(false);
                }else{
                    button7.setText("O");
                    getChance++;
                    a[6] = 'O';c = b;
                    button7.setClickable(false);
            }
                totalClick++;
            if(getAnswer(6, c))serverDown();
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getChance % 2 == 0){
                    button8.setText("X");
                    getChance++;c = d;
                    a[7] = 'X';
                    button8.setClickable(false);
                }else{
                    button8.setText("O");
                    getChance++;c = b;
                    a[7] = 'O';
                    button8.setClickable(false);
            }
                totalClick++;
            if(getAnswer(7, c))serverDown();
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getChance % 2 == 0){
                    button9.setText("X");
                    getChance++;c = d;
                    a[8] = 'X';
                    button9.setClickable(false);
                }else{
                    button9.setText("O");
                    getChance++;c = b;
                    a[8] = 'O';
                    button9.setClickable(false);
            }
                totalClick++;
            if(getAnswer(8, c))serverDown();
            }
        });


        if(totalClick >= 8 && someOneWon == false){
            gameDrawnReset();
        }

    }

    private static Boolean getAnswer(int n, char c){

        Boolean b = false;
        if(totalClick <= 4)
            b = false;

        else {
            if(n == 0){
                if(a[1] == c && a[2] == c)b = true;
                else if(a[4] == c && a[8] == c)b = true;
                else if(a[3] == c && a[6] == c)b = true;
                else b = false;
            }

            if(n == 1){
                if(a[0] == c && a[2] == c)b = true;
                else if(a[4] == c && a[7] == c) b = true;
                else b = false;
            }

            else if(n == 2){
                if(a[0] == c && a[1] == c) b = true;
                else if(a[5]==c && a[8] == c) b = true;
                else if(a[4] == c && a[6] == c) b= true;
                else b = false;
            }

            else if(n == 3){
                if(a[0] == c && a[6] == c)b = true;
                else if(a[4] ==c && a[5] == c) b = true;
                else b = false;
            }

            else if(n == 4){
                if(a[0] == c && a[8] == c)b = true;
                else if(a[1] == c && a[7] == c) b= true;
                else if(a[2] == c && a[6] == c) b = true;
                else if(a[3] == c && a[5] == c) b= true;
                else b = false;
            }

            else if(n == 5){
                if(a[2] == c && a[8] == c)b = true;
                else if(a[3] == c && a[4] == c) b= true;
                else b = false;
            }

            else if(n == 6){
                if(a[0] == c && a[3] == c) b = true;
                else if(a[4] == c && a[2] == c) b = true;
                else if(a[7] == c && a[8] == c) b = true;
                else b = false;
            }

            else if(n == 7){
                if(a[1] == c && a[4] == c) b = true;
                else if(a[6] == c && a[8] == c) b = true;
                else b = false;
            }

            else if(n == 8){
                if(a[2] == c && a[5] == c)b = true;
                else if(a[0] == c && a[4] == c) b = true;
                else if(a[6] == c && a[7] == c) b = true;
                else b = false;
            }


        }
        if(!b)a[n] = c;
        else if(b)someOneWon = true;
        return b;
    }

    private static void initializeA(){
        for(int i = 0;i < 9;i++){
            a[i] = 'A';
        }
    }

    private void serverDown(){
        button1.setClickable(false);
        button2.setClickable(false);
        button3.setClickable(false);
        button4.setClickable(false);
        button5.setClickable(false);
        button6.setClickable(false);
        button7.setClickable(false);
        button8.setClickable(false);
        button9.setClickable(false);

        button2.setText("Y");
        button5.setText("O");
        button8.setText("U");
        button4.setText("W");
        button6.setText("N");

        button1.setText("");
        button3.setText("");
        button7.setText("");
        button9.setText("");
    }

    public void getReset(View v){
        button1.setText("");button1.setClickable(true);
        button2.setText("");button2.setClickable(true);
        button3.setText("");button3.setClickable(true);
        button4.setText("");button4.setClickable(true);
        button5.setText("");button5.setClickable(true);
        button6.setText("");button6.setClickable(true);
        button7.setText("");button7.setClickable(true);
        button8.setText("");button8.setClickable(true);
        button9.setText("");button9.setClickable(true);
        getChance = 0;
        totalClick = 0;
        for(int i = 0;i < 9;i++){
            a[i] = 'A';

        }
    }

    public void gameDrawnReset(){
        button1.setText("");button1.setClickable(true);
        button2.setText("");button2.setClickable(true);
        button3.setText("");button3.setClickable(true);
        button4.setText("");button4.setClickable(true);
        button5.setText("");button5.setClickable(true);
        button6.setText("");button6.setClickable(true);
        button7.setText("");button7.setClickable(true);
        button8.setText("");button8.setClickable(true);
        button9.setText("");button9.setClickable(true);
        getChance = 0;
        totalClick = 0;
        for(int i = 0;i < 9;i++){
            a[i] = 'A';

        }
    }

}
