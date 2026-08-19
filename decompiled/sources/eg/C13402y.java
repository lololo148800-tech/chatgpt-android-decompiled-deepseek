package eg;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: eg.y */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C13402y {
    public static final C13398u Companion = new C13398u();

    /* JADX INFO: renamed from: d */
    public static final KSerializer[] f42454d = {null, EnumC13401x.Companion.serializer(), null};

    /* JADX INFO: renamed from: a */
    public final String f42455a;

    /* JADX INFO: renamed from: b */
    public final EnumC13401x f42456b;

    /* JADX INFO: renamed from: c */
    public final Boolean f42457c;

    public /* synthetic */ C13402y(int i10, String str, EnumC13401x enumC13401x, Boolean bool) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C13397t.f42449a.getDescriptor());
            throw null;
        }
        this.f42455a = str;
        if ((i10 & 2) == 0) {
            this.f42456b = EnumC13401x.f42452Z;
        } else {
            this.f42456b = enumC13401x;
        }
        if ((i10 & 4) == 0) {
            this.f42457c = Boolean.FALSE;
        } else {
            this.f42457c = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13402y)) {
            return false;
        }
        C13402y c13402y = (C13402y) obj;
        return AbstractC16544l.m18089b(this.f42455a, c13402y.f42455a) && this.f42456b == c13402y.f42456b && AbstractC16544l.m18089b(this.f42457c, c13402y.f42457c);
    }

    public final int hashCode() {
        int iHashCode = (this.f42456b.hashCode() + (this.f42455a.hashCode() * 31)) * 31;
        Boolean bool = this.f42457c;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
