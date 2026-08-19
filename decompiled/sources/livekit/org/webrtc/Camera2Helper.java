package livekit.org.webrtc;

import android.hardware.camera2.CameraManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m18067d2 = {"Llivekit/org/webrtc/Camera2Helper;", "", "()V", "Companion", "livekit-android-sdk_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class Camera2Helper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m18066d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ \u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\u000f"}, m18067d2 = {"Llivekit/org/webrtc/Camera2Helper$Companion;", "", "()V", "findClosestCaptureFormat", "Llivekit/org/webrtc/Size;", "cameraManager", "Landroid/hardware/camera2/CameraManager;", "cameraId", "", "width", "", "height", "getSupportedFormats", "", "Llivekit/org/webrtc/CameraEnumerationAndroid$CaptureFormat;", "livekit-android-sdk_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Size findClosestCaptureFormat(CameraManager cameraManager, String cameraId, int width, int height) {
            List arrayList;
            AbstractC16544l.m18094g(cameraManager, "cameraManager");
            List<CameraEnumerationAndroid.CaptureFormat> supportedFormats = getSupportedFormats(cameraManager, cameraId);
            if (supportedFormats != null) {
                List<CameraEnumerationAndroid.CaptureFormat> list = supportedFormats;
                arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
                for (CameraEnumerationAndroid.CaptureFormat captureFormat : list) {
                    arrayList.add(new Size(captureFormat.width, captureFormat.height));
                }
            } else {
                arrayList = C17689w.f56480Y;
            }
            Size closestSupportedSize = CameraEnumerationAndroid.getClosestSupportedSize(arrayList, width, height);
            AbstractC16544l.m18093f(closestSupportedSize, "getClosestSupportedSize(...)");
            return closestSupportedSize;
        }

        public final List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(CameraManager cameraManager, String cameraId) {
            AbstractC16544l.m18094g(cameraManager, "cameraManager");
            return Camera2Enumerator.getSupportedFormats(cameraManager, cameraId);
        }

        private Companion() {
        }
    }
}
