package android.hazardphan.ordergas;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Personal_Fragment extends Fragment implements View.OnClickListener {

    CardView btnDangNhap;
    public Personal_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.personal_fragment, container, false);
        btnDangNhap = (CardView) view.findViewById(R.id.cardFirst);
        btnDangNhap.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cardFirst:
                Intent intent = new Intent(getActivity(),Login_Activity.class);
                startActivity(intent);
                break;
        }
    }

}
