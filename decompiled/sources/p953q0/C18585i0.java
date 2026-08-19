package p953q0;

import android.os.Trace;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import p049Bm.InterfaceC1436k;
import p054C0.C1497j;
import p1095x1.C21081e0;
import p1095x1.InterfaceC21077c0;
import p117Eb.C2388r;
import p332N8.C5677a;
import p372P3.C6337s;
import p492U1.C7536a;
import p658b5.C11242m;
import p692d0.C12950C;
import p775h2.AbstractC14376f;
import p861l1.xapn.suYVq;
import p909nm.C17689w;

/* JADX INFO: renamed from: q0.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C18585i0 implements InterfaceC18565X {

    /* JADX INFO: renamed from: a */
    public final int f59202a;

    /* JADX INFO: renamed from: b */
    public final long f59203b;

    /* JADX INFO: renamed from: c */
    public final C1497j f59204c;

    /* JADX INFO: renamed from: d */
    public InterfaceC21077c0 f59205d;

    /* JADX INFO: renamed from: e */
    public boolean f59206e;

    /* JADX INFO: renamed from: f */
    public boolean f59207f;

    /* JADX INFO: renamed from: g */
    public boolean f59208g;

    /* JADX INFO: renamed from: h */
    public C2388r f59209h;

    /* JADX INFO: renamed from: i */
    public boolean f59210i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C11242m f59211j;

    public C18585i0(C11242m c11242m, int i10, long j10, C1497j c1497j) {
        this.f59211j = c11242m;
        this.f59202a = i10;
        this.f59203b = j10;
        this.f59204c = c1497j;
    }

    @Override // p953q0.InterfaceC18565X
    /* JADX INFO: renamed from: a */
    public final void mo19942a() {
        this.f59210i = true;
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0162 A[Catch: all -> 0x0151, TryCatch #0 {all -> 0x0151, blocks: (B:70:0x011b, B:72:0x0123, B:74:0x0129, B:78:0x0135, B:80:0x0141, B:82:0x014e, B:81:0x0144, B:85:0x0153, B:86:0x015a, B:88:0x0162, B:92:0x0172, B:93:0x0178), top: B:129:0x011b }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0172 A[Catch: all -> 0x0151, LOOP:1: B:86:0x015a->B:92:0x0172, LOOP_END, TryCatch #0 {all -> 0x0151, blocks: (B:70:0x011b, B:72:0x0123, B:74:0x0129, B:78:0x0135, B:80:0x0141, B:82:0x014e, B:81:0x0144, B:85:0x0153, B:86:0x015a, B:88:0x0162, B:92:0x0172, B:93:0x0178), top: B:129:0x011b }] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.io.Serializable, java.util.List[]] */
    /* JADX INFO: renamed from: b */
    public final boolean m19946b(C6337s c6337s) {
        List list;
        List list2;
        C2388r c2388r;
        if (!m19947c()) {
            return false;
        }
        Object objMo5913d = ((InterfaceC18554L) ((C18553K) this.f59211j.f34018Y).f59118b.invoke()).mo5913d(this.f59202a);
        boolean z6 = this.f59205d != null;
        C1497j c1497j = this.f59204c;
        if (!z6) {
            long jM14612c = (objMo5913d == null || ((C12950C) c1497j.f3972o0).m14611b(objMo5913d) < 0) ? c1497j.f3970Y : ((C12950C) c1497j.f3972o0).m14612c(objMo5913d);
            long jM6950c = c6337s.m6950c();
            if ((!this.f59210i || jM6950c <= 0) && jM14612c >= jM6950c) {
                return true;
            }
            long jNanoTime = System.nanoTime();
            Trace.beginSection("compose:lazy:prefetch:compose");
            try {
                m19948d();
                Trace.endSection();
                long jNanoTime2 = System.nanoTime() - jNanoTime;
                if (objMo5913d != null) {
                    C12950C c12950c = (C12950C) c1497j.f3972o0;
                    int iM14611b = c12950c.m14611b(objMo5913d);
                    ((C12950C) c1497j.f3972o0).m14614e(C1497j.m2152b(c1497j, jNanoTime2, iM14611b >= 0 ? c12950c.f41119c[iM14611b] : 0L), objMo5913d);
                }
                c1497j.f3970Y = C1497j.m2152b(c1497j, jNanoTime2, c1497j.f3970Y);
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        if (!this.f59210i) {
            if (!this.f59208g) {
                if (c6337s.m6950c() <= 0) {
                    return true;
                }
                Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                try {
                    InterfaceC21077c0 interfaceC21077c0 = this.f59205d;
                    if (interfaceC21077c0 == null) {
                        throw new IllegalArgumentException("Should precompose before resolving nested prefetch states");
                    }
                    C16525B c16525b = new C16525B();
                    interfaceC21077c0.mo21506c(new C5677a(c16525b, 4));
                    List list3 = (List) c16525b.f51262Y;
                    if (list3 != null) {
                        c2388r = new C2388r();
                        c2388r.f7423e = this;
                        c2388r.f7421c = list3;
                        c2388r.f7422d = new List[list3.size()];
                        if (list3.isEmpty()) {
                            throw new IllegalArgumentException("NestedPrefetchController shouldn't be created with no states");
                        }
                    } else {
                        c2388r = null;
                    }
                    this.f59209h = c2388r;
                    this.f59208g = true;
                    Trace.endSection();
                } catch (Throwable th3) {
                    Trace.endSection();
                    throw th3;
                }
            }
            C2388r c2388r2 = this.f59209h;
            if (c2388r2 != null) {
                List[] listArr = (List[]) c2388r2.f7422d;
                int i10 = c2388r2.f7419a;
                List list4 = (List) c2388r2.f7421c;
                if (i10 < list4.size()) {
                    if (((C18585i0) c2388r2.f7423e).f59207f) {
                        throw new IllegalStateException("Should not execute nested prefetch on canceled request");
                    }
                    Trace.beginSection("compose:lazy:prefetch:nested");
                    while (c2388r2.f7419a < list4.size()) {
                        try {
                            if (listArr[c2388r2.f7419a] != null) {
                                list = listArr[c2388r2.f7419a];
                                AbstractC16544l.m18091d(list);
                                while (c2388r2.f7420b < list.size()) {
                                    if (((C18585i0) list.get(c2388r2.f7420b)).m19946b(c6337s)) {
                                        c2388r2.f7420b++;
                                    }
                                }
                                c2388r2.f7420b = 0;
                                c2388r2.f7419a++;
                            } else if (c6337s.m6950c() > 0) {
                                int i11 = c2388r2.f7419a;
                                C18566Y c18566y = (C18566Y) list4.get(i11);
                                InterfaceC1436k interfaceC1436k = c18566y.f59145b;
                                if (interfaceC1436k == null) {
                                    list2 = C17689w.f56480Y;
                                } else {
                                    C18564W c18564w = new C18564W(c18566y);
                                    interfaceC1436k.invoke(c18564w);
                                    list2 = c18564w.f59142a;
                                }
                                listArr[i11] = list2;
                                list = listArr[c2388r2.f7419a];
                                AbstractC16544l.m18091d(list);
                                while (c2388r2.f7420b < list.size()) {
                                    if (((C18585i0) list.get(c2388r2.f7420b)).m19946b(c6337s)) {
                                        c2388r2.f7420b++;
                                    }
                                }
                                c2388r2.f7420b = 0;
                                c2388r2.f7419a++;
                            }
                            Trace.endSection();
                            return true;
                        } catch (Throwable th4) {
                            Trace.endSection();
                            throw th4;
                        }
                    }
                    Trace.endSection();
                }
            }
        }
        if (!this.f59206e) {
            long j10 = this.f59203b;
            if (!C7536a.m7857l(j10)) {
                long jM14612c2 = (objMo5913d == null || ((C12950C) c1497j.f3973p0).m14611b(objMo5913d) < 0) ? c1497j.f3971Z : ((C12950C) c1497j.f3973p0).m14612c(objMo5913d);
                long jM6950c2 = c6337s.m6950c();
                if ((!this.f59210i || jM6950c2 <= 0) && jM14612c2 >= jM6950c2) {
                    return true;
                }
                long jNanoTime3 = System.nanoTime();
                Trace.beginSection("compose:lazy:prefetch:measure");
                try {
                    m19949e(j10);
                    Trace.endSection();
                    long jNanoTime4 = System.nanoTime() - jNanoTime3;
                    if (objMo5913d != null) {
                        C12950C c12950c2 = (C12950C) c1497j.f3973p0;
                        int iM14611b2 = c12950c2.m14611b(objMo5913d);
                        ((C12950C) c1497j.f3973p0).m14614e(C1497j.m2152b(c1497j, jNanoTime4, iM14611b2 >= 0 ? c12950c2.f41119c[iM14611b2] : 0L), objMo5913d);
                    }
                    c1497j.f3971Z = C1497j.m2152b(c1497j, jNanoTime4, c1497j.f3971Z);
                } catch (Throwable th5) {
                    Trace.endSection();
                    throw th5;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m19947c() {
        if (!this.f59207f) {
            int iMo5911b = ((InterfaceC18554L) ((C18553K) this.f59211j.f34018Y).f59118b.invoke()).mo5911b();
            int i10 = this.f59202a;
            if (i10 >= 0 && i10 < iMo5911b) {
                return true;
            }
        }
        return false;
    }

    @Override // p953q0.InterfaceC18565X
    public final void cancel() {
        if (this.f59207f) {
            return;
        }
        this.f59207f = true;
        InterfaceC21077c0 interfaceC21077c0 = this.f59205d;
        if (interfaceC21077c0 != null) {
            interfaceC21077c0.dispose();
        }
        this.f59205d = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m19948d() {
        if (!m19947c()) {
            throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performComposition()");
        }
        if (this.f59205d != null) {
            throw new IllegalArgumentException("Request was already composed!");
        }
        C11242m c11242m = this.f59211j;
        InterfaceC18554L interfaceC18554L = (InterfaceC18554L) ((C18553K) c11242m.f34018Y).f59118b.invoke();
        int i10 = this.f59202a;
        Object objMo5912c = interfaceC18554L.mo5912c(i10);
        this.f59205d = ((C21081e0) c11242m.f34019Z).m21572a().m21511f(objMo5912c, ((C18553K) c11242m.f34018Y).m19933a(objMo5912c, i10, interfaceC18554L.mo5913d(i10)));
    }

    /* JADX INFO: renamed from: e */
    public final void m19949e(long j10) {
        if (this.f59207f) {
            throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if (this.f59206e) {
            throw new IllegalArgumentException("Request was already measured!");
        }
        this.f59206e = true;
        InterfaceC21077c0 interfaceC21077c0 = this.f59205d;
        if (interfaceC21077c0 == null) {
            throw new IllegalArgumentException("performComposition() must be called before performMeasure()");
        }
        int iMo21504a = interfaceC21077c0.mo21504a();
        for (int i10 = 0; i10 < iMo21504a; i10++) {
            interfaceC21077c0.mo21505b(i10, j10);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(suYVq.QSs);
        sb2.append(this.f59202a);
        sb2.append(", constraints = ");
        sb2.append((Object) C7536a.m7858m(this.f59203b));
        sb2.append(", isComposed = ");
        sb2.append(this.f59205d != null);
        sb2.append(", isMeasured = ");
        sb2.append(this.f59206e);
        sb2.append(", isCanceled = ");
        return AbstractC14376f.m15823B(sb2, this.f59207f, " }");
    }
}
