package p349O0;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Trace;
import android.util.SparseArray;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p011A9.p012Ra.ahZQMZ;
import p038Ba.AbstractC0865o;
import p046Bk.p047Ep.QzvfuIgrngtl;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p228J.AbstractC3794B0;
import p370P0.AbstractC6276C;
import p370P0.C6275B;
import p370P0.C6278E;
import p370P0.C6279a;
import p370P0.C6280b;
import p370P0.C6281c;
import p370P0.C6283e;
import p370P0.C6286h;
import p370P0.C6287i;
import p370P0.C6288j;
import p370P0.C6289k;
import p370P0.C6290l;
import p370P0.C6291m;
import p370P0.C6292n;
import p370P0.C6293o;
import p370P0.C6294p;
import p370P0.C6296r;
import p370P0.C6297s;
import p370P0.C6299u;
import p370P0.C6301w;
import p370P0.C6302x;
import p370P0.C6303y;
import p370P0.C6304z;
import p392Q0.C6546d;
import p537W0.C8410b;
import p537W0.C8413e;
import p537W0.C8414f;
import p571X9.AbstractC9215U;
import p586Y0.AbstractC9562n;
import p609Z0.AbstractC10133b;
import p692d0.AbstractC12958K;
import p692d0.C12948A;
import p692d0.C12949B;
import p692d0.C12951D;
import p692d0.C12953F;
import p692d0.C12954G;
import p692d0.C12980s;
import p692d0.C12982u;
import p720e6.C13287b;
import p720e6.C13288c;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17685s;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: O0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C6021p {

    /* JADX INFO: renamed from: A */
    public int f19549A;

    /* JADX INFO: renamed from: B */
    public boolean f19550B;

    /* JADX INFO: renamed from: C */
    public final C6019o f19551C;

    /* JADX INFO: renamed from: D */
    public final C5980U0 f19552D;

    /* JADX INFO: renamed from: E */
    public boolean f19553E;

    /* JADX INFO: renamed from: F */
    public C5941A0 f19554F;

    /* JADX INFO: renamed from: G */
    public C5943B0 f19555G;

    /* JADX INFO: renamed from: H */
    public C5947D0 f19556H;

    /* JADX INFO: renamed from: I */
    public boolean f19557I;

    /* JADX INFO: renamed from: J */
    public InterfaceC6008i0 f19558J;

    /* JADX INFO: renamed from: K */
    public C6279a f19559K;

    /* JADX INFO: renamed from: L */
    public final C6280b f19560L;

    /* JADX INFO: renamed from: M */
    public C5995c f19561M;

    /* JADX INFO: renamed from: N */
    public C6281c f19562N;

    /* JADX INFO: renamed from: O */
    public boolean f19563O;

    /* JADX INFO: renamed from: P */
    public int f19564P;

    /* JADX INFO: renamed from: a */
    public final AbstractC0865o f19565a;

    /* JADX INFO: renamed from: b */
    public final AbstractC6025r f19566b;

    /* JADX INFO: renamed from: c */
    public final C5943B0 f19567c;

    /* JADX INFO: renamed from: d */
    public final C12953F f19568d;

    /* JADX INFO: renamed from: e */
    public final C6279a f19569e;

    /* JADX INFO: renamed from: f */
    public final C6279a f19570f;

    /* JADX INFO: renamed from: g */
    public final C6029t f19571g;

    /* JADX INFO: renamed from: i */
    public C6006h0 f19573i;

    /* JADX INFO: renamed from: j */
    public int f19574j;

    /* JADX INFO: renamed from: k */
    public int f19575k;

    /* JADX INFO: renamed from: l */
    public int f19576l;

    /* JADX INFO: renamed from: n */
    public int[] f19578n;

    /* JADX INFO: renamed from: o */
    public C12980s f19579o;

    /* JADX INFO: renamed from: p */
    public boolean f19580p;

    /* JADX INFO: renamed from: q */
    public boolean f19581q;

    /* JADX INFO: renamed from: u */
    public C13287b f19585u;

    /* JADX INFO: renamed from: v */
    public boolean f19586v;

    /* JADX INFO: renamed from: x */
    public boolean f19588x;

    /* JADX INFO: renamed from: z */
    public int f19590z;

    /* JADX INFO: renamed from: h */
    public final C5980U0 f19572h = new C5980U0(0);

    /* JADX INFO: renamed from: m */
    public final C5960K f19577m = new C5960K();

    /* JADX INFO: renamed from: r */
    public final ArrayList f19582r = new ArrayList();

    /* JADX INFO: renamed from: s */
    public final C5960K f19583s = new C5960K();

    /* JADX INFO: renamed from: t */
    public InterfaceC6008i0 f19584t = C8414f.f26160p0;

    /* JADX INFO: renamed from: w */
    public final C5960K f19587w = new C5960K();

    /* JADX INFO: renamed from: y */
    public int f19589y = -1;

    public C6021p(AbstractC0865o abstractC0865o, AbstractC6025r abstractC6025r, C5943B0 c5943b0, C12953F c12953f, C6279a c6279a, C6279a c6279a2, C6029t c6029t) {
        this.f19565a = abstractC0865o;
        this.f19566b = abstractC6025r;
        this.f19567c = c5943b0;
        this.f19568d = c12953f;
        this.f19569e = c6279a;
        this.f19570f = c6279a2;
        this.f19571g = c6029t;
        this.f19550B = abstractC6025r.mo6487e() || abstractC6025r.mo6485c();
        this.f19551C = new C6019o(this, 0);
        this.f19552D = new C5980U0(0);
        C5941A0 c5941a0M6343m = c5943b0.m6343m();
        c5941a0M6343m.m6325c();
        this.f19554F = c5941a0M6343m;
        C5943B0 c5943b1 = new C5943B0();
        if (abstractC6025r.mo6487e()) {
            c5943b1.m6342j();
        }
        if (abstractC6025r.mo6485c()) {
            c5943b1.f19355v0 = new C12982u();
        }
        this.f19555G = c5943b1;
        C5947D0 c5947d0M6344p = c5943b1.m6344p();
        c5947d0M6344p.m6368e(true);
        this.f19556H = c5947d0M6344p;
        this.f19560L = new C6280b(this, c6279a);
        C5941A0 c5941a0M6343m2 = this.f19555G.m6343m();
        try {
            C5995c c5995cM6323a = c5941a0M6343m2.m6323a(0);
            c5941a0M6343m2.m6325c();
            this.f19561M = c5995cM6323a;
            this.f19562N = new C6281c();
        } catch (Throwable th2) {
            c5941a0M6343m2.m6325c();
            throw th2;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00a8 */
    /* JADX INFO: renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m6506I(int i10, int i11, C6021p c6021p, boolean z6) {
        C5941A0 c5941a0 = c6021p.f19554F;
        int[] iArr = c5941a0.f19327b;
        int i12 = i10 * 5;
        if (!((iArr[i12 + 1] & 134217728) != 0)) {
            if (!C5997d.m6455k(iArr, i10)) {
                if (C5997d.m6460p(iArr, i10)) {
                    return 1;
                }
                return C5997d.m6462r(iArr, i10);
            }
            int i13 = iArr[i12 + 3] + i10;
            int iM6506I = 0;
            for (int i14 = i10 + 1; i14 < i13; i14 += iArr[(i14 * 5) + 3]) {
                boolean zM6460p = C5997d.m6460p(iArr, i14);
                C6280b c6280b = c6021p.f19560L;
                if (zM6460p) {
                    c6280b.m6849c();
                    Object objM6331i = c5941a0.m6331i(i14);
                    c6280b.m6849c();
                    c6280b.f20402h.f19461a.add(objM6331i);
                }
                iM6506I += m6506I(i14, zM6460p ? 0 : i11 + iM6506I, c6021p, zM6460p || z6);
                if (zM6460p) {
                    c6280b.m6849c();
                    c6280b.m6847a();
                }
            }
            if (C5997d.m6460p(iArr, i10)) {
                return 1;
            }
            return iM6506I;
        }
        int i15 = iArr[i12];
        Object objM6332j = c5941a0.m6332j(iArr, i10);
        if (i15 != 206 || !AbstractC16544l.m18089b(objM6332j, C5997d.f19479e)) {
            if (C5997d.m6460p(iArr, i10)) {
                return 1;
            }
            return C5997d.m6462r(iArr, i10);
        }
        Object objM6329g = c5941a0.m6329g(i10, 0);
        C6015m c6015m = objM6329g instanceof C6015m ? (C6015m) objM6329g : null;
        if (c6015m != null) {
            for (C6021p c6021p2 : c6015m.f19521Y.f19530e) {
                C6280b c6280b2 = c6021p2.f19560L;
                C5943B0 c5943b0 = c6021p2.f19567c;
                if (c5943b0.f19347Z > 0 && C5997d.m6455k(c5943b0.f19346Y, 0)) {
                    C6279a c6279a = new C6279a();
                    c6021p2.f19559K = c6279a;
                    C5941A0 c5941a0M6343m = c5943b0.m6343m();
                    c6021p2.f19554F = c5941a0M6343m;
                    C6279a c6279a2 = c6280b2.f20396b;
                    try {
                        c6280b2.f20396b = c6279a;
                        m6506I(0, 0, c6021p2, false);
                        c6280b2.m6849c();
                        c6280b2.m6848b();
                        if (c6280b2.f20397c) {
                            C6279a c6279a3 = c6280b2.f20396b;
                            c6279a3.getClass();
                            c6279a3.f20394a.m6845i(C6301w.f20432c);
                            if (c6280b2.f20397c) {
                                c6280b2.m6850d(false);
                                c6280b2.m6850d(false);
                                C6279a c6279a4 = c6280b2.f20396b;
                                c6279a4.getClass();
                                c6279a4.f20394a.m6845i(C6287i.f20414c);
                                c6280b2.f20397c = false;
                            }
                        }
                        c6280b2.f20396b = c6279a2;
                        c5941a0M6343m.m6325c();
                    } catch (Throwable th2) {
                        c6280b2.f20396b = c6279a2;
                        throw th2;
                    }
                }
                c6021p.f19566b.mo6494l(c6021p2.f19571g);
            }
        }
        return C5997d.m6462r(iArr, i10);
    }

    /* JADX INFO: renamed from: A */
    public final Object m6507A() {
        boolean z6 = this.f19563O;
        C5975S c5975s = C6013l.f19514a;
        if (!z6) {
            Object objM6330h = this.f19554F.m6330h();
            return (!this.f19588x || (objM6330h instanceof C6015m)) ? objM6330h : c5975s;
        }
        if (!this.f19581q) {
            return c5975s;
        }
        C5997d.m6470z("A call to createNode(), emitNode() or useNode() expected");
        throw null;
    }

    /* JADX INFO: renamed from: B */
    public final int m6508B(int i10) {
        int iM6463s = C5997d.m6463s(this.f19554F.f19327b, i10) + 1;
        int i11 = 0;
        while (iM6463s < i10) {
            if (!C5997d.m6459o(this.f19554F.f19327b, iM6463s)) {
                i11++;
            }
            iM6463s += C5997d.m6457m(this.f19554F.f19327b, iM6463s);
        }
        return i11;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m6509C(C13288c c13288c) {
        C6278E c6278e = this.f19569e.f20394a;
        if (!c6278e.m6842f()) {
            C5997d.m6470z("Expected applyChanges() to have been called");
            throw null;
        }
        if (((C12951D) c13288c.f42001Y).f41127e <= 0 && this.f19582r.isEmpty()) {
            return false;
        }
        m6551n(c13288c, null);
        return c6278e.m6843g();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    /* JADX WARN: Code duplicated, block: B:59:0x012c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0163  */
    /* JADX WARN: Code duplicated, block: B:67:0x0165  */
    /* JADX WARN: Code duplicated, block: B:70:0x016a  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:71:0x0178
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: D */
    public final void m6510D() {
        /*
            Method dump skipped, instruction units count: 775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p349O0.C6021p.m6510D():void");
    }

    /* JADX INFO: renamed from: E */
    public final void m6511E() {
        m6506I(this.f19554F.f19332g, 0, this, false);
        C6280b c6280b = this.f19560L;
        c6280b.m6849c();
        c6280b.m6850d(false);
        C6021p c6021p = c6280b.f20395a;
        C5941A0 c5941a0 = c6021p.f19554F;
        if (c5941a0.f19328c > 0) {
            int i10 = c5941a0.f19334i;
            C5960K c5960k = c6280b.f20398d;
            int i11 = c5960k.f19404b;
            if ((i11 > 0 ? c5960k.f19403a[i11 - 1] : -2) != i10) {
                if (!c6280b.f20397c && c6280b.f20399e) {
                    c6280b.m6850d(false);
                    C6279a c6279a = c6280b.f20396b;
                    c6279a.getClass();
                    c6279a.f20394a.m6845i(C6290l.f20417c);
                    c6280b.f20397c = true;
                }
                if (i10 > 0) {
                    C5995c c5995cM6323a = c5941a0.m6323a(i10);
                    c5960k.m6397d(i10);
                    c6280b.m6850d(false);
                    C6279a c6279a2 = c6280b.f20396b;
                    c6279a2.getClass();
                    C6289k c6289k = C6289k.f20416c;
                    C6278E c6278e = c6279a2.f20394a;
                    c6278e.m6846j(c6289k);
                    AbstractC9215U.m9785c(c6278e, 0, c5995cM6323a);
                    int i12 = c6278e.f20392g;
                    int i13 = c6289k.f20379a;
                    int iM6839c = C6278E.m6839c(c6278e, i13);
                    int i14 = c6289k.f20380b;
                    if (i12 != iM6839c || c6278e.f20393h != C6278E.m6839c(c6278e, i14)) {
                        StringBuilder sb2 = new StringBuilder();
                        int i15 = 0;
                        for (int i16 = 0; i16 < i13; i16++) {
                            if (((1 << i16) & c6278e.f20392g) != 0) {
                                if (i15 > 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(c6289k.mo6758b(i16));
                                i15++;
                            }
                        }
                        String string = sb2.toString();
                        StringBuilder sbM4500y = AbstractC3794B0.m4500y(string, "StringBuilder().apply(builderAction).toString()");
                        int i17 = 0;
                        for (int i18 = 0; i18 < i14; i18++) {
                            if (((1 << i18) & c6278e.f20393h) != 0) {
                                if (i15 > 0) {
                                    sbM4500y.append(", ");
                                }
                                sbM4500y.append(c6289k.mo6759c(i18));
                                i17++;
                            }
                        }
                        String string2 = sbM4500y.toString();
                        AbstractC16544l.m18093f(string2, "StringBuilder().apply(builderAction).toString()");
                        StringBuilder sb3 = new StringBuilder("Error while pushing ");
                        sb3.append(c6289k);
                        sb3.append(". Not all arguments were provided. Missing ");
                        AbstractC10763a.m11066x(sb3, i15, " int arguments (", string, ") and ");
                        AbstractC3794B0.m4472G(sb3, i17, " object arguments (", string2, ").");
                        throw null;
                    }
                    c6280b.f20397c = true;
                }
            }
        }
        C6279a c6279a3 = c6280b.f20396b;
        c6279a3.getClass();
        c6279a3.f20394a.m6845i(C6297s.f20428c);
        int i19 = c6280b.f20400f;
        C5941A0 c5941a1 = c6021p.f19554F;
        c6280b.f20400f = c5941a1.f19327b[(c5941a1.f19332g * 5) + 3] + i19;
    }

    /* JADX INFO: renamed from: F */
    public final void m6512F(InterfaceC6008i0 interfaceC6008i0) {
        C13287b c13287b = this.f19585u;
        if (c13287b == null) {
            c13287b = new C13287b(23);
            this.f19585u = c13287b;
        }
        ((SparseArray) c13287b.f42000Z).put(this.f19554F.f19332g, interfaceC6008i0);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0004  */
    /* JADX INFO: renamed from: G */
    public final void m6513G(int i10, int i11, int i12) {
        int[] iArr;
        C5941A0 c5941a0 = this.f19554F;
        if (i10 == i11) {
            i12 = i10;
        } else if (i10 != i12 && i11 != i12) {
            int[] iArr2 = c5941a0.f19327b;
            int i13 = iArr2[(i10 * 5) + 2];
            if (i13 == i11) {
                i12 = i11;
            } else {
                int i14 = iArr2[(i11 * 5) + 2];
                if (i14 == i10) {
                    i12 = i10;
                } else if (i13 == i14) {
                    i12 = i13;
                } else {
                    int iM6463s = i10;
                    int i15 = 0;
                    while (true) {
                        iArr = c5941a0.f19327b;
                        if (iM6463s <= 0 || iM6463s == i12) {
                            break;
                        }
                        iM6463s = C5997d.m6463s(iArr, iM6463s);
                        i15++;
                    }
                    int iM6463s2 = i11;
                    int i16 = 0;
                    while (iM6463s2 > 0 && iM6463s2 != i12) {
                        iM6463s2 = C5997d.m6463s(iArr, iM6463s2);
                        i16++;
                    }
                    int i17 = i15 - i16;
                    int i18 = i10;
                    for (int i19 = 0; i19 < i17; i19++) {
                        i18 = iArr2[(i18 * 5) + 2];
                    }
                    int i20 = i16 - i15;
                    int i21 = i11;
                    for (int i22 = 0; i22 < i20; i22++) {
                        i21 = iArr2[(i21 * 5) + 2];
                    }
                    i12 = i18;
                    for (int i23 = i21; i12 != i23; i23 = iArr2[(i23 * 5) + 2]) {
                        i12 = iArr2[(i12 * 5) + 2];
                    }
                }
            }
        }
        while (i10 > 0 && i10 != i12) {
            if (C5997d.m6460p(c5941a0.f19327b, i10)) {
                this.f19560L.m6847a();
            }
            i10 = c5941a0.f19327b[(i10 * 5) + 2];
        }
        m6552o(i11, i12);
    }

    /* JADX INFO: renamed from: H */
    public final Object m6514H() {
        boolean z6 = this.f19563O;
        C5975S c5975s = C6013l.f19514a;
        if (z6) {
            if (!this.f19581q) {
                return c5975s;
            }
            C5997d.m6470z("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        Object objM6330h = this.f19554F.m6330h();
        if (!this.f19588x || (objM6330h instanceof C6015m)) {
            return objM6330h instanceof C6036w0 ? ((C6036w0) objM6330h).f19669a : objM6330h;
        }
        return c5975s;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0090  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ce  */
    /* JADX INFO: renamed from: J */
    public final void m6515J() {
        int iRotateLeft;
        int iHashCode;
        int iRotateRight;
        if (this.f19582r.isEmpty()) {
            this.f19575k = this.f19554F.m6334l() + this.f19575k;
            return;
        }
        C5941A0 c5941a0 = this.f19554F;
        int iM6328f = c5941a0.m6328f();
        int i10 = c5941a0.f19332g;
        int i11 = c5941a0.f19333h;
        int[] iArr = c5941a0.f19327b;
        Object objM6332j = i10 < i11 ? c5941a0.m6332j(iArr, i10) : null;
        Object objM6327e = c5941a0.m6327e();
        int i12 = this.f19576l;
        C5975S c5975s = C6013l.f19514a;
        if (objM6332j == null) {
            if (objM6327e == null || iM6328f != 207 || objM6327e.equals(c5975s)) {
                iRotateLeft = Integer.rotateLeft(Integer.rotateLeft(this.f19564P, 3) ^ iM6328f, 3) ^ i12;
            } else {
                this.f19564P = Integer.rotateLeft(objM6327e.hashCode() ^ Integer.rotateLeft(this.f19564P, 3), 3) ^ i12;
            }
            m6523R(null, C5997d.m6460p(iArr, c5941a0.f19332g));
            m6510D();
            c5941a0.m6326d();
            if (objM6332j != null) {
                if (objM6332j instanceof Enum) {
                    iHashCode = ((Enum) objM6332j).ordinal();
                } else {
                    iHashCode = objM6332j.hashCode();
                }
                iRotateRight = iHashCode ^ Integer.rotateRight(this.f19564P, 3);
            } else {
                if (objM6327e == null && iM6328f == 207 && !objM6327e.equals(c5975s)) {
                    this.f19564P = Integer.rotateRight(objM6327e.hashCode() ^ Integer.rotateRight(this.f19564P ^ i12, 3), 3);
                    return;
                }
                iRotateRight = Integer.rotateRight(this.f19564P ^ i12, 3) ^ iM6328f;
            }
            this.f19564P = Integer.rotateRight(iRotateRight, 3);
        }
        iRotateLeft = Integer.rotateLeft((objM6332j instanceof Enum ? ((Enum) objM6332j).ordinal() : objM6332j.hashCode()) ^ Integer.rotateLeft(this.f19564P, 3), 3);
        this.f19564P = iRotateLeft;
        m6523R(null, C5997d.m6460p(iArr, c5941a0.f19332g));
        m6510D();
        c5941a0.m6326d();
        if (objM6332j != null) {
            if (objM6327e == null) {
            }
            iRotateRight = Integer.rotateRight(this.f19564P ^ i12, 3) ^ iM6328f;
        } else {
            if (objM6332j instanceof Enum) {
                iHashCode = ((Enum) objM6332j).ordinal();
            } else {
                iHashCode = objM6332j.hashCode();
            }
            iRotateRight = iHashCode ^ Integer.rotateRight(this.f19564P, 3);
        }
        this.f19564P = Integer.rotateRight(iRotateRight, 3);
    }

    /* JADX INFO: renamed from: K */
    public final void m6516K() {
        C5941A0 c5941a0 = this.f19554F;
        int i10 = c5941a0.f19334i;
        this.f19575k = i10 >= 0 ? C5997d.m6462r(c5941a0.f19327b, i10) : 0;
        this.f19554F.m6335m();
    }

    /* JADX INFO: renamed from: L */
    public final void m6517L() {
        if (this.f19575k != 0) {
            C5997d.m6470z("No nodes can be emitted before calling skipAndEndGroup");
            throw null;
        }
        C6018n0 c6018n0M6560w = m6560w();
        if (c6018n0M6560w != null) {
            c6018n0M6560w.f19533a |= 16;
        }
        if (this.f19582r.isEmpty()) {
            m6516K();
        } else {
            m6510D();
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0200 A[LOOP:1: B:104:0x01bb->B:119:0x0200, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:212:0x041b  */
    /* JADX WARN: Code duplicated, block: B:215:0x0437  */
    /* JADX WARN: Code duplicated, block: B:216:0x043c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:217:0x043e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:218:0x0440  */
    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:220:0x0446  */
    /* JADX WARN: Code duplicated, block: B:222:0x0449  */
    /* JADX WARN: Code duplicated, block: B:226:0x047a  */
    /* JADX WARN: Code duplicated, block: B:227:0x047c  */
    /* JADX WARN: Code duplicated, block: B:229:0x0482 A[PHI: r0
      0x0482: PHI (r0v1 O0.p) = (r0v0 O0.p), (r0v3 O0.p) binds: [B:74:0x0136, B:209:0x0403] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:238:0x0274 A[EDGE_INSN: B:238:0x0274->B:148:0x0274 BREAK  A[LOOP:1: B:104:0x01bb->B:119:0x0200], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:31:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    /* JADX WARN: Code duplicated, block: B:35:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0090  */
    /* JADX WARN: Code duplicated, block: B:40:0x0098  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:67:0x0103  */
    /* JADX WARN: Code duplicated, block: B:69:0x0115  */
    /* JADX WARN: Code duplicated, block: B:70:0x0117  */
    /* JADX WARN: Code duplicated, block: B:75:0x0138 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x013a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0144  */
    /* JADX WARN: Code duplicated, block: B:80:0x0158  */
    /* JADX WARN: Code duplicated, block: B:82:0x015e  */
    /* JADX WARN: Code duplicated, block: B:84:0x016d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0171  */
    /* JADX WARN: Code duplicated, block: B:87:0x017b  */
    /* JADX INFO: renamed from: M */
    public final void m6518M(int i10, Object obj, Object obj2, int i11) {
        int iRotateLeft;
        boolean z6;
        boolean z10;
        C6006h0 c6006h0;
        C6006h0 c6006h1;
        Object objValueOf;
        C12951D c12951d;
        Object objM14619e;
        Object objRemove;
        ArrayList arrayList;
        C12982u c12982u;
        int i12;
        C5947D0 c5947d0;
        int i13;
        int i14;
        int i15;
        int i16;
        List listM18078b;
        C5941A0 c5941a0;
        ArrayList arrayList2;
        int i17;
        int[] iArr;
        int iM6462r;
        C5947D0 c5947d1;
        int i18;
        C6006h0 c6006h2;
        C6021p c6021p = this;
        Object obj3 = obj;
        if (c6021p.f19581q) {
            C5997d.m6470z("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        int i19 = c6021p.f19576l;
        C5975S c5975s = C6013l.f19514a;
        if (obj3 == null) {
            if (obj2 == null || i10 != 207 || obj2.equals(c5975s)) {
                iRotateLeft = i19 ^ Integer.rotateLeft(Integer.rotateLeft(c6021p.f19564P, 3) ^ i10, 3);
            } else {
                c6021p.f19564P = i19 ^ Integer.rotateLeft(obj2.hashCode() ^ Integer.rotateLeft(c6021p.f19564P, 3), 3);
            }
            if (obj3 == null) {
                c6021p.f19576l++;
            }
            if (i11 != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (c6021p.f19563O) {
                c6021p.f19554F.f19336k++;
                c5947d1 = c6021p.f19556H;
                i18 = c5947d1.f19383t;
                if (z6) {
                    c5947d1.m6359J(c5975s, c5975s, true, i10);
                } else if (obj2 != null) {
                    if (obj3 == null) {
                        obj3 = c5975s;
                    }
                    c5947d1.m6359J(obj3, obj2, false, i10);
                } else {
                    if (obj3 == null) {
                        obj3 = c5975s;
                    }
                    c5947d1.m6359J(obj3, c5975s, false, i10);
                }
                c6006h2 = c6021p.f19573i;
                if (c6006h2 != null) {
                    int i20 = (-2) - i18;
                    C5966N c5966n = new C5966N(-1, i10, i20, -1);
                    c6006h2.f19506e.m14697i(i20, new C5954H(-1, c6021p.f19574j - c6006h2.f19503b, 0));
                    c6006h2.f19505d.add(c5966n);
                }
                c6021p.m6558u(z6, null);
                return;
            }
            if (i11 != 1 && c6021p.f19588x) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c6021p.f19573i == null) {
                int iM6328f = c6021p.f19554F.m6328f();
                if (z10 && iM6328f == i10) {
                    C5941A0 c5941a1 = c6021p.f19554F;
                    int i21 = c5941a1.f19332g;
                    if (AbstractC16544l.m18089b(obj3, i21 < c5941a1.f19333h ? c5941a1.m6332j(c5941a1.f19327b, i21) : null)) {
                        c6021p.m6523R(obj2, z6);
                    } else {
                        c5941a0 = c6021p.f19554F;
                        c5941a0.getClass();
                        arrayList2 = new ArrayList();
                        if (c5941a0.f19336k <= 0) {
                            i17 = c5941a0.f19332g;
                            while (i17 < c5941a0.f19333h) {
                                int i22 = i17 * 5;
                                iArr = c5941a0.f19327b;
                                int i23 = iArr[i22];
                                Object objM6332j = c5941a0.m6332j(iArr, i17);
                                if (C5997d.m6460p(iArr, i17)) {
                                    iM6462r = 1;
                                } else {
                                    iM6462r = C5997d.m6462r(iArr, i17);
                                }
                                arrayList2.add(new C5966N(objM6332j, i23, i17, iM6462r));
                                i17 += iArr[i22 + 3];
                            }
                        }
                        c6021p.f19573i = new C6006h0(c6021p.f19574j, arrayList2);
                    }
                } else {
                    c5941a0 = c6021p.f19554F;
                    c5941a0.getClass();
                    arrayList2 = new ArrayList();
                    if (c5941a0.f19336k <= 0) {
                        i17 = c5941a0.f19332g;
                        while (i17 < c5941a0.f19333h) {
                            int i24 = i17 * 5;
                            iArr = c5941a0.f19327b;
                            int i25 = iArr[i24];
                            Object objM6332j2 = c5941a0.m6332j(iArr, i17);
                            if (C5997d.m6460p(iArr, i17)) {
                                iM6462r = 1;
                            } else {
                                iM6462r = C5997d.m6462r(iArr, i17);
                            }
                            arrayList2.add(new C5966N(objM6332j2, i25, i17, iM6462r));
                            i17 += iArr[i24 + 3];
                        }
                    }
                    c6021p.f19573i = new C6006h0(c6021p.f19574j, arrayList2);
                }
            }
            c6006h0 = c6021p.f19573i;
            if (c6006h0 == null) {
                c6006h1 = null;
            } else {
                if (obj3 != null) {
                    objValueOf = new C5964M(Integer.valueOf(i10), obj3);
                } else {
                    objValueOf = Integer.valueOf(i10);
                }
                c12951d = ((C5983W) c6006h0.f19507f.getValue()).f19462a;
                objM14619e = c12951d.m14619e(objValueOf);
                if (objM14619e != null) {
                    if (AbstractC16529F.m18083g(objM14619e)) {
                        listM18078b = AbstractC16529F.m18078b(objM14619e);
                        objRemove = listM18078b.remove(0);
                        if (listM18078b.isEmpty()) {
                            c12951d.m14621g(objValueOf);
                        }
                    } else {
                        c12951d.m14621g(objValueOf);
                        objRemove = objM14619e;
                    }
                    AbstractC16544l.m18092e(objRemove, "null cannot be cast to non-null type V of androidx.compose.runtime.MutableScatterMultiMap.pop_impl$lambda$1");
                } else {
                    objRemove = null;
                }
                C5966N c5966n2 = (C5966N) objRemove;
                arrayList = c6006h0.f19505d;
                c12982u = c6006h0.f19506e;
                i12 = c6006h0.f19503b;
                if (!z10 || c5966n2 == null) {
                    c6021p.f19554F.f19336k++;
                    c6021p.f19563O = true;
                    c6021p.f19558J = null;
                    if (c6021p.f19556H.f19386w) {
                        C5947D0 c5947d0M6344p = c6021p.f19555G.m6344p();
                        c6021p.f19556H = c5947d0M6344p;
                        c5947d0M6344p.m6354E();
                        c6021p.f19557I = false;
                        c6021p.f19558J = null;
                    }
                    c6021p.f19556H.m6367d();
                    c5947d0 = c6021p.f19556H;
                    int i26 = c5947d0.f19383t;
                    if (z6) {
                        c5947d0.m6359J(c5975s, c5975s, true, i10);
                    } else if (obj2 != null) {
                        if (obj3 == null) {
                            obj3 = c5975s;
                        }
                        c5947d0.m6359J(obj3, obj2, false, i10);
                    } else {
                        if (obj3 == null) {
                            obj3 = c5975s;
                        }
                        c5947d0.m6359J(obj3, c5975s, false, i10);
                    }
                    c6021p.f19561M = c6021p.f19556H.m6365b(i26);
                    int i27 = (-2) - i26;
                    C5966N c5966n3 = new C5966N(-1, i10, i27, -1);
                    c12982u.m14697i(i27, new C5954H(-1, c6021p.f19574j - i12, 0));
                    arrayList.add(c5966n3);
                    ArrayList arrayList3 = new ArrayList();
                    if (z6) {
                        i13 = 0;
                    } else {
                        i13 = c6021p.f19574j;
                    }
                    c6006h1 = new C6006h0(i13, arrayList3);
                } else {
                    arrayList.add(c5966n2);
                    int i28 = c5966n2.f19422c;
                    C5954H c5954h = (C5954H) c12982u.m14694f(i28);
                    c6021p.f19574j = (c5954h != null ? c5954h.f19393b : -1) + i12;
                    C5954H c5954h2 = (C5954H) c12982u.m14694f(i28);
                    int i29 = c5954h2 != null ? c5954h2.f19392a : -1;
                    int i30 = c6006h0.f19504c;
                    int i31 = i29 - i30;
                    char c9 = 7;
                    int i32 = 8;
                    if (i29 <= i30) {
                        i14 = i31;
                        if (i30 > i29) {
                            Object[] objArr = c12982u.f41206c;
                            long[] jArr = c12982u.f41204a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i33 = 0;
                                while (true) {
                                    long j10 = jArr[i33];
                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i34 = 8 - ((~(i33 - length)) >>> 31);
                                        int i35 = 0;
                                        while (i35 < i34) {
                                            if ((j10 & 255) < 128) {
                                                C5954H c5954h3 = (C5954H) objArr[(i33 << 3) + i35];
                                                int i36 = c5954h3.f19392a;
                                                if (i36 == i29) {
                                                    c5954h3.f19392a = i30;
                                                } else if (i29 + 1 <= i36 && i36 < i30) {
                                                    c5954h3.f19392a = i36 - 1;
                                                }
                                                i16 = 8;
                                            } else {
                                                i16 = i32;
                                            }
                                            j10 >>= i16;
                                            i35++;
                                            i32 = i16;
                                        }
                                        i15 = i32;
                                        if (i34 != i15) {
                                            break;
                                        }
                                    } else {
                                        i15 = i32;
                                    }
                                    if (i33 == length) {
                                        break;
                                    }
                                    i33++;
                                    i32 = i15;
                                }
                            }
                        }
                    } else {
                        Object[] objArr2 = c12982u.f41206c;
                        long[] jArr2 = c12982u.f41204a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i37 = 0;
                            while (true) {
                                long j11 = jArr2[i37];
                                i14 = i31;
                                if ((((~j11) << c9) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i38 = 8 - ((~(i37 - length2)) >>> 31);
                                    for (int i39 = 0; i39 < i38; i39++) {
                                        if ((j11 & 255) < 128) {
                                            C5954H c5954h4 = (C5954H) objArr2[(i37 << 3) + i39];
                                            int i40 = c5954h4.f19392a;
                                            if (i40 == i29) {
                                                c5954h4.f19392a = i30;
                                            } else if (i30 <= i40 && i40 < i29) {
                                                c5954h4.f19392a = i40 + 1;
                                            }
                                        }
                                        j11 >>= 8;
                                    }
                                    if (i38 != 8) {
                                        break;
                                    }
                                    if (i37 != length2) {
                                        break;
                                    }
                                    i37++;
                                    i31 = i14;
                                    c9 = 7;
                                } else if (i37 != length2) {
                                    break;
                                    break;
                                } else {
                                    i37++;
                                    i31 = i14;
                                    c9 = 7;
                                }
                            }
                        } else {
                            i14 = i31;
                        }
                    }
                    C6280b c6280b = c6021p.f19560L;
                    int i41 = c6280b.f20400f;
                    C6021p c6021p2 = c6280b.f20395a;
                    c6280b.f20400f = (i28 - c6021p2.f19554F.f19332g) + i41;
                    c6021p.f19554F.m6333k(i28);
                    if (i14 > 0) {
                        c6280b.m6850d(false);
                        C5941A0 c5941a2 = c6021p2.f19554F;
                        if (c5941a2.f19328c > 0) {
                            int i42 = c5941a2.f19334i;
                            C5960K c5960k = c6280b.f20398d;
                            int i43 = c5960k.f19404b;
                            if ((i43 > 0 ? c5960k.f19403a[i43 - 1] : -2) != i42) {
                                if (!c6280b.f20397c && c6280b.f20399e) {
                                    c6280b.m6850d(false);
                                    C6279a c6279a = c6280b.f20396b;
                                    c6279a.getClass();
                                    c6279a.f20394a.m6845i(C6290l.f20417c);
                                    c6280b.f20397c = true;
                                }
                                if (i42 > 0) {
                                    C5995c c5995cM6323a = c5941a2.m6323a(i42);
                                    c5960k.m6397d(i42);
                                    c6280b.m6850d(false);
                                    C6279a c6279a2 = c6280b.f20396b;
                                    c6279a2.getClass();
                                    C6289k c6289k = C6289k.f20416c;
                                    C6278E c6278e = c6279a2.f20394a;
                                    c6278e.m6846j(c6289k);
                                    AbstractC9215U.m9785c(c6278e, 0, c5995cM6323a);
                                    int i44 = c6278e.f20392g;
                                    int i45 = c6289k.f20379a;
                                    int iM6839c = C6278E.m6839c(c6278e, i45);
                                    int i46 = c6289k.f20380b;
                                    if (i44 != iM6839c || c6278e.f20393h != C6278E.m6839c(c6278e, i46)) {
                                        int i47 = 1;
                                        StringBuilder sb2 = new StringBuilder();
                                        int i48 = 0;
                                        int i49 = 0;
                                        while (i48 < i45) {
                                            if (((i47 << i48) & c6278e.f20392g) != 0) {
                                                if (i49 > 0) {
                                                    sb2.append(", ");
                                                }
                                                sb2.append(c6289k.mo6758b(i48));
                                                i49++;
                                            }
                                            i48++;
                                            i47 = 1;
                                        }
                                        String string = sb2.toString();
                                        StringBuilder sbM4500y = AbstractC3794B0.m4500y(string, "StringBuilder().apply(builderAction).toString()");
                                        int i50 = 0;
                                        int i51 = 0;
                                        while (i50 < i46) {
                                            int i52 = i46;
                                            if (((1 << i50) & c6278e.f20393h) != 0) {
                                                if (i49 > 0) {
                                                    sbM4500y.append(", ");
                                                }
                                                sbM4500y.append(c6289k.mo6759c(i50));
                                                i51++;
                                            }
                                            i50++;
                                            i46 = i52;
                                        }
                                        String string2 = sbM4500y.toString();
                                        AbstractC16544l.m18093f(string2, "StringBuilder().apply(builderAction).toString()");
                                        StringBuilder sb3 = new StringBuilder("Error while pushing ");
                                        sb3.append(c6289k);
                                        sb3.append(". Not all arguments were provided. Missing ");
                                        AbstractC10763a.m11066x(sb3, i49, " int arguments (", string, ") and ");
                                        AbstractC3794B0.m4472G(sb3, i51, " object arguments (", string2, ").");
                                        throw null;
                                    }
                                    c6280b.f20397c = true;
                                }
                            }
                        }
                        C6279a c6279a3 = c6280b.f20396b;
                        c6279a3.getClass();
                        C6294p c6294p = C6294p.f20425c;
                        C6278E c6278e2 = c6279a3.f20394a;
                        c6278e2.m6846j(c6294p);
                        AbstractC9215U.m9784b(c6278e2, 0, i14);
                        int i53 = c6278e2.f20392g;
                        int i54 = c6294p.f20379a;
                        int iM6839c2 = C6278E.m6839c(c6278e2, i54);
                        int i55 = c6294p.f20380b;
                        if (i53 != iM6839c2 || c6278e2.f20393h != C6278E.m6839c(c6278e2, i55)) {
                            StringBuilder sb4 = new StringBuilder();
                            int i56 = 0;
                            for (int i57 = 0; i57 < i54; i57++) {
                                if (((1 << i57) & c6278e2.f20392g) != 0) {
                                    if (i56 > 0) {
                                        sb4.append(", ");
                                    }
                                    sb4.append(c6294p.mo6758b(i57));
                                    i56++;
                                }
                            }
                            String string3 = sb4.toString();
                            StringBuilder sbM4500y2 = AbstractC3794B0.m4500y(string3, "StringBuilder().apply(builderAction).toString()");
                            int i58 = 0;
                            int i59 = 0;
                            while (i58 < i55) {
                                int i60 = i55;
                                if (((1 << i58) & c6278e2.f20393h) != 0) {
                                    if (i56 > 0) {
                                        sbM4500y2.append(", ");
                                    }
                                    sbM4500y2.append(c6294p.mo6759c(i58));
                                    i59++;
                                }
                                i58++;
                                i55 = i60;
                            }
                            String string4 = sbM4500y2.toString();
                            AbstractC16544l.m18093f(string4, "StringBuilder().apply(builderAction).toString()");
                            StringBuilder sb5 = new StringBuilder("Error while pushing ");
                            sb5.append(c6294p);
                            sb5.append(". Not all arguments were provided. Missing ");
                            AbstractC10763a.m11066x(sb5, i56, " int arguments (", string3, ") and ");
                            AbstractC3794B0.m4472G(sb5, i59, " object arguments (", string4, ").");
                            throw null;
                        }
                    }
                    c6021p = this;
                    c6021p.m6523R(obj2, z6);
                    c6006h1 = null;
                }
            }
            c6021p.m6558u(z6, c6006h1);
        }
        iRotateLeft = Integer.rotateLeft((obj3 instanceof Enum ? ((Enum) obj3).ordinal() : obj.hashCode()) ^ Integer.rotateLeft(c6021p.f19564P, 3), 3);
        c6021p.f19564P = iRotateLeft;
        if (obj3 == null) {
            c6021p.f19576l++;
        }
        if (i11 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (c6021p.f19563O) {
            c6021p.f19554F.f19336k++;
            c5947d1 = c6021p.f19556H;
            i18 = c5947d1.f19383t;
            if (z6) {
                c5947d1.m6359J(c5975s, c5975s, true, i10);
            } else if (obj2 != null) {
                if (obj3 == null) {
                    obj3 = c5975s;
                }
                c5947d1.m6359J(obj3, obj2, false, i10);
            } else {
                if (obj3 == null) {
                    obj3 = c5975s;
                }
                c5947d1.m6359J(obj3, c5975s, false, i10);
            }
            c6006h2 = c6021p.f19573i;
            if (c6006h2 != null) {
                int i210 = (-2) - i18;
                C5966N c5966n4 = new C5966N(-1, i10, i210, -1);
                c6006h2.f19506e.m14697i(i210, new C5954H(-1, c6021p.f19574j - c6006h2.f19503b, 0));
                c6006h2.f19505d.add(c5966n4);
            }
            c6021p.m6558u(z6, null);
            return;
        }
        if (i11 != 1) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (c6021p.f19573i == null) {
            int iM6328f2 = c6021p.f19554F.m6328f();
            if (z10) {
                c5941a0 = c6021p.f19554F;
                c5941a0.getClass();
                arrayList2 = new ArrayList();
                if (c5941a0.f19336k <= 0) {
                    i17 = c5941a0.f19332g;
                    while (i17 < c5941a0.f19333h) {
                        int i211 = i17 * 5;
                        iArr = c5941a0.f19327b;
                        int i212 = iArr[i211];
                        Object objM6332j3 = c5941a0.m6332j(iArr, i17);
                        if (C5997d.m6460p(iArr, i17)) {
                            iM6462r = 1;
                        } else {
                            iM6462r = C5997d.m6462r(iArr, i17);
                        }
                        arrayList2.add(new C5966N(objM6332j3, i212, i17, iM6462r));
                        i17 += iArr[i211 + 3];
                    }
                }
                c6021p.f19573i = new C6006h0(c6021p.f19574j, arrayList2);
            } else {
                c5941a0 = c6021p.f19554F;
                c5941a0.getClass();
                arrayList2 = new ArrayList();
                if (c5941a0.f19336k <= 0) {
                    i17 = c5941a0.f19332g;
                    while (i17 < c5941a0.f19333h) {
                        int i213 = i17 * 5;
                        iArr = c5941a0.f19327b;
                        int i214 = iArr[i213];
                        Object objM6332j4 = c5941a0.m6332j(iArr, i17);
                        if (C5997d.m6460p(iArr, i17)) {
                            iM6462r = 1;
                        } else {
                            iM6462r = C5997d.m6462r(iArr, i17);
                        }
                        arrayList2.add(new C5966N(objM6332j4, i214, i17, iM6462r));
                        i17 += iArr[i213 + 3];
                    }
                }
                c6021p.f19573i = new C6006h0(c6021p.f19574j, arrayList2);
            }
        }
        c6006h0 = c6021p.f19573i;
        if (c6006h0 == null) {
            c6006h1 = null;
        } else {
            if (obj3 != null) {
                objValueOf = new C5964M(Integer.valueOf(i10), obj3);
            } else {
                objValueOf = Integer.valueOf(i10);
            }
            c12951d = ((C5983W) c6006h0.f19507f.getValue()).f19462a;
            objM14619e = c12951d.m14619e(objValueOf);
            if (objM14619e != null) {
                if (AbstractC16529F.m18083g(objM14619e)) {
                    listM18078b = AbstractC16529F.m18078b(objM14619e);
                    objRemove = listM18078b.remove(0);
                    if (listM18078b.isEmpty()) {
                        c12951d.m14621g(objValueOf);
                    }
                } else {
                    c12951d.m14621g(objValueOf);
                    objRemove = objM14619e;
                }
                AbstractC16544l.m18092e(objRemove, "null cannot be cast to non-null type V of androidx.compose.runtime.MutableScatterMultiMap.pop_impl$lambda$1");
            } else {
                objRemove = null;
            }
            C5966N c5966n5 = (C5966N) objRemove;
            arrayList = c6006h0.f19505d;
            c12982u = c6006h0.f19506e;
            i12 = c6006h0.f19503b;
            if (z10) {
            }
            c6021p.f19554F.f19336k++;
            c6021p.f19563O = true;
            c6021p.f19558J = null;
            if (c6021p.f19556H.f19386w) {
                C5947D0 c5947d0M6344p2 = c6021p.f19555G.m6344p();
                c6021p.f19556H = c5947d0M6344p2;
                c5947d0M6344p2.m6354E();
                c6021p.f19557I = false;
                c6021p.f19558J = null;
            }
            c6021p.f19556H.m6367d();
            c5947d0 = c6021p.f19556H;
            int i215 = c5947d0.f19383t;
            if (z6) {
                c5947d0.m6359J(c5975s, c5975s, true, i10);
            } else if (obj2 != null) {
                if (obj3 == null) {
                    obj3 = c5975s;
                }
                c5947d0.m6359J(obj3, obj2, false, i10);
            } else {
                if (obj3 == null) {
                    obj3 = c5975s;
                }
                c5947d0.m6359J(obj3, c5975s, false, i10);
            }
            c6021p.f19561M = c6021p.f19556H.m6365b(i215);
            int i216 = (-2) - i215;
            C5966N c5966n6 = new C5966N(-1, i10, i216, -1);
            c12982u.m14697i(i216, new C5954H(-1, c6021p.f19574j - i12, 0));
            arrayList.add(c5966n6);
            ArrayList arrayList4 = new ArrayList();
            if (z6) {
                i13 = 0;
            } else {
                i13 = c6021p.f19574j;
            }
            c6006h1 = new C6006h0(i13, arrayList4);
        }
        c6021p.m6558u(z6, c6006h1);
    }

    /* JADX INFO: renamed from: N */
    public final void m6519N() {
        m6518M(-127, null, null, 0);
    }

    /* JADX INFO: renamed from: O */
    public final void m6520O(int i10, C5987Y c5987y) {
        m6518M(i10, c5987y, null, 0);
    }

    /* JADX INFO: renamed from: P */
    public final void m6521P(int i10, Object obj) {
        m6518M(i10, obj, null, 0);
    }

    /* JADX INFO: renamed from: Q */
    public final void m6522Q() {
        m6518M(125, null, null, 1);
        this.f19581q = true;
    }

    /* JADX INFO: renamed from: R */
    public final void m6523R(Object obj, boolean z6) {
        if (z6) {
            C5941A0 c5941a0 = this.f19554F;
            if (c5941a0.f19336k <= 0) {
                if (C5997d.m6460p(c5941a0.f19327b, c5941a0.f19332g)) {
                    c5941a0.m6336n();
                    return;
                } else {
                    C5997d.m6443b0("Expected a node group");
                    throw null;
                }
            }
            return;
        }
        if (obj != null && this.f19554F.m6327e() != obj) {
            C6280b c6280b = this.f19560L;
            c6280b.getClass();
            c6280b.m6850d(false);
            C6279a c6279a = c6280b.f20396b;
            c6279a.getClass();
            C6303y c6303y = C6303y.f20434c;
            C6278E c6278e = c6279a.f20394a;
            c6278e.m6846j(c6303y);
            AbstractC9215U.m9785c(c6278e, 0, obj);
            int i10 = c6278e.f20392g;
            int i11 = c6303y.f20379a;
            int iM6839c = C6278E.m6839c(c6278e, i11);
            int i12 = c6303y.f20380b;
            if (i10 != iM6839c || c6278e.f20393h != C6278E.m6839c(c6278e, i12)) {
                StringBuilder sb2 = new StringBuilder();
                int i13 = 0;
                for (int i14 = 0; i14 < i11; i14++) {
                    if (((1 << i14) & c6278e.f20392g) != 0) {
                        if (i13 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(c6303y.mo6758b(i14));
                        i13++;
                    }
                }
                String string = sb2.toString();
                StringBuilder sbM4500y = AbstractC3794B0.m4500y(string, "StringBuilder().apply(builderAction).toString()");
                int i15 = 0;
                for (int i16 = 0; i16 < i12; i16++) {
                    if (((1 << i16) & c6278e.f20393h) != 0) {
                        if (i13 > 0) {
                            sbM4500y.append(", ");
                        }
                        sbM4500y.append(c6303y.mo6759c(i16));
                        i15++;
                    }
                }
                String string2 = sbM4500y.toString();
                AbstractC16544l.m18093f(string2, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb3 = new StringBuilder("Error while pushing ");
                sb3.append(c6303y);
                sb3.append(". Not all arguments were provided. Missing ");
                AbstractC10763a.m11066x(sb3, i13, " int arguments (", string, ") and ");
                AbstractC3794B0.m4472G(sb3, i15, QzvfuIgrngtl.evImSlNy, string2, ").");
                throw null;
            }
        }
        this.f19554F.m6336n();
    }

    /* JADX INFO: renamed from: S */
    public final void m6524S(int i10) {
        int i11;
        int i12;
        if (this.f19573i != null) {
            m6518M(i10, null, null, 0);
            return;
        }
        if (this.f19581q) {
            C5997d.m6470z("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        this.f19564P = this.f19576l ^ Integer.rotateLeft(Integer.rotateLeft(this.f19564P, 3) ^ i10, 3);
        this.f19576l++;
        C5941A0 c5941a0 = this.f19554F;
        boolean z6 = this.f19563O;
        C5975S c5975s = C6013l.f19514a;
        if (z6) {
            c5941a0.f19336k++;
            this.f19556H.m6359J(c5975s, c5975s, false, i10);
            m6558u(false, null);
            return;
        }
        if (c5941a0.m6328f() == i10 && ((i12 = c5941a0.f19332g) >= c5941a0.f19333h || !C5997d.m6459o(c5941a0.f19327b, i12))) {
            c5941a0.m6336n();
            m6558u(false, null);
            return;
        }
        if (c5941a0.f19336k <= 0 && (i11 = c5941a0.f19332g) != c5941a0.f19333h) {
            int i13 = this.f19574j;
            m6511E();
            this.f19560L.m6851e(i13, c5941a0.m6334l());
            C5997d.m6464t(this.f19582r, i11, c5941a0.f19332g);
        }
        c5941a0.f19336k++;
        this.f19563O = true;
        this.f19558J = null;
        if (this.f19556H.f19386w) {
            C5947D0 c5947d0M6344p = this.f19555G.m6344p();
            this.f19556H = c5947d0M6344p;
            c5947d0M6344p.m6354E();
            this.f19557I = false;
            this.f19558J = null;
        }
        C5947D0 c5947d0 = this.f19556H;
        c5947d0.m6367d();
        int i14 = c5947d0.f19383t;
        c5947d0.m6359J(c5975s, c5975s, false, i10);
        this.f19561M = c5947d0.m6365b(i14);
        m6558u(false, null);
    }

    /* JADX INFO: renamed from: T */
    public final void m6525T(int i10) {
        m6518M(i10, null, null, 0);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX INFO: renamed from: U */
    public final C6021p m6526U(int i10) {
        C6018n0 c6018n0;
        m6524S(i10);
        boolean z6 = this.f19563O;
        C6029t c6029t = this.f19571g;
        C5980U0 c5980u0 = this.f19552D;
        if (z6) {
            C6018n0 c6018n1 = new C6018n0(c6029t);
            c5980u0.f19461a.add(c6018n1);
            m6539d0(c6018n1);
            c6018n1.f19537e = this.f19549A;
            c6018n1.f19533a &= -17;
        } else {
            ArrayList arrayList = this.f19582r;
            int iM6423J = C5997d.m6423J(this.f19554F.f19334i, arrayList);
            C5962L c5962l = iM6423J >= 0 ? (C5962L) arrayList.remove(iM6423J) : null;
            Object objM6330h = this.f19554F.m6330h();
            if (AbstractC16544l.m18089b(objM6330h, C6013l.f19514a)) {
                c6018n0 = new C6018n0(c6029t);
                m6539d0(c6018n0);
            } else {
                AbstractC16544l.m18092e(objM6330h, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                c6018n0 = (C6018n0) objM6330h;
            }
            if (c5962l == null) {
                int i11 = c6018n0.f19533a;
                boolean z10 = (i11 & 64) != 0;
                if (z10) {
                    c6018n0.f19533a = i11 & (-65);
                }
                if (z10) {
                    c6018n0.f19533a |= 8;
                } else {
                    c6018n0.f19533a &= -9;
                }
            } else {
                c6018n0.f19533a |= 8;
            }
            c5980u0.f19461a.add(c6018n0);
            c6018n0.f19537e = this.f19549A;
            c6018n0.f19533a &= -17;
        }
        return this;
    }

    /* JADX INFO: renamed from: V */
    public final void m6527V(Object obj) {
        if (!this.f19563O && this.f19554F.m6328f() == 207 && !AbstractC16544l.m18089b(this.f19554F.m6327e(), obj) && this.f19589y < 0) {
            this.f19589y = this.f19554F.f19332g;
            this.f19588x = true;
        }
        m6518M(207, null, obj, 0);
    }

    /* JADX INFO: renamed from: W */
    public final void m6528W() {
        m6518M(125, null, null, 2);
        this.f19581q = true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: X */
    public final void m6529X() {
        this.f19576l = 0;
        C5943B0 c5943b0 = this.f19567c;
        this.f19554F = c5943b0.m6343m();
        m6518M(100, null, null, 0);
        AbstractC6025r abstractC6025r = this.f19566b;
        abstractC6025r.mo6495m();
        this.f19584t = abstractC6025r.mo6488f();
        this.f19587w.m6397d(this.f19586v ? 1 : 0);
        this.f19586v = m6542f(this.f19584t);
        this.f19558J = null;
        if (!this.f19580p) {
            this.f19580p = abstractC6025r.mo6486d();
        }
        if (!this.f19550B) {
            this.f19550B = abstractC6025r.mo6487e();
        }
        Set set = (Set) C5997d.m6433T(this.f19584t, AbstractC10133b.f30038a);
        if (set != null) {
            set.add(c5943b0);
            abstractC6025r.mo6492j(set);
        }
        m6518M(abstractC6025r.mo6489g(), null, null, 0);
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m6530Y(C6018n0 c6018n0, Object obj) {
        C5995c c5995c = c6018n0.f19535c;
        if (c5995c == null) {
            return false;
        }
        int iM6341f = this.f19554F.f19326a.m6341f(c5995c);
        if (!this.f19553E || iM6341f < this.f19554F.f19332g) {
            return false;
        }
        ArrayList arrayList = this.f19582r;
        int iM6423J = C5997d.m6423J(iM6341f, arrayList);
        if (iM6423J < 0) {
            int i10 = -(iM6423J + 1);
            if (!(obj instanceof C5944C)) {
                obj = null;
            }
            arrayList.add(i10, new C5962L(c6018n0, iM6341f, obj));
        } else {
            C5962L c5962l = (C5962L) arrayList.get(iM6423J);
            if (obj instanceof C5944C) {
                Object obj2 = c5962l.f19409c;
                if (obj2 == null) {
                    c5962l.f19409c = obj;
                } else if (obj2 instanceof C12954G) {
                    ((C12954G) obj2).m14624a(obj);
                } else {
                    int i11 = AbstractC12958K.f41151a;
                    C12954G c12954g = new C12954G(2);
                    c12954g.f41144b[c12954g.m14627d(obj2)] = obj2;
                    c12954g.f41144b[c12954g.m14627d(obj)] = obj;
                    c5962l.f19409c = c12954g;
                }
            } else {
                c5962l.f19409c = null;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: Z */
    public final void m6531Z(int i10, int i11) {
        if (m6541e0(i10) != i11) {
            if (i10 < 0) {
                C12980s c12980s = this.f19579o;
                if (c12980s == null) {
                    c12980s = new C12980s();
                    this.f19579o = c12980s;
                }
                c12980s.m14683g(i10, i11);
                return;
            }
            int[] iArr = this.f19578n;
            if (iArr == null) {
                iArr = new int[this.f19554F.f19328c];
                AbstractC17678l.m19312s(iArr, -1, 0, 6);
                this.f19578n = iArr;
            }
            iArr[i10] = i11;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6532a() {
        m6546i();
        this.f19572h.f19461a.clear();
        this.f19577m.f19404b = 0;
        this.f19583s.f19404b = 0;
        this.f19587w.f19404b = 0;
        this.f19585u = null;
        C6281c c6281c = this.f19562N;
        c6281c.f20408b.m6840d();
        c6281c.f20407a.m6840d();
        this.f19564P = 0;
        this.f19590z = 0;
        this.f19581q = false;
        this.f19563O = false;
        this.f19588x = false;
        this.f19553E = false;
        this.f19589y = -1;
        C5941A0 c5941a0 = this.f19554F;
        if (!c5941a0.f19331f) {
            c5941a0.m6325c();
        }
        if (this.f19556H.f19386w) {
            return;
        }
        m6559v();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m6533a0(int i10, int i11) {
        int iM6541e0 = m6541e0(i10);
        if (iM6541e0 != i11) {
            int i12 = i11 - iM6541e0;
            C5980U0 c5980u0 = this.f19572h;
            int size = c5980u0.f19461a.size() - 1;
            while (i10 != -1) {
                int iM6541e1 = m6541e0(i10) + i12;
                m6531Z(i10, iM6541e1);
                for (int i13 = size; -1 < i13; i13--) {
                    C6006h0 c6006h0 = (C6006h0) c5980u0.f19461a.get(i13);
                    if (c6006h0 != null && c6006h0.m6476a(i10, iM6541e1)) {
                        size = i13 - 1;
                        break;
                    }
                }
                if (i10 < 0) {
                    i10 = this.f19554F.f19334i;
                } else if (C5997d.m6460p(this.f19554F.f19327b, i10)) {
                    return;
                } else {
                    i10 = C5997d.m6463s(this.f19554F.f19327b, i10);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6534b(Object obj, InterfaceC1439n interfaceC1439n) {
        int i10 = 0;
        if (this.f19563O) {
            C6281c c6281c = this.f19562N;
            c6281c.getClass();
            C6304z c6304z = C6304z.f20435c;
            C6278E c6278e = c6281c.f20407a;
            c6278e.m6846j(c6304z);
            AbstractC9215U.m9785c(c6278e, 0, obj);
            AbstractC16544l.m18092e(interfaceC1439n, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            AbstractC16529F.m18081e(2, interfaceC1439n);
            AbstractC9215U.m9785c(c6278e, 1, interfaceC1439n);
            int i11 = c6278e.f20392g;
            int i12 = c6304z.f20379a;
            int iM6839c = C6278E.m6839c(c6278e, i12);
            int i13 = c6304z.f20380b;
            if (i11 == iM6839c && c6278e.f20393h == C6278E.m6839c(c6278e, i13)) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            int i14 = 0;
            while (i14 < i12) {
                int i15 = i12;
                if (((1 << i14) & c6278e.f20392g) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(c6304z.mo6758b(i14));
                    i10++;
                }
                i14++;
                i12 = i15;
            }
            String string = sb2.toString();
            StringBuilder sbM4500y = AbstractC3794B0.m4500y(string, "StringBuilder().apply(builderAction).toString()");
            int i16 = 0;
            int i17 = 0;
            while (i17 < i13) {
                int i18 = i13;
                if (((1 << i17) & c6278e.f20393h) != 0) {
                    if (i10 > 0) {
                        sbM4500y.append(", ");
                    }
                    sbM4500y.append(c6304z.mo6759c(i17));
                    i16++;
                }
                i17++;
                i13 = i18;
            }
            String string2 = sbM4500y.toString();
            AbstractC16544l.m18093f(string2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder("Error while pushing ");
            sb3.append(c6304z);
            sb3.append(". Not all arguments were provided. Missing ");
            AbstractC10763a.m11066x(sb3, i10, " int arguments (", string, ") and ");
            AbstractC3794B0.m4472G(sb3, i16, " object arguments (", string2, ").");
            throw null;
        }
        C6280b c6280b = this.f19560L;
        c6280b.m6848b();
        C6279a c6279a = c6280b.f20396b;
        c6279a.getClass();
        C6304z c6304z2 = C6304z.f20435c;
        C6278E c6278e2 = c6279a.f20394a;
        c6278e2.m6846j(c6304z2);
        int i19 = 0;
        AbstractC9215U.m9785c(c6278e2, 0, obj);
        AbstractC16544l.m18092e(interfaceC1439n, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        AbstractC16529F.m18081e(2, interfaceC1439n);
        AbstractC9215U.m9785c(c6278e2, 1, interfaceC1439n);
        int i20 = c6278e2.f20392g;
        int i21 = c6304z2.f20379a;
        int iM6839c2 = C6278E.m6839c(c6278e2, i21);
        int i22 = c6304z2.f20380b;
        if (i20 == iM6839c2 && c6278e2.f20393h == C6278E.m6839c(c6278e2, i22)) {
            return;
        }
        StringBuilder sb4 = new StringBuilder();
        for (int i23 = 0; i23 < i21; i23++) {
            if (((1 << i23) & c6278e2.f20392g) != 0) {
                if (i19 > 0) {
                    sb4.append(", ");
                }
                sb4.append(c6304z2.mo6758b(i23));
                i19++;
            }
        }
        String string3 = sb4.toString();
        StringBuilder sbM4500y2 = AbstractC3794B0.m4500y(string3, "StringBuilder().apply(builderAction).toString()");
        int i24 = 0;
        int i25 = 0;
        while (i24 < i22) {
            int i26 = i22;
            if (((1 << i24) & c6278e2.f20393h) != 0) {
                if (i19 > 0) {
                    sbM4500y2.append(", ");
                }
                sbM4500y2.append(c6304z2.mo6759c(i24));
                i25++;
            }
            i24++;
            i22 = i26;
        }
        String string4 = sbM4500y2.toString();
        AbstractC16544l.m18093f(string4, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(c6304z2);
        sb5.append(". Not all arguments were provided. Missing ");
        AbstractC10763a.m11066x(sb5, i19, " int arguments (", string3, ") and ");
        AbstractC3794B0.m4472G(sb5, i25, " object arguments (", string4, ").");
        throw null;
    }

    /* JADX INFO: renamed from: b0 */
    public final C8414f m6535b0(InterfaceC6008i0 interfaceC6008i0, C8414f c8414f) {
        C8414f c8414f2 = (C8414f) interfaceC6008i0;
        c8414f2.getClass();
        C8413e c8413e = new C8413e(c8414f2);
        c8413e.f26159s0 = c8414f2;
        c8413e.putAll(c8414f);
        C8414f c8414fM8971c = c8413e.build();
        m6520O(204, C5997d.f19478d);
        m6507A();
        m6539d0(c8414fM8971c);
        m6507A();
        m6539d0(c8414f);
        m6553p(false);
        return c8414fM8971c;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6536c(float f10) {
        Object objM6507A = m6507A();
        if ((objM6507A instanceof Float) && f10 == ((Number) objM6507A).floatValue()) {
            return false;
        }
        m6539d0(Float.valueOf(f10));
        return true;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m6537c0(Object obj) {
        int i10;
        C5941A0 c5941a0;
        int i11;
        C5947D0 c5947d0;
        if (obj instanceof InterfaceC6034v0) {
            C5995c c5995cM6323a = null;
            if (this.f19563O) {
                C6279a c6279a = this.f19560L.f20396b;
                c6279a.getClass();
                C6296r c6296r = C6296r.f20427c;
                C6278E c6278e = c6279a.f20394a;
                c6278e.m6846j(c6296r);
                AbstractC9215U.m9785c(c6278e, 0, (InterfaceC6034v0) obj);
                int i12 = c6278e.f20392g;
                int i13 = c6296r.f20379a;
                int iM6839c = C6278E.m6839c(c6278e, i13);
                int i14 = c6296r.f20380b;
                if (i12 != iM6839c || c6278e.f20393h != C6278E.m6839c(c6278e, i14)) {
                    StringBuilder sb2 = new StringBuilder();
                    int i15 = 0;
                    for (int i16 = 0; i16 < i13; i16++) {
                        if (((1 << i16) & c6278e.f20392g) != 0) {
                            if (i15 > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(c6296r.mo6758b(i16));
                            i15++;
                        }
                    }
                    String string = sb2.toString();
                    StringBuilder sbM4500y = AbstractC3794B0.m4500y(string, "StringBuilder().apply(builderAction).toString()");
                    int i17 = 0;
                    for (int i18 = 0; i18 < i14; i18++) {
                        if (((1 << i18) & c6278e.f20393h) != 0) {
                            if (i15 > 0) {
                                sbM4500y.append(", ");
                            }
                            sbM4500y.append(c6296r.mo6759c(i18));
                            i17++;
                        }
                    }
                    String string2 = sbM4500y.toString();
                    AbstractC16544l.m18093f(string2, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb3 = new StringBuilder("Error while pushing ");
                    sb3.append(c6296r);
                    sb3.append(". Not all arguments were provided. Missing ");
                    AbstractC10763a.m11066x(sb3, i15, " int arguments (", string, ") and ");
                    AbstractC3794B0.m4472G(sb3, i17, " object arguments (", string2, ").");
                    throw null;
                }
            }
            this.f19568d.add(obj);
            InterfaceC6034v0 interfaceC6034v0 = (InterfaceC6034v0) obj;
            if (this.f19563O) {
                C5947D0 c5947d1 = this.f19556H;
                int i19 = c5947d1.f19383t;
                if (i19 > c5947d1.f19385v + 1) {
                    int i20 = i19 - 1;
                    int iM6387y = c5947d1.m6387y(c5947d1.f19365b, i20);
                    while (true) {
                        i11 = i20;
                        i20 = iM6387y;
                        c5947d0 = this.f19556H;
                        if (i20 == c5947d0.f19385v || i20 < 0) {
                            break;
                        } else {
                            iM6387y = c5947d0.m6387y(c5947d0.f19365b, i20);
                        }
                    }
                    c5995cM6323a = c5947d0.m6365b(i11);
                }
            } else {
                C5941A0 c5941a1 = this.f19554F;
                int i21 = c5941a1.f19332g;
                if (i21 > c5941a1.f19334i + 1) {
                    int i22 = i21 - 1;
                    int i23 = c5941a1.f19327b[(i22 * 5) + 2];
                    while (true) {
                        i10 = i22;
                        i22 = i23;
                        c5941a0 = this.f19554F;
                        if (i22 == c5941a0.f19334i || i22 < 0) {
                            break;
                        } else {
                            i23 = c5941a0.f19327b[(i22 * 5) + 2];
                        }
                    }
                    c5995cM6323a = c5941a0.m6323a(i10);
                }
            }
            C6036w0 c6036w0 = new C6036w0();
            c6036w0.f19669a = interfaceC6034v0;
            c6036w0.f19670b = c5995cM6323a;
            obj = c6036w0;
        }
        m6539d0(obj);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m6538d(int i10) {
        Object objM6507A = m6507A();
        if ((objM6507A instanceof Integer) && i10 == ((Number) objM6507A).intValue()) {
            return false;
        }
        m6539d0(Integer.valueOf(i10));
        return true;
    }

    /* JADX INFO: renamed from: d0 */
    public final void m6539d0(Object obj) {
        int i10;
        int i11;
        if (this.f19563O) {
            C5947D0 c5947d0 = this.f19556H;
            if (c5947d0.f19377n <= 0 || c5947d0.f19372i == c5947d0.f19374k) {
                c5947d0.m6388z(obj);
                return;
            }
            C12982u c12982u = c5947d0.f19382s;
            if (c12982u == null) {
                c12982u = new C12982u();
            }
            c5947d0.f19382s = c12982u;
            int i12 = c5947d0.f19385v;
            Object objM14694f = c12982u.m14694f(i12);
            if (objM14694f == null) {
                objM14694f = new C12949B();
                c12982u.m14697i(i12, objM14694f);
            }
            ((C12949B) objM14694f).m14607a(obj);
            return;
        }
        C5941A0 c5941a0 = this.f19554F;
        boolean z6 = c5941a0.f19339n;
        int i13 = 1;
        C6280b c6280b = this.f19560L;
        if (!z6) {
            C5995c c5995cM6323a = c5941a0.m6323a(c5941a0.f19334i);
            C6279a c6279a = c6280b.f20396b;
            c6279a.getClass();
            C6283e c6283e = C6283e.f20410c;
            C6278E c6278e = c6279a.f20394a;
            c6278e.m6846j(c6283e);
            int i14 = 0;
            AbstractC9215U.m9785c(c6278e, 0, c5995cM6323a);
            AbstractC9215U.m9785c(c6278e, 1, obj);
            int i15 = c6278e.f20392g;
            int i16 = c6283e.f20379a;
            int iM6839c = C6278E.m6839c(c6278e, i16);
            int i17 = c6283e.f20380b;
            if (i15 == iM6839c && c6278e.f20393h == C6278E.m6839c(c6278e, i17)) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            int i18 = 0;
            while (i18 < i16) {
                if (((i13 << i18) & c6278e.f20392g) != 0) {
                    if (i14 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(c6283e.mo6758b(i18));
                    i14++;
                }
                i18++;
                i13 = 1;
            }
            String string = sb2.toString();
            StringBuilder sbM4500y = AbstractC3794B0.m4500y(string, "StringBuilder().apply(builderAction).toString()");
            int i19 = 0;
            int i20 = 0;
            while (i19 < i17) {
                int i21 = i17;
                if (((1 << i19) & c6278e.f20393h) != 0) {
                    if (i14 > 0) {
                        sbM4500y.append(", ");
                    }
                    sbM4500y.append(c6283e.mo6759c(i19));
                    i20++;
                }
                i19++;
                i17 = i21;
            }
            String string2 = sbM4500y.toString();
            AbstractC16544l.m18093f(string2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder("Error while pushing ");
            sb3.append(c6283e);
            sb3.append(". Not all arguments were provided. Missing ");
            AbstractC10763a.m11066x(sb3, i14, " int arguments (", string, ") and ");
            AbstractC3794B0.m4472G(sb3, i20, " object arguments (", string2, ").");
            throw null;
        }
        int iM6465u = (c5941a0.f19337l - C5997d.m6465u(c5941a0.f19327b, c5941a0.f19334i)) - 1;
        if (c6280b.f20395a.f19554F.f19334i - c6280b.f20400f >= 0) {
            c6280b.m6850d(true);
            C6279a c6279a2 = c6280b.f20396b;
            C6291m c6291m = C6291m.f20421g;
            C6278E c6278e2 = c6279a2.f20394a;
            c6278e2.m6846j(c6291m);
            AbstractC9215U.m9785c(c6278e2, 0, obj);
            AbstractC9215U.m9784b(c6278e2, 0, iM6465u);
            if (c6278e2.f20392g == C6278E.m6839c(c6278e2, 1) && c6278e2.f20393h == C6278E.m6839c(c6278e2, 1)) {
                return;
            }
            StringBuilder sb4 = new StringBuilder();
            if ((c6278e2.f20392g & 1) != 0) {
                sb4.append(c6291m.mo6758b(0));
                i10 = 1;
            } else {
                i10 = 0;
            }
            String string3 = sb4.toString();
            StringBuilder sbM4500y2 = AbstractC3794B0.m4500y(string3, "StringBuilder().apply(builderAction).toString()");
            if ((c6278e2.f20393h & 1) != 0) {
                if (i10 > 0) {
                    sbM4500y2.append(", ");
                }
                sbM4500y2.append(c6291m.mo6759c(0));
            } else {
                i13 = 0;
            }
            String string4 = sbM4500y2.toString();
            AbstractC16544l.m18093f(string4, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb5 = new StringBuilder("Error while pushing ");
            sb5.append(c6291m);
            sb5.append(". Not all arguments were provided. Missing ");
            AbstractC10763a.m11066x(sb5, i10, " int arguments (", string3, ") and ");
            AbstractC3794B0.m4472G(sb5, i13, " object arguments (", string4, ").");
            throw null;
        }
        C5941A0 c5941a1 = this.f19554F;
        C5995c c5995cM6323a2 = c5941a1.m6323a(c5941a1.f19334i);
        C6279a c6279a3 = c6280b.f20396b;
        C6291m c6291m2 = C6291m.f20420f;
        C6278E c6278e3 = c6279a3.f20394a;
        c6278e3.m6846j(c6291m2);
        AbstractC9215U.m9785c(c6278e3, 0, obj);
        AbstractC9215U.m9785c(c6278e3, 1, c5995cM6323a2);
        AbstractC9215U.m9784b(c6278e3, 0, iM6465u);
        if (c6278e3.f20392g == C6278E.m6839c(c6278e3, 1) && c6278e3.f20393h == C6278E.m6839c(c6278e3, 2)) {
            return;
        }
        StringBuilder sb6 = new StringBuilder();
        if ((c6278e3.f20392g & 1) != 0) {
            sb6.append(c6291m2.mo6758b(0));
            i11 = 1;
        } else {
            i11 = 0;
        }
        String string5 = sb6.toString();
        StringBuilder sbM4500y3 = AbstractC3794B0.m4500y(string5, "StringBuilder().apply(builderAction).toString()");
        int i22 = 0;
        int i23 = 0;
        for (int i24 = 2; i22 < i24; i24 = 2) {
            if (((1 << i22) & c6278e3.f20393h) != 0) {
                if (i11 > 0) {
                    sbM4500y3.append(", ");
                }
                sbM4500y3.append(c6291m2.mo6759c(i22));
                i23++;
            }
            i22++;
        }
        String string6 = sbM4500y3.toString();
        AbstractC16544l.m18093f(string6, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb7 = new StringBuilder("Error while pushing ");
        sb7.append(c6291m2);
        sb7.append(". Not all arguments were provided. Missing ");
        AbstractC10763a.m11066x(sb7, i11, " int arguments (", string5, ") and ");
        AbstractC3794B0.m4472G(sb7, i23, " object arguments (", string6, ").");
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m6540e(long j10) {
        Object objM6507A = m6507A();
        if ((objM6507A instanceof Long) && j10 == ((Number) objM6507A).longValue()) {
            return false;
        }
        m6539d0(Long.valueOf(j10));
        return true;
    }

    /* JADX INFO: renamed from: e0 */
    public final int m6541e0(int i10) {
        int i11;
        if (i10 >= 0) {
            int[] iArr = this.f19578n;
            return (iArr == null || (i11 = iArr[i10]) < 0) ? C5997d.m6462r(this.f19554F.f19327b, i10) : i11;
        }
        C12980s c12980s = this.f19579o;
        if (c12980s == null || c12980s.m14679c(i10) < 0) {
            return 0;
        }
        return c12980s.m14680d(i10);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m6542f(Object obj) {
        if (AbstractC16544l.m18089b(m6507A(), obj)) {
            return false;
        }
        m6539d0(obj);
        return true;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m6543f0() {
        if (!this.f19581q) {
            C5997d.m6470z("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw null;
        }
        this.f19581q = false;
        if (this.f19563O) {
            C5997d.m6470z("useNode() called while inserting");
            throw null;
        }
        C5941A0 c5941a0 = this.f19554F;
        Object objM6331i = c5941a0.m6331i(c5941a0.f19334i);
        C6280b c6280b = this.f19560L;
        c6280b.m6849c();
        c6280b.f20402h.f19461a.add(objM6331i);
        if (this.f19588x && (objM6331i instanceof InterfaceC6009j)) {
            c6280b.m6848b();
            C6279a c6279a = c6280b.f20396b;
            c6279a.getClass();
            if (objM6331i instanceof InterfaceC6009j) {
                c6279a.f20394a.m6845i(C6275B.f20378c);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m6544g(boolean z6) {
        Object objM6507A = m6507A();
        if ((objM6507A instanceof Boolean) && z6 == ((Boolean) objM6507A).booleanValue()) {
            return false;
        }
        m6539d0(Boolean.valueOf(z6));
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m6545h(Object obj) {
        if (m6507A() == obj) {
            return false;
        }
        m6539d0(obj);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m6546i() {
        this.f19573i = null;
        this.f19574j = 0;
        this.f19575k = 0;
        this.f19564P = 0;
        this.f19581q = false;
        C6280b c6280b = this.f19560L;
        c6280b.f20397c = false;
        c6280b.f20398d.f19404b = 0;
        c6280b.f20400f = 0;
        this.f19552D.f19461a.clear();
        this.f19578n = null;
        this.f19579o = null;
    }

    /* JADX INFO: renamed from: j */
    public final int m6547j(int i10, int i11, int i12, int i13) {
        int iOrdinal;
        Object objM6324b;
        if (i10 == i12) {
            return i13;
        }
        C5941A0 c5941a0 = this.f19554F;
        boolean zM6459o = C5997d.m6459o(c5941a0.f19327b, i10);
        int[] iArr = c5941a0.f19327b;
        if (zM6459o) {
            Object objM6332j = c5941a0.m6332j(iArr, i10);
            if (objM6332j != null) {
                iOrdinal = objM6332j instanceof Enum ? ((Enum) objM6332j).ordinal() : objM6332j.hashCode();
            } else {
                iOrdinal = 0;
            }
        } else {
            int iHashCode = iArr[i10 * 5];
            if (iHashCode == 207 && (objM6324b = c5941a0.m6324b(iArr, i10)) != null && !objM6324b.equals(C6013l.f19514a)) {
                iHashCode = objM6324b.hashCode();
            }
            iOrdinal = iHashCode;
        }
        if (iOrdinal == 126665345) {
            return iOrdinal;
        }
        int i14 = this.f19554F.f19327b[(i10 * 5) + 2];
        if (i14 != i12) {
            i13 = m6547j(i14, m6508B(i14), i12, i13);
        }
        if (C5997d.m6459o(this.f19554F.f19327b, i10)) {
            i11 = 0;
        }
        return Integer.rotateLeft(Integer.rotateLeft(i13, 3) ^ iOrdinal, 3) ^ i11;
    }

    /* JADX INFO: renamed from: k */
    public final Object m6548k(AbstractC6012k0 abstractC6012k0) {
        return C5997d.m6433T(m6550m(), abstractC6012k0);
    }

    /* JADX INFO: renamed from: l */
    public final void m6549l(InterfaceC1426a interfaceC1426a) {
        int i10;
        int i11;
        int i12;
        if (!this.f19581q) {
            C5997d.m6470z("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw null;
        }
        this.f19581q = false;
        if (!this.f19563O) {
            C5997d.m6470z("createNode() can only be called when inserting");
            throw null;
        }
        C5960K c5960k = this.f19577m;
        int i13 = c5960k.f19403a[c5960k.f19404b - 1];
        C5947D0 c5947d0 = this.f19556H;
        C5995c c5995cM6365b = c5947d0.m6365b(c5947d0.f19385v);
        this.f19575k++;
        C6281c c6281c = this.f19562N;
        C6291m c6291m = C6291m.f20418d;
        C6278E c6278e = c6281c.f20407a;
        c6278e.m6846j(c6291m);
        AbstractC9215U.m9785c(c6278e, 0, interfaceC1426a);
        AbstractC9215U.m9784b(c6278e, 0, i13);
        AbstractC9215U.m9785c(c6278e, 1, c5995cM6365b);
        if (!(c6278e.f20392g == C6278E.m6839c(c6278e, 1) && c6278e.f20393h == C6278E.m6839c(c6278e, 2))) {
            StringBuilder sb2 = new StringBuilder();
            if ((c6278e.f20392g & 1) != 0) {
                sb2.append(c6291m.mo6758b(0));
                i12 = 1;
            } else {
                i12 = 0;
            }
            String string = sb2.toString();
            StringBuilder sbM4500y = AbstractC3794B0.m4500y(string, "StringBuilder().apply(builderAction).toString()");
            int i14 = 0;
            for (int i15 = 0; i15 < 2; i15++) {
                if (((1 << i15) & c6278e.f20393h) != 0) {
                    if (i12 > 0) {
                        sbM4500y.append(", ");
                    }
                    sbM4500y.append(c6291m.mo6759c(i15));
                    i14++;
                }
            }
            String string2 = sbM4500y.toString();
            AbstractC16544l.m18093f(string2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder("Error while pushing ");
            sb3.append(c6291m);
            sb3.append(". Not all arguments were provided. Missing ");
            AbstractC10763a.m11066x(sb3, i12, " int arguments (", string, ") and ");
            AbstractC3794B0.m4472G(sb3, i14, " object arguments (", string2, ").");
            throw null;
        }
        C6291m c6291m2 = C6291m.f20419e;
        C6278E c6278e2 = c6281c.f20408b;
        c6278e2.m6846j(c6291m2);
        AbstractC9215U.m9784b(c6278e2, 0, i13);
        AbstractC9215U.m9785c(c6278e2, 0, c5995cM6365b);
        if (c6278e2.f20392g == C6278E.m6839c(c6278e2, 1) && c6278e2.f20393h == C6278E.m6839c(c6278e2, 1)) {
            return;
        }
        StringBuilder sb4 = new StringBuilder();
        if ((c6278e2.f20392g & 1) != 0) {
            sb4.append(c6291m2.mo6758b(0));
            i10 = 1;
        } else {
            i10 = 0;
        }
        String string3 = sb4.toString();
        StringBuilder sbM4500y2 = AbstractC3794B0.m4500y(string3, "StringBuilder().apply(builderAction).toString()");
        if ((c6278e2.f20393h & 1) != 0) {
            if (i10 > 0) {
                sbM4500y2.append(", ");
            }
            sbM4500y2.append(c6291m2.mo6759c(0));
            i11 = 1;
        } else {
            i11 = 0;
        }
        String string4 = sbM4500y2.toString();
        AbstractC16544l.m18093f(string4, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb5 = new StringBuilder("Error while pushing ");
        sb5.append(c6291m2);
        sb5.append(". Not all arguments were provided. Missing ");
        AbstractC10763a.m11066x(sb5, i10, " int arguments (", string3, ") and ");
        AbstractC3794B0.m4472G(sb5, i11, " object arguments (", string4, ").");
        throw null;
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC6008i0 m6550m() {
        InterfaceC6008i0 interfaceC6008i0;
        InterfaceC6008i0 interfaceC6008i1;
        Object obj;
        Object obj2;
        InterfaceC6008i0 interfaceC6008i2 = this.f19558J;
        if (interfaceC6008i2 != null) {
            return interfaceC6008i2;
        }
        int i10 = this.f19554F.f19334i;
        boolean z6 = this.f19563O;
        C5987Y c5987y = C5997d.f19477c;
        if (z6 && this.f19557I) {
            int iM6387y = this.f19556H.f19385v;
            while (iM6387y > 0) {
                C5947D0 c5947d0 = this.f19556H;
                if (c5947d0.f19365b[c5947d0.m6378p(iM6387y) * 5] == 202) {
                    C5947D0 c5947d1 = this.f19556H;
                    int iM6378p = c5947d1.m6378p(iM6387y);
                    if (C5997d.m6459o(c5947d1.f19365b, iM6378p)) {
                        Object[] objArr = c5947d1.f19366c;
                        int[] iArr = c5947d1.f19365b;
                        int i11 = iM6378p * 5;
                        obj = objArr[C5997d.m6416C(iArr[i11 + 1] >> 30) + iArr[i11 + 4]];
                    } else {
                        obj = null;
                    }
                    if (AbstractC16544l.m18089b(obj, c5987y)) {
                        C5947D0 c5947d2 = this.f19556H;
                        int iM6378p2 = c5947d2.m6378p(iM6387y);
                        if (C5997d.m6458n(c5947d2.f19365b, iM6378p2)) {
                            Object[] objArr2 = c5947d2.f19366c;
                            int[] iArr2 = c5947d2.f19365b;
                            obj2 = objArr2[C5997d.m6416C(iArr2[(iM6378p2 * 5) + 1] >> 29) + c5947d2.m6369f(iArr2, iM6378p2)];
                        } else {
                            obj2 = C6013l.f19514a;
                        }
                        AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        InterfaceC6008i0 interfaceC6008i3 = (InterfaceC6008i0) obj2;
                        this.f19558J = interfaceC6008i3;
                        return interfaceC6008i3;
                    }
                }
                C5947D0 c5947d3 = this.f19556H;
                iM6387y = c5947d3.m6387y(c5947d3.f19365b, iM6387y);
            }
        }
        if (this.f19554F.f19328c > 0) {
            while (i10 > 0) {
                C5941A0 c5941a0 = this.f19554F;
                int i12 = i10 * 5;
                int[] iArr3 = c5941a0.f19327b;
                if (iArr3[i12] == 202 && AbstractC16544l.m18089b(c5941a0.m6332j(iArr3, i10), c5987y)) {
                    C13287b c13287b = this.f19585u;
                    if (c13287b == null || (interfaceC6008i1 = (InterfaceC6008i0) ((SparseArray) c13287b.f42000Z).get(i10)) == null) {
                        C5941A0 c5941a1 = this.f19554F;
                        Object objM6324b = c5941a1.m6324b(c5941a1.f19327b, i10);
                        AbstractC16544l.m18092e(objM6324b, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        interfaceC6008i0 = (InterfaceC6008i0) objM6324b;
                    } else {
                        interfaceC6008i0 = interfaceC6008i1;
                    }
                    this.f19558J = interfaceC6008i0;
                    return interfaceC6008i0;
                }
                i10 = this.f19554F.f19327b[i12 + 2];
            }
        }
        InterfaceC6008i0 interfaceC6008i4 = this.f19584t;
        this.f19558J = interfaceC6008i4;
        return interfaceC6008i4;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0090 A[Catch: all -> 0x007d, LOOP:0: B:9:0x002e->B:29:0x0090, LOOP_END, TryCatch #1 {all -> 0x007d, blocks: (B:5:0x000e, B:9:0x002e, B:11:0x003e, B:13:0x004a, B:15:0x0054, B:17:0x006b, B:20:0x0074, B:25:0x0084, B:29:0x0090, B:30:0x0095, B:53:0x00fa, B:58:0x0114, B:59:0x0126, B:31:0x00a0, B:34:0x00ab, B:37:0x00b2, B:51:0x00f0, B:56:0x010d, B:57:0x0113), top: B:65:0x000e, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0095 A[EDGE_INSN: B:68:0x0095->B:30:0x0095 BREAK  A[LOOP:0: B:9:0x002e->B:29:0x0090], SYNTHETIC] */
    /* JADX INFO: renamed from: n */
    public final void m6551n(C13288c c13288c, C8410b c8410b) {
        int i10;
        if (this.f19553E) {
            C5997d.m6470z("Reentrant composition is not supported");
            throw null;
        }
        Trace.beginSection("Compose:recompose");
        try {
            this.f19549A = AbstractC9562n.m10087k().mo10044d();
            this.f19585u = null;
            C12951D c12951d = (C12951D) c13288c.f42001Y;
            Object[] objArr = c12951d.f41124b;
            Object[] objArr2 = c12951d.f41125c;
            long[] jArr = c12951d.f41123a;
            int length = jArr.length - 2;
            ArrayList arrayList = this.f19582r;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j10 = jArr[i11];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i11 != length) {
                            break;
                            break;
                        }
                        i11++;
                    } else {
                        int i12 = 8;
                        int i13 = 8 - ((~(i11 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j10 & 255) < 128) {
                                int i15 = (i11 << 3) + i14;
                                Object obj = objArr[i15];
                                Object obj2 = objArr2[i15];
                                AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                                C5995c c5995c = ((C6018n0) obj).f19535c;
                                if (c5995c != null) {
                                    int i16 = c5995c.f19473a;
                                    C6018n0 c6018n0 = (C6018n0) obj;
                                    if (obj2 == C5975S.f19447q0) {
                                        obj2 = null;
                                    }
                                    arrayList.add(new C5962L(c6018n0, i16, obj2));
                                }
                                i10 = 8;
                            } else {
                                i10 = i12;
                            }
                            j10 >>= i10;
                            i14++;
                            i12 = i10;
                        }
                        if (i13 != i12) {
                            break;
                        } else if (i11 != length) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
            }
            AbstractC17685s.m19392u(arrayList, C5997d.f19480f);
            this.f19574j = 0;
            this.f19553E = true;
            try {
                m6529X();
                Object objM6507A = m6507A();
                if (objM6507A != c8410b && c8410b != null) {
                    m6539d0(c8410b);
                }
                C6019o c6019o = this.f19551C;
                C6546d c6546dM6420G = C5997d.m6420G();
                try {
                    c6546dM6420G.m7099c(c6019o);
                    C5987Y c5987y = C5997d.f19475a;
                    if (c8410b != null) {
                        m6520O(RCHTTPStatusCodes.SUCCESS, c5987y);
                        C5997d.m6426M(this, c8410b);
                        m6553p(false);
                    } else if (!this.f19586v || objM6507A == null || objM6507A.equals(C6013l.f19514a)) {
                        m6515J();
                    } else {
                        m6520O(RCHTTPStatusCodes.SUCCESS, c5987y);
                        AbstractC16529F.m18081e(2, objM6507A);
                        C5997d.m6426M(this, (InterfaceC1439n) objM6507A);
                        m6553p(false);
                    }
                    c6546dM6420G.m7111p(c6546dM6420G.f21184o0 - 1);
                    m6556s();
                    this.f19553E = false;
                    arrayList.clear();
                    C5997d.m6437X(this.f19556H.f19386w);
                    m6559v();
                    Trace.endSection();
                } catch (Throwable th2) {
                    c6546dM6420G.m7111p(c6546dM6420G.f21184o0 - 1);
                    throw th2;
                }
            } catch (Throwable th3) {
                this.f19553E = false;
                arrayList.clear();
                m6532a();
                C5997d.m6437X(this.f19556H.f19386w);
                m6559v();
                throw th3;
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m6552o(int i10, int i11) {
        if (i10 <= 0 || i10 == i11) {
            return;
        }
        m6552o(this.f19554F.f19327b[(i10 * 5) + 2], i11);
        if (C5997d.m6460p(this.f19554F.f19327b, i10)) {
            Object objM6331i = this.f19554F.m6331i(i10);
            C6280b c6280b = this.f19560L;
            c6280b.m6849c();
            c6280b.f20402h.f19461a.add(objM6331i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:159:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:241:0x060c  */
    /* JADX WARN: Code duplicated, block: B:243:0x0618 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:244:0x061a  */
    /* JADX WARN: Code duplicated, block: B:249:0x0637  */
    /* JADX WARN: Code duplicated, block: B:251:0x0643 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:252:0x0645  */
    /* JADX WARN: Code duplicated, block: B:293:0x075c  */
    /* JADX WARN: Code duplicated, block: B:437:0x0626 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:440:0x0651 A[SYNTHETIC] */
    /* JADX INFO: renamed from: p */
    public final void m6553p(boolean z6) {
        int iOrdinal;
        C5960K c5960k;
        int i10;
        ArrayList arrayList;
        C6280b c6280b;
        C6021p c6021p;
        int i11;
        String str;
        int i12;
        int i13;
        C6281c c6281c;
        C6021p c6021p2;
        C6292n c6292n;
        C6278E c6278e;
        int i14;
        int i15;
        int iM6839c;
        int i16;
        StringBuilder sb2;
        int i17;
        int i18;
        StringBuilder sbM4500y;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        char c9;
        C5960K c5960k2;
        int i25;
        ArrayList arrayList2;
        int i26;
        C12982u c12982u;
        C6280b c6280b2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i27;
        C6006h0 c6006h0;
        int i28;
        C12982u c12982u2;
        Object[] objArr;
        long[] jArr;
        int i29;
        Object[] objArr2;
        long[] jArr2;
        Object[] objArr3;
        long[] jArr3;
        Object[] objArr4;
        long[] jArr4;
        Object obj;
        Object obj2;
        int iOrdinal2;
        C6021p c6021p3 = this;
        C5960K c5960k3 = c6021p3.f19577m;
        int i30 = c5960k3.f19403a[c5960k3.f19404b - 2] - 1;
        boolean z10 = c6021p3.f19563O;
        C5975S c5975s = C6013l.f19514a;
        if (z10) {
            C5947D0 c5947d0 = c6021p3.f19556H;
            int i31 = c5947d0.f19385v;
            int i32 = c5947d0.f19365b[c5947d0.m6378p(i31) * 5];
            C5947D0 c5947d1 = c6021p3.f19556H;
            int iM6378p = c5947d1.m6378p(i31);
            if (C5997d.m6459o(c5947d1.f19365b, iM6378p)) {
                Object[] objArr5 = c5947d1.f19366c;
                int[] iArr = c5947d1.f19365b;
                int i33 = iM6378p * 5;
                obj = objArr5[C5997d.m6416C(iArr[i33 + 1] >> 30) + iArr[i33 + 4]];
            } else {
                obj = null;
            }
            C5947D0 c5947d2 = c6021p3.f19556H;
            int iM6378p2 = c5947d2.m6378p(i31);
            if (C5997d.m6458n(c5947d2.f19365b, iM6378p2)) {
                Object[] objArr6 = c5947d2.f19366c;
                int[] iArr2 = c5947d2.f19365b;
                obj2 = objArr6[C5997d.m6416C(iArr2[(iM6378p2 * 5) + 1] >> 29) + c5947d2.m6369f(iArr2, iM6378p2)];
            } else {
                obj2 = c5975s;
            }
            if (obj != null) {
                iOrdinal2 = (obj instanceof Enum ? ((Enum) obj).ordinal() : obj.hashCode()) ^ Integer.rotateRight(c6021p3.f19564P, 3);
            } else if (obj2 == null || i32 != 207 || obj2.equals(c5975s)) {
                iOrdinal2 = Integer.rotateRight(i30 ^ c6021p3.f19564P, 3) ^ i32;
            } else {
                c6021p3.f19564P = Integer.rotateRight(Integer.rotateRight(i30 ^ c6021p3.f19564P, 3) ^ obj2.hashCode(), 3);
            }
            c6021p3.f19564P = Integer.rotateRight(iOrdinal2, 3);
        } else {
            C5941A0 c5941a0 = c6021p3.f19554F;
            int i34 = c5941a0.f19334i;
            int[] iArr3 = c5941a0.f19327b;
            int i35 = iArr3[i34 * 5];
            Object objM6332j = c5941a0.m6332j(iArr3, i34);
            C5941A0 c5941a1 = c6021p3.f19554F;
            Object objM6324b = c5941a1.m6324b(c5941a1.f19327b, i34);
            if (objM6332j != null) {
                iOrdinal = (objM6332j instanceof Enum ? ((Enum) objM6332j).ordinal() : objM6332j.hashCode()) ^ Integer.rotateRight(c6021p3.f19564P, 3);
            } else if (objM6324b == null || i35 != 207 || objM6324b.equals(c5975s)) {
                iOrdinal = Integer.rotateRight(i30 ^ c6021p3.f19564P, 3) ^ i35;
            } else {
                c6021p3.f19564P = Integer.rotateRight(Integer.rotateRight(i30 ^ c6021p3.f19564P, 3) ^ objM6324b.hashCode(), 3);
            }
            c6021p3.f19564P = Integer.rotateRight(iOrdinal, 3);
        }
        int i36 = c6021p3.f19575k;
        C6006h0 c6006h1 = c6021p3.f19573i;
        ArrayList arrayList5 = c6021p3.f19582r;
        C6280b c6280b3 = c6021p3.f19560L;
        if (c6006h1 != null) {
            ArrayList arrayList6 = c6006h1.f19502a;
            if (arrayList6.size() > 0) {
                ArrayList arrayList7 = c6006h1.f19505d;
                HashSet hashSet = new HashSet(arrayList7.size());
                int size = arrayList7.size();
                for (int i37 = 0; i37 < size; i37++) {
                    hashSet.add(arrayList7.get(i37));
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int size2 = arrayList7.size();
                int size3 = arrayList6.size();
                int i38 = 0;
                int i39 = 0;
                int i40 = 0;
                while (i39 < size3) {
                    C5966N c5966n = (C5966N) arrayList6.get(i39);
                    boolean zContains = hashSet.contains(c5966n);
                    C12982u c12982u3 = c6006h1.f19506e;
                    hashSet = hashSet;
                    int i41 = c6006h1.f19503b;
                    if (zContains) {
                        i24 = size3;
                        c9 = 3;
                        if (!linkedHashSet.contains(c5966n)) {
                            if (i38 < size2) {
                                C5966N c5966n2 = (C5966N) arrayList7.get(i38);
                                if (c5966n2 != c5966n) {
                                    C5954H c5954h = (C5954H) c12982u3.m14694f(c5966n2.f19422c);
                                    int i42 = c5954h != null ? c5954h.f19393b : -1;
                                    linkedHashSet.add(c5966n2);
                                    i27 = i40;
                                    if (i42 != i27) {
                                        c6006h0 = c6006h1;
                                        C5954H c5954h2 = (C5954H) c12982u3.m14694f(c5966n2.f19422c);
                                        int i43 = c5954h2 != null ? c5954h2.f19394c : c5966n2.f19423d;
                                        i26 = size2;
                                        int i44 = i42 + i41;
                                        int i45 = i41 + i27;
                                        if (i43 > 0) {
                                            arrayList4 = arrayList7;
                                            int i46 = c6280b3.f20406l;
                                            if (i46 > 0) {
                                                arrayList2 = arrayList5;
                                                c5960k2 = c5960k3;
                                                if (c6280b3.f20404j == i44 - i46 && c6280b3.f20405k == i45 - i46) {
                                                    c6280b3.f20406l = i46 + i43;
                                                }
                                            } else {
                                                c5960k2 = c5960k3;
                                                arrayList2 = arrayList5;
                                            }
                                            c6280b3.m6849c();
                                            c6280b3.f20404j = i44;
                                            c6280b3.f20405k = i45;
                                            c6280b3.f20406l = i43;
                                        } else {
                                            c5960k2 = c5960k3;
                                            arrayList2 = arrayList5;
                                            arrayList4 = arrayList7;
                                            c6280b3.getClass();
                                        }
                                        char c10 = 7;
                                        if (i42 > i27) {
                                            Object[] objArr7 = c12982u3.f41206c;
                                            long[] jArr5 = c12982u3.f41204a;
                                            int length = jArr5.length - 2;
                                            if (length >= 0) {
                                                c6280b2 = c6280b3;
                                                arrayList3 = arrayList6;
                                                int i47 = 0;
                                                while (true) {
                                                    long j10 = jArr5[i47];
                                                    i28 = i39;
                                                    c12982u2 = c12982u3;
                                                    if ((((~j10) << c10) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i48 = 8 - ((~(i47 - length)) >>> 31);
                                                        int i49 = 0;
                                                        while (i49 < i48) {
                                                            if ((j10 & 255) < 128) {
                                                                C5954H c5954h3 = (C5954H) objArr7[(i47 << 3) + i49];
                                                                objArr4 = objArr7;
                                                                int i50 = c5954h3.f19393b;
                                                                jArr4 = jArr5;
                                                                if (i42 <= i50 && i50 < i42 + i43) {
                                                                    c5954h3.f19393b = (i50 - i42) + i27;
                                                                } else if (i27 <= i50 && i50 < i42) {
                                                                    c5954h3.f19393b = i50 + i43;
                                                                }
                                                            } else {
                                                                objArr4 = objArr7;
                                                                jArr4 = jArr5;
                                                            }
                                                            j10 >>= 8;
                                                            i49++;
                                                            objArr7 = objArr4;
                                                            jArr5 = jArr4;
                                                        }
                                                        objArr3 = objArr7;
                                                        jArr3 = jArr5;
                                                        if (i48 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr7;
                                                        jArr3 = jArr5;
                                                    }
                                                    if (i47 == length) {
                                                        break;
                                                    }
                                                    i47++;
                                                    c12982u3 = c12982u2;
                                                    i39 = i28;
                                                    objArr7 = objArr3;
                                                    jArr5 = jArr3;
                                                    c10 = 7;
                                                }
                                            } else {
                                                i28 = i39;
                                                c12982u2 = c12982u3;
                                                c6280b2 = c6280b3;
                                                arrayList3 = arrayList6;
                                            }
                                        } else {
                                            i28 = i39;
                                            c12982u2 = c12982u3;
                                            c6280b2 = c6280b3;
                                            arrayList3 = arrayList6;
                                            if (i27 > i42) {
                                                c12982u = c12982u2;
                                                Object[] objArr8 = c12982u.f41206c;
                                                long[] jArr6 = c12982u.f41204a;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    int i51 = 0;
                                                    while (true) {
                                                        long j11 = jArr6[i51];
                                                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i52 = 8 - ((~(i51 - length2)) >>> 31);
                                                            int i53 = 0;
                                                            while (i53 < i52) {
                                                                if ((j11 & 255) < 128) {
                                                                    objArr2 = objArr8;
                                                                    C5954H c5954h4 = (C5954H) objArr8[(i51 << 3) + i53];
                                                                    jArr2 = jArr6;
                                                                    int i54 = c5954h4.f19393b;
                                                                    i29 = i36;
                                                                    if (i42 <= i54 && i54 < i42 + i43) {
                                                                        c5954h4.f19393b = (i54 - i42) + i27;
                                                                    } else if (i42 + 1 <= i54 && i54 < i27) {
                                                                        c5954h4.f19393b = i54 - i43;
                                                                    }
                                                                } else {
                                                                    i29 = i36;
                                                                    objArr2 = objArr8;
                                                                    jArr2 = jArr6;
                                                                }
                                                                j11 >>= 8;
                                                                i53++;
                                                                jArr6 = jArr2;
                                                                objArr8 = objArr2;
                                                                i36 = i29;
                                                            }
                                                            i25 = i36;
                                                            objArr = objArr8;
                                                            jArr = jArr6;
                                                            if (i52 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            i25 = i36;
                                                            objArr = objArr8;
                                                            jArr = jArr6;
                                                        }
                                                        if (i51 == length2) {
                                                            break;
                                                        }
                                                        i51++;
                                                        jArr6 = jArr;
                                                        objArr8 = objArr;
                                                        i36 = i25;
                                                    }
                                                } else {
                                                    i25 = i36;
                                                }
                                            }
                                        }
                                        i25 = i36;
                                        c12982u = c12982u2;
                                    } else {
                                        c5960k2 = c5960k3;
                                        i25 = i36;
                                        c6006h0 = c6006h1;
                                        arrayList2 = arrayList5;
                                        i26 = size2;
                                        i28 = i39;
                                        c12982u = c12982u3;
                                        c6280b2 = c6280b3;
                                        arrayList3 = arrayList6;
                                        arrayList4 = arrayList7;
                                    }
                                    i39 = i28;
                                } else {
                                    c5960k2 = c5960k3;
                                    i25 = i36;
                                    arrayList2 = arrayList5;
                                    i26 = size2;
                                    c12982u = c12982u3;
                                    c6280b2 = c6280b3;
                                    arrayList3 = arrayList6;
                                    arrayList4 = arrayList7;
                                    i27 = i40;
                                    c6006h0 = c6006h1;
                                    i39++;
                                }
                                i38++;
                                C5954H c5954h5 = (C5954H) c12982u.m14694f(c5966n2.f19422c);
                                int i55 = (c5954h5 != null ? c5954h5.f19394c : c5966n2.f19423d) + i27;
                                c6006h1 = c6006h0;
                                size3 = i24;
                                linkedHashSet = linkedHashSet;
                                size2 = i26;
                                arrayList7 = arrayList4;
                                arrayList5 = arrayList2;
                                c6280b3 = c6280b2;
                                arrayList6 = arrayList3;
                                i36 = i25;
                                i40 = i55;
                                c5960k3 = c5960k2;
                            } else {
                                size3 = i24;
                                linkedHashSet = linkedHashSet;
                            }
                        }
                    } else {
                        i24 = size3;
                        C5954H c5954h6 = (C5954H) c12982u3.m14694f(c5966n.f19422c);
                        c6280b3.m6851e((c5954h6 != null ? c5954h6.f19393b : -1) + i41, c5966n.f19423d);
                        int i56 = c5966n.f19422c;
                        c6006h1.m6476a(i56, 0);
                        c6280b3.f20400f = (i56 - c6280b3.f20395a.f19554F.f19332g) + c6280b3.f20400f;
                        c6021p3.f19554F.m6333k(i56);
                        m6511E();
                        c6021p3.f19554F.m6334l();
                        c9 = 3;
                        C5997d.m6464t(arrayList5, i56, c6021p3.f19554F.f19327b[(i56 * 5) + 3] + i56);
                    }
                    i39++;
                    size3 = i24;
                }
                c5960k = c5960k3;
                i10 = i36;
                arrayList = arrayList5;
                C6280b c6280b4 = c6280b3;
                c6280b4.m6849c();
                if (arrayList6.size() > 0) {
                    C5941A0 c5941a2 = c6021p3.f19554F;
                    c6280b = c6280b4;
                    c6280b.f20400f = (c5941a2.f19333h - c6280b.f20395a.f19554F.f19332g) + c6280b.f20400f;
                    c5941a2.m6335m();
                } else {
                    c6280b = c6280b4;
                }
            } else {
                c5960k = c5960k3;
                i10 = i36;
                arrayList = arrayList5;
                c6280b = c6280b3;
            }
        } else {
            c5960k = c5960k3;
            i10 = i36;
            arrayList = arrayList5;
            c6280b = c6280b3;
        }
        int i57 = c6021p3.f19574j;
        while (true) {
            C5941A0 c5941a3 = c6021p3.f19554F;
            if (c5941a3.f19336k > 0 || (i23 = c5941a3.f19332g) == c5941a3.f19333h) {
                break;
            }
            C6021p c6021p4 = c6021p3;
            m6511E();
            c6280b.m6851e(i57, c6021p4.f19554F.m6334l());
            ArrayList arrayList8 = arrayList;
            C5997d.m6464t(arrayList8, i23, c6021p4.f19554F.f19332g);
            c6021p3 = c6021p4;
            i10 = i10;
            arrayList = arrayList8;
        }
        boolean z11 = c6021p3.f19563O;
        String str2 = " object arguments (";
        if (z11) {
            if (z6) {
                C6281c c6281c2 = c6021p3.f19562N;
                C6278E c6278e2 = c6281c2.f20408b;
                if (!c6278e2.m6843g()) {
                    C5997d.m6470z("Cannot end node insertion, there are no pending operations that can be realized.");
                    throw null;
                }
                if (c6278e2.m6842f()) {
                    throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
                }
                AbstractC6276C[] abstractC6276CArr = c6278e2.f20386a;
                int i58 = c6278e2.f20387b - 1;
                c6278e2.f20387b = i58;
                AbstractC6276C abstractC6276C = abstractC6276CArr[i58];
                AbstractC16544l.m18091d(abstractC6276C);
                c6278e2.f20386a[c6278e2.f20387b] = null;
                C6278E c6278e3 = c6281c2.f20407a;
                c6278e3.m6846j(abstractC6276C);
                int i59 = c6278e2.f20391f;
                int i60 = c6278e3.f20391f;
                int i61 = 0;
                while (true) {
                    i21 = abstractC6276C.f20380b;
                    if (i61 >= i21) {
                        break;
                    }
                    i60--;
                    i59--;
                    Object[] objArr9 = c6278e3.f20390e;
                    String str3 = str2;
                    Object[] objArr10 = c6278e2.f20390e;
                    objArr9[i60] = objArr10[i59];
                    objArr10[i59] = null;
                    i61++;
                    str2 = str3;
                }
                str = str2;
                int i62 = c6278e2.f20389d;
                int i63 = c6278e3.f20389d;
                int i64 = 0;
                while (true) {
                    i22 = abstractC6276C.f20379a;
                    if (i64 >= i22) {
                        break;
                    }
                    i63--;
                    i62--;
                    int[] iArr4 = c6278e3.f20388c;
                    C6278E c6278e4 = c6278e3;
                    int[] iArr5 = c6278e2.f20388c;
                    iArr4[i63] = iArr5[i62];
                    iArr5[i62] = 0;
                    i64++;
                    c6278e3 = c6278e4;
                }
                c6278e2.f20391f -= i21;
                c6278e2.f20389d -= i22;
                i12 = 1;
            } else {
                str = " object arguments (";
                i12 = i10;
            }
            C5941A0 c5941a4 = c6021p3.f19554F;
            int i65 = c5941a4.f19336k;
            if (i65 <= 0) {
                C5997d.m6443b0("Unbalanced begin/end empty");
                throw null;
            }
            c5941a4.f19336k = i65 - 1;
            C5947D0 c5947d3 = c6021p3.f19556H;
            int i66 = c5947d3.f19385v;
            c5947d3.m6371i();
            if (c6021p3.f19554F.f19336k > 0) {
                c6021p2 = c6021p3;
                i11 = i12;
            } else {
                int i67 = (-2) - i66;
                c6021p3.f19556H.m6372j();
                c6021p3.f19556H.m6368e(true);
                C5995c c5995c = c6021p3.f19561M;
                if (c6021p3.f19562N.f20407a.m6842f()) {
                    C5943B0 c5943b0 = c6021p3.f19555G;
                    c6280b.m6848b();
                    c6280b.m6850d(false);
                    C5941A0 c5941a5 = c6280b.f20395a.f19554F;
                    if (c5941a5.f19328c > 0) {
                        int i68 = c5941a5.f19334i;
                        C5960K c5960k4 = c6280b.f20398d;
                        int i69 = c5960k4.f19404b;
                        i13 = i12;
                        if ((i69 > 0 ? c5960k4.f19403a[i69 - 1] : -2) != i68) {
                            if (!c6280b.f20397c && c6280b.f20399e) {
                                c6280b.m6850d(false);
                                C6279a c6279a = c6280b.f20396b;
                                c6279a.getClass();
                                c6279a.f20394a.m6845i(C6290l.f20417c);
                                c6280b.f20397c = true;
                            }
                            if (i68 > 0) {
                                C5995c c5995cM6323a = c5941a5.m6323a(i68);
                                c5960k4.m6397d(i68);
                                c6280b.m6850d(false);
                                C6279a c6279a2 = c6280b.f20396b;
                                c6279a2.getClass();
                                C6289k c6289k = C6289k.f20416c;
                                C6278E c6278e5 = c6279a2.f20394a;
                                c6278e5.m6846j(c6289k);
                                AbstractC9215U.m9785c(c6278e5, 0, c5995cM6323a);
                                int i70 = c6278e5.f20392g;
                                int i71 = c6289k.f20379a;
                                int iM6839c2 = C6278E.m6839c(c6278e5, i71);
                                int i72 = c6289k.f20380b;
                                if (i70 != iM6839c2 || c6278e5.f20393h != C6278E.m6839c(c6278e5, i72)) {
                                    int i73 = 1;
                                    StringBuilder sb3 = new StringBuilder();
                                    int i74 = 0;
                                    int i75 = 0;
                                    while (i74 < i71) {
                                        if ((c6278e5.f20392g & (i73 << i74)) != 0) {
                                            if (i75 > 0) {
                                                sb3.append(", ");
                                            }
                                            sb3.append(c6289k.mo6758b(i74));
                                            i75++;
                                        }
                                        i74++;
                                        i73 = 1;
                                    }
                                    String string = sb3.toString();
                                    StringBuilder sbM4500y2 = AbstractC3794B0.m4500y(string, "StringBuilder().apply(builderAction).toString()");
                                    int i76 = 0;
                                    for (int i77 = 0; i77 < i72; i77++) {
                                        if (((1 << i77) & c6278e5.f20393h) != 0) {
                                            if (i75 > 0) {
                                                sbM4500y2.append(", ");
                                            }
                                            sbM4500y2.append(c6289k.mo6759c(i77));
                                            i76++;
                                        }
                                    }
                                    String string2 = sbM4500y2.toString();
                                    AbstractC16544l.m18093f(string2, "StringBuilder().apply(builderAction).toString()");
                                    StringBuilder sb4 = new StringBuilder("Error while pushing ");
                                    sb4.append(c6289k);
                                    sb4.append(". Not all arguments were provided. Missing ");
                                    AbstractC10763a.m11066x(sb4, i75, " int arguments (", string, ") and ");
                                    AbstractC3794B0.m4472G(sb4, i76, str, string2, ").");
                                    throw null;
                                }
                                c6280b.f20397c = true;
                            }
                        }
                        String str4 = str;
                        c6280b.m6849c();
                        C6279a c6279a3 = c6280b.f20396b;
                        c6279a3.getClass();
                        c6292n = C6292n.f20423c;
                        c6278e = c6279a3.f20394a;
                        c6278e.m6846j(c6292n);
                        AbstractC9215U.m9785c(c6278e, 0, c5995c);
                        AbstractC9215U.m9785c(c6278e, 1, c5943b0);
                        i14 = c6278e.f20392g;
                        i15 = c6292n.f20379a;
                        iM6839c = C6278E.m6839c(c6278e, i15);
                        i16 = c6292n.f20380b;
                        if (i14 == iM6839c || c6278e.f20393h != C6278E.m6839c(c6278e, i16)) {
                            sb2 = new StringBuilder();
                            i17 = 0;
                            i18 = 0;
                            while (i17 < i15) {
                                int i78 = i15;
                                if (((1 << i17) & c6278e.f20392g) == 0) {
                                    if (i18 > 0) {
                                        sb2.append(", ");
                                    }
                                    sb2.append(c6292n.mo6758b(i17));
                                    i18++;
                                }
                                i17++;
                                i15 = i78;
                            }
                            String string3 = sb2.toString();
                            sbM4500y = AbstractC3794B0.m4500y(string3, "StringBuilder().apply(builderAction).toString()");
                            i19 = 0;
                            i20 = 0;
                            while (i20 < i16) {
                                int i79 = i16;
                                if (((1 << i20) & c6278e.f20393h) == 0) {
                                    if (i18 > 0) {
                                        sbM4500y.append(", ");
                                    }
                                    sbM4500y.append(c6292n.mo6759c(i20));
                                    i19++;
                                }
                                i20++;
                                i16 = i79;
                            }
                            String string4 = sbM4500y.toString();
                            AbstractC16544l.m18093f(string4, "StringBuilder().apply(builderAction).toString()");
                            StringBuilder sb5 = new StringBuilder("Error while pushing ");
                            sb5.append(c6292n);
                            sb5.append(". Not all arguments were provided. Missing ");
                            AbstractC10763a.m11066x(sb5, i18, " int arguments (", string3, ") and ");
                            AbstractC3794B0.m4472G(sb5, i19, str4, string4, ").");
                            throw null;
                        }
                        c6021p2 = c6021p3;
                    } else {
                        i13 = i12;
                    }
                    String str5 = str;
                    c6280b.m6849c();
                    C6279a c6279a4 = c6280b.f20396b;
                    c6279a4.getClass();
                    c6292n = C6292n.f20423c;
                    c6278e = c6279a4.f20394a;
                    c6278e.m6846j(c6292n);
                    AbstractC9215U.m9785c(c6278e, 0, c5995c);
                    AbstractC9215U.m9785c(c6278e, 1, c5943b0);
                    i14 = c6278e.f20392g;
                    i15 = c6292n.f20379a;
                    iM6839c = C6278E.m6839c(c6278e, i15);
                    i16 = c6292n.f20380b;
                    if (i14 == iM6839c) {
                    }
                    sb2 = new StringBuilder();
                    i17 = 0;
                    i18 = 0;
                    while (i17 < i15) {
                        int i710 = i15;
                        if (((1 << i17) & c6278e.f20392g) == 0) {
                            if (i18 > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(c6292n.mo6758b(i17));
                            i18++;
                        }
                        i17++;
                        i15 = i710;
                    }
                    String string5 = sb2.toString();
                    sbM4500y = AbstractC3794B0.m4500y(string5, "StringBuilder().apply(builderAction).toString()");
                    i19 = 0;
                    i20 = 0;
                    while (i20 < i16) {
                        int i711 = i16;
                        if (((1 << i20) & c6278e.f20393h) == 0) {
                            if (i18 > 0) {
                                sbM4500y.append(", ");
                            }
                            sbM4500y.append(c6292n.mo6759c(i20));
                            i19++;
                        }
                        i20++;
                        i16 = i711;
                    }
                    String string6 = sbM4500y.toString();
                    AbstractC16544l.m18093f(string6, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb6 = new StringBuilder("Error while pushing ");
                    sb6.append(c6292n);
                    sb6.append(". Not all arguments were provided. Missing ");
                    AbstractC10763a.m11066x(sb6, i18, " int arguments (", string5, ") and ");
                    AbstractC3794B0.m4472G(sb6, i19, str5, string6, ").");
                    throw null;
                }
                i13 = i12;
                i67 = i67;
                String str6 = str;
                C5943B0 c5943b1 = c6021p3.f19555G;
                C6281c c6281c3 = c6021p3.f19562N;
                c6280b.m6848b();
                c6280b.m6850d(false);
                C5941A0 c5941a6 = c6280b.f20395a.f19554F;
                if (c5941a6.f19328c > 0) {
                    int i80 = c5941a6.f19334i;
                    C5960K c5960k5 = c6280b.f20398d;
                    int i81 = c5960k5.f19404b;
                    c6281c = c6281c3;
                    if ((i81 > 0 ? c5960k5.f19403a[i81 - 1] : -2) != i80) {
                        if (!c6280b.f20397c && c6280b.f20399e) {
                            c6280b.m6850d(false);
                            C6279a c6279a5 = c6280b.f20396b;
                            c6279a5.getClass();
                            c6279a5.f20394a.m6845i(C6290l.f20417c);
                            c6280b.f20397c = true;
                        }
                        if (i80 > 0) {
                            C5995c c5995cM6323a2 = c5941a6.m6323a(i80);
                            c5960k5.m6397d(i80);
                            c6280b.m6850d(false);
                            C6279a c6279a6 = c6280b.f20396b;
                            c6279a6.getClass();
                            C6289k c6289k2 = C6289k.f20416c;
                            C6278E c6278e6 = c6279a6.f20394a;
                            c6278e6.m6846j(c6289k2);
                            AbstractC9215U.m9785c(c6278e6, 0, c5995cM6323a2);
                            int i82 = c6278e6.f20392g;
                            int i83 = c6289k2.f20379a;
                            int iM6839c3 = C6278E.m6839c(c6278e6, i83);
                            int i84 = c6289k2.f20380b;
                            if (i82 != iM6839c3 || c6278e6.f20393h != C6278E.m6839c(c6278e6, i84)) {
                                int i85 = 1;
                                StringBuilder sb7 = new StringBuilder();
                                int i86 = 0;
                                int i87 = 0;
                                while (i86 < i83) {
                                    if (((i85 << i86) & c6278e6.f20392g) != 0) {
                                        if (i87 > 0) {
                                            sb7.append(", ");
                                        }
                                        sb7.append(c6289k2.mo6758b(i86));
                                        i87++;
                                    }
                                    i86++;
                                    i85 = 1;
                                }
                                String string7 = sb7.toString();
                                StringBuilder sbM4500y3 = AbstractC3794B0.m4500y(string7, "StringBuilder().apply(builderAction).toString()");
                                int i88 = 0;
                                int i89 = 0;
                                while (i88 < i84) {
                                    int i90 = i84;
                                    if (((1 << i88) & c6278e6.f20393h) != 0) {
                                        if (i87 > 0) {
                                            sbM4500y3.append(", ");
                                        }
                                        sbM4500y3.append(c6289k2.mo6759c(i88));
                                        i89++;
                                    }
                                    i88++;
                                    i84 = i90;
                                }
                                String string8 = sbM4500y3.toString();
                                AbstractC16544l.m18093f(string8, "StringBuilder().apply(builderAction).toString()");
                                StringBuilder sb8 = new StringBuilder("Error while pushing ");
                                sb8.append(c6289k2);
                                sb8.append(". Not all arguments were provided. Missing ");
                                AbstractC10763a.m11066x(sb8, i87, " int arguments (", string7, ") and ");
                                AbstractC3794B0.m4472G(sb8, i89, str6, string8, ").");
                                throw null;
                            }
                            c6280b.f20397c = true;
                        }
                    }
                } else {
                    c6281c = c6281c3;
                }
                c6280b.m6849c();
                C6279a c6279a7 = c6280b.f20396b;
                c6279a7.getClass();
                C6293o c6293o = C6293o.f20424c;
                C6278E c6278e7 = c6279a7.f20394a;
                c6278e7.m6846j(c6293o);
                AbstractC9215U.m9785c(c6278e7, 0, c5995c);
                AbstractC9215U.m9785c(c6278e7, 1, c5943b1);
                AbstractC9215U.m9785c(c6278e7, 2, c6281c);
                int i91 = c6278e7.f20392g;
                int i92 = c6293o.f20379a;
                int iM6839c4 = C6278E.m6839c(c6278e7, i92);
                int i93 = c6293o.f20380b;
                if (i91 != iM6839c4 || c6278e7.f20393h != C6278E.m6839c(c6278e7, i93)) {
                    StringBuilder sb9 = new StringBuilder();
                    int i94 = 0;
                    int i95 = 0;
                    while (i94 < i92) {
                        int i96 = i92;
                        if (((1 << i94) & c6278e7.f20392g) != 0) {
                            if (i95 > 0) {
                                sb9.append(", ");
                            }
                            sb9.append(c6293o.mo6758b(i94));
                            i95++;
                        }
                        i94++;
                        i92 = i96;
                    }
                    String string9 = sb9.toString();
                    StringBuilder sbM4500y4 = AbstractC3794B0.m4500y(string9, "StringBuilder().apply(builderAction).toString()");
                    int i97 = 0;
                    int i98 = 0;
                    while (i98 < i93) {
                        int i99 = i93;
                        if (((1 << i98) & c6278e7.f20393h) != 0) {
                            if (i95 > 0) {
                                sbM4500y4.append(", ");
                            }
                            sbM4500y4.append(c6293o.mo6759c(i98));
                            i97++;
                        }
                        i98++;
                        i93 = i99;
                    }
                    String string10 = sbM4500y4.toString();
                    AbstractC16544l.m18093f(string10, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb10 = new StringBuilder("Error while pushing ");
                    sb10.append(c6293o);
                    sb10.append(". Not all arguments were provided. Missing ");
                    AbstractC10763a.m11066x(sb10, i95, " int arguments (", string9, ") and ");
                    AbstractC3794B0.m4472G(sb10, i97, str6, string10, ").");
                    throw null;
                }
                c6021p2 = this;
                c6021p2.f19562N = new C6281c();
                c6021p2.f19563O = false;
                if (c6021p2.f19567c.f19347Z == 0) {
                    i11 = i13;
                } else {
                    int i100 = i67;
                    c6021p2.m6531Z(i100, 0);
                    i11 = i13;
                    c6021p2.m6533a0(i100, i11);
                }
            }
            c6021p = c6021p2;
        } else {
            z11 = z11;
            if (z6) {
                c6280b.m6847a();
            }
            C5941A0 c5941a7 = this.f19554F;
            int i101 = c5941a7.f19338m - c5941a7.f19337l;
            if (i101 > 0) {
                if (i101 > 0) {
                    c6280b.m6850d(false);
                    C5941A0 c5941a8 = c6280b.f20395a.f19554F;
                    if (c5941a8.f19328c > 0) {
                        int i102 = c5941a8.f19334i;
                        C5960K c5960k6 = c6280b.f20398d;
                        int i103 = c5960k6.f19404b;
                        if ((i103 > 0 ? c5960k6.f19403a[i103 - 1] : -2) != i102) {
                            if (!c6280b.f20397c && c6280b.f20399e) {
                                c6280b.m6850d(false);
                                C6279a c6279a8 = c6280b.f20396b;
                                c6279a8.getClass();
                                c6279a8.f20394a.m6845i(C6290l.f20417c);
                                c6280b.f20397c = true;
                            }
                            if (i102 > 0) {
                                C5995c c5995cM6323a3 = c5941a8.m6323a(i102);
                                c5960k6.m6397d(i102);
                                c6280b.m6850d(false);
                                C6279a c6279a9 = c6280b.f20396b;
                                c6279a9.getClass();
                                C6289k c6289k3 = C6289k.f20416c;
                                C6278E c6278e8 = c6279a9.f20394a;
                                c6278e8.m6846j(c6289k3);
                                AbstractC9215U.m9785c(c6278e8, 0, c5995cM6323a3);
                                int i104 = c6278e8.f20392g;
                                int i105 = c6289k3.f20379a;
                                int iM6839c5 = C6278E.m6839c(c6278e8, i105);
                                int i106 = c6289k3.f20380b;
                                if (i104 != iM6839c5 || c6278e8.f20393h != C6278E.m6839c(c6278e8, i106)) {
                                    int i107 = 1;
                                    StringBuilder sb11 = new StringBuilder();
                                    int i108 = 0;
                                    int i109 = 0;
                                    while (i108 < i105) {
                                        if (((i107 << i108) & c6278e8.f20392g) != 0) {
                                            if (i109 > 0) {
                                                sb11.append(", ");
                                            }
                                            sb11.append(c6289k3.mo6758b(i108));
                                            i109++;
                                        }
                                        i108++;
                                        i107 = 1;
                                    }
                                    String string11 = sb11.toString();
                                    StringBuilder sbM4500y5 = AbstractC3794B0.m4500y(string11, "StringBuilder().apply(builderAction).toString()");
                                    int i110 = 0;
                                    int i111 = 0;
                                    while (i110 < i106) {
                                        int i112 = i106;
                                        if (((1 << i110) & c6278e8.f20393h) != 0) {
                                            if (i109 > 0) {
                                                sbM4500y5.append(", ");
                                            }
                                            sbM4500y5.append(c6289k3.mo6759c(i110));
                                            i111++;
                                        }
                                        i110++;
                                        i106 = i112;
                                    }
                                    String string12 = sbM4500y5.toString();
                                    AbstractC16544l.m18093f(string12, "StringBuilder().apply(builderAction).toString()");
                                    StringBuilder sb12 = new StringBuilder("Error while pushing ");
                                    sb12.append(c6289k3);
                                    sb12.append(". Not all arguments were provided. Missing ");
                                    AbstractC10763a.m11066x(sb12, i109, " int arguments (", string11, ") and ");
                                    AbstractC3794B0.m4472G(sb12, i111, " object arguments (", string12, ").");
                                    throw null;
                                }
                                c6280b.f20397c = true;
                            }
                        }
                    }
                    C6279a c6279a10 = c6280b.f20396b;
                    c6279a10.getClass();
                    C6302x c6302x = C6302x.f20433c;
                    C6278E c6278e9 = c6279a10.f20394a;
                    c6278e9.m6846j(c6302x);
                    AbstractC9215U.m9784b(c6278e9, 0, i101);
                    int i113 = c6278e9.f20392g;
                    int i114 = c6302x.f20379a;
                    int iM6839c6 = C6278E.m6839c(c6278e9, i114);
                    int i115 = c6302x.f20380b;
                    if (i113 != iM6839c6 || c6278e9.f20393h != C6278E.m6839c(c6278e9, i115)) {
                        StringBuilder sb13 = new StringBuilder();
                        int i116 = 0;
                        for (int i117 = 0; i117 < i114; i117++) {
                            if (((1 << i117) & c6278e9.f20392g) != 0) {
                                if (i116 > 0) {
                                    sb13.append(", ");
                                }
                                sb13.append(c6302x.mo6758b(i117));
                                i116++;
                            }
                        }
                        String string13 = sb13.toString();
                        StringBuilder sbM4500y6 = AbstractC3794B0.m4500y(string13, "StringBuilder().apply(builderAction).toString()");
                        int i118 = 0;
                        int i119 = 0;
                        while (i118 < i115) {
                            int i120 = i115;
                            if (((1 << i118) & c6278e9.f20393h) != 0) {
                                if (i116 > 0) {
                                    sbM4500y6.append(", ");
                                }
                                sbM4500y6.append(c6302x.mo6759c(i118));
                                i119++;
                            }
                            i118++;
                            i115 = i120;
                        }
                        String string14 = sbM4500y6.toString();
                        AbstractC16544l.m18093f(string14, "StringBuilder().apply(builderAction).toString()");
                        StringBuilder sb14 = new StringBuilder("Error while pushing ");
                        sb14.append(c6302x);
                        sb14.append(". Not all arguments were provided. Missing ");
                        AbstractC10763a.m11066x(sb14, i116, " int arguments (", string13, ") and ");
                        AbstractC3794B0.m4472G(sb14, i119, " object arguments (", string14, ").");
                        throw null;
                    }
                } else {
                    c6280b.getClass();
                }
            }
            int i121 = c6280b.f20395a.f19554F.f19334i;
            C5960K c5960k7 = c6280b.f20398d;
            int i122 = c5960k7.f19404b;
            if ((i122 > 0 ? c5960k7.f19403a[i122 - 1] : -1) > i121) {
                C5997d.m6470z("Missed recording an endGroup");
                throw null;
            }
            if ((i122 > 0 ? c5960k7.f19403a[i122 - 1] : -1) == i121) {
                c6280b.m6850d(false);
                c5960k7.m6396c();
                C6279a c6279a11 = c6280b.f20396b;
                c6279a11.getClass();
                c6279a11.f20394a.m6845i(C6287i.f20414c);
            }
            c6021p = this;
            int i123 = c6021p.f19554F.f19334i;
            int i124 = i10;
            if (i124 != c6021p.m6541e0(i123)) {
                c6021p.m6533a0(i123, i124);
            }
            if (z6) {
                i124 = 1;
            }
            c6021p.f19554F.m6326d();
            c6280b.m6849c();
            i11 = i124;
        }
        ArrayList arrayList9 = c6021p.f19572h.f19461a;
        C6006h0 c6006h2 = (C6006h0) arrayList9.remove(arrayList9.size() - 1);
        if (c6006h2 != null && !z11) {
            c6006h2.f19504c++;
        }
        c6021p.f19573i = c6006h2;
        c6021p.f19574j = c5960k.m6396c() + i11;
        c6021p.f19576l = c5960k.m6396c();
        c6021p.f19575k = c5960k.m6396c() + i11;
    }

    /* JADX INFO: renamed from: q */
    public final void m6554q() {
        m6553p(false);
        C6018n0 c6018n0M6560w = m6560w();
        if (c6018n0M6560w != null) {
            int i10 = c6018n0M6560w.f19533a;
            if ((i10 & 1) != 0) {
                c6018n0M6560w.f19533a = i10 | 2;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m6556s() {
        m6553p(false);
        this.f19566b.mo6484b();
        m6553p(false);
        C6280b c6280b = this.f19560L;
        if (c6280b.f20397c) {
            c6280b.m6850d(false);
            c6280b.m6850d(false);
            C6279a c6279a = c6280b.f20396b;
            c6279a.getClass();
            c6279a.f20394a.m6845i(C6287i.f20414c);
            c6280b.f20397c = false;
        }
        c6280b.m6848b();
        if (!(c6280b.f20398d.f19404b == 0)) {
            C5997d.m6470z("Missed recording an endGroup()");
            throw null;
        }
        if (!this.f19572h.f19461a.isEmpty()) {
            C5997d.m6470z("Start/end imbalance");
            throw null;
        }
        m6546i();
        this.f19554F.m6325c();
        this.f19586v = this.f19587w.m6396c() != 0;
    }

    /* JADX INFO: renamed from: t */
    public final void m6557t(int i10) {
        if (i10 < 0) {
            int i11 = -i10;
            C5947D0 c5947d0 = this.f19556H;
            while (true) {
                int i12 = c5947d0.f19385v;
                if (i12 <= i11) {
                    return;
                } else {
                    m6553p(c5947d0.m6382t(i12));
                }
            }
        } else {
            if (this.f19563O) {
                C5947D0 c5947d1 = this.f19556H;
                while (this.f19563O) {
                    m6553p(c5947d1.m6382t(c5947d1.f19385v));
                }
            }
            C5941A0 c5941a0 = this.f19554F;
            while (true) {
                int i13 = c5941a0.f19334i;
                if (i13 <= i10) {
                    return;
                } else {
                    m6553p(C5997d.m6460p(c5941a0.f19327b, i13));
                }
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m6558u(boolean z6, C6006h0 c6006h0) {
        this.f19572h.f19461a.add(this.f19573i);
        this.f19573i = c6006h0;
        int i10 = this.f19575k;
        C5960K c5960k = this.f19577m;
        c5960k.m6397d(i10);
        c5960k.m6397d(this.f19576l);
        c5960k.m6397d(this.f19574j);
        if (z6) {
            this.f19574j = 0;
        }
        this.f19575k = 0;
        this.f19576l = 0;
    }

    /* JADX INFO: renamed from: v */
    public final void m6559v() {
        C5943B0 c5943b0 = new C5943B0();
        if (this.f19550B) {
            c5943b0.m6342j();
        }
        if (this.f19566b.mo6485c()) {
            c5943b0.f19355v0 = new C12982u();
        }
        this.f19555G = c5943b0;
        C5947D0 c5947d0M6344p = c5943b0.m6344p();
        c5947d0M6344p.m6368e(true);
        this.f19556H = c5947d0M6344p;
    }

    /* JADX INFO: renamed from: w */
    public final C6018n0 m6560w() {
        if (this.f19590z == 0) {
            C5980U0 c5980u0 = this.f19552D;
            if (!c5980u0.f19461a.isEmpty()) {
                return (C6018n0) AbstractC17792x.m19532o(1, c5980u0.f19461a);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m6561x() {
        C6018n0 c6018n0M6560w;
        return (m6562y() && !this.f19586v && ((c6018n0M6560w = m6560w()) == null || (c6018n0M6560w.f19533a & 4) == 0)) ? false : true;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m6562y() {
        C6018n0 c6018n0M6560w;
        return (this.f19563O || this.f19588x || this.f19586v || (c6018n0M6560w = m6560w()) == null || (c6018n0M6560w.f19533a & 8) != 0) ? false : true;
    }

    /* JADX INFO: renamed from: z */
    public final void m6563z(ArrayList arrayList) {
        C6279a c6279a = this.f19570f;
        C6280b c6280b = this.f19560L;
        C6279a c6279a2 = c6280b.f20396b;
        try {
            c6280b.f20396b = c6279a;
            c6279a.f20394a.m6845i(C6299u.f20430c);
            if (arrayList.size() > 0) {
                C17309l c17309l = (C17309l) arrayList.get(0);
                AbstractC5981V abstractC5981V = (AbstractC5981V) c17309l.f55136Y;
                abstractC5981V.getClass();
                throw null;
            }
            C6279a c6279a3 = c6280b.f20396b;
            c6279a3.getClass();
            c6279a3.f20394a.m6845i(C6288j.f20415c);
            c6280b.f20400f = 0;
            c6280b.f20396b = c6279a2;
        } catch (Throwable th2) {
            c6280b.f20396b = c6279a2;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0084 A[LOOP:0: B:19:0x0041->B:31:0x0084, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0088 A[EDGE_INSN: B:32:0x0088->B:33:0x0089 BREAK  A[LOOP:0: B:19:0x0041->B:31:0x0084]] */
    /* JADX WARN: Code duplicated, block: B:79:0x0088 A[SYNTHETIC] */
    /* JADX INFO: renamed from: r */
    public final C6018n0 m6555r() {
        C6018n0 c6018n0;
        C5995c c5995cM6323a;
        C6016m0 c6016m0;
        C5980U0 c5980u0 = this.f19552D;
        if (c5980u0.f19461a.isEmpty()) {
            c6018n0 = null;
        } else {
            ArrayList arrayList = c5980u0.f19461a;
            c6018n0 = (C6018n0) arrayList.remove(arrayList.size() - 1);
        }
        if (c6018n0 != null) {
            c6018n0.f19533a &= -9;
        }
        if (c6018n0 != null) {
            int i10 = this.f19549A;
            C12948A c12948a = c6018n0.f19538f;
            if (c12948a == null || (c6018n0.f19533a & 16) != 0) {
                c6016m0 = null;
                break;
            }
            Object[] objArr = c12948a.f41110b;
            int[] iArr = c12948a.f41111c;
            long[] jArr = c12948a.f41109a;
            int length = jArr.length - 2;
            if (length < 0) {
                c6016m0 = null;
                break;
            }
            int i11 = 0;
            loop0: while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((j10 & 255) < 128) {
                            int i14 = (i11 << 3) + i13;
                            Object obj = objArr[i14];
                            if (iArr[i14] != i10) {
                                c6016m0 = new C6016m0(c6018n0, i10, c12948a, 0);
                                break loop0;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 == 8) {
                        if (i11 == length) {
                            i11++;
                        }
                    }
                    c6016m0 = null;
                    break;
                }
                if (i11 == length) {
                    c6016m0 = null;
                    break;
                }
                i11++;
            }
            if (c6016m0 != null) {
                C6279a c6279a = this.f19560L.f20396b;
                c6279a.getClass();
                C6286h c6286h = C6286h.f20413c;
                C6278E c6278e = c6279a.f20394a;
                c6278e.m6846j(c6286h);
                AbstractC9215U.m9785c(c6278e, 0, c6016m0);
                AbstractC9215U.m9785c(c6278e, 1, this.f19571g);
                int i15 = c6278e.f20392g;
                int i16 = c6286h.f20379a;
                int iM6839c = C6278E.m6839c(c6278e, i16);
                int i17 = c6286h.f20380b;
                if (i15 != iM6839c || c6278e.f20393h != C6278E.m6839c(c6278e, i17)) {
                    StringBuilder sb2 = new StringBuilder();
                    int i18 = 0;
                    for (int i19 = 0; i19 < i16; i19++) {
                        if ((c6278e.f20392g & (1 << i19)) != 0) {
                            if (i18 > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(c6286h.mo6758b(i19));
                            i18++;
                        }
                    }
                    String string = sb2.toString();
                    StringBuilder sbM4500y = AbstractC3794B0.m4500y(string, "StringBuilder().apply(builderAction).toString()");
                    int i20 = 0;
                    for (int i21 = 0; i21 < i17; i21++) {
                        if ((c6278e.f20393h & (1 << i21)) != 0) {
                            if (i18 > 0) {
                                sbM4500y.append(", ");
                            }
                            sbM4500y.append(c6286h.mo6759c(i21));
                            i20++;
                        }
                    }
                    String string2 = sbM4500y.toString();
                    AbstractC16544l.m18093f(string2, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb3 = new StringBuilder("Error while pushing ");
                    sb3.append(c6286h);
                    sb3.append(ahZQMZ.OgbKgMqgrY);
                    AbstractC10763a.m11066x(sb3, i18, " int arguments (", string, ") and ");
                    AbstractC3794B0.m4472G(sb3, i20, " object arguments (", string2, ").");
                    throw null;
                }
            }
        }
        C6018n0 c6018n1 = null;
        if (c6018n0 != null) {
            int i22 = c6018n0.f19533a;
            if ((i22 & 16) == 0 && ((i22 & 1) != 0 || this.f19580p)) {
                if (c6018n0.f19535c == null) {
                    if (this.f19563O) {
                        C5947D0 c5947d0 = this.f19556H;
                        c5995cM6323a = c5947d0.m6365b(c5947d0.f19385v);
                    } else {
                        C5941A0 c5941a0 = this.f19554F;
                        c5995cM6323a = c5941a0.m6323a(c5941a0.f19334i);
                    }
                    c6018n0.f19535c = c5995cM6323a;
                }
                c6018n0.f19533a &= -5;
                c6018n1 = c6018n0;
            }
        }
        m6553p(false);
        return c6018n1;
    }
}
