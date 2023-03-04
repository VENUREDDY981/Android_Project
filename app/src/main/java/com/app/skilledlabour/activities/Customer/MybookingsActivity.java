package com.app.skilledlabour.activities.Customer;

import static com.app.skilledlabour.helpers.common_helper.getAllQueries;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.skilledlabour.R;
import com.app.skilledlabour.adapter.QueryAdapter;
import com.app.skilledlabour.models.Query;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.List;

public class MybookingsActivity extends AppCompatActivity {
    QueryAdapter adapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_bookings_user);
        findViewById(R.id.btnBack).setOnClickListener(view->{
            this.finish();
        });
    }

}
