package com.example.jonathas.IntegraçãoRoomBancoDadosCRUDAPI_PAT;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListarUsuariosFragment extends Fragment {

    TextView textView;


    public ListarUsuariosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(com.example.jonathas.room379aula.R.layout.fragment_listar_usuarios, container, false);

        textView = view.findViewById(com.example.jonathas.room379aula.R.id.textViewListarUsuarios);

        List<Usuario> usuarioList = MainActivity.myAppDatabase.myDAO().listarUsuarios();

        String info = "";

        for (Usuario usuario: usuarioList) {
            int id = usuario.getId();
            String nome = usuario.getNome();
            String email = usuario.getEmail();

            info = info + "\n\n" + "ID: " + id + "\n" + "Nome: " + nome + "\n" + "Email: " + email;
        }
        textView.setText(info);

        return view;

    }

}
