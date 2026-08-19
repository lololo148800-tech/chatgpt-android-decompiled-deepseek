package androidx.fragment.app;

import android.app.Activity;
import android.gov.nist.core.LexerCore;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC11002c;
import androidx.lifecycle.EnumC11104m;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.openai.chatgpt.R;
import fo.C13711h;
import io.sentry.android.core.AbstractC15256t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.C0199Q0;
import p003A1.RunnableC0153B;
import p004A2.InterfaceC0310a;
import p030B2.InterfaceC0771n;
import p1009s9.C19506i;
import p183H4.C3231f;
import p183H4.InterfaceC3232g;
import p385Pj.C6427b;
import p451Sb.C7102a;
import p523V9.AbstractC8138m0;
import p571X9.AbstractC9306j0;
import p588Y2.AbstractC9639w;
import p588Y2.C9597A;
import p588Y2.C9598B;
import p588Y2.C9599C;
import p588Y2.C9601E;
import p588Y2.C9606J;
import p588Y2.C9607K;
import p588Y2.C9609M;
import p588Y2.C9610N;
import p588Y2.C9612P;
import p588Y2.C9614S;
import p588Y2.C9617a;
import p588Y2.C9618b;
import p588Y2.C9619c;
import p588Y2.C9624h;
import p588Y2.C9633q;
import p588Y2.C9637u;
import p588Y2.C9641y;
import p588Y2.C9642z;
import p588Y2.InterfaceC9604H;
import p588Y2.InterfaceC9608L;
import p588Y2.LayoutInflaterFactory2C9640x;
import p594Y9.AbstractC9991w4;
import p611Z2.AbstractC10151d;
import p658b5.C11234e;
import p772h.C14215F;
import p772h.C14227i;
import p772h.InterfaceC14216G;
import p817j$.util.DesugarCollections;
import p841k.C16288h;
import p841k.InterfaceC16289i;
import p896n2.C17457j;
import p896n2.C17472y;
import p896n2.InterfaceC17470w;
import p896n2.InterfaceC17471x;
import p913o2.InterfaceC17808i;
import p913o2.InterfaceC17809j;
import p960q9.C18655i;

/* JADX INFO: renamed from: androidx.fragment.app.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11002c {

    /* JADX INFO: renamed from: A */
    public C16288h f33170A;

    /* JADX INFO: renamed from: B */
    public C16288h f33171B;

    /* JADX INFO: renamed from: C */
    public C16288h f33172C;

    /* JADX INFO: renamed from: E */
    public boolean f33174E;

    /* JADX INFO: renamed from: F */
    public boolean f33175F;

    /* JADX INFO: renamed from: G */
    public boolean f33176G;

    /* JADX INFO: renamed from: H */
    public boolean f33177H;

    /* JADX INFO: renamed from: I */
    public boolean f33178I;

    /* JADX INFO: renamed from: J */
    public ArrayList f33179J;

    /* JADX INFO: renamed from: K */
    public ArrayList f33180K;

    /* JADX INFO: renamed from: L */
    public ArrayList f33181L;

    /* JADX INFO: renamed from: M */
    public FragmentManagerViewModel f33182M;

    /* JADX INFO: renamed from: b */
    public boolean f33185b;

    /* JADX INFO: renamed from: d */
    public ArrayList f33187d;

    /* JADX INFO: renamed from: e */
    public ArrayList f33188e;

    /* JADX INFO: renamed from: g */
    public C14215F f33190g;

    /* JADX INFO: renamed from: h */
    public final C9597A f33191h;

    /* JADX INFO: renamed from: o */
    public final C9641y f33198o;

    /* JADX INFO: renamed from: p */
    public final C9641y f33199p;

    /* JADX INFO: renamed from: q */
    public final C9641y f33200q;

    /* JADX INFO: renamed from: r */
    public final C9641y f33201r;

    /* JADX INFO: renamed from: u */
    public C9637u f33204u;

    /* JADX INFO: renamed from: v */
    public AbstractC9639w f33205v;

    /* JADX INFO: renamed from: w */
    public AbstractComponentCallbacksC11000a f33206w;

    /* JADX INFO: renamed from: x */
    public AbstractComponentCallbacksC11000a f33207x;

    /* JADX INFO: renamed from: a */
    public final ArrayList f33184a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final C11004e f33186c = new C11004e();

    /* JADX INFO: renamed from: f */
    public final LayoutInflaterFactory2C9640x f33189f = new LayoutInflaterFactory2C9640x(this);

    /* JADX INFO: renamed from: i */
    public final AtomicInteger f33192i = new AtomicInteger();

    /* JADX INFO: renamed from: j */
    public final Map f33193j = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: k */
    public final Map f33194k = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: l */
    public final Map f33195l = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m */
    public final C11234e f33196m = new C11234e(this);

    /* JADX INFO: renamed from: n */
    public final CopyOnWriteArrayList f33197n = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: s */
    public final C9598B f33202s = new C9598B(this);

    /* JADX INFO: renamed from: t */
    public int f33203t = -1;

    /* JADX INFO: renamed from: y */
    public final C9599C f33208y = new C9599C(this);

    /* JADX INFO: renamed from: z */
    public final C7102a f33209z = new C7102a(20);

    /* JADX INFO: renamed from: D */
    public ArrayDeque f33173D = new ArrayDeque();

    /* JADX INFO: renamed from: N */
    public final RunnableC0153B f33183N = new RunnableC0153B(this, 15);

    /* JADX WARN: Type inference failed for: r0v13, types: [Y2.y] */
    /* JADX WARN: Type inference failed for: r0v14, types: [Y2.y] */
    /* JADX WARN: Type inference failed for: r0v15, types: [Y2.y] */
    /* JADX WARN: Type inference failed for: r0v16, types: [Y2.y] */
    public AbstractC11002c() {
        final int i10 = 0;
        this.f33191h = new C9597A(this, i10);
        this.f33198o = new InterfaceC0310a(this) { // from class: Y2.y

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC11002c f29062b;

            {
                this.f29062b = this;
            }

            @Override // p004A2.InterfaceC0310a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        AbstractC11002c abstractC11002c = this.f29062b;
                        if (abstractC11002c.m11773H()) {
                            abstractC11002c.m11798h(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC11002c abstractC11002c2 = this.f29062b;
                        if (abstractC11002c2.m11773H() && num.intValue() == 80) {
                            abstractC11002c2.m11802l(false);
                            break;
                        }
                        break;
                    case 2:
                        C17457j c17457j = (C17457j) obj;
                        AbstractC11002c abstractC11002c3 = this.f29062b;
                        if (abstractC11002c3.m11773H()) {
                            abstractC11002c3.m11803m(c17457j.f55810a, false);
                        }
                        break;
                    default:
                        C17472y c17472y = (C17472y) obj;
                        AbstractC11002c abstractC11002c4 = this.f29062b;
                        if (abstractC11002c4.m11773H()) {
                            abstractC11002c4.m11808r(c17472y.f55845a, false);
                        }
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f33199p = new InterfaceC0310a(this) { // from class: Y2.y

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC11002c f29062b;

            {
                this.f29062b = this;
            }

            @Override // p004A2.InterfaceC0310a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        AbstractC11002c abstractC11002c = this.f29062b;
                        if (abstractC11002c.m11773H()) {
                            abstractC11002c.m11798h(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC11002c abstractC11002c2 = this.f29062b;
                        if (abstractC11002c2.m11773H() && num.intValue() == 80) {
                            abstractC11002c2.m11802l(false);
                            break;
                        }
                        break;
                    case 2:
                        C17457j c17457j = (C17457j) obj;
                        AbstractC11002c abstractC11002c3 = this.f29062b;
                        if (abstractC11002c3.m11773H()) {
                            abstractC11002c3.m11803m(c17457j.f55810a, false);
                        }
                        break;
                    default:
                        C17472y c17472y = (C17472y) obj;
                        AbstractC11002c abstractC11002c4 = this.f29062b;
                        if (abstractC11002c4.m11773H()) {
                            abstractC11002c4.m11808r(c17472y.f55845a, false);
                        }
                        break;
                }
            }
        };
        final int i12 = 2;
        this.f33200q = new InterfaceC0310a(this) { // from class: Y2.y

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC11002c f29062b;

            {
                this.f29062b = this;
            }

            @Override // p004A2.InterfaceC0310a
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        AbstractC11002c abstractC11002c = this.f29062b;
                        if (abstractC11002c.m11773H()) {
                            abstractC11002c.m11798h(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC11002c abstractC11002c2 = this.f29062b;
                        if (abstractC11002c2.m11773H() && num.intValue() == 80) {
                            abstractC11002c2.m11802l(false);
                            break;
                        }
                        break;
                    case 2:
                        C17457j c17457j = (C17457j) obj;
                        AbstractC11002c abstractC11002c3 = this.f29062b;
                        if (abstractC11002c3.m11773H()) {
                            abstractC11002c3.m11803m(c17457j.f55810a, false);
                        }
                        break;
                    default:
                        C17472y c17472y = (C17472y) obj;
                        AbstractC11002c abstractC11002c4 = this.f29062b;
                        if (abstractC11002c4.m11773H()) {
                            abstractC11002c4.m11808r(c17472y.f55845a, false);
                        }
                        break;
                }
            }
        };
        final int i13 = 3;
        this.f33201r = new InterfaceC0310a(this) { // from class: Y2.y

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractC11002c f29062b;

            {
                this.f29062b = this;
            }

            @Override // p004A2.InterfaceC0310a
            public final void accept(Object obj) {
                switch (i13) {
                    case 0:
                        AbstractC11002c abstractC11002c = this.f29062b;
                        if (abstractC11002c.m11773H()) {
                            abstractC11002c.m11798h(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        AbstractC11002c abstractC11002c2 = this.f29062b;
                        if (abstractC11002c2.m11773H() && num.intValue() == 80) {
                            abstractC11002c2.m11802l(false);
                            break;
                        }
                        break;
                    case 2:
                        C17457j c17457j = (C17457j) obj;
                        AbstractC11002c abstractC11002c3 = this.f29062b;
                        if (abstractC11002c3.m11773H()) {
                            abstractC11002c3.m11803m(c17457j.f55810a, false);
                        }
                        break;
                    default:
                        C17472y c17472y = (C17472y) obj;
                        AbstractC11002c abstractC11002c4 = this.f29062b;
                        if (abstractC11002c4.m11773H()) {
                            abstractC11002c4.m11808r(c17472y.f55845a, false);
                        }
                        break;
                }
            }
        };
    }

    /* JADX INFO: renamed from: G */
    public static boolean m11763G(AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a) {
        abstractComponentCallbacksC11000a.getClass();
        boolean zM11763G = false;
        for (AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a2 : abstractComponentCallbacksC11000a.f33124F0.f33186c.m11838e()) {
            if (abstractComponentCallbacksC11000a2 != null) {
                zM11763G = m11763G(abstractComponentCallbacksC11000a2);
            }
            if (zM11763G) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: I */
    public static boolean m11764I(AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a) {
        if (abstractComponentCallbacksC11000a == null) {
            return true;
        }
        return abstractComponentCallbacksC11000a.f33132N0 && (abstractComponentCallbacksC11000a.f33122D0 == null || m11764I(abstractComponentCallbacksC11000a.f33125G0));
    }

    /* JADX INFO: renamed from: J */
    public static boolean m11765J(AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a) {
        if (abstractComponentCallbacksC11000a == null) {
            return true;
        }
        AbstractC11002c abstractC11002c = abstractComponentCallbacksC11000a.f33122D0;
        return abstractComponentCallbacksC11000a.equals(abstractC11002c.f33207x) && m11765J(abstractC11002c.f33206w);
    }

    /* JADX INFO: renamed from: Y */
    public static void m11766Y(AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC11000a);
        }
        if (abstractComponentCallbacksC11000a.f33129K0) {
            abstractComponentCallbacksC11000a.f33129K0 = false;
            abstractComponentCallbacksC11000a.f33139U0 = !abstractComponentCallbacksC11000a.f33139U0;
        }
    }

    /* JADX INFO: renamed from: A */
    public final AbstractComponentCallbacksC11000a m11767A(int i10) {
        C11004e c11004e = this.f33186c;
        ArrayList arrayList = c11004e.f33215a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = (AbstractComponentCallbacksC11000a) arrayList.get(size);
            if (abstractComponentCallbacksC11000a != null && abstractComponentCallbacksC11000a.f33126H0 == i10) {
                return abstractComponentCallbacksC11000a;
            }
        }
        for (C11003d c11003d : c11004e.f33216b.values()) {
            if (c11003d != null) {
                AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a2 = c11003d.f33212c;
                if (abstractComponentCallbacksC11000a2.f33126H0 == i10) {
                    return abstractComponentCallbacksC11000a2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public final AbstractComponentCallbacksC11000a m11768B(String str) {
        C11004e c11004e = this.f33186c;
        ArrayList arrayList = c11004e.f33215a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = (AbstractComponentCallbacksC11000a) arrayList.get(size);
            if (abstractComponentCallbacksC11000a != null && str.equals(abstractComponentCallbacksC11000a.f33128J0)) {
                return abstractComponentCallbacksC11000a;
            }
        }
        for (C11003d c11003d : c11004e.f33216b.values()) {
            if (c11003d != null) {
                AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a2 = c11003d.f33212c;
                if (str.equals(abstractComponentCallbacksC11000a2.f33128J0)) {
                    return abstractComponentCallbacksC11000a2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: C */
    public final ViewGroup m11769C(AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a) {
        ViewGroup viewGroup = abstractComponentCallbacksC11000a.f33134P0;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC11000a.f33127I0 > 0 && this.f33205v.mo10174f()) {
            View viewMo10173c = this.f33205v.mo10173c(abstractComponentCallbacksC11000a.f33127I0);
            if (viewMo10173c instanceof ViewGroup) {
                return (ViewGroup) viewMo10173c;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: D */
    public final C9599C m11770D() {
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = this.f33206w;
        return abstractComponentCallbacksC11000a != null ? abstractComponentCallbacksC11000a.f33122D0.m11770D() : this.f33208y;
    }

    /* JADX INFO: renamed from: E */
    public final C7102a m11771E() {
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = this.f33206w;
        return abstractComponentCallbacksC11000a != null ? abstractComponentCallbacksC11000a.f33122D0.m11771E() : this.f33209z;
    }

    /* JADX INFO: renamed from: F */
    public final void m11772F(AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC11000a);
        }
        if (abstractComponentCallbacksC11000a.f33129K0) {
            return;
        }
        abstractComponentCallbacksC11000a.f33129K0 = true;
        abstractComponentCallbacksC11000a.f33139U0 = true ^ abstractComponentCallbacksC11000a.f33139U0;
        m11787X(abstractComponentCallbacksC11000a);
    }

    /* JADX INFO: renamed from: H */
    public final boolean m11773H() {
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = this.f33206w;
        if (abstractComponentCallbacksC11000a == null) {
            return true;
        }
        return abstractComponentCallbacksC11000a.m11757t() && this.f33206w.m11754q().m11773H();
    }

    /* JADX INFO: renamed from: K */
    public final void m11774K(int i10, boolean z6) {
        HashMap map;
        C9637u c9637u;
        if (this.f33204u == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z6 || i10 != this.f33203t) {
            this.f33203t = i10;
            C11004e c11004e = this.f33186c;
            Iterator it = c11004e.f33215a.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = c11004e.f33216b;
                if (!zHasNext) {
                    break;
                }
                C11003d c11003d = (C11003d) map.get(((AbstractComponentCallbacksC11000a) it.next()).f33155q0);
                if (c11003d != null) {
                    c11003d.m11827k();
                }
            }
            for (C11003d c11003d2 : map.values()) {
                if (c11003d2 != null) {
                    c11003d2.m11827k();
                    AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = c11003d2.f33212c;
                    if (abstractComponentCallbacksC11000a.f33162x0 && !abstractComponentCallbacksC11000a.m11759v()) {
                        c11004e.m11841h(c11003d2);
                    }
                }
            }
            m11788Z();
            if (this.f33174E && (c9637u = this.f33204u) != null && this.f33203t == 7) {
                c9637u.f29054q0.invalidateOptionsMenu();
                this.f33174E = false;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m11775L() {
        if (this.f33204u == null) {
            return;
        }
        this.f33175F = false;
        this.f33176G = false;
        this.f33182M.f33117g = false;
        for (AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a : this.f33186c.m11839f()) {
            if (abstractComponentCallbacksC11000a != null) {
                abstractComponentCallbacksC11000a.f33124F0.m11775L();
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public final boolean m11776M() {
        return m11777N(-1, 0);
    }

    /* JADX INFO: renamed from: N */
    public final boolean m11777N(int i10, int i11) {
        m11815y(false);
        m11814x(true);
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = this.f33207x;
        if (abstractComponentCallbacksC11000a != null && i10 < 0 && abstractComponentCallbacksC11000a.m11751n().m11776M()) {
            return true;
        }
        boolean zM11778O = m11778O(this.f33179J, this.f33180K, i10, i11);
        if (zM11778O) {
            this.f33185b = true;
            try {
                m11780Q(this.f33179J, this.f33180K);
                m11794d();
            } catch (Throwable th2) {
                m11794d();
                throw th2;
            }
        }
        m11792b0();
        m11811u();
        this.f33186c.f33216b.values().removeAll(Collections.singleton(null));
        return zM11778O;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m11778O(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        boolean z6 = (i11 & 1) != 0;
        ArrayList arrayList3 = this.f33187d;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i10 < 0) {
                size = z6 ? 0 : this.f33187d.size() - 1;
            } else {
                int size2 = this.f33187d.size() - 1;
                while (size2 >= 0) {
                    C9617a c9617a = (C9617a) this.f33187d.get(size2);
                    if (i10 >= 0 && i10 == c9617a.f28974r) {
                        break;
                    }
                    size2--;
                }
                if (size2 >= 0) {
                    if (z6) {
                        while (size2 > 0) {
                            C9617a c9617a2 = (C9617a) this.f33187d.get(size2 - 1);
                            if (i10 < 0 || i10 != c9617a2.f28974r) {
                                break;
                            }
                            size2--;
                        }
                    } else if (size2 != this.f33187d.size() - 1) {
                        size2++;
                    }
                    size = size2;
                } else {
                    size = size2;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f33187d.size() - 1; size3 >= size; size3--) {
            arrayList.add((C9617a) this.f33187d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX INFO: renamed from: P */
    public final void m11779P(AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC11000a + " nesting=" + abstractComponentCallbacksC11000a.f33121C0);
        }
        boolean zM11759v = abstractComponentCallbacksC11000a.m11759v();
        if (abstractComponentCallbacksC11000a.f33130L0 && zM11759v) {
            return;
        }
        C11004e c11004e = this.f33186c;
        synchronized (c11004e.f33215a) {
            c11004e.f33215a.remove(abstractComponentCallbacksC11000a);
        }
        abstractComponentCallbacksC11000a.f33161w0 = false;
        if (m11763G(abstractComponentCallbacksC11000a)) {
            this.f33174E = true;
        }
        abstractComponentCallbacksC11000a.f33162x0 = true;
        m11787X(abstractComponentCallbacksC11000a);
    }

    /* JADX INFO: renamed from: Q */
    public final void m11780Q(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!((C9617a) arrayList.get(i10)).f28971o) {
                if (i11 != i10) {
                    m11816z(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                    while (i11 < size && ((Boolean) arrayList2.get(i11)).booleanValue() && !((C9617a) arrayList.get(i11)).f28971o) {
                        i11++;
                    }
                }
                m11816z(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            m11816z(arrayList, arrayList2, i11, size);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m11781R(Bundle bundle) {
        int i10;
        C11234e c11234e;
        int i11;
        C11003d c11003d;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f33204u.f29051Z.getClassLoader());
                this.f33194k.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f33204u.f29051Z.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        C11004e c11004e = this.f33186c;
        HashMap map2 = c11004e.f33217c;
        map2.clear();
        map2.putAll(map);
        C9607K c9607k = (C9607K) bundle.getParcelable("state");
        if (c9607k == null) {
            return;
        }
        HashMap map3 = c11004e.f33216b;
        map3.clear();
        Iterator it = c9607k.f28906Y.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i10 = 2;
            c11234e = this.f33196m;
            if (!zHasNext) {
                break;
            }
            Bundle bundleM11842i = c11004e.m11842i((String) it.next(), null);
            if (bundleM11842i != null) {
                AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = (AbstractComponentCallbacksC11000a) this.f33182M.f33112b.get(((C9609M) bundleM11842i.getParcelable("state")).f28915Z);
                if (abstractComponentCallbacksC11000a != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC11000a);
                    }
                    c11003d = new C11003d(c11234e, c11004e, abstractComponentCallbacksC11000a, bundleM11842i);
                } else {
                    c11003d = new C11003d(this.f33196m, this.f33186c, this.f33204u.f29051Z.getClassLoader(), m11770D(), bundleM11842i);
                }
                AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a2 = c11003d.f33212c;
                abstractComponentCallbacksC11000a2.f33145Z = bundleM11842i;
                abstractComponentCallbacksC11000a2.f33122D0 = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC11000a2.f33155q0 + "): " + abstractComponentCallbacksC11000a2);
                }
                c11003d.m11829m(this.f33204u.f29051Z.getClassLoader());
                c11004e.m11840g(c11003d);
                c11003d.f33214e = this.f33203t;
            }
        }
        FragmentManagerViewModel fragmentManagerViewModel = this.f33182M;
        fragmentManagerViewModel.getClass();
        for (AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a3 : new ArrayList(fragmentManagerViewModel.f33112b.values())) {
            if (map3.get(abstractComponentCallbacksC11000a3.f33155q0) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC11000a3 + " that was not found in the set of active Fragments " + c9607k.f28906Y);
                }
                this.f33182M.m11738i(abstractComponentCallbacksC11000a3);
                abstractComponentCallbacksC11000a3.f33122D0 = this;
                C11003d c11003d2 = new C11003d(c11234e, c11004e, abstractComponentCallbacksC11000a3);
                c11003d2.f33214e = 1;
                c11003d2.m11827k();
                abstractComponentCallbacksC11000a3.f33162x0 = true;
                c11003d2.m11827k();
            }
        }
        ArrayList<String> arrayList = c9607k.f28907Z;
        c11004e.f33215a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000aM11835b = c11004e.m11835b(str3);
                if (abstractComponentCallbacksC11000aM11835b == null) {
                    throw new IllegalStateException(AbstractC10763a.m11054l("No instantiated fragment for (", str3, Separators.RPAREN));
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + abstractComponentCallbacksC11000aM11835b);
                }
                c11004e.m11834a(abstractComponentCallbacksC11000aM11835b);
            }
        }
        if (c9607k.f28908o0 != null) {
            this.f33187d = new ArrayList(c9607k.f28908o0.length);
            int i12 = 0;
            while (true) {
                C9618b[] c9618bArr = c9607k.f28908o0;
                if (i12 >= c9618bArr.length) {
                    break;
                }
                C9618b c9618b = c9618bArr[i12];
                c9618b.getClass();
                C9617a c9617a = new C9617a(this);
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    int[] iArr = c9618b.f28975Y;
                    if (i13 >= iArr.length) {
                        break;
                    }
                    C9610N c9610n = new C9610N();
                    int i15 = i13 + 1;
                    c9610n.f28928a = iArr[i13];
                    if (Log.isLoggable("FragmentManager", i10)) {
                        Log.v("FragmentManager", "Instantiate " + c9617a + " op #" + i14 + " base fragment #" + iArr[i15]);
                    }
                    c9610n.f28935h = EnumC11104m.values()[c9618b.f28977o0[i14]];
                    c9610n.f28936i = EnumC11104m.values()[c9618b.f28978p0[i14]];
                    int i16 = i13 + 2;
                    c9610n.f28930c = iArr[i15] != 0;
                    int i17 = iArr[i16];
                    c9610n.f28931d = i17;
                    int i18 = iArr[i13 + 3];
                    c9610n.f28932e = i18;
                    int i19 = i13 + 5;
                    int i20 = iArr[i13 + 4];
                    c9610n.f28933f = i20;
                    i13 += 6;
                    int i21 = iArr[i19];
                    c9610n.f28934g = i21;
                    c9617a.f28958b = i17;
                    c9617a.f28959c = i18;
                    c9617a.f28960d = i20;
                    c9617a.f28961e = i21;
                    c9617a.m10159b(c9610n);
                    i14++;
                    i10 = 2;
                }
                c9617a.f28962f = c9618b.f28979q0;
                c9617a.f28964h = c9618b.f28980r0;
                c9617a.f28963g = true;
                c9617a.f28965i = c9618b.f28982t0;
                c9617a.f28966j = c9618b.f28983u0;
                c9617a.f28967k = c9618b.f28984v0;
                c9617a.f28968l = c9618b.f28985w0;
                c9617a.f28969m = c9618b.f28986x0;
                c9617a.f28970n = c9618b.f28987y0;
                c9617a.f28971o = c9618b.f28988z0;
                c9617a.f28974r = c9618b.f28981s0;
                int i22 = 0;
                while (true) {
                    ArrayList arrayList2 = c9618b.f28976Z;
                    if (i22 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = (String) arrayList2.get(i22);
                    if (str4 != null) {
                        ((C9610N) c9617a.f28957a.get(i22)).f28929b = c11004e.m11835b(str4);
                    }
                    i22++;
                }
                c9617a.m10160c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    StringBuilder sbM11057o = AbstractC10763a.m11057o(i12, "restoreAllState: back stack #", " (index ");
                    sbM11057o.append(c9617a.f28974r);
                    sbM11057o.append("): ");
                    sbM11057o.append(c9617a);
                    Log.v("FragmentManager", sbM11057o.toString());
                    PrintWriter printWriter = new PrintWriter(new C9612P());
                    c9617a.m10163f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f33187d.add(c9617a);
                i12++;
                i10 = 2;
            }
            i11 = 0;
        } else {
            i11 = 0;
            this.f33187d = null;
        }
        this.f33192i.set(c9607k.f28909p0);
        String str5 = c9607k.f28910q0;
        if (str5 != null) {
            AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000aM11835b2 = c11004e.m11835b(str5);
            this.f33207x = abstractComponentCallbacksC11000aM11835b2;
            m11807q(abstractComponentCallbacksC11000aM11835b2);
        }
        ArrayList arrayList3 = c9607k.f28911r0;
        if (arrayList3 != null) {
            for (int i23 = i11; i23 < arrayList3.size(); i23++) {
                this.f33193j.put((String) arrayList3.get(i23), (C9619c) c9607k.f28912s0.get(i23));
            }
        }
        this.f33173D = new ArrayDeque(c9607k.f28913t0);
    }

    /* JADX INFO: renamed from: S */
    public final Bundle m11782S() {
        int i10;
        ArrayList arrayList;
        C9618b[] c9618bArr;
        int size;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Iterator it = m11795e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C9624h c9624h = (C9624h) it.next();
            if (c9624h.f29007e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c9624h.f29007e = false;
                c9624h.m10169d();
            }
        }
        Iterator it2 = m11795e().iterator();
        while (it2.hasNext()) {
            ((C9624h) it2.next()).m10171f();
        }
        m11815y(true);
        this.f33175F = true;
        this.f33182M.f33117g = true;
        C11004e c11004e = this.f33186c;
        c11004e.getClass();
        HashMap map = c11004e.f33216b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (C11003d c11003d : map.values()) {
            if (c11003d != null) {
                AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = c11003d.f33212c;
                String str = abstractComponentCallbacksC11000a.f33155q0;
                Bundle bundle3 = new Bundle();
                AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a2 = c11003d.f33212c;
                if (abstractComponentCallbacksC11000a2.f33143Y == -1 && (bundle = abstractComponentCallbacksC11000a2.f33145Z) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new C9609M(abstractComponentCallbacksC11000a2));
                if (abstractComponentCallbacksC11000a2.f33143Y > -1) {
                    Bundle bundle4 = new Bundle();
                    abstractComponentCallbacksC11000a2.mo10178G(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    c11003d.f33210a.m12515o(false);
                    Bundle bundle5 = new Bundle();
                    abstractComponentCallbacksC11000a2.f33149c1.m351u(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle bundleM11782S = abstractComponentCallbacksC11000a2.f33124F0.m11782S();
                    if (!bundleM11782S.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", bundleM11782S);
                    }
                    if (abstractComponentCallbacksC11000a2.f33135Q0 != null) {
                        c11003d.m11831o();
                    }
                    SparseArray<? extends Parcelable> sparseArray = abstractComponentCallbacksC11000a2.f33153o0;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = abstractComponentCallbacksC11000a2.f33154p0;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = abstractComponentCallbacksC11000a2.f33156r0;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                c11004e.m11842i(str, bundle3);
                arrayList2.add(abstractComponentCallbacksC11000a.f33155q0);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC11000a + ": " + abstractComponentCallbacksC11000a.f33145Z);
                }
            }
        }
        HashMap map2 = this.f33186c.f33217c;
        if (!map2.isEmpty()) {
            C11004e c11004e2 = this.f33186c;
            synchronized (c11004e2.f33215a) {
                try {
                    if (c11004e2.f33215a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(c11004e2.f33215a.size());
                        for (AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a3 : c11004e2.f33215a) {
                            arrayList.add(abstractComponentCallbacksC11000a3.f33155q0);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC11000a3.f33155q0 + "): " + abstractComponentCallbacksC11000a3);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            ArrayList arrayList3 = this.f33187d;
            if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                c9618bArr = null;
            } else {
                c9618bArr = new C9618b[size];
                for (i10 = 0; i10 < size; i10++) {
                    c9618bArr[i10] = new C9618b((C9617a) this.f33187d.get(i10));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "saveAllState: adding back stack #", ": ");
                        sbM11057o.append(this.f33187d.get(i10));
                        Log.v("FragmentManager", sbM11057o.toString());
                    }
                }
            }
            C9607K c9607k = new C9607K();
            c9607k.f28910q0 = null;
            ArrayList arrayList4 = new ArrayList();
            c9607k.f28911r0 = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            c9607k.f28912s0 = arrayList5;
            c9607k.f28906Y = arrayList2;
            c9607k.f28907Z = arrayList;
            c9607k.f28908o0 = c9618bArr;
            c9607k.f28909p0 = this.f33192i.get();
            AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a4 = this.f33207x;
            if (abstractComponentCallbacksC11000a4 != null) {
                c9607k.f28910q0 = abstractComponentCallbacksC11000a4.f33155q0;
            }
            arrayList4.addAll(this.f33193j.keySet());
            arrayList5.addAll(this.f33193j.values());
            c9607k.f28913t0 = new ArrayList(this.f33173D);
            bundle2.putParcelable("state", c9607k);
            for (String str2 : this.f33194k.keySet()) {
                bundle2.putBundle(AbstractC9306j0.m9889h("result_", str2), (Bundle) this.f33194k.get(str2));
            }
            for (String str3 : map2.keySet()) {
                bundle2.putBundle(AbstractC9306j0.m9889h("fragment_", str3), (Bundle) map2.get(str3));
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: T */
    public final void m11783T() {
        synchronized (this.f33184a) {
            try {
                if (this.f33184a.size() == 1) {
                    this.f33204u.f29052o0.removeCallbacks(this.f33183N);
                    this.f33204u.f29052o0.post(this.f33183N);
                    m11792b0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m11784U(AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a, boolean z6) {
        ViewGroup viewGroupM11769C = m11769C(abstractComponentCallbacksC11000a);
        if (viewGroupM11769C == null || !(viewGroupM11769C instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupM11769C).setDrawDisappearingViewsLast(!z6);
    }

    /* JADX INFO: renamed from: V */
    public final void m11785V(AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a, EnumC11104m enumC11104m) {
        if (abstractComponentCallbacksC11000a.equals(this.f33186c.m11835b(abstractComponentCallbacksC11000a.f33155q0)) && (abstractComponentCallbacksC11000a.f33123E0 == null || abstractComponentCallbacksC11000a.f33122D0 == this)) {
            abstractComponentCallbacksC11000a.f33142X0 = enumC11104m;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC11000a + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX INFO: renamed from: W */
    public final void m11786W(AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a) {
        if (abstractComponentCallbacksC11000a != null) {
            if (!abstractComponentCallbacksC11000a.equals(this.f33186c.m11835b(abstractComponentCallbacksC11000a.f33155q0)) || (abstractComponentCallbacksC11000a.f33123E0 != null && abstractComponentCallbacksC11000a.f33122D0 != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC11000a + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a2 = this.f33207x;
        this.f33207x = abstractComponentCallbacksC11000a;
        m11807q(abstractComponentCallbacksC11000a2);
        m11807q(this.f33207x);
    }

    /* JADX INFO: renamed from: X */
    public final void m11787X(AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a) {
        ViewGroup viewGroupM11769C = m11769C(abstractComponentCallbacksC11000a);
        if (viewGroupM11769C != null) {
            C9633q c9633q = abstractComponentCallbacksC11000a.f33138T0;
            if ((c9633q == null ? 0 : c9633q.f29039e) + (c9633q == null ? 0 : c9633q.f29038d) + (c9633q == null ? 0 : c9633q.f29037c) + (c9633q == null ? 0 : c9633q.f29036b) > 0) {
                if (viewGroupM11769C.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupM11769C.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC11000a);
                }
                AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a2 = (AbstractComponentCallbacksC11000a) viewGroupM11769C.getTag(R.id.visible_removing_fragment_view_tag);
                C9633q c9633q2 = abstractComponentCallbacksC11000a.f33138T0;
                boolean z6 = c9633q2 != null ? c9633q2.f29035a : false;
                if (abstractComponentCallbacksC11000a2.f33138T0 == null) {
                    return;
                }
                abstractComponentCallbacksC11000a2.m11749l().f29035a = z6;
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m11788Z() {
        for (C11003d c11003d : this.f33186c.m11837d()) {
            AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = c11003d.f33212c;
            if (abstractComponentCallbacksC11000a.f33136R0) {
                if (this.f33185b) {
                    this.f33178I = true;
                } else {
                    abstractComponentCallbacksC11000a.f33136R0 = false;
                    c11003d.m11827k();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final C11003d m11789a(AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a) {
        String str = abstractComponentCallbacksC11000a.f33141W0;
        if (str != null) {
            AbstractC10151d.m10751c(abstractComponentCallbacksC11000a, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC11000a);
        }
        C11003d c11003dM11796f = m11796f(abstractComponentCallbacksC11000a);
        abstractComponentCallbacksC11000a.f33122D0 = this;
        C11004e c11004e = this.f33186c;
        c11004e.m11840g(c11003dM11796f);
        if (!abstractComponentCallbacksC11000a.f33130L0) {
            c11004e.m11834a(abstractComponentCallbacksC11000a);
            abstractComponentCallbacksC11000a.f33162x0 = false;
            if (abstractComponentCallbacksC11000a.f33135Q0 == null) {
                abstractComponentCallbacksC11000a.f33139U0 = false;
            }
            if (m11763G(abstractComponentCallbacksC11000a)) {
                this.f33174E = true;
            }
        }
        return c11003dM11796f;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m11790a0(IllegalStateException illegalStateException) {
        AbstractC15256t.m16465c("FragmentManager", illegalStateException.getMessage());
        AbstractC15256t.m16465c("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C9612P());
        C9637u c9637u = this.f33204u;
        if (c9637u == null) {
            try {
                m11812v("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e10) {
                AbstractC15256t.m16466d("FragmentManager", "Failed dumping state", e10);
                throw illegalStateException;
            }
        }
        try {
            c9637u.f29054q0.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e11) {
            AbstractC15256t.m16466d("FragmentManager", "Failed dumping state", e11);
            throw illegalStateException;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11791b(C9637u c9637u, AbstractC9639w abstractC9639w, AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a) {
        String strM9891j;
        int i10 = 2;
        int i11 = 0;
        if (this.f33204u != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f33204u = c9637u;
        this.f33205v = abstractC9639w;
        this.f33206w = abstractComponentCallbacksC11000a;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f33197n;
        if (abstractComponentCallbacksC11000a != null) {
            copyOnWriteArrayList.add(new C9601E(abstractComponentCallbacksC11000a));
        } else if (c9637u instanceof InterfaceC9608L) {
            copyOnWriteArrayList.add(c9637u);
        }
        if (this.f33206w != null) {
            m11792b0();
        }
        if (c9637u instanceof InterfaceC14216G) {
            C14215F c14215fMo10191a = c9637u.f29054q0.mo10191a();
            this.f33190g = c14215fMo10191a;
            c14215fMo10191a.m15516a(abstractComponentCallbacksC11000a != null ? abstractComponentCallbacksC11000a : c9637u, this.f33191h);
        }
        if (abstractComponentCallbacksC11000a != null) {
            FragmentManagerViewModel fragmentManagerViewModel = abstractComponentCallbacksC11000a.f33122D0.f33182M;
            HashMap map = fragmentManagerViewModel.f33113c;
            FragmentManagerViewModel fragmentManagerViewModel2 = (FragmentManagerViewModel) map.get(abstractComponentCallbacksC11000a.f33155q0);
            if (fragmentManagerViewModel2 == null) {
                fragmentManagerViewModel2 = new FragmentManagerViewModel(fragmentManagerViewModel.f33115e);
                map.put(abstractComponentCallbacksC11000a.f33155q0, fragmentManagerViewModel2);
            }
            this.f33182M = fragmentManagerViewModel2;
        } else if (c9637u instanceof ViewModelStoreOwner) {
            ViewModelStore viewModelStoreMo10152e = c9637u.f29054q0.mo10152e();
            ViewModelProvider.Factory factory = FragmentManagerViewModel.f33111h;
            this.f33182M = (FragmentManagerViewModel) new ViewModelProvider(viewModelStoreMo10152e, FragmentManagerViewModel.f33111h).m12144a(AbstractC8138m0.m8670e(FragmentManagerViewModel.class));
        } else {
            this.f33182M = new FragmentManagerViewModel(false);
        }
        FragmentManagerViewModel fragmentManagerViewModel3 = this.f33182M;
        fragmentManagerViewModel3.f33117g = this.f33175F || this.f33176G;
        this.f33186c.f33218d = fragmentManagerViewModel3;
        C9637u c9637u2 = this.f33204u;
        if ((c9637u2 instanceof InterfaceC3232g) && abstractComponentCallbacksC11000a == null) {
            C3231f c3231fMo4127h = c9637u2.mo4127h();
            c3231fMo4127h.m4125f("android:support:fragments", new C0199Q0((C9606J) this, i10));
            Bundle bundleM4122c = c3231fMo4127h.m4122c("android:support:fragments");
            if (bundleM4122c != null) {
                m11781R(bundleM4122c);
            }
        }
        C9637u c9637u3 = this.f33204u;
        if (c9637u3 instanceof InterfaceC16289i) {
            AbstractActivityC11001b abstractActivityC11001b = c9637u3.f29054q0;
            if (abstractComponentCallbacksC11000a != null) {
                strM9891j = AbstractC9306j0.m9891j(abstractComponentCallbacksC11000a.f33155q0, ":", new StringBuilder());
            } else {
                strM9891j = "";
            }
            String strM9889h = AbstractC9306j0.m9889h("FragmentManager:", strM9891j);
            String strM11052j = AbstractC10763a.m11052j(strM9889h, "StartActivityForResult");
            C6427b c6427b = new C6427b(7);
            C9606J c9606j = (C9606J) this;
            C18655i c18655i = new C18655i(c9606j, 21);
            C14227i c14227i = abstractActivityC11001b.f32069u0;
            this.f33170A = c14227i.m15531d(strM11052j, c6427b, c18655i);
            this.f33171B = c14227i.m15531d(AbstractC10763a.m11052j(strM9889h, "StartIntentSenderForResult"), new C6427b(i10), new C19506i(c9606j, 23));
            this.f33172C = c14227i.m15531d(AbstractC10763a.m11052j(strM9889h, "RequestPermissions"), new C6427b(5), new C9642z(c9606j, i11));
        }
        C9637u c9637u4 = this.f33204u;
        if (c9637u4 instanceof InterfaceC17808i) {
            c9637u4.f29054q0.m11093j(this.f33198o);
        }
        C9637u c9637u5 = this.f33204u;
        if (c9637u5 instanceof InterfaceC17809j) {
            AbstractActivityC11001b abstractActivityC11001b2 = c9637u5.f29054q0;
            C9641y listener = this.f33199p;
            abstractActivityC11001b2.getClass();
            AbstractC16544l.m18094g(listener, "listener");
            abstractActivityC11001b2.f32071w0.add(listener);
        }
        C9637u c9637u6 = this.f33204u;
        if (c9637u6 instanceof InterfaceC17470w) {
            AbstractActivityC11001b abstractActivityC11001b3 = c9637u6.f29054q0;
            C9641y listener2 = this.f33200q;
            abstractActivityC11001b3.getClass();
            AbstractC16544l.m18094g(listener2, "listener");
            abstractActivityC11001b3.f32073y0.add(listener2);
        }
        C9637u c9637u7 = this.f33204u;
        if (c9637u7 instanceof InterfaceC17471x) {
            AbstractActivityC11001b abstractActivityC11001b4 = c9637u7.f29054q0;
            C9641y listener3 = this.f33201r;
            abstractActivityC11001b4.getClass();
            AbstractC16544l.m18094g(listener3, "listener");
            abstractActivityC11001b4.f32074z0.add(listener3);
        }
        C9637u c9637u8 = this.f33204u;
        if ((c9637u8 instanceof InterfaceC0771n) && abstractComponentCallbacksC11000a == null) {
            AbstractActivityC11001b abstractActivityC11001b5 = c9637u8.f29054q0;
            C9598B provider = this.f33202s;
            abstractActivityC11001b5.getClass();
            AbstractC16544l.m18094g(provider, "provider");
            C13711h c13711h = abstractActivityC11001b5.f32063o0;
            ((CopyOnWriteArrayList) c13711h.f43260o0).add(provider);
            ((Runnable) c13711h.f43259Z).run();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m11792b0() {
        synchronized (this.f33184a) {
            try {
                if (!this.f33184a.isEmpty()) {
                    this.f33191h.m15541c(true);
                    return;
                }
                C9597A c9597a = this.f33191h;
                ArrayList arrayList = this.f33187d;
                c9597a.m15541c((arrayList != null ? arrayList.size() : 0) > 0 && m11765J(this.f33206w));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11793c(AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC11000a);
        }
        if (abstractComponentCallbacksC11000a.f33130L0) {
            abstractComponentCallbacksC11000a.f33130L0 = false;
            if (abstractComponentCallbacksC11000a.f33161w0) {
                return;
            }
            this.f33186c.m11834a(abstractComponentCallbacksC11000a);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC11000a);
            }
            if (m11763G(abstractComponentCallbacksC11000a)) {
                this.f33174E = true;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m11794d() {
        this.f33185b = false;
        this.f33180K.clear();
        this.f33179J.clear();
    }

    /* JADX INFO: renamed from: e */
    public final HashSet m11795e() {
        C9624h c9624h;
        HashSet hashSet = new HashSet();
        Iterator it = this.f33186c.m11837d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C11003d) it.next()).f33212c.f33134P0;
            if (viewGroup != null) {
                C7102a factory = m11771E();
                AbstractC16544l.m18094g(factory, "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C9624h) {
                    c9624h = (C9624h) tag;
                } else {
                    c9624h = new C9624h(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c9624h);
                }
                hashSet.add(c9624h);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: f */
    public final C11003d m11796f(AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a) {
        String str = abstractComponentCallbacksC11000a.f33155q0;
        C11004e c11004e = this.f33186c;
        C11003d c11003d = (C11003d) c11004e.f33216b.get(str);
        if (c11003d != null) {
            return c11003d;
        }
        C11003d c11003d2 = new C11003d(this.f33196m, c11004e, abstractComponentCallbacksC11000a);
        c11003d2.m11829m(this.f33204u.f29051Z.getClassLoader());
        c11003d2.f33214e = this.f33203t;
        return c11003d2;
    }

    /* JADX INFO: renamed from: g */
    public final void m11797g(AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC11000a);
        }
        if (abstractComponentCallbacksC11000a.f33130L0) {
            return;
        }
        abstractComponentCallbacksC11000a.f33130L0 = true;
        if (abstractComponentCallbacksC11000a.f33161w0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC11000a);
            }
            C11004e c11004e = this.f33186c;
            synchronized (c11004e.f33215a) {
                c11004e.f33215a.remove(abstractComponentCallbacksC11000a);
            }
            abstractComponentCallbacksC11000a.f33161w0 = false;
            if (m11763G(abstractComponentCallbacksC11000a)) {
                this.f33174E = true;
            }
            m11787X(abstractComponentCallbacksC11000a);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m11798h(boolean z6) {
        if (z6 && (this.f33204u instanceof InterfaceC17808i)) {
            m11790a0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a : this.f33186c.m11839f()) {
            if (abstractComponentCallbacksC11000a != null) {
                abstractComponentCallbacksC11000a.f33133O0 = true;
                if (z6) {
                    abstractComponentCallbacksC11000a.f33124F0.m11798h(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m11799i() {
        if (this.f33203t < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a : this.f33186c.m11839f()) {
            if (abstractComponentCallbacksC11000a != null) {
                if (!abstractComponentCallbacksC11000a.f33129K0 ? abstractComponentCallbacksC11000a.f33124F0.m11799i() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m11800j() {
        if (this.f33203t < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z6 = false;
        for (AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a : this.f33186c.m11839f()) {
            if (abstractComponentCallbacksC11000a != null && m11764I(abstractComponentCallbacksC11000a)) {
                if (!abstractComponentCallbacksC11000a.f33129K0 ? abstractComponentCallbacksC11000a.f33124F0.m11800j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC11000a);
                    z6 = true;
                }
            }
        }
        if (this.f33188e != null) {
            for (int i10 = 0; i10 < this.f33188e.size(); i10++) {
                AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a2 = (AbstractComponentCallbacksC11000a) this.f33188e.get(i10);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC11000a2)) {
                    abstractComponentCallbacksC11000a2.getClass();
                }
            }
        }
        this.f33188e = arrayList;
        return z6;
    }

    /* JADX INFO: renamed from: k */
    public final void m11801k() {
        boolean zIsChangingConfigurations = true;
        this.f33177H = true;
        m11815y(true);
        Iterator it = m11795e().iterator();
        while (it.hasNext()) {
            ((C9624h) it.next()).m10171f();
        }
        C9637u c9637u = this.f33204u;
        boolean z6 = c9637u instanceof ViewModelStoreOwner;
        C11004e c11004e = this.f33186c;
        if (z6) {
            zIsChangingConfigurations = c11004e.f33218d.f33116f;
        } else {
            AbstractActivityC11001b abstractActivityC11001b = c9637u.f29051Z;
            if (abstractActivityC11001b instanceof Activity) {
                zIsChangingConfigurations = true ^ abstractActivityC11001b.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it2 = this.f33193j.values().iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((C9619c) it2.next()).f28989Y.iterator();
                while (it3.hasNext()) {
                    c11004e.f33218d.m11736g((String) it3.next(), false);
                }
            }
        }
        m11810t(-1);
        C9637u c9637u2 = this.f33204u;
        if (c9637u2 instanceof InterfaceC17809j) {
            AbstractActivityC11001b abstractActivityC11001b2 = c9637u2.f29054q0;
            C9641y listener = this.f33199p;
            abstractActivityC11001b2.getClass();
            AbstractC16544l.m18094g(listener, "listener");
            abstractActivityC11001b2.f32071w0.remove(listener);
        }
        C9637u c9637u3 = this.f33204u;
        if (c9637u3 instanceof InterfaceC17808i) {
            AbstractActivityC11001b abstractActivityC11001b3 = c9637u3.f29054q0;
            C9641y listener2 = this.f33198o;
            abstractActivityC11001b3.getClass();
            AbstractC16544l.m18094g(listener2, "listener");
            abstractActivityC11001b3.f32070v0.remove(listener2);
        }
        C9637u c9637u4 = this.f33204u;
        if (c9637u4 instanceof InterfaceC17470w) {
            AbstractActivityC11001b abstractActivityC11001b4 = c9637u4.f29054q0;
            C9641y listener3 = this.f33200q;
            abstractActivityC11001b4.getClass();
            AbstractC16544l.m18094g(listener3, "listener");
            abstractActivityC11001b4.f32073y0.remove(listener3);
        }
        C9637u c9637u5 = this.f33204u;
        if (c9637u5 instanceof InterfaceC17471x) {
            AbstractActivityC11001b abstractActivityC11001b5 = c9637u5.f29054q0;
            C9641y listener4 = this.f33201r;
            abstractActivityC11001b5.getClass();
            AbstractC16544l.m18094g(listener4, "listener");
            abstractActivityC11001b5.f32074z0.remove(listener4);
        }
        C9637u c9637u6 = this.f33204u;
        if ((c9637u6 instanceof InterfaceC0771n) && this.f33206w == null) {
            AbstractActivityC11001b abstractActivityC11001b6 = c9637u6.f29054q0;
            C9598B provider = this.f33202s;
            abstractActivityC11001b6.getClass();
            AbstractC16544l.m18094g(provider, "provider");
            C13711h c13711h = abstractActivityC11001b6.f32063o0;
            ((CopyOnWriteArrayList) c13711h.f43260o0).remove(provider);
            if (((HashMap) c13711h.f43261p0).remove(provider) != null) {
                throw new ClassCastException();
            }
            ((Runnable) c13711h.f43259Z).run();
        }
        this.f33204u = null;
        this.f33205v = null;
        this.f33206w = null;
        if (this.f33190g != null) {
            this.f33191h.m15540b();
            this.f33190g = null;
        }
        C16288h c16288h = this.f33170A;
        if (c16288h != null) {
            c16288h.m17824d();
            this.f33171B.m17824d();
            this.f33172C.m17824d();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m11802l(boolean z6) {
        if (z6 && (this.f33204u instanceof InterfaceC17809j)) {
            m11790a0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a : this.f33186c.m11839f()) {
            if (abstractComponentCallbacksC11000a != null) {
                abstractComponentCallbacksC11000a.f33133O0 = true;
                if (z6) {
                    abstractComponentCallbacksC11000a.f33124F0.m11802l(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m11803m(boolean z6, boolean z10) {
        if (z10 && (this.f33204u instanceof InterfaceC17470w)) {
            m11790a0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a : this.f33186c.m11839f()) {
            if (abstractComponentCallbacksC11000a != null && z10) {
                abstractComponentCallbacksC11000a.f33124F0.m11803m(z6, true);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m11804n() {
        for (AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a : this.f33186c.m11838e()) {
            if (abstractComponentCallbacksC11000a != null) {
                abstractComponentCallbacksC11000a.m11758u();
                abstractComponentCallbacksC11000a.f33124F0.m11804n();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m11805o() {
        if (this.f33203t < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a : this.f33186c.m11839f()) {
            if (abstractComponentCallbacksC11000a != null) {
                if (!abstractComponentCallbacksC11000a.f33129K0 ? abstractComponentCallbacksC11000a.f33124F0.m11805o() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final void m11806p() {
        if (this.f33203t < 1) {
            return;
        }
        for (AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a : this.f33186c.m11839f()) {
            if (abstractComponentCallbacksC11000a != null && !abstractComponentCallbacksC11000a.f33129K0) {
                abstractComponentCallbacksC11000a.f33124F0.m11806p();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m11807q(AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a) {
        if (abstractComponentCallbacksC11000a != null) {
            if (abstractComponentCallbacksC11000a.equals(this.f33186c.m11835b(abstractComponentCallbacksC11000a.f33155q0))) {
                abstractComponentCallbacksC11000a.f33122D0.getClass();
                boolean zM11765J = m11765J(abstractComponentCallbacksC11000a);
                Boolean bool = abstractComponentCallbacksC11000a.f33160v0;
                if (bool == null || bool.booleanValue() != zM11765J) {
                    abstractComponentCallbacksC11000a.f33160v0 = Boolean.valueOf(zM11765J);
                    C9606J c9606j = abstractComponentCallbacksC11000a.f33124F0;
                    c9606j.m11792b0();
                    c9606j.m11807q(c9606j.f33207x);
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m11808r(boolean z6, boolean z10) {
        if (z10 && (this.f33204u instanceof InterfaceC17471x)) {
            m11790a0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a : this.f33186c.m11839f()) {
            if (abstractComponentCallbacksC11000a != null && z10) {
                abstractComponentCallbacksC11000a.f33124F0.m11808r(z6, true);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m11809s() {
        if (this.f33203t < 1) {
            return false;
        }
        boolean z6 = false;
        for (AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a : this.f33186c.m11839f()) {
            if (abstractComponentCallbacksC11000a != null && m11764I(abstractComponentCallbacksC11000a)) {
                if (!abstractComponentCallbacksC11000a.f33129K0 ? abstractComponentCallbacksC11000a.f33124F0.m11809s() : false) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    /* JADX INFO: renamed from: t */
    public final void m11810t(int i10) {
        try {
            this.f33185b = true;
            for (C11003d c11003d : this.f33186c.f33216b.values()) {
                if (c11003d != null) {
                    c11003d.f33214e = i10;
                }
            }
            m11774K(i10, false);
            Iterator it = m11795e().iterator();
            while (it.hasNext()) {
                ((C9624h) it.next()).m10171f();
            }
            this.f33185b = false;
            m11815y(true);
        } catch (Throwable th2) {
            this.f33185b = false;
            throw th2;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = this.f33206w;
        if (abstractComponentCallbacksC11000a != null) {
            sb2.append(abstractComponentCallbacksC11000a.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f33206w)));
            sb2.append("}");
        } else {
            C9637u c9637u = this.f33204u;
            if (c9637u != null) {
                sb2.append(c9637u.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f33204u)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m11811u() {
        if (this.f33178I) {
            this.f33178I = false;
            m11788Z();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m11812v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String strM11052j = AbstractC10763a.m11052j(str, "    ");
        C11004e c11004e = this.f33186c;
        c11004e.getClass();
        String str2 = str + "    ";
        HashMap map = c11004e.f33216b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C11003d c11003d : map.values()) {
                printWriter.print(str);
                if (c11003d != null) {
                    AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = c11003d.f33212c;
                    printWriter.println(abstractComponentCallbacksC11000a);
                    abstractComponentCallbacksC11000a.mo11748k(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = c11004e.f33215a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size3; i10++) {
                AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a2 = (AbstractComponentCallbacksC11000a) arrayList.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC11000a2.toString());
            }
        }
        ArrayList arrayList2 = this.f33188e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size2; i11++) {
                AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a3 = (AbstractComponentCallbacksC11000a) this.f33188e.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC11000a3.toString());
            }
        }
        ArrayList arrayList3 = this.f33187d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size; i12++) {
                C9617a c9617a = (C9617a) this.f33187d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(c9617a.toString());
                c9617a.m10163f(strM11052j, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f33192i.get());
        synchronized (this.f33184a) {
            try {
                int size4 = this.f33184a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i13 = 0; i13 < size4; i13++) {
                        Object obj = (InterfaceC9604H) this.f33184a.get(i13);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i13);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f33204u);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f33205v);
        if (this.f33206w != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f33206w);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f33203t);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f33175F);
        printWriter.print(" mStopped=");
        printWriter.print(this.f33176G);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f33177H);
        if (this.f33174E) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f33174E);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m11813w(InterfaceC9604H interfaceC9604H, boolean z6) {
        if (!z6) {
            if (this.f33204u == null) {
                if (!this.f33177H) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f33175F || this.f33176G) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f33184a) {
            try {
                if (this.f33204u == null) {
                    if (!z6) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f33184a.add(interfaceC9604H);
                    m11783T();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m11814x(boolean z6) {
        if (this.f33185b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f33204u == null) {
            if (!this.f33177H) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f33204u.f29052o0.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z6 && (this.f33175F || this.f33176G)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f33179J == null) {
            this.f33179J = new ArrayList();
            this.f33180K = new ArrayList();
        }
    }

    /* JADX INFO: renamed from: y */
    public final boolean m11815y(boolean z6) {
        boolean zMo10148a;
        m11814x(z6);
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f33179J;
            ArrayList arrayList2 = this.f33180K;
            synchronized (this.f33184a) {
                if (this.f33184a.isEmpty()) {
                    zMo10148a = false;
                } else {
                    try {
                        int size = this.f33184a.size();
                        zMo10148a = false;
                        for (int i10 = 0; i10 < size; i10++) {
                            zMo10148a |= ((InterfaceC9604H) this.f33184a.get(i10)).mo10148a(arrayList, arrayList2);
                        }
                        this.f33184a.clear();
                        this.f33204u.f29052o0.removeCallbacks(this.f33183N);
                    } catch (Throwable th2) {
                        this.f33184a.clear();
                        this.f33204u.f29052o0.removeCallbacks(this.f33183N);
                        throw th2;
                    }
                }
            }
            if (!zMo10148a) {
                m11792b0();
                m11811u();
                this.f33186c.f33216b.values().removeAll(Collections.singleton(null));
                return z10;
            }
            z10 = true;
            this.f33185b = true;
            try {
                m11780Q(this.f33179J, this.f33180K);
                m11794d();
            } catch (Throwable th3) {
                m11794d();
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0229 A[PHI: r13
      0x0229: PHI (r13v13 int) = (r13v12 int), (r13v14 int) binds: [B:107:0x0219, B:112:0x0225] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0164  */
    /* JADX INFO: renamed from: z */
    public final void m11816z(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        Object objPrevious;
        ViewGroup viewGroup;
        C11004e c11004e;
        C11004e c11004e2;
        int i12;
        int i13;
        ArrayList arrayList3 = arrayList;
        boolean z6 = ((C9617a) arrayList3.get(i10)).f28971o;
        ArrayList arrayList4 = this.f33181L;
        if (arrayList4 == null) {
            this.f33181L = new ArrayList();
        } else {
            arrayList4.clear();
        }
        ArrayList arrayList5 = this.f33181L;
        C11004e c11004e3 = this.f33186c;
        arrayList5.addAll(c11004e3.m11839f());
        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a = this.f33207x;
        int i14 = i10;
        boolean z10 = false;
        while (true) {
            int i15 = 1;
            if (i14 >= i11) {
                C11004e c11004e4 = c11004e3;
                this.f33181L.clear();
                if (!z6 && this.f33203t >= 1) {
                    for (int i16 = i10; i16 < i11; i16++) {
                        Iterator it = ((C9617a) arrayList.get(i16)).f28957a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a2 = ((C9610N) it.next()).f28929b;
                            if (abstractComponentCallbacksC11000a2 == null || abstractComponentCallbacksC11000a2.f33122D0 == null) {
                                c11004e = c11004e4;
                            } else {
                                c11004e = c11004e4;
                                c11004e.m11840g(m11796f(abstractComponentCallbacksC11000a2));
                            }
                            c11004e4 = c11004e;
                        }
                    }
                }
                for (int i17 = i10; i17 < i11; i17++) {
                    C9617a c9617a = (C9617a) arrayList.get(i17);
                    if (((Boolean) arrayList2.get(i17)).booleanValue()) {
                        c9617a.m10160c(-1);
                        ArrayList arrayList6 = c9617a.f28957a;
                        boolean z11 = true;
                        for (int size = arrayList6.size() - 1; size >= 0; size--) {
                            C9610N c9610n = (C9610N) arrayList6.get(size);
                            AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a3 = c9610n.f28929b;
                            if (abstractComponentCallbacksC11000a3 != null) {
                                if (abstractComponentCallbacksC11000a3.f33138T0 != null) {
                                    abstractComponentCallbacksC11000a3.m11749l().f29035a = z11;
                                }
                                int i18 = c9617a.f28962f;
                                int i19 = 8194;
                                int i20 = 4097;
                                if (i18 != 4097) {
                                    if (i18 != 8194) {
                                        i19 = LexerCore.IPV6;
                                        i20 = 8197;
                                        if (i18 != 8197) {
                                            if (i18 == 4099) {
                                                i19 = 4099;
                                            } else if (i18 != 4100) {
                                                i19 = 0;
                                            } else {
                                                i19 = i20;
                                            }
                                        }
                                    } else {
                                        i19 = i20;
                                    }
                                }
                                if (abstractComponentCallbacksC11000a3.f33138T0 != null || i19 != 0) {
                                    abstractComponentCallbacksC11000a3.m11749l();
                                    abstractComponentCallbacksC11000a3.f33138T0.f29040f = i19;
                                }
                                abstractComponentCallbacksC11000a3.m11749l();
                                abstractComponentCallbacksC11000a3.f33138T0.getClass();
                            }
                            int i21 = c9610n.f28928a;
                            AbstractC11002c abstractC11002c = c9617a.f28972p;
                            switch (i21) {
                                case 1:
                                    abstractComponentCallbacksC11000a3.m11745O(c9610n.f28931d, c9610n.f28932e, c9610n.f28933f, c9610n.f28934g);
                                    z11 = true;
                                    abstractC11002c.m11784U(abstractComponentCallbacksC11000a3, true);
                                    abstractC11002c.m11779P(abstractComponentCallbacksC11000a3);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c9610n.f28928a);
                                case 3:
                                    abstractComponentCallbacksC11000a3.m11745O(c9610n.f28931d, c9610n.f28932e, c9610n.f28933f, c9610n.f28934g);
                                    abstractC11002c.m11789a(abstractComponentCallbacksC11000a3);
                                    z11 = true;
                                    break;
                                case 4:
                                    abstractComponentCallbacksC11000a3.m11745O(c9610n.f28931d, c9610n.f28932e, c9610n.f28933f, c9610n.f28934g);
                                    abstractC11002c.getClass();
                                    m11766Y(abstractComponentCallbacksC11000a3);
                                    z11 = true;
                                    break;
                                case 5:
                                    abstractComponentCallbacksC11000a3.m11745O(c9610n.f28931d, c9610n.f28932e, c9610n.f28933f, c9610n.f28934g);
                                    abstractC11002c.m11784U(abstractComponentCallbacksC11000a3, true);
                                    abstractC11002c.m11772F(abstractComponentCallbacksC11000a3);
                                    z11 = true;
                                    break;
                                case 6:
                                    abstractComponentCallbacksC11000a3.m11745O(c9610n.f28931d, c9610n.f28932e, c9610n.f28933f, c9610n.f28934g);
                                    abstractC11002c.m11793c(abstractComponentCallbacksC11000a3);
                                    z11 = true;
                                    break;
                                case 7:
                                    abstractComponentCallbacksC11000a3.m11745O(c9610n.f28931d, c9610n.f28932e, c9610n.f28933f, c9610n.f28934g);
                                    abstractC11002c.m11784U(abstractComponentCallbacksC11000a3, true);
                                    abstractC11002c.m11797g(abstractComponentCallbacksC11000a3);
                                    z11 = true;
                                    break;
                                case 8:
                                    abstractC11002c.m11786W(null);
                                    z11 = true;
                                    break;
                                case 9:
                                    abstractC11002c.m11786W(abstractComponentCallbacksC11000a3);
                                    z11 = true;
                                    break;
                                case 10:
                                    abstractC11002c.m11785V(abstractComponentCallbacksC11000a3, c9610n.f28935h);
                                    z11 = true;
                                    break;
                            }
                        }
                    } else {
                        c9617a.m10160c(1);
                        ArrayList arrayList7 = c9617a.f28957a;
                        int size2 = arrayList7.size();
                        for (int i22 = 0; i22 < size2; i22++) {
                            C9610N c9610n2 = (C9610N) arrayList7.get(i22);
                            AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a4 = c9610n2.f28929b;
                            if (abstractComponentCallbacksC11000a4 != null) {
                                if (abstractComponentCallbacksC11000a4.f33138T0 != null) {
                                    abstractComponentCallbacksC11000a4.m11749l().f29035a = false;
                                }
                                int i23 = c9617a.f28962f;
                                if (abstractComponentCallbacksC11000a4.f33138T0 != null || i23 != 0) {
                                    abstractComponentCallbacksC11000a4.m11749l();
                                    abstractComponentCallbacksC11000a4.f33138T0.f29040f = i23;
                                }
                                abstractComponentCallbacksC11000a4.m11749l();
                                abstractComponentCallbacksC11000a4.f33138T0.getClass();
                            }
                            int i24 = c9610n2.f28928a;
                            AbstractC11002c abstractC11002c2 = c9617a.f28972p;
                            switch (i24) {
                                case 1:
                                    abstractComponentCallbacksC11000a4.m11745O(c9610n2.f28931d, c9610n2.f28932e, c9610n2.f28933f, c9610n2.f28934g);
                                    abstractC11002c2.m11784U(abstractComponentCallbacksC11000a4, false);
                                    abstractC11002c2.m11789a(abstractComponentCallbacksC11000a4);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c9610n2.f28928a);
                                case 3:
                                    abstractComponentCallbacksC11000a4.m11745O(c9610n2.f28931d, c9610n2.f28932e, c9610n2.f28933f, c9610n2.f28934g);
                                    abstractC11002c2.m11779P(abstractComponentCallbacksC11000a4);
                                    break;
                                case 4:
                                    abstractComponentCallbacksC11000a4.m11745O(c9610n2.f28931d, c9610n2.f28932e, c9610n2.f28933f, c9610n2.f28934g);
                                    abstractC11002c2.m11772F(abstractComponentCallbacksC11000a4);
                                    break;
                                case 5:
                                    abstractComponentCallbacksC11000a4.m11745O(c9610n2.f28931d, c9610n2.f28932e, c9610n2.f28933f, c9610n2.f28934g);
                                    abstractC11002c2.m11784U(abstractComponentCallbacksC11000a4, false);
                                    m11766Y(abstractComponentCallbacksC11000a4);
                                    break;
                                case 6:
                                    abstractComponentCallbacksC11000a4.m11745O(c9610n2.f28931d, c9610n2.f28932e, c9610n2.f28933f, c9610n2.f28934g);
                                    abstractC11002c2.m11797g(abstractComponentCallbacksC11000a4);
                                    break;
                                case 7:
                                    abstractComponentCallbacksC11000a4.m11745O(c9610n2.f28931d, c9610n2.f28932e, c9610n2.f28933f, c9610n2.f28934g);
                                    abstractC11002c2.m11784U(abstractComponentCallbacksC11000a4, false);
                                    abstractC11002c2.m11793c(abstractComponentCallbacksC11000a4);
                                    break;
                                case 8:
                                    abstractC11002c2.m11786W(abstractComponentCallbacksC11000a4);
                                    break;
                                case 9:
                                    abstractC11002c2.m11786W(null);
                                    break;
                                case 10:
                                    abstractC11002c2.m11785V(abstractComponentCallbacksC11000a4, c9610n2.f28936i);
                                    break;
                            }
                        }
                    }
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i11 - 1)).booleanValue();
                for (int i25 = i10; i25 < i11; i25++) {
                    C9617a c9617a2 = (C9617a) arrayList.get(i25);
                    if (zBooleanValue) {
                        for (int size3 = c9617a2.f28957a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a5 = ((C9610N) c9617a2.f28957a.get(size3)).f28929b;
                            if (abstractComponentCallbacksC11000a5 != null) {
                                m11796f(abstractComponentCallbacksC11000a5).m11827k();
                            }
                        }
                    } else {
                        Iterator it2 = c9617a2.f28957a.iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a6 = ((C9610N) it2.next()).f28929b;
                            if (abstractComponentCallbacksC11000a6 != null) {
                                m11796f(abstractComponentCallbacksC11000a6).m11827k();
                            }
                        }
                    }
                }
                m11774K(this.f33203t, true);
                HashSet<C9624h> hashSet = new HashSet();
                for (int i26 = i10; i26 < i11; i26++) {
                    Iterator it3 = ((C9617a) arrayList.get(i26)).f28957a.iterator();
                    while (it3.hasNext()) {
                        AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a7 = ((C9610N) it3.next()).f28929b;
                        if (abstractComponentCallbacksC11000a7 != null && (viewGroup = abstractComponentCallbacksC11000a7.f33134P0) != null) {
                            hashSet.add(C9624h.m10165g(viewGroup, this));
                        }
                    }
                }
                for (C9624h c9624h : hashSet) {
                    c9624h.f29006d = zBooleanValue;
                    synchronized (c9624h.f29004b) {
                        try {
                            c9624h.m10172h();
                            ArrayList arrayList8 = c9624h.f29004b;
                            ListIterator listIterator = arrayList8.listIterator(arrayList8.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    objPrevious = listIterator.previous();
                                    C9614S c9614s = (C9614S) objPrevious;
                                    View view = c9614s.f28950c.f33135Q0;
                                    AbstractC16544l.m18093f(view, "operation.fragment.mView");
                                    int iM10634c = AbstractC9991w4.m10634c(view);
                                    if (c9614s.f28948a != 2 || iM10634c == 2) {
                                    }
                                } else {
                                    objPrevious = null;
                                }
                            }
                            c9624h.f29007e = false;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    c9624h.m10169d();
                }
                for (int i27 = i10; i27 < i11; i27++) {
                    C9617a c9617a3 = (C9617a) arrayList.get(i27);
                    if (((Boolean) arrayList2.get(i27)).booleanValue() && c9617a3.f28974r >= 0) {
                        c9617a3.f28974r = -1;
                    }
                    c9617a3.getClass();
                }
                return;
            }
            C9617a c9617a4 = (C9617a) arrayList3.get(i14);
            if (((Boolean) arrayList2.get(i14)).booleanValue()) {
                c11004e2 = c11004e3;
                int i28 = 1;
                ArrayList arrayList9 = this.f33181L;
                ArrayList arrayList10 = c9617a4.f28957a;
                int size4 = arrayList10.size() - 1;
                while (size4 >= 0) {
                    C9610N c9610n3 = (C9610N) arrayList10.get(size4);
                    int i29 = c9610n3.f28928a;
                    if (i29 != i28) {
                        if (i29 != 3) {
                            switch (i29) {
                                case 6:
                                    arrayList9.add(c9610n3.f28929b);
                                    break;
                                case 8:
                                    abstractComponentCallbacksC11000a = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC11000a = c9610n3.f28929b;
                                    break;
                                case 10:
                                    c9610n3.f28936i = c9610n3.f28935h;
                                    break;
                            }
                        } else {
                            arrayList9.add(c9610n3.f28929b);
                        }
                        size4--;
                        i28 = 1;
                    }
                    arrayList9.remove(c9610n3.f28929b);
                    size4--;
                    i28 = 1;
                }
            } else {
                ArrayList arrayList11 = this.f33181L;
                int i30 = 0;
                while (true) {
                    ArrayList arrayList12 = c9617a4.f28957a;
                    if (i30 < arrayList12.size()) {
                        C9610N c9610n4 = (C9610N) arrayList12.get(i30);
                        int i31 = c9610n4.f28928a;
                        if (i31 != i15) {
                            if (i31 != 2) {
                                if (i31 == 3 || i31 == 6) {
                                    arrayList11.remove(c9610n4.f28929b);
                                    AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a8 = c9610n4.f28929b;
                                    if (abstractComponentCallbacksC11000a8 == abstractComponentCallbacksC11000a) {
                                        arrayList12.add(i30, new C9610N(9, abstractComponentCallbacksC11000a8));
                                        i30++;
                                        c11004e3 = c11004e3;
                                        i12 = 1;
                                        abstractComponentCallbacksC11000a = null;
                                    }
                                } else if (i31 == 7) {
                                    i12 = 1;
                                } else if (i31 == 8) {
                                    arrayList12.add(i30, new C9610N(9, abstractComponentCallbacksC11000a, 0));
                                    c9610n4.f28930c = true;
                                    i30++;
                                    abstractComponentCallbacksC11000a = c9610n4.f28929b;
                                }
                                c11004e3 = c11004e3;
                                i12 = 1;
                            } else {
                                AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a9 = c9610n4.f28929b;
                                int i32 = abstractComponentCallbacksC11000a9.f33127I0;
                                int size5 = arrayList11.size() - 1;
                                boolean z12 = false;
                                while (size5 >= 0) {
                                    C11004e c11004e5 = c11004e3;
                                    AbstractComponentCallbacksC11000a abstractComponentCallbacksC11000a10 = (AbstractComponentCallbacksC11000a) arrayList11.get(size5);
                                    if (abstractComponentCallbacksC11000a10.f33127I0 != i32) {
                                        i32 = i32;
                                    } else if (abstractComponentCallbacksC11000a10 == abstractComponentCallbacksC11000a9) {
                                        i32 = i32;
                                        z12 = true;
                                    } else {
                                        if (abstractComponentCallbacksC11000a10 == abstractComponentCallbacksC11000a) {
                                            arrayList12.add(i30, new C9610N(9, abstractComponentCallbacksC11000a10, 0));
                                            i30++;
                                            i13 = 0;
                                            abstractComponentCallbacksC11000a = null;
                                        } else {
                                            i13 = 0;
                                        }
                                        C9610N c9610n5 = new C9610N(3, abstractComponentCallbacksC11000a10, i13);
                                        c9610n5.f28931d = c9610n4.f28931d;
                                        c9610n5.f28933f = c9610n4.f28933f;
                                        c9610n5.f28932e = c9610n4.f28932e;
                                        c9610n5.f28934g = c9610n4.f28934g;
                                        arrayList12.add(i30, c9610n5);
                                        arrayList11.remove(abstractComponentCallbacksC11000a10);
                                        i30++;
                                        abstractComponentCallbacksC11000a = abstractComponentCallbacksC11000a;
                                    }
                                    size5--;
                                    i32 = i32;
                                    c11004e3 = c11004e5;
                                }
                                c11004e3 = c11004e3;
                                i12 = 1;
                                if (z12) {
                                    arrayList12.remove(i30);
                                    i30--;
                                } else {
                                    c9610n4.f28928a = 1;
                                    c9610n4.f28930c = true;
                                    arrayList11.add(abstractComponentCallbacksC11000a9);
                                }
                            }
                            i30 += i12;
                            i15 = i12;
                            c11004e3 = c11004e3;
                        } else {
                            i12 = i15;
                        }
                        arrayList11.add(c9610n4.f28929b);
                        i30 += i12;
                        i15 = i12;
                        c11004e3 = c11004e3;
                    } else {
                        c11004e2 = c11004e3;
                    }
                }
            }
            z10 = z10 || c9617a4.f28963g;
            i14++;
            arrayList3 = arrayList;
            c11004e3 = c11004e2;
        }
    }
}
