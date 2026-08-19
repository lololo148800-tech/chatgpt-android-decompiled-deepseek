package bf;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: bf.s */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C11391s {
    public static final C11390r Companion = new C11390r();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f34414d = {null, EnumC11347B.Companion.serializer(), null};

    /* JADX INFO: renamed from: a */
    public final String f34415a;

    /* JADX INFO: renamed from: b */
    public final EnumC11347B f34416b;

    /* JADX INFO: renamed from: c */
    public final C11398z f34417c;

    public /* synthetic */ C11391s(int i10, String str, EnumC11347B enumC11347B, C11398z c11398z) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C11389q.f34413a.getDescriptor());
            throw null;
        }
        this.f34415a = str;
        this.f34416b = enumC11347B;
        if ((i10 & 4) == 0) {
            this.f34417c = null;
        } else {
            this.f34417c = c11398z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11391s)) {
            return false;
        }
        C11391s c11391s = (C11391s) obj;
        return AbstractC16544l.m18089b(this.f34415a, c11391s.f34415a) && this.f34416b == c11391s.f34416b && AbstractC16544l.m18089b(this.f34417c, c11391s.f34417c);
    }

    public final int hashCode() {
        int iHashCode = (this.f34416b.hashCode() + (this.f34415a.hashCode() * 31)) * 31;
        C11398z c11398z = this.f34417c;
        return iHashCode + (c11398z == null ? 0 : c11398z.hashCode());
    }

    public final String toString() {
        return "█";
    }

    public C11391s(String str, EnumC11347B type, C11398z c11398z) {
        AbstractC16544l.m18094g(type, "type");
        this.f34415a = str;
        this.f34416b = type;
        this.f34417c = c11398z;
    }
}
