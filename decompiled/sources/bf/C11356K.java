package bf;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: bf.K */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C11356K implements InterfaceC11353H {
    public static final C11355J Companion = new C11355J();

    /* JADX INFO: renamed from: a */
    public final String f34351a;

    /* JADX INFO: renamed from: b */
    public final Integer f34352b;

    public C11356K(Integer num, String str) {
        this.f34351a = str;
        this.f34352b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11356K)) {
            return false;
        }
        C11356K c11356k = (C11356K) obj;
        return AbstractC16544l.m18089b(this.f34351a, c11356k.f34351a) && AbstractC16544l.m18089b(this.f34352b, c11356k.f34352b);
    }

    public final int hashCode() {
        int iHashCode = this.f34351a.hashCode() * 31;
        Integer num = this.f34352b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "█";
    }

    public /* synthetic */ C11356K(String str, int i10, Integer num) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C11354I.f34350a.getDescriptor());
            throw null;
        }
        this.f34351a = str;
        if ((i10 & 2) == 0) {
            this.f34352b = null;
        } else {
            this.f34352b = num;
        }
    }
}
