package bf;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: bf.N */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C11359N implements InterfaceC11353H {
    public static final C11358M Companion = new C11358M();

    /* JADX INFO: renamed from: a */
    public final String f34354a;

    /* JADX INFO: renamed from: b */
    public final String f34355b;

    public /* synthetic */ C11359N(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C11357L.f34353a.getDescriptor());
            throw null;
        }
        this.f34354a = str;
        this.f34355b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11359N)) {
            return false;
        }
        C11359N c11359n = (C11359N) obj;
        return AbstractC16544l.m18089b(this.f34354a, c11359n.f34354a) && AbstractC16544l.m18089b(this.f34355b, c11359n.f34355b);
    }

    public final int hashCode() {
        return this.f34355b.hashCode() + (this.f34354a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }

    public C11359N(String str, String str2) {
        this.f34354a = str;
        this.f34355b = str2;
    }
}
