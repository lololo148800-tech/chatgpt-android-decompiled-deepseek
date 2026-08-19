package p182H3;

import android.os.HandlerThread;
import p644ab.InterfaceC10536i;

/* JADX INFO: renamed from: H3.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3201b implements InterfaceC10536i {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9657Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f9658Z;

    public /* synthetic */ C3201b(int i10, int i11) {
        this.f9657Y = i11;
        this.f9658Z = i10;
    }

    @Override // p644ab.InterfaceC10536i
    public final Object get() {
        switch (this.f9657Y) {
            case 0:
                return new HandlerThread(C3202c.m4055d(this.f9658Z, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(C3202c.m4055d(this.f9658Z, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
