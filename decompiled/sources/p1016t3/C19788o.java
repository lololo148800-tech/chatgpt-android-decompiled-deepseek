package p1016t3;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.text.TextUtils;
import bb.AbstractC11278C;
import com.google.protobuf.AbstractC12107L1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p817j$.util.Objects;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: t3.o */
/* JADX INFO: loaded from: classes.dex */
public final class C19788o {

    /* JADX INFO: renamed from: A */
    public final int f62729A;

    /* JADX INFO: renamed from: B */
    public final int f62730B;

    /* JADX INFO: renamed from: C */
    public final int f62731C;

    /* JADX INFO: renamed from: D */
    public final int f62732D;

    /* JADX INFO: renamed from: E */
    public final int f62733E;

    /* JADX INFO: renamed from: F */
    public final int f62734F;

    /* JADX INFO: renamed from: G */
    public final int f62735G;

    /* JADX INFO: renamed from: H */
    public final int f62736H;

    /* JADX INFO: renamed from: I */
    public final int f62737I;

    /* JADX INFO: renamed from: J */
    public final int f62738J;

    /* JADX INFO: renamed from: K */
    public int f62739K;

    /* JADX INFO: renamed from: a */
    public final String f62740a;

    /* JADX INFO: renamed from: b */
    public final String f62741b;

    /* JADX INFO: renamed from: c */
    public final AbstractC11278C f62742c;

    /* JADX INFO: renamed from: d */
    public final String f62743d;

    /* JADX INFO: renamed from: e */
    public final int f62744e;

    /* JADX INFO: renamed from: f */
    public final int f62745f;

    /* JADX INFO: renamed from: g */
    public final int f62746g;

    /* JADX INFO: renamed from: h */
    public final int f62747h;

    /* JADX INFO: renamed from: i */
    public final int f62748i;

    /* JADX INFO: renamed from: j */
    public final String f62749j;

    /* JADX INFO: renamed from: k */
    public final C19753C f62750k;

    /* JADX INFO: renamed from: l */
    public final String f62751l;

    /* JADX INFO: renamed from: m */
    public final String f62752m;

    /* JADX INFO: renamed from: n */
    public final int f62753n;

    /* JADX INFO: renamed from: o */
    public final int f62754o;

    /* JADX INFO: renamed from: p */
    public final List f62755p;

    /* JADX INFO: renamed from: q */
    public final C19785l f62756q;

    /* JADX INFO: renamed from: r */
    public final long f62757r;

    /* JADX INFO: renamed from: s */
    public final int f62758s;

    /* JADX INFO: renamed from: t */
    public final int f62759t;

    /* JADX INFO: renamed from: u */
    public final float f62760u;

    /* JADX INFO: renamed from: v */
    public final int f62761v;

    /* JADX INFO: renamed from: w */
    public final float f62762w;

    /* JADX INFO: renamed from: x */
    public final byte[] f62763x;

    /* JADX INFO: renamed from: y */
    public final int f62764y;

    /* JADX INFO: renamed from: z */
    public final C19781h f62765z;

    static {
        new C19787n().m20746a();
        AbstractC20817s.m21425z(0);
        AbstractC20817s.m21425z(1);
        AbstractC20817s.m21425z(2);
        AbstractC20817s.m21425z(3);
        AbstractC20817s.m21425z(4);
        AbstractC17792x.m19540w(5, 6, 7, 8, 9);
        AbstractC17792x.m19540w(10, 11, 12, 13, 14);
        AbstractC17792x.m19540w(15, 16, 17, 18, 19);
        AbstractC17792x.m19540w(20, 21, 22, 23, 24);
        AbstractC17792x.m19540w(25, 26, 27, 28, 29);
        AbstractC20817s.m21425z(30);
        AbstractC20817s.m21425z(31);
        AbstractC20817s.m21425z(32);
    }

    public C19788o(C19787n c19787n) {
        boolean z6;
        String str;
        this.f62740a = c19787n.f62703a;
        String strM21391E = AbstractC20817s.m21391E(c19787n.f62706d);
        this.f62743d = strM21391E;
        if (c19787n.f62705c.isEmpty() && c19787n.f62704b != null) {
            this.f62742c = AbstractC11278C.m12695y(new C19789p(strM21391E, c19787n.f62704b));
            this.f62741b = c19787n.f62704b;
        } else if (c19787n.f62705c.isEmpty() || c19787n.f62704b != null) {
            if (!c19787n.f62705c.isEmpty() || c19787n.f62704b != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= c19787n.f62705c.size()) {
                        z6 = false;
                        break;
                    } else {
                        if (((C19789p) c19787n.f62705c.get(i10)).f62767b.equals(c19787n.f62704b)) {
                            z6 = true;
                            break;
                        }
                        i10++;
                    }
                }
            } else {
                z6 = true;
                break;
            }
            AbstractC20800b.m21320h(z6);
            this.f62742c = c19787n.f62705c;
            this.f62741b = c19787n.f62704b;
        } else {
            AbstractC11278C abstractC11278C = c19787n.f62705c;
            this.f62742c = abstractC11278C;
            Iterator it = abstractC11278C.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((C19789p) abstractC11278C.get(0)).f62767b;
                    break;
                }
                C19789p c19789p = (C19789p) it.next();
                if (TextUtils.equals(c19789p.f62766a, strM21391E)) {
                    str = c19789p.f62767b;
                    break;
                }
            }
            this.f62741b = str;
        }
        this.f62744e = c19787n.f62707e;
        this.f62745f = c19787n.f62708f;
        int i11 = c19787n.f62709g;
        this.f62746g = i11;
        int i12 = c19787n.f62710h;
        this.f62747h = i12;
        this.f62748i = i12 != -1 ? i12 : i11;
        this.f62749j = c19787n.f62711i;
        this.f62750k = c19787n.f62712j;
        this.f62751l = c19787n.f62713k;
        this.f62752m = c19787n.f62714l;
        this.f62753n = c19787n.f62715m;
        this.f62754o = c19787n.f62716n;
        List list = c19787n.f62717o;
        this.f62755p = list == null ? Collections.emptyList() : list;
        C19785l c19785l = c19787n.f62718p;
        this.f62756q = c19785l;
        this.f62757r = c19787n.f62719q;
        this.f62758s = c19787n.f62720r;
        this.f62759t = c19787n.f62721s;
        this.f62760u = c19787n.f62722t;
        int i13 = c19787n.f62723u;
        this.f62761v = i13 == -1 ? 0 : i13;
        float f10 = c19787n.f62724v;
        this.f62762w = f10 == -1.0f ? 1.0f : f10;
        this.f62763x = c19787n.f62725w;
        this.f62764y = c19787n.f62726x;
        this.f62765z = c19787n.f62727y;
        this.f62729A = c19787n.f62728z;
        this.f62730B = c19787n.f62694A;
        this.f62731C = c19787n.f62695B;
        int i14 = c19787n.f62696C;
        this.f62732D = i14 == -1 ? 0 : i14;
        int i15 = c19787n.f62697D;
        this.f62733E = i15 != -1 ? i15 : 0;
        this.f62734F = c19787n.f62698E;
        this.f62735G = c19787n.f62699F;
        this.f62736H = c19787n.f62700G;
        this.f62737I = c19787n.f62701H;
        int i16 = c19787n.f62702I;
        if (i16 != 0 || c19785l == null) {
            this.f62738J = i16;
        } else {
            this.f62738J = 1;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C19787n m20747a() {
        C19787n c19787n = new C19787n();
        c19787n.f62703a = this.f62740a;
        c19787n.f62704b = this.f62741b;
        c19787n.f62705c = this.f62742c;
        c19787n.f62706d = this.f62743d;
        c19787n.f62707e = this.f62744e;
        c19787n.f62708f = this.f62745f;
        c19787n.f62709g = this.f62746g;
        c19787n.f62710h = this.f62747h;
        c19787n.f62711i = this.f62749j;
        c19787n.f62712j = this.f62750k;
        c19787n.f62713k = this.f62751l;
        c19787n.f62714l = this.f62752m;
        c19787n.f62715m = this.f62753n;
        c19787n.f62716n = this.f62754o;
        c19787n.f62717o = this.f62755p;
        c19787n.f62718p = this.f62756q;
        c19787n.f62719q = this.f62757r;
        c19787n.f62720r = this.f62758s;
        c19787n.f62721s = this.f62759t;
        c19787n.f62722t = this.f62760u;
        c19787n.f62723u = this.f62761v;
        c19787n.f62724v = this.f62762w;
        c19787n.f62725w = this.f62763x;
        c19787n.f62726x = this.f62764y;
        c19787n.f62727y = this.f62765z;
        c19787n.f62728z = this.f62729A;
        c19787n.f62694A = this.f62730B;
        c19787n.f62695B = this.f62731C;
        c19787n.f62696C = this.f62732D;
        c19787n.f62697D = this.f62733E;
        c19787n.f62698E = this.f62734F;
        c19787n.f62699F = this.f62735G;
        c19787n.f62700G = this.f62736H;
        c19787n.f62701H = this.f62737I;
        c19787n.f62702I = this.f62738J;
        return c19787n;
    }

    /* JADX INFO: renamed from: b */
    public final int m20748b() {
        int i10;
        int i11 = this.f62758s;
        if (i11 == -1 || (i10 = this.f62759t) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m20749c(C19788o c19788o) {
        List list = this.f62755p;
        if (list.size() != c19788o.f62755p.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) c19788o.f62755p.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || C19788o.class != obj.getClass()) {
            return false;
        }
        C19788o c19788o = (C19788o) obj;
        int i11 = this.f62739K;
        if (i11 == 0 || (i10 = c19788o.f62739K) == 0 || i11 == i10) {
            return this.f62744e == c19788o.f62744e && this.f62745f == c19788o.f62745f && this.f62746g == c19788o.f62746g && this.f62747h == c19788o.f62747h && this.f62753n == c19788o.f62753n && this.f62757r == c19788o.f62757r && this.f62758s == c19788o.f62758s && this.f62759t == c19788o.f62759t && this.f62761v == c19788o.f62761v && this.f62764y == c19788o.f62764y && this.f62729A == c19788o.f62729A && this.f62730B == c19788o.f62730B && this.f62731C == c19788o.f62731C && this.f62732D == c19788o.f62732D && this.f62733E == c19788o.f62733E && this.f62734F == c19788o.f62734F && this.f62736H == c19788o.f62736H && this.f62737I == c19788o.f62737I && this.f62738J == c19788o.f62738J && Float.compare(this.f62760u, c19788o.f62760u) == 0 && Float.compare(this.f62762w, c19788o.f62762w) == 0 && Objects.equals(this.f62740a, c19788o.f62740a) && Objects.equals(this.f62741b, c19788o.f62741b) && this.f62742c.equals(c19788o.f62742c) && Objects.equals(this.f62749j, c19788o.f62749j) && Objects.equals(this.f62751l, c19788o.f62751l) && Objects.equals(this.f62752m, c19788o.f62752m) && Objects.equals(this.f62743d, c19788o.f62743d) && Arrays.equals(this.f62763x, c19788o.f62763x) && Objects.equals(this.f62750k, c19788o.f62750k) && Objects.equals(this.f62765z, c19788o.f62765z) && Objects.equals(this.f62756q, c19788o.f62756q) && m20749c(c19788o);
        }
        return false;
    }

    public final int hashCode() {
        if (this.f62739K == 0) {
            String str = this.f62740a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f62741b;
            int iHashCode2 = (this.f62742c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.f62743d;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f62744e) * 31) + this.f62745f) * 31) + this.f62746g) * 31) + this.f62747h) * 31;
            String str4 = this.f62749j;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            C19753C c19753c = this.f62750k;
            int iHashCode5 = (iHashCode4 + (c19753c == null ? 0 : c19753c.hashCode())) * 961;
            String str5 = this.f62751l;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f62752m;
            this.f62739K = ((((((((((((((((((AbstractC12107L1.m13819j(this.f62762w, (AbstractC12107L1.m13819j(this.f62760u, (((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f62753n) * 31) + ((int) this.f62757r)) * 31) + this.f62758s) * 31) + this.f62759t) * 31, 31) + this.f62761v) * 31, 31) + this.f62764y) * 31) + this.f62729A) * 31) + this.f62730B) * 31) + this.f62731C) * 31) + this.f62732D) * 31) + this.f62733E) * 31) + this.f62734F) * 31) + this.f62736H) * 31) + this.f62737I) * 31) + this.f62738J;
        }
        return this.f62739K;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Format(");
        sb2.append(this.f62740a);
        sb2.append(", ");
        sb2.append(this.f62741b);
        sb2.append(", ");
        sb2.append(this.f62751l);
        sb2.append(", ");
        sb2.append(this.f62752m);
        sb2.append(", ");
        sb2.append(this.f62749j);
        sb2.append(", ");
        sb2.append(this.f62748i);
        sb2.append(", ");
        sb2.append(this.f62743d);
        sb2.append(", [");
        sb2.append(this.f62758s);
        sb2.append(", ");
        sb2.append(this.f62759t);
        sb2.append(", ");
        sb2.append(this.f62760u);
        sb2.append(", ");
        sb2.append(this.f62765z);
        sb2.append("], [");
        sb2.append(this.f62729A);
        sb2.append(", ");
        return AbstractC10763a.m11056n(sb2, this.f62730B, "])");
    }
}
