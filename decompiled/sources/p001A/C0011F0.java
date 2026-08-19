package p001A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import p178H.C3112E;
import p178H.C3123P;
import p178H.C3124Q;
import p178H.C3142e0;
import p178H.C3162o0;
import p202I.C3530f;
import p202I.C3537m;
import p202I.C3539o;
import p228J.C3814P;
import p228J.C3815Q;
import p228J.C3836g;
import p228J.C3837g0;
import p228J.C3857q0;
import p228J.C3859r0;
import p228J.C3863t0;
import p228J.C3865u0;
import p228J.EnumC3804G0;
import p228J.InterfaceC3861s0;
import p301M.RunnableC5220b;
import p523V9.AbstractC8072d6;
import p544W9.AbstractC8488H2;
import p817j$.util.DesugarCollections;
import p817j$.util.Objects;
import p848k6.AbstractC16347a;

/* JADX INFO: renamed from: A.F0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0011F0 implements InterfaceC3861s0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f48b;

    public /* synthetic */ C0011F0(Object obj, int i10) {
        this.f47a = i10;
        this.f48b = obj;
    }

    @Override // p228J.InterfaceC3861s0
    /* JADX INFO: renamed from: a */
    public final void mo28a(C3865u0 c3865u0) {
        int i10 = 0;
        Object obj = this.f48b;
        switch (this.f47a) {
            case 0:
                C0017I0 c0017i0 = (C0017I0) obj;
                c0017i0.f65Z = c0017i0.m76l();
                C0092v c0092v = (C0092v) c0017i0.f68q0;
                if (c0092v != null) {
                    C0018J c0018j = c0092v.f401Z;
                    c0018j.getClass();
                    try {
                        if (((Boolean) AbstractC16347a.m17947b(new C0092v(c0018j, i10)).f30070Z.get()).booleanValue()) {
                            C0017I0 c0017i1 = c0018j.f78I0;
                            c0018j.f92o0.execute(new RunnableC0096x(c0018j, C0018J.m89y(c0017i1), (C3865u0) c0017i1.f65Z, (C0015H0) c0017i1.f66o0, null, Collections.singletonList(EnumC3804G0.f11512r0), 0));
                            return;
                        }
                        return;
                    } catch (InterruptedException | ExecutionException e10) {
                        throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e10);
                    }
                }
                return;
            case 1:
                C3112E c3112e = (C3112E) obj;
                if (c3112e.m4009b() == null) {
                    return;
                }
                AbstractC8488H2.m9140a();
                C3859r0 c3859r0 = c3112e.f9358t;
                if (c3859r0 != null) {
                    c3859r0.m4587b();
                    c3112e.f9358t = null;
                }
                C3162o0 c3162o0 = c3112e.f9357s;
                if (c3162o0 != null) {
                    c3162o0.mo4507a();
                    c3112e.f9357s = null;
                }
                c3112e.f9353o.mo3947c();
                c3112e.m4011d();
                C3814P c3814p = (C3814P) c3112e.f9565f;
                C3836g c3836g = c3112e.f9566g;
                c3836g.getClass();
                C3857q0 c3857q0M3934B = c3112e.m3934B(c3814p, c3836g);
                c3112e.f9356r = c3857q0M3934B;
                Object[] objArr = {c3857q0M3934B.m4586c()};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                c3112e.m4007A(DesugarCollections.unmodifiableList(arrayList));
                c3112e.m4018n();
                return;
            case 2:
                C3123P c3123p = (C3123P) obj;
                if (c3123p.m4009b() == null) {
                    return;
                }
                C3539o c3539o = c3123p.f9410w;
                c3539o.getClass();
                AbstractC8488H2.m9140a();
                c3539o.f10718r0 = true;
                C3537m c3537m = c3539o.f10716p0;
                if (c3537m != null) {
                    AbstractC8488H2.m9140a();
                    if (!c3537m.f10705d.f30070Z.isDone()) {
                        C3124Q c3124q = new C3124Q("The request is aborted silently and retried.", null);
                        AbstractC8488H2.m9140a();
                        c3537m.f10708g = true;
                        RunnableC5220b runnableC5220b = c3537m.f10710i;
                        Objects.requireNonNull(runnableC5220b);
                        runnableC5220b.cancel(true);
                        c3537m.f10706e.m10748b(c3124q);
                        c3537m.f10707f.m10747a(null);
                        C3530f c3530f = c3537m.f10702a;
                        C3539o c3539o2 = c3537m.f10703b;
                        c3539o2.getClass();
                        AbstractC8488H2.m9140a();
                        AbstractC8072d6.m8486c("TakePictureManager", "Add a new request for retrying.");
                        c3539o2.f10713Y.addFirst(c3530f);
                        c3539o2.m4222c();
                    }
                }
                c3123p.m3956B(true);
                String strM4011d = c3123p.m4011d();
                C3815Q c3815q = (C3815Q) c3123p.f9565f;
                C3836g c3836g2 = c3123p.f9566g;
                c3836g2.getClass();
                C3857q0 c3857q0M3957C = c3123p.m3957C(strM4011d, c3815q, c3836g2);
                c3123p.f9408u = c3857q0M3957C;
                Object[] objArr2 = {c3857q0M3957C.m4586c()};
                ArrayList arrayList2 = new ArrayList(1);
                Object obj3 = objArr2[0];
                Objects.requireNonNull(obj3);
                arrayList2.add(obj3);
                c3123p.m4007A(DesugarCollections.unmodifiableList(arrayList2));
                c3123p.m4018n();
                C3539o c3539o3 = c3123p.f9410w;
                c3539o3.getClass();
                AbstractC8488H2.m9140a();
                c3539o3.f10718r0 = false;
                c3539o3.m4222c();
                return;
            case 3:
                C3142e0 c3142e0 = (C3142e0) obj;
                if (c3142e0.m4009b() == null) {
                    return;
                }
                c3142e0.m3984D((C3837g0) c3142e0.f9565f, c3142e0.f9566g);
                c3142e0.m4018n();
                return;
            default:
                Iterator it = ((C3863t0) obj).f11674l.iterator();
                while (it.hasNext()) {
                    ((InterfaceC3861s0) it.next()).mo28a(c3865u0);
                }
                return;
        }
    }
}
