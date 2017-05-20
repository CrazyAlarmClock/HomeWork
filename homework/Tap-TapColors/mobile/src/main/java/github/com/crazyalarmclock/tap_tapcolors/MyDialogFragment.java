package github.com.crazyalarmclock.tap_tapcolors;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.widget.Toast;

/**
 * Created by Pavel on 18.05.2017.
 */
//
//public class MyDialogFragment extends android.support.v4.app.DialogFragment {
//    Context context;
//    @NonNull
//    @Override
//    public Dialog onCreateDialog(Bundle savedInstanceState) {
//        Context mContext;
//        String title = "Game over";
//        String message = "Continue?" ;
//        String button1String = "yes";
//        String button2String = "no";
//
//        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
//        builder.setTitle(title);
//        builder.setMessage(message);
//
//        builder.setPositiveButton(button1String, new DialogInterface.OnClickListener() {
//            public void onClick(DialogInterface dialog, int id) {
//                context.startActivity(new Intent(context,MainActivity.class));
//
//
//            }
//        });
//        builder.setNegativeButton(button2String, new DialogInterface.OnClickListener() {
//            public void onClick(DialogInterface dialog, int id) {
//
//            }
//        });
//
//
//        builder.setCancelable(true);
//
//        return builder.create();
//    }
//
//
//}