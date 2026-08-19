package p1126yd;

import ao.AbstractC11153a0;
import ao.C11131E;
import ao.C11158d;
import ao.C11181o0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p067Cd.C1630d;
import p1071w0.AbstractC20734X;
import p1155zi.C21977Y0;
import p324Mn.C5551u;
import p559Wn.InterfaceC8975g;
import p597Yd.C10012a;
import p775h2.AbstractC14376f;
import p909nm.C17689w;

/* JADX INFO: renamed from: yd.o */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C21488o {
    public static final C21486n Companion = new C21486n();

    /* JADX INFO: renamed from: n */
    public static final KSerializer[] f68086n = {null, null, null, null, null, null, new C11131E(C21977Y0.f69577a, C21490p.f68101a, 1), new C11158d(C11181o0.f33827a, 0), new C11158d(C1630d.f4620a, 0), new C11158d(C10012a.f29697a, 0), null, null, null};

    /* JADX INFO: renamed from: a */
    public final String f68087a;

    /* JADX INFO: renamed from: b */
    public final String f68088b;

    /* JADX INFO: renamed from: c */
    public final C5551u f68089c;

    /* JADX INFO: renamed from: d */
    public final C5551u f68090d;

    /* JADX INFO: renamed from: e */
    public final String f68091e;

    /* JADX INFO: renamed from: f */
    public final String f68092f;

    /* JADX INFO: renamed from: g */
    public final Map f68093g;

    /* JADX INFO: renamed from: h */
    public final List f68094h;

    /* JADX INFO: renamed from: i */
    public final List f68095i;

    /* JADX INFO: renamed from: j */
    public final List f68096j;

    /* JADX INFO: renamed from: k */
    public final String f68097k;

    /* JADX INFO: renamed from: l */
    public final Integer f68098l;

    /* JADX INFO: renamed from: m */
    public final String f68099m;

    public C21488o(int i10, String str, String str2, C5551u c5551u, C5551u c5551u2, String str3, String str4, Map map, List list, List list2, List list3, String str5, Integer num, String str6) {
        if (79 != (i10 & 79)) {
            AbstractC11153a0.m12389l(i10, 79, C21484m.f68084a.getDescriptor());
            throw null;
        }
        this.f68087a = str;
        this.f68088b = str2;
        this.f68089c = c5551u;
        this.f68090d = c5551u2;
        if ((i10 & 16) == 0) {
            this.f68091e = null;
        } else {
            this.f68091e = str3;
        }
        if ((i10 & 32) == 0) {
            this.f68092f = null;
        } else {
            this.f68092f = str4;
        }
        this.f68093g = map;
        int i11 = i10 & 128;
        C17689w c17689w = C17689w.f56480Y;
        if (i11 == 0) {
            this.f68094h = c17689w;
        } else {
            this.f68094h = list;
        }
        if ((i10 & 256) == 0) {
            this.f68095i = c17689w;
        } else {
            this.f68095i = list2;
        }
        if ((i10 & 512) == 0) {
            this.f68096j = null;
        } else {
            this.f68096j = list3;
        }
        if ((i10 & 1024) == 0) {
            this.f68097k = null;
        } else {
            this.f68097k = str5;
        }
        if ((i10 & 2048) == 0) {
            this.f68098l = null;
        } else {
            this.f68098l = num;
        }
        if ((i10 & 4096) == 0) {
            this.f68099m = null;
        } else {
            this.f68099m = str6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21488o)) {
            return false;
        }
        C21488o c21488o = (C21488o) obj;
        if (!AbstractC16544l.m18089b(this.f68087a, c21488o.f68087a) || !AbstractC16544l.m18089b(this.f68088b, c21488o.f68088b) || !AbstractC16544l.m18089b(this.f68089c, c21488o.f68089c) || !AbstractC16544l.m18089b(this.f68090d, c21488o.f68090d) || !AbstractC16544l.m18089b(this.f68091e, c21488o.f68091e) || !AbstractC16544l.m18089b(this.f68092f, c21488o.f68092f) || !AbstractC16544l.m18089b(this.f68093g, c21488o.f68093g) || !AbstractC16544l.m18089b(this.f68094h, c21488o.f68094h) || !AbstractC16544l.m18089b(this.f68095i, c21488o.f68095i) || !AbstractC16544l.m18089b(this.f68096j, c21488o.f68096j)) {
            return false;
        }
        String str = this.f68097k;
        String str2 = c21488o.f68097k;
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
        return zM18089b && AbstractC16544l.m18089b(this.f68098l, c21488o.f68098l) && AbstractC16544l.m18089b(this.f68099m, c21488o.f68099m);
    }

    public final int hashCode() {
        String str = this.f68087a;
        int iHashCode = (this.f68090d.f18004Y.hashCode() + ((this.f68089c.f18004Y.hashCode() + AbstractC0168G.m527p((str == null ? 0 : str.hashCode()) * 31, 31, this.f68088b)) * 31)) * 31;
        String str2 = this.f68091e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f68092f;
        int iM21250u = AbstractC20734X.m21250u((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f68093g);
        List list = this.f68094h;
        int iM15858x = AbstractC14376f.m15858x(this.f68095i, (iM21250u + (list == null ? 0 : list.hashCode())) * 31, 31);
        List list2 = this.f68096j;
        int iHashCode3 = (iM15858x + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.f68097k;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f68098l;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.f68099m;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        return "█";
    }
}
