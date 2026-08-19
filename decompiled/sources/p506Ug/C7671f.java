package p506Ug;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Ug.f */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C7671f {
    public static final C7670e Companion = new C7670e();

    /* JADX INFO: renamed from: a */
    public final String f24191a;

    /* JADX INFO: renamed from: b */
    public final String f24192b;

    public C7671f(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C7669d.f24190a.getDescriptor());
            throw null;
        }
        this.f24191a = str;
        this.f24192b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7671f)) {
            return false;
        }
        C7671f c7671f = (C7671f) obj;
        return AbstractC16544l.m18089b(this.f24191a, c7671f.f24191a) && AbstractC16544l.m18089b(this.f24192b, c7671f.f24192b);
    }

    public final int hashCode() {
        return this.f24192b.hashCode() + (this.f24191a.hashCode() * 31);
    }

    public final String toString() {
        return "█";
    }
}
