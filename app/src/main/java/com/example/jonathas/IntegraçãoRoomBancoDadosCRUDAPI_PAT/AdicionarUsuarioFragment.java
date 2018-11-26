package com.example.jonathas.IntegraçãoRoomBancoDadosCRUDAPI_PAT;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AdicionarUsuarioFragment extends Fragment {

    EditText editTextId, editTextNome, editTextEmail;
    Button buttonSalvarUsuario;


    public AdicionarUsuarioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(com.example.jonathas.IntegraçãoRoomBancoDadosCRUDAPI_PAT.R.layout.fragment_adicionar_usuario, container, false);

        editTextId = view.findViewById(com.example.jonathas.IntegraçãoRoomBancoDadosCRUDAPI_PAT.R.id.editTextInserirUsuarioId);
        editTextNome = view.findViewById(com.example.jonathas.IntegraçãoRoomBancoDadosCRUDAPI_PAT.R.id.editTextInserirUsuarioNome);
        editTextEmail = view.findViewById(com.example.jonathas.IntegraçãoRoomBancoDadosCRUDAPI_PATaula.R.id.editTextInserirUsuarioEmail);
        buttonSalvarUsuario = view.findViewById(com.example.jonathas.IntegraçãoRoomBancoDadosCRUDAPI_PATaula.R.id.buttonInserirUsuarioBanco);

        buttonSalvarUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = Integer.parseInt(editTextId.getText().toString());
                String nome = editTextNome.getText().toString();
                String email = editTextEmail.getText().toString();

                Usuario usuario = new Usuario();
                usuario.setNome(nome);
                usuario.setEmail(email);
                usuario.setId(id);

                MainActivity.myAppDatabase.myDAO().
                        inserirUsuario(usuario);

                editTextEmail.setText("");
                editTextId.setText("");
                editTextNome.setText("");

                Toast.makeText(getActivity(), "Usuario inserido" +
                        " com sucesso.", Toast.LENGTH_SHORT).show();
                }
        });

        return view;
    }

}
