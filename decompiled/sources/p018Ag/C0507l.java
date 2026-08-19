package p018Ag;

import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Ag.l */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0507l {
    public static final C0506k Companion = new C0506k();

    /* JADX INFO: renamed from: b */
    public static final KSerializer[] f1641b = {EnumC0498c.Companion.serializer()};

    /* JADX INFO: renamed from: a */
    public final EnumC0498c f1642a;

    public C0507l() {
        this.f1642a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0507l) && this.f1642a == ((C0507l) obj).f1642a;
    }

    public final int hashCode() {
        EnumC0498c enumC0498c = this.f1642a;
        if (enumC0498c == null) {
            return 0;
        }
        return enumC0498c.hashCode();
    }

    public final String toString() {
        return "█";
    }

    public /* synthetic */ C0507l(int i10, EnumC0498c enumC0498c) {
        if ((i10 & 1) == 0) {
            this.f1642a = null;
        } else {
            this.f1642a = enumC0498c;
        }
    }
}
