package p1155zi;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import p165G9.AbstractC3021g;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: zi.a1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21984a1 implements Comparable<C21984a1> {
    public static final C21980Z0 Companion = new C21980Z0();

    /* JADX INFO: renamed from: Y */
    public final String f69607Y;

    public /* synthetic */ C21984a1(String str) {
        this.f69607Y = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C21984a1 c21984a1) {
        String other = c21984a1.f69607Y;
        AbstractC16544l.m18094g(other, "other");
        return AbstractC3021g.m3873a(this.f69607Y, other);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C21984a1) {
            return AbstractC16544l.m18089b(this.f69607Y, ((C21984a1) obj).f69607Y);
        }
        return false;
    }

    public final int hashCode() {
        return this.f69607Y.hashCode();
    }

    public final String toString() {
        return AbstractC9306j0.m9891j(this.f69607Y, Separators.RPAREN, new StringBuilder("MessageId(value="));
    }
}
