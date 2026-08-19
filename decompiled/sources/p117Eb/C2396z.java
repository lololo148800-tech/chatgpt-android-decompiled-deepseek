package p117Eb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: Eb.z */
/* JADX INFO: loaded from: classes.dex */
public final class C2396z {

    /* JADX INFO: renamed from: d */
    public static WeakReference f7454d;

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f7455a;

    /* JADX INFO: renamed from: b */
    public C2392v f7456b;

    /* JADX INFO: renamed from: c */
    public final ScheduledThreadPoolExecutor f7457c;

    public C2396z(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f7457c = scheduledThreadPoolExecutor;
        this.f7455a = sharedPreferences;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized C2395y m3573a() {
        C2395y c2395y;
        String strM3532D = this.f7456b.m3532D();
        Pattern pattern = C2395y.f7450d;
        c2395y = null;
        if (!TextUtils.isEmpty(strM3532D)) {
            String[] strArrSplit = strM3532D.split("!", -1);
            if (strArrSplit.length == 2) {
                c2395y = new C2395y(strArrSplit[0], strArrSplit[1]);
            }
        }
        return c2395y;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m3574b() {
        this.f7456b = C2392v.m3528q(this.f7455a, this.f7457c);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m3575c(C2395y c2395y) {
        this.f7456b.m3534F(c2395y.f7453c);
    }
}
