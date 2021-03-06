package layout;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.mukesh.task2.R;

public class Fragment2 extends Fragment {

    private View view;
    private Button btn_previous, btn_next2;
    private Fragment f1, f3;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view =  inflater.inflate(R.layout.fragment_fragment2, container, false);

        btn_previous = (Button)view.findViewById(R.id.btn_previous);
        btn_previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                f1 = new Fragment1();
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.main_id, f1);
                ft.addToBackStack("Frag2");
                fm.popBackStack("Frag1", 1);
                ft.commit();
            }
        });

        btn_next2 = (Button)view.findViewById(R.id.btn_next2);
        btn_next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                f3 = new Fragment3();
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.main_id, f3);
                ft.commit();
            }
        });
        return view;
    }
}
