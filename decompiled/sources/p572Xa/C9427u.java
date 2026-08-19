package p572Xa;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;
import p003A1.AbstractC0168G;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Xa.u */
/* JADX INFO: loaded from: classes.dex */
public final class C9427u {

    /* JADX INFO: renamed from: a */
    public final String f28406a;

    public C9427u(String str) {
        this.f28406a = AbstractC0168G.m532u("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat(str);
    }

    /* JADX INFO: renamed from: c */
    public static String m9998c(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e10) {
                Log.e("PlayCore", "Unable to format ".concat(String.valueOf(str2)), e10);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return AbstractC9306j0.m9890i(str, " : ", str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m9999a(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", m9998c(this.f28406a, str, objArr), remoteException);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10000b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", m9998c(this.f28406a, str, objArr));
        }
    }
}
