package p040Bd;

import kotlin.jvm.internal.AbstractC16544l;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Bd.x2 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1193x2 {
    public static final C1187w2 Companion = new C1187w2();

    /* JADX INFO: renamed from: a */
    public final String f3146a;

    /* JADX INFO: renamed from: b */
    public final String f3147b;

    /* JADX INFO: renamed from: c */
    public final String f3148c;

    /* JADX INFO: renamed from: d */
    public final Integer f3149d;

    public /* synthetic */ C1193x2(int i10, Integer num, String str, String str2, String str3) {
        if ((i10 & 1) == 0) {
            this.f3146a = null;
        } else {
            this.f3146a = str;
        }
        if ((i10 & 2) == 0) {
            this.f3147b = null;
        } else {
            this.f3147b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f3148c = null;
        } else {
            this.f3148c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f3149d = null;
        } else {
            this.f3149d = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1193x2)) {
            return false;
        }
        C1193x2 c1193x2 = (C1193x2) obj;
        return AbstractC16544l.m18089b(this.f3146a, c1193x2.f3146a) && AbstractC16544l.m18089b(this.f3147b, c1193x2.f3147b) && AbstractC16544l.m18089b(this.f3148c, c1193x2.f3148c) && AbstractC16544l.m18089b(this.f3149d, c1193x2.f3149d);
    }

    public final int hashCode() {
        String str = this.f3146a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f3147b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f3148c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f3149d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }

    public C1193x2(Integer num, String str) {
        this.f3146a = "client";
        this.f3147b = str;
        this.f3148c = null;
        this.f3149d = num;
    }
}
