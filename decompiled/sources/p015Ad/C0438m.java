package p015Ad;

import ao.AbstractC11153a0;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Ad.m */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0438m {
    public static final C0437l Companion = new C0437l();

    /* JADX INFO: renamed from: b */
    public static final KSerializer[] f1425b = {AbstractC11153a0.m12383f("com.openai.feature.conversations.api.mappers.ModelAdjustment.AdjustmentType", EnumC0436k.values())};

    /* JADX INFO: renamed from: a */
    public final EnumC0436k f1426a;

    public /* synthetic */ C0438m(int i10, EnumC0436k enumC0436k) {
        if (1 == (i10 & 1)) {
            this.f1426a = enumC0436k;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C0435j.f1420a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0438m) && this.f1426a == ((C0438m) obj).f1426a;
    }

    public final int hashCode() {
        return this.f1426a.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C0438m(EnumC0436k enumC0436k) {
        this.f1426a = enumC0436k;
    }
}
