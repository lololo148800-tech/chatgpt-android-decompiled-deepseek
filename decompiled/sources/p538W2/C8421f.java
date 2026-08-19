package p538W2;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: W2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C8421f extends C8417b {
    public C8421f(byte[] bArr) {
        super(bArr);
        this.f26166Y.mark(Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: e */
    public final void m8985e(long j10) throws IOException {
        int i10 = this.f26167Z;
        if (i10 > j10) {
            this.f26167Z = 0;
            this.f26166Y.reset();
        } else {
            j10 -= (long) i10;
        }
        m8974a((int) j10);
    }

    public C8421f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f26166Y.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
