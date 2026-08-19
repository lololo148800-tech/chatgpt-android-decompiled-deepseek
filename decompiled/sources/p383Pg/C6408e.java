package p383Pg;

import kotlin.jvm.internal.AbstractC16544l;
import p1072w2.C20793e;
import p817j$.util.Objects;

/* JADX INFO: renamed from: Pg.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C6408e {

    /* JADX INFO: renamed from: a */
    public final C20793e f20847a;

    /* JADX INFO: renamed from: b */
    public final String f20848b;

    static {
        C20793e c20793e = C20793e.f66055b;
        AbstractC16544l.m18093f(c20793e, "getEmptyLocaleList(...)");
        new C6408e(c20793e, "System Default");
    }

    public C6408e(C20793e localeList, String displayName) {
        AbstractC16544l.m18094g(localeList, "localeList");
        AbstractC16544l.m18094g(displayName, "displayName");
        this.f20847a = localeList;
        this.f20848b = displayName;
    }

    public final boolean equals(Object obj) {
        C6408e c6408e = obj instanceof C6408e ? (C6408e) obj : null;
        return Objects.equals(this.f20847a, c6408e != null ? c6408e.f20847a : null);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f20847a);
    }

    public final String toString() {
        return "█";
    }
}
