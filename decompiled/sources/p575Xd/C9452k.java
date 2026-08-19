package p575Xd;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Xd.k */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C9452k implements InterfaceC9461t {
    public static final C9451j Companion = new C9451j();

    /* JADX INFO: renamed from: a */
    public final String f28459a;

    /* JADX INFO: renamed from: b */
    public final String f28460b;

    /* JADX INFO: renamed from: c */
    public final String f28461c;

    public C9452k(int i10, String str, String str2, String str3) {
        if ((i10 & 1) == 0) {
            this.f28459a = null;
        } else {
            this.f28459a = str;
        }
        if ((i10 & 2) == 0) {
            this.f28460b = null;
        } else {
            this.f28460b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f28461c = null;
        } else {
            this.f28461c = str3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9452k)) {
            return false;
        }
        C9452k c9452k = (C9452k) obj;
        if (!AbstractC16544l.m18089b(this.f28459a, c9452k.f28459a)) {
            return false;
        }
        String str = this.f28460b;
        String str2 = c9452k.f28460b;
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
        return zM18089b && AbstractC16544l.m18089b(this.f28461c, c9452k.f28461c);
    }

    public final int hashCode() {
        String str = this.f28459a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f28460b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f28461c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C9452k(String str, String str2, String str3) {
        this.f28459a = str;
        this.f28460b = str2;
        this.f28461c = str3;
    }
}
