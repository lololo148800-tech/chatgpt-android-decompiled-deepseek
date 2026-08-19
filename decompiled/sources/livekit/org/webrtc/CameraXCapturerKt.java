package livekit.org.webrtc;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16548p;
import livekit.LivekitInternal$NodeStats;
import p103Dn.InterfaceC2149O0;
import p178H.InterfaceC3153k;
import p594Y9.AbstractC9873d3;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18067d2 = {"Llivekit/org/webrtc/VideoCapturer;", "LDn/O0;", "LH/k;", "getCameraX", "(Llivekit/org/webrtc/VideoCapturer;)LDn/O0;", "livekit-android-camerax_release"}, m18068k = 2, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CameraXCapturerKt {
    public static final InterfaceC2149O0 getCameraX(VideoCapturer videoCapturer) {
        AbstractC16544l.m18094g(videoCapturer, "<this>");
        if (videoCapturer instanceof CameraXCapturerWithSize) {
            videoCapturer = ((CameraXCapturerWithSize) videoCapturer).getCapturer();
        }
        if (videoCapturer instanceof CameraXCapturer) {
            return AbstractC9873d3.m10529c(new AbstractC16548p(videoCapturer) { // from class: livekit.org.webrtc.CameraXCapturerKt.getCameraX.1
                @Override // p225Im.InterfaceC3771s
                public Object get() {
                    return ((CameraXCapturer) this.receiver).getCurrentCamera();
                }

                public void set(Object obj) {
                    ((CameraXCapturer) this.receiver).setCurrentCamera((InterfaceC3153k) obj);
                }
            });
        }
        return null;
    }
}
