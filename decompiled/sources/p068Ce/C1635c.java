package p068Ce;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Ce.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1635c {
    public static final C1634b Companion = new C1634b();

    /* JADX INFO: renamed from: a */
    public final Boolean f4627a;

    /* JADX INFO: renamed from: b */
    public final Boolean f4628b;

    /* JADX INFO: renamed from: c */
    public final String f4629c;

    /* JADX INFO: renamed from: d */
    public final String f4630d;

    public /* synthetic */ C1635c(int i10, Boolean bool, Boolean bool2, String str, String str2) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, C1633a.f4626a.getDescriptor());
            throw null;
        }
        this.f4627a = bool;
        this.f4628b = bool2;
        this.f4629c = str;
        this.f4630d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1635c)) {
            return false;
        }
        C1635c c1635c = (C1635c) obj;
        return AbstractC16544l.m18089b(this.f4627a, c1635c.f4627a) && AbstractC16544l.m18089b(this.f4628b, c1635c.f4628b) && AbstractC16544l.m18089b(this.f4629c, c1635c.f4629c) && AbstractC16544l.m18089b(this.f4630d, c1635c.f4630d);
    }

    public final int hashCode() {
        Boolean bool = this.f4627a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f4628b;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.f4629c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f4630d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C1635c(Boolean bool, Boolean bool2, String str, String str2) {
        this.f4627a = bool;
        this.f4628b = bool2;
        this.f4629c = str;
        this.f4630d = str2;
    }
}
