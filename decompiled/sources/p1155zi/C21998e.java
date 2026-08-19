package p1155zi;

import ao.AbstractC11153a0;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: zi.e */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21998e extends AbstractC22014i {
    public static final C21994d Companion = new C21994d();

    /* JADX INFO: renamed from: c */
    public final boolean f69626c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21998e(int i10, boolean z6, boolean z10) {
        super(z6);
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C21990c.f69622a.getDescriptor());
            throw null;
        }
        this.f69626c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21998e) && this.f69626c == ((C21998e) obj).f69626c;
    }

    public final int hashCode() {
        return this.f69626c ? 1231 : 1237;
    }

    public final String toString() {
        return "█";
    }

    public C21998e(boolean z6) {
        super(z6, 0);
        this.f69626c = z6;
    }
}
