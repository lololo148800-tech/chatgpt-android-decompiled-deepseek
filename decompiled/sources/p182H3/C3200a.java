package p182H3;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import p1073w3.AbstractC20817s;
import p329N3.C5621k;
import p658b5.C11242m;

/* JADX INFO: renamed from: H3.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3200a implements MediaCodec.OnFrameRenderedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9654a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C5621k f9655b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC3210k f9656c;

    public /* synthetic */ C3200a(InterfaceC3210k interfaceC3210k, C5621k c5621k, int i10) {
        this.f9654a = i10;
        this.f9656c = interfaceC3210k;
        this.f9655b = c5621k;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        switch (this.f9654a) {
            case 0:
                ((C3202c) this.f9656c).getClass();
                C5621k c5621k = this.f9655b;
                c5621k.getClass();
                if (AbstractC20817s.f66106a >= 30) {
                    c5621k.m6010a(j10);
                } else {
                    Handler handler = (Handler) c5621k.f18204Z;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j10 >> 32), (int) j10));
                }
                break;
            default:
                ((C11242m) this.f9656c).getClass();
                C5621k c5621k2 = this.f9655b;
                c5621k2.getClass();
                if (AbstractC20817s.f66106a >= 30) {
                    c5621k2.m6010a(j10);
                } else {
                    Handler handler2 = (Handler) c5621k2.f18204Z;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j10 >> 32), (int) j10));
                }
                break;
        }
    }
}
