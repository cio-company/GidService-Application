package com.cio.gidservice.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.cio.gidservice.R;

public class ManagementActivity extends AppCompatActivity {

    private ImageButton addOrganization;
    private ImageButton addService;
    private ImageButton viewMyOrganizations;
    private ImageButton viewMyServices;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.management_layout);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Management");

        addOrganization = findViewById(R.id.add_organization_manage);
        addOrganization.setOnClickListener(v -> {
            Intent intent = new Intent(this, AddOrganizationActivity.class);
            startActivity(intent);
        });

        addService = findViewById(R.id.add_service_manage);
        addService.setOnClickListener(v -> {
            Intent intent = new Intent(this, ManageActivity.class);
            startActivity(intent);
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
