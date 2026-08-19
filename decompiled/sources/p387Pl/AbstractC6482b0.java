package p387Pl;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.org.webrtc.VideoTrack;
import p003A1.C0155B1;
import p249Jl.SurfaceHolderCallbackC4482b;
import p583Xl.AbstractC9537d;

/* JADX INFO: renamed from: Pl.b0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6482b0 extends AbstractC6468O {

    /* JADX INFO: renamed from: i */
    public final VideoTrack f21037i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f21038j;

    public AbstractC6482b0(String str, VideoTrack videoTrack) {
        super(str, EnumC6462I.VIDEO, videoTrack);
        this.f21037i = videoTrack;
        this.f21038j = new ArrayList();
    }

    /* JADX INFO: renamed from: g */
    public void mo7040g(SurfaceHolderCallbackC4482b renderer) {
        AbstractC16544l.m18094g(renderer, "renderer");
        if (m7052d()) {
            return;
        }
        AbstractC9537d.m10030a(new C0155B1(this, this, renderer, 27));
    }

    @Override // p387Pl.AbstractC6468O
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VideoTrack mo7051c() {
        return this.f21037i;
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo7041i(SurfaceHolderCallbackC4482b surfaceHolderCallbackC4482b);
}
