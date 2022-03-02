package com.example.finatrack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void MonthlyIncomeVsExpenses(View view){
        System.out.println("Income Vs Expenses");
    }

    public void IncomeVsBills(View view){
        System.out.println("Income Vs Bills");
        TextView openNewPage = findViewById(R.id.IncomeVsBillsID);

        openNewPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IncomeVBillsActivity();
            }
        });
    }

    public void MonthlyAnalysis(View view){
        System.out.println("Monthly Analysis");
        TextView openNewPage = findViewById(R.id.MonthlyAnalysisID);

        openNewPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MonthlyAnalysisActivity();
            }
        });
    }

    private void IncomeVBillsActivity(){
        Intent intent = new Intent(this, IncomeVsBillsPage.class);
        startActivity(intent);
    }

    private void MonthlyAnalysisActivity(){
        Intent intent = new Intent(this, MonthlyAnalysisPage.class);
        startActivity(intent);
    }
}