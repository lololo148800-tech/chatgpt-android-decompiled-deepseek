package p414R;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.fragment.app.OwC.wNrQXvwLiB;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p004A2.InterfaceC0310a;
import p178H.C3151j;
import p178H.C3162o0;
import p178H.C3170s0;
import p178H.InterfaceC3168r0;
import p178H.RunnableC3154k0;
import p228J.C3809K;
import p228J.C3836g;
import p228J.InterfaceC3870x;
import p283L5.AbstractC4941g;
import p301M.AbstractC5229k;
import p329N3.RunnableC5611a;
import p544W9.AbstractC8488H2;
import p544W9.AbstractC8577W2;
import p817j$.util.Objects;

/* JADX INFO: renamed from: R.l */
/* JADX INFO: loaded from: classes.dex */
public final class C6778l {

    /* JADX INFO: renamed from: a */
    public final int f21762a;

    /* JADX INFO: renamed from: b */
    public final Matrix f21763b;

    /* JADX INFO: renamed from: c */
    public final boolean f21764c;

    /* JADX INFO: renamed from: d */
    public final Rect f21765d;

    /* JADX INFO: renamed from: e */
    public final boolean f21766e;

    /* JADX INFO: renamed from: f */
    public final int f21767f;

    /* JADX INFO: renamed from: g */
    public final C3836g f21768g;

    /* JADX INFO: renamed from: h */
    public int f21769h;

    /* JADX INFO: renamed from: i */
    public int f21770i;

    /* JADX INFO: renamed from: k */
    public C3170s0 f21772k;

    /* JADX INFO: renamed from: l */
    public C6777k f21773l;

    /* JADX INFO: renamed from: j */
    public boolean f21771j = false;

    /* JADX INFO: renamed from: m */
    public final HashSet f21774m = new HashSet();

    /* JADX INFO: renamed from: n */
    public boolean f21775n = false;

    /* JADX INFO: renamed from: o */
    public final ArrayList f21776o = new ArrayList();

    public C6778l(int i10, int i11, C3836g c3836g, Matrix matrix, boolean z6, Rect rect, int i12, int i13, boolean z10) {
        this.f21767f = i10;
        this.f21762a = i11;
        this.f21768g = c3836g;
        this.f21763b = matrix;
        this.f21764c = z6;
        this.f21765d = rect;
        this.f21770i = i12;
        this.f21769h = i13;
        this.f21766e = z10;
        this.f21773l = new C6777k(c3836g.f11606a, i11);
    }

    /* JADX INFO: renamed from: a */
    public final void m7223a() {
        AbstractC4941g.m5559R("Edge is already closed.", !this.f21775n);
    }

    /* JADX INFO: renamed from: b */
    public final void m7224b() {
        AbstractC8488H2.m9140a();
        this.f21773l.mo4507a();
        this.f21775n = true;
    }

    /* JADX INFO: renamed from: d */
    public final void m7226d() {
        boolean z6;
        AbstractC8488H2.m9140a();
        m7223a();
        C6777k c6777k = this.f21773l;
        c6777k.getClass();
        AbstractC8488H2.m9140a();
        if (c6777k.f21760q == null) {
            synchronized (c6777k.f11526a) {
                z6 = c6777k.f11528c;
            }
            if (!z6) {
                return;
            }
        }
        this.f21771j = false;
        this.f21773l.mo4507a();
        this.f21773l = new C6777k(this.f21768g.f11606a, this.f21762a);
        Iterator it = this.f21774m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7227e() {
        InterfaceC3168r0 interfaceC3168r0;
        Executor executor;
        AbstractC8488H2.m9140a();
        C3151j c3151j = new C3151j(this.f21765d, this.f21770i, this.f21769h, this.f21764c, this.f21763b, this.f21766e);
        C3170s0 c3170s0 = this.f21772k;
        if (c3170s0 != null) {
            synchronized (c3170s0.f9534a) {
                c3170s0.f9545l = c3151j;
                interfaceC3168r0 = c3170s0.f9546m;
                executor = c3170s0.f9547n;
            }
            if (interfaceC3168r0 != null && executor != null) {
                executor.execute(new RunnableC3154k0(interfaceC3168r0, c3151j, 0));
            }
        }
        Iterator it = this.f21776o.iterator();
        while (it.hasNext()) {
            ((InterfaceC0310a) it.next()).accept(c3151j);
        }
    }

    /* JADX INFO: renamed from: c */
    public final C3170s0 m7225c(InterfaceC3870x interfaceC3870x, boolean z6) {
        AbstractC8488H2.m9140a();
        m7223a();
        C3836g c3836g = this.f21768g;
        C3170s0 c3170s0 = new C3170s0(c3836g.f11606a, interfaceC3870x, z6, c3836g.f11607b, new RunnableC6774h(this, 0));
        try {
            C3162o0 c3162o0 = c3170s0.f9544k;
            C6777k c6777k = this.f21773l;
            Objects.requireNonNull(c6777k);
            if (c6777k.m7222g(c3162o0, new RunnableC6775i(c6777k, 0))) {
                AbstractC5229k.m5780d(c6777k.f11530e).mo5766a(new RunnableC5611a(c3162o0, 4), AbstractC8577W2.m9240b());
            }
            this.f21772k = c3170s0;
            m7227e();
            return c3170s0;
        } catch (C3809K e10) {
            throw new AssertionError(wNrQXvwLiB.JHimQgGXcPPYnve, e10);
        } catch (RuntimeException e11) {
            c3170s0.m4001c();
            throw e11;
        }
    }
}
