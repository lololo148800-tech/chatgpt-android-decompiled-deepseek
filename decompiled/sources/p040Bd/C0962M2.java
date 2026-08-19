package p040Bd;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.M2 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C0962M2 {
    public static final C0956L2 Companion = new C0956L2();

    /* JADX INFO: renamed from: a */
    public final String f2734a;

    /* JADX INFO: renamed from: b */
    public final String f2735b;

    public C0962M2(int i10, String str, String str2) {
        if ((i10 & 1) == 0) {
            this.f2734a = null;
        } else {
            this.f2734a = str;
        }
        if ((i10 & 2) == 0) {
            this.f2735b = null;
        } else {
            this.f2735b = str2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0962M2)) {
            return false;
        }
        C0962M2 c0962m2 = (C0962M2) obj;
        String str = c0962m2.f2734a;
        String str2 = this.f2734a;
        if (str2 == null) {
            if (str == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str2, str);
        }
        return zM18089b && AbstractC16544l.m18089b(this.f2735b, c0962m2.f2735b);
    }

    public final int hashCode() {
        String str = this.f2734a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f2735b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
