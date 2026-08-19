package p444S4;

import android.os.Build;
import java.util.concurrent.ExecutorService;
import p028B.C0707n;
import p571X9.AbstractC9351q3;

/* JADX INFO: renamed from: S4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6995a {

    /* JADX INFO: renamed from: a */
    public final ExecutorService f22377a = AbstractC9351q3.m9941a(false);

    /* JADX INFO: renamed from: b */
    public final ExecutorService f22378b = AbstractC9351q3.m9941a(true);

    /* JADX INFO: renamed from: c */
    public final C7012r f22379c = new C7012r();

    /* JADX INFO: renamed from: d */
    public final C6994B f22380d = new C6994B();

    /* JADX INFO: renamed from: e */
    public final C7012r f22381e = C7012r.f22423a;

    /* JADX INFO: renamed from: f */
    public final C0707n f22382f = new C0707n();

    /* JADX INFO: renamed from: g */
    public final int f22383g = 4;

    /* JADX INFO: renamed from: h */
    public final int f22384h = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: i */
    public final int f22385i;

    /* JADX INFO: renamed from: j */
    public final int f22386j;

    public C6995a(C7012r c7012r) {
        this.f22386j = Build.VERSION.SDK_INT == 23 ? 10 : 20;
        this.f22385i = 8;
    }
}
