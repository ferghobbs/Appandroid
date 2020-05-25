package gh.android.prueba.pageAdapter;

import android.app.Activity;
import android.text.Layout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import gh.android.prueba.fragments.MainMenuFragment;
import gh.android.prueba.fragments.SinglePlayerFragment;

public class AdaptadorDeFragmentos extends FragmentPagerAdapter {

    public static final int MAINMENU = 0;
    public static final int SINGLEPLAYER = 1;

    public AdaptadorDeFragmentos(@NonNull FragmentManager fm) {
        super(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case MAINMENU:
                return new MainMenuFragment();
            case SINGLEPLAYER:
                return new SinglePlayerFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    public static void cargarFragment(int position, String id, Activity view){

    }
}
