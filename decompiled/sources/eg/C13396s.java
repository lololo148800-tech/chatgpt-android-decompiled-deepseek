package eg;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p195Hh.C3430e;
import p523V9.AbstractC8168p6;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: eg.s */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C13396s extends Exception {
    public static final C13392o Companion = new C13392o();

    /* JADX INFO: renamed from: o0 */
    public static final C3430e f42446o0 = AbstractC8168p6.m8749b("OpenAIApiError", null);

    /* JADX INFO: renamed from: Y */
    public final C13395r f42447Y;

    /* JADX INFO: renamed from: Z */
    public final String f42448Z;

    public C13396s(int i10, C13395r c13395r, String str) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C13390m.f42437a.getDescriptor());
            throw null;
        }
        this.f42447Y = c13395r;
        if ((i10 & 2) == 0) {
            this.f42448Z = c13395r.f42442a;
        } else {
            this.f42448Z = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13396s) && AbstractC16544l.m18089b(this.f42447Y, ((C13396s) obj).f42447Y);
    }

    public final int hashCode() {
        return this.f42447Y.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "█";
    }
}
