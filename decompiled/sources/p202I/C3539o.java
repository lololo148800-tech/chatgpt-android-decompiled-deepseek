package p202I;

import android.javax.sip.C10808o;
import android.util.Log;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import p001A.C0063g0;
import p001A.RunnableC0074m;
import p117Eb.C2385o;
import p117Eb.C2392v;
import p178H.AbstractC3182z;
import p178H.C3123P;
import p178H.C3124Q;
import p178H.C3162o0;
import p178H.C3173u;
import p178H.InterfaceC3181y;
import p228J.C3799E;
import p228J.C3801F;
import p228J.C3815Q;
import p228J.C3825a0;
import p228J.C3828c;
import p228J.C3829c0;
import p253K.AbstractC4503n;
import p283L5.AbstractC4941g;
import p301M.AbstractC5229k;
import p301M.RunnableC5220b;
import p301M.RunnableC5228j;
import p348O.AbstractC5939a;
import p477Tb.C7296c;
import p544W9.AbstractC8488H2;
import p544W9.AbstractC8577W2;
import p571X9.AbstractC9288g0;
import p610Z1.C10145l;
import p658b5.C11232c;
import p658b5.C11234e;
import p817j$.util.Objects;
import p861l1.xapn.suYVq;

/* JADX INFO: renamed from: I.o */
/* JADX INFO: loaded from: classes.dex */
public final class C3539o implements InterfaceC3181y {

    /* JADX INFO: renamed from: Z */
    public final C10808o f10714Z;

    /* JADX INFO: renamed from: o0 */
    public C2392v f10715o0;

    /* JADX INFO: renamed from: p0 */
    public C3537m f10716p0;

    /* JADX INFO: renamed from: q0 */
    public final ArrayList f10717q0;

    /* JADX INFO: renamed from: Y */
    public final ArrayDeque f10713Y = new ArrayDeque();

    /* JADX INFO: renamed from: r0 */
    public boolean f10718r0 = false;

    public C3539o(C10808o c10808o) {
        AbstractC8488H2.m9140a();
        this.f10714Z = c10808o;
        this.f10717q0 = new ArrayList();
    }

    @Override // p178H.InterfaceC3181y
    /* JADX INFO: renamed from: a */
    public final void mo3953a(AbstractC3182z abstractC3182z) {
        AbstractC8577W2.m9243e().execute(new RunnableC3538n(this, 1));
    }

    /* JADX INFO: renamed from: b */
    public final void m4221b() {
        AbstractC8488H2.m9140a();
        C3124Q c3124q = new C3124Q("Camera is closed.", null);
        ArrayDeque<C3530f> arrayDeque = this.f10713Y;
        for (C3530f c3530f : arrayDeque) {
            c3530f.getClass();
            c3530f.f10673b.execute(new RunnableC0074m(c3530f, 28, c3124q));
        }
        arrayDeque.clear();
        for (C3537m c3537m : new ArrayList(this.f10717q0)) {
            c3537m.getClass();
            AbstractC8488H2.m9140a();
            if (!c3537m.f10705d.f30070Z.isDone()) {
                AbstractC8488H2.m9140a();
                c3537m.f10708g = true;
                RunnableC5220b runnableC5220b = c3537m.f10710i;
                Objects.requireNonNull(runnableC5220b);
                runnableC5220b.cancel(true);
                c3537m.f10706e.m10748b(c3124q);
                c3537m.f10707f.m10747a(null);
                AbstractC8488H2.m9140a();
                C3530f c3530f2 = c3537m.f10702a;
                c3530f2.f10673b.execute(new RunnableC0074m(c3530f2, 28, c3124q));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final void m4222c() {
        int i10 = 0;
        AbstractC8488H2.m9140a();
        Log.d("TakePictureManager", "Issue the next TakePictureRequest.");
        if (this.f10716p0 != null) {
            Log.d("TakePictureManager", "There is already a request in-flight.");
            return;
        }
        if (this.f10718r0) {
            Log.d("TakePictureManager", "The class is paused.");
            return;
        }
        C2392v c2392v = this.f10715o0;
        c2392v.getClass();
        AbstractC8488H2.m9140a();
        if (((C2392v) c2392v.f7438p0).m3561s() == 0) {
            Log.d("TakePictureManager", "Too many acquire images. Close image to be able to process next.");
            return;
        }
        C3530f c3530f = (C3530f) this.f10713Y.poll();
        if (c3530f == null) {
            Log.d("TakePictureManager", "No new request.");
            return;
        }
        C3537m c3537m = new C3537m(c3530f, this);
        AbstractC4941g.m5559R(null, !(this.f10716p0 != null));
        this.f10716p0 = c3537m;
        AbstractC8488H2.m9140a();
        c3537m.f10704c.f30070Z.mo5766a(new RunnableC3538n(this, i10), AbstractC8577W2.m9240b());
        this.f10717q0.add(c3537m);
        AbstractC8488H2.m9140a();
        c3537m.f10705d.f30070Z.mo5766a(new RunnableC0074m(this, 27, c3537m), AbstractC8577W2.m9240b());
        C2392v c2392v2 = this.f10715o0;
        AbstractC8488H2.m9140a();
        C10145l c10145l = c3537m.f10704c;
        c2392v2.getClass();
        AbstractC8488H2.m9140a();
        C3173u c3173u = (C3173u) ((C3815Q) c2392v2.f7436Z).mo36M(C3815Q.f11550p0, new C3173u(Arrays.asList(new C3801F())));
        Objects.requireNonNull(c3173u);
        int i11 = C2392v.f7433s0;
        C2392v.f7433s0 = i11 + 1;
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(c3173u.hashCode());
        List<C3801F> list = c3173u.f9559a;
        Objects.requireNonNull(list);
        for (C3801F c3801f : list) {
            C0063g0 c0063g0 = new C0063g0();
            C3799E c3799e = (C3799E) c2392v2.f7437o0;
            c0063g0.f283a = c3799e.f11484c;
            c0063g0.m243c(c3799e.f11483b);
            c0063g0.m241a(c3530f.f10681j);
            C3525a c3525a = (C3525a) c2392v2.f7440r0;
            C3162o0 c3162o0 = c3525a.f10654b;
            Objects.requireNonNull(c3162o0);
            ((HashSet) c0063g0.f286d).add(c3162o0);
            c0063g0.f284b = c3525a.f10655c != null ? 1 : i10;
            if (AbstractC9288g0.m9866c(c3525a.f10657e)) {
                if (((ImageCaptureRotationOptionQuirk) AbstractC5939a.f19323a.m4579f(ImageCaptureRotationOptionQuirk.class)) != null) {
                    C3828c c3828c = C3799E.f11479i;
                } else {
                    ((C3825a0) c0063g0.f287e).m4561x(C3799E.f11479i, Integer.valueOf(c3530f.f10678g));
                }
                ((C3825a0) c0063g0.f287e).m4561x(C3799E.f11480j, Integer.valueOf(((c3530f.f10674c != null) && AbstractC4503n.m5246b(c3530f.f10676e, c3525a.f10656d)) ? c3530f.f10680i == 0 ? 100 : 95 : c3530f.f10679h));
            }
            c0063g0.m243c(c3801f.f11501a.f11483b);
            ((C3829c0) c0063g0.f289g).f11718a.put(strValueOf, 0);
            ((C3829c0) c0063g0.f289g).f11718a.put("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i11));
            c0063g0.m242b(c3525a.f10653a);
            arrayList.add(c0063g0.m244d());
            c2392v2 = c2392v2;
            i10 = 0;
        }
        C11232c c11232c = new C11232c(arrayList, c3537m);
        C3535k c3535k = new C3535k(c3173u, c3530f.f10675d, c3530f.f10676e, c3530f.f10678g, c3530f.f10679h, c3530f.f10677f, c3537m, c10145l, i11);
        C2392v c2392v3 = this.f10715o0;
        c2392v3.getClass();
        AbstractC8488H2.m9140a();
        ((C3525a) c2392v3.f7440r0).f10660h.accept(c3535k);
        AbstractC8488H2.m9140a();
        C3123P c3123p = (C3123P) this.f10714Z.f32040Z;
        synchronized (c3123p.f9403p) {
            try {
                if (c3123p.f9403p.get() == null) {
                    c3123p.f9403p.set(Integer.valueOf(c3123p.m3958D()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C3123P c3123p2 = (C3123P) this.f10714Z.f32040Z;
        c3123p2.getClass();
        AbstractC8488H2.m9140a();
        RunnableC5220b runnableC5220bM5782f = AbstractC5229k.m5782f(c3123p2.m4010c().mo308o(arrayList, c3123p2.f9402o, c3123p2.f9404q), new C7296c(new C2385o(5), 18), AbstractC8577W2.m9240b());
        runnableC5220bM5782f.mo5766a(new RunnableC5228j(runnableC5220bM5782f, null == true ? 1 : 0, new C11234e(this, c11232c, false, 8)), AbstractC8577W2.m9243e());
        AbstractC8488H2.m9140a();
        AbstractC4941g.m5559R(suYVq.fzTZbKvLx, c3537m.f10710i == null);
        c3537m.f10710i = runnableC5220bM5782f;
    }
}
