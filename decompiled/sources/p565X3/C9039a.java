package p565X3;

import bb.AbstractC11278C;
import bb.C11276A;
import bb.C11294T;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
import p084D4.C1918i;
import p1016t3.AbstractC19754D;
import p1016t3.C19753C;
import p1016t3.C19755E;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1073w3.AbstractC20800b;
import p1073w3.C20811m;
import p372P3.C6330l;
import p372P3.C6337s;
import p372P3.C6338t;
import p372P3.InterfaceC6316H;
import p372P3.InterfaceC6333o;
import p372P3.InterfaceC6334p;
import p372P3.InterfaceC6335q;
import p718e4.C13281b;
import p824j4.C16116l;
import p885m4.InterfaceC17161k;

/* JADX INFO: renamed from: X3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9039a implements InterfaceC6333o {

    /* JADX INFO: renamed from: b */
    public InterfaceC6335q f27598b;

    /* JADX INFO: renamed from: c */
    public int f27599c;

    /* JADX INFO: renamed from: d */
    public int f27600d;

    /* JADX INFO: renamed from: e */
    public int f27601e;

    /* JADX INFO: renamed from: g */
    public C13281b f27603g;

    /* JADX INFO: renamed from: h */
    public C6330l f27604h;

    /* JADX INFO: renamed from: i */
    public C1918i f27605i;

    /* JADX INFO: renamed from: j */
    public C16116l f27606j;

    /* JADX INFO: renamed from: a */
    public final C20811m f27597a = new C20811m(6);

    /* JADX INFO: renamed from: f */
    public long f27602f = -1;

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: a */
    public final InterfaceC6333o mo6855a() {
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m9606b() {
        InterfaceC6335q interfaceC6335q = this.f27598b;
        interfaceC6335q.getClass();
        interfaceC6335q.mo3061s();
        this.f27598b.mo3045F(new C6338t(-9223372036854775807L));
        this.f27599c = 6;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: c */
    public final boolean mo6856c(InterfaceC6334p interfaceC6334p) throws EOFException, InterruptedIOException {
        C6330l c6330l = (C6330l) interfaceC6334p;
        C20811m c20811m = this.f27597a;
        c20811m.m21341C(2);
        c6330l.mo3047d(c20811m.f66092a, 0, 2, false);
        if (c20811m.m21371z() != 65496) {
            return false;
        }
        c20811m.m21341C(2);
        c6330l.mo3047d(c20811m.f66092a, 0, 2, false);
        int iM21371z = c20811m.m21371z();
        this.f27600d = iM21371z;
        if (iM21371z == 65504) {
            c20811m.m21341C(2);
            c6330l.mo3047d(c20811m.f66092a, 0, 2, false);
            c6330l.m6941g(c20811m.m21371z() - 2, false);
            c20811m.m21341C(2);
            c6330l.mo3047d(c20811m.f66092a, 0, 2, false);
            this.f27600d = c20811m.m21371z();
        }
        if (this.f27600d != 65505) {
            return false;
        }
        c6330l.m6941g(2, false);
        c20811m.m21341C(6);
        c6330l.mo3047d(c20811m.f66092a, 0, 6, false);
        return c20811m.m21367v() == 1165519206 && c20811m.m21371z() == 0;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: f */
    public final void mo6857f(long j10, long j11) {
        if (j10 == 0) {
            this.f27599c = 0;
            this.f27606j = null;
        } else if (this.f27599c == 5) {
            C16116l c16116l = this.f27606j;
            c16116l.getClass();
            c16116l.mo6857f(j10, j11);
        }
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: g */
    public final List mo6858g() {
        C11276A c11276a = AbstractC11278C.f34162Z;
        return C11294T.f34185q0;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x010c  */
    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: h */
    public final int mo6859h(InterfaceC6334p interfaceC6334p, C6337s c6337s) throws C19755E {
        String strM21360o;
        C1918i c1918iM9607a;
        C11294T c11294t;
        int i10;
        C13281b c13281b;
        long j10;
        int i11 = this.f27599c;
        C20811m c20811m = this.f27597a;
        if (i11 == 0) {
            c20811m.m21341C(2);
            ((C6330l) interfaceC6334p).mo3046b(c20811m.f66092a, 0, 2, false);
            int iM21371z = c20811m.m21371z();
            this.f27600d = iM21371z;
            if (iM21371z == 65498) {
                if (this.f27602f != -1) {
                    this.f27599c = 4;
                    return 0;
                }
                m9606b();
                return 0;
            }
            if ((iM21371z >= 65488 && iM21371z <= 65497) || iM21371z == 65281) {
                return 0;
            }
            this.f27599c = 1;
            return 0;
        }
        if (i11 == 1) {
            c20811m.m21341C(2);
            ((C6330l) interfaceC6334p).mo3046b(c20811m.f66092a, 0, 2, false);
            this.f27601e = c20811m.m21371z() - 2;
            this.f27599c = 2;
            return 0;
        }
        if (i11 != 2) {
            if (i11 != 4) {
                if (i11 != 5) {
                    if (i11 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.f27605i == null || interfaceC6334p != this.f27604h) {
                    C6330l c6330l = (C6330l) interfaceC6334p;
                    this.f27604h = c6330l;
                    this.f27605i = new C1918i(c6330l, this.f27602f);
                }
                C16116l c16116l = this.f27606j;
                c16116l.getClass();
                int iMo6859h = c16116l.mo6859h(this.f27605i, c6337s);
                if (iMo6859h == 1) {
                    c6337s.f20561a += this.f27602f;
                }
                return iMo6859h;
            }
            long j11 = ((C6330l) interfaceC6334p).f20548p0;
            long j12 = this.f27602f;
            if (j11 != j12) {
                c6337s.f20561a = j12;
                return 1;
            }
            C6330l c6330l2 = (C6330l) interfaceC6334p;
            if (c6330l2.mo3047d(c20811m.f66092a, 0, 1, true)) {
                c6330l2.f20550r0 = 0;
                if (this.f27606j == null) {
                    this.f27606j = new C16116l(InterfaceC17161k.f54832j0, 8);
                }
                C1918i c1918i = new C1918i(c6330l2, this.f27602f);
                this.f27605i = c1918i;
                if (this.f27606j.mo6856c(c1918i)) {
                    C16116l c16116l2 = this.f27606j;
                    long j13 = this.f27602f;
                    InterfaceC6335q interfaceC6335q = this.f27598b;
                    interfaceC6335q.getClass();
                    c16116l2.mo6860i(new C1918i(j13, interfaceC6335q, 5));
                    C13281b c13281b2 = this.f27603g;
                    c13281b2.getClass();
                    InterfaceC6335q interfaceC6335q2 = this.f27598b;
                    interfaceC6335q2.getClass();
                    InterfaceC6316H interfaceC6316HMo3044D = interfaceC6335q2.mo3044D(1024, 4);
                    C19787n c19787n = new C19787n();
                    c19787n.f62713k = AbstractC19754D.m20711i("image/jpeg");
                    c19787n.f62712j = new C19753C(c13281b2);
                    interfaceC6316HMo3044D.mo4971d(new C19788o(c19787n));
                    this.f27599c = 5;
                } else {
                    m9606b();
                }
            } else {
                m9606b();
            }
            return 0;
        }
        if (this.f27600d == 65505) {
            C20811m c20811m2 = new C20811m(this.f27601e);
            ((C6330l) interfaceC6334p).mo3046b(c20811m2.f66092a, 0, this.f27601e, false);
            if (this.f27603g == null && "http://ns.adobe.com/xap/1.0/".equals(c20811m2.m21360o()) && (strM21360o = c20811m2.m21360o()) != null) {
                long j14 = ((C6330l) interfaceC6334p).f20547o0;
                if (j14 == -1) {
                    c13281b = null;
                } else {
                    try {
                        c1918iM9607a = AbstractC9042d.m9607a(strM21360o);
                    } catch (NumberFormatException | XmlPullParserException | C19755E unused) {
                        AbstractC20800b.m21332t("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        c1918iM9607a = null;
                    }
                    if (c1918iM9607a != null && (i10 = (c11294t = (C11294T) c1918iM9607a.f5613o0).f34187p0) >= 2) {
                        int i12 = i10 - 1;
                        boolean z6 = false;
                        long j15 = -1;
                        long j16 = -1;
                        long j17 = -1;
                        long j18 = -1;
                        while (i12 >= 0) {
                            C9040b c9040b = (C9040b) c11294t.get(i12);
                            boolean zEquals = "video/mp4".equals(c9040b.f27607a) | z6;
                            if (i12 == 0) {
                                j14 -= c9040b.f27609c;
                                j10 = 0;
                            } else {
                                j10 = j14 - c9040b.f27608b;
                            }
                            long j19 = j10;
                            long j20 = j14;
                            j14 = j19;
                            if (zEquals && j14 != j20) {
                                j18 = j20 - j14;
                                j17 = j14;
                                zEquals = false;
                            }
                            if (i12 == 0) {
                                j16 = j20;
                                j15 = j14;
                            }
                            i12--;
                            z6 = zEquals;
                        }
                        if (j17 == -1 || j18 == -1 || j15 == -1 || j16 == -1) {
                            c13281b = null;
                        } else {
                            c13281b = new C13281b(j15, j16, c1918iM9607a.f5612Z, j17, j18);
                        }
                    } else {
                        c13281b = null;
                    }
                }
                this.f27603g = c13281b;
                if (c13281b != null) {
                    this.f27602f = c13281b.f41982p0;
                }
            }
        } else {
            ((C6330l) interfaceC6334p).mo3052j(this.f27601e);
        }
        this.f27599c = 0;
        return 0;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: i */
    public final void mo6860i(InterfaceC6335q interfaceC6335q) {
        this.f27598b = interfaceC6335q;
    }

    @Override // p372P3.InterfaceC6333o
    public final void release() {
        C16116l c16116l = this.f27606j;
        if (c16116l != null) {
            c16116l.getClass();
        }
    }
}
