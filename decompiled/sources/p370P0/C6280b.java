package p370P0;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p228J.AbstractC3794B0;
import p349O0.C5960K;
import p349O0.C5980U0;
import p349O0.C5997d;
import p349O0.C6021p;
import p571X9.AbstractC9215U;

/* JADX INFO: renamed from: P0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6280b {

    /* JADX INFO: renamed from: a */
    public final C6021p f20395a;

    /* JADX INFO: renamed from: b */
    public C6279a f20396b;

    /* JADX INFO: renamed from: c */
    public boolean f20397c;

    /* JADX INFO: renamed from: f */
    public int f20400f;

    /* JADX INFO: renamed from: g */
    public int f20401g;

    /* JADX INFO: renamed from: l */
    public int f20406l;

    /* JADX INFO: renamed from: d */
    public final C5960K f20398d = new C5960K();

    /* JADX INFO: renamed from: e */
    public final boolean f20399e = true;

    /* JADX INFO: renamed from: h */
    public final C5980U0 f20402h = new C5980U0(0);

    /* JADX INFO: renamed from: i */
    public int f20403i = -1;

    /* JADX INFO: renamed from: j */
    public int f20404j = -1;

    /* JADX INFO: renamed from: k */
    public int f20405k = -1;

    public C6280b(C6021p c6021p, C6279a c6279a) {
        this.f20395a = c6021p;
        this.f20396b = c6279a;
    }

    /* JADX INFO: renamed from: a */
    public final void m6847a() {
        m6849c();
        C5980U0 c5980u0 = this.f20402h;
        if (c5980u0.f19461a.isEmpty()) {
            this.f20401g++;
        } else {
            ArrayList arrayList = c5980u0.f19461a;
            arrayList.remove(arrayList.size() - 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6848b() {
        C6280b c6280b = this;
        int i10 = c6280b.f20401g;
        int i11 = 0;
        if (i10 > 0) {
            C6279a c6279a = c6280b.f20396b;
            c6279a.getClass();
            C6274A c6274a = C6274A.f20377c;
            C6278E c6278e = c6279a.f20394a;
            c6278e.m6846j(c6274a);
            AbstractC9215U.m9784b(c6278e, 0, i10);
            int i12 = c6278e.f20392g;
            int i13 = c6274a.f20379a;
            int iM6839c = C6278E.m6839c(c6278e, i13);
            int i14 = c6274a.f20380b;
            if (i12 != iM6839c || c6278e.f20393h != C6278E.m6839c(c6278e, i14)) {
                StringBuilder sb2 = new StringBuilder();
                int i15 = 0;
                while (i15 < i13) {
                    int i16 = i13;
                    if (((1 << i15) & c6278e.f20392g) != 0) {
                        if (i11 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(c6274a.mo6758b(i15));
                        i11++;
                    }
                    i15++;
                    i13 = i16;
                }
                String string = sb2.toString();
                StringBuilder sbM4500y = AbstractC3794B0.m4500y(string, "StringBuilder().apply(builderAction).toString()");
                int i17 = 0;
                int i18 = 0;
                while (i18 < i14) {
                    int i19 = i14;
                    if (((1 << i18) & c6278e.f20393h) != 0) {
                        if (i11 > 0) {
                            sbM4500y.append(", ");
                        }
                        sbM4500y.append(c6274a.mo6759c(i18));
                        i17++;
                    }
                    i18++;
                    i14 = i19;
                }
                String string2 = sbM4500y.toString();
                AbstractC16544l.m18093f(string2, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb3 = new StringBuilder("Error while pushing ");
                sb3.append(c6274a);
                sb3.append(". Not all arguments were provided. Missing ");
                AbstractC10763a.m11066x(sb3, i11, " int arguments (", string, ") and ");
                AbstractC3794B0.m4472G(sb3, i17, " object arguments (", string2, ").");
                throw null;
            }
            c6280b.f20401g = 0;
        } else {
            c6280b = this;
        }
        C5980U0 c5980u0 = c6280b.f20402h;
        if (c5980u0.f19461a.isEmpty()) {
            return;
        }
        C6279a c6279a2 = c6280b.f20396b;
        ArrayList arrayList = c5980u0.f19461a;
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i20 = 0; i20 < size; i20++) {
            objArr[i20] = arrayList.get(i20);
        }
        c6279a2.getClass();
        if (size != 0) {
            C6285g c6285g = C6285g.f20412c;
            C6278E c6278e2 = c6279a2.f20394a;
            c6278e2.m6846j(c6285g);
            AbstractC9215U.m9785c(c6278e2, 0, objArr);
            int i21 = c6278e2.f20392g;
            int i22 = c6285g.f20379a;
            int iM6839c2 = C6278E.m6839c(c6278e2, i22);
            int i23 = c6285g.f20380b;
            if (i21 != iM6839c2 || c6278e2.f20393h != C6278E.m6839c(c6278e2, i23)) {
                StringBuilder sb4 = new StringBuilder();
                int i24 = 0;
                for (int i25 = 0; i25 < i22; i25++) {
                    if (((1 << i25) & c6278e2.f20392g) != 0) {
                        if (i24 > 0) {
                            sb4.append(", ");
                        }
                        sb4.append(c6285g.mo6758b(i25));
                        i24++;
                    }
                }
                String string3 = sb4.toString();
                StringBuilder sbM4500y2 = AbstractC3794B0.m4500y(string3, "StringBuilder().apply(builderAction).toString()");
                int i26 = 0;
                int i27 = 0;
                while (i26 < i23) {
                    int i28 = i23;
                    if (((1 << i26) & c6278e2.f20393h) != 0) {
                        if (i24 > 0) {
                            sbM4500y2.append(", ");
                        }
                        sbM4500y2.append(c6285g.mo6759c(i26));
                        i27++;
                    }
                    i26++;
                    i23 = i28;
                }
                String string4 = sbM4500y2.toString();
                AbstractC16544l.m18093f(string4, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb5 = new StringBuilder("Error while pushing ");
                sb5.append(c6285g);
                sb5.append(". Not all arguments were provided. Missing ");
                AbstractC10763a.m11066x(sb5, i24, " int arguments (", string3, ") and ");
                AbstractC3794B0.m4472G(sb5, i27, " object arguments (", string4, ").");
                throw null;
            }
        }
        arrayList.clear();
    }

    /* JADX INFO: renamed from: c */
    public final void m6849c() {
        int i10 = this.f20406l;
        if (i10 > 0) {
            int i11 = this.f20403i;
            if (i11 >= 0) {
                m6848b();
                C6279a c6279a = this.f20396b;
                c6279a.getClass();
                C6298t c6298t = C6298t.f20429c;
                C6278E c6278e = c6279a.f20394a;
                c6278e.m6846j(c6298t);
                AbstractC9215U.m9784b(c6278e, 0, i11);
                AbstractC9215U.m9784b(c6278e, 1, i10);
                int i12 = c6278e.f20392g;
                int i13 = c6298t.f20379a;
                int iM6839c = C6278E.m6839c(c6278e, i13);
                int i14 = c6298t.f20380b;
                if (i12 != iM6839c || c6278e.f20393h != C6278E.m6839c(c6278e, i14)) {
                    StringBuilder sb2 = new StringBuilder();
                    int i15 = 0;
                    int i16 = 0;
                    while (i15 < i13) {
                        int i17 = i13;
                        if (((1 << i15) & c6278e.f20392g) != 0) {
                            if (i16 > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(c6298t.mo6758b(i15));
                            i16++;
                        }
                        i15++;
                        i13 = i17;
                    }
                    String string = sb2.toString();
                    StringBuilder sbM4500y = AbstractC3794B0.m4500y(string, "StringBuilder().apply(builderAction).toString()");
                    int i18 = 0;
                    int i19 = 0;
                    while (i19 < i14) {
                        int i20 = i14;
                        if (((1 << i19) & c6278e.f20393h) != 0) {
                            if (i16 > 0) {
                                sbM4500y.append(", ");
                            }
                            sbM4500y.append(c6298t.mo6759c(i19));
                            i18++;
                        }
                        i19++;
                        i14 = i20;
                    }
                    String string2 = sbM4500y.toString();
                    AbstractC16544l.m18093f(string2, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb3 = new StringBuilder("Error while pushing ");
                    sb3.append(c6298t);
                    sb3.append(". Not all arguments were provided. Missing ");
                    AbstractC10763a.m11066x(sb3, i16, " int arguments (", string, ") and ");
                    AbstractC3794B0.m4472G(sb3, i18, " object arguments (", string2, ").");
                    throw null;
                }
                this.f20403i = -1;
            } else {
                int i21 = this.f20405k;
                int i22 = this.f20404j;
                m6848b();
                C6279a c6279a2 = this.f20396b;
                c6279a2.getClass();
                C6295q c6295q = C6295q.f20426c;
                C6278E c6278e2 = c6279a2.f20394a;
                c6278e2.m6846j(c6295q);
                AbstractC9215U.m9784b(c6278e2, 1, i21);
                AbstractC9215U.m9784b(c6278e2, 0, i22);
                AbstractC9215U.m9784b(c6278e2, 2, i10);
                int i23 = c6278e2.f20392g;
                int i24 = c6295q.f20379a;
                int iM6839c2 = C6278E.m6839c(c6278e2, i24);
                int i25 = c6295q.f20380b;
                if (i23 != iM6839c2 || c6278e2.f20393h != C6278E.m6839c(c6278e2, i25)) {
                    int i26 = 0;
                    StringBuilder sb4 = new StringBuilder();
                    for (int i27 = 0; i27 < i24; i27++) {
                        if (((1 << i27) & c6278e2.f20392g) != 0) {
                            if (i26 > 0) {
                                sb4.append(", ");
                            }
                            sb4.append(c6295q.mo6758b(i27));
                            i26++;
                        }
                    }
                    String string3 = sb4.toString();
                    StringBuilder sbM4500y2 = AbstractC3794B0.m4500y(string3, "StringBuilder().apply(builderAction).toString()");
                    int i28 = 0;
                    int i29 = 0;
                    while (i28 < i25) {
                        int i30 = i25;
                        if (((1 << i28) & c6278e2.f20393h) != 0) {
                            if (i26 > 0) {
                                sbM4500y2.append(", ");
                            }
                            sbM4500y2.append(c6295q.mo6759c(i28));
                            i29++;
                        }
                        i28++;
                        i25 = i30;
                    }
                    String string4 = sbM4500y2.toString();
                    AbstractC16544l.m18093f(string4, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb5 = new StringBuilder("Error while pushing ");
                    sb5.append(c6295q);
                    sb5.append(". Not all arguments were provided. Missing ");
                    AbstractC10763a.m11066x(sb5, i26, " int arguments (", string3, ") and ");
                    AbstractC3794B0.m4472G(sb5, i29, " object arguments (", string4, ").");
                    throw null;
                }
                this.f20404j = -1;
                this.f20405k = -1;
            }
            this.f20406l = 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m6850d(boolean z6) {
        C6021p c6021p = this.f20395a;
        int i10 = z6 ? c6021p.f19554F.f19334i : c6021p.f19554F.f19332g;
        int i11 = i10 - this.f20400f;
        if (!(i11 >= 0)) {
            C5997d.m6470z("Tried to seek backward");
            throw null;
        }
        if (i11 > 0) {
            C6279a c6279a = this.f20396b;
            c6279a.getClass();
            C6282d c6282d = C6282d.f20409c;
            C6278E c6278e = c6279a.f20394a;
            c6278e.m6846j(c6282d);
            AbstractC9215U.m9784b(c6278e, 0, i11);
            int i12 = c6278e.f20392g;
            int i13 = c6282d.f20379a;
            int iM6839c = C6278E.m6839c(c6278e, i13);
            int i14 = c6282d.f20380b;
            if (i12 == iM6839c && c6278e.f20393h == C6278E.m6839c(c6278e, i14)) {
                this.f20400f = i10;
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                if (((1 << i16) & c6278e.f20392g) != 0) {
                    if (i15 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(c6282d.mo6758b(i16));
                    i15++;
                }
            }
            String string = sb2.toString();
            StringBuilder sbM4500y = AbstractC3794B0.m4500y(string, "StringBuilder().apply(builderAction).toString()");
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                if (((1 << i18) & c6278e.f20393h) != 0) {
                    if (i15 > 0) {
                        sbM4500y.append(", ");
                    }
                    sbM4500y.append(c6282d.mo6759c(i18));
                    i17++;
                }
            }
            String string2 = sbM4500y.toString();
            AbstractC16544l.m18093f(string2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder("Error while pushing ");
            sb3.append(c6282d);
            sb3.append(". Not all arguments were provided. Missing ");
            AbstractC10763a.m11066x(sb3, i15, " int arguments (", string, ") and ");
            AbstractC3794B0.m4472G(sb3, i17, " object arguments (", string2, ").");
            throw null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m6851e(int i10, int i11) {
        if (i11 > 0) {
            if (!(i10 >= 0)) {
                C5997d.m6470z("Invalid remove index " + i10);
                throw null;
            }
            if (this.f20403i == i10) {
                this.f20406l += i11;
                return;
            }
            m6849c();
            this.f20403i = i10;
            this.f20406l = i11;
        }
    }
}
