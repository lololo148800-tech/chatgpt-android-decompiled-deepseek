package p351O2;

import io.sentry.instrumentation.file.C15379d;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: O2.p */
/* JADX INFO: loaded from: classes.dex */
public final class C6102p extends OutputStream {

    /* JADX INFO: renamed from: Y */
    public final C15379d f19847Y;

    public C6102p(C15379d c15379d) {
        this.f19847Y = c15379d;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f19847Y.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.f19847Y.write(i10);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] b) {
        AbstractC16544l.m18094g(b, "b");
        this.f19847Y.write(b);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bytes, int i10, int i11) {
        AbstractC16544l.m18094g(bytes, "bytes");
        this.f19847Y.write(bytes, i10, i11);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
