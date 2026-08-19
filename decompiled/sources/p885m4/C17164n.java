package p885m4;

import android.util.SparseArray;
import bb.AbstractC11278C;
import bb.C11276A;
import bb.C11294T;
import fo.C13711h;
import java.util.List;
import p372P3.C6337s;
import p372P3.InterfaceC6333o;
import p372P3.InterfaceC6334p;
import p372P3.InterfaceC6335q;

/* JADX INFO: renamed from: m4.n */
/* JADX INFO: loaded from: classes.dex */
public final class C17164n implements InterfaceC6333o {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6333o f54836a;

    /* JADX INFO: renamed from: b */
    public final C17155e f54837b;

    /* JADX INFO: renamed from: c */
    public C13711h f54838c;

    public C17164n(InterfaceC6333o interfaceC6333o, C17155e c17155e) {
        this.f54836a = interfaceC6333o;
        this.f54837b = c17155e;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: a */
    public final InterfaceC6333o mo6855a() {
        return this.f54836a;
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: c */
    public final boolean mo6856c(InterfaceC6334p interfaceC6334p) {
        return this.f54836a.mo6856c(interfaceC6334p);
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: f */
    public final void mo6857f(long j10, long j11) {
        C13711h c13711h = this.f54838c;
        if (c13711h != null) {
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = (SparseArray) c13711h.f43261p0;
                if (i10 >= sparseArray.size()) {
                    break;
                }
                InterfaceC17163m interfaceC17163m = ((C17165o) sparseArray.valueAt(i10)).f54845g;
                if (interfaceC17163m != null) {
                    interfaceC17163m.mo3514c();
                }
                i10++;
            }
        }
        this.f54836a.mo6857f(j10, j11);
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
        return this.f54836a.mo6859h(interfaceC6334p, c6337s);
    }

    @Override // p372P3.InterfaceC6333o
    /* JADX INFO: renamed from: i */
    public final void mo6860i(InterfaceC6335q interfaceC6335q) {
        C13711h c13711h = new C13711h(interfaceC6335q, this.f54837b);
        this.f54838c = c13711h;
        this.f54836a.mo6860i(c13711h);
    }

    @Override // p372P3.InterfaceC6333o
    public final void release() {
        this.f54836a.release();
    }
}
