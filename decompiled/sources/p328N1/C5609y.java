package p328N1;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: N1.y */
/* JADX INFO: loaded from: classes.dex */
public final class C5609y implements Comparable {

    /* JADX INFO: renamed from: Z */
    public static final C5609y f18151Z;

    /* JADX INFO: renamed from: o0 */
    public static final C5609y f18152o0;

    /* JADX INFO: renamed from: p0 */
    public static final C5609y f18153p0;

    /* JADX INFO: renamed from: q0 */
    public static final C5609y f18154q0;

    /* JADX INFO: renamed from: r0 */
    public static final C5609y f18155r0;

    /* JADX INFO: renamed from: s0 */
    public static final C5609y f18156s0;

    /* JADX INFO: renamed from: t0 */
    public static final C5609y f18157t0;

    /* JADX INFO: renamed from: u0 */
    public static final C5609y f18158u0;

    /* JADX INFO: renamed from: v0 */
    public static final List f18159v0;

    /* JADX INFO: renamed from: Y */
    public final int f18160Y;

    static {
        C5609y c5609y = new C5609y(100);
        C5609y c5609y2 = new C5609y(RCHTTPStatusCodes.SUCCESS);
        C5609y c5609y3 = new C5609y(RCHTTPStatusCodes.UNSUCCESSFUL);
        C5609y c5609y4 = new C5609y(RCHTTPStatusCodes.BAD_REQUEST);
        f18151Z = c5609y4;
        C5609y c5609y5 = new C5609y(500);
        f18152o0 = c5609y5;
        C5609y c5609y6 = new C5609y(600);
        f18153p0 = c5609y6;
        C5609y c5609y7 = new C5609y(700);
        C5609y c5609y8 = new C5609y(800);
        f18154q0 = c5609y8;
        C5609y c5609y9 = new C5609y(900);
        f18155r0 = c5609y4;
        f18156s0 = c5609y5;
        f18157t0 = c5609y6;
        f18158u0 = c5609y7;
        f18159v0 = AbstractC17681o.m19382k(c5609y, c5609y2, c5609y3, c5609y4, c5609y5, c5609y6, c5609y7, c5609y8, c5609y9);
    }

    public C5609y(int i10) {
        this.f18160Y = i10;
        if (1 > i10 || i10 >= 1001) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "Font weight can be in range [1, 1000]. Current value: ").toString());
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C5609y c5609y) {
        return AbstractC16544l.m18096i(this.f18160Y, c5609y.f18160Y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5609y) {
            return this.f18160Y == ((C5609y) obj).f18160Y;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18160Y;
    }

    public final String toString() {
        return AbstractC12107L1.m13826q(new StringBuilder("FontWeight(weight="), this.f18160Y, ')');
    }
}
