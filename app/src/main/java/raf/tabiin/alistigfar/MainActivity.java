package raf.tabiin.alistigfar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.splashscreen.SplashScreen;

import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.google.android.material.color.DynamicColors;

import raf.tabiin.alistigfar.databinding.ActivityMainBinding;
import raf.tabiin.alistigfar.ui.about_app.AppAboutFragment;
import raf.tabiin.alistigfar.ui.counter.GestureCounterFragment;
import raf.tabiin.alistigfar.ui.counter.MainSwipeFragment;
import raf.tabiin.alistigfar.ui.istigfar.AlIstigfarFragment;
import raf.tabiin.alistigfar.util.SharedPreferencesUtils;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    AppAboutFragment appAboutFragment;
    AlIstigfarFragment alIstigfarFragment;

    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        int nightIcon = SharedPreferencesUtils.getInteger(this, "nightIcon", R.drawable.vectornightpress);

        App.instance.setNightMode();

        SplashScreen splashScreen = SplashScreen.installSplashScreen(this);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);

        view = findViewById(R.id.view);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.containerFragment, new AlIstigfarFragment())
                    .commit();
        }

        if (SharedPreferencesUtils.getBoolean(this, "useDynamicColors"))
            DynamicColors.applyToActivityIfAvailable(this);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM) {
            if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
                binding.themeBtn.setIcon(getDrawable(nightIcon));
            } else if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_NO) {
                binding.themeBtn.setIcon(getDrawable(R.drawable.vectorlight_press));
            }
        } else if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            binding.themeBtn.setIcon(getDrawable(nightIcon));
        } else if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_NO) {
            binding.themeBtn.setIcon(getDrawable(R.drawable.vectorlight_press));
        }

        appAboutFragment = new AppAboutFragment();
        alIstigfarFragment = new AlIstigfarFragment();

        binding.themeBtn.setOnClickListener(v -> {


            if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
//                binding.getRoot().animate().scaleX(3).scaleY(3).setDuration(800).start();
//                //binding.themeBtn.setRotation(binding.themeBtn.getRotation() + 360);
//                Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
//                binding.themeBtn.startAnimation(animation);
                //animSelectTheme();
                binding.themeBtn.setIcon(getDrawable(R.drawable.vectorlight_press));
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                SharedPreferencesUtils.saveInteger(getApplicationContext(), "checkedButton", R.id.setLightTheme);
                SharedPreferencesUtils.saveInteger(getApplicationContext(), "nightMode", 2);
                SharedPreferencesUtils.saveInteger(getApplicationContext(), "nightIcon", R.drawable.vectorlight_press);

                /*
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        binding.getRoot().animate().scaleX(3).scaleY(3).setDuration(800).start();
                    }
                }, 850);

                 */

            } else if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_NO) {
//                binding.getRoot().animate().scaleX(3).scaleY(3).setDuration(800).start();
//                //binding.themeBtn.setRotation(binding.themeBtn.getRotation() + 360);
//                Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
//                binding.themeBtn.startAnimation(animation);
                //animSelectTheme();
                binding.themeBtn.setIcon(getDrawable(R.drawable.vectornightpress));
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                SharedPreferencesUtils.saveInteger(getApplicationContext(), "checkedButton", R.id.setNightTheme);
                SharedPreferencesUtils.saveInteger(getApplicationContext(), "nightMode", 3);
                SharedPreferencesUtils.saveInteger(getApplicationContext(), "nightIcon", R.drawable.vectornightpress);
            }

            recreate();
        });

        binding.navView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.alistigfar:

                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.containerFragment, new AlIstigfarFragment())
                            .commit();

                    return true;

                case R.id.counter:

                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.containerFragment, new MainSwipeFragment())
                            .commit();

                    return true;

                case R.id.about_app:

                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.containerFragment, new AppAboutFragment())
                            .commit();
                    return true;
            }
            return false;
        });
    }

}