package p469T3;

import bb.AbstractC11278C;
import bb.C11276A;
import bb.C11294T;
import java.util.List;
import p372P3.C6312D;
import p372P3.C6337s;
import p372P3.InterfaceC6333o;
import p372P3.InterfaceC6334p;
import p372P3.InterfaceC6335q;
import p565X3.C9039a;

/* JADX INFO: renamed from: T3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7235a implements InterfaceC6333o {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f22941a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6333o f22942b;

    public C7235a(int i10, byte b) {
        this.f22941a = i10;
        switch (i10) {
            case 1:
                this.f22942b = new C6312D(35152, 2, "image/png");
                break;
            default:
                this.f22942b = new C6312D(16973, 2, "image/bmp");
                break;
        }
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: a */
    public final InterfaceC6333o mo6855a() {
        int i10 = this.f22941a;
        return this;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: c */
    public final boolean mo6856c(InterfaceC6334p interfaceC6334p) {
        switch (this.f22941a) {
            case 0:
                return ((C6312D) this.f22942b).mo6856c(interfaceC6334p);
            case 1:
                return ((C6312D) this.f22942b).mo6856c(interfaceC6334p);
            default:
                return this.f22942b.mo6856c(interfaceC6334p);
        }
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: f */
    public final void mo6857f(long j10, long j11) {
        switch (this.f22941a) {
            case 0:
                ((C6312D) this.f22942b).mo6857f(j10, j11);
                break;
            case 1:
                ((C6312D) this.f22942b).mo6857f(j10, j11);
                break;
            default:
                this.f22942b.mo6857f(j10, j11);
                break;
        }
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: g */
    public final List mo6858g() {
        switch (this.f22941a) {
            case 0:
                C11276A c11276a = AbstractC11278C.f34162Z;
                break;
            case 1:
                C11276A c11276a2 = AbstractC11278C.f34162Z;
                break;
            default:
                C11276A c11276a3 = AbstractC11278C.f34162Z;
                break;
        }
        return C11294T.f34185q0;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: h */
    public final int mo6859h(InterfaceC6334p interfaceC6334p, C6337s c6337s) {
        switch (this.f22941a) {
            case 0:
                return ((C6312D) this.f22942b).mo6859h(interfaceC6334p, c6337s);
            case 1:
                return ((C6312D) this.f22942b).mo6859h(interfaceC6334p, c6337s);
            default:
                return this.f22942b.mo6859h(interfaceC6334p, c6337s);
        }
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: i */
    public final void mo6860i(InterfaceC6335q interfaceC6335q) {
        switch (this.f22941a) {
            case 0:
                ((C6312D) this.f22942b).mo6860i(interfaceC6335q);
                break;
            case 1:
                ((C6312D) this.f22942b).mo6860i(interfaceC6335q);
                break;
            default:
                this.f22942b.mo6860i(interfaceC6335q);
                break;
        }
    }

    @Override // p372P3.InterfaceC6333o
    public final void release() {
        switch (this.f22941a) {
            case 0:
            case 1:
                break;
            default:
                this.f22942b.release();
                break;
        }
    }

    public C7235a(int i10) {
        this.f22941a = 2;
        if ((i10 & 1) != 0) {
            this.f22942b = new C6312D(65496, 2, "image/jpeg");
        } else {
            this.f22942b = new C9039a();
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m7636b() {
    }

    /* JADX INFO: renamed from: d */
    private final void m7637d() {
    }
}
