package p148Fi;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Fi.L0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C2775L0 {
    public static final C2773K0 Companion = new C2773K0();

    /* JADX INFO: renamed from: c */
    public static final KSerializer[] f8481c = {EnumC2756C.Companion.serializer(), null};

    /* JADX INFO: renamed from: a */
    public final EnumC2756C f8482a;

    /* JADX INFO: renamed from: b */
    public final AbstractC2841n f8483b;

    public /* synthetic */ C2775L0(int i10, EnumC2756C enumC2756C, AbstractC2841n abstractC2841n) {
        if (2 != (i10 & 2)) {
            AbstractC11153a0.m12389l(i10, 2, C2771J0.f8479a.getDescriptor());
            throw null;
        }
        if ((i10 & 1) == 0) {
            this.f8482a = EnumC2756C.Unknown;
        } else {
            this.f8482a = enumC2756C;
        }
        this.f8483b = abstractC2841n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2775L0)) {
            return false;
        }
        C2775L0 c2775l0 = (C2775L0) obj;
        return this.f8482a == c2775l0.f8482a && AbstractC16544l.m18089b(this.f8483b, c2775l0.f8483b);
    }

    public final int hashCode() {
        return this.f8483b.hashCode() + (this.f8482a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
