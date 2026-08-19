package p1126yd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: yd.l */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21482l implements InterfaceC21409C {
    public static final C21480k Companion = new C21480k();

    /* JADX INFO: renamed from: a */
    public final String f68082a;

    public C21482l(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f68082a = str;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C21478j.f68079a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21482l) {
            return AbstractC16544l.m18089b(this.f68082a, ((C21482l) obj).f68082a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f68082a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
