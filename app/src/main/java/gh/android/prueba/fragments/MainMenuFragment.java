package gh.android.prueba.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import gh.android.prueba.R;


public class MainMenuFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ImageButton btnJugarSP;
    private Button opciones;

    private MainMenuListener callback;

    public MainMenuFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static MainMenuFragment newInstance(String param1, String param2) {
        MainMenuFragment fragment = new MainMenuFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try{
            callback= (MainMenuListener) context;
        } catch(Exception e){
            throw new ClassCastException(context.toString() + "should implement MainMenuListener");
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_menu, container, false);

        this.btnJugarSP = view.findViewById(R.id.jugarBtn);

        this.btnJugarSP.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                callback.playSinglePlayer();

            }
        });
        this.opciones = view.findViewById(R.id.opcionesBton);

        this.opciones.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO implementar opciones boton menu!

            }
        });

        // Inflate the layout for this fragment
        return view;
    }
    public interface  MainMenuListener{
        void playSinglePlayer();
    }
}
