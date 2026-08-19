package p444S4;

import android.app.Activity;
import android.content.Context;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC11112u;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.navigation.NavControllerViewModel;
import androidx.navigation.NavControllerViewModel$Companion$FACTORY$1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p002A0.C0122V;
import p002A0.C0130g;
import p006A4.C0336A;
import p006A4.C0337B;
import p006A4.C0338C;
import p006A4.C0339D;
import p006A4.C0347h;
import p006A4.C0355p;
import p006A4.C0362w;
import p006A4.C0363x;
import p006A4.C0364y;
import p006A4.C0365z;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1091wn.AbstractC21031l;
import p1113xn.AbstractC21322p;
import p1139z0.C21585H;
import p1143z4.AbstractC21769K;
import p1143z4.AbstractC21790t;
import p1143z4.C21770L;
import p1143z4.C21772b;
import p1143z4.C21776f;
import p1143z4.C21778h;
import p1143z4.C21779i;
import p1143z4.C21780j;
import p1143z4.C21786p;
import p1143z4.C21792v;
import p1143z4.C21793w;
import p1143z4.C21795y;
import p295Lj.AbstractC5103c;
import p349O0.C5944C;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC5982V0;
import p349O0.InterfaceC5985X;
import p470T4.AbstractC7255t;
import p523V9.AbstractC8138m0;
import p523V9.AbstractC8223w5;
import p537W0.AbstractC8411c;
import p544W9.AbstractC8577W2;
import p544W9.AbstractC8634g;
import p544W9.AbstractC8646i;
import p562X0.C9013h;
import p586Y0.C9545D;
import p594Y9.AbstractC9834X3;
import p594Y9.AbstractC9840Y3;
import p635a1.C10444b;
import p635a1.C10451i;
import p635a1.InterfaceC10446d;
import p635a1.InterfaceC10459q;
import p636a2.C10467d;
import p636a2.C10470g;
import p636a2.C10471h;
import p692d0.AbstractC12978q;
import p692d0.C12960M;
import p714e0.AbstractC13253a;
import p736f0.AbstractC13481T;
import p758g0.AbstractC13779o0;
import p758g0.C13771k0;
import p758g0.C13796x;
import p860l0.C16684J;
import p860l0.InterfaceC16661B0;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.C17662G;
import p909nm.C17677k;
import p911o0.C17767k0;
import p911o0.InterfaceC17760h;
import p911o0.InterfaceC17763i0;
import p936p0.C18282v;
import p977r0.C18830b;
import p977r0.C18847s;
import p977r0.C18852x;
import p977r0.C18853y;
import ph.C18416d;

/* JADX INFO: renamed from: S4.A */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6993A {
    /* JADX INFO: renamed from: a */
    public static final void m7395a(C18853y c18853y, InterfaceC10459q interfaceC10459q, C18852x c18852x, InterfaceC17763i0 interfaceC17763i0, boolean z6, float f10, InterfaceC17760h interfaceC17760h, InterfaceC16661B0 interfaceC16661B0, boolean z10, InterfaceC1436k interfaceC1436k, C6021p c6021p, int i10) {
        int i11;
        boolean z11;
        Object obj;
        boolean z12;
        InterfaceC16661B0 interfaceC16661B1;
        InterfaceC17763i0 interfaceC17763i1;
        boolean z13;
        int i12;
        C18852x c18852x2;
        InterfaceC17763i0 interfaceC17763i2;
        InterfaceC16661B0 interfaceC16661B2;
        boolean z14;
        C18852x c18852x3;
        c6021p.m6526U(1695323794);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c18853y) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= 128;
        }
        int i13 = i11 | 27648;
        if ((196608 & i10) == 0) {
            i13 |= c6021p.m6536c(f10) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i13 |= c6021p.m6542f(interfaceC17760h) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i13 |= 4194304;
        }
        int i14 = i13 | 100663296;
        if ((805306368 & i10) == 0) {
            i14 |= c6021p.m6545h(interfaceC1436k) ? 536870912 : 268435456;
        }
        if ((306783379 & i14) == 306783378 && c6021p.m6562y()) {
            c6021p.m6517L();
            c18852x3 = c18852x;
            interfaceC17763i2 = interfaceC17763i0;
            z12 = z6;
            interfaceC16661B2 = interfaceC16661B0;
            z14 = z10;
        } else {
            c6021p.m6519N();
            int i15 = i10 & 1;
            Object obj2 = C6013l.f19514a;
            if (i15 == 0 || c6021p.m6561x()) {
                Object[] objArr = new Object[0];
                C21585H c21585h = C18852x.f60041u;
                boolean zM6538d = c6021p.m6538d(0) | c6021p.m6538d(0);
                Object objM6514H = c6021p.m6514H();
                if (zM6538d || objM6514H == obj2) {
                    objM6514H = new C18282v(0, 0, 1);
                    c6021p.m6537c0(objM6514H);
                }
                z11 = false;
                obj = obj2;
                C18852x c18852x4 = (C18852x) AbstractC9834X3.m10481d(objArr, c21585h, null, (InterfaceC1426a) objM6514H, c6021p, 0, 4);
                float f11 = 0;
                C17767k0 c17767k0 = new C17767k0(f11, f11, f11, f11);
                C13796x c13796xM15000a = AbstractC13481T.m15000a(c6021p);
                boolean zM6542f = c6021p.m6542f(c13796xM15000a);
                Object objM6514H2 = c6021p.m6514H();
                if (zM6542f || objM6514H2 == obj) {
                    objM6514H2 = new C16684J(c13796xM15000a);
                    c6021p.m6537c0(objM6514H2);
                }
                z12 = false;
                interfaceC16661B1 = (C16684J) objM6514H2;
                interfaceC17763i1 = c17767k0;
                z13 = true;
                i12 = i14 & (-29361025);
                c18852x2 = c18852x4;
            } else {
                c6021p.m6517L();
                interfaceC17763i1 = interfaceC17763i0;
                z12 = z6;
                interfaceC16661B1 = interfaceC16661B0;
                z13 = z10;
                i12 = i14 & (-29361025);
                z11 = false;
                obj = obj2;
                c18852x2 = c18852x;
            }
            c6021p.m6554q();
            float fMo455a = interfaceC17760h.mo455a();
            int i16 = i12 >> 3;
            int i17 = (i12 & 14) | ((i12 >> 15) & 112) | (i16 & 896);
            boolean z15 = ((((i17 & 112) ^ 48) > 32 && c6021p.m6542f(interfaceC17760h)) || (i17 & 48) == 32) | (((((i17 & 14) ^ 6) <= 4 || !c6021p.m6542f(c18853y)) && (i17 & 6) != 4) ? z11 : true) | (((i17 & 896) ^ 384) > 256 && c6021p.m6542f(interfaceC17763i1));
            Object objM6514H3 = c6021p.m6514H();
            if (z15 || objM6514H3 == obj) {
                objM6514H3 = new C18847s(new C18416d(interfaceC17763i1, c18853y, interfaceC17760h));
                c6021p.m6537c0(objM6514H3);
            }
            int i18 = i12 << 3;
            AbstractC7255t.m7693a(c18852x2, (C18847s) objM6514H3, interfaceC10459q, interfaceC17763i1, z12, interfaceC16661B1, z13, f10, fMo455a, interfaceC1436k, c6021p, ((i12 << 6) & 7168) | 48 | (57344 & i18) | (i18 & 458752) | (29360128 & i16) | ((i12 << 9) & 234881024), (i12 >> 27) & 14);
            interfaceC17763i2 = interfaceC17763i1;
            interfaceC16661B2 = interfaceC16661B1;
            z14 = z13;
            c18852x3 = c18852x2;
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C18830b(c18853y, interfaceC10459q, c18852x3, interfaceC17763i2, z12, f10, interfaceC17760h, interfaceC16661B2, z14, interfaceC1436k, i10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m7396b(C21795y c21795y, String str, InterfaceC10459q interfaceC10459q, InterfaceC10446d interfaceC10446d, String str2, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, InterfaceC1436k interfaceC1436k3, InterfaceC1436k interfaceC1436k4, InterfaceC1436k interfaceC1436k5, C6021p c6021p, int i10) {
        Object obj;
        c6021p.m6526U(410432995);
        C10451i c10451i = C10444b.f30938q0;
        int i11 = (-264241153) & i10;
        c6021p.m6525T(1618982084);
        boolean zM6542f = c6021p.m6542f(null) | c6021p.m6542f(str) | c6021p.m6542f(interfaceC1436k5);
        Object objM6514H = c6021p.m6514H();
        if (zM6542f || objM6514H == C6013l.f19514a) {
            C21793w c21793w = new C21793w(c21795y.f33551w, str, null);
            interfaceC1436k5.invoke(c21793w);
            AbstractC21790t abstractC21790tMo986a = c21793w.f69145a.mo986a();
            abstractC21790tMo986a.getClass();
            for (Map.Entry entry : c21793w.f69148d.entrySet()) {
                String argumentName = (String) entry.getKey();
                C21776f argument = (C21776f) entry.getValue();
                AbstractC16544l.m18094g(argumentName, "argumentName");
                AbstractC16544l.m18094g(argument, "argument");
                abstractC21790tMo986a.f69134q0.put(argumentName, argument);
            }
            Iterator it = c21793w.f69149e.iterator();
            while (it.hasNext()) {
                abstractC21790tMo986a.m22278f((C21786p) it.next());
            }
            Iterator it2 = c21793w.f69150f.entrySet().iterator();
            if (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                ((Number) entry2.getKey()).intValue();
                if (entry2.getValue() != null) {
                    throw new ClassCastException();
                }
                AbstractC16544l.m18094g(null, "action");
                throw null;
            }
            String str3 = c21793w.f69147c;
            if (str3 != null) {
                abstractC21790tMo986a.m22283r(str3);
            }
            int i12 = c21793w.f69146b;
            if (i12 != -1) {
                abstractC21790tMo986a.f69135r0 = i12;
            }
            C21792v c21792v = (C21792v) abstractC21790tMo986a;
            ArrayList<AbstractC21790t> nodes = c21793w.f69153i;
            AbstractC16544l.m18094g(nodes, "nodes");
            for (AbstractC21790t abstractC21790t : nodes) {
                if (abstractC21790t != null) {
                    int i13 = abstractC21790t.f69135r0;
                    String str4 = abstractC21790t.f69136s0;
                    if (i13 == 0 && str4 == null) {
                        throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                    }
                    String str5 = c21792v.f69136s0;
                    if (str5 != null && AbstractC16544l.m18089b(str4, str5)) {
                        throw new IllegalArgumentException(("Destination " + abstractC21790t + " cannot have the same route as graph " + c21792v).toString());
                    }
                    if (i13 == c21792v.f69135r0) {
                        throw new IllegalArgumentException(("Destination " + abstractC21790t + " cannot have the same id as graph " + c21792v).toString());
                    }
                    C12960M c12960m = c21792v.f69141u0;
                    AbstractC21790t abstractC21790t2 = (AbstractC21790t) c12960m.m14652c(i13);
                    if (abstractC21790t2 != abstractC21790t) {
                        if (abstractC21790t.f69131Z != null) {
                            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                        }
                        if (abstractC21790t2 != null) {
                            abstractC21790t2.f69131Z = null;
                        }
                        abstractC21790t.f69131Z = c21792v;
                        c12960m.m14654e(abstractC21790t.f69135r0, abstractC21790t);
                    }
                }
            }
            String str6 = c21793w.f69152h;
            if (str6 == null) {
                if (str3 == null) {
                    throw new IllegalStateException("You must set a start destination id");
                }
                throw new IllegalStateException("You must set a start destination route");
            }
            if (str6.equals(c21792v.f69136s0)) {
                throw new IllegalArgumentException(("Start destination " + str6 + " cannot use the same route as the graph " + c21792v).toString());
            }
            if (AbstractC21322p.m21681O(str6)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            c21792v.f69142v0 = "android-app://androidx.navigation/".concat(str6).hashCode();
            c21792v.f69144x0 = str6;
            c6021p.m6537c0(c21792v);
            obj = c21792v;
        } else {
            obj = objM6514H;
        }
        c6021p.m6553p(false);
        int i14 = i11 >> 3;
        m7397c(c21795y, (C21792v) obj, interfaceC10459q, c10451i, interfaceC1436k, interfaceC1436k2, interfaceC1436k, interfaceC1436k2, c6021p, (i10 & 896) | 72 | (i10 & 7168) | (57344 & i14) | (i14 & 458752));
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r == null) {
            return;
        }
        c6018n0M6555r.f19536d = new C0337B(c21795y, str, interfaceC10459q, c10451i, null, interfaceC1436k, interfaceC1436k2, interfaceC1436k, interfaceC1436k2, interfaceC1436k5, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX INFO: renamed from: c */
    public static final void m7397c(C21795y c21795y, C21792v graph, InterfaceC10459q interfaceC10459q, InterfaceC10446d interfaceC10446d, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, InterfaceC1436k interfaceC1436k3, InterfaceC1436k interfaceC1436k4, C6021p c6021p, int i10) {
        boolean z6;
        Object obj;
        ?? r6;
        C0355p c0355p;
        boolean z10;
        Object obj2;
        Activity activity;
        Object obj3;
        ArrayList<String> stringArrayList;
        c6021p.m6526U(-1818191915);
        InterfaceC11112u interfaceC11112u = (InterfaceC11112u) c6021p.m6548k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        LocalViewModelStoreOwner.f33491a.getClass();
        ViewModelStoreOwner viewModelStoreOwnerM12165a = LocalViewModelStoreOwner.m12165a(c6021p);
        if (viewModelStoreOwnerM12165a == null) {
            throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
        }
        ViewModelStore viewModelStore = viewModelStoreOwnerM12165a.mo10152e();
        c21795y.getClass();
        AbstractC16544l.m18094g(viewModelStore, "viewModelStore");
        NavControllerViewModel navControllerViewModel = c21795y.f33545q;
        NavControllerViewModel.f33520c.getClass();
        NavControllerViewModel$Companion$FACTORY$1 navControllerViewModel$Companion$FACTORY$1 = NavControllerViewModel.f33521d;
        boolean zM18089b = AbstractC16544l.m18089b(navControllerViewModel, (NavControllerViewModel) new ViewModelProvider(viewModelStore, navControllerViewModel$Companion$FACTORY$1, 0).m12144a(AbstractC8138m0.m8670e(NavControllerViewModel.class)));
        C17677k<C21778h> c17677k = c21795y.f33535g;
        if (!zM18089b) {
            if (!c17677k.isEmpty()) {
                throw new IllegalStateException("ViewModelStore should be set before setGraph call");
            }
            c21795y.f33545q = (NavControllerViewModel) new ViewModelProvider(viewModelStore, navControllerViewModel$Companion$FACTORY$1, 0).m12144a(AbstractC8138m0.m8670e(NavControllerViewModel.class));
        }
        AbstractC16544l.m18094g(graph, "graph");
        boolean zM18089b2 = AbstractC16544l.m18089b(c21795y.f33531c, graph);
        C21770L c21770l = c21795y.f33551w;
        if (zM18089b2) {
            C12960M c12960m = graph.f69141u0;
            int iM14655f = c12960m.m14655f();
            int i11 = 0;
            while (i11 < iM14655f) {
                AbstractC21790t abstractC21790t = (AbstractC21790t) c12960m.m14656g(i11);
                C21792v c21792v = c21795y.f33531c;
                AbstractC16544l.m18091d(c21792v);
                int iM14653d = c21792v.f69141u0.m14653d(i11);
                C21792v c21792v2 = c21795y.f33531c;
                AbstractC16544l.m18091d(c21792v2);
                C12960M c12960m2 = c21792v2.f69141u0;
                if (c12960m2.f41155Y) {
                    AbstractC12978q.m14672a(c12960m2);
                }
                C12960M c12960m3 = c12960m;
                int iM14848a = AbstractC13253a.m14848a(c12960m2.f41158p0, iM14653d, c12960m2.f41156Z);
                if (iM14848a >= 0) {
                    Object[] objArr = c12960m2.f41157o0;
                    Object obj4 = objArr[iM14848a];
                    objArr[iM14848a] = abstractC21790t;
                }
                i11++;
                c12960m = c12960m3;
            }
            for (C21778h c21778h : c17677k) {
                int i12 = AbstractC21790t.f69129t0;
                C17662G c17662g = new C17662G(AbstractC21031l.m21499w(AbstractC8634g.m9295i(c21778h.f69074Z)));
                AbstractC21790t abstractC21790tM22284s = c21795y.f33531c;
                AbstractC16544l.m18091d(abstractC21790tM22284s);
                Iterator it = c17662g.iterator();
                while (true) {
                    ListIterator listIterator = (ListIterator) ((C9545D) it).f28705Z;
                    if (listIterator.hasPrevious()) {
                        AbstractC21790t abstractC21790t2 = (AbstractC21790t) listIterator.previous();
                        if (!AbstractC16544l.m18089b(abstractC21790t2, c21795y.f33531c) || !AbstractC16544l.m18089b(abstractC21790tM22284s, graph)) {
                            if (abstractC21790tM22284s instanceof C21792v) {
                                abstractC21790tM22284s = ((C21792v) abstractC21790tM22284s).m22284s(abstractC21790t2.f69135r0, true);
                                AbstractC16544l.m18091d(abstractC21790tM22284s);
                            }
                        }
                    }
                }
                AbstractC16544l.m18094g(abstractC21790tM22284s, "<set-?>");
                c21778h.f69074Z = abstractC21790tM22284s;
            }
        } else {
            C21792v c21792v3 = c21795y.f33531c;
            LinkedHashMap linkedHashMap = c21795y.f33552x;
            if (c21792v3 != null) {
                Iterator it2 = new ArrayList(c21795y.f33542n.keySet()).iterator();
                while (it2.hasNext()) {
                    Integer id2 = (Integer) it2.next();
                    AbstractC16544l.m18093f(id2, "id");
                    int iIntValue = id2.intValue();
                    Iterator it3 = linkedHashMap.values().iterator();
                    while (it3.hasNext()) {
                        ((C21780j) it3.next()).f69092d = true;
                        it3 = it3;
                        it2 = it2;
                    }
                    Iterator it4 = it2;
                    boolean zM12200v = c21795y.m12200v(iIntValue, null, AbstractC8646i.m9320d(C21772b.f69057p0));
                    for (Iterator it5 = linkedHashMap.values().iterator(); it5.hasNext(); it5 = it5) {
                        ((C21780j) it5.next()).f69092d = false;
                    }
                    if (zM12200v) {
                        c21795y.m12197r(iIntValue, true, false);
                    }
                    it2 = it4;
                }
                c21795y.m12197r(c21792v3.f69135r0, true, false);
            }
            c21795y.f33531c = graph;
            Bundle bundle = c21795y.f33532d;
            if (bundle != null && (stringArrayList = bundle.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
                for (String name : stringArrayList) {
                    AbstractC16544l.m18093f(name, "name");
                    c21770l.m22262b(name);
                    bundle.getBundle(name);
                }
            }
            Parcelable[] parcelableArr = c21795y.f33533e;
            if (parcelableArr != null) {
                int length = parcelableArr.length;
                int i13 = 0;
                while (i13 < length) {
                    Parcelable parcelable = parcelableArr[i13];
                    AbstractC16544l.m18092e(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                    C21779i c21779i = (C21779i) parcelable;
                    int i14 = c21779i.f69086Z;
                    Parcelable[] parcelableArr2 = parcelableArr;
                    AbstractC21790t abstractC21790tM12186e = c21795y.m12186e(i14);
                    int i15 = length;
                    Context context = c21795y.f33529a;
                    if (abstractC21790tM12186e == null) {
                        int i16 = AbstractC21790t.f69129t0;
                        StringBuilder sbM11058p = AbstractC10763a.m11058p("Restoring the Navigation back stack failed: destination ", AbstractC8634g.m9294h(context, i14), " cannot be found from the current destination ");
                        sbM11058p.append(c21795y.m12188h());
                        throw new IllegalStateException(sbM11058p.toString());
                    }
                    C21778h c21778hM22266a = c21779i.m22266a(context, abstractC21790tM12186e, c21795y.m12191k(), c21795y.f33545q);
                    AbstractC21769K abstractC21769KM22262b = c21770l.m22262b(abstractC21790tM12186e.f69130Y);
                    Object obj5 = linkedHashMap.get(abstractC21769KM22262b);
                    if (obj5 == null) {
                        obj3 = obj5;
                        C21780j c21780j = new C21780j(c21795y, abstractC21769KM22262b);
                        linkedHashMap.put(abstractC21769KM22262b, c21780j);
                        obj3 = c21780j;
                    }
                    obj3 = obj5;
                    c17677k.addLast(c21778hM22266a);
                    ((C21780j) obj3).m22267a(c21778hM22266a);
                    C21792v c21792v4 = c21778hM22266a.f69074Z.f69131Z;
                    if (c21792v4 != null) {
                        c21795y.m12193m(c21778hM22266a, c21795y.m12187g(c21792v4.f69135r0));
                    }
                    i13++;
                    parcelableArr = parcelableArr2;
                    length = i15;
                }
                c21795y.m12203y();
                c21795y.f33533e = null;
            }
            Collection collectionValues = AbstractC17659D.m19254p(c21770l.f69054a).values();
            ArrayList<AbstractC21769K> arrayList = new ArrayList();
            for (Object obj6 : collectionValues) {
                if (!((AbstractC21769K) obj6).f69052b) {
                    arrayList.add(obj6);
                }
            }
            for (AbstractC21769K abstractC21769K : arrayList) {
                Object c21780j2 = linkedHashMap.get(abstractC21769K);
                if (c21780j2 == null) {
                    c21780j2 = new C21780j(c21795y, abstractC21769K);
                    linkedHashMap.put(abstractC21769K, c21780j2);
                }
                abstractC21769K.getClass();
                abstractC21769K.f69051a = (C21780j) c21780j2;
                abstractC21769K.f69052b = true;
            }
            if (c21795y.f33531c == null || !c17677k.isEmpty()) {
                c21795y.m12184c();
            } else if (c21795y.f33534f || (activity = c21795y.f33530b) == null || !c21795y.m12192l(activity.getIntent())) {
                C21792v c21792v5 = c21795y.f33531c;
                AbstractC16544l.m18091d(c21792v5);
                c21795y.m12194n(c21792v5, null, null);
            }
        }
        AbstractC21769K abstractC21769KM22262b2 = c21770l.m22262b("composable");
        C0347h c0347h = abstractC21769KM22262b2 instanceof C0347h ? (C0347h) abstractC21769KM22262b2 : null;
        if (c0347h == null) {
            C6018n0 c6018n0M6555r = c6021p.m6555r();
            if (c6018n0M6555r == null) {
                return;
            }
            c6018n0M6555r.f19536d = new C0336A(c21795y, graph, interfaceC10459q, interfaceC10446d, interfaceC1436k, interfaceC1436k2, interfaceC1436k3, interfaceC1436k4, i10, 1);
            return;
        }
        AbstractC8577W2.m9239a(0, 0, new C0130g(c21795y, 3), c6021p, ((List) C5997d.m6469y(c0347h.m22258b().f69093e, c6021p).getValue()).size() > 1);
        C5997d.m6444c(interfaceC11112u, new C0122V(c21795y, 8, interfaceC11112u), c6021p);
        C9013h c9013hM10488b = AbstractC9840Y3.m10488b(c6021p);
        InterfaceC5985X interfaceC5985XM6469y = C5997d.m6469y(c21795y.f33539k, c6021p);
        c6021p.m6525T(-492369756);
        Object objM6514H = c6021p.m6514H();
        C5975S c5975s = C6013l.f19514a;
        if (objM6514H == c5975s) {
            z6 = false;
            C5944C c5944cM6421H = C5997d.m6421H(new C0339D(interfaceC5985XM6469y, 0));
            c6021p.m6537c0(c5944cM6421H);
            obj = c5944cM6421H;
        } else {
            z6 = false;
            obj = objM6514H;
        }
        c6021p.m6553p(z6);
        InterfaceC5982V0 interfaceC5982V0 = (InterfaceC5982V0) obj;
        C21778h c21778h2 = (C21778h) AbstractC17680n.m19353c0((List) interfaceC5982V0.getValue());
        c6021p.m6525T(-492369756);
        Object objM6514H2 = c6021p.m6514H();
        Object obj7 = objM6514H2;
        if (objM6514H2 == c5975s) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            c6021p.m6537c0(linkedHashMap2);
            obj7 = linkedHashMap2;
        }
        c6021p.m6553p(false);
        Map map = (Map) obj7;
        c6021p.m6525T(1822177954);
        if (c21778h2 != null) {
            c6021p.m6525T(1618982084);
            boolean zM6542f = c6021p.m6542f(c0347h) | c6021p.m6542f(interfaceC1436k3) | c6021p.m6542f(interfaceC1436k);
            Object objM6514H3 = c6021p.m6514H();
            if (zM6542f || objM6514H3 == c5975s) {
                z10 = false;
                C0338C c0338c = new C0338C(c0347h, interfaceC1436k3, interfaceC1436k, false ? 1 : 0);
                c6021p.m6537c0(c0338c);
                obj2 = c0338c;
            } else {
                z10 = false;
                obj2 = objM6514H3;
            }
            c6021p.m6553p(z10);
            InterfaceC1436k interfaceC1436k5 = (InterfaceC1436k) obj2;
            c6021p.m6525T(1618982084);
            boolean zM6542f2 = c6021p.m6542f(c0347h) | c6021p.m6542f(interfaceC1436k4) | c6021p.m6542f(interfaceC1436k2);
            Object objM6514H4 = c6021p.m6514H();
            Object obj8 = objM6514H4;
            if (zM6542f2 || objM6514H4 == c5975s) {
                C0338C c0338c2 = new C0338C(c0347h, interfaceC1436k4, interfaceC1436k2, 1);
                c6021p.m6537c0(c0338c2);
                obj8 = c0338c2;
            }
            c6021p.m6553p(false);
            C13771k0 c13771k0M15291d = AbstractC13779o0.m15291d(c21778h2, "entry", c6021p, 56, 0);
            c0355p = null;
            r6 = 0;
            AbstractC8223w5.m8849a(c13771k0M15291d, interfaceC10459q, new C0362w(map, c0347h, interfaceC1436k5, (InterfaceC1436k) obj8, interfaceC5982V0, 0), interfaceC10446d, C0363x.f1245Y, AbstractC8411c.m8968b(-1440061047, c6021p, new C0364y(c9013hM10488b, 0, interfaceC5982V0)), c6021p, ((i10 >> 3) & 112) | 221184 | (i10 & 7168));
            C5997d.m6451g(c13771k0M15291d.m15272c(), c13771k0M15291d.f43492d.getValue(), new C0365z(c13771k0M15291d, map, interfaceC5982V0, c0347h, null), c6021p);
            Boolean bool = Boolean.TRUE;
            c6021p.m6525T(511388516);
            boolean zM6542f3 = c6021p.m6542f(interfaceC5982V0) | c6021p.m6542f(c0347h);
            Object objM6514H5 = c6021p.m6514H();
            Object obj9 = objM6514H5;
            if (zM6542f3 || objM6514H5 == c5975s) {
                C0122V c0122v = new C0122V(interfaceC5982V0, 9, c0347h);
                c6021p.m6537c0(c0122v);
                obj9 = c0122v;
            }
            c6021p.m6553p(false);
            C5997d.m6444c(bool, (InterfaceC1436k) obj9, c6021p);
        } else {
            r6 = 0;
            c0355p = null;
        }
        c6021p.m6553p(r6);
        AbstractC21769K abstractC21769KM22262b3 = c21770l.m22262b("dialog");
        C0355p c0355p2 = abstractC21769KM22262b3 instanceof C0355p ? (C0355p) abstractC21769KM22262b3 : c0355p;
        if (c0355p2 == null) {
            C6018n0 c6018n0M6555r2 = c6021p.m6555r();
            if (c6018n0M6555r2 == null) {
                return;
            }
            c6018n0M6555r2.f19536d = new C0336A(c21795y, graph, interfaceC10459q, interfaceC10446d, interfaceC1436k, interfaceC1436k2, interfaceC1436k3, interfaceC1436k4, i10, 2);
            return;
        }
        AbstractC5103c.m5665a(c0355p2, c6021p, r6);
        C6018n0 c6018n0M6555r3 = c6021p.m6555r();
        if (c6018n0M6555r3 == null) {
            return;
        }
        c6018n0M6555r3.f19536d = new C0336A(c21795y, graph, interfaceC10459q, interfaceC10446d, interfaceC1436k, interfaceC1436k2, interfaceC1436k3, interfaceC1436k4, i10, 0);
    }

    /* JADX INFO: renamed from: d */
    public static void m7398d(C10470g c10470g, C10471h anchor, float f10, int i10) {
        if ((i10 & 2) != 0) {
            f10 = 0;
        }
        c10470g.getClass();
        AbstractC16544l.m18094g(anchor, "anchor");
        c10470g.f31010a.add(new C10467d(c10470g, anchor, f10, 0, 0));
    }
}
