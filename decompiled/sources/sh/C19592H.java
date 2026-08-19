package sh;

import kotlin.jvm.internal.AbstractC16544l;
import p917o6.InterfaceC17845M;

/* JADX INFO: renamed from: sh.H */
/* JADX INFO: loaded from: classes3.dex */
public final class C19592H implements InterfaceC17845M {

    /* JADX INFO: renamed from: a */
    public final C19593I f62202a;

    public C19592H(C19593I c19593i) {
        this.f62202a = c19593i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19592H) && AbstractC16544l.m18089b(this.f62202a, ((C19592H) obj).f62202a);
    }

    public final int hashCode() {
        C19593I c19593i = this.f62202a;
        if (c19593i == null) {
            return 0;
        }
        return c19593i.f62203a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
