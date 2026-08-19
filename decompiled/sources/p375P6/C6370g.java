package p375P6;

import android.util.Log;
import java.io.Writer;
import kotlin.jvm.internal.AbstractC16544l;
import p571X9.AbstractC9141H2;

/* JADX INFO: renamed from: P6.g */
/* JADX INFO: loaded from: classes.dex */
public final class C6370g extends Writer {

    /* JADX INFO: renamed from: Y */
    public final StringBuilder f20742Y = new StringBuilder();

    /* JADX INFO: renamed from: a */
    public final void m6983a() {
        StringBuilder sb2 = this.f20742Y;
        if (sb2.length() > 0) {
            String string = sb2.toString();
            AbstractC16544l.m18093f(string, "mBuilder.toString()");
            if (AbstractC9141H2.f27918a) {
                Log.v("GLTextureView", string);
            }
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m6983a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m6983a();
    }

    @Override // java.io.Writer
    public final void write(char[] buf, int i10, int i11) {
        AbstractC16544l.m18094g(buf, "buf");
        int i12 = 0;
        while (i12 < i11) {
            int i13 = i12 + 1;
            char c9 = buf[i12 + i10];
            if (c9 == '\n') {
                m6983a();
            } else {
                this.f20742Y.append(c9);
            }
            i12 = i13;
        }
    }
}
