package livekit.org.webrtc;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import androidx.lifecycle.EnumC11104m;
import androidx.lifecycle.InterfaceC11112u;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p178H.AbstractC3174u0;
import p387Pl.C6502v;
import p435Rl.C6924h;
import p435Rl.C6926j;
import p435Rl.InterfaceC6919c;
import p548Wd.p549VF.zakks;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m18067d2 = {"Llivekit/org/webrtc/CameraXHelper;", "", "()V", "Companion", "livekit-android-camerax_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CameraXHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m18066d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m18067d2 = {"Llivekit/org/webrtc/CameraXHelper$Companion;", "", "<init>", "()V", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "", "cameraId", "", "Llivekit/org/webrtc/CameraEnumerationAndroid$CaptureFormat;", "getSupportedFormats", "(Landroid/hardware/camera2/CameraManager;Ljava/lang/String;)Ljava/util/List;", "Landroidx/lifecycle/u;", "lifecycleOwner", "", "LH/u0;", "useCases", "LRl/c;", "createCameraProvider", "(Landroidx/lifecycle/u;[LH/u0;)LRl/c;", "", "width", "height", "Llivekit/org/webrtc/Size;", "findClosestCaptureFormat", "(Landroid/hardware/camera2/CameraManager;Ljava/lang/String;II)Llivekit/org/webrtc/Size;", "livekit-android-camerax_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ InterfaceC6919c createCameraProvider$default(Companion companion, InterfaceC11112u interfaceC11112u, AbstractC3174u0[] abstractC3174u0Arr, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                abstractC3174u0Arr = new AbstractC3174u0[0];
            }
            return companion.createCameraProvider(interfaceC11112u, abstractC3174u0Arr);
        }

        private final List<CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(CameraManager cameraManager, String cameraId) {
            return Camera2Enumerator.getSupportedFormats(cameraManager, cameraId);
        }

        public final InterfaceC6919c createCameraProvider(InterfaceC11112u lifecycleOwner) {
            AbstractC16544l.m18094g(lifecycleOwner, "lifecycleOwner");
            return createCameraProvider$default(this, lifecycleOwner, null, 2, null);
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

        private Companion() {
        }

        public final InterfaceC6919c createCameraProvider(final InterfaceC11112u lifecycleOwner, final AbstractC3174u0[] useCases) {
            AbstractC16544l.m18094g(lifecycleOwner, zakks.DUQvzcIwzDMBRoK);
            AbstractC16544l.m18094g(useCases, "useCases");
            return new InterfaceC6919c() { // from class: livekit.org.webrtc.CameraXHelper$Companion$createCameraProvider$1
                private final int cameraVersion = 3;
                private CameraXEnumerator enumerator;

                @Override // p435Rl.InterfaceC6919c
                public int getCameraVersion() {
                    return this.cameraVersion;
                }

                @Override // p435Rl.InterfaceC6919c
                public boolean isSupported(Context context) {
                    AbstractC16544l.m18094g(context, "context");
                    return Camera2Enumerator.isSupported(context) && lifecycleOwner.mo7809i().mo7807b().compareTo(EnumC11104m.f33475Z) >= 0;
                }

                @Override // p435Rl.InterfaceC6919c
                public VideoCapturer provideCapturer(Context context, C6502v options, C6926j eventsHandler) {
                    AbstractC16544l.m18094g(context, "context");
                    AbstractC16544l.m18094g(options, "options");
                    AbstractC16544l.m18094g(eventsHandler, "eventsHandler");
                    CameraXEnumerator cameraXEnumeratorProvideEnumerator = provideEnumerator(context);
                    ArrayList arrayList = C6924h.f22195a;
                    String strM7310b = C6924h.m7310b(cameraXEnumeratorProvideEnumerator, options.f21098b, options.f21099c, true);
                    CameraVideoCapturer cameraVideoCapturerCreateCapturer = cameraXEnumeratorProvideEnumerator.createCapturer(strM7310b, eventsHandler);
                    AbstractC16544l.m18092e(cameraVideoCapturerCreateCapturer, "null cannot be cast to non-null type livekit.org.webrtc.CameraXCapturer");
                    Object systemService = context.getSystemService("camera");
                    AbstractC16544l.m18092e(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
                    return new CameraXCapturerWithSize((CameraXCapturer) cameraVideoCapturerCreateCapturer, (CameraManager) systemService, strM7310b, eventsHandler);
                }

                @Override // p435Rl.InterfaceC6919c
                public CameraXEnumerator provideEnumerator(Context context) {
                    AbstractC16544l.m18094g(context, "context");
                    CameraXEnumerator cameraXEnumerator = this.enumerator;
                    if (cameraXEnumerator != null) {
                        return cameraXEnumerator;
                    }
                    CameraXEnumerator cameraXEnumerator2 = new CameraXEnumerator(context, lifecycleOwner, useCases);
                    this.enumerator = cameraXEnumerator2;
                    return cameraXEnumerator2;
                }
            };
        }
    }
}
