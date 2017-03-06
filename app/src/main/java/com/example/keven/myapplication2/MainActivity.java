package com.example.keven.myapplication2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price = calculatePrice();
        String priceMessage = createOrderSummary(price);
        displayMessage(priceMessage);

    }

    private String createOrderSummary(int price)
    {
        String priceMessage = "Name : Kevin Collens\n";
        priceMessage =  priceMessage + "Quantitiy : " +  quantity + "\n";
        priceMessage =  priceMessage + "Total $ " + price + "\n" + "Thank you";
        return priceMessage;
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantitiy(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantitiy_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView= (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }

    private int calculatePrice()
    {
        int price = quantity * 5;
        return price;
    }




    int quantity = 0;

    public void increment(View view)
    {
        quantity = quantity+1;
        displayQuantitiy(quantity);
    }

    public void decrement(View view)
    {
        quantity = quantity-1;
        displayQuantitiy(quantity);
    }

}