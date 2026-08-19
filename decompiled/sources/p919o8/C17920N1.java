package p919o8;

import android.gov.nist.core.Separators;
import p001A.AbstractC0010F;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: o8.N1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17920N1 {

    /* JADX INFO: renamed from: a */
    public final int f57124a;

    public C17920N1(int i10) {
        AbstractC14376f.m15825D(i10, "replayLevel");
        this.f57124a = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17920N1) && this.f57124a == ((C17920N1) obj).f57124a;
    }

    public final int hashCode() {
        return AbstractC0010F.m24h(this.f57124a);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Privacy(replayLevel=");
        int i10 = this.f57124a;
        if (i10 == 1) {
            str = "ALLOW";
        } else if (i10 != 2) {
            str = i10 != 3 ? "null" : "MASK_USER_INPUT";
        } else {
            str = "MASK";
        }
        sb2.append(str);
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }
}
