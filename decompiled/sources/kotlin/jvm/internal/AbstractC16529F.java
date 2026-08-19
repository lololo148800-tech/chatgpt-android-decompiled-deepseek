package kotlin.jvm.internal;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mm.InterfaceC17302e;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1427b;
import p049Bm.InterfaceC1428c;
import p049Bm.InterfaceC1429d;
import p049Bm.InterfaceC1430e;
import p049Bm.InterfaceC1431f;
import p049Bm.InterfaceC1432g;
import p049Bm.InterfaceC1433h;
import p049Bm.InterfaceC1434i;
import p049Bm.InterfaceC1435j;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1437l;
import p049Bm.InterfaceC1438m;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p049Bm.InterfaceC1441p;
import p049Bm.InterfaceC1442q;
import p049Bm.InterfaceC1443r;
import p049Bm.InterfaceC1444s;
import p049Bm.InterfaceC1445t;
import p049Bm.InterfaceC1446u;
import p076Cm.InterfaceC1723a;
import p076Cm.InterfaceC1724b;
import p076Cm.InterfaceC1725c;
import p076Cm.InterfaceC1727e;
import p076Cm.InterfaceC1728f;
import p298Lm.InterfaceC5174f;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: kotlin.jvm.internal.F */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16529F {
    /* JADX INFO: renamed from: a */
    public static Collection m18077a(AbstractCollection abstractCollection) {
        if (!(abstractCollection instanceof InterfaceC1723a) || (abstractCollection instanceof InterfaceC1724b)) {
            return abstractCollection;
        }
        m18084h(abstractCollection, "kotlin.collections.MutableCollection");
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static List m18078b(Object obj) {
        if ((obj instanceof InterfaceC1723a) && !(obj instanceof InterfaceC1725c)) {
            m18084h(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            AbstractC16544l.m18099l(e10, AbstractC16529F.class.getName());
            throw e10;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Map m18079c(Object obj) {
        if ((obj instanceof InterfaceC1723a) && !(obj instanceof InterfaceC1727e)) {
            m18084h(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            AbstractC16544l.m18099l(e10, AbstractC16529F.class.getName());
            throw e10;
        }
    }

    /* JADX INFO: renamed from: d */
    public static Set m18080d(Object obj) {
        if ((obj instanceof InterfaceC1723a) && !(obj instanceof InterfaceC1728f)) {
            m18084h(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e10) {
            AbstractC16544l.m18099l(e10, AbstractC16529F.class.getName());
            throw e10;
        }
    }

    /* JADX INFO: renamed from: e */
    public static Object m18081e(int i10, Object obj) {
        if (obj == null || m18082f(i10, obj)) {
            return obj;
        }
        m18084h(obj, "kotlin.jvm.functions.Function" + i10);
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m18082f(int i10, Object obj) {
        int arity;
        if (!(obj instanceof InterfaceC17302e)) {
            return false;
        }
        if (obj instanceof InterfaceC16539g) {
            arity = ((InterfaceC16539g) obj).getArity();
        } else if (obj instanceof InterfaceC1426a) {
            arity = 0;
        } else if (obj instanceof InterfaceC1436k) {
            arity = 1;
        } else if (obj instanceof InterfaceC1439n) {
            arity = 2;
        } else if (obj instanceof InterfaceC1440o) {
            arity = 3;
        } else if (obj instanceof InterfaceC1441p) {
            arity = 4;
        } else if (obj instanceof InterfaceC1442q) {
            arity = 5;
        } else if (obj instanceof InterfaceC1443r) {
            arity = 6;
        } else if (obj instanceof InterfaceC1444s) {
            arity = 7;
        } else if (obj instanceof InterfaceC1445t) {
            arity = 8;
        } else if (obj instanceof InterfaceC1446u) {
            arity = 9;
        } else if (obj instanceof InterfaceC1427b) {
            arity = 10;
        } else if (obj instanceof InterfaceC1428c) {
            arity = 11;
        } else {
            boolean z6 = obj instanceof InterfaceC5174f;
            if (z6) {
                arity = 12;
            } else if (obj instanceof InterfaceC1429d) {
                arity = 13;
            } else if (obj instanceof InterfaceC1430e) {
                arity = 14;
            } else if (obj instanceof InterfaceC1431f) {
                arity = 15;
            } else if (obj instanceof InterfaceC1432g) {
                arity = 16;
            } else if (obj instanceof InterfaceC1433h) {
                arity = 17;
            } else if (obj instanceof InterfaceC1434i) {
                arity = 18;
            } else if (obj instanceof InterfaceC1435j) {
                arity = 19;
            } else if (obj instanceof InterfaceC1437l) {
                arity = 20;
            } else if (obj instanceof InterfaceC1438m) {
                arity = 21;
            } else {
                arity = z6 ? 22 : -1;
            }
        }
        return arity == i10;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m18083g(Object obj) {
        return (obj instanceof List) && (!(obj instanceof InterfaceC1723a) || (obj instanceof InterfaceC1725c));
    }

    /* JADX INFO: renamed from: h */
    public static void m18084h(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(AbstractC9306j0.m9890i(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        AbstractC16544l.m18099l(classCastException, AbstractC16529F.class.getName());
        throw classCastException;
    }
}
