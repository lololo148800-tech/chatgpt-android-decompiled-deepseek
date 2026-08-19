package p372P3;

import java.io.EOFException;
import p1016t3.C19788o;
import p1016t3.InterfaceC19782i;
import p1073w3.C20811m;

/* JADX INFO: renamed from: P3.n */
/* JADX INFO: loaded from: classes.dex */
public final class C6332n implements InterfaceC6316H {

    /* JADX INFO: renamed from: a */
    public final byte[] f20559a = new byte[4096];

    @Override // p372P3.InterfaceC6316H
    /* JADX INFO: renamed from: b */
    public final int mo4969b(InterfaceC19782i interfaceC19782i, int i10, boolean z6) throws EOFException {
        byte[] bArr = this.f20559a;
        int i11 = interfaceC19782i.read(bArr, 0, Math.min(bArr.length, i10));
        if (i11 != -1) {
            return i11;
        }
        if (z6) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p372P3.InterfaceC6316H
    /* JADX INFO: renamed from: c */
    public final void mo4970c(int i10, C20811m c20811m) {
        c20811m.m21345G(i10);
    }

    @Override // p372P3.InterfaceC6316H
    /* JADX INFO: renamed from: e */
    public final void mo4972e(C20811m c20811m, int i10, int i11) {
        c20811m.m21345G(i10);
    }

    @Override // p372P3.InterfaceC6316H
    /* JADX INFO: renamed from: f */
    public final int mo4973f(InterfaceC19782i interfaceC19782i, int i10, boolean z6) {
        return mo4969b(interfaceC19782i, i10, z6);
    }

    @Override // p372P3.InterfaceC6316H
    /* JADX INFO: renamed from: d */
    public final void mo4971d(C19788o c19788o) {
    }

    @Override // p372P3.InterfaceC6316H
    /* JADX INFO: renamed from: a */
    public final void mo4968a(long j10, int i10, int i11, int i12, C6315G c6315g) {
    }
}
