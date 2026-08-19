package p1126yd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: yd.f0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21471f0 implements InterfaceC21409C {
    public static final C21469e0 Companion = new C21469e0();

    /* JADX INFO: renamed from: a */
    public final String f68068a;

    /* JADX INFO: renamed from: b */
    public final int f68069b;

    /* JADX INFO: renamed from: c */
    public final String f68070c;

    public C21471f0(String str, int i10, int i11, String str2) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C21466d0.f68065a.getDescriptor());
            throw null;
        }
        this.f68068a = str;
        this.f68069b = i11;
        if ((i10 & 4) == 0) {
            this.f68070c = null;
        } else {
            this.f68070c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21471f0)) {
            return false;
        }
        C21471f0 c21471f0 = (C21471f0) obj;
        return AbstractC16544l.m18089b(this.f68068a, c21471f0.f68068a) && this.f68069b == c21471f0.f68069b && AbstractC16544l.m18089b(this.f68070c, c21471f0.f68070c);
    }

    public final int hashCode() {
        int iHashCode = ((this.f68068a.hashCode() * 31) + this.f68069b) * 31;
        String str = this.f68070c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "█";
    }
}
