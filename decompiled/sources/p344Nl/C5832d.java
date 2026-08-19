package p344Nl;

import kotlin.jvm.internal.AbstractC16544l;
import p228J.AbstractC3794B0;
import p387Pl.C6474V;

/* JADX INFO: renamed from: Nl.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C5832d {

    /* JADX INFO: renamed from: a */
    public final String f19056a = "vp8";

    /* JADX INFO: renamed from: b */
    public final C6474V f19057b = null;

    /* JADX INFO: renamed from: c */
    public final boolean f19058c = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5832d)) {
            return false;
        }
        C5832d c5832d = (C5832d) obj;
        return AbstractC16544l.m18089b(this.f19056a, c5832d.f19056a) && AbstractC16544l.m18089b(this.f19057b, c5832d.f19057b) && this.f19058c == c5832d.f19058c;
    }

    public final int hashCode() {
        int iHashCode = this.f19056a.hashCode() * 31;
        C6474V c6474v = this.f19057b;
        return ((iHashCode + (c6474v == null ? 0 : c6474v.hashCode())) * 31) + (this.f19058c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackupVideoCodec(codec=");
        sb2.append(this.f19056a);
        sb2.append(", encoding=");
        sb2.append(this.f19057b);
        sb2.append(", simulcast=");
        return AbstractC3794B0.m4499x(sb2, this.f19058c, ')');
    }
}
