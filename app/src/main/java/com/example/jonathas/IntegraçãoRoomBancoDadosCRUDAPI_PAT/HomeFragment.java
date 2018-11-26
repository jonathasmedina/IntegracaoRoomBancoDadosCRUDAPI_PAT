package com.example.jonathas.IntegraçãoRoomBancoDadosCRUDAPI_PAT;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener{

    Button btAdicionar, btListar, btAlterar, btDeletar;



    public HomeFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(com.example.jonathas.room379aula.R.layout.fragment_home, container, false);

        btAdicionar = view.findViewById(com.example.jonathas.room379aula.R.id.buttonInserirUsuario);
        btAlterar = view.findViewById(com.example.jonathas.room379aula.R.id.buttonAlterarUsuario);
        btListar = view.findViewById(com.example.jonathas.room379aula.R.id.buttonListarUsuario);
        btDeletar = view.findViewById(com.example.jonathas.room379aula.R.id.buttonDeletarUsuario);


        btDeletar.setOnClickListener(this);
        btAdicionar.setOnClickListener(this);
        btAlterar.setOnClickListener(this);
        btListar.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case com.example.jonathas.room379aula.R.id.buttonInserirUsuario:
               MainActivity.fragmentManager.beginTransaction().
                       replace(com.example.jonathas.room379aula.R.id.frameConteiner,
                               new AdicionarUsuarioFragment()).addToBackStack(null)
                       .commit();
                break;
            case com.example.jonathas.room379aula.R.id.buttonListarUsuario:
                MainActivity.fragmentManager.beginTransaction().
                        replace(com.example.jonathas.room379aula.R.id.frameConteiner,
                                new ListarUsuariosFragment()).addToBackStack(null)
                        .commit();
                break;
            case com.example.jonathas.room379aula.R.id.buttonAlterarUsuario:
                MainActivity.fragmentManager.beginTransaction().
                        replace(com.example.jonathas.room379aula.R.id.frameConteiner,
                                new AlterarUsuarioFragment()).addToBackStack(null)
                        .commit();

                break;
            case com.example.jonathas.room379aula.R.id.buttonDeletarUsuario:
                MainActivity.fragmentManager.beginTransaction().
                        replace(com.example.jonathas.room379aula.R.id.frameConteiner,
                                new DeletarUsuarioFragment()).addToBackStack(null)
                        .commit();
                break;

        }

    }
}
