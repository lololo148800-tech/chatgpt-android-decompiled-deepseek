package p538W2;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: renamed from: W2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8416a extends MediaDataSource {

    /* JADX INFO: renamed from: Y */
    public long f26164Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C8421f f26165Z;

    public C8416a(C8421f c8421f) {
        this.f26165Z = c8421f;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j10, byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (j10 < 0) {
            return -1;
        }
        try {
            long j11 = this.f26164Y;
            C8421f c8421f = this.f26165Z;
            if (j11 != j10) {
                if (j11 >= 0 && j10 >= j11 + ((long) c8421f.f26166Y.available())) {
                    return -1;
                }
                c8421f.m8985e(j10);
                this.f26164Y = j10;
            }
            if (i11 > c8421f.f26166Y.available()) {
                i11 = c8421f.f26166Y.available();
            }
            int i12 = c8421f.read(bArr, i10, i11);
            if (i12 >= 0) {
                this.f26164Y += (long) i12;
                return i12;
            }
        } catch (IOException unused) {
        }
        this.f26164Y = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
