package p040Bd;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.W */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1018W {
    public static final C1012V Companion = new C1012V();

    /* JADX INFO: renamed from: a */
    public final String f2822a;

    /* JADX INFO: renamed from: b */
    public final String f2823b;

    /* JADX INFO: renamed from: c */
    public final String f2824c;

    /* JADX INFO: renamed from: d */
    public final Double f2825d;

    /* JADX INFO: renamed from: e */
    public final Double f2826e;

    public /* synthetic */ C1018W(int i10, String str, String str2, String str3, Double d10, Double d11) {
        if ((i10 & 1) == 0) {
            this.f2822a = null;
        } else {
            this.f2822a = str;
        }
        if ((i10 & 2) == 0) {
            this.f2823b = null;
        } else {
            this.f2823b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f2824c = null;
        } else {
            this.f2824c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f2825d = null;
        } else {
            this.f2825d = d10;
        }
        if ((i10 & 16) == 0) {
            this.f2826e = null;
        } else {
            this.f2826e = d11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1018W)) {
            return false;
        }
        C1018W c1018w = (C1018W) obj;
        return AbstractC16544l.m18089b(this.f2822a, c1018w.f2822a) && AbstractC16544l.m18089b(this.f2823b, c1018w.f2823b) && AbstractC16544l.m18089b(this.f2824c, c1018w.f2824c) && AbstractC16544l.m18089b(this.f2825d, c1018w.f2825d) && AbstractC16544l.m18089b(this.f2826e, c1018w.f2826e);
    }

    public final int hashCode() {
        String str = this.f2822a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f2823b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2824c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d10 = this.f2825d;
        int iHashCode4 = (iHashCode3 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f2826e;
        return iHashCode4 + (d11 != null ? d11.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
