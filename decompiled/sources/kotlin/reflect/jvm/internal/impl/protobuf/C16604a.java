package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C16604a extends FilterInputStream {

    /* JADX INFO: renamed from: Y */
    public int f52752Y;

    public C16604a(InputStream inputStream, int i10) {
        super(inputStream);
        this.f52752Y = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.f52752Y);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f52752Y <= 0) {
            return -1;
        }
        int i10 = super.read();
        if (i10 >= 0) {
            this.f52752Y--;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        long jSkip = super.skip(Math.min(j10, this.f52752Y));
        if (jSkip >= 0) {
            this.f52752Y = (int) (((long) this.f52752Y) - jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f52752Y;
        if (i12 <= 0) {
            return -1;
        }
        int i13 = super.read(bArr, i10, Math.min(i11, i12));
        if (i13 >= 0) {
            this.f52752Y -= i13;
        }
        return i13;
    }
}
