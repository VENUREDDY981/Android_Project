package com.app.skilledlabour.activities.Labour;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.app.skilledlabour.R;
import com.app.skilledlabour.activities.Admin.QueriesActivity;
import com.app.skilledlabour.activities.Admin.SkillsActivity;
import com.app.skilledlabour.activities.Customer.ALlLaboursActivity;
import com.app.skilledlabour.activities.Customer.FindSpecialistActivity;
import com.app.skilledlabour.activities.Customer.MybookingsActivity;
import com.app.skilledlabour.activities.LoginActivity;
import com.app.skilledlabour.adapter.SkillsAdminAdapter;

public class DashboardLabourActivity extends AppCompatActivity {
    SkillsAdminAdapter adapter;
    Button btnSkills,myAvailability,btnMyJobs,btnComplaints,btnProfile;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labour_dashboard);
        btnSkills = findViewById(R.id.btnSkills);
        myAvailability = findViewById(R.id.myAvailability);
        btnMyJobs = findViewById(R.id.btnMyJobs);
        btnComplaints = findViewById(R.id.btnComplaints);
        btnProfile = findViewById(R.id.btnProfile);

        myAvailability.setOnClickListener(v -> {
        });btnSkills.setOnClickListener(v -> {
            startActivity( new Intent(this, SkillsActivity.class));
        });
        btnComplaints.setOnClickListener(v -> {
            startActivity( new Intent(this, QueriesActivity.class));
        });
        btnProfile.setOnClickListener(v -> {
            Toast.makeText(this, "profile details!",Toast.LENGTH_SHORT).show();
        });
        btnProfile=findViewById(R.id.signOutBtn);
        btnProfile.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });
    }
}
