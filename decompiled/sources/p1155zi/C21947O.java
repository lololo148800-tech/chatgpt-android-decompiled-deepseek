package p1155zi;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: zi.O */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21947O implements InterfaceC21915G {
    public static final C21923I Companion = new C21923I();

    /* JADX INFO: renamed from: a */
    public final String f69501a;

    /* JADX INFO: renamed from: b */
    public final int f69502b;

    /* JADX INFO: renamed from: c */
    public final EnumC21931K f69503c;

    /* JADX INFO: renamed from: d */
    public final C21943N f69504d;

    public C21947O(String assetPointer, int i10, EnumC21931K format, C21943N c21943n) {
        AbstractC16544l.m18094g(assetPointer, "assetPointer");
        AbstractC16544l.m18094g(format, "format");
        this.f69501a = assetPointer;
        this.f69502b = i10;
        this.f69503c = format;
        this.f69504d = c21943n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21947O)) {
            return false;
        }
        C21947O c21947o = (C21947O) obj;
        return AbstractC16544l.m18089b(this.f69501a, c21947o.f69501a) && this.f69502b == c21947o.f69502b && this.f69503c == c21947o.f69503c && AbstractC16544l.m18089b(this.f69504d, c21947o.f69504d);
    }

    public final int hashCode() {
        int iHashCode = (this.f69503c.hashCode() + (((this.f69501a.hashCode() * 31) + this.f69502b) * 31)) * 31;
        C21943N c21943n = this.f69504d;
        return iHashCode + (c21943n == null ? 0 : c21943n.hashCode());
    }

    public final String toString() {
        return "█";
    }

    public C21947O(int i10, String str, int i11, EnumC21931K enumC21931K, C21943N c21943n) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C21919H.f69470a.getDescriptor());
            throw null;
        }
        this.f69501a = str;
        this.f69502b = i11;
        this.f69503c = enumC21931K;
        if ((i10 & 8) == 0) {
            this.f69504d = null;
        } else {
            this.f69504d = c21943n;
        }
    }
}
