package p040Bd;

import ao.C11158d;
import ao.C11181o0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.C16642a;
import p015Ad.C0426a;
import p505Uf.C7640a;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;
import p909nm.C17689w;

/* JADX INFO: renamed from: Bd.g2 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1087g2 {
    public static final C1080f2 Companion = new C1080f2();

    /* JADX INFO: renamed from: K */
    public static final KSerializer[] f2945K = {null, null, null, null, null, null, null, null, new C11158d(C1102i3.f3003a, 0), new C11158d(C1008U1.f2803d, 0), new C11158d(C1061c4.f2897a, 0), new C11158d(C0898B4.f2625a, 0), null, null, null, null, null, new C11158d(C1081f3.f2936a, 0), null, null, null, null, null, new C11158d(AbstractC1098i.Companion.serializer(), 0), null, new C11158d(C11181o0.f33827a, 0), new C11158d(C0426a.f1401a, 0), null, null, null, null, null, new C11158d(EnumC1117k4.Companion.serializer(), 0), new C11158d(C7640a.f24152a, 0), null, null};

    /* JADX INFO: renamed from: A */
    public final List f2946A;

    /* JADX INFO: renamed from: B */
    public final boolean f2947B;

    /* JADX INFO: renamed from: C */
    public final String f2948C;

    /* JADX INFO: renamed from: D */
    public final String f2949D;

    /* JADX INFO: renamed from: E */
    public final String f2950E;

    /* JADX INFO: renamed from: F */
    public final String f2951F;

    /* JADX INFO: renamed from: G */
    public final List f2952G;

    /* JADX INFO: renamed from: H */
    public final List f2953H;

    /* JADX INFO: renamed from: I */
    public final C1206z3 f2954I;

    /* JADX INFO: renamed from: J */
    public final boolean f2955J;

    /* JADX INFO: renamed from: a */
    public final String f2956a;

    /* JADX INFO: renamed from: b */
    public final C1188w3 f2957b;

    /* JADX INFO: renamed from: c */
    public final String f2958c;

    /* JADX INFO: renamed from: d */
    public final String f2959d;

    /* JADX INFO: renamed from: e */
    public final Boolean f2960e;

    /* JADX INFO: renamed from: f */
    public final Boolean f2961f;

    /* JADX INFO: renamed from: g */
    public final Boolean f2962g;

    /* JADX INFO: renamed from: h */
    public final C1139o2 f2963h;

    /* JADX INFO: renamed from: i */
    public final List f2964i;

    /* JADX INFO: renamed from: j */
    public final List f2965j;

    /* JADX INFO: renamed from: k */
    public final List f2966k;

    /* JADX INFO: renamed from: l */
    public final List f2967l;

    /* JADX INFO: renamed from: m */
    public final String f2968m;

    /* JADX INFO: renamed from: n */
    public final C16642a f2969n;

    /* JADX INFO: renamed from: o */
    public final String f2970o;

    /* JADX INFO: renamed from: p */
    public final C0903C3 f2971p;

    /* JADX INFO: renamed from: q */
    public final String f2972q;

    /* JADX INFO: renamed from: r */
    public final List f2973r;

    /* JADX INFO: renamed from: s */
    public final C0892A4 f2974s;

    /* JADX INFO: renamed from: t */
    public final C1053b3 f2975t;

    /* JADX INFO: renamed from: u */
    public final C1033Y2 f2976u;

    /* JADX INFO: renamed from: v */
    public final C1193x2 f2977v;

    /* JADX INFO: renamed from: w */
    public final String f2978w;

    /* JADX INFO: renamed from: x */
    public final List f2979x;

    /* JADX INFO: renamed from: y */
    public final String f2980y;

    /* JADX INFO: renamed from: z */
    public final List f2981z;

    public C1087g2(int i10, int i11, String str, C1188w3 c1188w3, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, C1139o2 c1139o2, List list, List list2, List list3, List list4, String str4, C16642a c16642a, String str5, C0903C3 c0903c3, String str6, List list5, C0892A4 c0892a4, C1053b3 c1053b3, C1033Y2 c1033y2, C1193x2 c1193x2, String str7, List list6, String str8, List list7, List list8, boolean z6, String str9, String str10, String str11, String str12, List list9, List list10, C1206z3 c1206z3, boolean z10) {
        if ((i10 & 1) == 0) {
            this.f2956a = null;
        } else {
            this.f2956a = str;
        }
        if ((i10 & 2) == 0) {
            this.f2957b = null;
        } else {
            this.f2957b = c1188w3;
        }
        if ((i10 & 4) == 0) {
            this.f2958c = null;
        } else {
            this.f2958c = str2;
        }
        if ((i10 & 8) == 0) {
            this.f2959d = null;
        } else {
            this.f2959d = str3;
        }
        if ((i10 & 16) == 0) {
            this.f2960e = null;
        } else {
            this.f2960e = bool;
        }
        if ((i10 & 32) == 0) {
            this.f2961f = null;
        } else {
            this.f2961f = bool2;
        }
        if ((i10 & 64) == 0) {
            this.f2962g = null;
        } else {
            this.f2962g = bool3;
        }
        if ((i10 & 128) == 0) {
            this.f2963h = null;
        } else {
            this.f2963h = c1139o2;
        }
        int i12 = i10 & 256;
        C17689w c17689w = C17689w.f56480Y;
        if (i12 == 0) {
            this.f2964i = c17689w;
        } else {
            this.f2964i = list;
        }
        if ((i10 & 512) == 0) {
            this.f2965j = c17689w;
        } else {
            this.f2965j = list2;
        }
        if ((i10 & 1024) == 0) {
            this.f2966k = c17689w;
        } else {
            this.f2966k = list3;
        }
        if ((i10 & 2048) == 0) {
            this.f2967l = c17689w;
        } else {
            this.f2967l = list4;
        }
        if ((i10 & 4096) == 0) {
            this.f2968m = null;
        } else {
            this.f2968m = str4;
        }
        if ((i10 & 8192) == 0) {
            this.f2969n = null;
        } else {
            this.f2969n = c16642a;
        }
        if ((i10 & 16384) == 0) {
            this.f2970o = null;
        } else {
            this.f2970o = str5;
        }
        if ((32768 & i10) == 0) {
            this.f2971p = null;
        } else {
            this.f2971p = c0903c3;
        }
        if ((65536 & i10) == 0) {
            this.f2972q = null;
        } else {
            this.f2972q = str6;
        }
        if ((131072 & i10) == 0) {
            this.f2973r = null;
        } else {
            this.f2973r = list5;
        }
        if ((262144 & i10) == 0) {
            this.f2974s = null;
        } else {
            this.f2974s = c0892a4;
        }
        if ((524288 & i10) == 0) {
            this.f2975t = null;
        } else {
            this.f2975t = c1053b3;
        }
        if ((1048576 & i10) == 0) {
            this.f2976u = null;
        } else {
            this.f2976u = c1033y2;
        }
        if ((2097152 & i10) == 0) {
            this.f2977v = null;
        } else {
            this.f2977v = c1193x2;
        }
        if ((4194304 & i10) == 0) {
            this.f2978w = null;
        } else {
            this.f2978w = str7;
        }
        if ((8388608 & i10) == 0) {
            this.f2979x = null;
        } else {
            this.f2979x = list6;
        }
        if ((16777216 & i10) == 0) {
            this.f2980y = null;
        } else {
            this.f2980y = str8;
        }
        if ((33554432 & i10) == 0) {
            this.f2981z = null;
        } else {
            this.f2981z = list7;
        }
        if ((67108864 & i10) == 0) {
            this.f2946A = null;
        } else {
            this.f2946A = list8;
        }
        if ((134217728 & i10) == 0) {
            this.f2947B = false;
        } else {
            this.f2947B = z6;
        }
        if ((268435456 & i10) == 0) {
            this.f2948C = null;
        } else {
            this.f2948C = str9;
        }
        if ((536870912 & i10) == 0) {
            this.f2949D = null;
        } else {
            this.f2949D = str10;
        }
        if ((1073741824 & i10) == 0) {
            this.f2950E = null;
        } else {
            this.f2950E = str11;
        }
        if ((i10 & Integer.MIN_VALUE) == 0) {
            this.f2951F = null;
        } else {
            this.f2951F = str12;
        }
        if ((i11 & 1) == 0) {
            this.f2952G = null;
        } else {
            this.f2952G = list9;
        }
        if ((i11 & 2) == 0) {
            this.f2953H = null;
        } else {
            this.f2953H = list10;
        }
        if ((i11 & 4) == 0) {
            this.f2954I = null;
        } else {
            this.f2954I = c1206z3;
        }
        if ((i11 & 8) == 0) {
            this.f2955J = false;
        } else {
            this.f2955J = z10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:92:0x011e  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        boolean zM18089b2;
        boolean zM18089b3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1087g2)) {
            return false;
        }
        C1087g2 c1087g2 = (C1087g2) obj;
        String str = c1087g2.f2956a;
        String str2 = this.f2956a;
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
        if (!zM18089b || !AbstractC16544l.m18089b(this.f2957b, c1087g2.f2957b) || !AbstractC16544l.m18089b(this.f2958c, c1087g2.f2958c) || !AbstractC16544l.m18089b(this.f2959d, c1087g2.f2959d) || !AbstractC16544l.m18089b(this.f2960e, c1087g2.f2960e) || !AbstractC16544l.m18089b(this.f2961f, c1087g2.f2961f) || !AbstractC16544l.m18089b(this.f2962g, c1087g2.f2962g) || !AbstractC16544l.m18089b(this.f2963h, c1087g2.f2963h) || !AbstractC16544l.m18089b(this.f2964i, c1087g2.f2964i) || !AbstractC16544l.m18089b(this.f2965j, c1087g2.f2965j) || !AbstractC16544l.m18089b(this.f2966k, c1087g2.f2966k) || !AbstractC16544l.m18089b(this.f2967l, c1087g2.f2967l) || !AbstractC16544l.m18089b(this.f2968m, c1087g2.f2968m) || !AbstractC16544l.m18089b(this.f2969n, c1087g2.f2969n) || !AbstractC16544l.m18089b(this.f2970o, c1087g2.f2970o) || !AbstractC16544l.m18089b(this.f2971p, c1087g2.f2971p)) {
            return false;
        }
        String str3 = this.f2972q;
        String str4 = c1087g2.f2972q;
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
        if (!zM18089b2 || !AbstractC16544l.m18089b(this.f2973r, c1087g2.f2973r) || !AbstractC16544l.m18089b(this.f2974s, c1087g2.f2974s) || !AbstractC16544l.m18089b(this.f2975t, c1087g2.f2975t) || !AbstractC16544l.m18089b(this.f2976u, c1087g2.f2976u) || !AbstractC16544l.m18089b(this.f2977v, c1087g2.f2977v)) {
            return false;
        }
        String str5 = this.f2978w;
        String str6 = c1087g2.f2978w;
        if (str5 == null) {
            if (str6 == null) {
                zM18089b3 = true;
            } else {
                zM18089b3 = false;
            }
        } else if (str6 == null) {
            zM18089b3 = false;
        } else {
            zM18089b3 = AbstractC16544l.m18089b(str5, str6);
        }
        return zM18089b3 && AbstractC16544l.m18089b(this.f2979x, c1087g2.f2979x) && AbstractC16544l.m18089b(this.f2980y, c1087g2.f2980y) && AbstractC16544l.m18089b(this.f2981z, c1087g2.f2981z) && AbstractC16544l.m18089b(this.f2946A, c1087g2.f2946A) && this.f2947B == c1087g2.f2947B && AbstractC16544l.m18089b(this.f2948C, c1087g2.f2948C) && AbstractC16544l.m18089b(this.f2949D, c1087g2.f2949D) && AbstractC16544l.m18089b(this.f2950E, c1087g2.f2950E) && AbstractC16544l.m18089b(this.f2951F, c1087g2.f2951F) && AbstractC16544l.m18089b(this.f2952G, c1087g2.f2952G) && AbstractC16544l.m18089b(this.f2953H, c1087g2.f2953H) && AbstractC16544l.m18089b(this.f2954I, c1087g2.f2954I) && this.f2955J == c1087g2.f2955J;
    }

    public final int hashCode() {
        String str = this.f2956a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C1188w3 c1188w3 = this.f2957b;
        int iHashCode2 = (iHashCode + (c1188w3 == null ? 0 : c1188w3.f3141a.hashCode())) * 31;
        String str2 = this.f2958c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f2959d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f2960e;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f2961f;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f2962g;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        C1139o2 c1139o2 = this.f2963h;
        int iHashCode8 = (iHashCode7 + (c1139o2 == null ? 0 : c1139o2.hashCode())) * 31;
        List list = this.f2964i;
        int iM15858x = AbstractC14376f.m15858x(this.f2967l, AbstractC14376f.m15858x(this.f2966k, AbstractC14376f.m15858x(this.f2965j, (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31, 31), 31), 31);
        String str4 = this.f2968m;
        int iHashCode9 = (iM15858x + (str4 == null ? 0 : str4.hashCode())) * 31;
        C16642a c16642a = this.f2969n;
        int iHashCode10 = (iHashCode9 + (c16642a == null ? 0 : c16642a.f53330Y.hashCode())) * 31;
        String str5 = this.f2970o;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        C0903C3 c0903c3 = this.f2971p;
        int iHashCode12 = (iHashCode11 + (c0903c3 == null ? 0 : c0903c3.f2638a.hashCode())) * 31;
        String str6 = this.f2972q;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List list2 = this.f2973r;
        int iHashCode14 = (iHashCode13 + (list2 == null ? 0 : list2.hashCode())) * 31;
        C0892A4 c0892a4 = this.f2974s;
        int iHashCode15 = (iHashCode14 + (c0892a4 == null ? 0 : c0892a4.hashCode())) * 31;
        C1053b3 c1053b3 = this.f2975t;
        int iHashCode16 = (iHashCode15 + (c1053b3 == null ? 0 : c1053b3.hashCode())) * 31;
        C1033Y2 c1033y2 = this.f2976u;
        int iHashCode17 = (iHashCode16 + (c1033y2 == null ? 0 : c1033y2.hashCode())) * 31;
        C1193x2 c1193x2 = this.f2977v;
        int iHashCode18 = (iHashCode17 + (c1193x2 == null ? 0 : c1193x2.hashCode())) * 31;
        String str7 = this.f2978w;
        int iHashCode19 = (iHashCode18 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List list3 = this.f2979x;
        int iHashCode20 = (iHashCode19 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str8 = this.f2980y;
        int iHashCode21 = (iHashCode20 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List list4 = this.f2981z;
        int iHashCode22 = (iHashCode21 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.f2946A;
        int iHashCode23 = (((iHashCode22 + (list5 == null ? 0 : list5.hashCode())) * 31) + (this.f2947B ? 1231 : 1237)) * 31;
        String str9 = this.f2948C;
        int iHashCode24 = (iHashCode23 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f2949D;
        int iHashCode25 = (iHashCode24 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f2950E;
        int iHashCode26 = (iHashCode25 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f2951F;
        int iHashCode27 = (iHashCode26 + (str12 == null ? 0 : str12.hashCode())) * 31;
        List list6 = this.f2952G;
        int iHashCode28 = (iHashCode27 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List list7 = this.f2953H;
        int iHashCode29 = (iHashCode28 + (list7 == null ? 0 : list7.hashCode())) * 31;
        C1206z3 c1206z3 = this.f2954I;
        return ((iHashCode29 + (c1206z3 != null ? c1206z3.hashCode() : 0)) * 31) + (this.f2955J ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public C1087g2(Boolean bool, ArrayList arrayList, C0892A4 c0892a4, C1033Y2 c1033y2, String str, List list, boolean z6, int i10, int i11) {
        bool = (i10 & 64) != 0 ? null : bool;
        C17689w c17689w = C17689w.f56480Y;
        arrayList = (131072 & i10) != 0 ? null : arrayList;
        c0892a4 = (262144 & i10) != 0 ? null : c0892a4;
        c1033y2 = (1048576 & i10) != 0 ? null : c1033y2;
        str = (i10 & 4194304) != 0 ? null : str;
        list = (i11 & 1) != 0 ? null : list;
        z6 = (i11 & 8) != 0 ? false : z6;
        this.f2956a = null;
        this.f2957b = null;
        this.f2958c = null;
        this.f2959d = null;
        this.f2960e = null;
        this.f2961f = null;
        this.f2962g = bool;
        this.f2963h = null;
        this.f2964i = c17689w;
        this.f2965j = c17689w;
        this.f2966k = c17689w;
        this.f2967l = c17689w;
        this.f2968m = null;
        this.f2969n = null;
        this.f2970o = null;
        this.f2971p = null;
        this.f2972q = null;
        this.f2973r = arrayList;
        this.f2974s = c0892a4;
        this.f2975t = null;
        this.f2976u = c1033y2;
        this.f2977v = null;
        this.f2978w = str;
        this.f2979x = null;
        this.f2980y = null;
        this.f2981z = null;
        this.f2946A = null;
        this.f2947B = false;
        this.f2948C = null;
        this.f2949D = null;
        this.f2950E = null;
        this.f2951F = null;
        this.f2952G = list;
        this.f2953H = null;
        this.f2954I = null;
        this.f2955J = z6;
    }
}
