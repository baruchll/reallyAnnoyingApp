package com.example.reallyannoyingapp.navigation_bar;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.reallyannoyingapp.R;


public class Phone extends Fragment {

    Boolean flag = true;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_phone, container, false);
        return root;


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init();
    }

    private void init() {
        ImageButton apple, samsung, lg, huawei, xiaomi;
        ImageButton galaxy_s9, galaxy_s10, galaxy_s20, galaxy_s21;
        ImageButton iphone_8, iphone_x, iphone_11, iphone_12;
        ImageButton lg_k92, lg_v60, lg_velvet, lg_wing;
        ImageButton mate_20x, mate_30, mate_40, mate_x2;
        ImageButton mi_10, mi_11, poco_m3, poco_x3;


        TextView s9_text, s10_text, s20_text, s21_text;
        TextView iphone8_text, iphonex_text, iphone11_text, iphone12_text;
        TextView k92_text, v60_text, velvet_text, wing_text;
        TextView mate20x_text, mate30_text, mate40_text, matex2_text;
        TextView mi10_text, mi11_text, x3_text, m3_text;

        apple = getView().findViewById(R.id.apple_logo);
        samsung = getView().findViewById(R.id.samsung_logo);
        lg = getView().findViewById(R.id.lg_logo);
        huawei = getView().findViewById(R.id.huawei_logo);
        xiaomi = getView().findViewById(R.id.xiaomi_logo);
        galaxy_s9 = getView().findViewById(R.id.galaxy_s9);
        galaxy_s10 = getView().findViewById(R.id.galaxy_s10);
        galaxy_s20 = getView().findViewById(R.id.galaxy_s20);
        galaxy_s21 = getView().findViewById(R.id.galaxy_s21);
        iphone_8 = getView().findViewById(R.id.iphone_8);
        iphone_x = getView().findViewById(R.id.iphone_x);
        iphone_11 = getView().findViewById(R.id.iphone_11);
        iphone_12 = getView().findViewById(R.id.iphone_12);
        lg_k92 = getView().findViewById(R.id.lg_k92);
        lg_v60 = getView().findViewById(R.id.lg_v60);
        lg_velvet = getView().findViewById(R.id.lg_velvet);
        lg_wing = getView().findViewById(R.id.lg_wing);
        mate_20x = getView().findViewById(R.id.mate_20x);
        mate_30 = getView().findViewById(R.id.mate_30);
        mate_40 = getView().findViewById(R.id.mate_40);
        mate_x2 = getView().findViewById(R.id.mate_x2);
        mi_10 = getView().findViewById(R.id.mi_10);
        mi_11 = getView().findViewById(R.id.mi_11);
        poco_m3 = getView().findViewById(R.id.poco_m3);
        poco_x3 = getView().findViewById(R.id.poco_x3);
        s9_text = getView().findViewById(R.id.s9_text);
        s10_text = getView().findViewById(R.id.s10_text);
        s20_text = getView().findViewById(R.id.s20_text);
        s21_text = getView().findViewById(R.id.s21_text);
        iphone8_text = getView().findViewById(R.id.iphone_8_text);
        iphonex_text = getView().findViewById(R.id.iphone_x_text);
        iphone11_text = getView().findViewById(R.id.iphone_11_text);
        iphone12_text = getView().findViewById(R.id.iphone_12_text);
        k92_text = getView().findViewById(R.id.k92_text);
        v60_text = getView().findViewById(R.id.v60_text);
        velvet_text = getView().findViewById(R.id.velvet_text);
        wing_text = getView().findViewById(R.id.wing_text);
        mate20x_text = getView().findViewById(R.id.mate20x_text);
        mate30_text = getView().findViewById(R.id.mate30_text);
        mate40_text = getView().findViewById(R.id.mate40_text);
        matex2_text = getView().findViewById(R.id.mate_x2_text);
        mi10_text = getView().findViewById(R.id.mi_10_text);
        mi11_text = getView().findViewById(R.id.mi_11_text);
        x3_text = getView().findViewById(R.id.x3_text);
        m3_text = getView().findViewById(R.id.m3_text);


        samsung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (flag) {
                    galaxy_s9.setVisibility(View.VISIBLE);
                    galaxy_s10.setVisibility(View.VISIBLE);
                    galaxy_s20.setVisibility(View.VISIBLE);
                    galaxy_s21.setVisibility(View.VISIBLE);
                    iphone_8.setVisibility(View.GONE);
                    iphone_x.setVisibility(View.GONE);
                    iphone_11.setVisibility(View.GONE);
                    iphone_12.setVisibility(View.GONE);
                    lg_k92.setVisibility(View.GONE);
                    lg_v60.setVisibility(View.GONE);
                    lg_velvet.setVisibility(View.GONE);
                    lg_wing.setVisibility(View.GONE);
                    mate_20x.setVisibility(View.GONE);
                    mate_30.setVisibility(View.GONE);
                    mate_40.setVisibility(View.GONE);
                    mate_x2.setVisibility(View.GONE);
                    mi_10.setVisibility(View.GONE);
                    mi_11.setVisibility(View.GONE);
                    poco_m3.setVisibility(View.GONE);
                    poco_x3.setVisibility(View.GONE);
                    s21_text.setVisibility(View.GONE);
                    s20_text.setVisibility(View.GONE);
                    s10_text.setVisibility(View.GONE);
                    s9_text.setVisibility(View.GONE);
                    iphone8_text.setVisibility(View.GONE);
                    iphonex_text.setVisibility(View.GONE);
                    iphone11_text.setVisibility(View.GONE);
                    iphone12_text.setVisibility(View.GONE);
                    k92_text.setVisibility(View.GONE);
                    v60_text.setVisibility(View.GONE);
                    velvet_text.setVisibility(View.GONE);
                    wing_text.setVisibility(View.GONE);
                    mate20x_text.setVisibility(View.GONE);
                    mate30_text.setVisibility(View.GONE);
                    mate40_text.setVisibility(View.GONE);
                    matex2_text.setVisibility(View.GONE);
                    mi10_text.setVisibility(View.GONE);
                    mi11_text.setVisibility(View.GONE);
                    m3_text.setVisibility(View.GONE);
                    x3_text.setVisibility(View.GONE);
                }
                if (!flag){
                    galaxy_s9.setVisibility(View.GONE);
                    galaxy_s10.setVisibility(View.GONE);
                    galaxy_s20.setVisibility(View.GONE);
                    galaxy_s21.setVisibility(View.GONE);
                }
                flag = !flag;
            }
        });


        apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag) {
                    iphone_8.setVisibility(View.VISIBLE);
                    iphone_x.setVisibility(View.VISIBLE);
                    iphone_11.setVisibility(View.VISIBLE);
                    iphone_12.setVisibility(View.VISIBLE);
                    lg_k92.setVisibility(View.GONE);
                    lg_v60.setVisibility(View.GONE);
                    lg_velvet.setVisibility(View.GONE);
                    lg_wing.setVisibility(View.GONE);
                    mate_20x.setVisibility(View.GONE);
                    mate_30.setVisibility(View.GONE);
                    mate_40.setVisibility(View.GONE);
                    mate_x2.setVisibility(View.GONE);
                    mi_10.setVisibility(View.GONE);
                    mi_11.setVisibility(View.GONE);
                    poco_m3.setVisibility(View.GONE);
                    poco_x3.setVisibility(View.GONE);
                    galaxy_s9.setVisibility(View.GONE);
                    galaxy_s10.setVisibility(View.GONE);
                    galaxy_s20.setVisibility(View.GONE);
                    galaxy_s21.setVisibility(View.GONE);
                    s21_text.setVisibility(View.GONE);
                    s20_text.setVisibility(View.GONE);
                    s10_text.setVisibility(View.GONE);
                    s9_text.setVisibility(View.GONE);
                    iphone8_text.setVisibility(View.GONE);
                    iphonex_text.setVisibility(View.GONE);
                    iphone11_text.setVisibility(View.GONE);
                    iphone12_text.setVisibility(View.GONE);
                    k92_text.setVisibility(View.GONE);
                    v60_text.setVisibility(View.GONE);
                    velvet_text.setVisibility(View.GONE);
                    wing_text.setVisibility(View.GONE);
                    mate20x_text.setVisibility(View.GONE);
                    mate30_text.setVisibility(View.GONE);
                    mate40_text.setVisibility(View.GONE);
                    matex2_text.setVisibility(View.GONE);
                    mi10_text.setVisibility(View.GONE);
                    mi11_text.setVisibility(View.GONE);
                    m3_text.setVisibility(View.GONE);
                    x3_text.setVisibility(View.GONE);
                }
                if (!flag){
                    iphone_8.setVisibility(View.GONE);
                    iphone_x.setVisibility(View.GONE);
                    iphone_11.setVisibility(View.GONE);
                    iphone_12.setVisibility(View.GONE);
                }
                flag = !flag;
            }
        });


        lg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag) {
                    lg_k92.setVisibility(View.VISIBLE);
                    lg_v60.setVisibility(View.VISIBLE);
                    lg_velvet.setVisibility(View.VISIBLE);
                    lg_wing.setVisibility(View.VISIBLE);
                    mate_20x.setVisibility(View.GONE);
                    mate_30.setVisibility(View.GONE);
                    mate_40.setVisibility(View.GONE);
                    mate_x2.setVisibility(View.GONE);
                    mi_10.setVisibility(View.GONE);
                    mi_11.setVisibility(View.GONE);
                    poco_m3.setVisibility(View.GONE);
                    poco_x3.setVisibility(View.GONE);
                    galaxy_s9.setVisibility(View.GONE);
                    galaxy_s10.setVisibility(View.GONE);
                    galaxy_s20.setVisibility(View.GONE);
                    galaxy_s21.setVisibility(View.GONE);
                    iphone_8.setVisibility(View.GONE);
                    iphone_x.setVisibility(View.GONE);
                    iphone_11.setVisibility(View.GONE);
                    iphone_12.setVisibility(View.GONE);
                    s21_text.setVisibility(View.GONE);
                    s20_text.setVisibility(View.GONE);
                    s10_text.setVisibility(View.GONE);
                    s9_text.setVisibility(View.GONE);
                    iphone8_text.setVisibility(View.GONE);
                    iphonex_text.setVisibility(View.GONE);
                    iphone11_text.setVisibility(View.GONE);
                    iphone12_text.setVisibility(View.GONE);
                    k92_text.setVisibility(View.GONE);
                    v60_text.setVisibility(View.GONE);
                    velvet_text.setVisibility(View.GONE);
                    wing_text.setVisibility(View.GONE);
                    mate20x_text.setVisibility(View.GONE);
                    mate30_text.setVisibility(View.GONE);
                    mate40_text.setVisibility(View.GONE);
                    matex2_text.setVisibility(View.GONE);
                    mi10_text.setVisibility(View.GONE);
                    mi11_text.setVisibility(View.GONE);
                    m3_text.setVisibility(View.GONE);
                    x3_text.setVisibility(View.GONE);
                }
                if (!flag){
                    lg_k92.setVisibility(View.GONE);
                    lg_v60.setVisibility(View.GONE);
                    lg_velvet.setVisibility(View.GONE);
                    lg_wing.setVisibility(View.GONE);
                }
                flag = !flag;
            }
        });


        huawei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag) {
                    mate_20x.setVisibility(View.VISIBLE);
                    mate_30.setVisibility(View.VISIBLE);
                    mate_40.setVisibility(View.VISIBLE);
                    mate_x2.setVisibility(View.VISIBLE);
                    mi_10.setVisibility(View.GONE);
                    mi_11.setVisibility(View.GONE);
                    poco_m3.setVisibility(View.GONE);
                    poco_x3.setVisibility(View.GONE);
                    galaxy_s9.setVisibility(View.GONE);
                    galaxy_s10.setVisibility(View.GONE);
                    galaxy_s20.setVisibility(View.GONE);
                    galaxy_s21.setVisibility(View.GONE);
                    iphone_8.setVisibility(View.GONE);
                    iphone_x.setVisibility(View.GONE);
                    iphone_11.setVisibility(View.GONE);
                    iphone_12.setVisibility(View.GONE);
                    lg_k92.setVisibility(View.GONE);
                    lg_v60.setVisibility(View.GONE);
                    lg_velvet.setVisibility(View.GONE);
                    lg_wing.setVisibility(View.GONE);
                    s21_text.setVisibility(View.GONE);
                    s20_text.setVisibility(View.GONE);
                    s10_text.setVisibility(View.GONE);
                    s9_text.setVisibility(View.GONE);
                    iphone8_text.setVisibility(View.GONE);
                    iphonex_text.setVisibility(View.GONE);
                    iphone11_text.setVisibility(View.GONE);
                    iphone12_text.setVisibility(View.GONE);
                    k92_text.setVisibility(View.GONE);
                    v60_text.setVisibility(View.GONE);
                    velvet_text.setVisibility(View.GONE);
                    wing_text.setVisibility(View.GONE);
                    mate20x_text.setVisibility(View.GONE);
                    mate30_text.setVisibility(View.GONE);
                    mate40_text.setVisibility(View.GONE);
                    matex2_text.setVisibility(View.GONE);
                    mi10_text.setVisibility(View.GONE);
                    mi11_text.setVisibility(View.GONE);
                    m3_text.setVisibility(View.GONE);
                    x3_text.setVisibility(View.GONE);

                }
                if (!flag){
                    mate20x_text.setVisibility(View.GONE);
                    mate30_text.setVisibility(View.GONE);
                    mate40_text.setVisibility(View.GONE);
                    matex2_text.setVisibility(View.GONE);
                }
                flag = !flag;
            }
        });


        xiaomi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag) {
                    mi_10.setVisibility(View.VISIBLE);
                    mi_11.setVisibility(View.VISIBLE);
                    poco_m3.setVisibility(View.VISIBLE);
                    poco_x3.setVisibility(View.VISIBLE);
                    galaxy_s9.setVisibility(View.GONE);
                    galaxy_s10.setVisibility(View.GONE);
                    galaxy_s20.setVisibility(View.GONE);
                    galaxy_s21.setVisibility(View.GONE);
                    iphone_8.setVisibility(View.GONE);
                    iphone_x.setVisibility(View.GONE);
                    iphone_11.setVisibility(View.GONE);
                    iphone_12.setVisibility(View.GONE);
                    lg_k92.setVisibility(View.GONE);
                    lg_v60.setVisibility(View.GONE);
                    lg_velvet.setVisibility(View.GONE);
                    lg_wing.setVisibility(View.GONE);
                    mate_20x.setVisibility(View.GONE);
                    mate_30.setVisibility(View.GONE);
                    mate_40.setVisibility(View.GONE);
                    mate_x2.setVisibility(View.GONE);
                    s21_text.setVisibility(View.GONE);
                    s20_text.setVisibility(View.GONE);
                    s10_text.setVisibility(View.GONE);
                    s9_text.setVisibility(View.GONE);
                    iphone8_text.setVisibility(View.GONE);
                    iphonex_text.setVisibility(View.GONE);
                    iphone11_text.setVisibility(View.GONE);
                    iphone12_text.setVisibility(View.GONE);
                    k92_text.setVisibility(View.GONE);
                    v60_text.setVisibility(View.GONE);
                    velvet_text.setVisibility(View.GONE);
                    wing_text.setVisibility(View.GONE);
                    mate20x_text.setVisibility(View.GONE);
                    mate30_text.setVisibility(View.GONE);
                    mate40_text.setVisibility(View.GONE);
                    matex2_text.setVisibility(View.GONE);
                    mi10_text.setVisibility(View.GONE);
                    mi11_text.setVisibility(View.GONE);
                    m3_text.setVisibility(View.GONE);
                    x3_text.setVisibility(View.GONE);
                }
                if (!flag){
                    mi10_text.setVisibility(View.GONE);
                    mi11_text.setVisibility(View.GONE);
                    m3_text.setVisibility(View.GONE);
                    x3_text.setVisibility(View.GONE);
                }
                flag = !flag;

            }
        });

        galaxy_s21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag){
                    s21_text.setVisibility(View.VISIBLE);
                    s20_text.setVisibility(View.GONE);
                    s10_text.setVisibility(View.GONE);
                    s9_text.setVisibility(View.GONE);
                    iphone8_text.setVisibility(View.GONE);
                    iphonex_text.setVisibility(View.GONE);
                    iphone11_text.setVisibility(View.GONE);
                    iphone12_text.setVisibility(View.GONE);
                    k92_text.setVisibility(View.GONE);
                    v60_text.setVisibility(View.GONE);
                    velvet_text.setVisibility(View.GONE);
                    wing_text.setVisibility(View.GONE);
                    mate20x_text.setVisibility(View.GONE);
                    mate30_text.setVisibility(View.GONE);
                    mate40_text.setVisibility(View.GONE);
                    matex2_text.setVisibility(View.GONE);
                    mi10_text.setVisibility(View.GONE);
                    mi11_text.setVisibility(View.GONE);
                    m3_text.setVisibility(View.GONE);
                    x3_text.setVisibility(View.GONE);
                }
                if (!flag){
                    s21_text.setVisibility(View.GONE);
                }
                flag = !flag;
            }
        });

        galaxy_s20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag){
                    s21_text.setVisibility(View.GONE);
                    s20_text.setVisibility(View.VISIBLE);
                    s10_text.setVisibility(View.GONE);
                    s9_text.setVisibility(View.GONE);
                    iphone8_text.setVisibility(View.GONE);
                    iphonex_text.setVisibility(View.GONE);
                    iphone11_text.setVisibility(View.GONE);
                    iphone12_text.setVisibility(View.GONE);
                    k92_text.setVisibility(View.GONE);
                    v60_text.setVisibility(View.GONE);
                    velvet_text.setVisibility(View.GONE);
                    wing_text.setVisibility(View.GONE);
                    mate20x_text.setVisibility(View.GONE);
                    mate30_text.setVisibility(View.GONE);
                    mate40_text.setVisibility(View.GONE);
                    matex2_text.setVisibility(View.GONE);
                    mi10_text.setVisibility(View.GONE);
                    mi11_text.setVisibility(View.GONE);
                    m3_text.setVisibility(View.GONE);
                    x3_text.setVisibility(View.GONE);
                }
                if (!flag){
                    s20_text.setVisibility(View.GONE);
                }
                flag = !flag;
            }
        });

        galaxy_s10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag){
                    s21_text.setVisibility(View.GONE);
                    s20_text.setVisibility(View.GONE);
                    s10_text.setVisibility(View.VISIBLE);
                    s9_text.setVisibility(View.GONE);
                    iphone8_text.setVisibility(View.GONE);
                    iphonex_text.setVisibility(View.GONE);
                    iphone11_text.setVisibility(View.GONE);
                    iphone12_text.setVisibility(View.GONE);
                    k92_text.setVisibility(View.GONE);
                    v60_text.setVisibility(View.GONE);
                    velvet_text.setVisibility(View.GONE);
                    wing_text.setVisibility(View.GONE);
                    mate20x_text.setVisibility(View.GONE);
                    mate30_text.setVisibility(View.GONE);
                    mate40_text.setVisibility(View.GONE);
                    matex2_text.setVisibility(View.GONE);
                    mi10_text.setVisibility(View.GONE);
                    mi11_text.setVisibility(View.GONE);
                    m3_text.setVisibility(View.GONE);
                    x3_text.setVisibility(View.GONE);
                }
                if (!flag){
                    s10_text.setVisibility(View.GONE);
                }
                flag = !flag;
            }
        });

        galaxy_s9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag){
                    s21_text.setVisibility(View.GONE);
                    s20_text.setVisibility(View.GONE);
                    s10_text.setVisibility(View.GONE);
                    s9_text.setVisibility(View.VISIBLE);
                    iphone8_text.setVisibility(View.GONE);
                    iphonex_text.setVisibility(View.GONE);
                    iphone11_text.setVisibility(View.GONE);
                    iphone12_text.setVisibility(View.GONE);
                    k92_text.setVisibility(View.GONE);
                    v60_text.setVisibility(View.GONE);
                    velvet_text.setVisibility(View.GONE);
                    wing_text.setVisibility(View.GONE);
                    mate20x_text.setVisibility(View.GONE);
                    mate30_text.setVisibility(View.GONE);
                    mate40_text.setVisibility(View.GONE);
                    matex2_text.setVisibility(View.GONE);
                    mi10_text.setVisibility(View.GONE);
                    mi11_text.setVisibility(View.GONE);
                    m3_text.setVisibility(View.GONE);
                    x3_text.setVisibility(View.GONE);
                }
                if (!flag){
                    s9_text.setVisibility(View.GONE);
                }
                flag = !flag;
            }
        });

        iphone_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag){
                    s21_text.setVisibility(View.GONE);
                    s20_text.setVisibility(View.GONE);
                    s10_text.setVisibility(View.GONE);
                    s9_text.setVisibility(View.GONE);
                    iphone8_text.setVisibility(View.VISIBLE);
                    iphonex_text.setVisibility(View.GONE);
                    iphone11_text.setVisibility(View.GONE);
                    iphone12_text.setVisibility(View.GONE);
                    k92_text.setVisibility(View.GONE);
                    v60_text.setVisibility(View.GONE);
                    velvet_text.setVisibility(View.GONE);
                    wing_text.setVisibility(View.GONE);
                    mate20x_text.setVisibility(View.GONE);
                    mate30_text.setVisibility(View.GONE);
                    mate40_text.setVisibility(View.GONE);
                    matex2_text.setVisibility(View.GONE);
                    mi10_text.setVisibility(View.GONE);
                    mi11_text.setVisibility(View.GONE);
                    m3_text.setVisibility(View.GONE);
                    x3_text.setVisibility(View.GONE);
                }
                if (!flag){
                    iphone8_text.setVisibility(View.GONE);
                }
                flag = !flag;
            }
        });

        iphone_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag){
                    s21_text.setVisibility(View.GONE);
                    s20_text.setVisibility(View.GONE);
                    s10_text.setVisibility(View.GONE);
                    s9_text.setVisibility(View.GONE);
                    iphone8_text.setVisibility(View.GONE);
                    iphonex_text.setVisibility(View.VISIBLE);
                    iphone11_text.setVisibility(View.GONE);
                    iphone12_text.setVisibility(View.GONE);
                    k92_text.setVisibility(View.GONE);
                    v60_text.setVisibility(View.GONE);
                    velvet_text.setVisibility(View.GONE);
                    wing_text.setVisibility(View.GONE);
                    mate20x_text.setVisibility(View.GONE);
                    mate30_text.setVisibility(View.GONE);
                    mate40_text.setVisibility(View.GONE);
                    matex2_text.setVisibility(View.GONE);
                    mi10_text.setVisibility(View.GONE);
                    mi11_text.setVisibility(View.GONE);
                    m3_text.setVisibility(View.GONE);
                    x3_text.setVisibility(View.GONE);
                }
                if (!flag){
                    iphonex_text.setVisibility(View.GONE);
                }
                flag = !flag;
            }
        });

        iphone_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag){
                    s21_text.setVisibility(View.GONE);
                    s20_text.setVisibility(View.GONE);
                    s10_text.setVisibility(View.GONE);
                    s9_text.setVisibility(View.GONE);
                    iphone8_text.setVisibility(View.GONE);
                    iphonex_text.setVisibility(View.GONE);
                    iphone11_text.setVisibility(View.VISIBLE);
                    iphone12_text.setVisibility(View.GONE);
                    k92_text.setVisibility(View.GONE);
                    v60_text.setVisibility(View.GONE);
                    velvet_text.setVisibility(View.GONE);
                    wing_text.setVisibility(View.GONE);
                    mate20x_text.setVisibility(View.GONE);
                    mate30_text.setVisibility(View.GONE);
                    mate40_text.setVisibility(View.GONE);
                    matex2_text.setVisibility(View.GONE);
                    mi10_text.setVisibility(View.GONE);
                    mi11_text.setVisibility(View.GONE);
                    m3_text.setVisibility(View.GONE);
                    x3_text.setVisibility(View.GONE);
                }
                if (!flag){
                    iphone11_text.setVisibility(View.GONE);
                }
                flag = !flag;
            }
        });

        iphone_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag){
                    s21_text.setVisibility(View.GONE);
                    s20_text.setVisibility(View.GONE);
                    s10_text.setVisibility(View.GONE);
                    s9_text.setVisibility(View.GONE);
                    iphone8_text.setVisibility(View.GONE);
                    iphonex_text.setVisibility(View.GONE);
                    iphone11_text.setVisibility(View.GONE);
                    iphone12_text.setVisibility(View.VISIBLE);
                    k92_text.setVisibility(View.GONE);
                    v60_text.setVisibility(View.GONE);
                    velvet_text.setVisibility(View.GONE);
                    wing_text.setVisibility(View.GONE);
                    mate20x_text.setVisibility(View.GONE);
                    mate30_text.setVisibility(View.GONE);
                    mate40_text.setVisibility(View.GONE);
                    matex2_text.setVisibility(View.GONE);
                    mi10_text.setVisibility(View.GONE);
                    mi11_text.setVisibility(View.GONE);
                    m3_text.setVisibility(View.GONE);
                    x3_text.setVisibility(View.GONE);
                }
                if (!flag){
                    iphone12_text.setVisibility(View.GONE);
                }
                flag = !flag;
            }
        });

        lg_k92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag){
                    s21_text.setVisibility(View.GONE);
                    s20_text.setVisibility(View.GONE);
                    s10_text.setVisibility(View.GONE);
                    s9_text.setVisibility(View.GONE);
                    iphone8_text.setVisibility(View.GONE);
                    iphonex_text.setVisibility(View.GONE);
                    iphone11_text.setVisibility(View.GONE);
                    iphone12_text.setVisibility(View.GONE);
                    k92_text.setVisibility(View.VISIBLE);
                    v60_text.setVisibility(View.GONE);
                    velvet_text.setVisibility(View.GONE);
                    wing_text.setVisibility(View.GONE);
                    mate20x_text.setVisibility(View.GONE);
                    mate30_text.setVisibility(View.GONE);
                    mate40_text.setVisibility(View.GONE);
                    matex2_text.setVisibility(View.GONE);
                    mi10_text.setVisibility(View.GONE);
                    mi11_text.setVisibility(View.GONE);
                    m3_text.setVisibility(View.GONE);
                    x3_text.setVisibility(View.GONE);
                }
                if (!flag){
                    k92_text.setVisibility(View.GONE);
                }
                flag = !flag;
            }
        });

        lg_v60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag){
                    s21_text.setVisibility(View.GONE);
                    s20_text.setVisibility(View.GONE);
                    s10_text.setVisibility(View.GONE);
                    s9_text.setVisibility(View.GONE);
                    iphone8_text.setVisibility(View.GONE);
                    iphonex_text.setVisibility(View.GONE);
                    iphone11_text.setVisibility(View.GONE);
                    iphone12_text.setVisibility(View.GONE);
                    k92_text.setVisibility(View.GONE);
                    v60_text.setVisibility(View.VISIBLE);
                    velvet_text.setVisibility(View.GONE);
                    wing_text.setVisibility(View.GONE);
                    mate20x_text.setVisibility(View.GONE);
                    mate30_text.setVisibility(View.GONE);
                    mate40_text.setVisibility(View.GONE);
                    matex2_text.setVisibility(View.GONE);
                    mi10_text.setVisibility(View.GONE);
                    mi11_text.setVisibility(View.GONE);
                    m3_text.setVisibility(View.GONE);
                    x3_text.setVisibility(View.GONE);
                }
                if (!flag){
                    v60_text.setVisibility(View.GONE);
                }
                flag = !flag;
            }
        });

        lg_velvet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag){
                    s21_text.setVisibility(View.GONE);
                    s20_text.setVisibility(View.GONE);
                    s10_text.setVisibility(View.GONE);
                    s9_text.setVisibility(View.GONE);
                    iphone8_text.setVisibility(View.GONE);
                    iphonex_text.setVisibility(View.GONE);
                    iphone11_text.setVisibility(View.GONE);
                    iphone12_text.setVisibility(View.GONE);
                    k92_text.setVisibility(View.GONE);
                    v60_text.setVisibility(View.GONE);
                    velvet_text.setVisibility(View.VISIBLE);
                    wing_text.setVisibility(View.GONE);
                    mate20x_text.setVisibility(View.GONE);
                    mate30_text.setVisibility(View.GONE);
                    mate40_text.setVisibility(View.GONE);
                    matex2_text.setVisibility(View.GONE);
                    mi10_text.setVisibility(View.GONE);
                    mi11_text.setVisibility(View.GONE);
                    m3_text.setVisibility(View.GONE);
                    x3_text.setVisibility(View.GONE);
                }
                if (!flag){
                    velvet_text.setVisibility(View.GONE);
                }
                flag = !flag;
            }
        });

        lg_wing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag){
                    s21_text.setVisibility(View.GONE);
                    s20_text.setVisibility(View.GONE);
                    s10_text.setVisibility(View.GONE);
                    s9_text.setVisibility(View.GONE);
                    iphone8_text.setVisibility(View.GONE);
                    iphonex_text.setVisibility(View.GONE);
                    iphone11_text.setVisibility(View.GONE);
                    iphone12_text.setVisibility(View.GONE);
                    k92_text.setVisibility(View.GONE);
                    v60_text.setVisibility(View.GONE);
                    velvet_text.setVisibility(View.GONE);
                    wing_text.setVisibility(View.VISIBLE);
                    mate20x_text.setVisibility(View.GONE);
                    mate30_text.setVisibility(View.GONE);
                    mate40_text.setVisibility(View.GONE);
                    matex2_text.setVisibility(View.GONE);
                    mi10_text.setVisibility(View.GONE);
                    mi11_text.setVisibility(View.GONE);
                    m3_text.setVisibility(View.GONE);
                    x3_text.setVisibility(View.GONE);
                }
                if (!flag){
                    wing_text.setVisibility(View.GONE);
                }
                flag = !flag;
            }
        });

        mate_20x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag){
                    s21_text.setVisibility(View.GONE);
                    s20_text.setVisibility(View.GONE);
                    s10_text.setVisibility(View.GONE);
                    s9_text.setVisibility(View.GONE);
                    iphone8_text.setVisibility(View.GONE);
                    iphonex_text.setVisibility(View.GONE);
                    iphone11_text.setVisibility(View.GONE);
                    iphone12_text.setVisibility(View.GONE);
                    k92_text.setVisibility(View.GONE);
                    v60_text.setVisibility(View.GONE);
                    velvet_text.setVisibility(View.GONE);
                    wing_text.setVisibility(View.GONE);
                    mate20x_text.setVisibility(View.VISIBLE);
                    mate30_text.setVisibility(View.GONE);
                    mate40_text.setVisibility(View.GONE);
                    matex2_text.setVisibility(View.GONE);
                    mi10_text.setVisibility(View.GONE);
                    mi11_text.setVisibility(View.GONE);
                    m3_text.setVisibility(View.GONE);
                    x3_text.setVisibility(View.GONE);
                }
                if (!flag){
                    mate20x_text.setVisibility(View.GONE);
                }
                flag = !flag;
            }
        });

        mate_30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag){
                    s21_text.setVisibility(View.GONE);
                    s20_text.setVisibility(View.GONE);
                    s10_text.setVisibility(View.GONE);
                    s9_text.setVisibility(View.GONE);
                    iphone8_text.setVisibility(View.GONE);
                    iphonex_text.setVisibility(View.GONE);
                    iphone11_text.setVisibility(View.GONE);
                    iphone12_text.setVisibility(View.GONE);
                    k92_text.setVisibility(View.GONE);
                    v60_text.setVisibility(View.GONE);
                    velvet_text.setVisibility(View.GONE);
                    wing_text.setVisibility(View.GONE);
                    mate20x_text.setVisibility(View.GONE);
                    mate30_text.setVisibility(View.VISIBLE);
                    mate40_text.setVisibility(View.GONE);
                    matex2_text.setVisibility(View.GONE);
                    mi10_text.setVisibility(View.GONE);
                    mi11_text.setVisibility(View.GONE);
                    m3_text.setVisibility(View.GONE);
                    x3_text.setVisibility(View.GONE);
                }
                if (!flag){
                    mate30_text.setVisibility(View.GONE);
                }
                flag = !flag;
            }
        });

        mate_40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag){
                    s21_text.setVisibility(View.GONE);
                    s20_text.setVisibility(View.GONE);
                    s10_text.setVisibility(View.GONE);
                    s9_text.setVisibility(View.GONE);
                    iphone8_text.setVisibility(View.GONE);
                    iphonex_text.setVisibility(View.GONE);
                    iphone11_text.setVisibility(View.GONE);
                    iphone12_text.setVisibility(View.GONE);
                    k92_text.setVisibility(View.GONE);
                    v60_text.setVisibility(View.GONE);
                    velvet_text.setVisibility(View.GONE);
                    wing_text.setVisibility(View.GONE);
                    mate20x_text.setVisibility(View.GONE);
                    mate30_text.setVisibility(View.GONE);
                    mate40_text.setVisibility(View.VISIBLE);
                    matex2_text.setVisibility(View.GONE);
                    mi10_text.setVisibility(View.GONE);
                    mi11_text.setVisibility(View.GONE);
                    m3_text.setVisibility(View.GONE);
                    x3_text.setVisibility(View.GONE);
                }
                if (!flag){
                    mate40_text.setVisibility(View.GONE);
                }
                flag = !flag;
            }
        });

        mate_x2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag){
                    s21_text.setVisibility(View.GONE);
                    s20_text.setVisibility(View.GONE);
                    s10_text.setVisibility(View.GONE);
                    s9_text.setVisibility(View.GONE);
                    iphone8_text.setVisibility(View.GONE);
                    iphonex_text.setVisibility(View.GONE);
                    iphone11_text.setVisibility(View.GONE);
                    iphone12_text.setVisibility(View.GONE);
                    k92_text.setVisibility(View.GONE);
                    v60_text.setVisibility(View.GONE);
                    velvet_text.setVisibility(View.GONE);
                    wing_text.setVisibility(View.GONE);
                    mate20x_text.setVisibility(View.GONE);
                    mate30_text.setVisibility(View.GONE);
                    mate40_text.setVisibility(View.GONE);
                    matex2_text.setVisibility(View.VISIBLE);
                    mi10_text.setVisibility(View.GONE);
                    mi11_text.setVisibility(View.GONE);
                    m3_text.setVisibility(View.GONE);
                    x3_text.setVisibility(View.GONE);
                }
                if (!flag){
                    matex2_text.setVisibility(View.GONE);
                }
                flag = !flag;
            }
        });

        mi_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag){
                    s21_text.setVisibility(View.GONE);
                    s20_text.setVisibility(View.GONE);
                    s10_text.setVisibility(View.GONE);
                    s9_text.setVisibility(View.GONE);
                    iphone8_text.setVisibility(View.GONE);
                    iphonex_text.setVisibility(View.GONE);
                    iphone11_text.setVisibility(View.GONE);
                    iphone12_text.setVisibility(View.GONE);
                    k92_text.setVisibility(View.GONE);
                    v60_text.setVisibility(View.GONE);
                    velvet_text.setVisibility(View.GONE);
                    wing_text.setVisibility(View.GONE);
                    mate20x_text.setVisibility(View.GONE);
                    mate30_text.setVisibility(View.GONE);
                    mate40_text.setVisibility(View.GONE);
                    matex2_text.setVisibility(View.GONE);
                    mi10_text.setVisibility(View.VISIBLE);
                    mi11_text.setVisibility(View.GONE);
                    m3_text.setVisibility(View.GONE);
                    x3_text.setVisibility(View.GONE);
                }
                if (!flag){
                    mi10_text.setVisibility(View.GONE);
                }
                flag = !flag;
            }
        });

        mi_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag){
                    s21_text.setVisibility(View.GONE);
                    s20_text.setVisibility(View.GONE);
                    s10_text.setVisibility(View.GONE);
                    s9_text.setVisibility(View.GONE);
                    iphone8_text.setVisibility(View.GONE);
                    iphonex_text.setVisibility(View.GONE);
                    iphone11_text.setVisibility(View.GONE);
                    iphone12_text.setVisibility(View.GONE);
                    k92_text.setVisibility(View.GONE);
                    v60_text.setVisibility(View.GONE);
                    velvet_text.setVisibility(View.GONE);
                    wing_text.setVisibility(View.GONE);
                    mate20x_text.setVisibility(View.GONE);
                    mate30_text.setVisibility(View.GONE);
                    mate40_text.setVisibility(View.GONE);
                    matex2_text.setVisibility(View.GONE);
                    mi10_text.setVisibility(View.GONE);
                    mi11_text.setVisibility(View.VISIBLE);
                    m3_text.setVisibility(View.GONE);
                    x3_text.setVisibility(View.GONE);
                }
                if (!flag){
                    mi11_text.setVisibility(View.GONE);
                }
                flag = !flag;
            }
        });

        poco_m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag){
                    s21_text.setVisibility(View.GONE);
                    s20_text.setVisibility(View.GONE);
                    s10_text.setVisibility(View.GONE);
                    s9_text.setVisibility(View.GONE);
                    iphone8_text.setVisibility(View.GONE);
                    iphonex_text.setVisibility(View.GONE);
                    iphone11_text.setVisibility(View.GONE);
                    iphone12_text.setVisibility(View.GONE);
                    k92_text.setVisibility(View.GONE);
                    v60_text.setVisibility(View.GONE);
                    velvet_text.setVisibility(View.GONE);
                    wing_text.setVisibility(View.GONE);
                    mate20x_text.setVisibility(View.GONE);
                    mate30_text.setVisibility(View.GONE);
                    mate40_text.setVisibility(View.GONE);
                    matex2_text.setVisibility(View.GONE);
                    mi10_text.setVisibility(View.GONE);
                    mi11_text.setVisibility(View.GONE);
                    m3_text.setVisibility(View.VISIBLE);
                    x3_text.setVisibility(View.GONE);
                }
                if (!flag){
                    m3_text.setVisibility(View.GONE);
                }
                flag = !flag;
            }
        });

        poco_x3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag){
                    s21_text.setVisibility(View.GONE);
                    s20_text.setVisibility(View.GONE);
                    s10_text.setVisibility(View.GONE);
                    s9_text.setVisibility(View.GONE);
                    iphone8_text.setVisibility(View.GONE);
                    iphonex_text.setVisibility(View.GONE);
                    iphone11_text.setVisibility(View.GONE);
                    iphone12_text.setVisibility(View.GONE);
                    k92_text.setVisibility(View.GONE);
                    v60_text.setVisibility(View.GONE);
                    velvet_text.setVisibility(View.GONE);
                    wing_text.setVisibility(View.GONE);
                    mate20x_text.setVisibility(View.GONE);
                    mate30_text.setVisibility(View.GONE);
                    mate40_text.setVisibility(View.GONE);
                    matex2_text.setVisibility(View.GONE);
                    mi10_text.setVisibility(View.GONE);
                    mi11_text.setVisibility(View.GONE);
                    m3_text.setVisibility(View.GONE);
                    x3_text.setVisibility(View.VISIBLE);
                }
                if (!flag){
                    x3_text.setVisibility(View.GONE);
                }
                flag = !flag;
            }
        });
        }
    }