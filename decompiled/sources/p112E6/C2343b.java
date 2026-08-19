package p112E6;

import java.io.Closeable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.SurfaceTextureHelper;
import p025An.C0611f0;

/* JADX INFO: renamed from: E6.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2343b implements Closeable {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7271Y = 0;

    /* JADX INFO: renamed from: Z */
    public boolean f7272Z;

    /* JADX INFO: renamed from: o0 */
    public final Object f7273o0;

    public C2343b() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        AbstractC16544l.m18093f(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.f7273o0 = new C0611f0(executorServiceNewSingleThreadExecutor);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f7271Y) {
            case 0:
                if (!this.f7272Z) {
                    ((C0611f0) this.f7273o0).close();
                    this.f7272Z = true;
                }
                break;
            default:
                if (!this.f7272Z) {
                    this.f7272Z = true;
                    SurfaceTextureHelper surfaceTextureHelper = (SurfaceTextureHelper) this.f7273o0;
                    if (surfaceTextureHelper != null) {
                        surfaceTextureHelper.stopListening();
                    }
                    if (surfaceTextureHelper != null) {
                        surfaceTextureHelper.dispose();
                    }
                }
                break;
        }
    }

    public C2343b(SurfaceTextureHelper surfaceTextureHelper) {
        this.f7273o0 = surfaceTextureHelper;
    }
}
