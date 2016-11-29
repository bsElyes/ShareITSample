package workshop.com.abcd.Fragments;


import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import workshop.com.abcd.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HelloFragment extends Fragment {

    EditText editNom;
    EditText editPrenom;
    EditText editEmail;
    Button next;
    public HelloFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_hello, container, false);
        editPrenom=(EditText) v.findViewById(R.id.edit_firstname);
        editNom= (EditText)v.findViewById(R.id.edit_lastname);
        editEmail=(EditText) v.findViewById(R.id.edit_email);
        next = (Button) v.findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b = new Bundle();
                b.putString("prenom",editPrenom.getText().toString());
                b.putString("nom",editNom.getText().toString());
                b.putString("email",editEmail.getText().toString());
                FragmentTransaction fragmentTransaction = getActivity().getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, AfficheFragment.newInstance(b));
                fragmentTransaction.commitAllowingStateLoss();

            }
        });

        return v ;
    }

}
