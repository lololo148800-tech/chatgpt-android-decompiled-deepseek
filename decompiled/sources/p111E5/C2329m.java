package p111E5;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: E5.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2329m extends InputStream {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7234Y;

    /* JADX INFO: renamed from: Z */
    public final InputStream f7235Z;

    /* JADX INFO: renamed from: o0 */
    public int f7236o0 = 1073741824;

    public /* synthetic */ C2329m(InputStream inputStream, int i10) {
        this.f7234Y = i10;
        this.f7235Z = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        switch (this.f7234Y) {
            case 0:
                break;
        }
        return this.f7236o0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f7234Y) {
            case 0:
                this.f7235Z.close();
                break;
            default:
                this.f7235Z.close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f7234Y) {
            case 0:
                int i10 = this.f7235Z.read();
                if (i10 == -1) {
                    this.f7236o0 = 0;
                }
                return i10;
            default:
                int i11 = this.f7235Z.read();
                if (i11 == -1) {
                    this.f7236o0 = 0;
                }
                return i11;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j10) {
        switch (this.f7234Y) {
            case 0:
                break;
        }
        return this.f7235Z.skip(j10);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        switch (this.f7234Y) {
            case 0:
                int i10 = this.f7235Z.read(bArr);
                if (i10 == -1) {
                    this.f7236o0 = 0;
                }
                return i10;
            default:
                int i11 = this.f7235Z.read(bArr);
                if (i11 == -1) {
                    this.f7236o0 = 0;
                }
                return i11;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        switch (this.f7234Y) {
            case 0:
                int i12 = this.f7235Z.read(bArr, i10, i11);
                if (i12 == -1) {
                    this.f7236o0 = 0;
                }
                return i12;
            default:
                int i13 = this.f7235Z.read(bArr, i10, i11);
                if (i13 == -1) {
                    this.f7236o0 = 0;
                }
                return i13;
        }
    }
}
