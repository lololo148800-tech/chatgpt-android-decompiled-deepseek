package p040Bd;

import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.w3 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1188w3 {
    public static final C1182v3 Companion = new C1182v3();

    /* JADX INFO: renamed from: b */
    public static final KSerializer[] f3140b = {EnumC0940I4.Companion.serializer()};

    /* JADX INFO: renamed from: a */
    public final EnumC0940I4 f3141a;

    public /* synthetic */ C1188w3(int i10, EnumC0940I4 enumC0940I4) {
        if ((i10 & 1) == 0) {
            this.f3141a = EnumC0940I4.f2701o0;
        } else {
            this.f3141a = enumC0940I4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1188w3) && this.f3141a == ((C1188w3) obj).f3141a;
    }

    public final int hashCode() {
        return this.f3141a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
