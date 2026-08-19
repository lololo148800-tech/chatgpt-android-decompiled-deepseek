package p1139z0;

import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0624m;
import p025An.C0644w;
import p1071w0.C20720L0;
import p1116y0.C21353b;
import p1116y0.C21358g;
import p204I1.C3581L;
import p349O0.C5944C;
import p349O0.C5960K;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p523V9.AbstractC8154o0;
import p544W9.AbstractC8676n;
import p571X9.AbstractC9233X;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: z0.E0 */
/* JADX INFO: loaded from: classes.dex */
public final class C21582E0 {

    /* JADX INFO: renamed from: a */
    public final C21358g f68337a;

    /* JADX INFO: renamed from: b */
    public final C21596T f68338b;

    /* JADX INFO: renamed from: c */
    public final C5944C f68339c;

    /* JADX INFO: renamed from: d */
    public final C6002f0 f68340d;

    public C21582E0(C21358g c21358g, C21596T c21596t) {
        this.f68337a = c21358g;
        this.f68338b = c21596t;
        this.f68339c = c21596t != null ? C5997d.m6421H(new C21638r0(this, 1, c21596t)) : null;
        this.f68340d = C5997d.m6430Q(new C21595S(1), C5975S.f19448r0);
    }

    /* JADX INFO: renamed from: f */
    public static void m21877f(C21582E0 c21582e0, CharSequence charSequence, boolean z6, int i10, int i11) {
        if ((i11 & 2) != 0) {
            z6 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 1;
        }
        C21358g c21358g = c21582e0.f68337a;
        c21358g.f67827b.f68325b.m20988c();
        C21577C c21577c = c21358g.f67827b;
        if (z6) {
            c21577c.m21854b();
        }
        long jM21857e = c21577c.m21857e();
        c21577c.m21858f(C3581L.m4270f(jM21857e), C3581L.m4269e(jM21857e), charSequence);
        int length = charSequence.length() + C3581L.m4270f(jM21857e);
        c21577c.m21860h(length, length);
        C21358g.m21749a(c21358g, true, i10);
    }

    /* JADX INFO: renamed from: g */
    public static void m21878g(C21582E0 c21582e0, String str, long j10, boolean z6, int i10) {
        if ((i10 & 8) != 0) {
            z6 = true;
        }
        C21358g c21358g = c21582e0.f68337a;
        c21358g.f67827b.f68325b.m20988c();
        C21577C c21577c = c21358g.f67827b;
        long jM21882d = c21582e0.m21882d(j10);
        c21577c.m21858f(C3581L.m4270f(jM21882d), C3581L.m4269e(jM21882d), str);
        int length = str.length() + C3581L.m4270f(jM21882d);
        c21577c.m21860h(length, length);
        C21358g.m21749a(c21358g, z6, 1);
    }

    /* JADX INFO: renamed from: a */
    public final void m21879a() {
        C21358g c21358g = this.f68337a;
        c21358g.f67827b.f68325b.m20988c();
        C21577C c21577c = c21358g.f67827b;
        c21577c.m21860h(C3581L.m4269e(c21577c.m21857e()), C3581L.m4269e(c21577c.m21857e()));
        C21358g.m21749a(c21358g, true, 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final void m21880b(C21619i c21619i, AbstractC19687c abstractC19687c) {
        C21580D0 c21580d0;
        if (abstractC19687c instanceof C21580D0) {
            c21580d0 = (C21580D0) abstractC19687c;
            int i10 = c21580d0.f68336o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c21580d0.f68336o0 = i10 - Integer.MIN_VALUE;
            } else {
                c21580d0 = new C21580D0(this, abstractC19687c);
            }
        } else {
            c21580d0 = new C21580D0(this, abstractC19687c);
        }
        Object obj = c21580d0.f68334Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c21580d0.f68336o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            c21580d0.f68336o0 = 1;
            C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(c21580d0));
            c0624m.m1262r();
            this.f68337a.f67831f.m7099c(c21619i);
            c0624m.m1264u(new C20720L0(this, 2, c21619i));
            if (c0624m.m1261q() == enumC19250a) {
                return;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        throw new C0644w();
    }

    /* JADX INFO: renamed from: c */
    public final C21353b m21881c() {
        C21578C0 c21578c0;
        C5944C c5944c = this.f68339c;
        return (c5944c == null || (c21578c0 = (C21578C0) c5944c.getValue()) == null) ? this.f68337a.m21750b() : c21578c0.f68331a;
    }

    /* JADX INFO: renamed from: d */
    public final long m21882d(long j10) {
        C21578C0 c21578c0;
        C5944C c5944c = this.f68339c;
        C5960K c5960k = (c5944c == null || (c21578c0 = (C21578C0) c5944c.getValue()) == null) ? null : c21578c0.f68332b;
        if (c5960k == null) {
            return j10;
        }
        int i10 = C3581L.f10907c;
        long jM6395a = c5960k.m6395a((int) (j10 >> 32), false);
        long jM6395a2 = C3581L.m4267c(j10) ? jM6395a : c5960k.m6395a((int) (4294967295L & j10), false);
        int iMin = Math.min(C3581L.m4270f(jM6395a), C3581L.m4270f(jM6395a2));
        int iMax = Math.max(C3581L.m4269e(jM6395a), C3581L.m4269e(jM6395a2));
        return C3581L.m4271g(j10) ? AbstractC8676n.m9365b(iMax, iMin) : AbstractC8676n.m9365b(iMin, iMax);
    }

    /* JADX INFO: renamed from: e */
    public final long m21883e(long j10) {
        C21578C0 c21578c0;
        C5944C c5944c = this.f68339c;
        C5960K c5960k = (c5944c == null || (c21578c0 = (C21578C0) c5944c.getValue()) == null) ? null : c21578c0.f68332b;
        return c5960k != null ? C21596T.m21943b(j10, c5960k, (C21595S) this.f68340d.getValue()) : j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21582E0)) {
            return false;
        }
        C21582E0 c21582e0 = (C21582E0) obj;
        if (!AbstractC16544l.m18089b(this.f68337a, c21582e0.f68337a) || !AbstractC16544l.m18089b(this.f68338b, c21582e0.f68338b)) {
            return false;
        }
        c21582e0.getClass();
        return AbstractC16544l.m18089b(null, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m21884h(long j10) {
        m21885i(m21882d(j10));
    }

    public final int hashCode() {
        int iHashCode = this.f68337a.hashCode() * 31;
        C21596T c21596t = this.f68338b;
        return (iHashCode + (c21596t != null ? c21596t.hashCode() : 0)) * 31;
    }

    /* JADX INFO: renamed from: i */
    public final void m21885i(long j10) {
        C21358g c21358g = this.f68337a;
        c21358g.f67827b.f68325b.m20988c();
        C21577C c21577c = c21358g.f67827b;
        int i10 = C3581L.f10907c;
        c21577c.m21860h((int) (j10 >> 32), (int) (j10 & 4294967295L));
        C21358g.m21749a(c21358g, true, 1);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransformedTextFieldState(textFieldState=");
        C21358g c21358g = this.f68337a;
        sb2.append(c21358g);
        sb2.append(", outputTransformation=null, outputTransformedText=null, codepointTransformation=");
        sb2.append(this.f68338b);
        sb2.append(", codepointTransformedText=");
        sb2.append(this.f68339c);
        sb2.append(", outputText=\"");
        sb2.append((Object) c21358g.m21750b());
        sb2.append("\", visualText=\"");
        sb2.append((Object) m21881c());
        sb2.append("\")");
        return sb2.toString();
    }
}
