package p906nh;

import android.media.MediaRecorder;
import java.io.Closeable;
import java.io.File;
import kotlin.jvm.internal.AbstractC16544l;
import p324Mn.C5551u;

/* JADX INFO: renamed from: nh.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C17626h implements Closeable {

    /* JADX INFO: renamed from: Y */
    public final File f56410Y;

    /* JADX INFO: renamed from: Z */
    public final MediaRecorder f56411Z;

    /* JADX INFO: renamed from: o0 */
    public final C5551u f56412o0;

    /* JADX INFO: renamed from: p0 */
    public final int f56413p0;

    public C17626h(File file, MediaRecorder mediaRecorder, C5551u startTime, int i10) {
        AbstractC16544l.m18094g(startTime, "startTime");
        this.f56410Y = file;
        this.f56411Z = mediaRecorder;
        this.f56412o0 = startTime;
        this.f56413p0 = i10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f56411Z.release();
        this.f56410Y.delete();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17626h)) {
            return false;
        }
        C17626h c17626h = (C17626h) obj;
        return AbstractC16544l.m18089b(this.f56410Y, c17626h.f56410Y) && AbstractC16544l.m18089b(this.f56411Z, c17626h.f56411Z) && AbstractC16544l.m18089b(this.f56412o0, c17626h.f56412o0) && this.f56413p0 == c17626h.f56413p0;
    }

    public final int hashCode() {
        return ((this.f56412o0.f18004Y.hashCode() + ((this.f56411Z.hashCode() + (this.f56410Y.hashCode() * 31)) * 31)) * 31) + this.f56413p0;
    }

    public final String toString() {
        return "█";
    }
}
