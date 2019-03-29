package application.example.assignment3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    EditText n1,n2;
    Button add,sub,div,mul;
    TextView result;

    int x,y,r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_2);
        n1=(EditText)findViewById (R.id.numb1);
        n2=(EditText)findViewById (R.id.numb2);
        add=(Button)findViewById (R.id.addButton);
        sub=(Button)findViewById (R.id.subButton);
        div=(Button)findViewById (R.id.divButton);
        mul=(Button)findViewById (R.id.mulButton);
        result=(TextView)findViewById (R.id.resultOp);

        add.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                x=Integer.parseInt (n1.getText ().toString ());
                y=Integer.parseInt (n2.getText ().toString ());
                r=x+y;

                result.setText ("Result=" + r);
            }
        });

        sub.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                x=Integer.parseInt (n1.getText ().toString ());
                y=Integer.parseInt (n2.getText ().toString ());
                r=x-y;

                result.setText ("Result=" + r);

            }
        });

        div.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                x=Integer.parseInt (n1.getText ().toString ());
                y=Integer.parseInt (n2.getText ().toString ());
                r=x/y;

                result.setText ("Result=" + r);
            }
        });

        mul.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                x=Integer.parseInt (n1.getText ().toString ());
                y=Integer.parseInt (n2.getText ().toString ());
                r=x*y;

                result.setText ("Result=" + r);
            }
        });

        }


    }

