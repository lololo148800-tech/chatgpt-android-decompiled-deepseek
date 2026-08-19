package p964qe;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p098Di.InterfaceC2062k;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: qe.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C18698k implements InterfaceC2062k {

    /* JADX INFO: renamed from: a */
    public final boolean f59520a;

    /* JADX INFO: renamed from: b */
    public final boolean f59521b;

    /* JADX INFO: renamed from: c */
    public final List f59522c;

    /* JADX INFO: renamed from: d */
    public final List f59523d;

    public C18698k(boolean z6, boolean z10, List variants, List viewed) {
        AbstractC16544l.m18094g(variants, "variants");
        AbstractC16544l.m18094g(viewed, "viewed");
        this.f59520a = z6;
        this.f59521b = z10;
        this.f59522c = variants;
        this.f59523d = viewed;
    }

    /* JADX INFO: renamed from: e */
    public static C18698k m20041e(C18698k c18698k, boolean z6, boolean z10, ArrayList arrayList, ArrayList arrayList2, int i10) {
        if ((i10 & 1) != 0) {
            z6 = c18698k.f59520a;
        }
        if ((i10 & 2) != 0) {
            z10 = c18698k.f59521b;
        }
        List variants = arrayList;
        if ((i10 & 4) != 0) {
            variants = c18698k.f59522c;
        }
        List viewed = arrayList2;
        if ((i10 & 8) != 0) {
            viewed = c18698k.f59523d;
        }
        c18698k.getClass();
        AbstractC16544l.m18094g(variants, "variants");
        AbstractC16544l.m18094g(viewed, "viewed");
        return new C18698k(z6, z10, variants, viewed);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18698k)) {
            return false;
        }
        C18698k c18698k = (C18698k) obj;
        return this.f59520a == c18698k.f59520a && this.f59521b == c18698k.f59521b && AbstractC16544l.m18089b(this.f59522c, c18698k.f59522c) && AbstractC16544l.m18089b(this.f59523d, c18698k.f59523d);
    }

    public final int hashCode() {
        return this.f59523d.hashCode() + AbstractC14376f.m15858x(this.f59522c, (((this.f59520a ? 1231 : 1237) * 31) + (this.f59521b ? 1231 : 1237)) * 31, 31);
    }

    public final String toString() {
        return "█";
    }
}
