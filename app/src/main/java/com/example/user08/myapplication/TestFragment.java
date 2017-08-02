package com.example.user08.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

/**
 * Created by user08 on 02.08.17.
 */

public class TestFragment extends Fragment implements View.OnClickListener{
    private  String mDate;
    private TextView tv;
    private Button btn;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Fragment", "onCreate");
        mDate = new Date().toString();

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("Fragment", "onCreateView");
        return inflater.inflate(R.layout.fragment_test, container, false);
//        return super.onCreateView(inflater, container, savedInstanceState);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("Fragment", "onViewCreated");
        tv = (TextView) view.findViewById(R.id.textView);
        btn = (Button) view.findViewById(R.id.button);
        btn.setOnClickListener(this);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("Fragment", "onAttach");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("Fragment", "onDetach");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("Fragment", "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Fragment", "onDestroy");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("Fragment", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("Fragment", "onResume");
        tv.setText(mDate);
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("Fragment", "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("Fragment", "onStop");
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getContext(), SecondActivity.class);
        intent.putExtra(Const.DATE, mDate);
        startActivity(intent);
    }
}
