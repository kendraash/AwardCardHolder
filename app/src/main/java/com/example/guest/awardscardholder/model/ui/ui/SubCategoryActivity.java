package com.example.guest.awardscardholder.model.ui.ui;

import android.content.Intent;
import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.example.guest.awardscardholder.R;

import butterknife.Bind;

public class SubCategoryActivity extends AppCompatActivity {

    @Bind(R.id.groceryCategory) Button mGroceryCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_category);
       String categoryName = parseName(mGroceryCategory);
        pickCategory(categoryName);
    }

    public void pickCategory(String categoryName) {
        Intent intent = new Intent(this, SubCategoryActivity.class);
        intent.putExtra("categoryName", categoryName);
        startActivity(intent);
    }

    public String parseName(Button v) {

        
        return v.toString();


    }
}
