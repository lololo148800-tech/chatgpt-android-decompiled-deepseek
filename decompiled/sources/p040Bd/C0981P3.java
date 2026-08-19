package p040Bd;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p1155zi.C21965U0;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.P3 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0981P3 implements InterfaceC1028X3 {
    public static final C0975O3 Companion = new C0975O3();

    /* JADX INFO: renamed from: a */
    public final C21965U0 f2767a;

    public /* synthetic */ C0981P3(C21965U0 c21965u0) {
        this.f2767a = c21965u0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0981P3) {
            return AbstractC16544l.m18089b(this.f2767a, ((C0981P3) obj).f2767a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2767a.hashCode();
    }

    public final String toString() {
        return "Image(value=" + this.f2767a + Separators.RPAREN;
    }
}
