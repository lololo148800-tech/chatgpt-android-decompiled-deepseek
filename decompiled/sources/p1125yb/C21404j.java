package p1125yb;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p1061vb.C20513d;
import p1148zb.C21830a;

/* JADX INFO: renamed from: yb.j */
/* JADX INFO: loaded from: classes.dex */
public final class C21404j {

    /* JADX INFO: renamed from: b */
    public static final long f67945b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c */
    public static final Pattern f67946c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d */
    public static C21404j f67947d;

    /* JADX INFO: renamed from: a */
    public final C20513d f67948a;

    public C21404j(C20513d c20513d) {
        this.f67948a = c20513d;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21793a(C21830a c21830a) {
        if (TextUtils.isEmpty(c21830a.f69282c)) {
            return true;
        }
        long j10 = c21830a.f69285f + c21830a.f69284e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f67948a.getClass();
        return j10 < timeUnit.toSeconds(System.currentTimeMillis()) + f67945b;
    }
}
