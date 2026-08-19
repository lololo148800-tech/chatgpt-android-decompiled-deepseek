package p148Fi;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Fi.k */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C2833k extends AbstractC2841n {
    public static final C2830j Companion = new C2830j();

    /* JADX INFO: renamed from: a */
    public final String f8569a;

    /* JADX INFO: renamed from: b */
    public final String f8570b;

    public C2833k(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C2827i.f8566a.getDescriptor());
            throw null;
        }
        this.f8569a = str;
        this.f8570b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2833k)) {
            return false;
        }
        C2833k c2833k = (C2833k) obj;
        return AbstractC16544l.m18089b(this.f8569a, c2833k.f8569a) && AbstractC16544l.m18089b(this.f8570b, c2833k.f8570b);
    }

    public final int hashCode() {
        return this.f8570b.hashCode() + (this.f8569a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
