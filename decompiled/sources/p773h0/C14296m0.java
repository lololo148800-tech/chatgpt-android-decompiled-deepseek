package p773h0;

import androidx.compose.foundation.layout.AbstractC10842a;
import com.google.protobuf.AbstractC12107L1;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17321x;
import p774h1.AbstractC14334L;
import p774h1.C14365u;
import p911o0.C17767k0;
import p911o0.InterfaceC17763i0;

/* JADX INFO: renamed from: h0.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C14296m0 {

    /* JADX INFO: renamed from: a */
    public final long f44883a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC17763i0 f44884b;

    public C14296m0() {
        long jM15626d = AbstractC14334L.m15626d(4284900966L);
        C17767k0 c17767k0M11223a = AbstractC10842a.m11223a(0.0f, 0.0f, 3);
        this.f44883a = jM15626d;
        this.f44884b = c17767k0M11223a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C14296m0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        C14296m0 c14296m0 = (C14296m0) obj;
        return C14365u.m15775c(this.f44883a, c14296m0.f44883a) && AbstractC16544l.m18089b(this.f44884b, c14296m0.f44884b);
    }

    public final int hashCode() {
        int i10 = C14365u.f45061k;
        return this.f44884b.hashCode() + (C17321x.m18981a(this.f44883a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OverscrollConfiguration(glowColor=");
        AbstractC12107L1.m13828s(this.f44883a, ", drawPadding=", sb2);
        sb2.append(this.f44884b);
        sb2.append(')');
        return sb2.toString();
    }
}
