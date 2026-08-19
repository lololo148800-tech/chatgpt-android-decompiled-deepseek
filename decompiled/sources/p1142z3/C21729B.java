package p1142z3;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import p005A3.C0316c;
import p005A3.C0317d;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: z3.B */
/* JADX INFO: loaded from: classes.dex */
public final class C21729B implements InterfaceC21740h {

    /* JADX INFO: renamed from: Y */
    public final InterfaceC21740h f68930Y;

    /* JADX INFO: renamed from: Z */
    public final C0317d f68931Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f68932o0;

    /* JADX INFO: renamed from: p0 */
    public long f68933p0;

    public C21729B(InterfaceC21740h interfaceC21740h, C0317d c0317d) {
        interfaceC21740h.getClass();
        this.f68930Y = interfaceC21740h;
        c0317d.getClass();
        this.f68931Z = c0317d;
    }

    @Override // p1142z3.InterfaceC21740h
    /* JADX INFO: renamed from: a */
    public final long mo926a(C21743k c21743k) throws C0316c {
        C21743k c21743k2 = c21743k;
        long jMo926a = this.f68930Y.mo926a(c21743k2);
        this.f68933p0 = jMo926a;
        if (jMo926a == 0) {
            return 0L;
        }
        long j10 = c21743k2.f68980g;
        if (j10 == -1 && jMo926a != -1 && j10 != jMo926a) {
            c21743k2 = new C21743k(c21743k2.f68974a, c21743k2.f68975b, c21743k2.f68976c, c21743k2.f68977d, c21743k2.f68978e, c21743k2.f68979f, jMo926a, c21743k2.f68981h, c21743k2.f68982i);
        }
        this.f68932o0 = true;
        C0317d c0317d = this.f68931Z;
        c0317d.getClass();
        c21743k2.f68981h.getClass();
        long j11 = c21743k2.f68980g;
        int i10 = c21743k2.f68982i;
        if (j11 == -1 && (i10 & 2) == 2) {
            c0317d.f1090d = null;
        } else {
            c0317d.f1090d = c21743k2;
            c0317d.f1091e = (i10 & 4) == 4 ? c0317d.f1088b : Long.MAX_VALUE;
            c0317d.f1095i = 0L;
            try {
                c0317d.m925b(c21743k2);
            } catch (IOException e10) {
                throw new C0316c(e10);
            }
        }
        return this.f68933p0;
    }

    @Override // p1142z3.InterfaceC21740h
    /* JADX INFO: renamed from: c */
    public final void mo927c(InterfaceC21730C interfaceC21730C) {
        interfaceC21730C.getClass();
        this.f68930Y.mo927c(interfaceC21730C);
    }

    @Override // p1142z3.InterfaceC21740h
    public final void close() throws C0316c {
        C0317d c0317d = this.f68931Z;
        try {
            this.f68930Y.close();
            if (this.f68932o0) {
                this.f68932o0 = false;
                if (c0317d.f1090d == null) {
                    return;
                }
                try {
                    c0317d.m924a();
                } catch (IOException e10) {
                    throw new C0316c(e10);
                }
            }
        } catch (Throwable th2) {
            if (this.f68932o0) {
                this.f68932o0 = false;
                if (c0317d.f1090d != null) {
                    try {
                        c0317d.m924a();
                    } catch (IOException e11) {
                        throw new C0316c(e11);
                    }
                }
            }
            throw th2;
        }
    }

    @Override // p1142z3.InterfaceC21740h
    public final Uri getUri() {
        return this.f68930Y.getUri();
    }

    @Override // p1142z3.InterfaceC21740h
    /* JADX INFO: renamed from: h */
    public final Map mo929h() {
        return this.f68930Y.mo929h();
    }

    @Override // p1016t3.InterfaceC19782i
    public final int read(byte[] bArr, int i10, int i11) throws C0316c {
        if (this.f68933p0 == 0) {
            return -1;
        }
        int i12 = this.f68930Y.read(bArr, i10, i11);
        if (i12 > 0) {
            C0317d c0317d = this.f68931Z;
            C21743k c21743k = c0317d.f1090d;
            if (c21743k != null) {
                int i13 = 0;
                while (i13 < i12) {
                    try {
                        if (c0317d.f1094h == c0317d.f1091e) {
                            c0317d.m924a();
                            c0317d.m925b(c21743k);
                        }
                        int iMin = (int) Math.min(i12 - i13, c0317d.f1091e - c0317d.f1094h);
                        OutputStream outputStream = c0317d.f1093g;
                        int i14 = AbstractC20817s.f66106a;
                        outputStream.write(bArr, i10 + i13, iMin);
                        i13 += iMin;
                        long j10 = iMin;
                        c0317d.f1094h += j10;
                        c0317d.f1095i += j10;
                    } catch (IOException e10) {
                        throw new C0316c(e10);
                    }
                }
            }
            long j11 = this.f68933p0;
            if (j11 != -1) {
                this.f68933p0 = j11 - ((long) i12);
            }
        }
        return i12;
    }
}
