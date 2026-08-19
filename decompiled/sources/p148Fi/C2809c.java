package p148Fi;

import ao.AbstractC11153a0;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Fi.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C2809c extends AbstractC2841n {
    public static final C2806b Companion = new C2806b();

    /* JADX INFO: renamed from: b */
    public static final KSerializer[] f8536b = {EnumC2753A0.Companion.serializer()};

    /* JADX INFO: renamed from: a */
    public final EnumC2753A0 f8537a;

    public C2809c(int i10, EnumC2753A0 enumC2753A0) {
        if (1 == (i10 & 1)) {
            this.f8537a = enumC2753A0;
        } else {
            AbstractC11153a0.m12389l(i10, 1, C2803a.f8532a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2809c) && this.f8537a == ((C2809c) obj).f8537a;
    }

    public final int hashCode() {
        return this.f8537a.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public C2809c(EnumC2753A0 enumC2753A0) {
        this.f8537a = enumC2753A0;
    }
}
