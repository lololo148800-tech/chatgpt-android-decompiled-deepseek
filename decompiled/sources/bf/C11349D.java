package bf;

import ao.AbstractC11153a0;
import ao.C11158d;
import ao.C11181o0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p003A1.AbstractC0168G;
import p1042uh.C20261Z;
import p1042uh.C20263a0;
import p1107xh.EnumC21219I;
import p269Kh.C4699z;
import p324Mn.C5550t;
import p324Mn.C5551u;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17681o;
import p909nm.C17689w;

/* JADX INFO: renamed from: bf.D */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C11349D implements InterfaceC11374b0 {
    public static final C11373b Companion = new C11373b();

    /* JADX INFO: renamed from: E */
    public static final KSerializer[] f34313E = {null, null, null, null, null, null, null, new C11158d(C11384l.f34399a, 0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, new C11158d(C11389q.f34413a, 0), new C11158d(C11181o0.f33827a, 0), null, EnumC11383k.Companion.serializer(), null, null, new C11158d(C11375c.f34380a, 0), null};

    /* JADX INFO: renamed from: A */
    public final String f34314A;

    /* JADX INFO: renamed from: B */
    public final C5551u f34315B;

    /* JADX INFO: renamed from: C */
    public final List f34316C;

    /* JADX INFO: renamed from: D */
    public final boolean f34317D;

    /* JADX INFO: renamed from: a */
    public final String f34318a;

    /* JADX INFO: renamed from: b */
    public final String f34319b;

    /* JADX INFO: renamed from: c */
    public final String f34320c;

    /* JADX INFO: renamed from: d */
    public final String f34321d;

    /* JADX INFO: renamed from: e */
    public final String f34322e;

    /* JADX INFO: renamed from: f */
    public final String f34323f;

    /* JADX INFO: renamed from: g */
    public final C11386n f34324g;

    /* JADX INFO: renamed from: h */
    public final List f34325h;

    /* JADX INFO: renamed from: i */
    public final C11380h f34326i;

    /* JADX INFO: renamed from: j */
    public final String f34327j;

    /* JADX INFO: renamed from: k */
    public final boolean f34328k;

    /* JADX INFO: renamed from: l */
    public final boolean f34329l;

    /* JADX INFO: renamed from: m */
    public final C5551u f34330m;

    /* JADX INFO: renamed from: n */
    public final boolean f34331n;

    /* JADX INFO: renamed from: o */
    public final boolean f34332o;

    /* JADX INFO: renamed from: p */
    public final boolean f34333p;

    /* JADX INFO: renamed from: q */
    public final boolean f34334q;

    /* JADX INFO: renamed from: r */
    public final boolean f34335r;

    /* JADX INFO: renamed from: s */
    public final String f34336s;

    /* JADX INFO: renamed from: t */
    public final boolean f34337t;

    /* JADX INFO: renamed from: u */
    public final boolean f34338u;

    /* JADX INFO: renamed from: v */
    public final String f34339v;

    /* JADX INFO: renamed from: w */
    public final List f34340w;

    /* JADX INFO: renamed from: x */
    public final List f34341x;

    /* JADX INFO: renamed from: y */
    public final C4699z f34342y;

    /* JADX INFO: renamed from: z */
    public final EnumC11383k f34343z;

    static {
        C11380h c11380h = new C11380h((String) null, 2);
        C5551u.Companion.getClass();
        new C11349D("gizmoId", "Gizmo", "Gizmo description text", "Author Name", null, null, null, null, c11380h, null, true, false, C5550t.m5942a(100000L), false, false, false, false, null, false, false, null, null, null, null, null, null, null, 536856816);
        new C11349D("snorlaxId", "Snorlax", "Snorlax description text", null, "As a snorlax, you should sleep. You should also eat.", null, null, null, new C11380h((String) null, "f00f00"), null, false, false, C5551u.f18000Z, false, false, false, false, null, false, false, null, null, null, null, "snorlax", null, AbstractC17681o.m19382k(new C11377e("fileId", "fileId", "File Name", "application/xml", null), new C11377e("fileId", "fileId", "PDF Name 2", "application/pdf", null), new C11377e("fileId", "fileId", "Doc Name", "application/msword", null)), 201312488);
    }

    public C11349D(String id2, String name, String str, String str2, String str3, String str4, C11386n c11386n, List socials, C11380h icon, String str5, boolean z6, boolean z10, C5551u c5551u, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str6, boolean z16, boolean z17, String str7, List tools, List starterPrompts, C4699z c4699z, EnumC11383k enumC11383k, String str8, C5551u c5551u2, List files) {
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(socials, "socials");
        AbstractC16544l.m18094g(icon, "icon");
        AbstractC16544l.m18094g(tools, "tools");
        AbstractC16544l.m18094g(starterPrompts, "starterPrompts");
        AbstractC16544l.m18094g(files, "files");
        this.f34318a = id2;
        this.f34319b = name;
        this.f34320c = str;
        this.f34321d = str2;
        this.f34322e = str3;
        this.f34323f = str4;
        this.f34324g = c11386n;
        this.f34325h = socials;
        this.f34326i = icon;
        this.f34327j = str5;
        this.f34328k = z6;
        this.f34329l = z10;
        this.f34330m = c5551u;
        this.f34331n = z11;
        this.f34332o = z12;
        this.f34333p = z13;
        this.f34334q = z14;
        this.f34335r = z15;
        this.f34336s = str6;
        this.f34337t = z16;
        this.f34338u = z17;
        this.f34339v = str7;
        this.f34340w = tools;
        this.f34341x = starterPrompts;
        this.f34342y = c4699z;
        this.f34343z = enumC11383k;
        this.f34314A = str8;
        this.f34315B = c5551u2;
        this.f34316C = files;
        this.f34317D = AbstractC16544l.m18089b(str8, "snorlax");
    }

    /* JADX INFO: renamed from: a */
    public static C11349D m12777a(C11349D c11349d, String str, String str2, String str3, String str4, C11380h c11380h, C5551u c5551u, boolean z6, C4699z c4699z, List files, int i10) {
        String id2 = (i10 & 1) != 0 ? c11349d.f34318a : str;
        String name = (i10 & 2) != 0 ? c11349d.f34319b : str2;
        String str5 = c11349d.f34320c;
        String str6 = (i10 & 8) != 0 ? c11349d.f34321d : str3;
        String str7 = (i10 & 16) != 0 ? c11349d.f34322e : str4;
        String str8 = c11349d.f34323f;
        C11386n c11386n = c11349d.f34324g;
        List socials = c11349d.f34325h;
        C11380h icon = (i10 & 256) != 0 ? c11349d.f34326i : c11380h;
        String str9 = c11349d.f34327j;
        boolean z10 = c11349d.f34328k;
        boolean z11 = c11349d.f34329l;
        C5551u c5551u2 = (i10 & 4096) != 0 ? c11349d.f34330m : c5551u;
        boolean z12 = c11349d.f34331n;
        boolean z13 = c11349d.f34332o;
        boolean z14 = c11349d.f34333p;
        boolean z15 = c11349d.f34334q;
        boolean z16 = (i10 & 131072) != 0 ? c11349d.f34335r : z6;
        String str10 = c11349d.f34336s;
        boolean z17 = c11349d.f34337t;
        boolean z18 = c11349d.f34338u;
        String str11 = c11349d.f34339v;
        List tools = c11349d.f34340w;
        List starterPrompts = c11349d.f34341x;
        C4699z c4699z2 = (i10 & 16777216) != 0 ? c11349d.f34342y : c4699z;
        EnumC11383k enumC11383k = c11349d.f34343z;
        String str12 = c11349d.f34314A;
        C5551u c5551u3 = c11349d.f34315B;
        c11349d.getClass();
        AbstractC16544l.m18094g(id2, "id");
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(socials, "socials");
        AbstractC16544l.m18094g(icon, "icon");
        AbstractC16544l.m18094g(tools, "tools");
        AbstractC16544l.m18094g(starterPrompts, "starterPrompts");
        AbstractC16544l.m18094g(files, "files");
        return new C11349D(id2, name, str5, str6, str7, str8, c11386n, socials, icon, str9, z10, z11, c5551u2, z12, z13, z14, z15, z16, str10, z17, z18, str11, tools, starterPrompts, c4699z2, enumC11383k, str12, c5551u3, files);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m12778b() {
        C11394v c11394v;
        List list = this.f34340w;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C11398z c11398z = ((C11391s) it.next()).f34417c;
            if (((c11398z == null || (c11394v = c11398z.f34427c) == null) ? null : c11394v.f34420a) == EnumC11395w.f34421Y) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m12779c() {
        List list = this.f34340w;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C11391s) it.next()).f34416b == EnumC11347B.Function) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final C20263a0 m12780d() {
        C20261Z c20261z = new C20261Z(this.f34319b, this.f34326i.f34387a);
        EnumC21219I enumC21219I = EnumC21219I.REPORTABLE;
        if (!this.f34328k) {
            enumC21219I = null;
        }
        EnumC21219I enumC21219I2 = EnumC21219I.USES_FUNCTION_CALLS;
        if (!this.f34331n) {
            enumC21219I2 = null;
        }
        EnumC21219I enumC21219I3 = EnumC21219I.PINNED;
        if (!this.f34335r) {
            enumC21219I3 = null;
        }
        EnumC21219I enumC21219I4 = EnumC21219I.WORKSPACE_DISABLED;
        if (!this.f34333p) {
            enumC21219I4 = null;
        }
        EnumC21219I enumC21219I5 = EnumC21219I.INTERACTIONS_DISABLED;
        if (!this.f34334q) {
            enumC21219I5 = null;
        }
        EnumC21219I enumC21219I6 = EnumC21219I.FIRST_PARTY;
        boolean z6 = this.f34337t;
        boolean z10 = this.f34317D;
        if (z6 && !z10) {
            enumC21219I6 = null;
        }
        ArrayList arrayListM19315v = AbstractC17678l.m19315v(new EnumC21219I[]{enumC21219I, enumC21219I2, enumC21219I3, enumC21219I4, enumC21219I5, enumC21219I6, (this.f34338u || z10) ? EnumC21219I.UNREVIEWABLE : null});
        String str = this.f34318a;
        return new C20263a0(str, str, c20261z, arrayListM19315v, this.f34314A);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    public final boolean equals(Object obj) {
        boolean zM18089b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11349D)) {
            return false;
        }
        C11349D c11349d = (C11349D) obj;
        if (!AbstractC16544l.m18089b(this.f34318a, c11349d.f34318a) || !AbstractC16544l.m18089b(this.f34319b, c11349d.f34319b) || !AbstractC16544l.m18089b(this.f34320c, c11349d.f34320c) || !AbstractC16544l.m18089b(this.f34321d, c11349d.f34321d) || !AbstractC16544l.m18089b(this.f34322e, c11349d.f34322e) || !AbstractC16544l.m18089b(this.f34323f, c11349d.f34323f) || !AbstractC16544l.m18089b(this.f34324g, c11349d.f34324g) || !AbstractC16544l.m18089b(this.f34325h, c11349d.f34325h) || !AbstractC16544l.m18089b(this.f34326i, c11349d.f34326i)) {
            return false;
        }
        String str = this.f34327j;
        String str2 = c11349d.f34327j;
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
        return zM18089b && this.f34328k == c11349d.f34328k && this.f34329l == c11349d.f34329l && AbstractC16544l.m18089b(this.f34330m, c11349d.f34330m) && this.f34331n == c11349d.f34331n && this.f34332o == c11349d.f34332o && this.f34333p == c11349d.f34333p && this.f34334q == c11349d.f34334q && this.f34335r == c11349d.f34335r && AbstractC16544l.m18089b(this.f34336s, c11349d.f34336s) && this.f34337t == c11349d.f34337t && this.f34338u == c11349d.f34338u && AbstractC16544l.m18089b(this.f34339v, c11349d.f34339v) && AbstractC16544l.m18089b(this.f34340w, c11349d.f34340w) && AbstractC16544l.m18089b(this.f34341x, c11349d.f34341x) && AbstractC16544l.m18089b(this.f34342y, c11349d.f34342y) && this.f34343z == c11349d.f34343z && AbstractC16544l.m18089b(this.f34314A, c11349d.f34314A) && AbstractC16544l.m18089b(this.f34315B, c11349d.f34315B) && AbstractC16544l.m18089b(this.f34316C, c11349d.f34316C);
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f34318a.hashCode() * 31, 31, this.f34319b);
        String str = this.f34320c;
        int iHashCode = (iM527p + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f34321d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f34322e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f34323f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C11386n c11386n = this.f34324g;
        int iHashCode5 = (this.f34326i.hashCode() + AbstractC14376f.m15858x(this.f34325h, (iHashCode4 + (c11386n == null ? 0 : c11386n.hashCode())) * 31, 31)) * 31;
        String str5 = this.f34327j;
        int iHashCode6 = (((((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + (this.f34328k ? 1231 : 1237)) * 31) + (this.f34329l ? 1231 : 1237)) * 31;
        C5551u c5551u = this.f34330m;
        int iHashCode7 = (((((((((((iHashCode6 + (c5551u == null ? 0 : c5551u.f18004Y.hashCode())) * 31) + (this.f34331n ? 1231 : 1237)) * 31) + (this.f34332o ? 1231 : 1237)) * 31) + (this.f34333p ? 1231 : 1237)) * 31) + (this.f34334q ? 1231 : 1237)) * 31) + (this.f34335r ? 1231 : 1237)) * 31;
        String str6 = this.f34336s;
        int iHashCode8 = (((((iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31) + (this.f34337t ? 1231 : 1237)) * 31) + (this.f34338u ? 1231 : 1237)) * 31;
        String str7 = this.f34339v;
        int iM15858x = AbstractC14376f.m15858x(this.f34341x, AbstractC14376f.m15858x(this.f34340w, (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31, 31), 31);
        C4699z c4699z = this.f34342y;
        int iHashCode9 = (iM15858x + (c4699z == null ? 0 : c4699z.hashCode())) * 31;
        EnumC11383k enumC11383k = this.f34343z;
        int iHashCode10 = (iHashCode9 + (enumC11383k == null ? 0 : enumC11383k.hashCode())) * 31;
        String str8 = this.f34314A;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        C5551u c5551u2 = this.f34315B;
        return this.f34316C.hashCode() + ((iHashCode11 + (c5551u2 != null ? c5551u2.f18004Y.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "█";
    }

    public C11349D(int i10, String str, String str2, String str3, String str4, String str5, String str6, C11386n c11386n, List list, C11380h c11380h, String str7, boolean z6, boolean z10, C5551u c5551u, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str8, boolean z16, boolean z17, String str9, List list2, List list3, C4699z c4699z, EnumC11383k enumC11383k, String str10, C5551u c5551u2, List list4, boolean z18) {
        if (3 != (i10 & 3)) {
            AbstractC11153a0.m12389l(i10, 3, C11371a.f34378a.getDescriptor());
            throw null;
        }
        this.f34318a = str;
        this.f34319b = str2;
        if ((i10 & 4) == 0) {
            this.f34320c = null;
        } else {
            this.f34320c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f34321d = null;
        } else {
            this.f34321d = str4;
        }
        if ((i10 & 16) == 0) {
            this.f34322e = null;
        } else {
            this.f34322e = str5;
        }
        if ((i10 & 32) == 0) {
            this.f34323f = null;
        } else {
            this.f34323f = str6;
        }
        if ((i10 & 64) == 0) {
            this.f34324g = null;
        } else {
            this.f34324g = c11386n;
        }
        int i11 = i10 & 128;
        C17689w c17689w = C17689w.f56480Y;
        if (i11 == 0) {
            this.f34325h = c17689w;
        } else {
            this.f34325h = list;
        }
        this.f34326i = (i10 & 256) == 0 ? new C11380h((String) null, 3) : c11380h;
        if ((i10 & 512) == 0) {
            this.f34327j = null;
        } else {
            this.f34327j = str7;
        }
        if ((i10 & 1024) == 0) {
            this.f34328k = false;
        } else {
            this.f34328k = z6;
        }
        if ((i10 & 2048) == 0) {
            this.f34329l = false;
        } else {
            this.f34329l = z10;
        }
        if ((i10 & 4096) == 0) {
            this.f34330m = null;
        } else {
            this.f34330m = c5551u;
        }
        if ((i10 & 8192) == 0) {
            this.f34331n = false;
        } else {
            this.f34331n = z11;
        }
        if ((i10 & 16384) == 0) {
            this.f34332o = false;
        } else {
            this.f34332o = z12;
        }
        if ((32768 & i10) == 0) {
            this.f34333p = false;
        } else {
            this.f34333p = z13;
        }
        if ((65536 & i10) == 0) {
            this.f34334q = false;
        } else {
            this.f34334q = z14;
        }
        if ((131072 & i10) == 0) {
            this.f34335r = false;
        } else {
            this.f34335r = z15;
        }
        if ((262144 & i10) == 0) {
            this.f34336s = null;
        } else {
            this.f34336s = str8;
        }
        if ((524288 & i10) == 0) {
            this.f34337t = false;
        } else {
            this.f34337t = z16;
        }
        if ((1048576 & i10) == 0) {
            this.f34338u = false;
        } else {
            this.f34338u = z17;
        }
        if ((2097152 & i10) == 0) {
            this.f34339v = null;
        } else {
            this.f34339v = str9;
        }
        if ((4194304 & i10) == 0) {
            this.f34340w = c17689w;
        } else {
            this.f34340w = list2;
        }
        if ((8388608 & i10) == 0) {
            this.f34341x = c17689w;
        } else {
            this.f34341x = list3;
        }
        if ((16777216 & i10) == 0) {
            this.f34342y = null;
        } else {
            this.f34342y = c4699z;
        }
        if ((33554432 & i10) == 0) {
            this.f34343z = null;
        } else {
            this.f34343z = enumC11383k;
        }
        if ((67108864 & i10) == 0) {
            this.f34314A = null;
        } else {
            this.f34314A = str10;
        }
        if ((134217728 & i10) == 0) {
            this.f34315B = null;
        } else {
            this.f34315B = c5551u2;
        }
        if ((268435456 & i10) == 0) {
            this.f34316C = c17689w;
        } else {
            this.f34316C = list4;
        }
        this.f34317D = (i10 & 536870912) == 0 ? AbstractC16544l.m18089b(this.f34314A, "snorlax") : z18;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C11349D(String str, String str2, String str3, String str4, String str5, String str6, C11386n c11386n, ArrayList arrayList, C11380h c11380h, String str7, boolean z6, boolean z10, C5551u c5551u, boolean z11, boolean z12, boolean z13, boolean z14, String str8, boolean z15, boolean z16, List list, List list2, C4699z c4699z, EnumC11383k enumC11383k, String str9, C5551u c5551u2, List list3, int i10) {
        String str10 = (i10 & 4) != 0 ? null : str3;
        String str11 = (i10 & 8) != 0 ? null : str4;
        String str12 = (i10 & 16) != 0 ? null : str5;
        String str13 = (i10 & 32) != 0 ? null : str6;
        C11386n c11386n2 = (i10 & 64) != 0 ? null : c11386n;
        int i11 = i10 & 128;
        C17689w c17689w = C17689w.f56480Y;
        this(str, str2, str10, str11, str12, str13, c11386n2, i11 != 0 ? c17689w : arrayList, c11380h, (i10 & 512) != 0 ? null : str7, z6, (i10 & 2048) != 0 ? false : z10, (i10 & 4096) != 0 ? null : c5551u, (i10 & 8192) != 0 ? false : z11, false, (32768 & i10) != 0 ? false : z12, (65536 & i10) != 0 ? false : z13, (131072 & i10) != 0 ? false : z14, (262144 & i10) != 0 ? null : str8, (524288 & i10) != 0 ? false : z15, (1048576 & i10) != 0 ? false : z16, null, (4194304 & i10) != 0 ? c17689w : list, (8388608 & i10) != 0 ? c17689w : list2, (16777216 & i10) != 0 ? null : c4699z, (33554432 & i10) != 0 ? null : enumC11383k, (67108864 & i10) != 0 ? null : str9, (134217728 & i10) != 0 ? null : c5551u2, (i10 & 268435456) != 0 ? c17689w : list3);
    }
}
