package p040Bd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.d5 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1069d5 {
    public static final C1062c5 Companion = new C1062c5();

    /* JADX INFO: renamed from: a */
    public final String f2915a;

    /* JADX INFO: renamed from: b */
    public final String f2916b;

    /* JADX INFO: renamed from: c */
    public final String f2917c;

    public /* synthetic */ C1069d5(int i10, String str, String str2, String str3) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C1055b5.f2888a.getDescriptor());
            throw null;
        }
        this.f2915a = str;
        if ((i10 & 2) == 0) {
            this.f2916b = null;
        } else {
            this.f2916b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f2917c = null;
        } else {
            this.f2917c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1069d5)) {
            return false;
        }
        C1069d5 c1069d5 = (C1069d5) obj;
        return AbstractC16544l.m18089b(this.f2915a, c1069d5.f2915a) && AbstractC16544l.m18089b(this.f2916b, c1069d5.f2916b) && AbstractC16544l.m18089b(this.f2917c, c1069d5.f2917c);
    }

    public final int hashCode() {
        int iHashCode = this.f2915a.hashCode() * 31;
        String str = this.f2916b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2917c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
