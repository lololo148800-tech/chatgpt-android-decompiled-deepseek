package p1073w3;

import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: renamed from: w3.q */
/* JADX INFO: loaded from: classes.dex */
public final class C20815q {

    /* JADX INFO: renamed from: b */
    public static final ArrayList f66100b = new ArrayList(50);

    /* JADX INFO: renamed from: a */
    public final Handler f66101a;

    public C20815q(Handler handler) {
        this.f66101a = handler;
    }

    /* JADX INFO: renamed from: b */
    public static C20814p m21375b() {
        C20814p c20814p;
        ArrayList arrayList = f66100b;
        synchronized (arrayList) {
            try {
                c20814p = arrayList.isEmpty() ? new C20814p() : (C20814p) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c20814p;
    }

    /* JADX INFO: renamed from: a */
    public final C20814p m21376a(int i10, Object obj) {
        C20814p c20814pM21375b = m21375b();
        c20814pM21375b.f66099a = this.f66101a.obtainMessage(i10, obj);
        return c20814pM21375b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m21377c(Runnable runnable) {
        return this.f66101a.post(runnable);
    }

    /* JADX INFO: renamed from: d */
    public final void m21378d(int i10) {
        AbstractC20800b.m21316d(i10 != 0);
        this.f66101a.removeMessages(i10);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m21379e(int i10) {
        return this.f66101a.sendEmptyMessage(i10);
    }
}
