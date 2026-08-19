package p387Pl;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16553u;
import livekit.org.webrtc.AudioTrack;
import livekit.org.webrtc.AudioTrackSink;
import livekit.org.webrtc.RtpTransceiver;
import p003A1.C0298w;
import p025An.AbstractC0563B;
import p025An.AbstractC0575H;
import p086D6.C1970n;
import p101Dl.C2100a;
import p101Dl.C2103d;
import p101Dl.InterfaceC2110k;
import p103Dn.AbstractC2124C;
import p103Dn.C2133G0;
import p103Dn.C2207t0;
import p153Fn.C2925c;
import p225Im.InterfaceC3776x;
import p533Vl.C8399k;
import p594Y9.AbstractC9873d3;
import p909nm.C17691y;

/* JADX INFO: renamed from: Pl.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C6487g extends AbstractC6479a {

    /* JADX INFO: renamed from: j */
    public final C6488h f21047j;

    /* JADX INFO: renamed from: k */
    public final C2103d f21048k;

    /* JADX INFO: renamed from: l */
    public RtpTransceiver f21049l;

    /* JADX INFO: renamed from: m */
    public final LinkedHashSet f21050m;

    /* JADX INFO: renamed from: n */
    public final C8399k f21051n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ InterfaceC3776x[] f21046o = {AbstractC16526C.f51263a.mo5699h(new C16553u(C6487g.class, "features", "getFeatures()Ljava/util/Set;", 0))};
    public static final C6484d Companion = new C6484d();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6487g(String str, AudioTrack audioTrack, C6488h c6488h, InterfaceC2110k audioProcessingController, AbstractC0563B dispatcher, C2103d audioRecordSamplesDispatcher, C2100a audioBufferCallbackDispatcher) {
        super(str, audioTrack);
        AbstractC16544l.m18094g(audioProcessingController, "audioProcessingController");
        AbstractC16544l.m18094g(dispatcher, "dispatcher");
        AbstractC16544l.m18094g(audioRecordSamplesDispatcher, "audioRecordSamplesDispatcher");
        AbstractC16544l.m18094g(audioBufferCallbackDispatcher, "audioBufferCallbackDispatcher");
        this.f21047j = c6488h;
        this.f21048k = audioRecordSamplesDispatcher;
        C2925c c2925cM1174c = AbstractC0575H.m1174c(dispatcher.plus(AbstractC0575H.m1176e()));
        this.f21050m = new LinkedHashSet();
        this.f21051n = new C8399k(AbstractC2124C.m3198B(new C1970n(new C2207t0(AbstractC9873d3.m10529c(new C0298w(0, 15, InterfaceC2110k.class, audioProcessingController, "capturePostProcessor", "getCapturePostProcessor()Lio/livekit/android/audio/AudioProcessorInterface;")), AbstractC9873d3.m10529c(new C0298w(0, 16, InterfaceC2110k.class, audioProcessingController, "bypassCapturePostProcessing", "getBypassCapturePostProcessing()Z")), new C6485e(3, null), 0), 16, this), c2925cM1174c, C2133G0.f6536a, C17691y.f56482Y));
    }

    @Override // p387Pl.AbstractC6468O
    /* JADX INFO: renamed from: a */
    public final void mo7038a() {
        synchronized (this.f21050m) {
            for (AudioTrackSink audioTrackSink : this.f21050m) {
                this.f21050m.remove(audioTrackSink);
                this.f21048k.m3183a(audioTrackSink);
            }
        }
        super.mo7038a();
    }
}
