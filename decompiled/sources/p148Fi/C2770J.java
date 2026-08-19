package p148Fi;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Fi.J */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C2770J extends AbstractC2841n {
    public static final C2768I Companion = new C2768I();

    /* JADX INFO: renamed from: b */
    public static final KSerializer[] f8477b = {EnumC2779N0.Companion.serializer()};

    /* JADX INFO: renamed from: a */
    public final EnumC2779N0 f8478a;

    public C2770J(int i10, EnumC2779N0 enumC2779N0) {
        if (1 == (i10 & 1)) {
            this.f8478a = enumC2779N0;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C2766H.f8473a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2770J) && this.f8478a == ((C2770J) obj).f8478a;
    }

    public final int hashCode() {
        return this.f8478a.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C2770J(EnumC2779N0 newState) {
        AbstractC16544l.m18094g(newState, "newState");
        this.f8478a = newState;
    }
}
