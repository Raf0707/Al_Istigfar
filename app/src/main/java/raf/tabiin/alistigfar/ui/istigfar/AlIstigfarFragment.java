package raf.tabiin.alistigfar.ui.istigfar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import raf.tabiin.alistigfar.R;
import raf.tabiin.alistigfar.databinding.FragmentAlIstigfarBinding;

public class AlIstigfarFragment extends Fragment {

    FragmentAlIstigfarBinding b;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        b = FragmentAlIstigfarBinding.inflate(getLayoutInflater());



        return b.getRoot();
    }
}