package p1155zi;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: zi.E0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21908E0 implements InterfaceC21915G {
    public static final C21904D0 Companion = new C21904D0();

    /* JADX INFO: renamed from: a */
    public final String f69452a;

    /* JADX INFO: renamed from: b */
    public final String f69453b;

    /* JADX INFO: renamed from: c */
    public final Integer f69454c;

    /* JADX INFO: renamed from: d */
    public final String f69455d;

    public C21908E0(String assetPointer, String name, Integer num, String str) {
        AbstractC16544l.m18094g(assetPointer, "assetPointer");
        AbstractC16544l.m18094g(name, "name");
        this.f69452a = assetPointer;
        this.f69453b = name;
        this.f69454c = num;
        this.f69455d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21908E0)) {
            return false;
        }
        C21908E0 c21908e0 = (C21908E0) obj;
        return AbstractC16544l.m18089b(this.f69452a, c21908e0.f69452a) && AbstractC16544l.m18089b(this.f69453b, c21908e0.f69453b) && AbstractC16544l.m18089b(this.f69454c, c21908e0.f69454c) && AbstractC16544l.m18089b(this.f69455d, c21908e0.f69455d);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f69452a.hashCode() * 31, 31, this.f69453b);
        Integer num = this.f69454c;
        int iHashCode = (iM527p + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f69455d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C21908E0(int i10, Integer num, String str, String str2, String str3) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C21900C0.f69434a.getDescriptor());
            throw null;
        }
        this.f69452a = str;
        this.f69453b = str2;
        if ((i10 & 4) == 0) {
            this.f69454c = null;
        } else {
            this.f69454c = num;
        }
        if ((i10 & 8) == 0) {
            this.f69455d = null;
        } else {
            this.f69455d = str3;
        }
    }
}
