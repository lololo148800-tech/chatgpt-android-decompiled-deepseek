package to;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC16544l;
import no.AbstractC17708b;
import p001A.AbstractC0010F;
import p026Ao.C0657F;
import p026Ao.C0675i;
import p026Ao.C0678l;
import p200Hm.C3506e;
import p298Lm.C5150L;
import p303M1.C5276b;
import p315Me.Myis.CxcULo;
import p530Vi.AbstractC8301I;
import p571X9.AbstractC9306j0;
import p628Zk.GwZB.tpXhEMGxfXFVSh;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: to.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C20026q implements Closeable {

    /* JADX INFO: renamed from: p0 */
    public static final Logger f63413p0;

    /* JADX INFO: renamed from: Y */
    public final C0657F f63414Y;

    /* JADX INFO: renamed from: Z */
    public final C20025p f63415Z;

    /* JADX INFO: renamed from: o0 */
    public final C5276b f63416o0;

    static {
        Logger logger = Logger.getLogger(AbstractC20014e.class.getName());
        AbstractC16544l.m18093f(logger, "getLogger(Http2::class.java.name)");
        f63413p0 = logger;
    }

    public C20026q(C0657F source) {
        AbstractC16544l.m18094g(source, "source");
        this.f63414Y = source;
        C20025p c20025p = new C20025p(source);
        this.f63415Z = c20025p;
        this.f63416o0 = new C5276b(c20025p);
    }

    /* JADX INFO: renamed from: E */
    public final void m20825E(C5150L c5150l, int i10, int i11, int i12) throws IOException {
        int i13;
        int i14 = 1;
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z6 = false;
        boolean z10 = (i11 & 1) != 0;
        if ((i11 & 8) != 0) {
            byte b = this.f63414Y.readByte();
            byte[] bArr = AbstractC17708b.f56536a;
            i13 = b & 255;
        } else {
            i13 = 0;
        }
        if ((i11 & 32) != 0) {
            C0657F c0657f = this.f63414Y;
            c0657f.m1358k();
            c0657f.readByte();
            byte[] bArr2 = AbstractC17708b.f56536a;
            c5150l.getClass();
            i10 -= 5;
        }
        List listM20831m = m20831m(AbstractC20024o.m20824a(i10, i11, i13), i13, i11, i12);
        c5150l.getClass();
        ((C20022m) c5150l.f16792o0).getClass();
        if (i12 != 0 && (i12 & 1) == 0) {
            z6 = true;
        }
        if (z6) {
            C20022m c20022m = (C20022m) c5150l.f16792o0;
            c20022m.getClass();
            c20022m.f63393u0.m19890c(new C20020k(c20022m.f63387o0 + '[' + i12 + "] onHeaders", c20022m, i12, listM20831m, z10), 0L);
            return;
        }
        C20022m c20022m2 = (C20022m) c5150l.f16792o0;
        synchronized (c20022m2) {
            C20030u c20030uM20821e = c20022m2.m20821e(i12);
            if (c20030uM20821e != null) {
                c20030uM20821e.m20843j(AbstractC17708b.m19431w(listM20831m), z10);
                return;
            }
            if (c20022m2.f63390r0) {
                return;
            }
            if (i12 <= c20022m2.f63388p0) {
                return;
            }
            if (i12 % 2 == c20022m2.f63389q0 % 2) {
                return;
            }
            C20030u c20030u = new C20030u(i12, c20022m2, false, z10, AbstractC17708b.m19431w(listM20831m));
            c20022m2.f63388p0 = i12;
            c20022m2.f63386Z.put(Integer.valueOf(i12), c20030u);
            c20022m2.f63391s0.m19897e().m19890c(new C20017h(c20022m2.f63387o0 + '[' + i12 + "] onStream", c20022m2, c20030u, i14), 0L);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m20826P(C5150L c5150l, int i10, int i11, int i12) throws IOException {
        if (i10 != 8) {
            throw new IOException(AbstractC10763a.m11048f(i10, "TYPE_PING length != 8: "));
        }
        if (i12 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        int iM1358k = this.f63414Y.m1358k();
        int iM1358k2 = this.f63414Y.m1358k();
        if ((i11 & 1) == 0) {
            ((C20022m) c5150l.f16792o0).f63392t0.m19890c(new C20018i(AbstractC9306j0.m9891j(((C20022m) c5150l.f16792o0).f63387o0, " ping", new StringBuilder()), (C20022m) c5150l.f16792o0, iM1358k, iM1358k2, 0), 0L);
            return;
        }
        C20022m c20022m = (C20022m) c5150l.f16792o0;
        synchronized (c20022m) {
            try {
                if (iM1358k == 1) {
                    c20022m.f63396x0++;
                } else if (iM1358k == 2) {
                    c20022m.f63398z0++;
                } else if (iM1358k == 3) {
                    c20022m.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m20827S(C5150L c5150l, int i10, int i11, int i12) throws IOException {
        int i13;
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i11 & 8) != 0) {
            byte b = this.f63414Y.readByte();
            byte[] bArr = AbstractC17708b.f56536a;
            i13 = b & 255;
        } else {
            i13 = 0;
        }
        int iM1358k = this.f63414Y.m1358k() & Integer.MAX_VALUE;
        List listM20831m = m20831m(AbstractC20024o.m20824a(i10 - 4, i11, i13), i13, i11, i12);
        c5150l.getClass();
        C20022m c20022m = (C20022m) c5150l.f16792o0;
        c20022m.getClass();
        synchronized (c20022m) {
            if (c20022m.f63384K0.contains(Integer.valueOf(iM1358k))) {
                c20022m.m20818T(iM1358k, 2);
                return;
            }
            c20022m.f63384K0.add(Integer.valueOf(iM1358k));
            c20022m.f63393u0.m19890c(new C20020k(c20022m.f63387o0 + '[' + iM1358k + "] onRequest", c20022m, iM1358k, listM20831m), 0L);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f63414Y.close();
    }

    /* JADX INFO: renamed from: e */
    public final void m20829e(C5150L c5150l, int i10, int i11, int i12) throws IOException {
        int i13;
        C20030u c20030u;
        boolean z6;
        boolean z10;
        if (i12 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z11 = (i11 & 1) != 0;
        if ((i11 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        if ((i11 & 8) != 0) {
            byte b = this.f63414Y.readByte();
            byte[] bArr = AbstractC17708b.f56536a;
            i13 = b & 255;
        } else {
            i13 = 0;
        }
        int iM20824a = AbstractC20024o.m20824a(i10, i11, i13);
        C0657F source = this.f63414Y;
        c5150l.getClass();
        AbstractC16544l.m18094g(source, "source");
        ((C20022m) c5150l.f16792o0).getClass();
        long j10 = 0;
        if (i12 != 0 && (i12 & 1) == 0) {
            C20022m c20022m = (C20022m) c5150l.f16792o0;
            c20022m.getClass();
            C0675i c0675i = new C0675i();
            long j11 = iM20824a;
            source.mo1362s(j11);
            source.mo1325H(c0675i, j11);
            c20022m.f63393u0.m19890c(new C20019j(c20022m.f63387o0 + '[' + i12 + "] onData", c20022m, i12, c0675i, iM20824a, z11), 0L);
        } else {
            C20030u c20030uM20821e = ((C20022m) c5150l.f16792o0).m20821e(i12);
            if (c20030uM20821e == null) {
                ((C20022m) c5150l.f16792o0).m20818T(i12, 2);
                long j12 = iM20824a;
                ((C20022m) c5150l.f16792o0).m20816P(j12);
                source.skip(j12);
            } else {
                byte[] bArr2 = AbstractC17708b.f56536a;
                C20028s c20028s = c20030uM20821e.f63436i;
                long j13 = iM20824a;
                c20028s.getClass();
                long j14 = j13;
                while (true) {
                    if (j14 <= j10) {
                        c20030u = c20030uM20821e;
                        byte[] bArr3 = AbstractC17708b.f56536a;
                        c20028s.f63426r0.f63429b.m20816P(j13);
                        break;
                    }
                    synchronized (c20028s.f63426r0) {
                        z6 = c20028s.f63422Z;
                        c20030u = c20030uM20821e;
                        z10 = c20028s.f63424p0.f1970Z + j14 > c20028s.f63421Y;
                    }
                    if (z10) {
                        source.skip(j14);
                        c20028s.f63426r0.m20838e(4);
                        break;
                    }
                    if (z6) {
                        source.skip(j14);
                        break;
                    }
                    long jMo1325H = source.mo1325H(c20028s.f63423o0, j14);
                    if (jMo1325H == -1) {
                        throw new EOFException();
                    }
                    j14 -= jMo1325H;
                    C20030u c20030u2 = c20028s.f63426r0;
                    synchronized (c20030u2) {
                        try {
                            if (c20028s.f63425q0) {
                                c20028s.f63423o0.m1429a();
                                j10 = 0;
                            } else {
                                C0675i c0675i2 = c20028s.f63424p0;
                                j10 = 0;
                                boolean z12 = c0675i2.f1970Z == 0;
                                c0675i2.mo1339u(c20028s.f63423o0);
                                if (z12) {
                                    c20030u2.notifyAll();
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    c20030uM20821e = c20030u;
                }
                if (z11) {
                    c20030u.m20843j(AbstractC17708b.f56537b, true);
                }
            }
        }
        this.f63414Y.skip(i13);
    }

    /* JADX INFO: renamed from: k */
    public final void m20830k(C5150L c5150l, int i10, int i11) throws IOException {
        int i12;
        Object[] array;
        if (i10 < 8) {
            throw new IOException(AbstractC10763a.m11048f(i10, "TYPE_GOAWAY length < 8: "));
        }
        if (i11 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int iM1358k = this.f63414Y.m1358k();
        int iM1358k2 = this.f63414Y.m1358k();
        int i13 = i10 - 8;
        int[] iArrM27k = AbstractC0010F.m27k(14);
        int length = iArrM27k.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                i12 = 0;
                break;
            }
            i12 = iArrM27k[i14];
            if (AbstractC0010F.m24h(i12) == iM1358k2) {
                break;
            } else {
                i14++;
            }
        }
        if (i12 == 0) {
            throw new IOException(AbstractC10763a.m11048f(iM1358k2, "TYPE_GOAWAY unexpected error code: "));
        }
        C0678l debugData = C0678l.f1971p0;
        if (i13 > 0) {
            debugData = this.f63414Y.m1352a(i13);
        }
        c5150l.getClass();
        AbstractC16544l.m18094g(debugData, "debugData");
        debugData.mo1372d();
        C20022m c20022m = (C20022m) c5150l.f16792o0;
        synchronized (c20022m) {
            array = c20022m.f63386Z.values().toArray(new C20030u[0]);
            c20022m.f63390r0 = true;
        }
        for (C20030u c20030u : (C20030u[]) array) {
            if (c20030u.f63428a > iM1358k && c20030u.m20841h()) {
                c20030u.m20844k(8);
                ((C20022m) c5150l.f16792o0).m20823m(c20030u.f63428a);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:112:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:114:0x0203  */
    /* JADX WARN: Code duplicated, block: B:115:0x0207  */
    /* JADX INFO: renamed from: a */
    public final boolean m20828a(boolean z6, C5150L handler) throws IOException {
        C20022m c20022m;
        C20030u c20030uM20823m;
        int iM1358k;
        int i10 = 2;
        int i11 = 0;
        AbstractC16544l.m18094g(handler, "handler");
        try {
            this.f63414Y.mo1362s(9L);
            int iM19429u = AbstractC17708b.m19429u(this.f63414Y);
            if (iM19429u > 16384) {
                throw new IOException(AbstractC10763a.m11048f(iM19429u, "FRAME_SIZE_ERROR: "));
            }
            int i12 = this.f63414Y.readByte() & 255;
            byte b = this.f63414Y.readByte();
            int i13 = b & 255;
            int iM1358k2 = this.f63414Y.m1358k();
            int i14 = Integer.MAX_VALUE & iM1358k2;
            Logger logger = f63413p0;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(AbstractC20014e.m20813a(true, i14, iM19429u, i12, i13));
            }
            if (z6 && i12 != 4) {
                StringBuilder sb2 = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = AbstractC20014e.f63351b;
                sb2.append(i12 < strArr.length ? strArr[i12] : AbstractC17708b.m19418j("0x%02x", Integer.valueOf(i12)));
                throw new IOException(sb2.toString());
            }
            switch (i12) {
                case 0:
                    m20829e(handler, iM19429u, i13, i14);
                    return true;
                case 1:
                    m20825E(handler, iM19429u, i13, i14);
                    return true;
                case 2:
                    if (iM19429u != 5) {
                        throw new IOException(AbstractC0010F.m19c(iM19429u, CxcULo.aJOYQQLEf, " != 5"));
                    }
                    if (i14 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    C0657F c0657f = this.f63414Y;
                    c0657f.m1358k();
                    c0657f.readByte();
                    return true;
                case 3:
                    if (iM19429u != 4) {
                        throw new IOException(AbstractC0010F.m19c(iM19429u, "TYPE_RST_STREAM length: ", " != 4"));
                    }
                    if (i14 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int iM1358k3 = this.f63414Y.m1358k();
                    for (int i15 : AbstractC0010F.m27k(14)) {
                        if (AbstractC0010F.m24h(i15) == iM1358k3) {
                            i11 = i15;
                            if (i11 != 0) {
                                throw new IOException(AbstractC10763a.m11048f(iM1358k3, "TYPE_RST_STREAM unexpected error code: "));
                            }
                            c20022m = (C20022m) handler.f16792o0;
                            c20022m.getClass();
                            if (i14 == 0 && (iM1358k2 & 1) == 0) {
                                c20022m.f63393u0.m19890c(new C20018i(c20022m.f63387o0 + '[' + i14 + "] onReset", c20022m, i14, i11, 1), 0L);
                            } else {
                                c20030uM20823m = c20022m.m20823m(i14);
                                if (c20030uM20823m != null) {
                                    c20030uM20823m.m20844k(i11);
                                }
                            }
                            return true;
                        }
                    }
                    if (i11 != 0) {
                        throw new IOException(AbstractC10763a.m11048f(iM1358k3, "TYPE_RST_STREAM unexpected error code: "));
                    }
                    c20022m = (C20022m) handler.f16792o0;
                    c20022m.getClass();
                    if (i14 == 0) {
                        c20030uM20823m = c20022m.m20823m(i14);
                        if (c20030uM20823m != null) {
                            c20030uM20823m.m20844k(i11);
                        }
                    } else {
                        c20030uM20823m = c20022m.m20823m(i14);
                        if (c20030uM20823m != null) {
                            c20030uM20823m.m20844k(i11);
                        }
                    }
                    return true;
                case 4:
                    if (i14 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((b & 1) == 0) {
                        if (iM19429u % 6 != 0) {
                            throw new IOException(AbstractC10763a.m11048f(iM19429u, "TYPE_SETTINGS length % 6 != 0: "));
                        }
                        C20034y c20034y = new C20034y();
                        C3506e c3506eM8928s = AbstractC8301I.m8928s(AbstractC8301I.m8929t(0, iM19429u), 6);
                        int i16 = c3506eM8928s.f10591Y;
                        int i17 = c3506eM8928s.f10592Z;
                        int i18 = c3506eM8928s.f10593o0;
                        if ((i18 > 0 && i16 <= i17) || (i18 < 0 && i17 <= i16)) {
                            while (true) {
                                C0657F c0657f2 = this.f63414Y;
                                short sM1345P = c0657f2.m1345P();
                                byte[] bArr = AbstractC17708b.f56536a;
                                int i19 = sM1345P & 65535;
                                iM1358k = c0657f2.m1358k();
                                if (i19 != 2) {
                                    if (i19 == 3) {
                                        i19 = 4;
                                    } else if (i19 == 4) {
                                        if (iM1358k < 0) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                        }
                                        i19 = 7;
                                    } else if (i19 == 5 && (iM1358k < 16384 || iM1358k > 16777215)) {
                                    }
                                } else if (iM1358k != 0 && iM1358k != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                c20034y.m20857c(i19, iM1358k);
                                if (i16 != i17) {
                                    i16 += i18;
                                }
                            }
                            throw new IOException(AbstractC10763a.m11048f(iM1358k, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                        }
                        C20022m c20022m2 = (C20022m) handler.f16792o0;
                        c20022m2.f63392t0.m19890c(new C20017h(AbstractC9306j0.m9891j(c20022m2.f63387o0, " applyAndAckSettings", new StringBuilder()), handler, c20034y, i10), 0L);
                    } else if (iM19429u != 0) {
                        throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                    }
                    return true;
                case 5:
                    m20827S(handler, iM19429u, i13, i14);
                    return true;
                case 6:
                    m20826P(handler, iM19429u, i13, i14);
                    return true;
                case 7:
                    m20830k(handler, iM19429u, i14);
                    return true;
                case 8:
                    if (iM19429u != 4) {
                        throw new IOException(AbstractC10763a.m11048f(iM19429u, "TYPE_WINDOW_UPDATE length !=4: "));
                    }
                    long jM1358k = ((long) this.f63414Y.m1358k()) & 2147483647L;
                    if (jM1358k == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i14 != 0) {
                        C20030u c20030uM20821e = ((C20022m) handler.f16792o0).m20821e(i14);
                        if (c20030uM20821e != null) {
                            synchronized (c20030uM20821e) {
                                c20030uM20821e.f63433f += jM1358k;
                                if (jM1358k > 0) {
                                    c20030uM20821e.notifyAll();
                                }
                            }
                        }
                        break;
                    } else {
                        C20022m c20022m3 = (C20022m) handler.f16792o0;
                        synchronized (c20022m3) {
                            c20022m3.f63380G0 += jM1358k;
                            c20022m3.notifyAll();
                        }
                    }
                    return true;
                default:
                    this.f63414Y.skip(iM19429u);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: m */
    public final List m20831m(int i10, int i11, int i12, int i13) throws IOException {
        C20025p c20025p = this.f63415Z;
        c20025p.f63411q0 = i10;
        c20025p.f63408Z = i10;
        c20025p.f63412r0 = i11;
        c20025p.f63409o0 = i12;
        c20025p.f63410p0 = i13;
        while (true) {
            C5276b c5276b = this.f63416o0;
            C0657F c0657f = (C0657F) c5276b.f17350g;
            boolean zMo1356g = c0657f.mo1356g();
            ArrayList arrayList = (ArrayList) c5276b.f17349f;
            if (zMo1356g) {
                List listM19322C0 = AbstractC17680n.m19322C0(arrayList);
                arrayList.clear();
                return listM19322C0;
            }
            byte b = c0657f.readByte();
            byte[] bArr = AbstractC17708b.f56536a;
            int i14 = b & 255;
            if (i14 == 128) {
                throw new IOException("index == 0");
            }
            if ((b & 128) == 128) {
                int iM5790g = c5276b.m5790g(i14, 127);
                int i15 = iM5790g - 1;
                if (i15 >= 0) {
                    C20011b[] c20011bArr = AbstractC20013d.f63348a;
                    if (i15 <= c20011bArr.length - 1) {
                        arrayList.add(c20011bArr[i15]);
                    }
                }
                int length = c5276b.f17346c + 1 + (i15 - AbstractC20013d.f63348a.length);
                if (length >= 0) {
                    C20011b[] c20011bArr2 = (C20011b[]) c5276b.f17351h;
                    if (length < c20011bArr2.length) {
                        C20011b c20011b = c20011bArr2[length];
                        AbstractC16544l.m18091d(c20011b);
                        arrayList.add(c20011b);
                    }
                }
                throw new IOException(AbstractC10763a.m11048f(iM5790g, "Header index too large "));
            }
            if (i14 == 64) {
                C20011b[] c20011bArr3 = AbstractC20013d.f63348a;
                C0678l c0678lM5789f = c5276b.m5789f();
                AbstractC20013d.m20812a(c0678lM5789f);
                c5276b.m5787d(new C20011b(c0678lM5789f, c5276b.m5789f()));
            } else if ((b & 64) == 64) {
                c5276b.m5787d(new C20011b(c5276b.m5786c(c5276b.m5790g(i14, 63) - 1), c5276b.m5789f()));
            } else if ((b & 32) == 32) {
                int iM5790g2 = c5276b.m5790g(i14, 31);
                c5276b.f17345b = iM5790g2;
                if (iM5790g2 < 0 || iM5790g2 > 4096) {
                    throw new IOException(tpXhEMGxfXFVSh.upBBTBPh + c5276b.f17345b);
                }
                int i16 = c5276b.f17348e;
                if (iM5790g2 < i16) {
                    if (iM5790g2 == 0) {
                        C20011b[] c20011bArr4 = (C20011b[]) c5276b.f17351h;
                        AbstractC17678l.m19311r(c20011bArr4, null, 0, c20011bArr4.length);
                        c5276b.f17346c = ((C20011b[]) c5276b.f17351h).length - 1;
                        c5276b.f17347d = 0;
                        c5276b.f17348e = 0;
                    } else {
                        c5276b.m5784a(i16 - iM5790g2);
                    }
                }
            } else if (i14 == 16 || i14 == 0) {
                C20011b[] c20011bArr5 = AbstractC20013d.f63348a;
                C0678l c0678lM5789f2 = c5276b.m5789f();
                AbstractC20013d.m20812a(c0678lM5789f2);
                arrayList.add(new C20011b(c0678lM5789f2, c5276b.m5789f()));
            } else {
                arrayList.add(new C20011b(c5276b.m5786c(c5276b.m5790g(i14, 15) - 1), c5276b.m5789f()));
            }
        }
    }
}
