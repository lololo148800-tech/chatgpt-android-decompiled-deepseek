package p296Lk;

import android.gov.nist.core.Separators;
import p003A1.C0307z;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Lk.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C5113j {

    /* JADX INFO: renamed from: a */
    public final C0307z f16711a;

    /* JADX INFO: renamed from: b */
    public final C0307z f16712b;

    /* JADX INFO: renamed from: c */
    public final boolean f16713c;

    public C5113j(C0307z c0307z, C0307z c0307z2, boolean z6) {
        this.f16711a = c0307z;
        this.f16712b = c0307z2;
        this.f16713c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5113j)) {
            return false;
        }
        C5113j c5113j = (C5113j) obj;
        return this.f16711a.equals(c5113j.f16711a) && this.f16712b.equals(c5113j.f16712b) && this.f16713c == c5113j.f16713c;
    }

    public final int hashCode() {
        return ((this.f16712b.hashCode() + (this.f16711a.hashCode() * 31)) * 31) + (this.f16713c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LazyTablePinConfiguration(columns=");
        sb2.append(this.f16711a);
        sb2.append(", rows=");
        sb2.append(this.f16712b);
        sb2.append(", footer=");
        return AbstractC14376f.m15823B(sb2, this.f16713c, Separators.RPAREN);
    }
}
