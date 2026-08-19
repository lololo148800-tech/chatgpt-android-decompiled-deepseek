package p077Cn;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Cn.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C1750r {

    /* JADX INFO: renamed from: b */
    public static final C1749q f5020b = new C1749q();

    /* JADX INFO: renamed from: a */
    public final Object f5021a;

    /* JADX INFO: renamed from: a */
    public static final Throwable m2559a(Object obj) {
        C1748p c1748p = obj instanceof C1748p ? (C1748p) obj : null;
        if (c1748p != null) {
            return c1748p.f5019a;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final Object m2560b(Object obj) {
        if (obj instanceof C1749q) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1750r) {
            return AbstractC16544l.m18089b(this.f5021a, ((C1750r) obj).f5021a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f5021a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f5021a;
        if (obj instanceof C1748p) {
            return ((C1748p) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
