package p041Be;

import ao.AbstractC11153a0;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Be.f */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1234f {
    public static final C1233e Companion = new C1233e();

    /* JADX INFO: renamed from: f */
    public static final KSerializer[] f3246f = {null, null, EnumC1244p.Companion.serializer(), null, null};

    /* JADX INFO: renamed from: a */
    public final int f3247a;

    /* JADX INFO: renamed from: b */
    public final int f3248b;

    /* JADX INFO: renamed from: c */
    public final EnumC1244p f3249c;

    /* JADX INFO: renamed from: d */
    public final boolean f3250d;

    /* JADX INFO: renamed from: e */
    public final boolean f3251e;

    public /* synthetic */ C1234f(int i10, int i11, int i12, EnumC1244p enumC1244p, boolean z6, boolean z10) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C1232d.f3245a.getDescriptor());
            throw null;
        }
        this.f3247a = i11;
        this.f3248b = i12;
        this.f3249c = enumC1244p;
        if ((i10 & 8) == 0) {
            this.f3250d = true;
        } else {
            this.f3250d = z6;
        }
        if ((i10 & 16) == 0) {
            this.f3251e = false;
        } else {
            this.f3251e = z10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1234f)) {
            return false;
        }
        C1234f c1234f = (C1234f) obj;
        return this.f3247a == c1234f.f3247a && this.f3248b == c1234f.f3248b && this.f3249c == c1234f.f3249c && this.f3250d == c1234f.f3250d && this.f3251e == c1234f.f3251e;
    }

    public final int hashCode() {
        return ((((this.f3249c.hashCode() + (((this.f3247a * 31) + this.f3248b) * 31)) * 31) + (this.f3250d ? 1231 : 1237)) * 31) + (this.f3251e ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public C1234f(int i10, int i11, boolean z6) {
        EnumC1244p enumC1244p = EnumC1244p.f3278Z;
        this.f3247a = i10;
        this.f3248b = i11;
        this.f3249c = enumC1244p;
        this.f3250d = true;
        this.f3251e = z6;
    }
}
