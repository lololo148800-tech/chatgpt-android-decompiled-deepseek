package p001A;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Handler;
import android.util.ArrayMap;
import android.view.Surface;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p000.AbstractC17714o;
import p025An.C0624m;
import p050Bn.C1451e;
import p057C3.C1525C;
import p057C3.C1526D;
import p057C3.C1529G;
import p057C3.C1532J;
import p057C3.C1547Z;
import p057C3.C1553c0;
import p057C3.C1556e;
import p057C3.C1557e0;
import p057C3.C1567l;
import p057C3.SurfaceHolderCallbackC1523A;
import p083D3.C1865c;
import p083D3.C1868f;
import p1016t3.AbstractC19764N;
import p1016t3.C19762L;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p109E3.C2269J;
import p109E3.C2271L;
import p109E3.RunnableC2289m;
import p1139z0.C21585H;
import p117Eb.C2381k;
import p117Eb.C2387q;
import p127El.C2577c;
import p178H.C3124Q;
import p178H.C3132Z;
import p178H.C3150i0;
import p178H.C3170s0;
import p178H.InterfaceC3121N;
import p178H.InterfaceC3127U;
import p178H.InterfaceC3140d0;
import p195Hh.C3430e;
import p202I.C3530f;
import p202I.C3535k;
import p202I.C3537m;
import p202I.C3539o;
import p228J.AbstractC3842j;
import p228J.C3796C0;
import p228J.C3865u0;
import p228J.InterfaceC3819V;
import p228J.InterfaceC3861s0;
import p232J3.C4253y;
import p283L5.AbstractC4941g;
import p301M.AbstractC5229k;
import p349O0.InterfaceC5985X;
import p536W.C8408d;
import p544W9.AbstractC8488H2;
import p544W9.AbstractC8577W2;
import p610Z1.C10142i;
import p720e6.C13287b;
import p720e6.C13288c;
import p746fa.C13599h;
import p747fb.InterfaceFutureC13608b;
import p817j$.util.Objects;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: A.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0074m implements Runnable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f313Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f314Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f315o0;

    public /* synthetic */ RunnableC0074m(Object obj, int i10, Object obj2) {
        this.f313Y = i10;
        this.f314Z = obj;
        this.f315o0 = obj2;
    }

    /* JADX INFO: renamed from: a */
    private final void m263a() {
        C21585H c21585h = (C21585H) this.f314Z;
        C1556e c1556e = (C1556e) this.f315o0;
        c21585h.getClass();
        synchronized (c1556e) {
        }
        SurfaceHolderCallbackC1523A surfaceHolderCallbackC1523A = (SurfaceHolderCallbackC1523A) c21585h.f68345o0;
        int i10 = AbstractC20817s.f66106a;
        C1868f c1868f = surfaceHolderCallbackC1523A.f4046Y.f4055E0;
        c1868f.m2748D(c1868f.m2778z((C4253y) c1868f.f5367p0.f68q0), 1013, new C1865c(14));
    }

    /* JADX INFO: renamed from: b */
    private final void m264b() {
        C2577c this$0 = (C2577c) this.f314Z;
        InterfaceFutureC13608b interfaceFutureC13608b = (InterfaceFutureC13608b) this.f315o0;
        AbstractC16544l.m18094g(this$0, "this$0");
        synchronized (this$0) {
            this$0.f8013c.remove(interfaceFutureC13608b);
            if (this$0.f8013c.isEmpty()) {
                this$0.f8012b = null;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        long j10;
        boolean z6;
        long j11;
        boolean z10 = true;
        switch (this.f313Y) {
            case 0:
                C0088t c0088t = (C0088t) this.f314Z;
                AbstractC5229k.m5781e(true, AbstractC16347a.m17947b(new C0076n(c0088t.m313t(), c0088t)), (C10142i) this.f315o0, AbstractC8577W2.m9240b());
                return;
            case 1:
                C0082q c0082q = ((C0088t) this.f314Z).f367K0;
                HashSet hashSet = (HashSet) c0082q.f328b;
                AbstractC3842j abstractC3842j = (AbstractC3842j) this.f315o0;
                hashSet.remove(abstractC3842j);
                ((ArrayMap) c0082q.f329c).remove(abstractC3842j);
                return;
            case 2:
                C0084r c0084r = (C0084r) this.f314Z;
                c0084r.getClass();
                HashSet hashSet2 = new HashSet();
                HashSet<InterfaceC0086s> hashSet3 = (HashSet) c0084r.f335b;
                for (InterfaceC0086s interfaceC0086s : hashSet3) {
                    if (interfaceC0086s.mo3b((TotalCaptureResult) this.f315o0)) {
                        hashSet2.add(interfaceC0086s);
                    }
                }
                if (hashSet2.isEmpty()) {
                    return;
                }
                hashSet3.removeAll(hashSet2);
                return;
            case 3:
                ((Surface) this.f314Z).release();
                ((SurfaceTexture) this.f315o0).release();
                return;
            case 4:
                C0018J c0018j = (C0018J) this.f314Z;
                C0017I0 c0017i0 = c0018j.f78I0;
                C10142i c10142i = (C10142i) this.f315o0;
                if (c0017i0 == null) {
                    c10142i.m10747a(Boolean.FALSE);
                    return;
                } else {
                    c10142i.m10747a(Boolean.valueOf(c0018j.f90Y.m21931u(C0018J.m89y(c0017i0))));
                    return;
                }
            case 5:
                C0018J c0018j2 = (C0018J) this.f314Z;
                c0018j2.getClass();
                StringBuilder sb2 = new StringBuilder("Use case ");
                String str = (String) this.f315o0;
                sb2.append(str);
                sb2.append(" INACTIVE");
                c0018j2.m126v(sb2.toString(), null);
                LinkedHashMap linkedHashMap = (LinkedHashMap) c0018j2.f90Y.f68345o0;
                if (linkedHashMap.containsKey(str)) {
                    C3796C0 c3796c0 = (C3796C0) linkedHashMap.get(str);
                    c3796c0.f11477f = false;
                    if (!c3796c0.f11476e) {
                        linkedHashMap.remove(str);
                    }
                }
                c0018j2.m103M();
                return;
            case 6:
                ((InterfaceC3861s0) this.f314Z).mo28a((C3865u0) this.f315o0);
                return;
            case 7:
                ((HashSet) ((C0088t) this.f314Z).f368Y.f335b).remove((C0051a0) this.f315o0);
                return;
            case 8:
                ((C0007D0) this.f314Z).m14e((C10142i) this.f315o0);
                return;
            case 9:
                ((C0624m) this.f314Z).m1253D((C1451e) this.f315o0, C17296C.f55119a);
                return;
            case 10:
                C1526D c1526d = (C1526D) this.f314Z;
                C1529G c1529g = (C1529G) this.f315o0;
                int i10 = c1526d.f4066P0 - c1529g.f4108b;
                c1526d.f4066P0 = i10;
                if (c1529g.f4111e) {
                    c1526d.f4067Q0 = c1529g.f4109c;
                    c1526d.f4068R0 = true;
                }
                if (i10 == 0) {
                    AbstractC19764N abstractC19764N = ((C1547Z) c1529g.f4112f).f4250a;
                    if (!c1526d.f4087k1.f4250a.m20728p() && abstractC19764N.m20728p()) {
                        c1526d.f4088l1 = -1;
                        c1526d.f4089m1 = 0L;
                    }
                    if (!abstractC19764N.m20728p()) {
                        List listAsList = Arrays.asList(((C1557e0) abstractC19764N).f4330h);
                        AbstractC20800b.m21320h(listAsList.size() == c1526d.f4052B0.size());
                        for (int i11 = 0; i11 < listAsList.size(); i11++) {
                            ((C1525C) c1526d.f4052B0.get(i11)).f4050b = (AbstractC19764N) listAsList.get(i11);
                        }
                    }
                    if (c1526d.f4068R0) {
                        if (((C1547Z) c1529g.f4112f).f4251b.equals(c1526d.f4087k1.f4251b) && ((C1547Z) c1529g.f4112f).f4253d == c1526d.f4087k1.f4268s) {
                            z10 = false;
                        }
                        if (z10) {
                            if (abstractC19764N.m20728p() || ((C1547Z) c1529g.f4112f).f4251b.m5017b()) {
                                j11 = ((C1547Z) c1529g.f4112f).f4253d;
                            } else {
                                C1547Z c1547z = (C1547Z) c1529g.f4112f;
                                C4253y c4253y = c1547z.f4251b;
                                long j12 = c1547z.f4253d;
                                Object obj = c4253y.f13895a;
                                C19762L c19762l = c1526d.f4051A0;
                                abstractC19764N.mo2416g(obj, c19762l);
                                j11 = j12 + c19762l.f62581e;
                            }
                            z6 = z10;
                            j10 = j11;
                        } else {
                            j10 = -9223372036854775807L;
                            z6 = z10;
                        }
                    } else {
                        j10 = -9223372036854775807L;
                        z6 = false;
                    }
                    c1526d.f4068R0 = false;
                    c1526d.m2254o0((C1547Z) c1529g.f4112f, 1, z6, c1526d.f4067Q0, j10, -1);
                    return;
                }
                return;
            case 11:
                C1553c0 c1553c0 = (C1553c0) this.f315o0;
                ((C1532J) this.f314Z).getClass();
                try {
                    synchronized (c1553c0) {
                    }
                    try {
                        c1553c0.f4283a.mo2224a(c1553c0.f4286d, c1553c0.f4287e);
                        return;
                    } finally {
                        c1553c0.m2386b(true);
                    }
                } catch (C1567l e10) {
                    AbstractC20800b.m21325m("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
                    throw new RuntimeException(e10);
                }
            case 12:
                C8408d c8408d = (C8408d) ((InterfaceFutureC13608b) this.f314Z).get();
                C3430e c3430e = AbstractC17714o.f56552b;
                ((InterfaceC5985X) this.f315o0).setValue(c8408d);
                return;
            case 13:
                m263a();
                return;
            case 14:
                C2269J c2269j = (C2269J) this.f315o0;
                C21585H c21585h = ((C2271L) ((C13288c) this.f314Z).f42001Y).f7007R1;
                Handler handler = (Handler) c21585h.f68344Z;
                if (handler != null) {
                    handler.post(new RunnableC2289m(c21585h, c2269j, 2));
                    return;
                }
                return;
            case 15:
                ((C2381k) this.f314Z).m3479a((Intent) this.f315o0);
                return;
            case 16:
                C13599h c13599h = (C13599h) this.f315o0;
                C13287b c13287b = FirebaseMessaging.f36849k;
                try {
                    c13599h.m15114b(((FirebaseMessaging) this.f314Z).m13707a());
                    return;
                } catch (Exception e11) {
                    c13599h.m15113a(e11);
                    return;
                }
            case 17:
                C13599h c13599h2 = (C13599h) this.f315o0;
                try {
                    c13599h2.m15114b(((C2387q) this.f314Z).m3486a());
                    return;
                } catch (Exception e12) {
                    c13599h2.m15113a(e12);
                    return;
                }
            case 18:
                m264b();
                return;
            case 19:
                C0093v0 c0093v0 = (C0093v0) this.f314Z;
                c0093v0.getClass();
                ((InterfaceC3819V) this.f315o0).mo256d(c0093v0);
                return;
            case 20:
                ((C3150i0) this.f314Z).m3987a();
                C3150i0 c3150i0 = (C3150i0) this.f315o0;
                if (c3150i0 != null) {
                    c3150i0.m3987a();
                    return;
                }
                return;
            case 21:
                C3132Z c3132z = (C3132Z) this.f314Z;
                c3132z.getClass();
                ((InterfaceC3819V) this.f315o0).mo256d(c3132z);
                return;
            case 22:
                ((InterfaceC3140d0) this.f314Z).mo3482a((C3170s0) this.f315o0);
                return;
            case 23:
                C3537m c3537m = ((C3535k) this.f314Z).f10695g;
                AbstractC8488H2.m9140a();
                boolean z11 = c3537m.f10708g;
                InterfaceC3127U interfaceC3127U = (InterfaceC3127U) this.f315o0;
                if (z11) {
                    interfaceC3127U.close();
                    return;
                }
                AbstractC4941g.m5559R("onImageCaptured() must be called before onFinalResult()", c3537m.f10704c.f30070Z.isDone());
                c3537m.m4219a();
                C3530f c3530f = c3537m.f10702a;
                c3530f.f10673b.execute(new RunnableC0000A(c3530f, interfaceC3127U));
                return;
            case 24:
                C3537m c3537m2 = ((C3535k) this.f314Z).f10695g;
                AbstractC8488H2.m9140a();
                if (c3537m2.f10708g) {
                    return;
                }
                AbstractC4941g.m5559R("onImageCaptured() must be called before onFinalResult()", c3537m2.f10704c.f30070Z.isDone());
                c3537m2.m4219a();
                C3530f c3530f2 = c3537m2.f10702a;
                c3530f2.f10673b.execute(new RunnableC0074m(c3530f2, 29, (C13288c) this.f315o0));
                return;
            case 25:
                C3537m c3537m3 = ((C3535k) this.f314Z).f10695g;
                AbstractC8488H2.m9140a();
                if (c3537m3.f10708g) {
                    return;
                }
                C3530f c3530f3 = c3537m3.f10702a;
                c3530f3.f10673b.execute(new RunnableC0068j(c3530f3, (Bitmap) this.f315o0));
                return;
            case 26:
                C3537m c3537m4 = ((C3535k) this.f314Z).f10695g;
                AbstractC8488H2.m9140a();
                if (c3537m4.f10708g) {
                    return;
                }
                AbstractC4941g.m5559R("onImageCaptured() must be called before onFinalResult()", c3537m4.f10704c.f30070Z.isDone());
                c3537m4.m4219a();
                C3124Q c3124q = (C3124Q) this.f315o0;
                AbstractC8488H2.m9140a();
                C3530f c3530f4 = c3537m4.f10702a;
                c3530f4.f10673b.execute(new RunnableC0074m(c3530f4, 28, c3124q));
                return;
            case 27:
                ((C3539o) this.f314Z).f10717q0.remove((C3537m) this.f315o0);
                return;
            case 28:
                InterfaceC3121N interfaceC3121N = ((C3530f) this.f314Z).f10674c;
                if (interfaceC3121N == null) {
                    throw new IllegalStateException("One and only one callback is allowed.");
                }
                interfaceC3121N.mo3915c((C3124Q) this.f315o0);
                return;
            default:
                InterfaceC3121N interfaceC3121N2 = ((C3530f) this.f314Z).f10674c;
                Objects.requireNonNull(interfaceC3121N2);
                C13288c c13288c = (C13288c) this.f315o0;
                Objects.requireNonNull(c13288c);
                interfaceC3121N2.mo3917f(c13288c);
                return;
        }
    }
}
