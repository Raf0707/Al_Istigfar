package raf.tabiin.alistigfar.ui.info;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import raf.tabiin.alistigfar.R;
import raf.tabiin.alistigfar.databinding.FragmentInfoBinding;

public class InfoFragment extends Fragment {

    FragmentInfoBinding b;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        b = FragmentInfoBinding.inflate(getLayoutInflater());



        return b.getRoot();
    }
}