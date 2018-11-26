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
public class AlterarUsuarioFragment extends Fragment {

    EditText edId, edNome, edEmail;
    Button btAt;


    public AlterarUsuarioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(com.example.jonathas.room379aula.R.layout.fragment_alterar_usuario, container, false);

        edId = view.findViewById(com.example.jonathas.room379aula.R.id.editTextAtualizaId);
        edNome = view.findViewById(com.example.jonathas.room379aula.R.id.editTextAtualizaNome);
        edEmail = view.findViewById(com.example.jonathas.room379aula.R.id.editTextAtualizaEmail);
        btAt = view.findViewById(com.example.jonathas.room379aula.R.id.buttonAtualizaUsuario);

        btAt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = Integer.parseInt(edId.getText().toString());
                String nome = edNome.getText().toString();
                String email = edEmail.getText().toString();

                Usuario usuario = new Usuario();
                usuario.setId(id);
                usuario.setEmail(email);
                usuario.setNome(nome);

                //dao
                MainActivity.myAppDatabase.myDAO().atualizarUsuario(usuario);

                Toast.makeText(getActivity(), "Usuário atualizado",
                        Toast.LENGTH_SHORT).show();

                edEmail.setText("");
                edId.setText("");
                edNome.setText("");

            }
        });



        return view;
    }

}
