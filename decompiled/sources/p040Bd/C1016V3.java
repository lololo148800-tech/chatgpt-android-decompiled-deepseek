package p040Bd;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: Bd.V3 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1016V3 implements InterfaceC1028X3 {
    public static final C1010U3 Companion = new C1010U3();

    /* JADX INFO: renamed from: a */
    public final String f2820a;

    public /* synthetic */ C1016V3(String str) {
        this.f2820a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1016V3) {
            return AbstractC16544l.m18089b(this.f2820a, ((C1016V3) obj).f2820a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2820a.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f2820a, Separators.RPAREN, new StringBuilder("Text(value="));
    }
}
