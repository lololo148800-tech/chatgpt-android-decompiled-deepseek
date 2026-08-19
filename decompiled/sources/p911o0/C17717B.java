package p911o0;

import kotlin.jvm.internal.AbstractC16544l;
import p1095x1.AbstractC21069X;
import p492U1.EnumC7546k;
import p635a1.InterfaceC10445c;

/* JADX INFO: renamed from: o0.B */
/* JADX INFO: loaded from: classes.dex */
public final class C17717B extends AbstractC17758g {

    /* JADX INFO: renamed from: h */
    public final InterfaceC10445c f56554h;

    public C17717B(InterfaceC10445c interfaceC10445c) {
        this.f56554h = interfaceC10445c;
    }

    @Override // p911o0.AbstractC17758g
    /* JADX INFO: renamed from: c */
    public final int mo19456c(int i10, EnumC7546k enumC7546k, AbstractC21069X abstractC21069X, int i11) {
        return this.f56554h.mo10924a(0, i10, enumC7546k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17717B) && AbstractC16544l.m18089b(this.f56554h, ((C17717B) obj).f56554h);
    }

    public final int hashCode() {
        return this.f56554h.hashCode();
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.f56554h + ')';
    }
}
