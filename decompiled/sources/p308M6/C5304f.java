package p308M6;

import android.gov.nist.core.Separators;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: M6.f */
/* JADX INFO: loaded from: classes.dex */
public final class C5304f {

    /* JADX INFO: renamed from: a */
    public final Surface f17470a;

    /* JADX INFO: renamed from: b */
    public final SurfaceTexture f17471b;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f17472c;

    /* JADX INFO: renamed from: d */
    public final ReentrantLock f17473d;

    public C5304f(Surface surface, SurfaceTexture surfaceTexture) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f17470a = surface;
        this.f17471b = surfaceTexture;
        this.f17472c = atomicBoolean;
        this.f17473d = reentrantLock;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5304f)) {
            return false;
        }
        C5304f c5304f = (C5304f) obj;
        return AbstractC16544l.m18089b(this.f17470a, c5304f.f17470a) && AbstractC16544l.m18089b(this.f17471b, c5304f.f17471b) && AbstractC16544l.m18089b(this.f17472c, c5304f.f17472c) && AbstractC16544l.m18089b(this.f17473d, c5304f.f17473d);
    }

    public final int hashCode() {
        return this.f17473d.hashCode() + ((this.f17472c.hashCode() + ((this.f17471b.hashCode() + (this.f17470a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextureOESParam(surface=" + this.f17470a + ", surfaceTexture=" + this.f17471b + ", updateSurface=" + this.f17472c + ", lock=" + this.f17473d + Separators.RPAREN;
    }
}
