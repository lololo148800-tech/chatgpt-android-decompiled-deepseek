package p598Ye;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Ye.z */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C10055z {
    public static final C10054y Companion = new C10054y();

    /* JADX INFO: renamed from: a */
    public final String f29773a;

    /* JADX INFO: renamed from: b */
    public final C10053x f29774b;

    public /* synthetic */ C10055z(int i10, String str, C10053x c10053x) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C10050u.f29765a.getDescriptor());
            throw null;
        }
        this.f29773a = str;
        this.f29774b = c10053x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10055z)) {
            return false;
        }
        C10055z c10055z = (C10055z) obj;
        return AbstractC16544l.m18089b(this.f29773a, c10055z.f29773a) && AbstractC16544l.m18089b(this.f29774b, c10055z.f29774b);
    }

    public final int hashCode() {
        return this.f29774b.hashCode() + (this.f29773a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }

    public C10055z(C10053x c10053x) {
        this.f29773a = "private";
        this.f29774b = c10053x;
    }
}
