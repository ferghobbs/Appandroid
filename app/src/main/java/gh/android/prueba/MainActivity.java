package gh.android.prueba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;

import gh.android.prueba.fragments.MainMenuFragment;
import gh.android.prueba.fragments.SinglePlayerFragment;
import gh.android.prueba.pageAdapter.AdaptadorDeFragmentos;
import gh.android.prueba.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity implements MainMenuFragment.MainMenuListener {
    private AdaptadorDeFragmentos adaptadorDeFragmentos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
        agregarMainMenuFragment();
    }

    @Override
    public void playSinglePlayer() {
        Fragment nuevoFragmento = new SinglePlayerFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.ContenedorFMainMenu,nuevoFragmento).commit();
    }
    private void agregarMainMenuFragment(){
        Fragment nuevoFragmento = new MainMenuFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.ContenedorFMainMenu,nuevoFragmento).commit();
    }

}
