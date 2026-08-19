package p505Uf;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Uf.k */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C7650k {
    public static final C7647h Companion = new C7647h();

    /* JADX INFO: renamed from: e */
    public static final KSerializer[] f24169e = {EnumC7649j.Companion.serializer(), EnumC7643d.Companion.serializer(), null, null};

    /* JADX INFO: renamed from: a */
    public final EnumC7649j f24170a;

    /* JADX INFO: renamed from: b */
    public final EnumC7643d f24171b;

    /* JADX INFO: renamed from: c */
    public final String f24172c;

    /* JADX INFO: renamed from: d */
    public final Integer f24173d;

    public /* synthetic */ C7650k(int i10, EnumC7649j enumC7649j, EnumC7643d enumC7643d, String str, Integer num) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C7640a.f24152a.getDescriptor());
            throw null;
        }
        this.f24170a = enumC7649j;
        if ((i10 & 2) == 0) {
            this.f24171b = null;
        } else {
            this.f24171b = enumC7643d;
        }
        if ((i10 & 4) == 0) {
            this.f24172c = null;
        } else {
            this.f24172c = str;
        }
        if ((i10 & 8) == 0) {
            this.f24173d = null;
        } else {
            this.f24173d = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7650k)) {
            return false;
        }
        C7650k c7650k = (C7650k) obj;
        return this.f24170a == c7650k.f24170a && this.f24171b == c7650k.f24171b && AbstractC16544l.m18089b(this.f24172c, c7650k.f24172c) && AbstractC16544l.m18089b(this.f24173d, c7650k.f24173d);
    }

    public final int hashCode() {
        int iHashCode = this.f24170a.hashCode() * 31;
        EnumC7643d enumC7643d = this.f24171b;
        int iHashCode2 = (iHashCode + (enumC7643d == null ? 0 : enumC7643d.hashCode())) * 31;
        String str = this.f24172c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f24173d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
