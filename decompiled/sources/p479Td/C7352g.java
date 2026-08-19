package p479Td;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p1155zi.C21965U0;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Td.g */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C7352g {
    public static final C7350f Companion = new C7350f();

    /* JADX INFO: renamed from: a */
    public final String f23312a;

    /* JADX INFO: renamed from: b */
    public final String f23313b;

    /* JADX INFO: renamed from: c */
    public final C21965U0 f23314c;

    public C7352g(String str, String str2, C21965U0 image) {
        AbstractC16544l.m18094g(image, "image");
        this.f23312a = str;
        this.f23313b = str2;
        this.f23314c = image;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7352g)) {
            return false;
        }
        C7352g c7352g = (C7352g) obj;
        if (!AbstractC16544l.m18089b(this.f23312a, c7352g.f23312a)) {
            return false;
        }
        String str = this.f23313b;
        String str2 = c7352g.f23313b;
        if (str == null) {
            if (str2 == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str2 == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str, str2);
        }
        return zM18089b && AbstractC16544l.m18089b(this.f23314c, c7352g.f23314c);
    }

    public final int hashCode() {
        String str = this.f23312a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f23313b;
        return this.f23314c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "█";
    }

    public C7352g(int i10, String str, String str2, C21965U0 c21965u0) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, C7348e.f23263a.getDescriptor());
            throw null;
        }
        this.f23312a = str;
        this.f23313b = str2;
        this.f23314c = c21965u0;
    }
}
