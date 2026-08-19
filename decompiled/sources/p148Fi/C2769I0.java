package p148Fi;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Fi.I0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C2769I0 {
    public static final C2767H0 Companion = new C2767H0();

    /* JADX INFO: renamed from: c */
    public static final KSerializer[] f8474c = {EnumC2821g.Companion.serializer(), null};

    /* JADX INFO: renamed from: a */
    public final EnumC2821g f8475a;

    /* JADX INFO: renamed from: b */
    public final AbstractC2841n f8476b;

    public /* synthetic */ C2769I0(int i10, EnumC2821g enumC2821g, AbstractC2841n abstractC2841n) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C2765G0.f8472a.getDescriptor());
            throw null;
        }
        this.f8475a = enumC2821g;
        this.f8476b = abstractC2841n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2769I0)) {
            return false;
        }
        C2769I0 c2769i0 = (C2769I0) obj;
        return this.f8475a == c2769i0.f8475a && AbstractC16544l.m18089b(this.f8476b, c2769i0.f8476b);
    }

    public final int hashCode() {
        return this.f8476b.hashCode() + (this.f8475a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }

    public C2769I0(EnumC2821g enumC2821g, AbstractC2841n abstractC2841n) {
        this.f8475a = enumC2821g;
        this.f8476b = abstractC2841n;
    }
}
