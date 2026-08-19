package p1114xp;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: xp.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C21332c {

    /* JADX INFO: renamed from: a */
    public InterfaceC21331b f67763a;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C21332c) && AbstractC16544l.m18089b(this.f67763a, ((C21332c) obj).f67763a);
        }
        return true;
    }

    public final int hashCode() {
        InterfaceC21331b interfaceC21331b = this.f67763a;
        if (interfaceC21331b != null) {
            return interfaceC21331b.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Container(state=" + this.f67763a + Separators.RPAREN;
    }
}
