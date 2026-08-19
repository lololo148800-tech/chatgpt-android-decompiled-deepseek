package p384Ph;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Ph.k */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C6421k {
    public static final C6420j Companion = new C6420j();

    /* JADX INFO: renamed from: c */
    public static final KSerializer[] f20870c = {null, EnumC6424n.Companion.serializer()};

    /* JADX INFO: renamed from: a */
    public final String f20871a;

    /* JADX INFO: renamed from: b */
    public final EnumC6424n f20872b;

    public /* synthetic */ C6421k(int i10, String str, EnumC6424n enumC6424n) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C6419i.f20869a.getDescriptor());
            throw null;
        }
        this.f20871a = str;
        this.f20872b = enumC6424n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6421k)) {
            return false;
        }
        C6421k c6421k = (C6421k) obj;
        return AbstractC16544l.m18089b(this.f20871a, c6421k.f20871a) && this.f20872b == c6421k.f20872b;
    }

    public final int hashCode() {
        String str = this.f20871a;
        return this.f20872b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "█";
    }
}
