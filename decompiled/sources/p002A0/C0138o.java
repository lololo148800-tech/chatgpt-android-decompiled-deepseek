package p002A0;

import com.google.protobuf.C12087F;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p080D0.C1826r;
import p080D0.InterfaceC1812k;
import p204I1.C3581L;
import p279L1.VOxZ.sVoFrD;
import p398Q8.C6581a;
import p544W9.AbstractC8676n;
import p823j3.C16084f;

/* JADX INFO: renamed from: A0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0138o implements InterfaceC1812k {

    /* JADX INFO: renamed from: Y */
    public int f575Y;

    /* JADX INFO: renamed from: Z */
    public long f576Z;

    /* JADX INFO: renamed from: o0 */
    public Object f577o0;

    /* JADX INFO: renamed from: p0 */
    public final Object f578p0;

    public C0138o() {
        this.f575Y = 1;
        this.f577o0 = new ArrayList();
        this.f578p0 = new StringBuilder();
    }

    /* JADX INFO: renamed from: b */
    public long m459b(char c9, Character ch2, long j10) {
        long j11 = this.f576Z;
        int iM24h = AbstractC0010F.m24h(this.f575Y);
        StringBuilder sb2 = (StringBuilder) this.f578p0;
        switch (iM24h) {
            case 0:
                if (c9 != 65279) {
                    if (c9 == '\"') {
                        this.f575Y = 5;
                    } else if (c9 == ',') {
                        m458a();
                        this.f575Y = 3;
                    } else if (c9 == '\n' || c9 == 8232 || c9 == 8233 || c9 == 133) {
                        m458a();
                        this.f575Y = 4;
                    } else if (c9 == '\r') {
                        if (ch2 != null && ch2.charValue() == '\n') {
                            this.f576Z++;
                        }
                        m458a();
                        this.f575Y = 4;
                    } else {
                        sb2.append(c9);
                        this.f575Y = 2;
                    }
                }
                this.f576Z++;
                break;
            case 1:
                if (c9 == '\"') {
                    if (ch2 == null || ch2.charValue() != '\"') {
                        throw new C6581a(j10, this.f576Z, c9, "must appear escapeChar(\") after escapeChar(\")");
                    }
                    sb2.append(ch2.charValue());
                    this.f575Y = 2;
                    this.f576Z++;
                } else if (c9 == ',') {
                    m458a();
                    this.f575Y = 3;
                } else if (c9 == '\n' || c9 == 8232 || c9 == 8233 || c9 == 133) {
                    m458a();
                    this.f575Y = 4;
                } else if (c9 == '\r') {
                    if (ch2 != null && ch2.charValue() == '\n') {
                        this.f576Z++;
                    }
                    m458a();
                    this.f575Y = 4;
                } else {
                    sb2.append(c9);
                    this.f575Y = 2;
                }
                this.f576Z++;
                break;
            case 2:
                if (c9 == '\"') {
                    this.f575Y = 5;
                } else if (c9 == ',') {
                    m458a();
                    this.f575Y = 3;
                } else if (c9 == '\n' || c9 == 8232 || c9 == 8233 || c9 == 133) {
                    m458a();
                    this.f575Y = 4;
                } else if (c9 == '\r') {
                    if (ch2 != null && ch2.charValue() == '\n') {
                        this.f576Z++;
                    }
                    m458a();
                    this.f575Y = 4;
                } else {
                    sb2.append(c9);
                    this.f575Y = 2;
                }
                this.f576Z++;
                break;
            case 3:
                throw new C6581a(j10, this.f576Z, c9, "unexpected error");
            case 4:
            case 6:
                if (c9 != '\"') {
                    sb2.append(c9);
                    this.f575Y = 7;
                } else if (ch2 != null && ch2.charValue() == '\"') {
                    sb2.append('\"');
                    this.f575Y = 7;
                    this.f576Z++;
                } else {
                    this.f575Y = 6;
                }
                this.f576Z++;
                break;
            case 5:
                if (c9 == ',') {
                    m458a();
                    this.f575Y = 3;
                } else if (c9 == '\n' || c9 == 8232 || c9 == 8233 || c9 == 133) {
                    m458a();
                    this.f575Y = 4;
                } else {
                    if (c9 != '\r') {
                        throw new C6581a(j10, this.f576Z, c9, "must appear delimiter or line terminator after quote end");
                    }
                    if (ch2 != null && ch2.charValue() == '\n') {
                        this.f576Z++;
                    }
                    m458a();
                    this.f575Y = 4;
                }
                this.f576Z++;
                break;
        }
        return this.f576Z - j11;
    }

    /* JADX INFO: renamed from: c */
    public long m460c(long j10, C1826r c1826r, boolean z6) {
        int i10 = this.f575Y;
        Integer numValueOf = Integer.valueOf(i10);
        if (i10 < 0) {
            numValueOf = null;
        }
        C0120T c0120t = (C0120T) this.f578p0;
        long jM421z = c0120t.m421z(c0120t.f499a.m21881c(), numValueOf != null ? numValueOf.intValue() : c0120t.f500b.m21850c(this.f576Z, false), c0120t.f500b.m21850c(j10, false), false, c1826r, false, z6);
        if (this.f575Y == -1 && !C3581L.m4267c(jM421z)) {
            this.f575Y = (int) (jM421z >> 32);
        }
        if (C3581L.m4271g(jM421z)) {
            jM421z = AbstractC8676n.m9365b((int) (4294967295L & jM421z), (int) (jM421z >> 32));
        }
        c0120t.f499a.m21884h(jM421z);
        c0120t.m419x(EnumC0123W.f528o0);
        return jM421z;
    }

    @Override // p080D0.InterfaceC1812k
    /* JADX INFO: renamed from: g */
    public boolean mo461g(long j10, C1826r c1826r) {
        C0120T c0120t = (C0120T) this.f578p0;
        if (!c0120t.f502d || c0120t.f499a.m21881c().f67817Y.length() == 0) {
            return false;
        }
        m460c(j10, c1826r, false);
        return true;
    }

    @Override // p080D0.InterfaceC1812k
    /* JADX INFO: renamed from: o */
    public void mo462o() {
        ((C0120T) this.f578p0).f514p.setValue(EnumC0137n.f571Y);
    }

    @Override // p080D0.InterfaceC1812k
    /* JADX INFO: renamed from: p */
    public boolean mo463p(long j10, C1826r c1826r) {
        C0120T c0120t = (C0120T) this.f578p0;
        if (!c0120t.f502d || c0120t.f499a.m21881c().f67817Y.length() == 0) {
            return false;
        }
        c0120t.f514p.setValue(EnumC0137n.f573o0);
        ((C16084f) this.f577o0).invoke();
        c0120t.f518t = -1;
        this.f575Y = -1;
        this.f576Z = j10;
        this.f575Y = (int) (m460c(j10, c1826r, true) >> 32);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void m458a() {
        ArrayList arrayList = (ArrayList) this.f577o0;
        StringBuilder sb2 = (StringBuilder) this.f578p0;
        arrayList.add(sb2.toString());
        AbstractC16544l.m18094g(sb2, sVoFrD.HYVHPkeLuLQiKmw);
        sb2.setLength(0);
    }

    public C0138o(C12087F c12087f) {
        c12087f.getClass();
        this.f578p0 = c12087f;
    }

    public C0138o(C0120T c0120t, C16084f c16084f) {
        this.f578p0 = c0120t;
        this.f577o0 = c16084f;
        this.f575Y = -1;
        this.f576Z = 9205357640488583168L;
    }
}
