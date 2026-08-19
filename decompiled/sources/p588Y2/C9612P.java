package p588Y2;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: renamed from: Y2.P */
/* JADX INFO: loaded from: classes.dex */
public final class C9612P extends Writer {

    /* JADX INFO: renamed from: Z */
    public final StringBuilder f28944Z = new StringBuilder(128);

    /* JADX INFO: renamed from: Y */
    public final String f28943Y = "FragmentManager";

    /* JADX INFO: renamed from: a */
    public final void m10154a() {
        StringBuilder sb2 = this.f28944Z;
        if (sb2.length() > 0) {
            Log.d(this.f28943Y, sb2.toString());
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m10154a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m10154a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c9 = cArr[i10 + i12];
            if (c9 == '\n') {
                m10154a();
            } else {
                this.f28944Z.append(c9);
            }
        }
    }
}
