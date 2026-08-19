package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.File;
import p032B4.AbstractC0809d;
import p127El.ExecutorC2575a;
import p960q9.C18655i;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws Throwable {
        Bundle extras;
        File codeCacheDir;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            AbstractC0809d.m1867t(context, new ExecutorC2575a(1), new C18655i(this, 3), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                C18655i c18655i = new C18655i(this, 3);
                try {
                    AbstractC0809d.m1852e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    c18655i.mo1846i(null, 10);
                    return;
                } catch (PackageManager.NameNotFoundException e10) {
                    c18655i.mo1846i(e10, 7);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            C18655i c18655i2 = new C18655i(this, 3);
            int iMyPid = Process.myPid();
            if (Build.VERSION.SDK_INT < 24) {
                c18655i2.mo1846i(null, 13);
                return;
            } else {
                Process.sendSignal(iMyPid, 10);
                c18655i2.mo1846i(null, 12);
                return;
            }
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        C18655i c18655i3 = new C18655i(this, 3);
        if (!"DROP_SHADER_CACHE".equals(string2)) {
            if (!"SAVE_PROFILE".equals(string2)) {
                c18655i3.mo1846i(null, 16);
                return;
            }
            int i10 = extras.getInt("EXTRA_PID", Process.myPid());
            if (Build.VERSION.SDK_INT < 24) {
                c18655i3.mo1846i(null, 13);
                return;
            } else {
                Process.sendSignal(i10, 10);
                c18655i3.mo1846i(null, 12);
                return;
            }
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            codeCacheDir = context.createDeviceProtectedStorageContext().getCacheDir();
        } else if (i11 >= 24) {
            codeCacheDir = context.createDeviceProtectedStorageContext().getCodeCacheDir();
        } else {
            codeCacheDir = i11 == 23 ? context.getCodeCacheDir() : context.getCacheDir();
        }
        if (AbstractC0809d.m1850c(codeCacheDir)) {
            c18655i3.mo1846i(null, 14);
        } else {
            c18655i3.mo1846i(null, 15);
        }
    }
}
