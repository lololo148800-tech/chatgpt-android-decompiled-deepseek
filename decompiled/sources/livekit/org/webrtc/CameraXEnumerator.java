package livekit.org.webrtc;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import androidx.lifecycle.InterfaceC11112u;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p155G.C2952d;
import p178H.AbstractC3174u0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18066d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001c\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013¨\u0006\u0015"}, m18067d2 = {"Llivekit/org/webrtc/CameraXEnumerator;", "Llivekit/org/webrtc/Camera2Enumerator;", "Landroid/content/Context;", "context", "Landroidx/lifecycle/u;", "lifecycleOwner", "", "LH/u0;", "useCases", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/u;[LH/u0;)V", "", "deviceName", "Llivekit/org/webrtc/CameraVideoCapturer$CameraEventsHandler;", "eventsHandler", "Llivekit/org/webrtc/CameraVideoCapturer;", "createCapturer", "(Ljava/lang/String;Llivekit/org/webrtc/CameraVideoCapturer$CameraEventsHandler;)Llivekit/org/webrtc/CameraVideoCapturer;", "Landroidx/lifecycle/u;", "[LH/u0;", "Companion", "livekit-android-camerax_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CameraXEnumerator extends Camera2Enumerator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final InterfaceC11112u lifecycleOwner;
    private final AbstractC3174u0[] useCases;

    @Metadata(m18066d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m18067d2 = {"Llivekit/org/webrtc/CameraXEnumerator$Companion;", "", "<init>", "()V", "", "Landroid/util/Size;", "cameraSizes", "", "Llivekit/org/webrtc/Size;", "convertSizes", "([Landroid/util/Size;)Ljava/util/List;", "LG/d;", "camera", "getSupportedSizes", "(LG/d;)Ljava/util/List;", "livekit-android-camerax_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final List<Size> convertSizes(android.util.Size[] cameraSizes) {
            ArrayList arrayList = new ArrayList();
            for (android.util.Size size : cameraSizes) {
                arrayList.add(new Size(size.getWidth(), size.getHeight()));
            }
            return arrayList;
        }

        public final List<Size> getSupportedSizes(C2952d camera) {
            AbstractC16544l.m18094g(camera, "camera");
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) camera.m3776b(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            AbstractC16544l.m18091d(streamConfigurationMap);
            android.util.Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
            AbstractC16544l.m18091d(outputSizes);
            List<Size> listConvertSizes = convertSizes(outputSizes);
            return listConvertSizes;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraXEnumerator(Context context, InterfaceC11112u lifecycleOwner, AbstractC3174u0[] useCases) {
        super(context);
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(lifecycleOwner, "lifecycleOwner");
        AbstractC16544l.m18094g(useCases, "useCases");
        this.lifecycleOwner = lifecycleOwner;
        this.useCases = useCases;
    }

    @Override // livekit.org.webrtc.Camera2Enumerator, livekit.org.webrtc.CameraEnumerator
    public CameraVideoCapturer createCapturer(String deviceName, CameraVideoCapturer.CameraEventsHandler eventsHandler) {
        Context context = this.context;
        AbstractC16544l.m18093f(context, "context");
        return new CameraXCapturer(context, this.lifecycleOwner, deviceName, eventsHandler, this.useCases);
    }

    public /* synthetic */ CameraXEnumerator(Context context, InterfaceC11112u interfaceC11112u, AbstractC3174u0[] abstractC3174u0Arr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, interfaceC11112u, (i10 & 4) != 0 ? new AbstractC3174u0[0] : abstractC3174u0Arr);
    }
}
