package p372P3;

import bb.AbstractC11278C;
import bb.C11276A;
import bb.C11294T;
import java.util.List;
import p1016t3.AbstractC19754D;
import p1016t3.C19787n;
import p1016t3.C19788o;
import p1073w3.AbstractC20800b;
import p1073w3.C20811m;

/* JADX INFO: renamed from: P3.D */
/* JADX INFO: loaded from: classes.dex */
public final class C6312D implements InterfaceC6333o {

    /* JADX INFO: renamed from: a */
    public final int f20446a;

    /* JADX INFO: renamed from: b */
    public final int f20447b;

    /* JADX INFO: renamed from: c */
    public final String f20448c;

    /* JADX INFO: renamed from: d */
    public int f20449d;

    /* JADX INFO: renamed from: e */
    public int f20450e;

    /* JADX INFO: renamed from: f */
    public InterfaceC6335q f20451f;

    /* JADX INFO: renamed from: g */
    public InterfaceC6316H f20452g;

    public C6312D(int i10, int i11, String str) {
        this.f20446a = i10;
        this.f20447b = i11;
        this.f20448c = str;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: a */
    public final InterfaceC6333o mo6855a() {
        return this;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: c */
    public final boolean mo6856c(InterfaceC6334p interfaceC6334p) {
        int i10 = this.f20447b;
        int i11 = this.f20446a;
        AbstractC20800b.m21320h((i11 == -1 || i10 == -1) ? false : true);
        C20811m c20811m = new C20811m(i10);
        ((C6330l) interfaceC6334p).mo3047d(c20811m.f66092a, 0, i10, false);
        return c20811m.m21371z() == i11;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: f */
    public final void mo6857f(long j10, long j11) {
        if (j10 == 0 || this.f20450e == 1) {
            this.f20450e = 1;
            this.f20449d = 0;
        }
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: g */
    public final List mo6858g() {
        C11276A c11276a = AbstractC11278C.f34162Z;
        return C11294T.f34185q0;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: h */
    public final int mo6859h(InterfaceC6334p interfaceC6334p, C6337s c6337s) {
        int i10 = this.f20450e;
        if (i10 != 1) {
            if (i10 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        InterfaceC6316H interfaceC6316H = this.f20452g;
        interfaceC6316H.getClass();
        int iMo4973f = interfaceC6316H.mo4973f(interfaceC6334p, 1024, true);
        if (iMo4973f == -1) {
            this.f20450e = 2;
            this.f20452g.mo4968a(0L, 1, this.f20449d, 0, null);
            this.f20449d = 0;
        } else {
            this.f20449d += iMo4973f;
        }
        return 0;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: i */
    public final void mo6860i(InterfaceC6335q interfaceC6335q) {
        this.f20451f = interfaceC6335q;
        InterfaceC6316H interfaceC6316HMo3044D = interfaceC6335q.mo3044D(1024, 4);
        this.f20452g = interfaceC6316HMo3044D;
        C19787n c19787n = new C19787n();
        c19787n.f62714l = AbstractC19754D.m20711i(this.f20448c);
        interfaceC6316HMo3044D.mo4971d(new C19788o(c19787n));
        this.f20451f.mo3061s();
        this.f20451f.mo3045F(new C6313E());
        this.f20450e = 1;
    }

    @Override // p372P3.InterfaceC6333o
    public final void release() {
    }
}
