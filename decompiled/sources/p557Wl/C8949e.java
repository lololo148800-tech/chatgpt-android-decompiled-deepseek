package p557Wl;

import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.C16527D;
import kotlin.jvm.internal.C16549q;
import livekit.org.webrtc.ExternalAudioProcessingFactory;
import p003A1.AbstractC0168G;
import p101Dl.C2102c;
import p101Dl.InterfaceC2110k;
import p225Im.InterfaceC3776x;
import p533Vl.C8398j;
import p594Y9.AbstractC9873d3;

/* JADX INFO: renamed from: Wl.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C8949e implements InterfaceC2110k {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ InterfaceC3776x[] f27357f;

    /* JADX INFO: renamed from: a */
    public final ExternalAudioProcessingFactory f27358a = new ExternalAudioProcessingFactory();

    /* JADX INFO: renamed from: b */
    public final C8398j f27359b;

    /* JADX INFO: renamed from: c */
    public final C8398j f27360c;

    /* JADX INFO: renamed from: d */
    public final C8398j f27361d;

    /* JADX INFO: renamed from: e */
    public final C8398j f27362e;

    static {
        C16549q c16549q = new C16549q(C8949e.class, "capturePostProcessor", "getCapturePostProcessor()Lio/livekit/android/audio/AudioProcessorInterface;", 0);
        C16527D c16527d = AbstractC16526C.f51263a;
        f27357f = new InterfaceC3776x[]{c16527d.mo5697f(c16549q), AbstractC0168G.m528q(C8949e.class, "renderPreProcessor", "getRenderPreProcessor()Lio/livekit/android/audio/AudioProcessorInterface;", 0, c16527d), AbstractC0168G.m528q(C8949e.class, "bypassCapturePostProcessing", "getBypassCapturePostProcessing()Z", 0, c16527d), AbstractC0168G.m528q(C8949e.class, "bypassRenderPreProcessing", "getBypassRenderPreProcessing()Z", 0, c16527d)};
    }

    public C8949e(C2102c c2102c) {
        C8398j c8398jM10527a = AbstractC9873d3.m10527a(null, new C8947c(this));
        this.f27359b = c8398jM10527a;
        C8398j c8398jM10527a2 = AbstractC9873d3.m10527a(null, new C8948d(this));
        this.f27360c = c8398jM10527a2;
        Boolean bool = Boolean.FALSE;
        C8398j c8398jM10527a3 = AbstractC9873d3.m10527a(bool, new C8946b(this, 0));
        this.f27361d = c8398jM10527a3;
        C8398j c8398jM10527a4 = AbstractC9873d3.m10527a(bool, new C8946b(this, 1));
        this.f27362e = c8398jM10527a4;
        InterfaceC3776x[] interfaceC3776xArr = f27357f;
        c8398jM10527a.m8944g(c2102c.f6448a, interfaceC3776xArr[0]);
        c8398jM10527a2.m8944g(c2102c.f6450c, interfaceC3776xArr[1]);
        c8398jM10527a3.m8944g(Boolean.valueOf(c2102c.f6449b), interfaceC3776xArr[2]);
        c8398jM10527a4.m8944g(Boolean.valueOf(c2102c.f6451d), interfaceC3776xArr[3]);
    }
}
