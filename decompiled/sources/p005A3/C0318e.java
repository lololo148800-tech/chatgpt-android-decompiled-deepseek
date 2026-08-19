package p005A3;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.GNuz.HJrCuD;
import p003A1.AbstractC0168G;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;
import p1142z3.C21729B;
import p1142z3.C21741i;
import p1142z3.C21742j;
import p1142z3.C21743k;
import p1142z3.C21756x;
import p1142z3.InterfaceC21730C;
import p1142z3.InterfaceC21740h;
import p644ab.AbstractC10531d;

/* JADX INFO: renamed from: A3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0318e implements InterfaceC21740h {

    /* JADX INFO: renamed from: A0 */
    public AbstractC0322i f1097A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f1098B0;

    /* JADX INFO: renamed from: C0 */
    public boolean f1099C0;

    /* JADX INFO: renamed from: D0 */
    public long f1100D0;

    /* JADX INFO: renamed from: Y */
    public final InterfaceC0315b f1101Y;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC21740h f1102Z;

    /* JADX INFO: renamed from: o0 */
    public final C21729B f1103o0;

    /* JADX INFO: renamed from: p0 */
    public final InterfaceC21740h f1104p0;

    /* JADX INFO: renamed from: q0 */
    public final boolean f1105q0 = false;

    /* JADX INFO: renamed from: r0 */
    public final boolean f1106r0;

    /* JADX INFO: renamed from: s0 */
    public final boolean f1107s0;

    /* JADX INFO: renamed from: t0 */
    public Uri f1108t0;

    /* JADX INFO: renamed from: u0 */
    public C21743k f1109u0;

    /* JADX INFO: renamed from: v0 */
    public C21743k f1110v0;

    /* JADX INFO: renamed from: w0 */
    public InterfaceC21740h f1111w0;

    /* JADX INFO: renamed from: x0 */
    public long f1112x0;

    /* JADX INFO: renamed from: y0 */
    public long f1113y0;

    /* JADX INFO: renamed from: z0 */
    public long f1114z0;

    public C0318e(InterfaceC0315b interfaceC0315b, InterfaceC21740h interfaceC21740h, InterfaceC21740h interfaceC21740h2, C0317d c0317d, int i10) {
        this.f1101Y = interfaceC0315b;
        this.f1102Z = interfaceC21740h2;
        this.f1106r0 = (i10 & 2) != 0;
        this.f1107s0 = false;
        if (interfaceC21740h != null) {
            this.f1104p0 = interfaceC21740h;
            this.f1103o0 = c0317d != null ? new C21729B(interfaceC21740h, c0317d) : null;
        } else {
            this.f1104p0 = C21756x.f69015Y;
            this.f1103o0 = null;
        }
    }

    @Override // p1142z3.InterfaceC21740h
    /* JADX INFO: renamed from: c */
    public final void mo927c(InterfaceC21730C interfaceC21730C) {
        interfaceC21730C.getClass();
        this.f1102Z.mo927c(interfaceC21730C);
        this.f1104p0.mo927c(interfaceC21730C);
    }

    @Override // p1142z3.InterfaceC21740h
    public final void close() {
        this.f1109u0 = null;
        this.f1108t0 = null;
        this.f1113y0 = 0L;
        try {
            m928g();
        } catch (Throwable th2) {
            if (this.f1111w0 == this.f1102Z || (th2 instanceof C0314a)) {
                this.f1098B0 = true;
            }
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final void m928g() {
        InterfaceC0315b interfaceC0315b = this.f1101Y;
        InterfaceC21740h interfaceC21740h = this.f1111w0;
        if (interfaceC21740h == null) {
            return;
        }
        try {
            interfaceC21740h.close();
        } finally {
            this.f1110v0 = null;
            this.f1111w0 = null;
            AbstractC0322i abstractC0322i = this.f1097A0;
            if (abstractC0322i != null) {
                interfaceC0315b.mo918d(abstractC0322i);
                this.f1097A0 = null;
            }
        }
    }

    @Override // p1142z3.InterfaceC21740h
    public final Uri getUri() {
        return this.f1108t0;
    }

    @Override // p1142z3.InterfaceC21740h
    /* JADX INFO: renamed from: h */
    public final Map mo929h() {
        return !(this.f1111w0 == this.f1102Z) ? this.f1104p0.mo929h() : Collections.emptyMap();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x012f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0131  */
    /* JADX WARN: Code duplicated, block: B:69:0x0134  */
    /* JADX WARN: Code duplicated, block: B:71:0x0142  */
    /* JADX WARN: Code duplicated, block: B:72:0x0145  */
    /* JADX WARN: Code duplicated, block: B:75:0x014a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0159  */
    /* JADX WARN: Code duplicated, block: B:79:0x0164  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: l */
    public final void m930l(C21743k c21743k, boolean z6) throws InterruptedIOException {
        AbstractC0322i abstractC0322iMo923i;
        InterfaceC21740h interfaceC21740h;
        InterfaceC0315b interfaceC0315b;
        InterfaceC21740h interfaceC21740h2;
        C21743k c21743kM22239a;
        InterfaceC0315b interfaceC0315b2;
        InterfaceC21740h interfaceC21740h3;
        long jMo926a;
        C0320g c0320g;
        InterfaceC21740h interfaceC21740h4;
        boolean z10;
        Uri uri;
        Uri uri2;
        boolean z11;
        String str = c21743k.f68981h;
        int i10 = AbstractC20817s.f66106a;
        if (this.f1099C0) {
            abstractC0322iMo923i = null;
        } else if (this.f1105q0) {
            try {
                abstractC0322iMo923i = this.f1101Y.mo923i(this.f1113y0, this.f1114z0, str);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            abstractC0322iMo923i = this.f1101Y.mo917c(this.f1113y0, this.f1114z0, str);
        }
        C21729B c21729b = this.f1103o0;
        InterfaceC21740h interfaceC21740h5 = this.f1102Z;
        InterfaceC0315b interfaceC0315b3 = this.f1101Y;
        InterfaceC21740h interfaceC21740h6 = this.f1104p0;
        if (abstractC0322iMo923i == null) {
            C21742j c21742jM22240a = c21743k.m22240a();
            c21742jM22240a.f68969f = this.f1113y0;
            c21742jM22240a.f68970g = this.f1114z0;
            c21743kM22239a = c21742jM22240a.m22239a();
            interfaceC21740h = interfaceC21740h5;
            interfaceC0315b2 = interfaceC0315b3;
            interfaceC21740h2 = interfaceC21740h6;
        } else {
            boolean z12 = abstractC0322iMo923i.f1124p0;
            long jMin = abstractC0322iMo923i.f1123o0;
            if (z12) {
                Uri uriFromFile = Uri.fromFile(abstractC0322iMo923i.f1125q0);
                long j10 = this.f1113y0;
                interfaceC21740h2 = interfaceC21740h6;
                long j11 = abstractC0322iMo923i.f1122Z;
                long j12 = j10 - j11;
                long jMin2 = jMin - j12;
                interfaceC21740h = interfaceC21740h5;
                interfaceC0315b = interfaceC0315b3;
                long j13 = this.f1114z0;
                if (j13 != -1) {
                    jMin2 = Math.min(jMin2, j13);
                }
                C21742j c21742jM22240a2 = c21743k.m22240a();
                c21742jM22240a2.f68964a = uriFromFile;
                c21742jM22240a2.f68965b = j11;
                c21742jM22240a2.f68969f = j12;
                c21742jM22240a2.f68970g = jMin2;
                c21743kM22239a = c21742jM22240a2.m22239a();
                interfaceC21740h6 = interfaceC21740h;
            } else {
                interfaceC21740h = interfaceC21740h5;
                interfaceC0315b = interfaceC0315b3;
                interfaceC21740h2 = interfaceC21740h6;
                if (jMin == -1) {
                    jMin = this.f1114z0;
                } else {
                    long j14 = this.f1114z0;
                    if (j14 != -1) {
                        jMin = Math.min(jMin, j14);
                    }
                }
                C21742j c21742jM22240a3 = c21743k.m22240a();
                c21742jM22240a3.f68969f = this.f1113y0;
                c21742jM22240a3.f68970g = jMin;
                c21743kM22239a = c21742jM22240a3.m22239a();
                if (c21729b != null) {
                    interfaceC21740h6 = c21729b;
                } else {
                    interfaceC0315b2 = interfaceC0315b;
                    interfaceC0315b2.mo918d(abstractC0322iMo923i);
                    interfaceC21740h6 = interfaceC21740h2;
                    abstractC0322iMo923i = null;
                }
            }
            interfaceC0315b2 = interfaceC0315b;
        }
        if (!this.f1099C0) {
            interfaceC21740h3 = interfaceC21740h2;
            long j15 = interfaceC21740h6 == interfaceC21740h3 ? this.f1113y0 + 102400 : Long.MAX_VALUE;
            this.f1100D0 = j15;
            if (z6) {
                if (this.f1111w0 == interfaceC21740h3) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AbstractC20800b.m21320h(z11);
                if (interfaceC21740h6 == interfaceC21740h3) {
                    return;
                }
                try {
                    m928g();
                } catch (Throwable th2) {
                    if (abstractC0322iMo923i.f1124p0) {
                        throw th2;
                    }
                    interfaceC0315b2.mo918d(abstractC0322iMo923i);
                    throw th2;
                }
            }
            if (abstractC0322iMo923i != null && !abstractC0322iMo923i.f1124p0) {
                this.f1097A0 = abstractC0322iMo923i;
            }
            this.f1111w0 = interfaceC21740h6;
            this.f1110v0 = c21743kM22239a;
            this.f1112x0 = 0L;
            jMo926a = interfaceC21740h6.mo926a(c21743kM22239a);
            c0320g = new C0320g();
            interfaceC21740h4 = interfaceC21740h6;
            if (c21743kM22239a.f68980g == -1 && jMo926a != -1) {
                this.f1114z0 = jMo926a;
                c0320g.m931a(Long.valueOf(this.f1113y0 + jMo926a), "exo_len");
            }
            if (this.f1111w0 == interfaceC21740h) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                uri = interfaceC21740h4.getUri();
                this.f1108t0 = uri;
                if (c21743k.f68974a.equals(uri)) {
                    uri2 = null;
                } else {
                    uri2 = this.f1108t0;
                }
                if (uri2 == null) {
                    ((ArrayList) c0320g.f1119b).add("exo_redir");
                    ((HashMap) c0320g.f1118a).remove("exo_redir");
                } else {
                    c0320g.m931a(uri2.toString(), "exo_redir");
                }
            }
            if (this.f1111w0 == c21729b) {
                interfaceC0315b2.mo916b(str, c0320g);
            }
        }
        interfaceC21740h3 = interfaceC21740h2;
        this.f1100D0 = j15;
        if (z6) {
            if (this.f1111w0 == interfaceC21740h3) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC20800b.m21320h(z11);
            if (interfaceC21740h6 == interfaceC21740h3) {
                return;
            } else {
                m928g();
            }
        }
        if (abstractC0322iMo923i != null) {
            this.f1097A0 = abstractC0322iMo923i;
        }
        this.f1111w0 = interfaceC21740h6;
        this.f1110v0 = c21743kM22239a;
        this.f1112x0 = 0L;
        jMo926a = interfaceC21740h6.mo926a(c21743kM22239a);
        c0320g = new C0320g();
        interfaceC21740h4 = interfaceC21740h6;
        if (c21743kM22239a.f68980g == -1) {
            this.f1114z0 = jMo926a;
            c0320g.m931a(Long.valueOf(this.f1113y0 + jMo926a), "exo_len");
        }
        if (this.f1111w0 == interfaceC21740h) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            uri = interfaceC21740h4.getUri();
            this.f1108t0 = uri;
            if (c21743k.f68974a.equals(uri)) {
                uri2 = this.f1108t0;
            } else {
                uri2 = null;
            }
            if (uri2 == null) {
                ((ArrayList) c0320g.f1119b).add("exo_redir");
                ((HashMap) c0320g.f1118a).remove("exo_redir");
            } else {
                c0320g.m931a(uri2.toString(), "exo_redir");
            }
        }
        if (this.f1111w0 == c21729b) {
            interfaceC0315b2.mo916b(str, c0320g);
        }
    }

    @Override // p1016t3.InterfaceC19782i
    public final int read(byte[] bArr, int i10, int i11) {
        int i12;
        InterfaceC21740h interfaceC21740h = this.f1102Z;
        if (i11 == 0) {
            return 0;
        }
        if (this.f1114z0 == 0) {
            return -1;
        }
        C21743k c21743k = this.f1109u0;
        c21743k.getClass();
        C21743k c21743k2 = this.f1110v0;
        c21743k2.getClass();
        try {
            if (this.f1113y0 >= this.f1100D0) {
                m930l(c21743k, true);
            }
            InterfaceC21740h interfaceC21740h2 = this.f1111w0;
            interfaceC21740h2.getClass();
            int i13 = interfaceC21740h2.read(bArr, i10, i11);
            if (i13 != -1) {
                long j10 = i13;
                this.f1113y0 += j10;
                this.f1112x0 += j10;
                long j11 = this.f1114z0;
                if (j11 != -1) {
                    this.f1114z0 = j11 - j10;
                }
                return i13;
            }
            InterfaceC21740h interfaceC21740h3 = this.f1111w0;
            if (interfaceC21740h3 == interfaceC21740h) {
                i12 = i13;
            } else {
                i12 = i13;
                long j12 = c21743k2.f68980g;
                if (j12 == -1 || this.f1112x0 < j12) {
                    String str = c21743k.f68981h;
                    int i14 = AbstractC20817s.f66106a;
                    this.f1114z0 = 0L;
                    if (!(interfaceC21740h3 == this.f1103o0)) {
                        return i12;
                    }
                    C0320g c0320g = new C0320g();
                    c0320g.m931a(Long.valueOf(this.f1113y0), "exo_len");
                    this.f1101Y.mo916b(str, c0320g);
                    return i12;
                }
            }
            long j13 = this.f1114z0;
            if (j13 <= 0 && j13 != -1) {
                return i12;
            }
            m928g();
            m930l(c21743k, false);
            return read(bArr, i10, i11);
        } catch (Throwable th2) {
            if (this.f1111w0 == interfaceC21740h || (th2 instanceof C0314a)) {
                this.f1098B0 = true;
            }
            throw th2;
        }
    }

    @Override // p1142z3.InterfaceC21740h
    /* JADX INFO: renamed from: a */
    public final long mo926a(C21743k c21743k) {
        InterfaceC0315b interfaceC0315b = this.f1101Y;
        try {
            String string = c21743k.f68981h;
            long j10 = c21743k.f68979f;
            if (string == null) {
                string = c21743k.f68974a.toString();
            }
            C21742j c21742jM22240a = c21743k.m22240a();
            c21742jM22240a.f68971h = string;
            C21743k c21743kM22239a = c21742jM22240a.m22239a();
            this.f1109u0 = c21743kM22239a;
            Uri uri = c21743kM22239a.f68974a;
            byte[] bArr = (byte[]) ((C0329p) interfaceC0315b.mo919e(string)).f1146b.get(HJrCuD.ItaT);
            Uri uri2 = null;
            String str = bArr != null ? new String(bArr, AbstractC10531d.f31242c) : null;
            if (str != null) {
                uri2 = Uri.parse(str);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.f1108t0 = uri;
            this.f1113y0 = j10;
            boolean z6 = this.f1106r0;
            long j11 = c21743k.f68980g;
            boolean z10 = (z6 && this.f1098B0) || (this.f1107s0 && j11 == -1);
            this.f1099C0 = z10;
            if (z10) {
                this.f1114z0 = -1L;
            } else {
                long jM523l = AbstractC0168G.m523l(interfaceC0315b.mo919e(string));
                this.f1114z0 = jM523l;
                if (jM523l != -1) {
                    long j12 = jM523l - j10;
                    this.f1114z0 = j12;
                    if (j12 < 0) {
                        throw new C21741i(2008);
                    }
                }
            }
            if (j11 != -1) {
                long j13 = this.f1114z0;
                this.f1114z0 = j13 == -1 ? j11 : Math.min(j13, j11);
            }
            long j14 = this.f1114z0;
            if (j14 > 0 || j14 == -1) {
                m930l(c21743kM22239a, false);
            }
            return j11 != -1 ? j11 : this.f1114z0;
        } catch (Throwable th2) {
            if (this.f1111w0 == this.f1102Z || (th2 instanceof C0314a)) {
                this.f1098B0 = true;
            }
            throw th2;
        }
    }
}
