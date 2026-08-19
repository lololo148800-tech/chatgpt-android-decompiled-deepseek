package p041Be;

import ao.AbstractC11153a0;
import ao.C11131E;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p1126yd.C21490p;
import p1155zi.C21977Y0;
import p324Mn.C5551u;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Be.m */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1241m {
    public static final C1240l Companion = new C1240l();

    /* JADX INFO: renamed from: k */
    public static final KSerializer[] f3265k = {null, null, null, null, null, null, new C11131E(C21977Y0.f69577a, C21490p.f68101a, 1), null, null, null};

    /* JADX INFO: renamed from: a */
    public final String f3266a;

    /* JADX INFO: renamed from: b */
    public final String f3267b;

    /* JADX INFO: renamed from: c */
    public final String f3268c;

    /* JADX INFO: renamed from: d */
    public final String f3269d;

    /* JADX INFO: renamed from: e */
    public final C5551u f3270e;

    /* JADX INFO: renamed from: f */
    public final C5551u f3271f;

    /* JADX INFO: renamed from: g */
    public final Map f3272g;

    /* JADX INFO: renamed from: h */
    public final Integer f3273h;

    /* JADX INFO: renamed from: i */
    public final String f3274i;

    /* JADX INFO: renamed from: j */
    public final String f3275j;

    public C1241m(int i10, String str, String str2, String str3, String str4, C5551u c5551u, C5551u c5551u2, Map map, Integer num, String str5, String str6) {
        if (119 != (i10 & 119)) {
            AbstractC11153a0.m12389l(i10, 119, C1239k.f3264a.getDescriptor());
            throw null;
        }
        this.f3266a = str;
        this.f3267b = str2;
        this.f3268c = str3;
        if ((i10 & 8) == 0) {
            this.f3269d = null;
        } else {
            this.f3269d = str4;
        }
        this.f3270e = c5551u;
        this.f3271f = c5551u2;
        this.f3272g = map;
        if ((i10 & 128) == 0) {
            this.f3273h = null;
        } else {
            this.f3273h = num;
        }
        if ((i10 & 256) == 0) {
            this.f3274i = null;
        } else {
            this.f3274i = str5;
        }
        if ((i10 & 512) == 0) {
            this.f3275j = null;
        } else {
            this.f3275j = str6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0042  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        boolean zM18089b2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1241m)) {
            return false;
        }
        C1241m c1241m = (C1241m) obj;
        if (!AbstractC16544l.m18089b(this.f3266a, c1241m.f3266a) || !AbstractC16544l.m18089b(this.f3267b, c1241m.f3267b)) {
            return false;
        }
        String str = this.f3268c;
        String str2 = c1241m.f3268c;
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
        if (!zM18089b) {
            return false;
        }
        String str3 = this.f3269d;
        String str4 = c1241m.f3269d;
        if (str3 == null) {
            if (str4 == null) {
                zM18089b2 = true;
            } else {
                zM18089b2 = false;
            }
        } else if (str4 == null) {
            zM18089b2 = false;
        } else {
            zM18089b2 = AbstractC16544l.m18089b(str3, str4);
        }
        return zM18089b2 && AbstractC16544l.m18089b(this.f3270e, c1241m.f3270e) && AbstractC16544l.m18089b(this.f3271f, c1241m.f3271f) && AbstractC16544l.m18089b(this.f3272g, c1241m.f3272g) && AbstractC16544l.m18089b(this.f3273h, c1241m.f3273h) && AbstractC16544l.m18089b(this.f3274i, c1241m.f3274i) && AbstractC16544l.m18089b(this.f3275j, c1241m.f3275j);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f3266a.hashCode() * 31, 31, this.f3267b);
        String str = this.f3268c;
        int iHashCode = (iM527p + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f3269d;
        int iHashCode2 = (this.f3271f.f18004Y.hashCode() + ((this.f3270e.f18004Y.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        Map map = this.f3272g;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.f3273h;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f3274i;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f3275j;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
