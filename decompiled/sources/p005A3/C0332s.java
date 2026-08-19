package p005A3;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import p1073w3.AbstractC20800b;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: A3.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0332s extends BufferedOutputStream {

    /* JADX INFO: renamed from: Y */
    public boolean f1149Y;

    /* JADX INFO: renamed from: a */
    public final void m969a(OutputStream outputStream) {
        AbstractC20800b.m21320h(this.f1149Y);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f1149Y = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f1149Y = true;
        flush();
        th = null;
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th == null) {
            return;
        }
        int i10 = AbstractC20817s.f66106a;
        throw th;
    }
}
