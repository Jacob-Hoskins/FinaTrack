package com.example.finatrack;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IncomeVsBillsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income_vs_bills_page);
    }

    public void AddBillDialog(View view){
        Button addBill = findViewById(R.id.AddBillID);

        addBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Button Clicked");
                AddBillPopUp();
            }
        });
    }

    private void AddBillPopUp(){
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.add_bill_dialog);
        dialog.show();
    }
}