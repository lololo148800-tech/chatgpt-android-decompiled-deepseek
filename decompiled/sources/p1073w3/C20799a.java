package p1073w3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: w3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C20799a extends OutputStream {

    /* JADX INFO: renamed from: Y */
    public final FileOutputStream f66062Y;

    /* JADX INFO: renamed from: Z */
    public boolean f66063Z = false;

    public C20799a(File file) {
        this.f66062Y = new FileOutputStream(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f66062Y;
        if (this.f66063Z) {
            return;
        }
        this.f66063Z = true;
        flush();
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException e10) {
            AbstractC20800b.m21333u("AtomicFile", "Failed to sync file descriptor:", e10);
        }
        fileOutputStream.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f66062Y.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        this.f66062Y.write(i10);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f66062Y.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f66062Y.write(bArr, i10, i11);
    }
}
