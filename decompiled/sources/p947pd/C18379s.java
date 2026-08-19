package p947pd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: pd.s */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C18379s {
    public static final C18378r Companion = new C18378r();

    /* JADX INFO: renamed from: a */
    public final String f58651a;

    /* JADX INFO: renamed from: b */
    public final String f58652b;

    /* JADX INFO: renamed from: c */
    public final boolean f58653c;

    public /* synthetic */ C18379s(int i10, String str, String str2, boolean z6) {
        if (1 != (i10 & 1)) {
            AbstractC11153a0.m12389l(i10, 1, C18377q.f58650a.getDescriptor());
            throw null;
        }
        this.f58651a = str;
        if ((i10 & 2) == 0) {
            this.f58652b = null;
        } else {
            this.f58652b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f58653c = false;
        } else {
            this.f58653c = z6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18379s)) {
            return false;
        }
        C18379s c18379s = (C18379s) obj;
        return AbstractC16544l.m18089b(this.f58651a, c18379s.f58651a) && AbstractC16544l.m18089b(this.f58652b, c18379s.f58652b) && this.f58653c == c18379s.f58653c;
    }

    public final int hashCode() {
        int iHashCode = this.f58651a.hashCode() * 31;
        String str = this.f58652b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f58653c ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }
}
