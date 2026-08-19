package livekit.org.webrtc;

import android.content.Context;
import androidx.lifecycle.InterfaceC11112u;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16549q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p178H.AbstractC3174u0;
import p178H.InterfaceC3153k;
import p225Im.InterfaceC3776x;
import p533Vl.C8398j;
import p594Y9.AbstractC9873d3;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18066d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJO\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u001c\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001eR5\u0010)\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001f8G@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b!\u0010\"\u0012\u0004\b'\u0010(\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006*"}, m18067d2 = {"Llivekit/org/webrtc/CameraXCapturer;", "Llivekit/org/webrtc/CameraCapturer;", "Landroid/content/Context;", "context", "Landroidx/lifecycle/u;", "lifecycleOwner", "", "cameraName", "Llivekit/org/webrtc/CameraVideoCapturer$CameraEventsHandler;", "eventsHandler", "", "LH/u0;", "useCases", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/u;Ljava/lang/String;Llivekit/org/webrtc/CameraVideoCapturer$CameraEventsHandler;[LH/u0;)V", "Llivekit/org/webrtc/CameraSession$CreateSessionCallback;", "createSessionCallback", "Llivekit/org/webrtc/CameraSession$Events;", "events", "applicationContext", "Llivekit/org/webrtc/SurfaceTextureHelper;", "surfaceTextureHelper", "", "width", "height", "framerate", "Lmm/C;", "createCameraSession", "(Llivekit/org/webrtc/CameraSession$CreateSessionCallback;Llivekit/org/webrtc/CameraSession$Events;Landroid/content/Context;Llivekit/org/webrtc/SurfaceTextureHelper;Ljava/lang/String;III)V", "Landroidx/lifecycle/u;", "[LH/u0;", "LH/k;", "<set-?>", "currentCamera$delegate", "LVl/j;", "getCurrentCamera", "()LH/k;", "setCurrentCamera", "(LH/k;)V", "getCurrentCamera$annotations", "()V", "currentCamera", "livekit-android-camerax_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CameraXCapturer extends CameraCapturer {
    static final /* synthetic */ InterfaceC3776x[] $$delegatedProperties = {AbstractC16526C.f51263a.mo5697f(new C16549q(CameraXCapturer.class, "currentCamera", "getCurrentCamera()Landroidx/camera/core/Camera;", 0))};

    /* JADX INFO: renamed from: currentCamera$delegate, reason: from kotlin metadata */
    private final C8398j currentCamera;
    private final InterfaceC11112u lifecycleOwner;
    private final AbstractC3174u0[] useCases;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraXCapturer(Context context, InterfaceC11112u lifecycleOwner, String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, AbstractC3174u0[] useCases) {
        super(str, cameraEventsHandler, new CameraXEnumerator(context, lifecycleOwner, null, 4, null));
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(lifecycleOwner, "lifecycleOwner");
        AbstractC16544l.m18094g(useCases, "useCases");
        this.lifecycleOwner = lifecycleOwner;
        this.useCases = useCases;
        this.currentCamera = AbstractC9873d3.m10527a(null, null);
    }

    public static /* synthetic */ void getCurrentCamera$annotations() {
    }

    @Override // livekit.org.webrtc.CameraCapturer
    public void createCameraSession(final CameraSession.CreateSessionCallback createSessionCallback, final CameraSession.Events events, Context applicationContext, SurfaceTextureHelper surfaceTextureHelper, String cameraName, int width, int height, int framerate) {
        AbstractC16544l.m18094g(createSessionCallback, "createSessionCallback");
        AbstractC16544l.m18094g(events, "events");
        AbstractC16544l.m18094g(applicationContext, "applicationContext");
        AbstractC16544l.m18094g(surfaceTextureHelper, "surfaceTextureHelper");
        AbstractC16544l.m18094g(cameraName, "cameraName");
        new CameraXSession(new CameraSession.CreateSessionCallback() { // from class: livekit.org.webrtc.CameraXCapturer.createCameraSession.1
            @Override // livekit.org.webrtc.CameraSession.CreateSessionCallback
            public void onDone(CameraSession session) {
                AbstractC16544l.m18094g(session, "session");
                createSessionCallback.onDone(session);
                this.setCurrentCamera(((CameraXSession) session).getCamera());
            }

            @Override // livekit.org.webrtc.CameraSession.CreateSessionCallback
            public void onFailure(CameraSession.FailureType failureType, String error) {
                AbstractC16544l.m18094g(failureType, "failureType");
                AbstractC16544l.m18094g(error, "error");
                createSessionCallback.onFailure(failureType, error);
            }
        }, new CameraSession.Events() { // from class: livekit.org.webrtc.CameraXCapturer.createCameraSession.2
            @Override // livekit.org.webrtc.CameraSession.Events
            public void onCameraClosed(CameraSession session) {
                AbstractC16544l.m18094g(session, "session");
                events.onCameraClosed(session);
            }

            @Override // livekit.org.webrtc.CameraSession.Events
            public void onCameraDisconnected(CameraSession session) {
                AbstractC16544l.m18094g(session, "session");
                events.onCameraDisconnected(session);
            }

            @Override // livekit.org.webrtc.CameraSession.Events
            public void onCameraError(CameraSession session, String error) {
                AbstractC16544l.m18094g(session, "session");
                AbstractC16544l.m18094g(error, "error");
                events.onCameraError(session, error);
            }

            @Override // livekit.org.webrtc.CameraSession.Events
            public void onCameraOpening() {
                events.onCameraOpening();
            }

            @Override // livekit.org.webrtc.CameraSession.Events
            public void onFrameCaptured(CameraSession session, VideoFrame frame) {
                AbstractC16544l.m18094g(session, "session");
                AbstractC16544l.m18094g(frame, "frame");
                events.onFrameCaptured(session, frame);
            }
        }, applicationContext, this.lifecycleOwner, surfaceTextureHelper, cameraName, width, height, framerate, this.useCases);
    }

    public final InterfaceC3153k getCurrentCamera() {
        return (InterfaceC3153k) this.currentCamera.m8943c($$delegatedProperties[0]);
    }

    public final void setCurrentCamera(InterfaceC3153k interfaceC3153k) {
        this.currentCamera.m8944g(interfaceC3153k, $$delegatedProperties[0]);
    }

    public /* synthetic */ CameraXCapturer(Context context, InterfaceC11112u interfaceC11112u, String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, AbstractC3174u0[] abstractC3174u0Arr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, interfaceC11112u, str, cameraEventsHandler, (i10 & 16) != 0 ? new AbstractC3174u0[0] : abstractC3174u0Arr);
    }
}
