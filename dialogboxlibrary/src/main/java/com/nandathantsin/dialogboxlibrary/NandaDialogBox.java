package com.nandathantsin.dialogboxlibrary;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class NandaDialogBox {
    public static void build(Context c,String message){
        final Context context=c;
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView(R.layout.dialog);
        final Dialog dialog=builder.create();
        dialog.setCanceledOnTouchOutside(false);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
        TextView textMessage=(TextView) dialog.findViewById(R.id.aboutApp);
        textMessage.setText(message);
        Button bb=(Button)dialog.findViewById(R.id.okButton);
        bb.setText("YES");
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"You clicked yes",Toast.LENGTH_SHORT).show();
                dialog.cancel();
            }
        });
    }
}
