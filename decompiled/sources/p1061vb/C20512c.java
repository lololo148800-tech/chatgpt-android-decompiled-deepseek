package p1061vb;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;
import p1104xb.InterfaceC21170a;
import p523V9.AbstractC7854B5;
import p523V9.AbstractC8151n5;
import p746fa.C13606o;
import p832jb.C16183c;

/* JADX INFO: renamed from: vb.c */
/* JADX INFO: loaded from: classes.dex */
public final class C20512c implements InterfaceC20514e, InterfaceC20515f {

    /* JADX INFO: renamed from: a */
    public final C16183c f65124a;

    /* JADX INFO: renamed from: b */
    public final Context f65125b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC21170a f65126c;

    /* JADX INFO: renamed from: d */
    public final Set f65127d;

    /* JADX INFO: renamed from: e */
    public final Executor f65128e;

    public C20512c(Context context, String str, Set set, InterfaceC21170a interfaceC21170a, Executor executor) {
        this.f65124a = new C16183c(context, str);
        this.f65127d = set;
        this.f65128e = executor;
        this.f65126c = interfaceC21170a;
        this.f65125b = context;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized int m21164a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C20516g c20516g = (C20516g) this.f65124a.get();
        if (!c20516g.m21180i(jCurrentTimeMillis)) {
            return 1;
        }
        c20516g.m21178g();
        return 3;
    }

    /* JADX INFO: renamed from: b */
    public final C13606o m21165b() {
        if (!AbstractC8151n5.m8695c(this.f65125b)) {
            return AbstractC7854B5.m8117e("");
        }
        return AbstractC7854B5.m8115c(this.f65128e, new CallableC20511b(this, 1));
    }

    /* JADX INFO: renamed from: c */
    public final void m21166c() {
        if (this.f65127d.size() <= 0) {
            AbstractC7854B5.m8117e(null);
        } else if (!AbstractC8151n5.m8695c(this.f65125b)) {
            AbstractC7854B5.m8117e(null);
        } else {
            AbstractC7854B5.m8115c(this.f65128e, new CallableC20511b(this, 0));
        }
    }
}
