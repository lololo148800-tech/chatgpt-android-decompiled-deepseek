package p117Eb;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: Eb.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2374d extends FilterInputStream {

    /* JADX INFO: renamed from: Y */
    public long f7388Y;

    /* JADX INFO: renamed from: Z */
    public long f7389Z;

    public C2374d(InputStream inputStream) {
        super(inputStream);
        this.f7389Z = -1L;
        this.f7388Y = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f7388Y);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        ((FilterInputStream) this).in.mark(i10);
        this.f7389Z = this.f7388Y;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f7388Y == 0) {
            return -1;
        }
        int i10 = ((FilterInputStream) this).in.read();
        if (i10 != -1) {
            this.f7388Y--;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f7389Z == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f7388Y = this.f7389Z;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j10, this.f7388Y));
        this.f7388Y -= jSkip;
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        long j10 = this.f7388Y;
        if (j10 == 0) {
            return -1;
        }
        int i12 = ((FilterInputStream) this).in.read(bArr, i10, (int) Math.min(i11, j10));
        if (i12 != -1) {
            this.f7388Y -= (long) i12;
        }
        return i12;
    }
}
