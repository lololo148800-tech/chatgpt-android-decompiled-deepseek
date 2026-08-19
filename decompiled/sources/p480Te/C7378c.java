package p480Te;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Te.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C7378c {
    public static final C7377b Companion = new C7377b();

    /* JADX INFO: renamed from: a */
    public final String f23376a;

    /* JADX INFO: renamed from: b */
    public final String f23377b;

    /* JADX INFO: renamed from: c */
    public final String f23378c;

    /* JADX INFO: renamed from: d */
    public final String f23379d;

    public /* synthetic */ C7378c(int i10, String str, String str2, String str3, String str4) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C7376a.f23375a.getDescriptor());
            throw null;
        }
        this.f23376a = str;
        if ((i10 & 2) == 0) {
            this.f23377b = null;
        } else {
            this.f23377b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f23378c = null;
        } else {
            this.f23378c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f23379d = null;
        } else {
            this.f23379d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7378c)) {
            return false;
        }
        C7378c c7378c = (C7378c) obj;
        return AbstractC16544l.m18089b(this.f23376a, c7378c.f23376a) && AbstractC16544l.m18089b(this.f23377b, c7378c.f23377b) && AbstractC16544l.m18089b(this.f23378c, c7378c.f23378c) && AbstractC16544l.m18089b(this.f23379d, c7378c.f23379d);
    }

    public final int hashCode() {
        int iHashCode = this.f23376a.hashCode() * 31;
        String str = this.f23377b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f23378c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f23379d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
