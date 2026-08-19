package p1071w0;

import kotlin.jvm.internal.AbstractC16544l;
import p350O1.C6064m;
import p350O1.C6065n;
import p350O1.C6066o;
import p350O1.C6067p;
import p371P1.C6306b;

/* JADX INFO: renamed from: w0.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C20748f0 {

    /* JADX INFO: renamed from: g */
    public static final C20748f0 f65794g;

    /* JADX INFO: renamed from: a */
    public final int f65795a;

    /* JADX INFO: renamed from: b */
    public final Boolean f65796b;

    /* JADX INFO: renamed from: c */
    public final int f65797c;

    /* JADX INFO: renamed from: d */
    public final int f65798d;

    /* JADX INFO: renamed from: e */
    public final Boolean f65799e;

    /* JADX INFO: renamed from: f */
    public final C6306b f65800f;

    static {
        int i10 = 0;
        f65794g = new C20748f0(i10, i10, 127);
    }

    public C20748f0(int i10, Boolean bool, int i11, int i12, Boolean bool2, C6306b c6306b) {
        this.f65795a = i10;
        this.f65796b = bool;
        this.f65797c = i11;
        this.f65798d = i12;
        this.f65799e = bool2;
        this.f65800f = c6306b;
    }

    /* JADX INFO: renamed from: a */
    public static C20748f0 m21288a(int i10, int i11, int i12) {
        C20748f0 c20748f0 = f65794g;
        if ((i12 & 1) != 0) {
            i10 = c20748f0.f65795a;
        }
        int i13 = i10;
        if ((i12 & 4) != 0) {
            i11 = c20748f0.f65797c;
        }
        return new C20748f0(i13, c20748f0.f65796b, i11, c20748f0.f65798d, null, null);
    }

    /* JADX INFO: renamed from: b */
    public final int m21289b() {
        int i10 = this.f65798d;
        C6064m c6064m = new C6064m(i10);
        if (C6064m.m6639a(i10, -1)) {
            c6064m = null;
        }
        if (c6064m != null) {
            return c6064m.f19754a;
        }
        return 1;
    }

    /* JADX INFO: renamed from: c */
    public final C6065n m21290c(boolean z6) {
        int i10 = this.f65795a;
        C6066o c6066o = new C6066o(i10);
        if (C6066o.m6641a(i10, -1)) {
            c6066o = null;
        }
        int i11 = c6066o != null ? c6066o.f19762a : 0;
        Boolean bool = this.f65796b;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        int i12 = this.f65797c;
        C6067p c6067p = C6067p.m6643a(i12, 0) ? null : new C6067p(i12);
        int i13 = c6067p != null ? c6067p.f19763a : 1;
        int iM21289b = m21289b();
        C6306b c6306b = this.f65800f;
        if (c6306b == null) {
            c6306b = C6306b.f20437o0;
        }
        return new C6065n(z6, i11, zBooleanValue, i13, iM21289b, c6306b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20748f0)) {
            return false;
        }
        C20748f0 c20748f0 = (C20748f0) obj;
        return C6066o.m6641a(this.f65795a, c20748f0.f65795a) && AbstractC16544l.m18089b(this.f65796b, c20748f0.f65796b) && C6067p.m6643a(this.f65797c, c20748f0.f65797c) && C6064m.m6639a(this.f65798d, c20748f0.f65798d) && AbstractC16544l.m18089b(null, null) && AbstractC16544l.m18089b(this.f65799e, c20748f0.f65799e) && AbstractC16544l.m18089b(this.f65800f, c20748f0.f65800f);
    }

    public final int hashCode() {
        int i10 = this.f65795a * 31;
        Boolean bool = this.f65796b;
        int iHashCode = (((((i10 + (bool != null ? bool.hashCode() : 0)) * 31) + this.f65797c) * 31) + this.f65798d) * 961;
        Boolean bool2 = this.f65799e;
        int iHashCode2 = (iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        C6306b c6306b = this.f65800f;
        return iHashCode2 + (c6306b != null ? c6306b.f20438Y.hashCode() : 0);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) C6066o.m6642b(this.f65795a)) + ", autoCorrectEnabled=" + this.f65796b + ", keyboardType=" + ((Object) C6067p.m6644b(this.f65797c)) + ", imeAction=" + ((Object) C6064m.m6640b(this.f65798d)) + ", platformImeOptions=nullshowKeyboardOnFocus=" + this.f65799e + ", hintLocales=" + this.f65800f + ')';
    }

    public /* synthetic */ C20748f0(int i10, int i11, int i12) {
        this((i12 & 1) != 0 ? -1 : i10, null, 0, (i12 & 8) != 0 ? -1 : i11, null, null);
    }
}
