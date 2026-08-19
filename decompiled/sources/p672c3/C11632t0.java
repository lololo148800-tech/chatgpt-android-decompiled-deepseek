package p672c3;

import p228J.AbstractC3794B0;

/* JADX INFO: renamed from: c3.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11632t0 {

    /* JADX INFO: renamed from: a */
    public final EnumC11620n0 f35250a;

    /* JADX INFO: renamed from: b */
    public final boolean f35251b;

    /* JADX INFO: renamed from: c */
    public final boolean f35252c;

    public C11632t0(EnumC11620n0 enumC11620n0, boolean z6, boolean z10) {
        this.f35250a = enumC11620n0;
        this.f35251b = z6;
        this.f35252c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11632t0)) {
            return false;
        }
        C11632t0 c11632t0 = (C11632t0) obj;
        return this.f35250a == c11632t0.f35250a && this.f35251b == c11632t0.f35251b && this.f35252c == c11632t0.f35252c;
    }

    public final int hashCode() {
        return (((this.f35250a.hashCode() * 31) + (this.f35251b ? 1231 : 1237)) * 31) + (this.f35252c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RowColumnChildSelector(type=");
        sb2.append(this.f35250a);
        sb2.append(", expandWidth=");
        sb2.append(this.f35251b);
        sb2.append(", expandHeight=");
        return AbstractC3794B0.m4499x(sb2, this.f35252c, ')');
    }
}
