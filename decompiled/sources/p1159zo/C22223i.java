package p1159zo;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import no.AbstractC17708b;
import p001A.AbstractC0010F;
import p026Ao.C0657F;
import p026Ao.C0675i;
import p026Ao.C0678l;
import p026Ao.InterfaceC0663L;

/* JADX INFO: renamed from: zo.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C22223i implements Closeable {

    /* JADX INFO: renamed from: Y */
    public final C0657F f70445Y;

    /* JADX INFO: renamed from: Z */
    public final C22221g f70446Z;

    /* JADX INFO: renamed from: o0 */
    public final boolean f70447o0;

    /* JADX INFO: renamed from: p0 */
    public final boolean f70448p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f70449q0;

    /* JADX INFO: renamed from: r0 */
    public int f70450r0;

    /* JADX INFO: renamed from: s0 */
    public long f70451s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f70452t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f70453u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f70454v0;

    /* JADX INFO: renamed from: w0 */
    public final C0675i f70455w0;

    /* JADX INFO: renamed from: x0 */
    public final C0675i f70456x0;

    /* JADX INFO: renamed from: y0 */
    public C22215a f70457y0;

    /* JADX INFO: renamed from: z0 */
    public final byte[] f70458z0;

    public C22223i(C0657F source, C22221g c22221g, boolean z6, boolean z10) {
        AbstractC16544l.m18094g(source, "source");
        this.f70445Y = source;
        this.f70446Z = c22221g;
        this.f70447o0 = z6;
        this.f70448p0 = z10;
        this.f70455w0 = new C0675i();
        this.f70456x0 = new C0675i();
        this.f70458z0 = null;
    }

    /* JADX INFO: renamed from: a */
    public final void m22415a() throws ProtocolException, EOFException {
        String strM1428Z0;
        short sM1425W0;
        String strM11048f;
        long j10 = this.f70451s0;
        if (j10 > 0) {
            this.f70445Y.m1354e(this.f70455w0, j10);
        }
        switch (this.f70450r0) {
            case 8:
                C0675i c0675i = this.f70455w0;
                long j11 = c0675i.f1970Z;
                if (j11 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j11 != 0) {
                    sM1425W0 = c0675i.m1425W0();
                    strM1428Z0 = this.f70455w0.m1428Z0();
                    if (sM1425W0 < 1000 || sM1425W0 >= 5000) {
                        strM11048f = AbstractC10763a.m11048f(sM1425W0, "Code must be in range [1000,5000): ");
                    } else {
                        strM11048f = ((1004 > sM1425W0 || sM1425W0 >= 1007) && (1015 > sM1425W0 || sM1425W0 >= 3000)) ? null : AbstractC0010F.m19c(sM1425W0, "Code ", " is reserved and may not be used.");
                    }
                    if (strM11048f != null) {
                        throw new ProtocolException(strM11048f);
                    }
                } else {
                    strM1428Z0 = "";
                    sM1425W0 = 1005;
                }
                this.f70446Z.m22410f(sM1425W0, strM1428Z0);
                this.f70449q0 = true;
                return;
            case 9:
                C22221g c22221g = this.f70446Z;
                C0675i c0675i2 = this.f70455w0;
                c22221g.m22411g(c0675i2.m1417C0(c0675i2.f1970Z));
                return;
            case 10:
                C22221g c22221g2 = this.f70446Z;
                C0675i c0675i3 = this.f70455w0;
                C0678l payload = c0675i3.m1417C0(c0675i3.f1970Z);
                synchronized (c22221g2) {
                    AbstractC16544l.m18094g(payload, "payload");
                    c22221g2.f70438v = false;
                }
                return;
            default:
                int i10 = this.f70450r0;
                byte[] bArr = AbstractC17708b.f56536a;
                String hexString = Integer.toHexString(i10);
                AbstractC16544l.m18093f(hexString, "toHexString(this)");
                throw new ProtocolException("Unknown control opcode: ".concat(hexString));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        C22215a c22215a = this.f70457y0;
        if (c22215a != null) {
            c22215a.close();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m22416e() throws IOException {
        boolean z6;
        if (this.f70449q0) {
            throw new IOException("closed");
        }
        C0657F c0657f = this.f70445Y;
        long jMo1394h = c0657f.f1921Y.mo1326h().mo1394h();
        InterfaceC0663L interfaceC0663L = c0657f.f1921Y;
        interfaceC0663L.mo1326h().mo1391b();
        try {
            byte b = c0657f.readByte();
            byte[] bArr = AbstractC17708b.f56536a;
            interfaceC0663L.mo1326h().mo1389g(jMo1394h, TimeUnit.NANOSECONDS);
            int i10 = b & 15;
            this.f70450r0 = i10;
            int i11 = 0;
            boolean z10 = (b & 128) != 0;
            this.f70452t0 = z10;
            boolean z11 = (b & 8) != 0;
            this.f70453u0 = z11;
            if (z11 && !z10) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z12 = (b & 64) != 0;
            if (i10 == 1 || i10 == 2) {
                if (!z12) {
                    z6 = false;
                } else {
                    if (!this.f70447o0) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z6 = true;
                }
                this.f70454v0 = z6;
            } else if (z12) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((b & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((b & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte b10 = c0657f.readByte();
            boolean z13 = (b10 & 128) != 0;
            if (z13) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long j10 = b10 & 127;
            this.f70451s0 = j10;
            C0675i c0675i = c0657f.f1922Z;
            if (j10 == 126) {
                this.f70451s0 = c0657f.m1345P() & 65535;
            } else if (j10 == 127) {
                c0657f.mo1362s(8L);
                long jM1423V0 = c0675i.m1423V0();
                this.f70451s0 = jM1423V0;
                if (jM1423V0 < 0) {
                    StringBuilder sb2 = new StringBuilder("Frame length 0x");
                    String hexString = Long.toHexString(this.f70451s0);
                    AbstractC16544l.m18093f(hexString, "toHexString(this)");
                    sb2.append(hexString);
                    sb2.append(" > 0x7FFFFFFFFFFFFFFF");
                    throw new ProtocolException(sb2.toString());
                }
            }
            if (this.f70453u0 && this.f70451s0 > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (!z13) {
                return;
            }
            byte[] bArr2 = this.f70458z0;
            AbstractC16544l.m18091d(bArr2);
            try {
                c0657f.mo1362s(bArr2.length);
                c0675i.m1418H0(bArr2);
            } catch (EOFException e10) {
                while (true) {
                    long j11 = c0675i.f1970Z;
                    if (j11 <= 0) {
                        throw e10;
                    }
                    int i12 = c0675i.read(bArr2, i11, (int) j11);
                    if (i12 == -1) {
                        throw new AssertionError();
                    }
                    i11 += i12;
                }
            }
        } catch (Throwable th2) {
            interfaceC0663L.mo1326h().mo1389g(jMo1394h, TimeUnit.NANOSECONDS);
            throw th2;
        }
    }
}
