package workshop.com.abcd.Fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import workshop.com.abcd.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AfficheFragment extends Fragment {
    TextView editNom;
    TextView editPrenom;
    TextView editEmail;

    public AfficheFragment() {
    }
    public static  AfficheFragment newInstance(Bundle b) {
        AfficheFragment f = new AfficheFragment();
        f.setArguments(b);

        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_affiche, container, false);
        editPrenom=(TextView) v.findViewById(R.id.edit_firstname);
        editNom= (TextView)v.findViewById(R.id.edit_lastname);
        editEmail=(TextView) v.findViewById(R.id.edit_email);

        String nom = getArguments().getString("nom");
        String prenom = getArguments().getString("prenom");
        String email = getArguments().getString("email");

        editPrenom.setText(prenom);
        editEmail.setText(email);
        editNom.setText(nom);
        

        return v;
    }

}
