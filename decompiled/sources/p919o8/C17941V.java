package p919o8;

import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p315Me.Myis.CxcULo;
import p571X9.AbstractC9306j0;
import p775h2.AbstractC14376f;
import sj.hJY.CsqksqyPE;

/* JADX INFO: renamed from: o8.V */
/* JADX INFO: loaded from: classes.dex */
public final class C17941V {

    /* JADX INFO: renamed from: a */
    public final int f57223a;

    /* JADX INFO: renamed from: b */
    public final String f57224b;

    /* JADX INFO: renamed from: c */
    public final String f57225c;

    /* JADX INFO: renamed from: d */
    public final String f57226d;

    /* JADX INFO: renamed from: e */
    public final String f57227e;

    public C17941V(int i10, String str, String str2, String str3, String str4) {
        AbstractC14376f.m15825D(i10, "type");
        this.f57223a = i10;
        this.f57224b = str;
        this.f57225c = str2;
        this.f57226d = str3;
        this.f57227e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17941V)) {
            return false;
        }
        C17941V c17941v = (C17941V) obj;
        return this.f57223a == c17941v.f57223a && AbstractC16544l.m18089b(this.f57224b, c17941v.f57224b) && AbstractC16544l.m18089b(this.f57225c, c17941v.f57225c) && AbstractC16544l.m18089b(this.f57226d, c17941v.f57226d) && AbstractC16544l.m18089b(this.f57227e, c17941v.f57227e);
    }

    public final int hashCode() {
        int iM24h = AbstractC0010F.m24h(this.f57223a) * 31;
        String str = this.f57224b;
        int iHashCode = (iM24h + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f57225c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57226d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f57227e;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device(type=");
        sb2.append(AbstractC17962d.m19639b0(this.f57223a));
        sb2.append(", name=");
        sb2.append(this.f57224b);
        sb2.append(", model=");
        sb2.append(this.f57225c);
        sb2.append(CsqksqyPE.PvVnzr);
        sb2.append(this.f57226d);
        sb2.append(", architecture=");
        return AbstractC9306j0.m9891j(this.f57227e, CxcULo.KMYtgfS, sb2);
    }
}
