package p916o5;

import java.io.EOFException;
import java.io.IOException;
import p026Ao.AbstractC0684r;
import p026Ao.C0675i;
import p026Ao.InterfaceC0661J;

/* JADX INFO: renamed from: o5.i */
/* JADX INFO: loaded from: classes.dex */
public final class C17831i extends AbstractC0684r {

    /* JADX INFO: renamed from: Z */
    public final C17825c f56894Z;

    /* JADX INFO: renamed from: o0 */
    public boolean f56895o0;

    public C17831i(InterfaceC0661J interfaceC0661J, C17825c c17825c) {
        super(interfaceC0661J);
        this.f56894Z = c17825c;
    }

    @Override // p026Ao.AbstractC0684r, p026Ao.InterfaceC0661J, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        try {
            super.close();
        } catch (IOException e10) {
            this.f56895o0 = true;
            this.f56894Z.invoke(e10);
        }
    }

    @Override // p026Ao.AbstractC0684r, p026Ao.InterfaceC0661J, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e10) {
            this.f56895o0 = true;
            this.f56894Z.invoke(e10);
        }
    }

    @Override // p026Ao.AbstractC0684r, p026Ao.InterfaceC0661J
    /* JADX INFO: renamed from: n0 */
    public final void mo1338n0(C0675i c0675i, long j10) throws EOFException {
        if (this.f56895o0) {
            c0675i.skip(j10);
            return;
        }
        try {
            super.mo1338n0(c0675i, j10);
        } catch (IOException e10) {
            this.f56895o0 = true;
            this.f56894Z.invoke(e10);
        }
    }
}
