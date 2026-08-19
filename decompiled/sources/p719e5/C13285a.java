package p719e5;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import p025An.AbstractC0563B;
import p025An.AbstractC0575H;
import p277L.ExecutorC4833f;
import p501Ub.ExecutorC7613o;

/* JADX INFO: renamed from: e5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C13285a {

    /* JADX INFO: renamed from: a */
    public final ExecutorC7613o f41990a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0563B f41991b;

    /* JADX INFO: renamed from: c */
    public final Handler f41992c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d */
    public final ExecutorC4833f f41993d = new ExecutorC4833f(this);

    public C13285a(ExecutorService executorService) {
        ExecutorC7613o executorC7613o = new ExecutorC7613o(executorService);
        this.f41990a = executorC7613o;
        this.f41991b = AbstractC0575H.m1189r(executorC7613o);
    }

    /* JADX INFO: renamed from: a */
    public final void m14897a(Runnable runnable) {
        this.f41990a.execute(runnable);
    }
}
