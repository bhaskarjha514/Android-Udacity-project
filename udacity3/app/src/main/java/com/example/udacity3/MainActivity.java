package com.example.udacity3;
import java.text.NumberFormat;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  int a=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add(View view) {
        a+=1;
        String message ="Total Item: "+a;
        displayMessage(message);

    }
    public void minus(View view) {

        if(a>0){
            a-=1;
        }
        else{
            a=0;
        }
        String message ="Total Item: "+a;
        displayMessage(message);

    }
    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
         int price = a*10;
         String pricemessage = "Total Amount: $"+price;
         pricedisplayMessage(pricemessage);


    }

    /**
     * This method displays the given quantity value on the screen.
     */

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    private void displayMessage(String message) {
        TextView messageTextView = (TextView) findViewById(R.id.message_text_view);
        messageTextView.setText(message);
    }
    private void pricedisplayMessage(String pricemessage) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(pricemessage);
    }
}