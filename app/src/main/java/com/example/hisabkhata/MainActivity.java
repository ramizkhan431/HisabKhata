package com.example.hisabkhata;

import android.content.DialogInterface;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    boolean doubleBackToExitPressedOnce = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AutoCompleteTextView Name1,Name2,Name3,Name4;
         final EditText Score1,Score2,Score3,Score4;
         final TextView TextScore1,TextScore2,TextScore3,TextScore4,TextTotal1,TextTotal2,TextTotal3,TextTotal4;
        Button ButtonSubmit1,ButtonSubmit2,ButtonSubmit3,ButtonSubmit4;

        String[] name = getResources().getStringArray(R.array.name);
        ArrayAdapter<String> adapterN = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,name);
        Name1=findViewById(R.id.editText);
        Name2=findViewById(R.id.editText2);

        Name1.setAdapter(adapterN);

        String[] name2 = getResources().getStringArray(R.array.name);
        ArrayAdapter<String> adapterN2 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,name2);
        Name2.setAdapter(adapterN2);

        String[] name3 = getResources().getStringArray(R.array.name);
        ArrayAdapter<String> adapterN3 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,name3);
        Name3=findViewById(R.id.editText3);
        Name3.setAdapter(adapterN3);

        String[] name4 = getResources().getStringArray(R.array.name);
        ArrayAdapter<String> adapterN4 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,name4);
        Name4=findViewById(R.id.editText4);
        Name4.setAdapter(adapterN4);

        ListView lv1,lv2,lv3,lv4;

        final ArrayList<Integer> arrayList;
        final ArrayAdapter<Integer> adapter;

        final ArrayList<Integer> arrayList2;
        final ArrayAdapter<Integer> adapter2;

        final ArrayList<Integer> arrayList3;
        final ArrayAdapter<Integer> adapter3;

        final ArrayList<Integer> arrayList4;
        final ArrayAdapter<Integer> adapter4;


        Name2=findViewById(R.id.editText2);
        Name3=findViewById(R.id.editText3);
        Name4=findViewById(R.id.editText4);


        Score1=findViewById(R.id.edit_enter_score1);
        Score2=findViewById(R.id.edit_enter_score2);
        Score3=findViewById(R.id.edit_enter_score3);
        Score4=findViewById(R.id.edit_enter_score4);

        ButtonSubmit1=findViewById(R.id.button1);
        ButtonSubmit2=findViewById(R.id.button2);
        ButtonSubmit3=findViewById(R.id.button3);
        ButtonSubmit4=findViewById(R.id.button4);

        lv1=(ListView) findViewById(R.id.textScore1);
        lv2=(ListView) findViewById(R.id.textScore2);
        lv3=(ListView) findViewById(R.id.textScore3);
        lv4=(ListView) findViewById(R.id.textScore4);



        TextTotal1=findViewById(R.id.text_total1);
        TextTotal2=findViewById(R.id.text_total2);
        TextTotal3=findViewById(R.id.text_total3);
        TextTotal4=findViewById(R.id.text_total4);

        arrayList = new ArrayList<Integer>();
        adapter = new ArrayAdapter<Integer>(this,R.layout.rowlayout,R.id.txt,arrayList);
        lv1.setAdapter(adapter);
        adapter.notifyDataSetChanged();





        //second column
        arrayList2 = new ArrayList<Integer>();
        adapter2 = new ArrayAdapter<Integer>(this,R.layout.rowlayout,R.id.txt,arrayList2);
        lv2.setAdapter(adapter2);

        //third column
        arrayList3 = new ArrayList<Integer>();
        adapter3 = new ArrayAdapter<Integer>(this,R.layout.rowlayout,R.id.txt,arrayList3);
        lv3.setAdapter(adapter3);

        //fourth column
        arrayList4 = new ArrayList<Integer>();
        adapter4 = new ArrayAdapter<Integer>(this,R.layout.rowlayout,R.id.txt,arrayList4);
        lv4.setAdapter(adapter4);

         ButtonSubmit1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {


                 if (TextUtils.isEmpty(Score1.getText()))
                 {
                     Score1.setError("Nothing");
                 }
                 else

                 {


                     int a = Integer.parseInt(Score1.getText().toString());

                     int sum = a;
                     for (int i = 0; i < arrayList.toArray().length; i++) {
                         sum = sum + arrayList.get(i);
                     }
                     TextTotal1.setText("" + sum);

                     int result = Integer.parseInt(Score1.getText().toString());

                     arrayList.add(Integer.valueOf(String.valueOf(result)));
                     adapter.notifyDataSetChanged();
                     Score1.setText("");
                 }

             }
         });
        ButtonSubmit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(Score2.getText()))
                {
                    Score2.setError("Nothing");
                }
                else {

                    int a = Integer.parseInt(Score2.getText().toString());
                    int sum = a;
                    for (int i = 0; i < arrayList2.toArray().length; i++) {
                        sum = sum + arrayList2.get(i);
                    }

                    TextTotal2.setText("" + sum);


                    int result = Integer.parseInt(Score2.getText().toString());

                    arrayList2.add(Integer.valueOf(String.valueOf(result)));
                    adapter2.notifyDataSetChanged();
                    Score2.setText("");
                }

            }
        });

        ButtonSubmit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(Score3.getText()))
                {
                    Score3.setError("Nothing");
                }
                else {

                    int a = Integer.parseInt(Score3.getText().toString());
                    int sum = a;
                    for (int i = 0; i < arrayList3.toArray().length; i++) {
                        sum = sum + arrayList3.get(i);
                    }

                    TextTotal3.setText("" + sum);


                    int result = Integer.parseInt(Score3.getText().toString());

                    arrayList3.add(Integer.valueOf(String.valueOf(result)));
                    adapter3.notifyDataSetChanged();
                    Score3.setText("");
                }

            }
        });

        ButtonSubmit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(Score4.getText()))
                {
                    Score4.setError("Nothing");
                }
                else {

                    int a = Integer.parseInt(Score4.getText().toString());
                    int sum = a;
                    for (int i = 0; i < arrayList4.toArray().length; i++) {
                        sum = sum + arrayList4.get(i);
                    }

                    TextTotal4.setText("" + sum);


                    int result = Integer.parseInt(Score4.getText().toString());

                    arrayList4.add(Integer.valueOf(String.valueOf(result)));
                    adapter4.notifyDataSetChanged();
                    Score4.setText("");
                }

            }
        });

        ////
        ///
        //
        //
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "point : " +adapter.getItem(position), Toast.LENGTH_SHORT).show();
            }
        });

        lv1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                //
                final int t=adapter.getItem(position);
                //
                final int which_item = position;
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Are you sure?")
                        .setMessage("you want to delete this number")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                arrayList.remove(which_item);
                                adapter.notifyDataSetChanged();

                                ////////////////////////
                                int a = Integer.parseInt(TextTotal1.getText().toString());
                                int sum = a-t;
                                TextTotal1.setText(""+sum);
//
                                adapter.notifyDataSetChanged();
                                Score1.setText("");
                                //////////////////////

                            }
                        })
                       .setNegativeButton("No",null)
                        .show();
                return true;
            }
        });

        ////

        //// list view 2
        ///
        //
        //
        lv2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "point : " +adapter2.getItem(position), Toast.LENGTH_SHORT).show();
            }
        });

        lv2.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                //
                final int t=adapter2.getItem(position);
                //
                final int which_item = position;
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Are you sure?")
                        .setMessage("you want to delete this number")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                arrayList2.remove(which_item);
                                adapter2.notifyDataSetChanged();

                                ////////////////////////
                                int a = Integer.parseInt(TextTotal2.getText().toString());
                                int sum = a-t;
                                TextTotal2.setText(""+sum);
//
                                adapter2.notifyDataSetChanged();
                                Score2.setText("");
                                //////////////////////

                            }
                        })
                        .setNegativeButton("No",null)
                        .show();
                return true;
            }
        });

        ////

        //// list view 3
        ///
        //
        //
        lv3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "point : " +adapter3.getItem(position), Toast.LENGTH_SHORT).show();
            }
        });

        lv3.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                //
                final int t=adapter3.getItem(position);
                //
                final int which_item = position;
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Are you sure?")
                        .setMessage("you want to delete this number")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                arrayList3.remove(which_item);
                                adapter3.notifyDataSetChanged();

                                ////////////////////////
                                int a = Integer.parseInt(TextTotal3.getText().toString());
                                int sum = a-t;
                                TextTotal3.setText(""+sum);
//
                                adapter3.notifyDataSetChanged();
                                Score3.setText("");
                                //////////////////////

                            }
                        })
                        .setNegativeButton("No",null)
                        .show();
                return true;
            }
        });

        ////

        //// list view 4
        ///
        //
        //
        lv4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "point : " +adapter4.getItem(position), Toast.LENGTH_SHORT).show();
            }
        });

        lv4.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                //
                final int t=adapter4.getItem(position);
                //
                final int which_item = position;
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Are you sure?")
                        .setMessage("you want to delete this number")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                arrayList4.remove(which_item);
                                adapter4.notifyDataSetChanged();

                                ////////////////////////
                                int a = Integer.parseInt(TextTotal4.getText().toString());
                                int sum = a-t;
                                TextTotal4.setText(""+sum);
//
                                adapter4.notifyDataSetChanged();
                                Score4.setText("");
                                //////////////////////

                            }
                        })
                        .setNegativeButton("No",null)
                        .show();
                return true;
            }
        });

        ////
    }
    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }
}
