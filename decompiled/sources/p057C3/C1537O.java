package p057C3;

import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import bb.AbstractC11278C;
import bb.AbstractC11328u;
import bb.C11276A;
import bb.C11288M;
import bb.C11290O;
import bb.C11292Q;
import bb.C11294T;
import bb.C11333z;
import com.statsig.androidsdk.ErrorBoundaryKt;
import io.sentry.hints.C15370i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import p001A.C0013G0;
import p001A.C0100z;
import p003A1.AbstractC0168G;
import p084D4.C1904b;
import p1016t3.AbstractC19764N;
import p1016t3.C19765O;
import p1016t3.C19766P;
import p1016t3.C19769T;
import p1016t3.C19770U;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p109E3.ExecutorC2265F;
import p110E4.C2307e;
import p232J3.C4227a0;
import p232J3.C4230c;
import p232J3.C4253y;
import p232J3.InterfaceC4220U;
import p232J3.InterfaceC4251w;
import p239Ja.C4307j;
import p281L3.AbstractC4931r;
import p281L3.C4914a;
import p281L3.C4915b;
import p281L3.C4920g;
import p281L3.C4922i;
import p281L3.C4923j;
import p281L3.C4928o;
import p281L3.C4929p;
import p281L3.C4932s;
import p281L3.InterfaceC4925l;
import p281L3.InterfaceC4930q;
import p305M3.C5285e;
import p523V9.C8217w;
import p525Vb.C8258a;

/* JADX INFO: renamed from: C3.O */
/* JADX INFO: loaded from: classes.dex */
public final class C1537O {

    /* JADX INFO: renamed from: a */
    public final Object f4177a;

    /* JADX INFO: renamed from: b */
    public final Object f4178b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4220U[] f4179c;

    /* JADX INFO: renamed from: d */
    public boolean f4180d;

    /* JADX INFO: renamed from: e */
    public boolean f4181e;

    /* JADX INFO: renamed from: f */
    public C1538P f4182f;

    /* JADX INFO: renamed from: g */
    public boolean f4183g;

    /* JADX INFO: renamed from: h */
    public final boolean[] f4184h;

    /* JADX INFO: renamed from: i */
    public final AbstractC1554d[] f4185i;

    /* JADX INFO: renamed from: j */
    public final AbstractC4931r f4186j;

    /* JADX INFO: renamed from: k */
    public final C1546Y f4187k;

    /* JADX INFO: renamed from: l */
    public C1537O f4188l;

    /* JADX INFO: renamed from: m */
    public C4227a0 f4189m;

    /* JADX INFO: renamed from: n */
    public C4932s f4190n;

    /* JADX INFO: renamed from: o */
    public long f4191o;

    public C1537O(AbstractC1554d[] abstractC1554dArr, long j10, AbstractC4931r abstractC4931r, C5285e c5285e, C1546Y c1546y, C1538P c1538p, C4932s c4932s) {
        this.f4185i = abstractC1554dArr;
        this.f4191o = j10;
        this.f4186j = abstractC4931r;
        this.f4187k = c1546y;
        C4253y c4253y = c1538p.f4192a;
        this.f4178b = c4253y.f13895a;
        this.f4182f = c1538p;
        this.f4189m = C4227a0.f13814d;
        this.f4190n = c4932s;
        this.f4179c = new InterfaceC4220U[abstractC1554dArr.length];
        this.f4184h = new boolean[abstractC1554dArr.length];
        c1546y.getClass();
        int i10 = C1557e0.f4323k;
        Pair pair = (Pair) c4253y.f13895a;
        Object obj = pair.first;
        C4253y c4253yM5016a = c4253y.m5016a(pair.second);
        C1545X c1545x = (C1545X) ((HashMap) c1546y.f4241e).get(obj);
        c1545x.getClass();
        ((HashSet) c1546y.f4244h).add(c1545x);
        C1544W c1544w = (C1544W) ((HashMap) c1546y.f4242f).get(c1545x);
        if (c1544w != null) {
            c1544w.f4229a.m4990d(c1544w.f4230b);
        }
        c1545x.f4234c.add(c4253yM5016a);
        InterfaceC4251w interfaceC4251wMo4929a = c1545x.f4232a.mo4929a(c4253yM5016a, c5285e, c1538p.f4193b);
        ((IdentityHashMap) c1546y.f4240d).put(interfaceC4251wMo4929a, c1545x);
        c1546y.m2364d();
        long j11 = c1538p.f4195d;
        this.f4177a = j11 != -9223372036854775807L ? new C4230c(interfaceC4251wMo4929a, true, 0L, j11) : interfaceC4251wMo4929a;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [J3.w, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public final long m2333a(C4932s c4932s, long j10, boolean z6, boolean[] zArr) {
        AbstractC1554d[] abstractC1554dArr;
        InterfaceC4220U[] interfaceC4220UArr;
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= c4932s.f16096a) {
                break;
            }
            if (z6 || !c4932s.m5541a(this.f4190n, i10)) {
                z10 = false;
            }
            this.f4184h[i10] = z10;
            i10++;
        }
        int i11 = 0;
        while (true) {
            abstractC1554dArr = this.f4185i;
            int length = abstractC1554dArr.length;
            interfaceC4220UArr = this.f4179c;
            if (i11 >= length) {
                break;
            }
            if (abstractC1554dArr[i11].f4296Z == -2) {
                interfaceC4220UArr[i11] = null;
            }
            i11++;
        }
        m2334b();
        this.f4190n = c4932s;
        m2335c();
        long jMo4927o = this.f4177a.mo4927o(c4932s.f16098c, this.f4184h, this.f4179c, zArr, j10);
        for (int i12 = 0; i12 < abstractC1554dArr.length; i12++) {
            if (abstractC1554dArr[i12].f4296Z == -2 && this.f4190n.m5542b(i12)) {
                interfaceC4220UArr[i12] = new C15370i(8);
            }
        }
        this.f4181e = false;
        for (int i13 = 0; i13 < interfaceC4220UArr.length; i13++) {
            if (interfaceC4220UArr[i13] != null) {
                AbstractC20800b.m21320h(c4932s.m5542b(i13));
                if (abstractC1554dArr[i13].f4296Z != -2) {
                    this.f4181e = true;
                }
            } else {
                AbstractC20800b.m21320h(c4932s.f16098c[i13] == null);
            }
        }
        return jMo4927o;
    }

    /* JADX INFO: renamed from: b */
    public final void m2334b() {
        if (this.f4188l != null) {
            return;
        }
        int i10 = 0;
        while (true) {
            C4932s c4932s = this.f4190n;
            if (i10 >= c4932s.f16096a) {
                return;
            }
            boolean zM5542b = c4932s.m5542b(i10);
            InterfaceC4930q interfaceC4930q = this.f4190n.f16098c[i10];
            if (zM5542b && interfaceC4930q != null) {
                interfaceC4930q.mo4909f();
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2335c() {
        if (this.f4188l != null) {
            return;
        }
        int i10 = 0;
        while (true) {
            C4932s c4932s = this.f4190n;
            if (i10 >= c4932s.f16096a) {
                return;
            }
            boolean zM5542b = c4932s.m5542b(i10);
            InterfaceC4930q interfaceC4930q = this.f4190n.f16098c[i10];
            if (zM5542b && interfaceC4930q != null) {
                interfaceC4930q.mo4907d();
            }
            i10++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [J3.V, java.lang.Object] */
    /* JADX INFO: renamed from: d */
    public final long m2336d() {
        if (!this.f4180d) {
            return this.f4182f.f4193b;
        }
        long jMo4925l = this.f4181e ? this.f4177a.mo4925l() : Long.MIN_VALUE;
        return jMo4925l == Long.MIN_VALUE ? this.f4182f.f4196e : jMo4925l;
    }

    /* JADX INFO: renamed from: e */
    public final long m2337e() {
        return this.f4182f.f4193b + this.f4191o;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [J3.V, java.lang.Object] */
    /* JADX INFO: renamed from: f */
    public final boolean m2338f() {
        return this.f4180d && (!this.f4181e || this.f4177a.mo4925l() == Long.MIN_VALUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [J3.w, java.lang.Object] */
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
    /* JADX INFO: renamed from: g */
    public final void m2339g() {
        m2334b();
        ?? r6 = this.f4177a;
        try {
            boolean z6 = r6 instanceof C4230c;
            C1546Y c1546y = this.f4187k;
            if (z6) {
                c1546y.m2370j(((C4230c) r6).f13821Y);
            } else {
                c1546y.m2370j(r6);
            }
        } catch (RuntimeException e10) {
            AbstractC20800b.m21325m("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x07b1 */
    /* JADX WARN: Code duplicated, block: B:126:0x02d2  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C4932s m2340h(float f10, AbstractC19764N abstractC19764N) {
        final C4922i c4922i;
        Pair pairM5537g;
        C4227a0[] c4227a0Arr;
        int[] iArr;
        int i10;
        final boolean z6;
        String str;
        long j10;
        int i11;
        boolean z10;
        int i12;
        C11294T c11294tM12695y;
        C4915b c4915b;
        C4922i c4922i2;
        C1904b c1904b;
        long j11;
        int i13;
        int i14;
        int i15;
        C4227a0[] c4227a0Arr2;
        int[] iArr2;
        int i16;
        int[] iArr3;
        C19765O c19765o;
        C2307e c2307e;
        int i17;
        int[] iArr4;
        int i18 = 1;
        AbstractC4931r abstractC4931r = this.f4186j;
        AbstractC1554d[] abstractC1554dArr = this.f4185i;
        C4227a0 c4227a0 = this.f4189m;
        abstractC4931r.getClass();
        int[] iArr5 = new int[abstractC1554dArr.length + 1];
        int length = abstractC1554dArr.length + 1;
        C19765O[][] c19765oArr = new C19765O[length][];
        int[][][] iArr6 = new int[abstractC1554dArr.length + 1][][];
        for (int i19 = 0; i19 < length; i19++) {
            int i20 = c4227a0.f13815a;
            c19765oArr[i19] = new C19765O[i20];
            iArr6[i19] = new int[i20][];
        }
        int length2 = abstractC1554dArr.length;
        final int[] iArr7 = new int[length2];
        for (int i21 = 0; i21 < length2; i21++) {
            iArr7[i21] = abstractC1554dArr[i21].mo2388A();
        }
        int i22 = 0;
        while (i22 < c4227a0.f13815a) {
            C19765O c19765oM4999a = c4227a0.m4999a(i22);
            int i23 = c19765oM4999a.f62604c == 5 ? i18 : 0;
            int length3 = abstractC1554dArr.length;
            int i24 = i18;
            int i25 = 0;
            int i26 = 0;
            while (i25 < abstractC1554dArr.length) {
                AbstractC1554d abstractC1554d = abstractC1554dArr[i25];
                C4227a0 c4227a1 = c4227a0;
                int iMax = 0;
                for (int i27 = 0; i27 < c19765oM4999a.f62602a; i27++) {
                    iMax = Math.max(iMax, abstractC1554d.mo2409z(c19765oM4999a.f62605d[i27]) & 7);
                }
                int i28 = iArr5[i25] == 0 ? 1 : 0;
                if (iMax > i26 || (iMax == i26 && i23 != 0 && i24 == 0 && i28 != 0)) {
                    i24 = i28;
                    length3 = i25;
                    i26 = iMax;
                }
                i25++;
                c4227a0 = c4227a1;
            }
            C4227a0 c4227a2 = c4227a0;
            if (length3 == abstractC1554dArr.length) {
                iArr4 = new int[c19765oM4999a.f62602a];
                i17 = 1;
            } else {
                AbstractC1554d abstractC1554d2 = abstractC1554dArr[length3];
                int[] iArr8 = new int[c19765oM4999a.f62602a];
                for (int i29 = 0; i29 < c19765oM4999a.f62602a; i29++) {
                    iArr8[i29] = abstractC1554d2.mo2409z(c19765oM4999a.f62605d[i29]);
                }
                i17 = 1;
                iArr4 = iArr8;
            }
            int i30 = iArr5[length3];
            c19765oArr[length3][i30] = c19765oM4999a;
            iArr6[length3][i30] = iArr4;
            iArr5[length3] = i30 + i17;
            i22 += i17;
            i18 = i17;
            c4227a0 = c4227a2;
        }
        C4227a0[] c4227a0Arr3 = new C4227a0[abstractC1554dArr.length];
        String[] strArr = new String[abstractC1554dArr.length];
        int[] iArr9 = new int[abstractC1554dArr.length];
        for (int i31 = 0; i31 < abstractC1554dArr.length; i31++) {
            int i32 = iArr5[i31];
            c4227a0Arr3[i31] = new C4227a0((C19765O[]) AbstractC20817s.m21392F(i32, c19765oArr[i31]));
            iArr6[i31] = (int[][]) AbstractC20817s.m21392F(i32, iArr6[i31]);
            strArr[i31] = abstractC1554dArr[i31].mo2392i();
            iArr9[i31] = abstractC1554dArr[i31].f4296Z;
        }
        C1904b c1904b2 = new C1904b(iArr9, c4227a0Arr3, iArr7, iArr6, new C4227a0((C19765O[]) AbstractC20817s.m21392F(iArr5[abstractC1554dArr.length], c19765oArr[abstractC1554dArr.length])));
        final C4928o c4928o = (C4928o) abstractC4931r;
        synchronized (c4928o.f16086c) {
            try {
                c4922i = c4928o.f16089f;
                if (c4922i.f16051v && AbstractC20817s.f66106a >= 32 && (c2307e = c4928o.f16090g) != null) {
                    Looper looperMyLooper = Looper.myLooper();
                    AbstractC20800b.m21321i(looperMyLooper);
                    if (((C4923j) c2307e.f7161q0) == null && ((Handler) c2307e.f7160p0) == null) {
                        c2307e.f7161q0 = new C4923j(c4928o);
                        Handler handler = new Handler(looperMyLooper);
                        c2307e.f7160p0 = handler;
                        ((Spatializer) c2307e.f7159o0).addOnSpatializerStateChangedListener(new ExecutorC2265F(handler, 0), (C4923j) c2307e.f7161q0);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                while (true) {
                    throw th;
                }
            }
        }
        int i33 = c1904b2.f5565a;
        C4929p[] c4929pArr = new C4929p[i33];
        c4922i.f62637m.getClass();
        Pair pairM5537g2 = C4928o.m5537g(2, c1904b2, iArr6, new C0100z(c4922i, 17, iArr7), new C0013G0(8));
        C19766P c19766p = c4922i.f62637m;
        int i34 = 4;
        if (pairM5537g2 == null) {
            c19766p.getClass();
            pairM5537g = C4928o.m5537g(4, c1904b2, iArr6, new C4307j(c4922i, 2), new C0013G0(6));
        } else {
            pairM5537g = null;
        }
        if (pairM5537g != null) {
            c4929pArr[((Integer) pairM5537g.second).intValue()] = (C4929p) pairM5537g.first;
        } else if (pairM5537g2 != null) {
            c4929pArr[((Integer) pairM5537g2.second).intValue()] = (C4929p) pairM5537g2.first;
        }
        int i35 = 0;
        while (true) {
            c4227a0Arr = (C4227a0[]) c1904b2.f5567c;
            iArr = (int[]) c1904b2.f5566b;
            if (i35 >= c1904b2.f5565a) {
                i10 = 1;
                z6 = false;
                break;
            }
            if (2 == iArr[i35] && c4227a0Arr[i35].f13815a > 0) {
                z6 = true;
                i10 = 1;
                break;
            }
            i35++;
        }
        Pair pairM5537g3 = C4928o.m5537g(i10, c1904b2, iArr6, new InterfaceC4925l() { // from class: L3.c
            @Override // p281L3.InterfaceC4925l
            /* JADX INFO: renamed from: i */
            public final C11294T mo393i(int i36, C19765O c19765o2, int[] iArr10) {
                C4928o c4928o2 = c4928o;
                c4928o2.getClass();
                C4917d c4917d = new C4917d(c4928o2);
                int i37 = iArr7[i36];
                C11333z c11333zM12690s = AbstractC11278C.m12690s();
                for (int i38 = 0; i38 < c19765o2.f62602a; i38++) {
                    c11333zM12690s.m12762a(new C4918e(i36, c19765o2, i38, c4922i, iArr10[i38], z6, c4917d, i37));
                }
                return c11333zM12690s.m12768j();
            }
        }, new C0013G0(7));
        if (pairM5537g3 != null) {
            c4929pArr[((Integer) pairM5537g3.second).intValue()] = (C4929p) pairM5537g3.first;
        }
        if (pairM5537g3 == null) {
            str = null;
        } else {
            C4929p c4929p = (C4929p) pairM5537g3.first;
            str = c4929p.f16092a.f62605d[c4929p.f16093b[0]].f62743d;
        }
        c19766p.getClass();
        int i36 = 3;
        Pair pairM5537g4 = C4928o.m5537g(3, c1904b2, iArr6, new C0100z(c4922i, 18, str), new C0013G0(9));
        if (pairM5537g4 != null) {
            c4929pArr[((Integer) pairM5537g4.second).intValue()] = (C4929p) pairM5537g4.first;
        }
        int i37 = 0;
        while (i37 < i33) {
            int i38 = iArr[i37];
            if (i38 == 2) {
                c4227a0Arr2 = c4227a0Arr;
                iArr2 = iArr;
                i16 = 1;
            } else if (i38 != 1) {
                if (i38 == i36 || i38 == i34) {
                    c4227a0Arr2 = c4227a0Arr;
                    iArr2 = iArr;
                } else {
                    C4227a0 c4227a3 = c4227a0Arr[i37];
                    int[][] iArr10 = iArr6[i37];
                    int i39 = 0;
                    C19765O c19765o2 = null;
                    C4920g c4920g = null;
                    int i40 = 0;
                    while (i39 < c4227a3.f13815a) {
                        int[] iArr11 = iArr10[i39];
                        C4227a0 c4227a4 = c4227a3;
                        int i41 = 0;
                        for (C19765O c19765oM4999a2 = c4227a3.m4999a(i39); i41 < c19765oM4999a2.f62602a; c19765oM4999a2 = c19765o) {
                            C4227a0[] c4227a0Arr4 = c4227a0Arr;
                            if (AbstractC0168G.m526o(iArr11[i41], c4922i.f16052w)) {
                                iArr3 = iArr;
                                C4920g c4920g2 = new C4920g(c19765oM4999a2.f62605d[i41], iArr11[i41]);
                                if (c4920g != null) {
                                    c19765o = c19765oM4999a2;
                                    if (AbstractC11328u.f34256a.mo12757c(c4920g2.f16036Z, c4920g.f16036Z).mo12757c(c4920g2.f16035Y, c4920g.f16035Y).mo12759e() > 0) {
                                    }
                                } else {
                                    c19765o = c19765oM4999a2;
                                }
                                c4920g = c4920g2;
                                i40 = i41;
                                c19765o2 = c19765o;
                            } else {
                                iArr3 = iArr;
                                c19765o = c19765oM4999a2;
                            }
                            i41++;
                            c4227a0Arr = c4227a0Arr4;
                            iArr = iArr3;
                        }
                        i39++;
                        c4227a3 = c4227a4;
                    }
                    c4227a0Arr2 = c4227a0Arr;
                    iArr2 = iArr;
                    c4929pArr[i37] = c19765o2 == null ? null : new C4929p(c19765o2, new int[]{i40});
                }
                i16 = 1;
            } else {
                c4227a0Arr2 = c4227a0Arr;
                iArr2 = iArr;
                i16 = 1;
            }
            i37 += i16;
            c4227a0Arr = c4227a0Arr2;
            iArr = iArr2;
            i34 = 4;
            i36 = 3;
        }
        int i42 = c1904b2.f5565a;
        HashMap map = new HashMap();
        for (int i43 = 0; i43 < i42; i43++) {
            C4227a0 c4227a5 = ((C4227a0[]) c1904b2.f5567c)[i43];
            for (int i44 = 0; i44 < c4227a5.f13815a; i44++) {
                if (c4922i.f62640p.get(c4227a5.m4999a(i44)) != null) {
                    throw new ClassCastException();
                }
            }
        }
        C4227a0 c4227a6 = (C4227a0) c1904b2.f5570f;
        for (int i45 = 0; i45 < c4227a6.f13815a; i45++) {
            if (c4922i.f62640p.get(c4227a6.m4999a(i45)) != null) {
                throw new ClassCastException();
            }
        }
        for (int i46 = 0; i46 < i42; i46++) {
            if (map.get(Integer.valueOf(((int[]) c1904b2.f5566b)[i46])) != null) {
                throw new ClassCastException();
            }
        }
        int i47 = c1904b2.f5565a;
        for (int i48 = 0; i48 < i47; i48++) {
            C4227a0 c4227a7 = ((C4227a0[]) c1904b2.f5567c)[i48];
            Map map2 = (Map) c4922i.f16054y.get(i48);
            if (map2 != null && map2.containsKey(c4227a7)) {
                Map map3 = (Map) c4922i.f16054y.get(i48);
                if (map3 != null && map3.get(c4227a7) != null) {
                    throw new ClassCastException();
                }
                c4929pArr[i48] = null;
            }
        }
        for (int i49 = 0; i49 < i33; i49++) {
            int i50 = ((int[]) c1904b2.f5566b)[i49];
            if (c4922i.f16055z.get(i49) || c4922i.f62641q.contains(Integer.valueOf(i50))) {
                c4929pArr[i49] = null;
            }
        }
        C8258a c8258a = c4928o.f16087d;
        AbstractC20800b.m21321i(c4928o.f16095b);
        c8258a.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i51 = 0; i51 < c4929pArr.length; i51 += i15) {
            C4929p c4929p2 = c4929pArr[i51];
            if (c4929p2 != null) {
                i15 = 1;
                if (c4929p2.f16093b.length > 1) {
                    C11333z c11333zM12690s = AbstractC11278C.m12690s();
                    c11333zM12690s.m12763c(new C4914a(0L, 0L));
                    arrayList.add(c11333zM12690s);
                }
            } else {
                i15 = 1;
            }
            arrayList.add(null);
        }
        int length4 = c4929pArr.length;
        long[][] jArr = new long[length4][];
        int i52 = 0;
        while (true) {
            j10 = -1;
            if (i52 >= c4929pArr.length) {
                break;
            }
            C4929p c4929p3 = c4929pArr[i52];
            if (c4929p3 == null) {
                jArr[i52] = new long[0];
                i14 = 1;
            } else {
                int[] iArr12 = c4929p3.f16093b;
                jArr[i52] = new long[iArr12.length];
                for (int i53 = 0; i53 < iArr12.length; i53++) {
                    long j12 = c4929p3.f16092a.f62605d[iArr12[i53]].f62748i;
                    long[] jArr2 = jArr[i52];
                    if (j12 == -1) {
                        j12 = 0;
                    }
                    jArr2[i53] = j12;
                }
                i14 = 1;
                Arrays.sort(jArr[i52]);
            }
            i52 += i14;
        }
        int[] iArr13 = new int[length4];
        long[] jArr3 = new long[length4];
        for (int i54 = 0; i54 < length4; i54++) {
            long[] jArr4 = jArr[i54];
            jArr3[i54] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        C4915b.m5520m(arrayList, jArr3);
        C11292Q c11292q = C11292Q.f34184Y;
        c11292q.getClass();
        C11290O c11290oM10204Q = new C11288M(c11292q).m12741a().m10204Q();
        int i55 = 0;
        while (i55 < length4) {
            long[] jArr5 = jArr[i55];
            if (jArr5.length <= 1) {
                c4922i2 = c4922i;
                j11 = j10;
                c1904b = c1904b2;
            } else {
                int length5 = jArr5.length;
                double[] dArr = new double[length5];
                int i56 = 0;
                while (true) {
                    long[] jArr6 = jArr[i55];
                    double dLog = 0.0d;
                    if (i56 >= jArr6.length) {
                        break;
                    }
                    C4922i c4922i3 = c4922i;
                    C1904b c1904b3 = c1904b2;
                    long j13 = jArr6[i56];
                    if (j13 != -1) {
                        dLog = Math.log(j13);
                    }
                    dArr[i56] = dLog;
                    i56++;
                    c1904b2 = c1904b3;
                    c4922i = c4922i3;
                }
                c4922i2 = c4922i;
                c1904b = c1904b2;
                int i57 = 1;
                j11 = -1;
                int i58 = length5 - 1;
                double d10 = dArr[i58] - dArr[0];
                int i59 = 0;
                while (i59 < i58) {
                    double d11 = dArr[i59];
                    int i60 = i59 + i57;
                    Double dValueOf = Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i60]) * 0.5d) - dArr[0]) / d10);
                    Integer numValueOf = Integer.valueOf(i55);
                    Map map4 = c11290oM10204Q.f34181p0;
                    Collection collection = (Collection) map4.get(dValueOf);
                    if (collection == null) {
                        List list = (List) c11290oM10204Q.f34183r0.get();
                        if (!list.add(numValueOf)) {
                            throw new AssertionError("New Collection violated the Collection spec");
                        }
                        i13 = 1;
                        c11290oM10204Q.f34182q0++;
                        map4.put(dValueOf, list);
                    } else {
                        i13 = 1;
                        if (collection.add(numValueOf)) {
                            c11290oM10204Q.f34182q0++;
                        }
                    }
                    i57 = i13;
                    i59 = i60;
                }
            }
            i55++;
            c1904b2 = c1904b;
            j10 = j11;
            c4922i = c4922i2;
        }
        C4922i c4922i4 = c4922i;
        C1904b c1904b4 = c1904b2;
        C8217w c8217w = c11290oM10204Q.f34233Z;
        if (c8217w == null) {
            c8217w = new C8217w(c11290oM10204Q, 6);
            c11290oM10204Q.f34233Z = c8217w;
        }
        AbstractC11278C abstractC11278CM12691t = AbstractC11278C.m12691t(c8217w);
        for (int i61 = 0; i61 < abstractC11278CM12691t.size(); i61++) {
            int iIntValue = ((Integer) abstractC11278CM12691t.get(i61)).intValue();
            int i62 = iArr13[iIntValue] + 1;
            iArr13[iIntValue] = i62;
            jArr3[iIntValue] = jArr[iIntValue][i62];
            C4915b.m5520m(arrayList, jArr3);
        }
        for (int i63 = 0; i63 < c4929pArr.length; i63++) {
            if (arrayList.get(i63) != null) {
                jArr3[i63] = jArr3[i63] * 2;
            }
        }
        C4915b.m5520m(arrayList, jArr3);
        C11333z c11333zM12690s2 = AbstractC11278C.m12690s();
        for (int i64 = 0; i64 < arrayList.size(); i64++) {
            C11333z c11333z = (C11333z) arrayList.get(i64);
            c11333zM12690s2.m12763c(c11333z == null ? AbstractC11278C.m12693w() : c11333z.m12768j());
        }
        C11294T c11294tM12768j = c11333zM12690s2.m12768j();
        InterfaceC4930q[] interfaceC4930qArr = new InterfaceC4930q[c4929pArr.length];
        for (int i65 = 0; i65 < c4929pArr.length; i65++) {
            C4929p c4929p4 = c4929pArr[i65];
            if (c4929p4 != null) {
                int[] iArr14 = c4929p4.f16093b;
                if (iArr14.length != 0) {
                    int length6 = iArr14.length;
                    C19765O c19765o3 = c4929p4.f16092a;
                    if (length6 == 1) {
                        c4915b = new C4915b(c19765o3, iArr14[0]);
                    } else {
                        AbstractC11278C abstractC11278C = (AbstractC11278C) c11294tM12768j.get(i65);
                        long j14 = ErrorBoundaryKt.SAMPLING_RATE;
                        long j15 = 25000;
                        C4915b c4915b2 = new C4915b(c19765o3, iArr14);
                        if (j15 < j14) {
                            AbstractC20800b.m21332t("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
                        }
                        AbstractC11278C.m12691t(abstractC11278C);
                        c4915b = c4915b2;
                    }
                    interfaceC4930qArr[i65] = c4915b;
                }
            }
        }
        C1559f0[] c1559f0Arr = new C1559f0[i33];
        int i66 = 0;
        while (i66 < i33) {
            C1904b c1904b5 = c1904b4;
            C4922i c4922i5 = c4922i4;
            c1559f0Arr[i66] = (c4922i5.f16055z.get(i66) || c4922i5.f62641q.contains(Integer.valueOf(((int[]) c1904b5.f5566b)[i66])) || (((int[]) c1904b5.f5566b)[i66] != -2 && interfaceC4930qArr[i66] == null)) ? null : C1559f0.f4338c;
            i66++;
            c1904b4 = c1904b5;
            c4922i4 = c4922i5;
        }
        C1904b c1904b6 = c1904b4;
        c4922i4.f62637m.getClass();
        Pair pairCreate = Pair.create(c1559f0Arr, interfaceC4930qArr);
        InterfaceC4930q[] interfaceC4930qArr2 = (InterfaceC4930q[]) pairCreate.second;
        List[] listArr = new List[interfaceC4930qArr2.length];
        for (int i67 = 0; i67 < interfaceC4930qArr2.length; i67++) {
            InterfaceC4930q interfaceC4930q = interfaceC4930qArr2[i67];
            if (interfaceC4930q != null) {
                c11294tM12695y = AbstractC11278C.m12695y(interfaceC4930q);
            } else {
                C11276A c11276a = AbstractC11278C.f34162Z;
                c11294tM12695y = C11294T.f34185q0;
            }
            listArr[i67] = c11294tM12695y;
        }
        C11333z c11333z2 = new C11333z(4);
        for (int i68 = 0; i68 < c1904b6.f5565a; i68++) {
            C4227a0[] c4227a0Arr5 = (C4227a0[]) c1904b6.f5567c;
            C4227a0 c4227a8 = c4227a0Arr5[i68];
            List list2 = listArr[i68];
            int i69 = 0;
            while (i69 < c4227a8.f13815a) {
                C19765O c19765oM4999a3 = c4227a8.m4999a(i69);
                int i70 = c4227a0Arr5[i68].m4999a(i69).f62602a;
                int[] iArr15 = new int[i70];
                int i71 = 0;
                int i72 = 0;
                while (i71 < i70) {
                    if ((((int[][][]) c1904b6.f5569e)[i68][i69][i71] & 7) != 4) {
                        i12 = 1;
                    } else {
                        i12 = 1;
                        iArr15[i72] = i71;
                        i72++;
                    }
                    i71 += i12;
                }
                int[] iArrCopyOf = Arrays.copyOf(iArr15, i72);
                List[] listArr2 = listArr;
                int iMin = 16;
                String str2 = null;
                int i73 = 0;
                boolean z11 = false;
                int i74 = 0;
                while (i73 < iArrCopyOf.length) {
                    C4227a0 c4227a9 = c4227a8;
                    String str3 = c4227a0Arr5[i68].m4999a(i69).f62605d[iArrCopyOf[i73]].f62752m;
                    int i75 = i74 + 1;
                    if (i74 == 0) {
                        str2 = str3;
                    } else {
                        z11 = (!AbstractC20817s.m21400a(str2, str3)) | z11;
                    }
                    iMin = Math.min(iMin, ((int[][][]) c1904b6.f5569e)[i68][i69][i73] & 24);
                    i73++;
                    c4227a8 = c4227a9;
                    i74 = i75;
                }
                C4227a0 c4227a10 = c4227a8;
                if (z11) {
                    iMin = Math.min(iMin, ((int[]) c1904b6.f5568d)[i68]);
                }
                boolean z12 = iMin != 0;
                int i76 = c19765oM4999a3.f62602a;
                int[] iArr16 = new int[i76];
                boolean[] zArr = new boolean[i76];
                int i77 = 0;
                while (i77 < c19765oM4999a3.f62602a) {
                    iArr16[i77] = ((int[][][]) c1904b6.f5569e)[i68][i69][i77] & 7;
                    int i78 = 0;
                    while (true) {
                        if (i78 >= list2.size()) {
                            i11 = 1;
                            z10 = false;
                            break;
                        }
                        InterfaceC4930q interfaceC4930q2 = (InterfaceC4930q) list2.get(i78);
                        if (interfaceC4930q2.mo4904a().equals(c19765oM4999a3) && interfaceC4930q2.mo4915l(i77) != -1) {
                            i11 = 1;
                            z10 = true;
                            break;
                        }
                        i78++;
                    }
                    zArr[i77] = z10;
                    i77 += i11;
                }
                c11333z2.m12762a(new C19769T(c19765oM4999a3, z12, iArr16, zArr));
                i69++;
                listArr = listArr2;
                c4227a8 = c4227a10;
            }
        }
        int i79 = 0;
        while (true) {
            C4227a0 c4227a11 = (C4227a0) c1904b6.f5570f;
            if (i79 >= c4227a11.f13815a) {
                break;
            }
            C19765O c19765oM4999a4 = c4227a11.m4999a(i79);
            int[] iArr17 = new int[c19765oM4999a4.f62602a];
            Arrays.fill(iArr17, 0);
            c11333z2.m12762a(new C19769T(c19765oM4999a4, false, iArr17, new boolean[c19765oM4999a4.f62602a]));
            i79++;
        }
        C4932s c4932s = new C4932s((C1559f0[]) pairCreate.first, (InterfaceC4930q[]) pairCreate.second, new C19770U(c11333z2.m12768j()), c1904b6);
        for (int i80 = 0; i80 < c4932s.f16096a; i80++) {
            if (c4932s.m5542b(i80)) {
                AbstractC20800b.m21320h(c4932s.f16098c[i80] != null || this.f4185i[i80].f4296Z == -2);
            } else {
                AbstractC20800b.m21320h(c4932s.f16098c[i80] == null);
            }
        }
        for (InterfaceC4930q interfaceC4930q3 : c4932s.f16098c) {
            if (interfaceC4930q3 != null) {
                interfaceC4930q3.mo4912i(f10);
            }
        }
        return c4932s;
    }

    /* JADX INFO: renamed from: i */
    public final void m2341i() {
        Object obj = this.f4177a;
        if (obj instanceof C4230c) {
            long j10 = this.f4182f.f4195d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            C4230c c4230c = (C4230c) obj;
            c4230c.f13825q0 = 0L;
            c4230c.f13826r0 = j10;
        }
    }
}
