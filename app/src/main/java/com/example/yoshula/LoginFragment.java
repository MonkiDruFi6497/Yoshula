package com.example.yoshula;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class LoginFragment extends Fragment  {

    //private static final int REQUEST_LOGIN = 100;
    private Activity activity;

    private EditText edUserid, edPasswd;
    private Button log_in, log_out;
    private View view;
    //private boolean logon = false;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activity = getActivity();


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        //另一種寫法 用View
        view = inflater.inflate(R.layout.fragment_login,container,false);

        edUserid =  view.findViewById(R.id.edUserid);
        edPasswd =  view.findViewById(R.id.edPasswd);
        log_in   =  view.findViewById(R.id.log_in);
        log_out  =  view.findViewById(R.id.log_out);

        //log_in.setOnClickListener(this);
        log_in.setOnClickListener(new login());
        activity.setTitle("登入/註冊");

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

//        edUserid = getView().findViewById(R.id.edUserid);
//        edPasswd = getView().findViewById(R.id.edPasswd);
//        log_in   = getView().findViewById(R.id.log_in);
//        log_out  = getView().findViewById(R.id.log_out);
//
//        log_in.setOnClickListener(this);

        super.onViewCreated(view, savedInstanceState);
    }

//    @Override
//    public void onClick(View v) {
//        String eduserid = edUserid.getText().toString();
//        final String edpasswd = edPasswd.getText().toString();
//
//        FirebaseDatabase.getInstance().getReference("users").child(eduserid).child("password")
//                        .addListenerForSingleValueEvent(new ValueEventListener() {
//                            @Override
//                            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                                String pw = (String) dataSnapshot.getValue();
//                                if(pw.equals(edpasswd)) {
////                                    Intent intent = new Intent(getActivity(), MainActivity.class);
////                                    startActivity(intent);
//                                    Toast.makeText(getActivity(),"登入成功", Toast.LENGTH_LONG).show();
//                                }else {
//                                    AlertDialog.Builder alertBuilder = new AlertDialog.Builder(getActivity());
//                                    alertBuilder.setTitle("登入結果");
//                                    alertBuilder.setMessage("ghu4h4");
//                                    alertBuilder.setPositiveButton("OK", null);
//                                    alertBuilder.show();
//                                    new AlertDialog.Builder(getContext())
//                                                   .setTitle("登入結果")
//                                                   .setMessage("登入失敗")
//                                                   .setPositiveButton("ok",null)
//                                                   .show();
//                                }
//                            }
////
//                            @Override
//                            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//                            }
//                        });
//        if("jack".equals(eduserid) && "1234".equals(edpasswd)) {
//                                                    //MainActivity.class 註冊成功 跳轉到首頁
//            Intent intent = new Intent(getActivity(), MainActivity.class);
//            startActivity(intent);
//            Toast.makeText(getContext(),"登入成功", Toast.LENGTH_LONG).show();
//        }

//
//    }


    private class login implements View.OnClickListener {
        @Override
        public void onClick(View v) {

            String eduserid = edUserid.getText().toString();
            final String edpasswd = edPasswd.getText().toString();

            FirebaseDatabase.getInstance().getReference("users").child("jack").child("password")
                    .addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                            String pw = (String) dataSnapshot.getValue();
                            if(pw.equals(edpasswd)) {
                                Toast.makeText(getActivity(),"ok",Toast.LENGTH_LONG).show();
                            }else {
                                AlertDialog.Builder alertBuilder = new AlertDialog.Builder(getActivity());
                                    alertBuilder.setTitle("登入結果");
                                    alertBuilder.setMessage("帳密錯誤,請確認密碼");
                                    alertBuilder.setPositiveButton("OK", null);
                                    alertBuilder.show();

                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {

                        }
                    });


        }
    }
}
