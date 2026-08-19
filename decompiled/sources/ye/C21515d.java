package ye;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p775h2.AbstractC14376f;
import p909nm.C17689w;

/* JADX INFO: renamed from: ye.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C21515d {

    /* JADX INFO: renamed from: a */
    public final C21525n f68132a;

    /* JADX INFO: renamed from: b */
    public final List f68133b;

    /* JADX INFO: renamed from: c */
    public final boolean f68134c;

    /* JADX INFO: renamed from: d */
    public final C21525n f68135d;

    /* JADX INFO: renamed from: e */
    public final boolean f68136e;

    /* JADX INFO: renamed from: f */
    public final C21525n f68137f;

    public C21515d(C21525n c21525n, List leafMessageIds, boolean z6, C21525n c21525n2, boolean z10) {
        AbstractC16544l.m18094g(leafMessageIds, "leafMessageIds");
        this.f68132a = c21525n;
        this.f68133b = leafMessageIds;
        this.f68134c = z6;
        this.f68135d = c21525n2;
        this.f68136e = z10;
        this.f68137f = c21525n2 != null ? c21525n2 : c21525n;
    }

    /* JADX INFO: renamed from: a */
    public static C21515d m21794a(C21515d c21515d, C21525n c21525n, List list, boolean z6, C21525n c21525n2, boolean z10, int i10) {
        if ((i10 & 1) != 0) {
            c21525n = c21515d.f68132a;
        }
        C21525n c21525n3 = c21525n;
        if ((i10 & 2) != 0) {
            list = c21515d.f68133b;
        }
        List leafMessageIds = list;
        if ((i10 & 4) != 0) {
            z6 = c21515d.f68134c;
        }
        boolean z11 = z6;
        if ((i10 & 8) != 0) {
            c21525n2 = c21515d.f68135d;
        }
        C21525n c21525n4 = c21525n2;
        if ((i10 & 16) != 0) {
            z10 = c21515d.f68136e;
        }
        c21515d.getClass();
        AbstractC16544l.m18094g(leafMessageIds, "leafMessageIds");
        return new C21515d(c21525n3, leafMessageIds, z11, c21525n4, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21515d)) {
            return false;
        }
        C21515d c21515d = (C21515d) obj;
        return AbstractC16544l.m18089b(this.f68132a, c21515d.f68132a) && AbstractC16544l.m18089b(this.f68133b, c21515d.f68133b) && this.f68134c == c21515d.f68134c && AbstractC16544l.m18089b(this.f68135d, c21515d.f68135d) && this.f68136e == c21515d.f68136e;
    }

    public final int hashCode() {
        C21525n c21525n = this.f68132a;
        int iM15858x = (AbstractC14376f.m15858x(this.f68133b, (c21525n == null ? 0 : c21525n.hashCode()) * 31, 31) + (this.f68134c ? 1231 : 1237)) * 31;
        C21525n c21525n2 = this.f68135d;
        return ((iM15858x + (c21525n2 != null ? c21525n2.hashCode() : 0)) * 31) + (this.f68136e ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public /* synthetic */ C21515d() {
        this(null, C17689w.f56480Y, false, null, false);
    }
}
