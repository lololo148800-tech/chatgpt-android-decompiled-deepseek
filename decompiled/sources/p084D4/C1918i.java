package p084D4;

import android.os.SystemClock;
import io.sentry.C15358g1;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17348o;
import p026Ao.C0657F;
import p026Ao.C0678l;
import p026Ao.InterfaceC0676j;
import p1014t1.C19738o;
import p1073w3.AbstractC20800b;
import p1113xn.AbstractC21322p;
import p228J.C3847l0;
import p372P3.C6330l;
import p372P3.InterfaceC6310B;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6334p;
import p372P3.InterfaceC6335q;
import p523V9.AbstractC8088f6;
import p523V9.C8240y6;
import p565X3.C9041c;
import p746fa.InterfaceC13595d;
import p759g1.C13800b;
import p860l0.EnumC16673F0;
import p942p6.InterfaceC18298b;

/* JADX INFO: renamed from: D4.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1918i implements InterfaceC13595d, InterfaceC6334p, InterfaceC6335q, InterfaceC18298b {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f5611Y;

    /* JADX INFO: renamed from: Z */
    public long f5612Z;

    /* JADX INFO: renamed from: o0 */
    public Object f5613o0;

    public /* synthetic */ C1918i(long j10, Object obj, int i10) {
        this.f5611Y = i10;
        this.f5612Z = j10;
        this.f5613o0 = obj;
    }

    @Override // p372P3.InterfaceC6335q
    /* JADX INFO: renamed from: D */
    public InterfaceC6316H mo3044D(int i10, int i11) {
        return ((InterfaceC6335q) this.f5613o0).mo3044D(i10, i11);
    }

    @Override // p372P3.InterfaceC6335q
    /* JADX INFO: renamed from: F */
    public void mo3045F(InterfaceC6310B interfaceC6310B) {
        ((InterfaceC6335q) this.f5613o0).mo3045F(new C9041c(this, interfaceC6310B, interfaceC6310B));
    }

    @Override // p372P3.InterfaceC6334p
    /* JADX INFO: renamed from: b */
    public boolean mo3046b(byte[] bArr, int i10, int i11, boolean z6) {
        return ((C6330l) this.f5613o0).mo3046b(bArr, 0, i11, z6);
    }

    @Override // p372P3.InterfaceC6334p
    /* JADX INFO: renamed from: d */
    public boolean mo3047d(byte[] bArr, int i10, int i11, boolean z6) {
        return ((C6330l) this.f5613o0).mo3047d(bArr, 0, i11, z6);
    }

    @Override // p372P3.InterfaceC6334p
    /* JADX INFO: renamed from: e */
    public long mo3048e() {
        return ((C6330l) this.f5613o0).mo3048e() - this.f5612Z;
    }

    @Override // p372P3.InterfaceC6334p
    /* JADX INFO: renamed from: f */
    public void mo3049f(int i10) throws EOFException, InterruptedIOException {
        ((C6330l) this.f5613o0).m6941g(i10, false);
    }

    @Override // p942p6.InterfaceC18298b
    /* JADX INFO: renamed from: g */
    public void mo3050g(InterfaceC0676j interfaceC0676j) {
        interfaceC0676j.mo1332b0((C0678l) this.f5613o0);
    }

    @Override // p942p6.InterfaceC18298b
    public long getContentLength() {
        return this.f5612Z;
    }

    @Override // p942p6.InterfaceC18298b
    public String getContentType() {
        return "application/json";
    }

    @Override // p372P3.InterfaceC6334p
    public long getLength() {
        return ((C6330l) this.f5613o0).f20547o0 - this.f5612Z;
    }

    @Override // p372P3.InterfaceC6334p
    public long getPosition() {
        return ((C6330l) this.f5613o0).f20548p0 - this.f5612Z;
    }

    @Override // p372P3.InterfaceC6334p
    /* JADX INFO: renamed from: i */
    public void mo3051i() {
        ((C6330l) this.f5613o0).f20550r0 = 0;
    }

    @Override // p372P3.InterfaceC6334p
    /* JADX INFO: renamed from: j */
    public void mo3052j(int i10) {
        ((C6330l) this.f5613o0).mo3052j(i10);
    }

    @Override // p372P3.InterfaceC6334p
    /* JADX INFO: renamed from: k */
    public void mo3053k(byte[] bArr, int i10, int i11) {
        ((C6330l) this.f5613o0).mo3047d(bArr, i10, i11, false);
    }

    /* JADX INFO: renamed from: l */
    public C13800b m3054l(C19738o c19738o, float f10) {
        float fAbs;
        long jM8536b;
        long jM15311l = C13800b.m15311l(this.f5612Z, C13800b.m15310k(c19738o.f62480c, c19738o.f62484g));
        this.f5612Z = jM15311l;
        EnumC16673F0 enumC16673F0 = EnumC16673F0.f53402Z;
        EnumC16673F0 enumC16673F1 = (EnumC16673F0) this.f5613o0;
        if (enumC16673F1 == null) {
            fAbs = C13800b.m15304e(jM15311l);
        } else {
            fAbs = Math.abs(enumC16673F1 == enumC16673F0 ? C13800b.m15306g(jM15311l) : C13800b.m15307h(jM15311l));
        }
        if (fAbs < f10) {
            return null;
        }
        if (enumC16673F1 == null) {
            long j10 = this.f5612Z;
            jM8536b = C13800b.m15310k(this.f5612Z, C13800b.m15312m(f10, C13800b.m15302c(C13800b.m15304e(j10), j10)));
        } else {
            long j11 = this.f5612Z;
            float fM15306g = enumC16673F1 == enumC16673F0 ? C13800b.m15306g(j11) : C13800b.m15307h(j11);
            long j12 = this.f5612Z;
            float fSignum = fM15306g - (Math.signum(enumC16673F1 == enumC16673F0 ? C13800b.m15306g(j12) : C13800b.m15307h(j12)) * f10);
            long j13 = this.f5612Z;
            float fM15307h = enumC16673F1 == enumC16673F0 ? C13800b.m15307h(j13) : C13800b.m15306g(j13);
            jM8536b = enumC16673F1 == enumC16673F0 ? AbstractC8088f6.m8536b(fSignum, fM15307h) : AbstractC8088f6.m8536b(fM15307h, fSignum);
        }
        return new C13800b(jM8536b);
    }

    /* JADX INFO: renamed from: m */
    public void m3055m(int i10) {
        if (i10 < 64) {
            this.f5612Z &= ~(1 << i10);
            return;
        }
        C1918i c1918i = (C1918i) this.f5613o0;
        if (c1918i != null) {
            c1918i.m3055m(i10 - 64);
        }
    }

    /* JADX INFO: renamed from: n */
    public int m3056n(int i10) {
        C1918i c1918i = (C1918i) this.f5613o0;
        if (c1918i == null) {
            return i10 >= 64 ? Long.bitCount(this.f5612Z) : Long.bitCount(this.f5612Z & ((1 << i10) - 1));
        }
        if (i10 < 64) {
            return Long.bitCount(this.f5612Z & ((1 << i10) - 1));
        }
        return Long.bitCount(this.f5612Z) + c1918i.m3056n(i10 - 64);
    }

    /* JADX INFO: renamed from: o */
    public void m3057o() {
        if (((C1918i) this.f5613o0) == null) {
            this.f5613o0 = new C1918i(0);
        }
    }

    @Override // p746fa.InterfaceC13595d
    public void onFailure(Exception exc) {
        switch (this.f5611Y) {
            case 2:
                ((C8240y6) this.f5613o0).f25717b.set(this.f5612Z);
                break;
            case 6:
                ((C8240y6) this.f5613o0).f25717b.set(this.f5612Z);
                break;
            default:
                ((AtomicLong) ((C15358g1) this.f5613o0).f47946Z).set(this.f5612Z);
                break;
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m3058p(int i10) {
        if (i10 < 64) {
            return (this.f5612Z & (1 << i10)) != 0;
        }
        m3057o();
        return ((C1918i) this.f5613o0).m3058p(i10 - 64);
    }

    /* JADX INFO: renamed from: q */
    public void m3059q(int i10, boolean z6) {
        if (i10 >= 64) {
            m3057o();
            ((C1918i) this.f5613o0).m3059q(i10 - 64, z6);
            return;
        }
        long j10 = this.f5612Z;
        boolean z10 = (Long.MIN_VALUE & j10) != 0;
        long j11 = (1 << i10) - 1;
        this.f5612Z = ((j10 & (~j11)) << 1) | (j10 & j11);
        if (z6) {
            m3064v(i10);
        } else {
            m3055m(i10);
        }
        if (z10 || ((C1918i) this.f5613o0) != null) {
            m3057o();
            ((C1918i) this.f5613o0).m3059q(0, z10);
        }
    }

    /* JADX INFO: renamed from: r */
    public C17348o m3060r() {
        C3847l0 c3847l0 = new C3847l0(3);
        while (true) {
            String strM1350W = ((C0657F) this.f5613o0).m1350W(this.f5612Z);
            this.f5612Z -= (long) strM1350W.length();
            if (strM1350W.length() == 0) {
                return c3847l0.m4577d();
            }
            int iM21678L = AbstractC21322p.m21678L(strM1350W, ':', 1, false, 4);
            if (iM21678L != -1) {
                String strSubstring = strM1350W.substring(0, iM21678L);
                AbstractC16544l.m18093f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = strM1350W.substring(iM21678L + 1);
                AbstractC16544l.m18093f(strSubstring2, "this as java.lang.String).substring(startIndex)");
                c3847l0.m4575b(strSubstring, strSubstring2);
            } else if (strM1350W.charAt(0) == ':') {
                String strSubstring3 = strM1350W.substring(1);
                AbstractC16544l.m18093f(strSubstring3, "this as java.lang.String).substring(startIndex)");
                c3847l0.m4575b("", strSubstring3);
            } else {
                c3847l0.m4575b("", strM1350W);
            }
        }
    }

    @Override // p1016t3.InterfaceC19782i
    public int read(byte[] bArr, int i10, int i11) {
        return ((C6330l) this.f5613o0).read(bArr, i10, i11);
    }

    @Override // p372P3.InterfaceC6334p
    public void readFully(byte[] bArr, int i10, int i11) {
        ((C6330l) this.f5613o0).mo3046b(bArr, i10, i11, false);
    }

    @Override // p372P3.InterfaceC6335q
    /* JADX INFO: renamed from: s */
    public void mo3061s() {
        ((InterfaceC6335q) this.f5613o0).mo3061s();
    }

    /* JADX INFO: renamed from: t */
    public boolean m3062t(int i10) {
        if (i10 >= 64) {
            m3057o();
            return ((C1918i) this.f5613o0).m3062t(i10 - 64);
        }
        long j10 = 1 << i10;
        long j11 = this.f5612Z;
        boolean z6 = (j11 & j10) != 0;
        long j12 = j11 & (~j10);
        this.f5612Z = j12;
        long j13 = j10 - 1;
        this.f5612Z = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
        C1918i c1918i = (C1918i) this.f5613o0;
        if (c1918i != null) {
            if (c1918i.m3058p(0)) {
                m3064v(63);
            }
            ((C1918i) this.f5613o0).m3062t(0);
        }
        return z6;
    }

    public String toString() {
        switch (this.f5611Y) {
            case 0:
                if (((C1918i) this.f5613o0) == null) {
                    return Long.toBinaryString(this.f5612Z);
                }
                return ((C1918i) this.f5613o0).toString() + "xx" + Long.toBinaryString(this.f5612Z);
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m3063u() {
        this.f5612Z = 0L;
        C1918i c1918i = (C1918i) this.f5613o0;
        if (c1918i != null) {
            c1918i.m3063u();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m3064v(int i10) {
        if (i10 < 64) {
            this.f5612Z |= 1 << i10;
        } else {
            m3057o();
            ((C1918i) this.f5613o0).m3064v(i10 - 64);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m3065w(Exception exc) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f5613o0) == null) {
            this.f5613o0 = exc;
            this.f5612Z = 100 + jElapsedRealtime;
        }
        if (jElapsedRealtime >= this.f5612Z) {
            Exception exc2 = (Exception) this.f5613o0;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f5613o0;
            this.f5613o0 = null;
            throw exc3;
        }
    }

    public /* synthetic */ C1918i(Object obj, long j10, int i10) {
        this.f5611Y = i10;
        this.f5613o0 = obj;
        this.f5612Z = j10;
    }

    public C1918i(C0657F source) {
        this.f5611Y = 10;
        AbstractC16544l.m18094g(source, "source");
        this.f5613o0 = source;
        this.f5612Z = 262144L;
    }

    public C1918i(C6330l c6330l, long j10) {
        this.f5611Y = 4;
        this.f5613o0 = c6330l;
        AbstractC20800b.m21316d(c6330l.f20548p0 >= j10);
        this.f5612Z = j10;
    }

    public C1918i(C0678l c0678l) {
        this.f5611Y = 9;
        this.f5613o0 = c0678l;
        this.f5612Z = c0678l.mo1372d();
    }

    public C1918i(int i10) {
        this.f5611Y = i10;
        switch (i10) {
            case 1:
                break;
            default:
                this.f5612Z = 0L;
                break;
        }
    }

    public C1918i(EnumC16673F0 enumC16673F0) {
        this.f5611Y = 8;
        this.f5613o0 = enumC16673F0;
        this.f5612Z = 0L;
    }
}
