package p1082wd;

import kotlin.jvm.internal.AbstractC16544l;
import p220Ih.AbstractC3719a;
import p269Kh.C4688o;

/* JADX INFO: renamed from: wd.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C20909b {

    /* JADX INFO: renamed from: a */
    public final C4688o f66650a;

    /* JADX INFO: renamed from: b */
    public final C4688o f66651b;

    /* JADX INFO: renamed from: c */
    public final String f66652c;

    /* JADX INFO: renamed from: d */
    public final C4688o f66653d;

    /* JADX INFO: renamed from: e */
    public final C4688o f66654e;

    public C20909b(C4688o c4688o, C4688o fallbackModel, String str, C4688o c4688o2, int i10) {
        c4688o = (i10 & 1) != 0 ? null : c4688o;
        fallbackModel = (i10 & 2) != 0 ? AbstractC3719a.f11272e : fallbackModel;
        str = (i10 & 4) != 0 ? null : str;
        c4688o2 = (i10 & 16) != 0 ? null : c4688o2;
        AbstractC16544l.m18094g(fallbackModel, "fallbackModel");
        this.f66650a = c4688o;
        this.f66651b = fallbackModel;
        this.f66652c = str;
        this.f66653d = null;
        this.f66654e = c4688o2;
    }

    /* JADX INFO: renamed from: a */
    public final C4688o m21453a() {
        C4688o c4688o = this.f66654e;
        return c4688o == null ? this.f66651b : c4688o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20909b)) {
            return false;
        }
        C20909b c20909b = (C20909b) obj;
        return AbstractC16544l.m18089b(this.f66650a, c20909b.f66650a) && AbstractC16544l.m18089b(this.f66651b, c20909b.f66651b) && AbstractC16544l.m18089b(this.f66652c, c20909b.f66652c) && AbstractC16544l.m18089b(this.f66653d, c20909b.f66653d) && AbstractC16544l.m18089b(this.f66654e, c20909b.f66654e);
    }

    public final int hashCode() {
        C4688o c4688o = this.f66650a;
        int iHashCode = (this.f66651b.hashCode() + ((c4688o == null ? 0 : c4688o.hashCode()) * 31)) * 31;
        String str = this.f66652c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C4688o c4688o2 = this.f66653d;
        int iHashCode3 = (iHashCode2 + (c4688o2 == null ? 0 : c4688o2.hashCode())) * 31;
        C4688o c4688o3 = this.f66654e;
        return iHashCode3 + (c4688o3 != null ? c4688o3.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
