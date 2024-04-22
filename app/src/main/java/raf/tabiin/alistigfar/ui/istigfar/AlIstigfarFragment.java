package raf.tabiin.alistigfar.ui.istigfar;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.snackbar.Snackbar;

import java.util.Date;

import raf.tabiin.alistigfar.R;
import raf.tabiin.alistigfar.databinding.FragmentAlIstigfarBinding;

public class AlIstigfarFragment extends Fragment {

    FragmentAlIstigfarBinding b;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        b = FragmentAlIstigfarBinding.inflate(getLayoutInflater());

        b.i1.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                            b.i1Arabic.getText().toString() + "\n"
                            + b.i1Transcript.getText().toString() + "\n"
                            + b.i1Translate.getText().toString());
            clipboard.setPrimaryClip(clip);

            Snackbar.make(v, " скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i2.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i2Arabic.getText().toString() + "\n"
                            + b.i2Transcript.getText().toString() + "\n"
                            + b.i2Translate.getText().toString());
            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i3.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i3Arabic.getText().toString() + "\n"
                            + b.i3Transcript.getText().toString() + "\n"
                            + b.i3Translate.getText().toString());
            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i4.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i4Arabic.getText().toString() + "\n"
                            + b.i4Transcript.getText().toString() + "\n"
                            + b.i4Translate.getText().toString());
            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i5.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i5Arabic.getText().toString() + "\n"
                            + b.i5Transcript.getText().toString() + "\n"
                            + b.i5Translate.getText().toString());
            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i6.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i6Arabic.getText().toString() + "\n"
                            + b.i6Transcript.getText().toString() + "\n"
                            + b.i6Translate.getText().toString());
            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i7.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i7Arabic.getText().toString() + "\n"
                            + b.i7Transcript.getText().toString() + "\n"
                            + b.i7Translate.getText().toString());
            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i8.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i8Arabic.getText().toString() + "\n"
                            + b.i8Transcript.getText().toString() + "\n"
                            + b.i8Translate.getText().toString()
                            + b.i8Hadith.getText().toString());
            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i9.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i9Arabic.getText().toString() + "\n"
                            + b.i9Transcript.getText().toString() + "\n"
                            + b.i9Translate.getText().toString());
            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i91.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i91Arabic.getText().toString() + "\n"
                            + b.i91Transcript.getText().toString() + "\n"
                            + b.i91Translate.getText().toString());
            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i10.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i10Arabic.getText().toString() + "\n"
                            + b.i10Transcript.getText().toString() + "\n"
                            + b.i10Translate.getText().toString());
            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i11.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i11Arabic.getText().toString() + "\n"
                            + b.i11Transcript.getText().toString() + "\n"
                            + b.i11Translate.getText().toString());
            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i12.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i12Arabic.getText().toString() + "\n"
                            + b.i12Transcript.getText().toString() + "\n"
                            + b.i12Translate.getText().toString());
            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i13.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i13Arabic.getText().toString() + "\n"
                            + b.i13Transcript.getText().toString() + "\n"
                            + b.i13Translate.getText().toString());
            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i14.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i14Arabic.getText().toString() + "\n"
                            + b.i14Transcript.getText().toString() + "\n"
                            + b.i14Translate.getText().toString());
            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });

        b.i15.setOnClickListener(v -> {
            ClipboardManager clipboard = (ClipboardManager)
                    v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("",
                    b.i15Arabic.getText().toString() + "\n"
                            + b.i15Transcript.getText().toString() + "\n"
                            + b.i15Translate.getText().toString());
            clipboard.setPrimaryClip(clip);

            Snackbar.make(v," скопировано в буфер обмена",
                    Snackbar.LENGTH_SHORT).show();
        });



        return b.getRoot();
    }
}