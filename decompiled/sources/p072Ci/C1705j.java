package p072Ci;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p559Wn.InterfaceC8975g;

/* JADX INFO: renamed from: Ci.j */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C1705j {
    public static final C1704i Companion = new C1704i();

    /* JADX INFO: renamed from: v */
    public static final KSerializer[] f4867v = {null, null, AbstractC11153a0.m12383f("com.openai.user.model.NightMode", EnumC1696a.values()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a */
    public final boolean f4868a;

    /* JADX INFO: renamed from: b */
    public final String f4869b;

    /* JADX INFO: renamed from: c */
    public final EnumC1696a f4870c;

    /* JADX INFO: renamed from: d */
    public final boolean f4871d;

    /* JADX INFO: renamed from: e */
    public final boolean f4872e;

    /* JADX INFO: renamed from: f */
    public final boolean f4873f;

    /* JADX INFO: renamed from: g */
    public final boolean f4874g;

    /* JADX INFO: renamed from: h */
    public final boolean f4875h;

    /* JADX INFO: renamed from: i */
    public final boolean f4876i;

    /* JADX INFO: renamed from: j */
    public final boolean f4877j;

    /* JADX INFO: renamed from: k */
    public final boolean f4878k;

    /* JADX INFO: renamed from: l */
    public final boolean f4879l;

    /* JADX INFO: renamed from: m */
    public final boolean f4880m;

    /* JADX INFO: renamed from: n */
    public final boolean f4881n;

    /* JADX INFO: renamed from: o */
    public final boolean f4882o;

    /* JADX INFO: renamed from: p */
    public final boolean f4883p;

    /* JADX INFO: renamed from: q */
    public final String f4884q;

    /* JADX INFO: renamed from: r */
    public final boolean f4885r;

    /* JADX INFO: renamed from: s */
    public final boolean f4886s;

    /* JADX INFO: renamed from: t */
    public final boolean f4887t;

    /* JADX INFO: renamed from: u */
    public final boolean f4888u;

    public /* synthetic */ C1705j(int i10, boolean z6, String str, EnumC1696a enumC1696a, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, String str2, boolean z23, boolean z24, boolean z25, boolean z26) {
        if ((i10 & 1) == 0) {
            this.f4868a = false;
        } else {
            this.f4868a = z6;
        }
        if ((i10 & 2) == 0) {
            this.f4869b = null;
        } else {
            this.f4869b = str;
        }
        this.f4870c = (i10 & 4) == 0 ? EnumC1696a.System : enumC1696a;
        if ((i10 & 8) == 0) {
            this.f4871d = false;
        } else {
            this.f4871d = z10;
        }
        if ((i10 & 16) == 0) {
            this.f4872e = false;
        } else {
            this.f4872e = z11;
        }
        if ((i10 & 32) == 0) {
            this.f4873f = false;
        } else {
            this.f4873f = z12;
        }
        if ((i10 & 64) == 0) {
            this.f4874g = false;
        } else {
            this.f4874g = z13;
        }
        if ((i10 & 128) == 0) {
            this.f4875h = false;
        } else {
            this.f4875h = z14;
        }
        if ((i10 & 256) == 0) {
            this.f4876i = false;
        } else {
            this.f4876i = z15;
        }
        if ((i10 & 512) == 0) {
            this.f4877j = false;
        } else {
            this.f4877j = z16;
        }
        if ((i10 & 1024) == 0) {
            this.f4878k = false;
        } else {
            this.f4878k = z17;
        }
        if ((i10 & 2048) == 0) {
            this.f4879l = false;
        } else {
            this.f4879l = z18;
        }
        if ((i10 & 4096) == 0) {
            this.f4880m = false;
        } else {
            this.f4880m = z19;
        }
        if ((i10 & 8192) == 0) {
            this.f4881n = false;
        } else {
            this.f4881n = z20;
        }
        if ((i10 & 16384) == 0) {
            this.f4882o = false;
        } else {
            this.f4882o = z21;
        }
        if ((32768 & i10) == 0) {
            this.f4883p = false;
        } else {
            this.f4883p = z22;
        }
        if ((65536 & i10) == 0) {
            this.f4884q = null;
        } else {
            this.f4884q = str2;
        }
        this.f4885r = (131072 & i10) == 0 ? true : z23;
        if ((262144 & i10) == 0) {
            this.f4886s = false;
        } else {
            this.f4886s = z24;
        }
        if ((524288 & i10) == 0) {
            this.f4887t = false;
        } else {
            this.f4887t = z25;
        }
        if ((i10 & 1048576) == 0) {
            this.f4888u = false;
        } else {
            this.f4888u = z26;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1705j m2512a(C1705j c1705j, boolean z6, EnumC1696a enumC1696a, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, String str, boolean z22, boolean z23, boolean z24, boolean z25, int i10) {
        boolean z26 = (i10 & 1) != 0 ? c1705j.f4868a : z6;
        String str2 = c1705j.f4869b;
        EnumC1696a nightMode = (i10 & 4) != 0 ? c1705j.f4870c : enumC1696a;
        boolean z27 = c1705j.f4871d;
        boolean z28 = (i10 & 16) != 0 ? c1705j.f4872e : z10;
        boolean z29 = (i10 & 32) != 0 ? c1705j.f4873f : z11;
        boolean z30 = (i10 & 64) != 0 ? c1705j.f4874g : z12;
        boolean z31 = (i10 & 128) != 0 ? c1705j.f4875h : z13;
        boolean z32 = (i10 & 256) != 0 ? c1705j.f4876i : z14;
        boolean z33 = (i10 & 512) != 0 ? c1705j.f4877j : z15;
        boolean z34 = (i10 & 1024) != 0 ? c1705j.f4878k : z16;
        boolean z35 = (i10 & 2048) != 0 ? c1705j.f4879l : z17;
        boolean z36 = (i10 & 4096) != 0 ? c1705j.f4880m : z18;
        boolean z37 = (i10 & 8192) != 0 ? c1705j.f4881n : z19;
        boolean z38 = (i10 & 16384) != 0 ? c1705j.f4882o : z20;
        boolean z39 = (32768 & i10) != 0 ? c1705j.f4883p : z21;
        String str3 = (65536 & i10) != 0 ? c1705j.f4884q : str;
        boolean z40 = (131072 & i10) != 0 ? c1705j.f4885r : z22;
        boolean z41 = (262144 & i10) != 0 ? c1705j.f4886s : z23;
        boolean z42 = (524288 & i10) != 0 ? c1705j.f4887t : z24;
        boolean z43 = (i10 & 1048576) != 0 ? c1705j.f4888u : z25;
        c1705j.getClass();
        AbstractC16544l.m18094g(nightMode, "nightMode");
        return new C1705j(z26, str2, nightMode, z27, z28, z29, z30, z31, z32, z33, z34, z35, z36, z37, z38, z39, str3, z40, z41, z42, z43);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1705j)) {
            return false;
        }
        C1705j c1705j = (C1705j) obj;
        return this.f4868a == c1705j.f4868a && AbstractC16544l.m18089b(this.f4869b, c1705j.f4869b) && this.f4870c == c1705j.f4870c && this.f4871d == c1705j.f4871d && this.f4872e == c1705j.f4872e && this.f4873f == c1705j.f4873f && this.f4874g == c1705j.f4874g && this.f4875h == c1705j.f4875h && this.f4876i == c1705j.f4876i && this.f4877j == c1705j.f4877j && this.f4878k == c1705j.f4878k && this.f4879l == c1705j.f4879l && this.f4880m == c1705j.f4880m && this.f4881n == c1705j.f4881n && this.f4882o == c1705j.f4882o && this.f4883p == c1705j.f4883p && AbstractC16544l.m18089b(this.f4884q, c1705j.f4884q) && this.f4885r == c1705j.f4885r && this.f4886s == c1705j.f4886s && this.f4887t == c1705j.f4887t && this.f4888u == c1705j.f4888u;
    }

    public final int hashCode() {
        int i10 = (this.f4868a ? 1231 : 1237) * 31;
        String str = this.f4869b;
        int iHashCode = (((((((((((((((((((((((((((this.f4870c.hashCode() + ((i10 + (str == null ? 0 : str.hashCode())) * 31)) * 31) + (this.f4871d ? 1231 : 1237)) * 31) + (this.f4872e ? 1231 : 1237)) * 31) + (this.f4873f ? 1231 : 1237)) * 31) + (this.f4874g ? 1231 : 1237)) * 31) + (this.f4875h ? 1231 : 1237)) * 31) + (this.f4876i ? 1231 : 1237)) * 31) + (this.f4877j ? 1231 : 1237)) * 31) + (this.f4878k ? 1231 : 1237)) * 31) + (this.f4879l ? 1231 : 1237)) * 31) + (this.f4880m ? 1231 : 1237)) * 31) + (this.f4881n ? 1231 : 1237)) * 31) + (this.f4882o ? 1231 : 1237)) * 31) + (this.f4883p ? 1231 : 1237)) * 31;
        String str2 = this.f4884q;
        return ((((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f4885r ? 1231 : 1237)) * 31) + (this.f4886s ? 1231 : 1237)) * 31) + (this.f4887t ? 1231 : 1237)) * 31) + (this.f4888u ? 1231 : 1237);
    }

    public final String toString() {
        return "█";
    }

    public C1705j(boolean z6, String str, EnumC1696a nightMode, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, String str2, boolean z23, boolean z24, boolean z25, boolean z26) {
        AbstractC16544l.m18094g(nightMode, "nightMode");
        this.f4868a = z6;
        this.f4869b = str;
        this.f4870c = nightMode;
        this.f4871d = z10;
        this.f4872e = z11;
        this.f4873f = z12;
        this.f4874g = z13;
        this.f4875h = z14;
        this.f4876i = z15;
        this.f4877j = z16;
        this.f4878k = z17;
        this.f4879l = z18;
        this.f4880m = z19;
        this.f4881n = z20;
        this.f4882o = z21;
        this.f4883p = z22;
        this.f4884q = str2;
        this.f4885r = z23;
        this.f4886s = z24;
        this.f4887t = z25;
        this.f4888u = z26;
    }
}
