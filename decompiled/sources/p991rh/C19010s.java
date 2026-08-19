package p991rh;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: rh.s */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C19010s {
    public static final C19009r Companion = new C19009r();

    /* JADX INFO: renamed from: a */
    public final String f60588a;

    public /* synthetic */ C19010s(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f60588a = str;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C19008q.f60587a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19010s) && AbstractC16544l.m18089b(this.f60588a, ((C19010s) obj).f60588a);
    }

    public final int hashCode() {
        return this.f60588a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
