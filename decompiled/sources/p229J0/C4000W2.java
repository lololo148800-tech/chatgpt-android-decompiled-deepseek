package p229J0;

import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17321x;
import p203I0.C3551h;
import p774h1.C14365u;

/* JADX INFO: renamed from: J0.W2 */
/* JADX INFO: loaded from: classes.dex */
public final class C4000W2 {

    /* JADX INFO: renamed from: a */
    public final long f12550a = C14365u.f45060j;

    /* JADX INFO: renamed from: b */
    public final C3551h f12551b = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4000W2)) {
            return false;
        }
        C4000W2 c4000w2 = (C4000W2) obj;
        return C14365u.m15775c(this.f12550a, c4000w2.f12550a) && AbstractC16544l.m18089b(this.f12551b, c4000w2.f12551b);
    }

    public final int hashCode() {
        int i10 = C14365u.f45061k;
        int iM18981a = C17321x.m18981a(this.f12550a) * 31;
        C3551h c3551h = this.f12551b;
        return iM18981a + (c3551h != null ? c3551h.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RippleConfiguration(color=");
        AbstractC12107L1.m13828s(this.f12550a, ", rippleAlpha=", sb2);
        sb2.append(this.f12551b);
        sb2.append(')');
        return sb2.toString();
    }
}
