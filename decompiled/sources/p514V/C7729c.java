package p514V;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import io.sentry.android.core.AbstractC15256t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001A.C0063g0;
import p001A.C0067i0;
import p001A.RunnableC0066i;
import p001A.RunnableC0096x;
import p003A1.AbstractC0168G;
import p1138z.C21572a;
import p117Eb.C2392v;
import p178H.AbstractC3174u0;
import p178H.C3130X;
import p178H.C3170s0;
import p178H.C3175v;
import p228J.AbstractC3794B0;
import p228J.AbstractC3842j;
import p228J.C3799E;
import p228J.C3825a0;
import p228J.C3828c;
import p228J.C3835f0;
import p228J.C3836g;
import p228J.C3857q0;
import p228J.C3859r0;
import p228J.C3865u0;
import p228J.InterfaceC3798D0;
import p228J.InterfaceC3800E0;
import p228J.InterfaceC3805H;
import p228J.InterfaceC3806H0;
import p228J.InterfaceC3816S;
import p228J.InterfaceC3818U;
import p228J.InterfaceC3866v;
import p228J.InterfaceC3870x;
import p239Ja.C4307j;
import p253K.AbstractC4491b;
import p253K.AbstractC4503n;
import p283L5.AbstractC4941g;
import p329N3.RunnableC5611a;
import p414R.C6771e;
import p414R.C6778l;
import p414R.C6781o;
import p414R.C6782p;
import p414R.InterfaceC6780n;
import p439S.C6970a;
import p439S.C6971b;
import p439S.C6974e;
import p465T.C7166b;
import p523V9.AbstractC8072d6;
import p544W9.AbstractC8488H2;
import p658b5.C11242m;
import p817j$.util.DesugarCollections;
import p817j$.util.Objects;

/* JADX INFO: renamed from: V.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7729c extends AbstractC3174u0 {

    /* JADX INFO: renamed from: A */
    public C3859r0 f24366A;

    /* JADX INFO: renamed from: o */
    public final C7731e f24367o;

    /* JADX INFO: renamed from: p */
    public final C7733g f24368p;

    /* JADX INFO: renamed from: q */
    public final C3130X f24369q;

    /* JADX INFO: renamed from: r */
    public final C3130X f24370r;

    /* JADX INFO: renamed from: s */
    public C11242m f24371s;

    /* JADX INFO: renamed from: t */
    public C2392v f24372t;

    /* JADX INFO: renamed from: u */
    public C6778l f24373u;

    /* JADX INFO: renamed from: v */
    public C6778l f24374v;

    /* JADX INFO: renamed from: w */
    public C6778l f24375w;

    /* JADX INFO: renamed from: x */
    public C6778l f24376x;

    /* JADX INFO: renamed from: y */
    public C3857q0 f24377y;

    /* JADX INFO: renamed from: z */
    public C3857q0 f24378z;

    public C7729c(InterfaceC3870x interfaceC3870x, InterfaceC3870x interfaceC3870x2, C3130X c3130x, C3130X c3130x2, HashSet hashSet, C0067i0 c0067i0) {
        super(m7991G(hashSet));
        this.f24367o = m7991G(hashSet);
        this.f24369q = c3130x;
        this.f24370r = c3130x2;
        this.f24368p = new C7733g(interfaceC3870x, interfaceC3870x2, hashSet, c0067i0, new C4307j(this, 7));
    }

    /* JADX INFO: renamed from: F */
    public static ArrayList m7990F(AbstractC3174u0 abstractC3174u0) {
        ArrayList arrayList = new ArrayList();
        if (abstractC3174u0 instanceof C7729c) {
            Iterator it = ((C7729c) abstractC3174u0).f24368p.f24387Y.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC3174u0) it.next()).f9565f.mo31D());
            }
        } else {
            arrayList.add(abstractC3174u0.f9565f.mo31D());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: G */
    public static C7731e m7991G(HashSet hashSet) {
        C3825a0 c3825a0M4558d = C3825a0.m4558d();
        new C7730d(c3825a0M4558d);
        c3825a0M4558d.m4561x(InterfaceC3816S.f11560j, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractC3174u0 abstractC3174u0 = (AbstractC3174u0) it.next();
            if (abstractC3174u0.f9565f.mo37O(InterfaceC3800E0.f11493G)) {
                arrayList.add(abstractC3174u0.f9565f.mo31D());
            } else {
                AbstractC15256t.m16465c("StreamSharing", "A child does not have capture type.");
            }
        }
        c3825a0M4558d.m4561x(C7731e.f24381Z, arrayList);
        c3825a0M4558d.m4561x(InterfaceC3818U.f11566o, 2);
        return new C7731e(C3835f0.m4568a(c3825a0M4558d));
    }

    /* JADX INFO: renamed from: B */
    public final void m7992B() {
        C3859r0 c3859r0 = this.f24366A;
        if (c3859r0 != null) {
            c3859r0.m4587b();
            this.f24366A = null;
        }
        C6778l c6778l = this.f24373u;
        if (c6778l != null) {
            c6778l.m7224b();
            this.f24373u = null;
        }
        C6778l c6778l2 = this.f24374v;
        if (c6778l2 != null) {
            c6778l2.m7224b();
            this.f24374v = null;
        }
        C6778l c6778l3 = this.f24375w;
        if (c6778l3 != null) {
            c6778l3.m7224b();
            this.f24375w = null;
        }
        C6778l c6778l4 = this.f24376x;
        if (c6778l4 != null) {
            c6778l4.m7224b();
            this.f24376x = null;
        }
        C11242m c11242m = this.f24371s;
        if (c11242m != null) {
            ((C6771e) c11242m.f34018Y).release();
            AbstractC8488H2.m9142c(new RunnableC5611a(c11242m, 6));
            this.f24371s = null;
        }
        C2392v c2392v = this.f24372t;
        if (c2392v != null) {
            ((InterfaceC6780n) c2392v.f7436Z).release();
            AbstractC8488H2.m9142c(new RunnableC5611a(c2392v, 9));
            this.f24372t = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    public final List m7993C(String str, String str2, InterfaceC3800E0 interfaceC3800E0, C3836g c3836g, C3836g c3836g2) {
        AbstractC8488H2.m9140a();
        C7733g c7733g = this.f24368p;
        int i10 = 0;
        if (c3836g2 == null) {
            m7994D(str, str2, interfaceC3800E0, c3836g, null);
            InterfaceC3870x interfaceC3870xM4009b = m4009b();
            Objects.requireNonNull(interfaceC3870xM4009b);
            C6771e c6771e = new C6771e(c3836g.f11607b);
            C11242m c11242m = new C11242m();
            c11242m.f34019Z = interfaceC3870xM4009b;
            c11242m.f34018Y = c6771e;
            this.f24371s = c11242m;
            boolean z6 = this.f9568i != null;
            C6778l c6778l = this.f24375w;
            int iMo4541B = ((InterfaceC3818U) this.f9565f).mo4541B();
            c7733g.getClass();
            HashMap map = new HashMap();
            for (AbstractC3174u0 abstractC3174u0 : c7733g.f24387Y) {
                map.put(abstractC3174u0, c7733g.m7999c(abstractC3174u0, c7733g.f24397w0, c7733g.f24392r0, c6778l, iMo4541B, z6));
                i10 = i10;
            }
            int i11 = i10;
            C11242m c11242m2 = this.f24371s;
            C6778l c6778l2 = this.f24375w;
            ArrayList<C7166b> arrayList = new ArrayList(map.values());
            if (c6778l2 == null) {
                throw new NullPointerException("Null surfaceEdge");
            }
            c11242m2.getClass();
            AbstractC8488H2.m9140a();
            c11242m2.f34020o0 = new C6782p();
            for (C7166b c7166b : arrayList) {
                C6782p c6782p = (C6782p) c11242m2.f34020o0;
                Rect rect = c7166b.f22777d;
                Matrix matrix = new Matrix(c6778l2.f21763b);
                RectF rectF = new RectF(rect);
                RectF rectF2 = AbstractC4503n.f14693a;
                float f10 = i11;
                Size size = c7166b.f22778e;
                RectF rectF3 = new RectF(f10, f10, size.getWidth(), size.getHeight());
                int i12 = c7166b.f22779f;
                boolean z10 = c7166b.f22780g;
                matrix.postConcat(AbstractC4503n.m5245a(rectF, rectF3, i12, z10));
                AbstractC4941g.m5555N(AbstractC4503n.m5248d(AbstractC4503n.m5250f(AbstractC4503n.m5249e(rect), i12), false, size));
                Rect rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
                C2392v c2392vM4569a = c6778l2.f21768g.m4569a();
                c2392vM4569a.f7436Z = size;
                c6782p.put(c7166b, new C6778l(c7166b.f22775b, c7166b.f22776c, c2392vM4569a.m3557n(), matrix, false, rect2, c6778l2.f21770i - i12, -1, c6778l2.f21766e != z10));
                i11 = 0;
            }
            ((C6771e) c11242m2.f34018Y).mo7201a(c6778l2.m7225c((InterfaceC3870x) c11242m2.f34019Z, true));
            for (Map.Entry entry : ((C6782p) c11242m2.f34020o0).entrySet()) {
                c11242m2.m12615t(c6778l2, entry);
                C6778l c6778l3 = (C6778l) entry.getValue();
                RunnableC0066i runnableC0066i = new RunnableC0066i(c11242m2, c6778l2, entry, 13);
                c6778l3.getClass();
                AbstractC8488H2.m9140a();
                c6778l3.m7223a();
                c6778l3.f21774m.add(runnableC0066i);
            }
            c6778l2.f21776o.add(new C6781o((C6782p) c11242m2.f34020o0, 0));
            C6782p c6782p2 = (C6782p) c11242m2.f34020o0;
            HashMap map2 = new HashMap();
            for (Map.Entry entry2 : map.entrySet()) {
                map2.put((AbstractC3174u0) entry2.getKey(), (C6778l) c6782p2.get(entry2.getValue()));
            }
            c7733g.m8001u(map2);
            Object[] objArr = {this.f24377y.m4586c()};
            ArrayList arrayList2 = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList2.add(obj);
            return DesugarCollections.unmodifiableList(arrayList2);
        }
        m7994D(str, str2, interfaceC3800E0, c3836g, c3836g2);
        Matrix matrix2 = this.f9569j;
        InterfaceC3870x interfaceC3870xM4014h = m4014h();
        Objects.requireNonNull(interfaceC3870xM4014h);
        boolean zMo120p = interfaceC3870xM4014h.mo120p();
        Rect rect3 = this.f9568i;
        if (rect3 == null) {
            Size size2 = c3836g2.f11606a;
            rect3 = new Rect(0, 0, size2.getWidth(), size2.getHeight());
        }
        InterfaceC3870x interfaceC3870xM4014h2 = m4014h();
        Objects.requireNonNull(interfaceC3870xM4014h2);
        int iM4013g = m4013g(interfaceC3870xM4014h2, false);
        InterfaceC3870x interfaceC3870xM4014h3 = m4014h();
        Objects.requireNonNull(interfaceC3870xM4014h3);
        C6778l c6778l4 = new C6778l(3, 34, c3836g2, matrix2, zMo120p, rect3, iM4013g, -1, m4015k(interfaceC3870xM4014h3));
        this.f24374v = c6778l4;
        Objects.requireNonNull(m4014h());
        this.f24376x = c6778l4;
        C3857q0 c3857q0M7995E = m7995E(this.f24374v, interfaceC3800E0, c3836g2);
        this.f24378z = c3857q0M7995E;
        C3859r0 c3859r0 = this.f24366A;
        if (c3859r0 != null) {
            c3859r0.m4587b();
        }
        boolean z11 = false;
        boolean z12 = true;
        char c9 = 2;
        C3859r0 c3859r1 = new C3859r0(new C7728b(this, str, str2, interfaceC3800E0, c3836g, c3836g2));
        this.f24366A = c3859r1;
        c3857q0M7995E.f11660f = c3859r1;
        this.f24372t = new C2392v(m4009b(), m4014h(), new C6974e(c3836g.f11607b, this.f24369q, this.f24370r));
        boolean z13 = this.f9568i != null;
        C6778l c6778l5 = this.f24375w;
        C6778l c6778l6 = this.f24376x;
        int iMo4541B2 = ((InterfaceC3818U) this.f9565f).mo4541B();
        c7733g.getClass();
        HashMap map3 = new HashMap();
        Iterator it = c7733g.f24387Y.iterator();
        while (it.hasNext()) {
            AbstractC3174u0 abstractC3174u1 = (AbstractC3174u0) it.next();
            C7166b c7166bM7999c = c7733g.m7999c(abstractC3174u1, c7733g.f24397w0, c7733g.f24392r0, c6778l5, iMo4541B2, z13);
            InterfaceC3870x interfaceC3870x = c7733g.f24393s0;
            Objects.requireNonNull(interfaceC3870x);
            map3.put(abstractC3174u1, new C6970a(c7166bM7999c, c7733g.m7999c(abstractC3174u1, c7733g.f24398x0, interfaceC3870x, c6778l6, iMo4541B2, z13)));
            it = it;
            c9 = 2;
            z12 = true;
            z11 = false;
        }
        C2392v c2392v = this.f24372t;
        C6971b c6971b = new C6971b(this.f24375w, this.f24376x, new ArrayList(map3.values()));
        c2392v.getClass();
        AbstractC8488H2.m9140a();
        c2392v.f7440r0 = c6971b;
        c2392v.f7439q0 = new C6782p();
        C6971b c6971b2 = (C6971b) c2392v.f7440r0;
        C6778l c6778l7 = c6971b2.f22283a;
        for (C6970a c6970a : c6971b2.f22285c) {
            C6782p c6782p3 = (C6782p) c2392v.f7439q0;
            C7166b c7166b2 = c6970a.f22281a;
            Matrix matrix3 = new Matrix();
            Size sizeM5249e = AbstractC4503n.m5249e(c7166b2.f22777d);
            int i13 = c7166b2.f22779f;
            Size sizeM5250f = AbstractC4503n.m5250f(sizeM5249e, i13);
            Size size3 = c7166b2.f22778e;
            AbstractC4941g.m5555N(AbstractC4503n.m5248d(sizeM5250f, false, size3));
            Rect rect4 = new Rect(0, 0, size3.getWidth(), size3.getHeight());
            C2392v c2392vM4569a2 = c6778l7.f21768g.m4569a();
            c2392vM4569a2.f7436Z = size3;
            c6782p3.put(c6970a, new C6778l(c7166b2.f22775b, c7166b2.f22776c, c2392vM4569a2.m3557n(), matrix3, false, rect4, c6778l7.f21770i - i13, -1, c6778l7.f21766e != c7166b2.f22780g));
        }
        C3170s0 c3170s0M7225c = c6778l7.m7225c((InterfaceC3870x) c2392v.f7437o0, true);
        InterfaceC6780n interfaceC6780n = (InterfaceC6780n) c2392v.f7436Z;
        interfaceC6780n.mo7201a(c3170s0M7225c);
        C6778l c6778l8 = c6971b2.f22284b;
        interfaceC6780n.mo7201a(c6778l8.m7225c((InterfaceC3870x) c2392v.f7438p0, false));
        for (Map.Entry entry3 : ((C6782p) c2392v.f7439q0).entrySet()) {
            InterfaceC3870x interfaceC3870x2 = (InterfaceC3870x) c2392v.f7437o0;
            InterfaceC3870x interfaceC3870x3 = (InterfaceC3870x) c2392v.f7438p0;
            c2392v.m3559p(interfaceC3870x2, interfaceC3870x3, c6778l7, c6778l8, entry3);
            C6778l c6778l9 = (C6778l) entry3.getValue();
            RunnableC0096x runnableC0096x = new RunnableC0096x(c2392v, interfaceC3870x2, interfaceC3870x3, c6778l7, c6778l8, entry3, 1);
            c6778l9.getClass();
            AbstractC8488H2.m9140a();
            c6778l9.m7223a();
            c6778l9.f21774m.add(runnableC0096x);
        }
        C6782p c6782p4 = (C6782p) c2392v.f7439q0;
        HashMap map4 = new HashMap();
        for (Map.Entry entry4 : map3.entrySet()) {
            map4.put((AbstractC3174u0) entry4.getKey(), (C6778l) c6782p4.get(entry4.getValue()));
        }
        c7733g.m8001u(map4);
        Object[] objArr2 = {this.f24377y.m4586c(), this.f24378z.m4586c()};
        ArrayList arrayList3 = new ArrayList(2);
        for (int i14 = 0; i14 < 2; i14++) {
            Object obj2 = objArr2[i14];
            Objects.requireNonNull(obj2);
            arrayList3.add(obj2);
        }
        return DesugarCollections.unmodifiableList(arrayList3);
    }

    /* JADX INFO: renamed from: D */
    public final void m7994D(String str, String str2, InterfaceC3800E0 interfaceC3800E0, C3836g c3836g, C3836g c3836g2) {
        Matrix matrix = this.f9569j;
        InterfaceC3870x interfaceC3870xM4009b = m4009b();
        Objects.requireNonNull(interfaceC3870xM4009b);
        boolean zMo120p = interfaceC3870xM4009b.mo120p();
        Size size = c3836g.f11606a;
        Rect rect = this.f9568i;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        Rect rect2 = rect;
        InterfaceC3870x interfaceC3870xM4009b2 = m4009b();
        Objects.requireNonNull(interfaceC3870xM4009b2);
        int iM4013g = m4013g(interfaceC3870xM4009b2, false);
        InterfaceC3870x interfaceC3870xM4009b3 = m4009b();
        Objects.requireNonNull(interfaceC3870xM4009b3);
        C6778l c6778l = new C6778l(3, 34, c3836g, matrix, zMo120p, rect2, iM4013g, -1, m4015k(interfaceC3870xM4009b3));
        this.f24373u = c6778l;
        Objects.requireNonNull(m4009b());
        this.f24375w = c6778l;
        C3857q0 c3857q0M7995E = m7995E(this.f24373u, interfaceC3800E0, c3836g);
        this.f24377y = c3857q0M7995E;
        C3859r0 c3859r0 = this.f24366A;
        if (c3859r0 != null) {
            c3859r0.m4587b();
        }
        C3859r0 c3859r1 = new C3859r0(new C7728b(this, str, str2, interfaceC3800E0, c3836g, c3836g2));
        this.f24366A = c3859r1;
        c3857q0M7995E.f11660f = c3859r1;
    }

    /* JADX INFO: renamed from: E */
    public final C3857q0 m7995E(C6778l c6778l, InterfaceC3800E0 interfaceC3800E0, C3836g c3836g) {
        C3857q0 c3857q0M4583d = C3857q0.m4583d(interfaceC3800E0, c3836g.f11606a);
        C7733g c7733g = this.f24368p;
        Iterator it = c7733g.f24387Y.iterator();
        int i10 = -1;
        while (it.hasNext()) {
            int i11 = ((AbstractC3174u0) it.next()).f9565f.mo45l().f11683g.f11484c;
            Integer numValueOf = Integer.valueOf(i10);
            List list = C3865u0.f11676i;
            if (list.indexOf(numValueOf) < list.indexOf(Integer.valueOf(i11))) {
                i10 = i11;
            }
        }
        C0063g0 c0063g0 = c3857q0M4583d.f11656b;
        if (i10 != -1) {
            c0063g0.f283a = i10;
        }
        Iterator it2 = c7733g.f24387Y.iterator();
        while (it2.hasNext()) {
            C3865u0 c3865u0M4586c = C3857q0.m4583d(((AbstractC3174u0) it2.next()).f9565f, c3836g.f11606a).m4586c();
            C3799E c3799e = c3865u0M4586c.f11683g;
            c0063g0.m241a(c3799e.f11486e);
            for (AbstractC3842j abstractC3842j : c3865u0M4586c.f11681e) {
                c0063g0.m242b(abstractC3842j);
                ArrayList arrayList = c3857q0M4583d.f11659e;
                if (!arrayList.contains(abstractC3842j)) {
                    arrayList.add(abstractC3842j);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback : c3865u0M4586c.f11680d) {
                ArrayList arrayList2 = c3857q0M4583d.f11658d;
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraDevice.StateCallback stateCallback2 : c3865u0M4586c.f11679c) {
                ArrayList arrayList3 = c3857q0M4583d.f11657c;
                if (!arrayList3.contains(stateCallback2)) {
                    arrayList3.add(stateCallback2);
                }
            }
            c0063g0.m243c(c3799e.f11483b);
        }
        c6778l.getClass();
        AbstractC8488H2.m9140a();
        c6778l.m7223a();
        AbstractC4941g.m5559R("Consumer can only be linked once.", !c6778l.f21771j);
        c6778l.f21771j = true;
        c3857q0M4583d.m4585b(c6778l.f21773l, c3836g.f11607b, -1);
        c0063g0.m242b(c7733g.f24394t0);
        C21572a c21572a = c3836g.f11609d;
        if (c21572a != null) {
            c0063g0.m243c(c21572a);
        }
        return c3857q0M4583d;
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: e */
    public final InterfaceC3800E0 mo3936e(boolean z6, InterfaceC3806H0 interfaceC3806H0) {
        C7731e c7731e = this.f24367o;
        c7731e.getClass();
        InterfaceC3805H interfaceC3805HMo248a = interfaceC3806H0.mo248a(AbstractC3794B0.m4476a(c7731e), 1);
        if (z6) {
            interfaceC3805HMo248a = AbstractC0168G.m509D(interfaceC3805HMo248a, c7731e.f24382Y);
        }
        if (interfaceC3805HMo248a == null) {
            return null;
        }
        return ((C7730d) mo3937j(interfaceC3805HMo248a)).mo3781x();
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: i */
    public final Set mo3961i() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: j */
    public final InterfaceC3798D0 mo3937j(InterfaceC3805H interfaceC3805H) {
        return new C7730d(C3825a0.m4559o(interfaceC3805H));
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: p */
    public final void mo3938p() {
        C7733g c7733g = this.f24368p;
        for (AbstractC3174u0 abstractC3174u0 : c7733g.f24387Y) {
            C7732f c7732f = (C7732f) c7733g.f24389o0.get(abstractC3174u0);
            Objects.requireNonNull(c7732f);
            abstractC3174u0.m4008a(c7732f, null, null, abstractC3174u0.mo3936e(true, c7733g.f24391q0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0165  */
    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: r */
    public final InterfaceC3800E0 mo3939r(InterfaceC3866v interfaceC3866v, InterfaceC3798D0 interfaceC3798D0) {
        Object objMo39b;
        ArrayList arrayList;
        Iterator it;
        Rational rational;
        C3825a0 c3825a0Mo3780o = interfaceC3798D0.mo3780o();
        C7733g c7733g = this.f24368p;
        C7727a c7727a = c7733g.f24397w0;
        List listMo146k = c7727a.f24358f.mo146k(34);
        HashSet<InterfaceC3800E0> hashSet = c7727a.f24356d;
        for (InterfaceC3800E0 interfaceC3800E0 : hashSet) {
            if (!interfaceC3800E0.mo48p() && (interfaceC3800E0 instanceof InterfaceC3818U)) {
                ((InterfaceC3818U) interfaceC3800E0).mo4551s();
            }
        }
        C3828c c3828c = InterfaceC3818U.f11570s;
        c3825a0Mo3780o.getClass();
        C3175v c3175v = null;
        try {
            objMo39b = c3825a0Mo3780o.mo39b(c3828c);
            while (true) {
                boolean zHasNext = it.hasNext();
                rational = c7727a.f24355c;
                if (!zHasNext) {
                    break;
                }
                if (!AbstractC4491b.m5220a(rational, (Size) it.next())) {
                    arrayList.addAll(c7727a.m7989f(c7727a.f24354b, listMo146k, false));
                    break;
                }
            }
        } catch (IllegalArgumentException unused) {
            objMo39b = null;
        }
        List list = (List) objMo39b;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    listMo146k = new ArrayList();
                    break;
                }
                Pair pair = (Pair) it2.next();
                if (((Integer) pair.first).equals(34)) {
                    listMo146k = Arrays.asList((Size[]) pair.second);
                    break;
                }
            }
        }
        arrayList = new ArrayList();
        HashSet hashSet2 = new HashSet();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            hashSet2.addAll(c7727a.m7986b((InterfaceC3800E0) it3.next()));
        }
        it = hashSet2.iterator();
        arrayList.addAll(c7727a.m7989f(rational, listMo146k, false));
        arrayList.addAll(c7727a.m7988e(listMo146k, false));
        if (arrayList.isEmpty()) {
            AbstractC8072d6.m8492i("ResolutionsMerger", "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
            arrayList.addAll(c7727a.m7988e(listMo146k, true));
        }
        AbstractC8072d6.m8486c("ResolutionsMerger", "Parent resolutions: " + arrayList);
        c3825a0Mo3780o.m4561x(InterfaceC3818U.f11572u, arrayList);
        C3828c c3828c2 = InterfaceC3800E0.f11500z;
        HashSet hashSet3 = c7733g.f24395u0;
        Iterator it4 = hashSet3.iterator();
        int iMax = 0;
        while (it4.hasNext()) {
            iMax = Math.max(iMax, ((InterfaceC3800E0) it4.next()).mo46m());
        }
        c3825a0Mo3780o.m4561x(c3828c2, Integer.valueOf(iMax));
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet3.iterator();
        while (it5.hasNext()) {
            arrayList2.add(((InterfaceC3800E0) it5.next()).mo40c());
        }
        if (!arrayList2.isEmpty()) {
            C3175v c3175v2 = (C3175v) arrayList2.get(0);
            Integer numValueOf = Integer.valueOf(c3175v2.f9581a);
            Integer numValueOf2 = Integer.valueOf(c3175v2.f9582b);
            int i10 = 1;
            while (true) {
                if (i10 >= arrayList2.size()) {
                    c3175v = new C3175v(numValueOf.intValue(), numValueOf2.intValue());
                    break;
                }
                C3175v c3175v3 = (C3175v) arrayList2.get(i10);
                Integer numValueOf3 = Integer.valueOf(c3175v3.f9581a);
                if (numValueOf.equals(0)) {
                    numValueOf = numValueOf3;
                } else if (!numValueOf3.equals(0)) {
                    if (numValueOf.equals(2) && !numValueOf3.equals(1)) {
                        numValueOf = numValueOf3;
                    } else if ((!numValueOf3.equals(2) || numValueOf.equals(1)) && !numValueOf.equals(numValueOf3)) {
                        numValueOf = null;
                    }
                }
                Integer numValueOf4 = Integer.valueOf(c3175v3.f9582b);
                if (numValueOf2.equals(0)) {
                    numValueOf2 = numValueOf4;
                } else if (!numValueOf4.equals(0) && !numValueOf2.equals(numValueOf4)) {
                    numValueOf2 = null;
                }
                if (numValueOf == null || numValueOf2 == null) {
                    break;
                }
                i10++;
            }
        }
        if (c3175v == null) {
            throw new IllegalArgumentException("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
        }
        c3825a0Mo3780o.m4561x(InterfaceC3816S.f11561k, c3175v);
        for (AbstractC3174u0 abstractC3174u0 : c7733g.f24387Y) {
            if (abstractC3174u0.f9565f.mo32E() != 0) {
                c3825a0Mo3780o.m4561x(InterfaceC3800E0.f11495J, Integer.valueOf(abstractC3174u0.f9565f.mo32E()));
            }
            if (abstractC3174u0.f9565f.mo35K() != 0) {
                c3825a0Mo3780o.m4561x(InterfaceC3800E0.f11494H, Integer.valueOf(abstractC3174u0.f9565f.mo35K()));
            }
        }
        return interfaceC3798D0.mo3781x();
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: s */
    public final void mo4020s() {
        for (AbstractC3174u0 abstractC3174u0 : this.f24368p.f24387Y) {
            abstractC3174u0.mo4020s();
            abstractC3174u0.mo3962q();
        }
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: t */
    public final void mo3963t() {
        Iterator it = this.f24368p.f24387Y.iterator();
        while (it.hasNext()) {
            ((AbstractC3174u0) it.next()).mo3963t();
        }
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: u */
    public final C3836g mo3940u(C21572a c21572a) {
        this.f24377y.m4584a(c21572a);
        Object[] objArr = {this.f24377y.m4586c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        m4007A(DesugarCollections.unmodifiableList(arrayList));
        C2392v c2392vM4569a = this.f9566g.m4569a();
        c2392vM4569a.f7439q0 = c21572a;
        return c2392vM4569a.m3557n();
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: v */
    public final C3836g mo3941v(C3836g c3836g, C3836g c3836g2) {
        m4007A(m7993C(m4011d(), m4014h() == null ? null : m4014h().mo122r().mo137b(), this.f9565f, c3836g, c3836g2));
        m4017m();
        return c3836g;
    }

    @Override // p178H.AbstractC3174u0
    /* JADX INFO: renamed from: w */
    public final void mo3942w() {
        m7992B();
        C7733g c7733g = this.f24368p;
        for (AbstractC3174u0 abstractC3174u0 : c7733g.f24387Y) {
            C7732f c7732f = (C7732f) c7733g.f24389o0.get(abstractC3174u0);
            Objects.requireNonNull(c7732f);
            abstractC3174u0.m4021z(c7732f);
        }
    }
}
