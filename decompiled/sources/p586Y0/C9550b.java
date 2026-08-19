package p586Y0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p392Q0.C6548f;
import p692d0.AbstractC12958K;
import p692d0.C12954G;
import p909nm.AbstractC17680n;
import p909nm.C17689w;

/* JADX INFO: renamed from: Y0.b */
/* JADX INFO: loaded from: classes.dex */
public class C9550b extends AbstractC9556h {

    /* JADX INFO: renamed from: n */
    public static final int[] f28721n = new int[0];

    /* JADX INFO: renamed from: e */
    public final InterfaceC1436k f28722e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1436k f28723f;

    /* JADX INFO: renamed from: g */
    public int f28724g;

    /* JADX INFO: renamed from: h */
    public C12954G f28725h;

    /* JADX INFO: renamed from: i */
    public ArrayList f28726i;

    /* JADX INFO: renamed from: j */
    public C9560l f28727j;

    /* JADX INFO: renamed from: k */
    public int[] f28728k;

    /* JADX INFO: renamed from: l */
    public int f28729l;

    /* JADX INFO: renamed from: m */
    public boolean f28730m;

    public C9550b(int i10, C9560l c9560l, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2) {
        super(i10, c9560l);
        this.f28722e = interfaceC1436k;
        this.f28723f = interfaceC1436k2;
        this.f28727j = C9560l.f28750q0;
        this.f28728k = f28721n;
        this.f28729l = 1;
    }

    /* JADX INFO: renamed from: A */
    public final void m10062A(C9560l c9560l) {
        synchronized (AbstractC9562n.f28759b) {
            this.f28727j = this.f28727j.m10075p(c9560l);
        }
    }

    /* JADX INFO: renamed from: B */
    public void mo10040B(C12954G c12954g) {
        this.f28725h = c12954g;
    }

    /* JADX INFO: renamed from: C */
    public C9550b mo10041C(InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2) {
        C9551c c9551c;
        if (this.f28740c) {
            C5997d.m6443b0("Cannot use a disposed snapshot");
            throw null;
        }
        if (this.f28730m && this.f28741d < 0) {
            C5997d.m6445c0("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        m10067z(mo10044d());
        Object obj = AbstractC9562n.f28759b;
        synchronized (obj) {
            int i10 = AbstractC9562n.f28761d;
            AbstractC9562n.f28761d = i10 + 1;
            AbstractC9562n.f28760c = AbstractC9562n.f28760c.m10076q(i10);
            C9560l c9560lMo10045e = mo10045e();
            mo10055r(c9560lMo10045e.m10076q(i10));
            c9551c = new C9551c(i10, AbstractC9562n.m10081e(c9560lMo10045e, mo10044d() + 1, i10), AbstractC9562n.m10088l(true, interfaceC1436k, mo10046f()), AbstractC9562n.m10078b(interfaceC1436k2, mo10049i()), this);
        }
        if (!this.f28730m && !this.f28740c) {
            int iMo10044d = mo10044d();
            synchronized (obj) {
                int i11 = AbstractC9562n.f28761d;
                AbstractC9562n.f28761d = i11 + 1;
                mo10054q(i11);
                AbstractC9562n.f28760c = AbstractC9562n.f28760c.m10076q(mo10044d());
            }
            mo10055r(AbstractC9562n.m10081e(mo10045e(), iMo10044d + 1, mo10044d()));
        }
        return c9551c;
    }

    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: b */
    public final void mo10063b() {
        AbstractC9562n.f28760c = AbstractC9562n.f28760c.m10073j(mo10044d()).m10072f(this.f28727j);
    }

    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: c */
    public void mo10043c() {
        if (this.f28740c) {
            return;
        }
        this.f28740c = true;
        synchronized (AbstractC9562n.f28759b) {
            int i10 = this.f28741d;
            if (i10 >= 0) {
                AbstractC9562n.m10098v(i10);
                this.f28741d = -1;
            }
        }
        mo10051l();
    }

    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: g */
    public boolean mo10047g() {
        return false;
    }

    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: h */
    public int mo10048h() {
        return this.f28724g;
    }

    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: i */
    public InterfaceC1436k mo10049i() {
        return this.f28723f;
    }

    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: k */
    public void mo10050k() {
        this.f28729l++;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x007f A[LOOP:0: B:19:0x0030->B:36:0x007f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x0088 A[EDGE_INSN: B:44:0x0088->B:39:0x0088 BREAK  A[LOOP:0: B:19:0x0030->B:36:0x007f], SYNTHETIC] */
    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: l */
    public void mo10051l() {
        int i10 = this.f28729l;
        if (!(i10 > 0)) {
            C5997d.m6443b0("no pending nested snapshots");
            throw null;
        }
        int i11 = i10 - 1;
        this.f28729l = i11;
        if (i11 != 0 || this.f28730m) {
            return;
        }
        C12954G c12954gMo10059w = mo10059w();
        if (c12954gMo10059w != null) {
            if (this.f28730m) {
                C5997d.m6445c0("Unsupported operation on a snapshot that has been applied");
                throw null;
            }
            mo10040B(null);
            int iMo10044d = mo10044d();
            Object[] objArr = c12954gMo10059w.f41144b;
            long[] jArr = c12954gMo10059w.f41143a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i12 = 0;
                while (true) {
                    long j10 = jArr[i12];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i12 != length) {
                            break;
                            break;
                        }
                        i12++;
                    } else {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        for (int i14 = 0; i14 < i13; i14++) {
                            if ((255 & j10) < 128) {
                                for (AbstractC9544C abstractC9544CMo6345f = ((InterfaceC9542A) objArr[(i12 << 3) + i14]).mo6345f(); abstractC9544CMo6345f != null; abstractC9544CMo6345f = abstractC9544CMo6345f.f28703b) {
                                    int i15 = abstractC9544CMo6345f.f28702a;
                                    if (i15 == iMo10044d || AbstractC17680n.m19333J(this.f28727j, Integer.valueOf(i15))) {
                                        abstractC9544CMo6345f.f28702a = 0;
                                    }
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i13 != 8) {
                            break;
                        } else if (i12 != length) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
            }
        }
        m10069a();
    }

    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: m */
    public void mo10052m() {
        if (this.f28730m || this.f28740c) {
            return;
        }
        m10065u();
    }

    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: n */
    public void mo10053n(InterfaceC9542A interfaceC9542A) {
        C12954G c12954gMo10059w = mo10059w();
        if (c12954gMo10059w == null) {
            int i10 = AbstractC12958K.f41151a;
            c12954gMo10059w = new C12954G();
            mo10040B(c12954gMo10059w);
        }
        c12954gMo10059w.m14624a(interfaceC9542A);
    }

    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: o */
    public final void mo10064o() {
        int length = this.f28728k.length;
        for (int i10 = 0; i10 < length; i10++) {
            AbstractC9562n.m10098v(this.f28728k[i10]);
        }
        int i11 = this.f28741d;
        if (i11 >= 0) {
            AbstractC9562n.m10098v(i11);
            this.f28741d = -1;
        }
    }

    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: s */
    public void mo10056s(int i10) {
        this.f28724g = i10;
    }

    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: t */
    public AbstractC9556h mo10057t(InterfaceC1436k interfaceC1436k) {
        C9552d c9552d;
        if (this.f28740c) {
            C5997d.m6443b0("Cannot use a disposed snapshot");
            throw null;
        }
        if (this.f28730m && this.f28741d < 0) {
            C5997d.m6445c0("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        int iMo10044d = mo10044d();
        m10067z(mo10044d());
        Object obj = AbstractC9562n.f28759b;
        synchronized (obj) {
            int i10 = AbstractC9562n.f28761d;
            AbstractC9562n.f28761d = i10 + 1;
            AbstractC9562n.f28760c = AbstractC9562n.f28760c.m10076q(i10);
            c9552d = new C9552d(i10, AbstractC9562n.m10081e(mo10045e(), iMo10044d + 1, i10), AbstractC9562n.m10088l(true, interfaceC1436k, mo10046f()), this);
        }
        if (!this.f28730m && !this.f28740c) {
            int iMo10044d2 = mo10044d();
            synchronized (obj) {
                int i11 = AbstractC9562n.f28761d;
                AbstractC9562n.f28761d = i11 + 1;
                mo10054q(i11);
                AbstractC9562n.f28760c = AbstractC9562n.f28760c.m10076q(mo10044d());
            }
            mo10055r(AbstractC9562n.m10081e(mo10045e(), iMo10044d2 + 1, mo10044d()));
        }
        return c9552d;
    }

    /* JADX INFO: renamed from: u */
    public final void m10065u() {
        m10067z(mo10044d());
        if (this.f28730m || this.f28740c) {
            return;
        }
        int iMo10044d = mo10044d();
        synchronized (AbstractC9562n.f28759b) {
            int i10 = AbstractC9562n.f28761d;
            AbstractC9562n.f28761d = i10 + 1;
            mo10054q(i10);
            AbstractC9562n.f28760c = AbstractC9562n.f28760c.m10076q(mo10044d());
        }
        mo10055r(AbstractC9562n.m10081e(mo10045e(), iMo10044d + 1, mo10044d()));
    }

    /* JADX WARN: Code duplicated, block: B:59:0x011d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x011f A[Catch: all -> 0x0114, LOOP:2: B:48:0x00ea->B:60:0x011f, LOOP_END, TryCatch #0 {all -> 0x0114, blocks: (B:43:0x00ce, B:45:0x00e0, B:48:0x00ea, B:50:0x00f6, B:52:0x0100, B:54:0x0108, B:57:0x0117, B:60:0x011f, B:62:0x0127, B:65:0x0131, B:67:0x013b, B:69:0x0145, B:71:0x014d, B:72:0x0158, B:78:0x0165, B:79:0x0168, B:81:0x016c, B:83:0x0173, B:84:0x017f), top: B:92:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0125 A[EDGE_INSN: B:98:0x0125->B:61:0x0125 BREAK  A[LOOP:2: B:48:0x00ea->B:60:0x011f], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX INFO: renamed from: v */
    public AbstractC9567s mo10058v() {
        HashMap mapM10079c;
        C12954G c12954g;
        ?? r6;
        C12954G c12954gMo10059w = mo10059w();
        if (c12954gMo10059w != null) {
            AtomicReference atomicReference = AbstractC9562n.f28766i;
            mapM10079c = AbstractC9562n.m10079c((C9550b) atomicReference.get(), this, AbstractC9562n.f28760c.m10073j(((C9549a) atomicReference.get()).f28739b));
        } else {
            mapM10079c = null;
        }
        C17689w c17689w = C17689w.f56480Y;
        synchronized (AbstractC9562n.f28759b) {
            try {
                AbstractC9562n.m10080d(this);
                if (c12954gMo10059w == null || c12954gMo10059w.f41146d == 0) {
                    mo10063b();
                    C9549a c9549a = (C9549a) AbstractC9562n.f28766i.get();
                    AbstractC9562n.m10099w(c9549a, C9561m.f28756o0);
                    c12954g = c9549a.f28725h;
                    if (c12954g == null || !c12954g.m14631h()) {
                        c12954g = null;
                        r6 = c17689w;
                    } else {
                        r6 = AbstractC9562n.f28764g;
                    }
                } else {
                    C9549a c9549a2 = (C9549a) AbstractC9562n.f28766i.get();
                    AbstractC9567s abstractC9567sM10066y = m10066y(AbstractC9562n.f28761d, mapM10079c, AbstractC9562n.f28760c.m10073j(c9549a2.f28739b));
                    if (!abstractC9567sM10066y.equals(C9558j.f28743c)) {
                        return abstractC9567sM10066y;
                    }
                    mo10063b();
                    AbstractC9562n.m10099w(c9549a2, C9561m.f28756o0);
                    c12954g = c9549a2.f28725h;
                    mo10040B(null);
                    c9549a2.f28725h = null;
                    r6 = AbstractC9562n.f28764g;
                }
                this.f28730m = true;
                if (c12954g != null) {
                    C6548f c6548f = new C6548f(c12954g);
                    if (!c12954g.m14630g()) {
                        int size = r6.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ((InterfaceC1439n) r6.get(i10)).invoke(c6548f, this);
                        }
                    }
                }
                if (c12954gMo10059w != null && c12954gMo10059w.m14631h()) {
                    C6548f c6548f2 = new C6548f(c12954gMo10059w);
                    int size2 = r6.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((InterfaceC1439n) r6.get(i11)).invoke(c6548f2, this);
                    }
                }
                synchronized (AbstractC9562n.f28759b) {
                    try {
                        mo10064o();
                        AbstractC9562n.m10083g();
                        if (c12954g != null) {
                            Object[] objArr = c12954g.f41144b;
                            long[] jArr = c12954g.f41143a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j10 = jArr[i12];
                                    long[] jArr2 = jArr;
                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i12 != length) {
                                            break;
                                            break;
                                        }
                                        i12++;
                                        jArr = jArr2;
                                    } else {
                                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j10 & 255) < 128) {
                                                AbstractC9562n.m10094r((InterfaceC9542A) objArr[(i12 << 3) + i14]);
                                            }
                                            j10 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        }
                                        if (i12 != length) {
                                            break;
                                        }
                                        i12++;
                                        jArr = jArr2;
                                    }
                                }
                            }
                        }
                        if (c12954gMo10059w != null) {
                            Object[] objArr2 = c12954gMo10059w.f41144b;
                            long[] jArr3 = c12954gMo10059w.f41143a;
                            int length2 = jArr3.length - 2;
                            if (length2 >= 0) {
                                int i15 = 0;
                                while (true) {
                                    long j11 = jArr3[i15];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                        for (int i17 = 0; i17 < i16; i17++) {
                                            if ((j11 & 255) < 128) {
                                                AbstractC9562n.m10094r((InterfaceC9542A) objArr2[(i15 << 3) + i17]);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i16 != 8) {
                                            break;
                                        }
                                    }
                                    if (i15 == length2) {
                                        break;
                                    }
                                    i15++;
                                }
                            }
                        }
                        ArrayList arrayList = this.f28726i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i18 = 0; i18 < size3; i18++) {
                                AbstractC9562n.m10094r((InterfaceC9542A) arrayList.get(i18));
                            }
                        }
                        this.f28726i = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return C9558j.f28743c;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public C12954G mo10059w() {
        return this.f28725h;
    }

    @Override // p586Y0.AbstractC9556h
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public InterfaceC1436k mo10046f() {
        return this.f28722e;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x014c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0156  */
    /* JADX WARN: Code duplicated, block: B:74:0x017f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0186 A[LOOP:3: B:75:0x0184->B:76:0x0186, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x0199  */
    /* JADX WARN: Code duplicated, block: B:84:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: y */
    public final AbstractC9567s m10066y(int i10, HashMap map, C9560l c9560l) {
        C12954G c12954g;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayListM19361k0;
        ArrayList arrayList3;
        int size;
        int i11;
        ArrayList arrayList4;
        int size2;
        int i12;
        InterfaceC9542A interfaceC9542A;
        AbstractC9544C abstractC9544C;
        C9560l c9560l2;
        Object[] objArr;
        long[] jArr;
        C9560l c9560l3;
        int i13;
        AbstractC9544C abstractC9544CM10096t;
        AbstractC9544C abstractC9544CMo6408j;
        C9560l c9560lM10075p = mo10045e().m10076q(mo10044d()).m10075p(this.f28727j);
        C12954G c12954gMo10059w = mo10059w();
        AbstractC16544l.m18091d(c12954gMo10059w);
        Object[] objArr2 = c12954gMo10059w.f41144b;
        long[] jArr2 = c12954gMo10059w.f41143a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i14 = 0;
            arrayList3 = null;
            arrayListM19361k0 = null;
            while (true) {
                long j10 = jArr2[i14];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8;
                    int i16 = 8 - ((~(i14 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j10 & 255) < 128) {
                            InterfaceC9542A interfaceC9542A2 = (InterfaceC9542A) objArr2[(i14 << 3) + i17];
                            AbstractC9544C abstractC9544CMo6345f = interfaceC9542A2.mo6345f();
                            AbstractC9544C abstractC9544CM10096t2 = AbstractC9562n.m10096t(abstractC9544CMo6345f, i10, c9560l);
                            if (abstractC9544CM10096t2 == null || (abstractC9544CM10096t = AbstractC9562n.m10096t(abstractC9544CMo6345f, mo10044d(), c9560lM10075p)) == null) {
                                c9560l3 = c9560lM10075p;
                            } else {
                                c9560l3 = c9560lM10075p;
                                if (abstractC9544CM10096t.f28702a != 1 && !abstractC9544CM10096t2.equals(abstractC9544CM10096t)) {
                                    AbstractC9544C abstractC9544CM10096t3 = AbstractC9562n.m10096t(abstractC9544CMo6345f, mo10044d(), mo10045e());
                                    if (abstractC9544CM10096t3 == null) {
                                        AbstractC9562n.m10095s();
                                        throw null;
                                    }
                                    if (map == null || (abstractC9544CMo6408j = (AbstractC9544C) map.get(abstractC9544CM10096t2)) == null) {
                                        abstractC9544CMo6408j = interfaceC9542A2.mo6408j(abstractC9544CM10096t, abstractC9544CM10096t2, abstractC9544CM10096t3);
                                    }
                                    if (abstractC9544CMo6408j == null) {
                                        return new C9557i(this);
                                    }
                                    if (!abstractC9544CMo6408j.equals(abstractC9544CM10096t3)) {
                                        if (abstractC9544CMo6408j.equals(abstractC9544CM10096t2)) {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(new C17309l(interfaceC9542A2, abstractC9544CM10096t2.mo6338b()));
                                            if (arrayListM19361k0 == null) {
                                                arrayListM19361k0 = new ArrayList();
                                            }
                                            arrayListM19361k0.add(interfaceC9542A2);
                                        } else {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(!abstractC9544CMo6408j.equals(abstractC9544CM10096t) ? new C17309l(interfaceC9542A2, abstractC9544CMo6408j) : new C17309l(interfaceC9542A2, abstractC9544CM10096t.mo6338b()));
                                        }
                                    }
                                }
                            }
                            i13 = 8;
                        } else {
                            c9560l3 = c9560lM10075p;
                            i13 = i15;
                        }
                        j10 >>= i13;
                        i17++;
                        i15 = i13;
                        objArr2 = objArr2;
                        jArr2 = jArr2;
                        c12954gMo10059w = c12954gMo10059w;
                        c9560lM10075p = c9560l3;
                    }
                    c9560l2 = c9560lM10075p;
                    c12954g = c12954gMo10059w;
                    objArr = objArr2;
                    jArr = jArr2;
                    if (i16 != i15) {
                        break;
                    }
                } else {
                    c9560l2 = c9560lM10075p;
                    c12954g = c12954gMo10059w;
                    objArr = objArr2;
                    jArr = jArr2;
                }
                if (i14 != length) {
                    i14++;
                    objArr2 = objArr;
                    jArr2 = jArr;
                    c12954gMo10059w = c12954g;
                    c9560lM10075p = c9560l2;
                } else {
                    arrayList2 = arrayList3;
                    arrayList = arrayListM19361k0;
                }
            }
            if (arrayList3 != null) {
                m10065u();
                size2 = arrayList3.size();
                for (i12 = 0; i12 < size2; i12++) {
                    C17309l c17309l = (C17309l) arrayList3.get(i12);
                    interfaceC9542A = (InterfaceC9542A) c17309l.f55136Y;
                    abstractC9544C = (AbstractC9544C) c17309l.f55137Z;
                    abstractC9544C.f28702a = mo10044d();
                    synchronized (AbstractC9562n.f28759b) {
                        abstractC9544C.f28703b = interfaceC9542A.mo6345f();
                        interfaceC9542A.mo6348p(abstractC9544C);
                    }
                }
            }
            if (arrayListM19361k0 != null) {
                size = arrayListM19361k0.size();
                for (i11 = 0; i11 < size; i11++) {
                    c12954g.m14633j((InterfaceC9542A) arrayListM19361k0.get(i11));
                }
                arrayList4 = this.f28726i;
                if (arrayList4 != null) {
                    arrayListM19361k0 = AbstractC17680n.m19361k0(arrayListM19361k0, arrayList4);
                }
                this.f28726i = arrayListM19361k0;
            }
            return C9558j.f28743c;
        }
        c12954g = c12954gMo10059w;
        arrayList = null;
        arrayList2 = null;
        arrayListM19361k0 = arrayList;
        arrayList3 = arrayList2;
        if (arrayList3 != null) {
            m10065u();
            size2 = arrayList3.size();
            while (i12 < size2) {
                C17309l c17309l2 = (C17309l) arrayList3.get(i12);
                interfaceC9542A = (InterfaceC9542A) c17309l2.f55136Y;
                abstractC9544C = (AbstractC9544C) c17309l2.f55137Z;
                abstractC9544C.f28702a = mo10044d();
                synchronized (AbstractC9562n.f28759b) {
                    abstractC9544C.f28703b = interfaceC9542A.mo6345f();
                    interfaceC9542A.mo6348p(abstractC9544C);
                }
            }
        }
        if (arrayListM19361k0 != null) {
            size = arrayListM19361k0.size();
            while (i11 < size) {
                c12954g.m14633j((InterfaceC9542A) arrayListM19361k0.get(i11));
            }
            arrayList4 = this.f28726i;
            if (arrayList4 != null) {
                arrayListM19361k0 = AbstractC17680n.m19361k0(arrayListM19361k0, arrayList4);
            }
            this.f28726i = arrayListM19361k0;
        }
        return C9558j.f28743c;
    }

    /* JADX INFO: renamed from: z */
    public final void m10067z(int i10) {
        synchronized (AbstractC9562n.f28759b) {
            this.f28727j = this.f28727j.m10076q(i10);
        }
    }
}
