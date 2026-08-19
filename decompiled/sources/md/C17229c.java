package md;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: md.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C17229c {
    public static final C17228b Companion = new C17228b();

    /* JADX INFO: renamed from: a */
    public final String f54980a;

    /* JADX INFO: renamed from: b */
    public final String f54981b;

    /* JADX INFO: renamed from: c */
    public final String f54982c;

    /* JADX INFO: renamed from: d */
    public final int f54983d;

    /* JADX INFO: renamed from: e */
    public final int f54984e;

    public /* synthetic */ C17229c(int i10, String str, String str2, String str3, int i11, int i12) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C17227a.f54979a.getDescriptor());
            throw null;
        }
        this.f54980a = str;
        this.f54981b = str2;
        this.f54982c = str3;
        if ((i10 & 8) == 0) {
            this.f54983d = 0;
        } else {
            this.f54983d = i11;
        }
        if ((i10 & 16) == 0) {
            this.f54984e = 0;
        } else {
            this.f54984e = i12;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17229c)) {
            return false;
        }
        C17229c c17229c = (C17229c) obj;
        return AbstractC16544l.m18089b(this.f54980a, c17229c.f54980a) && AbstractC16544l.m18089b(this.f54981b, c17229c.f54981b) && AbstractC16544l.m18089b(this.f54982c, c17229c.f54982c) && this.f54983d == c17229c.f54983d && this.f54984e == c17229c.f54984e;
    }

    public final int hashCode() {
        String str = this.f54980a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f54981b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f54982c;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f54983d) * 31) + this.f54984e;
    }

    public final String toString() {
        return "█";
    }

    public C17229c(String str, int i10, String str2, int i11, String str3) {
        this.f54980a = str;
        this.f54981b = str2;
        this.f54982c = str3;
        this.f54983d = i10;
        this.f54984e = i11;
    }
}
