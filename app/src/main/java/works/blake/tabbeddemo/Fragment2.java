package works.blake.tabbeddemo;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link android.app.Fragment} subclass.
 * Use the {@link works.blake.tabbeddemo.Fragment2#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class Fragment2 extends Fragment {

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment Fragment1.
     */
    public static Fragment2 newInstance() {
        return new Fragment2();
    }
    public Fragment2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment2, container, false);
    }


}
