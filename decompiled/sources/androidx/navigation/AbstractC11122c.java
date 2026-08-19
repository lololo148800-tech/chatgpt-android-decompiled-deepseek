package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.EnumC11104m;
import androidx.lifecycle.InterfaceC11112u;
import androidx.lifecycle.ViewModelStore;
import io.sentry.android.core.AbstractC15256t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16556x;
import kotlin.jvm.internal.C16558z;
import mm.C17309l;
import p002A0.C0102A;
import p006A4.C0362w;
import p077Cn.EnumC1733a;
import p103Dn.AbstractC2124C;
import p103Dn.C2127D0;
import p103Dn.C2153Q0;
import p103Dn.C2217y0;
import p1070w.C20694c;
import p1071w0.C20699B;
import p1071w0.C20714I0;
import p1071w0.C20720L0;
import p1091wn.AbstractC21031l;
import p1091wn.C21025f;
import p1143z4.AbstractC21767I;
import p1143z4.AbstractC21769K;
import p1143z4.AbstractC21790t;
import p1143z4.C21759A;
import p1143z4.C21770L;
import p1143z4.C21772b;
import p1143z4.C21773c;
import p1143z4.C21776f;
import p1143z4.C21778h;
import p1143z4.C21779i;
import p1143z4.C21780j;
import p1143z4.C21782l;
import p1143z4.C21787q;
import p1143z4.C21789s;
import p1143z4.C21792v;
import p1143z4.C21794x;
import p1143z4.C21795y;
import p1143z4.InterfaceC21774d;
import p1143z4.InterfaceC21781k;
import p183H4.C3228c;
import p404Qe.C6665a;
import p523V9.AbstractC8127k5;
import p544W9.AbstractC8634g;
import p544W9.AbstractC8640h;
import p544W9.AbstractC8646i;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9306j0;
import p571X9.AbstractC9393x3;
import p588Y2.C9597A;
import p658b5.C11238i;
import p846k4.C16340i;
import p896n2.C17447A;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17686t;
import p909nm.C17677k;
import p909nm.C17689w;

/* JADX INFO: renamed from: androidx.navigation.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11122c {

    /* JADX INFO: renamed from: E */
    public static boolean f33524E = true;

    /* JADX INFO: renamed from: A */
    public final LinkedHashMap f33525A;

    /* JADX INFO: renamed from: B */
    public int f33526B;

    /* JADX INFO: renamed from: C */
    public final ArrayList f33527C;

    /* JADX INFO: renamed from: D */
    public final C2127D0 f33528D;

    /* JADX INFO: renamed from: a */
    public final Context f33529a;

    /* JADX INFO: renamed from: b */
    public final Activity f33530b;

    /* JADX INFO: renamed from: c */
    public C21792v f33531c;

    /* JADX INFO: renamed from: d */
    public Bundle f33532d;

    /* JADX INFO: renamed from: e */
    public Parcelable[] f33533e;

    /* JADX INFO: renamed from: f */
    public boolean f33534f;

    /* JADX INFO: renamed from: g */
    public final C17677k f33535g;

    /* JADX INFO: renamed from: h */
    public final C2153Q0 f33536h;

    /* JADX INFO: renamed from: i */
    public final C2217y0 f33537i;

    /* JADX INFO: renamed from: j */
    public final C2153Q0 f33538j;

    /* JADX INFO: renamed from: k */
    public final C2217y0 f33539k;

    /* JADX INFO: renamed from: l */
    public final LinkedHashMap f33540l;

    /* JADX INFO: renamed from: m */
    public final LinkedHashMap f33541m;

    /* JADX INFO: renamed from: n */
    public final LinkedHashMap f33542n;

    /* JADX INFO: renamed from: o */
    public final LinkedHashMap f33543o;

    /* JADX INFO: renamed from: p */
    public InterfaceC11112u f33544p;

    /* JADX INFO: renamed from: q */
    public NavControllerViewModel f33545q;

    /* JADX INFO: renamed from: r */
    public final CopyOnWriteArrayList f33546r;

    /* JADX INFO: renamed from: s */
    public EnumC11104m f33547s;

    /* JADX INFO: renamed from: t */
    public final C3228c f33548t;

    /* JADX INFO: renamed from: u */
    public final C9597A f33549u;

    /* JADX INFO: renamed from: v */
    public final boolean f33550v;

    /* JADX INFO: renamed from: w */
    public final C21770L f33551w;

    /* JADX INFO: renamed from: x */
    public final LinkedHashMap f33552x;

    /* JADX INFO: renamed from: y */
    public AbstractC16546n f33553y;

    /* JADX INFO: renamed from: z */
    public C0102A f33554z;

    public AbstractC11122c(Context context) {
        AbstractC16544l.m18094g(context, "context");
        this.f33529a = context;
        for (Object obj : AbstractC21031l.m21492p(C21772b.f69056o0, context)) {
            if (((Context) obj) instanceof Activity) {
                this.f33530b = (Activity) obj;
                this.f33535g = new C17677k();
                C17689w c17689w = C17689w.f56480Y;
                C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(c17689w);
                this.f33536h = c2153q0M3204c;
                this.f33537i = new C2217y0(c2153q0M3204c);
                C2153Q0 c2153q0M3204c2 = AbstractC2124C.m3204c(c17689w);
                this.f33538j = c2153q0M3204c2;
                this.f33539k = new C2217y0(c2153q0M3204c2);
                this.f33540l = new LinkedHashMap();
                this.f33541m = new LinkedHashMap();
                this.f33542n = new LinkedHashMap();
                this.f33543o = new LinkedHashMap();
                this.f33546r = new CopyOnWriteArrayList();
                this.f33547s = EnumC11104m.f33475Z;
                this.f33548t = new C3228c(this, 2);
                this.f33549u = new C9597A(this, 3);
                this.f33550v = true;
                C21770L c21770l = new C21770L();
                this.f33551w = c21770l;
                this.f33552x = new LinkedHashMap();
                this.f33525A = new LinkedHashMap();
                c21770l.m22261a(new C21794x(c21770l));
                c21770l.m22261a(new C21773c(this.f33529a));
                this.f33527C = new ArrayList();
                AbstractC9227W.m9800c(new C20714I0(this, 14));
                this.f33528D = AbstractC2124C.m3203b(1, 0, EnumC1733a.f4962Z, 2);
            }
        }
        obj = null;
        this.f33530b = (Activity) obj;
        this.f33535g = new C17677k();
        C17689w c17689w2 = C17689w.f56480Y;
        C2153Q0 c2153q0M3204c3 = AbstractC2124C.m3204c(c17689w2);
        this.f33536h = c2153q0M3204c3;
        this.f33537i = new C2217y0(c2153q0M3204c3);
        C2153Q0 c2153q0M3204c4 = AbstractC2124C.m3204c(c17689w2);
        this.f33538j = c2153q0M3204c4;
        this.f33539k = new C2217y0(c2153q0M3204c4);
        this.f33540l = new LinkedHashMap();
        this.f33541m = new LinkedHashMap();
        this.f33542n = new LinkedHashMap();
        this.f33543o = new LinkedHashMap();
        this.f33546r = new CopyOnWriteArrayList();
        this.f33547s = EnumC11104m.f33475Z;
        this.f33548t = new C3228c(this, 2);
        this.f33549u = new C9597A(this, 3);
        this.f33550v = true;
        C21770L c21770l2 = new C21770L();
        this.f33551w = c21770l2;
        this.f33552x = new LinkedHashMap();
        this.f33525A = new LinkedHashMap();
        c21770l2.m22261a(new C21794x(c21770l2));
        c21770l2.m22261a(new C21773c(this.f33529a));
        this.f33527C = new ArrayList();
        AbstractC9227W.m9800c(new C20714I0(this, 14));
        this.f33528D = AbstractC2124C.m3203b(1, 0, EnumC1733a.f4962Z, 2);
    }

    /* JADX INFO: renamed from: f */
    public static AbstractC21790t m12179f(AbstractC21790t abstractC21790t, int i10) {
        C21792v c21792v;
        if (abstractC21790t.f69135r0 == i10) {
            return abstractC21790t;
        }
        if (abstractC21790t instanceof C21792v) {
            c21792v = (C21792v) abstractC21790t;
        } else {
            c21792v = abstractC21790t.f69131Z;
            AbstractC16544l.m18091d(c21792v);
        }
        return c21792v.m22284s(i10, true);
    }

    /* JADX INFO: renamed from: q */
    public static void m12180q(AbstractC11122c abstractC11122c, String route, boolean z6) {
        Object objPrevious;
        boolean zM12185d;
        Object objMo5893a;
        Object objMo5893a2;
        boolean z10;
        abstractC11122c.getClass();
        AbstractC16544l.m18094g(route, "route");
        C17677k c17677k = abstractC11122c.f33535g;
        if (c17677k.isEmpty()) {
            zM12185d = false;
        } else {
            ArrayList arrayList = new ArrayList();
            ListIterator listIterator = c17677k.listIterator(c17677k.mo7371f());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                C21778h c21778h = (C21778h) objPrevious;
                AbstractC21790t abstractC21790t = c21778h.f69074Z;
                Bundle bundleM22263d = c21778h.m22263d();
                abstractC21790t.getClass();
                AbstractC16544l.m18094g(route, "route");
                if (AbstractC16544l.m18089b(abstractC21790t.f69136s0, route)) {
                    z10 = true;
                } else {
                    C21789s c21789sM22281p = abstractC21790t.m22281p(route);
                    if (abstractC21790t.equals(c21789sM22281p != null ? c21789sM22281p.f69123Y : null)) {
                        if (bundleM22263d != null) {
                            Bundle bundle = c21789sM22281p.f69124Z;
                            if (bundle != null) {
                                Set<String> setKeySet = bundle.keySet();
                                AbstractC16544l.m18093f(setKeySet, "matchingArgs.keySet()");
                                Iterator<T> it = setKeySet.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        String key = (String) it.next();
                                        if (bundleM22263d.containsKey(key)) {
                                            C21776f c21776f = (C21776f) c21789sM22281p.f69123Y.f69134q0.get(key);
                                            AbstractC21767I abstractC21767I = c21776f != null ? c21776f.f69067a : null;
                                            if (abstractC21767I != null) {
                                                AbstractC16544l.m18093f(key, "key");
                                                objMo5893a = abstractC21767I.mo5893a(key, bundle);
                                            } else {
                                                objMo5893a = null;
                                            }
                                            if (abstractC21767I != null) {
                                                AbstractC16544l.m18093f(key, "key");
                                                objMo5893a2 = abstractC21767I.mo5893a(key, bundleM22263d);
                                            } else {
                                                objMo5893a2 = null;
                                            }
                                            if (!AbstractC16544l.m18089b(objMo5893a, objMo5893a2)) {
                                            }
                                        }
                                    } else {
                                        z10 = true;
                                    }
                                }
                            }
                        } else {
                            c21789sM22281p.getClass();
                        }
                    }
                    z10 = false;
                }
                if (z6 || !z10) {
                    arrayList.add(abstractC11122c.f33551w.m22262b(c21778h.f69074Z.f69130Y));
                }
            } while (!z10);
            C21778h c21778h2 = (C21778h) objPrevious;
            AbstractC21790t abstractC21790t2 = c21778h2 != null ? c21778h2.f69074Z : null;
            if (abstractC21790t2 == null) {
                Log.i("NavController", "Ignoring popBackStack to route " + route + " as it was not found on the current back stack");
                zM12185d = false;
            } else {
                zM12185d = abstractC11122c.m12185d(arrayList, abstractC21790t2, z6, false);
            }
        }
        if (zM12185d) {
            abstractC11122c.m12184c();
        }
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m12181t(AbstractC11122c abstractC11122c, C21778h c21778h) {
        abstractC11122c.m12198s(c21778h, false, new C17677k());
    }

    /* JADX INFO: renamed from: a */
    public final void m12182a(AbstractC21790t abstractC21790t, Bundle bundle, C21778h c21778h, List list) {
        Object objPrevious;
        Object objPrevious2;
        AbstractC21790t abstractC21790t2 = c21778h.f69074Z;
        boolean z6 = abstractC21790t2 instanceof InterfaceC21774d;
        boolean z10 = true;
        C17677k c17677k = this.f33535g;
        if (!z6) {
            while (!c17677k.isEmpty() && (((C21778h) c17677k.last()).f69074Z instanceof InterfaceC21774d) && m12197r(((C21778h) c17677k.last()).f69074Z.f69135r0, true, false)) {
            }
        }
        C17677k<C21778h> c17677k2 = new C17677k();
        boolean z11 = abstractC21790t instanceof C21792v;
        Context context = this.f33529a;
        Object obj = null;
        if (z11) {
            AbstractC21790t abstractC21790t3 = abstractC21790t2;
            do {
                AbstractC16544l.m18091d(abstractC21790t3);
                abstractC21790t3 = abstractC21790t3.f69131Z;
                if (abstractC21790t3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious2 = null;
                            break;
                        }
                        objPrevious2 = listIterator.previous();
                    } while (!AbstractC16544l.m18089b(((C21778h) objPrevious2).f69074Z, abstractC21790t3));
                    C21778h c21778hM17935i = (C21778h) objPrevious2;
                    if (c21778hM17935i == null) {
                        c21778hM17935i = C16340i.m17935i(context, abstractC21790t3, bundle, m12191k(), this.f33545q);
                    }
                    c17677k2.addFirst(c21778hM17935i);
                    if (!c17677k.isEmpty() && ((C21778h) c17677k.last()).f69074Z == abstractC21790t3) {
                        m12181t(this, (C21778h) c17677k.last());
                    }
                }
                if (abstractC21790t3 == null) {
                    break;
                }
            } while (abstractC21790t3 != abstractC21790t);
        }
        AbstractC21790t abstractC21790t4 = c17677k2.isEmpty() ? abstractC21790t2 : ((C21778h) c17677k2.first()).f69074Z;
        while (abstractC21790t4 != null && m12186e(abstractC21790t4.f69135r0) != abstractC21790t4) {
            abstractC21790t4 = abstractC21790t4.f69131Z;
            if (abstractC21790t4 != null) {
                Bundle bundle2 = (bundle == null || bundle.isEmpty() != z10) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator2.previous();
                } while (!AbstractC16544l.m18089b(((C21778h) objPrevious).f69074Z, abstractC21790t4));
                C21778h c21778hM17935i2 = (C21778h) objPrevious;
                if (c21778hM17935i2 == null) {
                    c21778hM17935i2 = C16340i.m17935i(context, abstractC21790t4, abstractC21790t4.m22279j(bundle2), m12191k(), this.f33545q);
                }
                c17677k2.addFirst(c21778hM17935i2);
            }
            z10 = true;
        }
        if (!c17677k2.isEmpty()) {
            abstractC21790t2 = ((C21778h) c17677k2.first()).f69074Z;
        }
        while (!c17677k.isEmpty() && (((C21778h) c17677k.last()).f69074Z instanceof C21792v)) {
            AbstractC21790t abstractC21790t5 = ((C21778h) c17677k.last()).f69074Z;
            AbstractC16544l.m18092e(abstractC21790t5, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((C21792v) abstractC21790t5).m22284s(abstractC21790t2.f69135r0, false) != null) {
                break;
            } else {
                m12181t(this, (C21778h) c17677k.last());
            }
        }
        C21778h c21778h2 = (C21778h) c17677k.m19271q();
        if (c21778h2 == null) {
            c21778h2 = (C21778h) c17677k2.m19271q();
        }
        if (!AbstractC16544l.m18089b(c21778h2 != null ? c21778h2.f69074Z : null, this.f33531c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (listIterator3.hasPrevious()) {
                Object objPrevious3 = listIterator3.previous();
                AbstractC21790t abstractC21790t6 = ((C21778h) objPrevious3).f69074Z;
                C21792v c21792v = this.f33531c;
                AbstractC16544l.m18091d(c21792v);
                if (AbstractC16544l.m18089b(abstractC21790t6, c21792v)) {
                    obj = objPrevious3;
                    break;
                }
            }
            C21778h c21778hM17935i3 = (C21778h) obj;
            if (c21778hM17935i3 == null) {
                C21792v c21792v2 = this.f33531c;
                AbstractC16544l.m18091d(c21792v2);
                C21792v c21792v3 = this.f33531c;
                AbstractC16544l.m18091d(c21792v3);
                c21778hM17935i3 = C16340i.m17935i(context, c21792v2, c21792v3.m22279j(bundle), m12191k(), this.f33545q);
            }
            c17677k2.addFirst(c21778hM17935i3);
        }
        for (C21778h c21778h3 : c17677k2) {
            Object obj2 = this.f33552x.get(this.f33551w.m22262b(c21778h3.f69074Z.f69130Y));
            if (obj2 == null) {
                throw new IllegalStateException(AbstractC9306j0.m9891j(abstractC21790t.f69130Y, " should already be created", new StringBuilder("NavigatorBackStack for ")).toString());
            }
            ((C21780j) obj2).m22267a(c21778h3);
        }
        c17677k.addAll(c17677k2);
        c17677k.addLast(c21778h);
        for (C21778h c21778h4 : AbstractC17680n.m19362l0(c17677k2, c21778h)) {
            C21792v c21792v4 = c21778h4.f69074Z.f69131Z;
            if (c21792v4 != null) {
                m12193m(c21778h4, m12187g(c21792v4.f69135r0));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m12183b(InterfaceC21781k interfaceC21781k) {
        this.f33546r.add(interfaceC21781k);
        C17677k c17677k = this.f33535g;
        if (c17677k.isEmpty()) {
            return;
        }
        C21778h c21778h = (C21778h) c17677k.last();
        interfaceC21781k.mo1946a(this, c21778h.f69074Z, c21778h.m22263d());
    }

    /* JADX INFO: renamed from: c */
    public final boolean m12184c() {
        C17677k c17677k;
        while (true) {
            c17677k = this.f33535g;
            if (c17677k.isEmpty() || !(((C21778h) c17677k.last()).f69074Z instanceof C21792v)) {
                break;
            }
            m12181t(this, (C21778h) c17677k.last());
        }
        C21778h c21778h = (C21778h) c17677k.m19273s();
        ArrayList arrayList = this.f33527C;
        if (c21778h != null) {
            arrayList.add(c21778h);
        }
        this.f33526B++;
        m12202x();
        int i10 = this.f33526B - 1;
        this.f33526B = i10;
        if (i10 == 0) {
            ArrayList<C21778h> arrayListM19323D0 = AbstractC17680n.m19323D0(arrayList);
            arrayList.clear();
            for (C21778h c21778h2 : arrayListM19323D0) {
                Iterator it = this.f33546r.iterator();
                while (it.hasNext()) {
                    ((InterfaceC21781k) it.next()).mo1946a(this, c21778h2.f69074Z, c21778h2.m22263d());
                }
                this.f33528D.mo3231f(c21778h2);
            }
            ArrayList arrayListM19323D1 = AbstractC17680n.m19323D0(c17677k);
            C2153Q0 c2153q0 = this.f33536h;
            c2153q0.getClass();
            c2153q0.m3251l(null, arrayListM19323D1);
            ArrayList arrayListM12199u = m12199u();
            C2153Q0 c2153q1 = this.f33538j;
            c2153q1.getClass();
            c2153q1.m3251l(null, arrayListM12199u);
        }
        return c21778h != null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m12185d(ArrayList arrayList, AbstractC21790t abstractC21790t, boolean z6, boolean z10) {
        String str;
        String str2;
        C16556x c16556x;
        C16556x c16556x2 = new C16556x();
        C17677k c17677k = new C17677k();
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            AbstractC21769K abstractC21769K = (AbstractC21769K) it.next();
            c16556x = new C16556x();
            C21778h c21778h = (C21778h) this.f33535g.last();
            this.f33554z = new C0102A(c16556x, c16556x2, this, z10, c17677k, 5);
            abstractC21769K.mo989e(c21778h, z10);
            str = null;
            this.f33554z = null;
        } while (c16556x.f51285Y);
        if (z10) {
            LinkedHashMap linkedHashMap = this.f33542n;
            if (!z6) {
                C21025f c21025f = new C21025f(AbstractC21031l.m21498v(AbstractC21031l.m21492p(C21772b.f69058q0, abstractC21790t), new C21782l(this, 0)));
                while (c21025f.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((AbstractC21790t) c21025f.next()).f69135r0);
                    C21779i c21779i = (C21779i) c17677k.m19271q();
                    linkedHashMap.put(numValueOf, c21779i != null ? c21779i.f69085Y : str);
                }
            }
            if (!c17677k.isEmpty()) {
                C21779i c21779i2 = (C21779i) c17677k.first();
                C21025f c21025f2 = new C21025f(AbstractC21031l.m21498v(AbstractC21031l.m21492p(C21772b.f69059r0, m12186e(c21779i2.f69086Z)), new C21782l(this, 1)));
                while (true) {
                    boolean zHasNext = c21025f2.hasNext();
                    str2 = c21779i2.f69085Y;
                    if (!zHasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((AbstractC21790t) c21025f2.next()).f69135r0), str2);
                }
                if (linkedHashMap.values().contains(str2)) {
                    this.f33543o.put(str2, c17677k);
                }
            }
        }
        m12203y();
        return c16556x2.f51285Y;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC21790t m12186e(int i10) {
        AbstractC21790t abstractC21790t;
        C21792v c21792v = this.f33531c;
        if (c21792v == null) {
            return null;
        }
        if (c21792v.f69135r0 == i10) {
            return c21792v;
        }
        C21778h c21778h = (C21778h) this.f33535g.m19273s();
        if (c21778h == null || (abstractC21790t = c21778h.f69074Z) == null) {
            abstractC21790t = this.f33531c;
            AbstractC16544l.m18091d(abstractC21790t);
        }
        return m12179f(abstractC21790t, i10);
    }

    /* JADX INFO: renamed from: g */
    public final C21778h m12187g(int i10) {
        Object objPrevious;
        C17677k c17677k = this.f33535g;
        ListIterator<E> listIterator = c17677k.listIterator(c17677k.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((C21778h) objPrevious).f69074Z.f69135r0 != i10);
        C21778h c21778h = (C21778h) objPrevious;
        if (c21778h != null) {
            return c21778h;
        }
        StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        sbM11057o.append(m12188h());
        throw new IllegalArgumentException(sbM11057o.toString().toString());
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC21790t m12188h() {
        C21778h c21778h = (C21778h) this.f33535g.m19273s();
        if (c21778h != null) {
            return c21778h.f69074Z;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final int m12189i() {
        C17677k c17677k = this.f33535g;
        int i10 = 0;
        if (!(c17677k instanceof Collection) || !c17677k.isEmpty()) {
            Iterator<E> it = c17677k.iterator();
            while (it.hasNext()) {
                if (!(((C21778h) it.next()).f69074Z instanceof C21792v) && (i10 = i10 + 1) < 0) {
                    AbstractC17681o.m19387p();
                    throw null;
                }
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: j */
    public final C21792v m12190j() {
        C21792v c21792v = this.f33531c;
        if (c21792v == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        AbstractC16544l.m18092e(c21792v, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return c21792v;
    }

    /* JADX INFO: renamed from: k */
    public final EnumC11104m m12191k() {
        return this.f33544p == null ? EnumC11104m.f33476o0 : this.f33547s;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m12192l(Intent intent) {
        int[] intArray;
        Context context;
        AbstractC21790t abstractC21790tM22284s;
        C21792v c21792v;
        Bundle bundle;
        AbstractC21790t abstractC21790tM22284s2;
        C21792v c21792v2;
        int i10 = 0;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        String strM9294h = null;
        if (extras != null) {
            try {
                intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
            } catch (Exception e10) {
                AbstractC15256t.m16466d("NavController", "handleDeepLink() could not extract deepLink from " + intent, e10);
                intArray = null;
            }
        } else {
            intArray = null;
        }
        ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        if (intArray == null || intArray.length == 0) {
            C21792v c21792v3 = this.f33531c;
            AbstractC16544l.m18091d(c21792v3);
            C21789s c21789sMo22282q = c21792v3.mo22282q(new C20694c(intent));
            if (c21789sMo22282q != null) {
                AbstractC21790t abstractC21790t = c21789sMo22282q.f69123Y;
                int[] iArrM22280m = abstractC21790t.m22280m(null);
                Bundle bundleM22279j = abstractC21790t.m22279j(c21789sMo22282q.f69124Z);
                if (bundleM22279j != null) {
                    bundle2.putAll(bundleM22279j);
                }
                intArray = iArrM22280m;
                parcelableArrayList = null;
            }
        }
        if (intArray == null || intArray.length == 0) {
            return false;
        }
        C21792v c21792v4 = this.f33531c;
        int length = intArray.length;
        int i11 = 0;
        while (true) {
            context = this.f33529a;
            if (i11 >= length) {
                break;
            }
            int i12 = intArray[i11];
            if (i11 == 0) {
                C21792v c21792v5 = this.f33531c;
                AbstractC16544l.m18091d(c21792v5);
                abstractC21790tM22284s2 = c21792v5.f69135r0 == i12 ? this.f33531c : null;
            } else {
                AbstractC16544l.m18091d(c21792v4);
                abstractC21790tM22284s2 = c21792v4.m22284s(i12, true);
            }
            if (abstractC21790tM22284s2 == null) {
                int i13 = AbstractC21790t.f69129t0;
                strM9294h = AbstractC8634g.m9294h(context, i12);
                break;
            }
            if (i11 != intArray.length - 1 && (abstractC21790tM22284s2 instanceof C21792v)) {
                while (true) {
                    c21792v2 = (C21792v) abstractC21790tM22284s2;
                    AbstractC16544l.m18091d(c21792v2);
                    if (!(c21792v2.m22284s(c21792v2.f69142v0, true) instanceof C21792v)) {
                        break;
                    }
                    abstractC21790tM22284s2 = c21792v2.m22284s(c21792v2.f69142v0, true);
                }
                c21792v4 = c21792v2;
            }
            i11++;
        }
        if (strM9294h != null) {
            Log.i("NavController", "Could not find destination " + strM9294h + " in the navigation graph, ignoring the deep link from " + intent);
            return false;
        }
        bundle2.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        int length2 = intArray.length;
        Bundle[] bundleArr = new Bundle[length2];
        for (int i14 = 0; i14 < length2; i14++) {
            Bundle bundle4 = new Bundle();
            bundle4.putAll(bundle2);
            if (parcelableArrayList != null && (bundle = (Bundle) parcelableArrayList.get(i14)) != null) {
                bundle4.putAll(bundle);
            }
            bundleArr[i14] = bundle4;
        }
        int flags = intent.getFlags();
        int i15 = 268435456 & flags;
        if (i15 != 0 && (flags & 32768) == 0) {
            intent.addFlags(32768);
            C17447A c17447a = new C17447A(context);
            ComponentName component = intent.getComponent();
            if (component == null) {
                component = intent.resolveActivity(c17447a.f55786Z.getPackageManager());
            }
            if (component != null) {
                c17447a.m19124f(component);
            }
            c17447a.f55785Y.add(intent);
            c17447a.m19125i();
            Activity activity = this.f33530b;
            if (activity != null) {
                activity.finish();
                activity.overridePendingTransition(0, 0);
            }
            return true;
        }
        if (i15 != 0) {
            if (!this.f33535g.isEmpty()) {
                C21792v c21792v6 = this.f33531c;
                AbstractC16544l.m18091d(c21792v6);
                m12197r(c21792v6.f69135r0, true, false);
            }
            while (i10 < intArray.length) {
                int i16 = intArray[i10];
                int i17 = i10 + 1;
                Bundle bundle5 = bundleArr[i10];
                AbstractC21790t abstractC21790tM12186e = m12186e(i16);
                if (abstractC21790tM12186e == null) {
                    int i18 = AbstractC21790t.f69129t0;
                    StringBuilder sbM11058p = AbstractC10763a.m11058p("Deep Linking failed: destination ", AbstractC8634g.m9294h(context, i16), " cannot be found from the current destination ");
                    sbM11058p.append(m12188h());
                    throw new IllegalStateException(sbM11058p.toString());
                }
                m12194n(abstractC21790tM12186e, bundle5, AbstractC8646i.m9320d(new C20720L0(abstractC21790tM12186e, 3, this)));
                i10 = i17;
            }
            this.f33534f = true;
            return true;
        }
        C21792v c21792v7 = this.f33531c;
        int length3 = intArray.length;
        while (i10 < length3) {
            int i19 = intArray[i10];
            Bundle bundle6 = bundleArr[i10];
            if (i10 == 0) {
                abstractC21790tM22284s = this.f33531c;
            } else {
                AbstractC16544l.m18091d(c21792v7);
                abstractC21790tM22284s = c21792v7.m22284s(i19, true);
            }
            if (abstractC21790tM22284s == null) {
                int i20 = AbstractC21790t.f69129t0;
                throw new IllegalStateException("Deep Linking failed: destination " + AbstractC8634g.m9294h(context, i19) + " cannot be found in graph " + c21792v7);
            }
            if (i10 == intArray.length - 1) {
                C21792v c21792v8 = this.f33531c;
                AbstractC16544l.m18091d(c21792v8);
                m12194n(abstractC21790tM22284s, bundle6, new C21759A(false, false, c21792v8.f69135r0, true, false, 0, 0));
            } else if (abstractC21790tM22284s instanceof C21792v) {
                while (true) {
                    c21792v = (C21792v) abstractC21790tM22284s;
                    AbstractC16544l.m18091d(c21792v);
                    if (!(c21792v.m22284s(c21792v.f69142v0, true) instanceof C21792v)) {
                        break;
                    }
                    abstractC21790tM22284s = c21792v.m22284s(c21792v.f69142v0, true);
                }
                c21792v7 = c21792v;
            }
            i10++;
        }
        this.f33534f = true;
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final void m12193m(C21778h c21778h, C21778h c21778h2) {
        this.f33540l.put(c21778h, c21778h2);
        LinkedHashMap linkedHashMap = this.f33541m;
        if (linkedHashMap.get(c21778h2) == null) {
            linkedHashMap.put(c21778h2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(c21778h2);
        AbstractC16544l.m18091d(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:73:0x01a7  */
    /* JADX INFO: renamed from: n */
    public final void m12194n(AbstractC21790t abstractC21790t, Bundle bundle, C21759A c21759a) {
        LinkedHashMap linkedHashMap;
        boolean z6;
        boolean z10;
        int i10;
        AbstractC21790t abstractC21790t2;
        int iNextIndex;
        int iNextIndex2;
        int i11;
        LinkedHashMap linkedHashMap2 = this.f33552x;
        Iterator it = linkedHashMap2.values().iterator();
        while (it.hasNext()) {
            ((C21780j) it.next()).f69092d = true;
        }
        C16556x c16556x = new C16556x();
        boolean zM12197r = (c21759a == null || (i11 = c21759a.f69024c) == -1) ? false : m12197r(i11, c21759a.f69025d, c21759a.f69026e);
        Bundle bundleM22279j = abstractC21790t.m22279j(bundle);
        if (c21759a != null && c21759a.f69023b && this.f33542n.containsKey(Integer.valueOf(abstractC21790t.f69135r0))) {
            c16556x.f51285Y = m12200v(abstractC21790t.f69135r0, bundleM22279j, c21759a);
            linkedHashMap = linkedHashMap2;
            z6 = zM12197r;
            z10 = false;
        } else {
            C21770L c21770l = this.f33551w;
            if (c21759a == null || !c21759a.f69022a) {
                linkedHashMap = linkedHashMap2;
                z6 = zM12197r;
                z10 = false;
            } else {
                C17677k c17677k = this.f33535g;
                C21778h c21778h = (C21778h) c17677k.m19273s();
                if (abstractC21790t instanceof C21792v) {
                    int i12 = C21792v.f69140y0;
                    i10 = AbstractC8640h.m9308g((C21792v) abstractC21790t).f69135r0;
                } else {
                    i10 = abstractC21790t.f69135r0;
                }
                if (c21778h == null || (abstractC21790t2 = c21778h.f69074Z) == null || i10 != abstractC21790t2.f69135r0) {
                    linkedHashMap = linkedHashMap2;
                    z6 = zM12197r;
                    z10 = false;
                } else {
                    C17677k<C21778h> c17677k2 = new C17677k();
                    ListIterator listIterator = c17677k.listIterator(c17677k.mo7371f());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            if (((C21778h) listIterator.previous()).f69074Z == abstractC21790t) {
                                iNextIndex = listIterator.nextIndex();
                                break;
                            }
                        } else {
                            iNextIndex = -1;
                            break;
                        }
                    }
                    while (AbstractC17681o.m19381j(c17677k) >= iNextIndex) {
                        C21778h c21778h2 = (C21778h) c17677k.removeLast();
                        m12201w(c21778h2);
                        C21778h c21778h3 = new C21778h(c21778h2.f69073Y, c21778h2.f69074Z, c21778h2.f69074Z.m22279j(bundle), c21778h2.f69076p0, c21778h2.f69077q0, c21778h2.f69078r0, c21778h2.f69079s0);
                        c21778h3.f69076p0 = c21778h2.f69076p0;
                        c21778h3.m22264f(c21778h2.f69083w0);
                        c17677k2.addFirst(c21778h3);
                        iNextIndex = iNextIndex;
                        zM12197r = zM12197r;
                        linkedHashMap2 = linkedHashMap2;
                    }
                    linkedHashMap = linkedHashMap2;
                    z6 = zM12197r;
                    for (C21778h c21778h4 : c17677k2) {
                        C21792v c21792v = c21778h4.f69074Z.f69131Z;
                        if (c21792v != null) {
                            m12193m(c21778h4, m12187g(c21792v.f69135r0));
                        }
                        c17677k.addLast(c21778h4);
                    }
                    for (C21778h c21778h5 : c17677k2) {
                        AbstractC21769K abstractC21769KM22262b = c21770l.m22262b(c21778h5.f69074Z.f69130Y);
                        AbstractC21790t abstractC21790t3 = c21778h5.f69074Z;
                        if (!(abstractC21790t3 instanceof AbstractC21790t)) {
                            abstractC21790t3 = null;
                        }
                        if (abstractC21790t3 != null) {
                            AbstractC8646i.m9320d(C21772b.f69062u0);
                            abstractC21769KM22262b.mo22259c(abstractC21790t3);
                            C21780j c21780jM22258b = abstractC21769KM22262b.m22258b();
                            ReentrantLock reentrantLock = c21780jM22258b.f69089a;
                            reentrantLock.lock();
                            try {
                                ArrayList arrayListM19323D0 = AbstractC17680n.m19323D0((Collection) c21780jM22258b.f69093e.f6797Y.getValue());
                                ListIterator listIterator2 = arrayListM19323D0.listIterator(arrayListM19323D0.size());
                                while (true) {
                                    if (listIterator2.hasPrevious()) {
                                        if (AbstractC16544l.m18089b(((C21778h) listIterator2.previous()).f69078r0, c21778h5.f69078r0)) {
                                            iNextIndex2 = listIterator2.nextIndex();
                                            break;
                                        }
                                    } else {
                                        iNextIndex2 = -1;
                                        break;
                                    }
                                }
                                arrayListM19323D0.set(iNextIndex2, c21778h5);
                                C2153Q0 c2153q0 = c21780jM22258b.f69090b;
                                c2153q0.getClass();
                                c2153q0.m3251l(null, arrayListM19323D0);
                                reentrantLock.unlock();
                            } catch (Throwable th2) {
                                reentrantLock.unlock();
                                throw th2;
                            }
                        }
                    }
                    z10 = true;
                }
            }
            if (!z10) {
                C21778h c21778hM17935i = C16340i.m17935i(this.f33529a, abstractC21790t, bundleM22279j, m12191k(), this.f33545q);
                AbstractC21769K abstractC21769KM22262b2 = c21770l.m22262b(abstractC21790t.f69130Y);
                List listM9974d = AbstractC9393x3.m9974d(c21778hM17935i);
                this.f33553y = new C20699B(c16556x, this, abstractC21790t, bundleM22279j, 1);
                abstractC21769KM22262b2.mo988d(listM9974d, c21759a);
                this.f33553y = null;
            }
        }
        m12203y();
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            ((C21780j) it2.next()).f69092d = false;
        }
        if (z6 || c16556x.f51285Y || z10) {
            m12184c();
        } else {
            m12202x();
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m12195o() {
        Intent intent;
        int i10 = 0;
        if (m12189i() != 1) {
            return m12196p();
        }
        Activity activity = this.f33530b;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        if ((extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null) == null) {
            AbstractC21790t abstractC21790tM12188h = m12188h();
            AbstractC16544l.m18091d(abstractC21790tM12188h);
            int i11 = abstractC21790tM12188h.f69135r0;
            for (C21792v c21792v = abstractC21790tM12188h.f69131Z; c21792v != null; c21792v = c21792v.f69131Z) {
                if (c21792v.f69142v0 != i11) {
                    Bundle bundle = new Bundle();
                    if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                        bundle.putParcelable("android-support-nav:controller:deepLinkIntent", activity.getIntent());
                        C21792v c21792v2 = this.f33531c;
                        AbstractC16544l.m18091d(c21792v2);
                        Intent intent2 = activity.getIntent();
                        AbstractC16544l.m18093f(intent2, "activity!!.intent");
                        C21789s c21789sMo22282q = c21792v2.mo22282q(new C20694c(intent2));
                        if ((c21789sMo22282q != null ? c21789sMo22282q.f69124Z : null) != null) {
                            bundle.putAll(c21789sMo22282q.f69123Y.m22279j(c21789sMo22282q.f69124Z));
                        }
                    }
                    C11238i c11238i = new C11238i((C21795y) this);
                    int i12 = c21792v.f69135r0;
                    ArrayList arrayList = (ArrayList) c11238i.f34011p0;
                    arrayList.clear();
                    arrayList.add(new C21787q(i12, null));
                    if (((C21792v) c11238i.f34010o0) != null) {
                        c11238i.m12544K0();
                    }
                    ((Intent) c11238i.f34009Z).putExtra("android-support-nav:controller:deepLinkExtras", bundle);
                    c11238i.m12561e0().m19125i();
                    if (activity != null) {
                        activity.finish();
                    }
                    return true;
                }
                i11 = c21792v.f69135r0;
            }
            return false;
        }
        if (!this.f33534f) {
            return false;
        }
        AbstractC16544l.m18091d(activity);
        Intent intent3 = activity.getIntent();
        Bundle extras2 = intent3.getExtras();
        AbstractC16544l.m18091d(extras2);
        int[] intArray = extras2.getIntArray("android-support-nav:controller:deepLinkIds");
        AbstractC16544l.m18091d(intArray);
        ArrayList arrayListM19292O = AbstractC17678l.m19292O(intArray);
        ArrayList parcelableArrayList = extras2.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
        int iIntValue = ((Number) AbstractC17686t.m19397E(arrayListM19292O)).intValue();
        if (parcelableArrayList != null) {
        }
        if (arrayListM19292O.isEmpty()) {
            return false;
        }
        AbstractC21790t abstractC21790tM12179f = m12179f(m12190j(), iIntValue);
        if (abstractC21790tM12179f instanceof C21792v) {
            int i13 = C21792v.f69140y0;
            iIntValue = AbstractC8640h.m9308g((C21792v) abstractC21790tM12179f).f69135r0;
        }
        AbstractC21790t abstractC21790tM12188h2 = m12188h();
        if (abstractC21790tM12188h2 == null || iIntValue != abstractC21790tM12188h2.f69135r0) {
            return false;
        }
        C11238i c11238i2 = new C11238i((C21795y) this);
        Bundle bundleM8632a = AbstractC8127k5.m8632a(new C17309l("android-support-nav:controller:deepLinkIntent", intent3));
        Bundle bundle2 = extras2.getBundle("android-support-nav:controller:deepLinkExtras");
        if (bundle2 != null) {
            bundleM8632a.putAll(bundle2);
        }
        ((Intent) c11238i2.f34009Z).putExtra("android-support-nav:controller:deepLinkExtras", bundleM8632a);
        for (Object obj : arrayListM19292O) {
            int i14 = i10 + 1;
            if (i10 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            ((ArrayList) c11238i2.f34011p0).add(new C21787q(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i10) : null));
            if (((C21792v) c11238i2.f34010o0) != null) {
                c11238i2.m12544K0();
            }
            i10 = i14;
        }
        c11238i2.m12561e0().m19125i();
        activity.finish();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m12196p() {
        if (this.f33535g.isEmpty()) {
            return false;
        }
        AbstractC21790t abstractC21790tM12188h = m12188h();
        AbstractC16544l.m18091d(abstractC21790tM12188h);
        return m12197r(abstractC21790tM12188h.f69135r0, true, false) && m12184c();
    }

    /* JADX INFO: renamed from: r */
    public final boolean m12197r(int i10, boolean z6, boolean z10) {
        AbstractC21790t abstractC21790t;
        C17677k c17677k = this.f33535g;
        if (c17677k.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = AbstractC17680n.m19363m0(c17677k).iterator();
        do {
            if (!it.hasNext()) {
                abstractC21790t = null;
                break;
            }
            abstractC21790t = ((C21778h) it.next()).f69074Z;
            AbstractC21769K abstractC21769KM22262b = this.f33551w.m22262b(abstractC21790t.f69130Y);
            if (z6 || abstractC21790t.f69135r0 != i10) {
                arrayList.add(abstractC21769KM22262b);
            }
        } while (abstractC21790t.f69135r0 != i10);
        if (abstractC21790t != null) {
            return m12185d(arrayList, abstractC21790t, z6, z10);
        }
        int i11 = AbstractC21790t.f69129t0;
        Log.i("NavController", "Ignoring popBackStack to destination " + AbstractC8634g.m9294h(this.f33529a, i10) + " as it was not found on the current back stack");
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final void m12198s(C21778h c21778h, boolean z6, C17677k c17677k) {
        NavControllerViewModel navControllerViewModel;
        C2217y0 c2217y0;
        Set set;
        C17677k c17677k2 = this.f33535g;
        C21778h c21778h2 = (C21778h) c17677k2.last();
        if (!AbstractC16544l.m18089b(c21778h2, c21778h)) {
            throw new IllegalStateException(("Attempted to pop " + c21778h.f69074Z + ", which is not the top of the back stack (" + c21778h2.f69074Z + ')').toString());
        }
        c17677k2.removeLast();
        C21780j c21780j = (C21780j) this.f33552x.get(this.f33551w.m22262b(c21778h2.f69074Z.f69130Y));
        boolean z10 = true;
        if ((c21780j == null || (c2217y0 = c21780j.f69094f) == null || (set = (Set) c2217y0.f6797Y.getValue()) == null || !set.contains(c21778h2)) && !this.f33541m.containsKey(c21778h2)) {
            z10 = false;
        }
        EnumC11104m enumC11104m = c21778h2.f69080t0.f33504d;
        EnumC11104m enumC11104m2 = EnumC11104m.f33476o0;
        if (enumC11104m.compareTo(enumC11104m2) >= 0) {
            if (z6) {
                c21778h2.m22264f(enumC11104m2);
                c17677k.addFirst(new C21779i(c21778h2));
            }
            if (z10) {
                c21778h2.m22264f(enumC11104m2);
            } else {
                c21778h2.m22264f(EnumC11104m.f33474Y);
                m12201w(c21778h2);
            }
        }
        if (z6 || z10 || (navControllerViewModel = this.f33545q) == null) {
            return;
        }
        String backStackEntryId = c21778h2.f69078r0;
        AbstractC16544l.m18094g(backStackEntryId, "backStackEntryId");
        ViewModelStore viewModelStore = (ViewModelStore) navControllerViewModel.f33522b.remove(backStackEntryId);
        if (viewModelStore != null) {
            viewModelStore.m12146a();
        }
    }

    /* JADX INFO: renamed from: u */
    public final ArrayList m12199u() {
        EnumC11104m enumC11104m;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f33552x.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            enumC11104m = EnumC11104m.f33477p0;
            if (!zHasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((C21780j) it.next()).f69094f.f6797Y.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                C21778h c21778h = (C21778h) obj;
                if (!arrayList.contains(c21778h) && c21778h.f69083w0.compareTo(enumC11104m) < 0) {
                    arrayList2.add(obj);
                }
            }
            AbstractC17686t.m19398v(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : this.f33535g) {
            C21778h c21778h2 = (C21778h) obj2;
            if (!arrayList.contains(c21778h2) && c21778h2.f69083w0.compareTo(enumC11104m) >= 0) {
                arrayList3.add(obj2);
            }
        }
        AbstractC17686t.m19398v(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!(((C21778h) obj3).f69074Z instanceof C21792v)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m12200v(int i10, Bundle bundle, C21759A c21759a) {
        AbstractC21790t abstractC21790tM12190j;
        C21778h c21778h;
        AbstractC21790t abstractC21790t;
        LinkedHashMap linkedHashMap = this.f33542n;
        if (!linkedHashMap.containsKey(Integer.valueOf(i10))) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i10));
        AbstractC17686t.m19394B(linkedHashMap.values(), new C6665a(str, 18));
        C17677k<C21779i> c17677k = (C17677k) AbstractC16529F.m18079c(this.f33543o).remove(str);
        ArrayList arrayList = new ArrayList();
        C21778h c21778h2 = (C21778h) this.f33535g.m19273s();
        if (c21778h2 == null || (abstractC21790tM12190j = c21778h2.f69074Z) == null) {
            abstractC21790tM12190j = m12190j();
        }
        if (c17677k != null) {
            for (C21779i c21779i : c17677k) {
                AbstractC21790t abstractC21790tM12179f = m12179f(abstractC21790tM12190j, c21779i.f69086Z);
                Context context = this.f33529a;
                if (abstractC21790tM12179f == null) {
                    int i11 = AbstractC21790t.f69129t0;
                    throw new IllegalStateException(("Restore State failed: destination " + AbstractC8634g.m9294h(context, c21779i.f69086Z) + " cannot be found from the current destination " + abstractC21790tM12190j).toString());
                }
                arrayList.add(c21779i.m22266a(context, abstractC21790tM12179f, m12191k(), this.f33545q));
                abstractC21790tM12190j = abstractC21790tM12179f;
            }
        }
        ArrayList<List> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(((C21778h) obj).f69074Z instanceof C21792v)) {
                arrayList3.add(obj);
            }
        }
        Iterator it = arrayList3.iterator();
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                break;
            }
            C21778h c21778h3 = (C21778h) it.next();
            List list = (List) AbstractC17680n.m19353c0(arrayList2);
            if (list != null && (c21778h = (C21778h) AbstractC17680n.m19351a0(list)) != null && (abstractC21790t = c21778h.f69074Z) != null) {
                str2 = abstractC21790t.f69130Y;
            }
            if (AbstractC16544l.m18089b(str2, c21778h3.f69074Z.f69130Y)) {
                list.add(c21778h3);
            } else {
                arrayList2.add(AbstractC17681o.m19384m(c21778h3));
            }
        }
        C16556x c16556x = new C16556x();
        for (List list2 : arrayList2) {
            AbstractC21769K abstractC21769KM22262b = this.f33551w.m22262b(((C21778h) AbstractC17680n.m19341Q(list2)).f69074Z.f69130Y);
            this.f33553y = new C0362w(c16556x, arrayList, new C16558z(), this, bundle, 17);
            abstractC21769KM22262b.mo988d(list2, c21759a);
            this.f33553y = null;
        }
        return c16556x.f51285Y;
    }

    /* JADX INFO: renamed from: w */
    public final void m12201w(C21778h child) {
        AbstractC16544l.m18094g(child, "child");
        C21778h c21778h = (C21778h) this.f33540l.remove(child);
        if (c21778h == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f33541m;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(c21778h);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            C21780j c21780j = (C21780j) this.f33552x.get(this.f33551w.m22262b(c21778h.f69074Z.f69130Y));
            if (c21780j != null) {
                c21780j.m22268b(c21778h);
            }
            linkedHashMap.remove(c21778h);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m12202x() {
        AtomicInteger atomicInteger;
        C2217y0 c2217y0;
        Set set;
        ArrayList<C21778h> arrayListM19323D0 = AbstractC17680n.m19323D0(this.f33535g);
        if (arrayListM19323D0.isEmpty()) {
            return;
        }
        AbstractC21790t abstractC21790t = ((C21778h) AbstractC17680n.m19351a0(arrayListM19323D0)).f69074Z;
        ArrayList arrayList = new ArrayList();
        if (abstractC21790t instanceof InterfaceC21774d) {
            Iterator it = AbstractC17680n.m19363m0(arrayListM19323D0).iterator();
            while (it.hasNext()) {
                AbstractC21790t abstractC21790t2 = ((C21778h) it.next()).f69074Z;
                arrayList.add(abstractC21790t2);
                if (!(abstractC21790t2 instanceof InterfaceC21774d) && !(abstractC21790t2 instanceof C21792v)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (C21778h c21778h : AbstractC17680n.m19363m0(arrayListM19323D0)) {
            EnumC11104m enumC11104m = c21778h.f69083w0;
            AbstractC21790t abstractC21790t3 = c21778h.f69074Z;
            EnumC11104m enumC11104m2 = EnumC11104m.f33478q0;
            EnumC11104m enumC11104m3 = EnumC11104m.f33477p0;
            if (abstractC21790t != null && abstractC21790t3.f69135r0 == abstractC21790t.f69135r0) {
                if (enumC11104m != enumC11104m2) {
                    C21780j c21780j = (C21780j) this.f33552x.get(this.f33551w.m22262b(abstractC21790t3.f69130Y));
                    if (AbstractC16544l.m18089b((c21780j == null || (c2217y0 = c21780j.f69094f) == null || (set = (Set) c2217y0.f6797Y.getValue()) == null) ? null : Boolean.valueOf(set.contains(c21778h)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.f33541m.get(c21778h)) != null && atomicInteger.get() == 0)) {
                        map.put(c21778h, enumC11104m3);
                    } else {
                        map.put(c21778h, enumC11104m2);
                    }
                }
                AbstractC21790t abstractC21790t4 = (AbstractC21790t) AbstractC17680n.m19343S(arrayList);
                if (abstractC21790t4 != null && abstractC21790t4.f69135r0 == abstractC21790t3.f69135r0) {
                    AbstractC17686t.m19395C(arrayList);
                }
                abstractC21790t = abstractC21790t.f69131Z;
            } else if (arrayList.isEmpty() || abstractC21790t3.f69135r0 != ((AbstractC21790t) AbstractC17680n.m19341Q(arrayList)).f69135r0) {
                c21778h.m22264f(EnumC11104m.f33476o0);
            } else {
                AbstractC21790t abstractC21790t5 = (AbstractC21790t) AbstractC17686t.m19395C(arrayList);
                if (enumC11104m == enumC11104m2) {
                    c21778h.m22264f(enumC11104m3);
                } else if (enumC11104m != enumC11104m3) {
                    map.put(c21778h, enumC11104m3);
                }
                C21792v c21792v = abstractC21790t5.f69131Z;
                if (c21792v != null && !arrayList.contains(c21792v)) {
                    arrayList.add(c21792v);
                }
            }
        }
        for (C21778h c21778h2 : arrayListM19323D0) {
            EnumC11104m enumC11104m4 = (EnumC11104m) map.get(c21778h2);
            if (enumC11104m4 != null) {
                c21778h2.m22264f(enumC11104m4);
            } else {
                c21778h2.m22265g();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    /* JADX INFO: renamed from: y */
    public final void m12203y() {
        boolean z6;
        if (this.f33550v) {
            z6 = m12189i() > 1;
        }
        this.f33549u.m15541c(z6);
    }
}
