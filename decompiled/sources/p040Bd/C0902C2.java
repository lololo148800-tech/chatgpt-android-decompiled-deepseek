package p040Bd;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.C2 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0902C2 {
    public static final C0896B2 Companion = new C0896B2();

    /* JADX INFO: renamed from: a */
    public final String f2635a;

    /* JADX INFO: renamed from: b */
    public final String f2636b;

    public /* synthetic */ C0902C2(int i10, String str, String str2) {
        if ((i10 & 1) == 0) {
            this.f2635a = null;
        } else {
            this.f2635a = str;
        }
        if ((i10 & 2) == 0) {
            this.f2636b = null;
        } else {
            this.f2636b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0902C2)) {
            return false;
        }
        C0902C2 c0902c2 = (C0902C2) obj;
        return AbstractC16544l.m18089b(this.f2635a, c0902c2.f2635a) && AbstractC16544l.m18089b(this.f2636b, c0902c2.f2636b);
    }

    public final int hashCode() {
        String str = this.f2635a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f2636b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C0902C2(String str, String str2) {
        this.f2635a = str;
        this.f2636b = str2;
    }
}
