package com.example.calcapp;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Switch;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

public class SettingsActivity extends AppCompatActivity {

    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private Switch switchTheme;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);  // XML faylga mos ravishda sozlamalar

        // Switch elementini olish
        switchTheme = findViewById(R.id.splashText);

        // Sozlamalarni SharedPreferences orqali o'qish
        SharedPreferences preferences = getSharedPreferences("appSettings", MODE_PRIVATE);
        boolean isDarkMode = preferences.getBoolean("darkMode", false);

        // Switch holatini sozlash
        switchTheme.setChecked(isDarkMode);

        // Switch holatini o'qish va tegishli amalni bajarish
        switchTheme.setOnCheckedChangeListener((buttonView, isChecked) -> {
            // Dark Mode'ni faollashtirish yoki o'chirish
            setDarkMode(isChecked);
        });
    }

    // Dark Mode'ni yoqish yoki o'chirish
    private void setDarkMode(boolean enable) {
        // Sozlamalarni saqlash
        SharedPreferences preferences = getSharedPreferences("appSettings", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean("darkMode", enable);
        editor.apply();

        // Tizimni yangilash
        if (enable) {
            getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else {
            getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
    }
}
