package af;

import bf.C11363S;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: af.B */
/* JADX INFO: loaded from: classes3.dex */
public final class C10546B implements InterfaceC10551G {

    /* JADX INFO: renamed from: a */
    public final C11363S f31310a;

    public C10546B(C11363S c11363s) {
        this.f31310a = c11363s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10546B) && AbstractC16544l.m18089b(this.f31310a, ((C10546B) obj).f31310a);
    }

    public final int hashCode() {
        C11363S c11363s = this.f31310a;
        if (c11363s == null) {
            return 0;
        }
        return c11363s.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
