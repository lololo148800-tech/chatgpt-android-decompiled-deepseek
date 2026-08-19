package p488Tn;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.EOFException;
import java.io.Flushable;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p138F8.vJO.vRJidSveZHcTw;
import p571X9.AbstractC9306j0;
import p909nm.AbstractC17678l;

/* JADX INFO: renamed from: Tn.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C7518a implements InterfaceC7526i, AutoCloseable, Flushable {

    /* JADX INFO: renamed from: Y */
    public C7524g f23839Y;

    /* JADX INFO: renamed from: Z */
    public C7524g f23840Z;

    /* JADX INFO: renamed from: o0 */
    public long f23841o0;

    /* JADX INFO: renamed from: E */
    public final void m7813E(C7518a source, long j10) {
        C7524g c7524gM7834b;
        AbstractC16544l.m18094g(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        long j11 = source.f23841o0;
        if (0 > j11 || j11 < j10 || j10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11050h(j11, "))", AbstractC9306j0.m9894m("offset (0) and byteCount (", j10, ") are not within the range [0..size(")));
        }
        while (j10 > 0) {
            C7524g c7524g = source.f23839Y;
            AbstractC16544l.m18091d(c7524g);
            int i10 = 0;
            if (j10 < c7524g.m7828b()) {
                C7524g c7524g2 = this.f23840Z;
                if (c7524g2 != null && c7524g2.f23858e) {
                    long j12 = ((long) c7524g2.f23856c) + j10;
                    AbstractC7527j abstractC7527j = c7524g2.f23857d;
                    if (j12 - ((long) ((abstractC7527j == null || ((C7523f) abstractC7527j).f23853b <= 0) ? c7524g2.f23855b : 0)) <= 8192) {
                        C7524g c7524g3 = source.f23839Y;
                        AbstractC16544l.m18091d(c7524g3);
                        c7524g3.m7832f(c7524g2, (int) j10);
                        source.f23841o0 -= j10;
                        this.f23841o0 += j10;
                        return;
                    }
                }
                C7524g c7524g4 = source.f23839Y;
                AbstractC16544l.m18091d(c7524g4);
                int i11 = (int) j10;
                if (i11 <= 0 || i11 > c7524g4.f23856c - c7524g4.f23855b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i11 >= 1024) {
                    c7524gM7834b = c7524g4.m7831e();
                } else {
                    c7524gM7834b = AbstractC7525h.m7834b();
                    int i12 = c7524g4.f23855b;
                    AbstractC17678l.m19305l(c7524g4.f23854a, 0, c7524gM7834b.f23854a, i12, i12 + i11);
                }
                c7524gM7834b.f23856c = c7524gM7834b.f23855b + i11;
                c7524g4.f23855b += i11;
                C7524g c7524g5 = c7524g4.f23860g;
                if (c7524g5 != null) {
                    c7524g5.m7830d(c7524gM7834b);
                } else {
                    c7524gM7834b.f23859f = c7524g4;
                    c7524g4.f23860g = c7524gM7834b;
                }
                source.f23839Y = c7524gM7834b;
            }
            C7524g c7524g6 = source.f23839Y;
            AbstractC16544l.m18091d(c7524g6);
            long jM7828b = c7524g6.m7828b();
            C7524g c7524gM7829c = c7524g6.m7829c();
            source.f23839Y = c7524gM7829c;
            if (c7524gM7829c == null) {
                source.f23840Z = null;
            }
            if (this.f23839Y == null) {
                this.f23839Y = c7524g6;
                this.f23840Z = c7524g6;
            } else {
                C7524g c7524g7 = this.f23840Z;
                AbstractC16544l.m18091d(c7524g7);
                c7524g7.m7830d(c7524g6);
                C7524g c7524g8 = c7524g6.f23860g;
                if (c7524g8 == null) {
                    throw new IllegalStateException("cannot compact");
                }
                if (c7524g8.f23858e) {
                    int i13 = c7524g6.f23856c - c7524g6.f23855b;
                    AbstractC16544l.m18091d(c7524g8);
                    int i14 = 8192 - c7524g8.f23856c;
                    C7524g c7524g9 = c7524g6.f23860g;
                    AbstractC16544l.m18091d(c7524g9);
                    AbstractC7527j abstractC7527j2 = c7524g9.f23857d;
                    if (abstractC7527j2 == null || ((C7523f) abstractC7527j2).f23853b <= 0) {
                        C7524g c7524g10 = c7524g6.f23860g;
                        AbstractC16544l.m18091d(c7524g10);
                        i10 = c7524g10.f23855b;
                    }
                    if (i13 <= i14 + i10) {
                        C7524g c7524g11 = c7524g6.f23860g;
                        AbstractC16544l.m18091d(c7524g11);
                        c7524g6.m7832f(c7524g11, i13);
                        if (c7524g6.m7829c() != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        AbstractC7525h.m7833a(c7524g6);
                        c7524g6 = c7524g11;
                    }
                }
                this.f23840Z = c7524g6;
                if (c7524g6.f23860g == null) {
                    this.f23839Y = c7524g6;
                }
            }
            source.f23841o0 -= jM7828b;
            this.f23841o0 += jM7828b;
            j10 -= jM7828b;
        }
    }

    @Override // p488Tn.InterfaceC7526i
    /* JADX INFO: renamed from: N */
    public final int mo7814N(byte[] sink, int i10, int i11) {
        AbstractC16544l.m18094g(sink, "sink");
        AbstractC7527j.m7835a(sink.length, i10, i11);
        C7524g c7524g = this.f23839Y;
        if (c7524g == null) {
            return -1;
        }
        int iMin = Math.min(i11 - i10, c7524g.m7828b());
        int i12 = (i10 + iMin) - i10;
        int i13 = c7524g.f23855b;
        AbstractC17678l.m19305l(c7524g.f23854a, i10, sink, i13, i13 + i12);
        c7524g.f23855b += i12;
        this.f23841o0 -= (long) iMin;
        if (AbstractC7527j.m7839e(c7524g)) {
            m7818a();
        }
        return iMin;
    }

    /* JADX INFO: renamed from: P */
    public final void m7815P(byte[] source, int i10, int i11) {
        AbstractC16544l.m18094g(source, "source");
        AbstractC7527j.m7835a(source.length, i10, i11);
        int i12 = i10;
        while (i12 < i11) {
            C7524g c7524gM7824m = m7824m(1);
            int iMin = Math.min(i11 - i12, c7524gM7824m.m7827a()) + i12;
            AbstractC17678l.m19305l(source, c7524gM7824m.f23856c, c7524gM7824m.f23854a, i12, iMin);
            c7524gM7824m.f23856c = (iMin - i12) + c7524gM7824m.f23856c;
            i12 = iMin;
        }
        this.f23841o0 += (long) (i11 - i10);
    }

    @Override // p488Tn.InterfaceC7526i
    /* JADX INFO: renamed from: U */
    public final void mo7816U(C7518a sink, long j10) throws EOFException {
        AbstractC16544l.m18094g(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(AbstractC0168G.m533v("byteCount (", j10, ") < 0").toString());
        }
        long j11 = this.f23841o0;
        if (j11 >= j10) {
            sink.m7813E(this, j10);
        } else {
            sink.m7813E(this, j11);
            throw new EOFException(AbstractC10763a.m11050h(this.f23841o0, " bytes were written.", AbstractC9306j0.m9894m("Buffer exhausted before writing ", j10, " bytes. Only ")));
        }
    }

    @Override // p488Tn.InterfaceC7521d
    /* JADX INFO: renamed from: U0 */
    public final long mo7817U0(C7518a sink, long j10) {
        AbstractC16544l.m18094g(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(AbstractC0168G.m533v("byteCount (", j10, ") < 0").toString());
        }
        long j11 = this.f23841o0;
        if (j11 == 0) {
            return -1L;
        }
        if (j10 > j11) {
            j10 = j11;
        }
        sink.m7813E(this, j10);
        return j10;
    }

    /* JADX INFO: renamed from: a */
    public final void m7818a() {
        C7524g c7524g = this.f23839Y;
        AbstractC16544l.m18091d(c7524g);
        C7524g c7524g2 = c7524g.f23859f;
        this.f23839Y = c7524g2;
        if (c7524g2 == null) {
            this.f23840Z = null;
        } else {
            c7524g2.f23860g = null;
        }
        c7524g.f23859f = null;
        AbstractC7525h.m7833a(c7524g);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m7820e() {
        C7524g c7524g = this.f23840Z;
        AbstractC16544l.m18091d(c7524g);
        C7524g c7524g2 = c7524g.f23860g;
        this.f23840Z = c7524g2;
        if (c7524g2 == null) {
            this.f23839Y = null;
        } else {
            c7524g2.f23859f = null;
        }
        c7524g.f23860g = null;
        AbstractC7525h.m7833a(c7524g);
    }

    @Override // p488Tn.InterfaceC7526i
    /* JADX INFO: renamed from: g */
    public final boolean mo7821g() {
        return this.f23841o0 == 0;
    }

    /* JADX INFO: renamed from: k */
    public final void m7822k(InterfaceC7521d source) {
        AbstractC16544l.m18094g(source, "source");
        while (source.mo7817U0(this, 8192L) != -1) {
        }
    }

    @Override // p488Tn.InterfaceC7526i
    /* JADX INFO: renamed from: l */
    public final boolean mo7823l(long j10) {
        if (j10 >= 0) {
            return this.f23841o0 >= j10;
        }
        throw new IllegalArgumentException(AbstractC0168G.m533v("byteCount: ", j10, " < 0").toString());
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C7524g m7824m(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        C7524g c7524g = this.f23840Z;
        if (c7524g == null) {
            C7524g c7524gM7834b = AbstractC7525h.m7834b();
            this.f23839Y = c7524gM7834b;
            this.f23840Z = c7524gM7834b;
            return c7524gM7834b;
        }
        if (c7524g.f23856c + i10 <= 8192 && c7524g.f23858e) {
            return c7524g;
        }
        C7524g c7524gM7834b2 = AbstractC7525h.m7834b();
        c7524g.m7830d(c7524gM7834b2);
        this.f23840Z = c7524gM7834b2;
        return c7524gM7834b2;
    }

    @Override // p488Tn.InterfaceC7526i
    public final C7522e peek() {
        return new C7522e(new C7520c(this));
    }

    @Override // p488Tn.InterfaceC7526i
    /* JADX INFO: renamed from: s */
    public final void mo7825s(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11049g(j10, "byteCount: ").toString());
        }
        if (this.f23841o0 >= j10) {
            return;
        }
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.f23841o0 + ", required: " + j10 + ')');
    }

    public final void skip(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(AbstractC0168G.m533v("byteCount (", j10, ") < 0").toString());
        }
        long j11 = j10;
        while (j11 > 0) {
            C7524g c7524g = this.f23839Y;
            if (c7524g == null) {
                throw new EOFException(AbstractC0168G.m533v("Buffer exhausted before skipping ", j10, " bytes."));
            }
            int iMin = (int) Math.min(j11, c7524g.f23856c - c7524g.f23855b);
            long j12 = iMin;
            this.f23841o0 -= j12;
            j11 -= j12;
            int i10 = c7524g.f23855b + iMin;
            c7524g.f23855b = i10;
            if (i10 == c7524g.f23856c) {
                m7818a();
            }
        }
    }

    public final String toString() {
        long j10 = this.f23841o0;
        if (j10 == 0) {
            return "Buffer(size=0)";
        }
        long j11 = 64;
        int iMin = (int) Math.min(j11, j10);
        StringBuilder sb2 = new StringBuilder((iMin * 2) + (this.f23841o0 > j11 ? 1 : 0));
        int i10 = 0;
        for (C7524g c7524g = this.f23839Y; c7524g != null; c7524g = c7524g.f23859f) {
            int i11 = 0;
            while (i10 < iMin && i11 < c7524g.m7828b()) {
                int i12 = i11 + 1;
                byte b = c7524g.f23854a[c7524g.f23855b + i11];
                i10++;
                char[] cArr = AbstractC7527j.f23868a;
                sb2.append(cArr[(b >> 4) & 15]);
                sb2.append(cArr[b & 15]);
                i11 = i12;
            }
        }
        if (this.f23841o0 > j11) {
            sb2.append((char) 8230);
        }
        return "Buffer(size=" + this.f23841o0 + " hex=" + ((Object) sb2) + ')';
    }

    @Override // p488Tn.InterfaceC7526i
    /* JADX INFO: renamed from: z */
    public final long mo7826z(C7518a sink) {
        AbstractC16544l.m18094g(sink, "sink");
        long j10 = this.f23841o0;
        if (j10 > 0) {
            sink.m7813E(this, j10);
        }
        return j10;
    }

    @Override // p488Tn.InterfaceC7526i
    public final byte readByte() throws EOFException {
        C7524g c7524g = this.f23839Y;
        if (c7524g == null) {
            throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.f23841o0 + vRJidSveZHcTw.yyOHNmxSMXk + "1)");
        }
        int iM7828b = c7524g.m7828b();
        if (iM7828b == 0) {
            m7818a();
            return readByte();
        }
        int i10 = c7524g.f23855b;
        c7524g.f23855b = i10 + 1;
        byte b = c7524g.f23854a[i10];
        this.f23841o0--;
        if (iM7828b == 1) {
            m7818a();
        }
        return b;
    }

    @Override // p488Tn.InterfaceC7526i
    /* JADX INFO: renamed from: b */
    public final C7518a mo7819b() {
        return this;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Flushable
    public final void flush() {
    }
}
