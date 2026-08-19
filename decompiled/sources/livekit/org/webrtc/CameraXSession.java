package livekit.org.webrtc;

import android.content.Context;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.os.Trace;
import android.util.Range;
import android.view.Surface;
import androidx.fragment.app.OwC.wNrQXvwLiB;
import androidx.lifecycle.InterfaceC11112u;
import com.auth0.android.provider.lcl.qffLJgOYizGmMj;
import com.statsig.androidsdk.ErrorBoundaryKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p001A.RunnableC0066i;
import p011A9.p012Ra.ahZQMZ;
import p049Bm.InterfaceC1436k;
import p079D.C1761a;
import p1009s9.C19506i;
import p155G.C2952d;
import p155G.C2953e;
import p178H.AbstractC3166q0;
import p178H.AbstractC3174u0;
import p178H.C3112E;
import p178H.C3142e0;
import p178H.C3163p;
import p178H.C3169s;
import p178H.C3170s0;
import p178H.InterfaceC3140d0;
import p178H.InterfaceC3153k;
import p178H.InterfaceC3161o;
import p228J.AbstractC3817T;
import p228J.C3814P;
import p228J.C3825a0;
import p228J.C3828c;
import p228J.C3830d;
import p228J.C3835f0;
import p228J.InterfaceC3818U;
import p228J.InterfaceC3866v;
import p228J.InterfaceC3870x;
import p301M.RunnableC5220b;
import p523V9.AbstractC7877E4;
import p536W.C8408d;
import p544W9.AbstractC8447A3;
import p588Y2.C9642z;
import p594Y9.AbstractC9900h3;
import p720e6.C13288c;
import p747fb.InterfaceFutureC13608b;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17682p;
import p913o2.AbstractC17803d;
import tm.InterfaceC20006a;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18066d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 [2\u00020\u0001:\u0003[\\]Bc\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010\u0019J\u0017\u0010!\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0017H\u0002¢\u0006\u0004\b#\u0010\u0019J\u0017\u0010&\u001a\u00020\u00172\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00172\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\u0017H\u0002¢\u0006\u0004\b)\u0010\u0019J\u000f\u0010*\u001a\u00020\u000eH\u0002¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00101R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00102R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00102R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00102R\u001c\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?R(\u0010%\u001a\u0004\u0018\u00010@2\b\u0010A\u001a\u0004\u0018\u00010@8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b%\u0010B\u001a\u0004\bC\u0010DR\u0018\u0010F\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u00102R\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010KR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u00102R\u0018\u0010R\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010U\u001a\u00020T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\"\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020X\u0012\u0004\u0012\u00020\u00170W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010Z¨\u0006^"}, m18067d2 = {"Llivekit/org/webrtc/CameraXSession;", "Llivekit/org/webrtc/CameraSession;", "Llivekit/org/webrtc/CameraSession$CreateSessionCallback;", "sessionCallback", "Llivekit/org/webrtc/CameraSession$Events;", "events", "Landroid/content/Context;", "context", "Landroidx/lifecycle/u;", "lifecycleOwner", "Llivekit/org/webrtc/SurfaceTextureHelper;", "surfaceTextureHelper", "", "cameraId", "", "width", "height", "frameRate", "", "LH/u0;", "useCases", "<init>", "(Llivekit/org/webrtc/CameraSession$CreateSessionCallback;Llivekit/org/webrtc/CameraSession$Events;Landroid/content/Context;Landroidx/lifecycle/u;Llivekit/org/webrtc/SurfaceTextureHelper;Ljava/lang/String;III[LH/u0;)V", "Lmm/C;", "stop", "()V", "start", "openCamera", "LH/E;", "setImageAnalysis", "()LH/E;", "stopInternal", "error", "reportError", "(Ljava/lang/String;)V", "obtainCameraConfiguration", "LG/d;", "camera", "findCaptureFormat", "(LG/d;)V", "findStabilizationMode", "checkIsOnCameraThread", "getFrameOrientation", "()I", "Llivekit/org/webrtc/CameraSession$CreateSessionCallback;", "Llivekit/org/webrtc/CameraSession$Events;", "Landroid/content/Context;", "Landroidx/lifecycle/u;", "Llivekit/org/webrtc/SurfaceTextureHelper;", "Ljava/lang/String;", TokenNames.f32012I, "[LH/u0;", "Llivekit/org/webrtc/CameraXSession$SessionState;", "state", "Llivekit/org/webrtc/CameraXSession$SessionState;", "Landroid/os/Handler;", "cameraThreadHandler", "Landroid/os/Handler;", "LW/d;", "cameraProvider", "LW/d;", "LH/d0;", "surfaceProvider", "LH/d0;", "LH/k;", "<set-?>", "LH/k;", "getCamera", "()LH/k;", "Landroid/view/Surface;", "surface", "Landroid/view/Surface;", "cameraOrientation", "", "isCameraFrontFacing", "Z", "firstFrameReported", "", "constructionTimeNs", "J", "fpsUnitFactor", "Llivekit/org/webrtc/CameraEnumerationAndroid$CaptureFormat;", "captureFormat", "Llivekit/org/webrtc/CameraEnumerationAndroid$CaptureFormat;", "Llivekit/org/webrtc/CameraXSession$StabilizationMode;", "stabilizationMode", "Llivekit/org/webrtc/CameraXSession$StabilizationMode;", "Lkotlin/Function1;", "Llivekit/org/webrtc/VideoFrame;", "surfaceTextureListener", "LBm/k;", "Companion", "SessionState", "StabilizationMode", "livekit-android-camerax_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class CameraXSession implements CameraSession {
    private static final String TAG = "CameraXSession";
    private InterfaceC3153k camera;
    private final String cameraId;
    private int cameraOrientation;
    private C8408d cameraProvider;
    private Handler cameraThreadHandler;
    private CameraEnumerationAndroid.CaptureFormat captureFormat;
    private final long constructionTimeNs;
    private final Context context;
    private final CameraSession.Events events;
    private boolean firstFrameReported;
    private int fpsUnitFactor;
    private final int frameRate;
    private final int height;
    private boolean isCameraFrontFacing;
    private final InterfaceC11112u lifecycleOwner;
    private final CameraSession.CreateSessionCallback sessionCallback;
    private StabilizationMode stabilizationMode;
    private SessionState state;
    private Surface surface;
    private InterfaceC3140d0 surfaceProvider;
    private final SurfaceTextureHelper surfaceTextureHelper;
    private InterfaceC1436k surfaceTextureListener;
    private final AbstractC3174u0[] useCases;
    private final int width;
    private static final Histogram cameraXStartTimeMsHistogram = Histogram.createCounts("WebRTC.Android.CameraX.StartTimeMs", 1, ErrorBoundaryKt.SAMPLING_RATE, 50);
    private static final Histogram cameraXStopTimeMsHistogram = Histogram.createCounts("WebRTC.Android.CameraX.StopTimeMs", 1, ErrorBoundaryKt.SAMPLING_RATE, 50);
    private static final Histogram cameraXResolutionHistogram = Histogram.createEnumeration("WebRTC.Android.CameraX.Resolution", CameraEnumerationAndroid.COMMON_RESOLUTIONS.size());

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m18067d2 = {"Llivekit/org/webrtc/CameraXSession$SessionState;", "", "(Ljava/lang/String;I)V", "RUNNING", "STOPPED", "livekit-android-camerax_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public enum SessionState {
        RUNNING,
        STOPPED;

        private static final /* synthetic */ InterfaceC20006a $ENTRIES = AbstractC7877E4.m8156j(values());

        public static InterfaceC20006a getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m18067d2 = {"Llivekit/org/webrtc/CameraXSession$StabilizationMode;", "", "(Ljava/lang/String;I)V", "OPTICAL", "VIDEO", "NONE", "livekit-android-camerax_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public enum StabilizationMode {
        OPTICAL,
        VIDEO,
        NONE;

        private static final /* synthetic */ InterfaceC20006a $ENTRIES = AbstractC7877E4.m8156j(values());

        public static InterfaceC20006a getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StabilizationMode.values().length];
            try {
                iArr[StabilizationMode.OPTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StabilizationMode.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CameraXSession(CameraSession.CreateSessionCallback sessionCallback, CameraSession.Events events, Context context, InterfaceC11112u lifecycleOwner, SurfaceTextureHelper surfaceTextureHelper, String cameraId, int i10, int i11, int i12, AbstractC3174u0[] useCases) {
        AbstractC16544l.m18094g(sessionCallback, "sessionCallback");
        AbstractC16544l.m18094g(events, "events");
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(lifecycleOwner, "lifecycleOwner");
        AbstractC16544l.m18094g(surfaceTextureHelper, "surfaceTextureHelper");
        AbstractC16544l.m18094g(cameraId, "cameraId");
        AbstractC16544l.m18094g(useCases, "useCases");
        this.sessionCallback = sessionCallback;
        this.events = events;
        this.context = context;
        this.lifecycleOwner = lifecycleOwner;
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.cameraId = cameraId;
        this.width = i10;
        this.height = i11;
        this.frameRate = i12;
        this.useCases = useCases;
        this.state = SessionState.RUNNING;
        Handler handler = surfaceTextureHelper.getHandler();
        AbstractC16544l.m18093f(handler, "getHandler(...)");
        this.cameraThreadHandler = handler;
        this.isCameraFrontFacing = true;
        this.constructionTimeNs = System.nanoTime();
        this.fpsUnitFactor = 1;
        this.stabilizationMode = StabilizationMode.NONE;
        this.surfaceTextureListener = new CameraXSession$surfaceTextureListener$1(this);
        this.cameraThreadHandler.post(new RunnableC17038h(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(CameraXSession this$0) {
        AbstractC16544l.m18094g(this$0, "this$0");
        this$0.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkIsOnCameraThread() {
        if (Thread.currentThread() != this.cameraThreadHandler.getLooper().getThread()) {
            throw new IllegalStateException("Wrong thread");
        }
    }

    private final void findStabilizationMode(C2952d camera) {
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION;
        int[] iArr = (int[]) camera.m3776b(key);
        if (iArr != null && AbstractC17678l.m19300g(iArr, 1)) {
            this.stabilizationMode = StabilizationMode.OPTICAL;
            return;
        }
        int[] iArr2 = (int[]) camera.m3776b(key);
        if (iArr2 == null || !AbstractC17678l.m19300g(iArr2, 1)) {
            return;
        }
        this.stabilizationMode = StabilizationMode.VIDEO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getFrameOrientation() {
        int iM18857b = AbstractC17033c.m18857b(this.context);
        if (!this.isCameraFrontFacing) {
            iM18857b = 360 - iM18857b;
        }
        return (this.cameraOrientation + iM18857b) % 360;
    }

    private final void obtainCameraConfiguration() {
        C8408d c8408d = this.cameraProvider;
        if (c8408d == null) {
            AbstractC16544l.m18103p("cameraProvider");
            throw null;
        }
        Trace.beginSection(AbstractC8447A3.m9053f("CX:getAvailableCameraInfos"));
        try {
            ArrayList arrayList = new ArrayList();
            C3169s c3169s = c8408d.f26143d;
            AbstractC16544l.m18091d(c3169s);
            Iterator it = c3169s.f9523a.m16584l().iterator();
            while (it.hasNext()) {
                InterfaceC3866v interfaceC3866vMo105a = ((InterfaceC3870x) it.next()).mo105a();
                AbstractC16544l.m18093f(interfaceC3866vMo105a, "camera.cameraInfo");
                arrayList.add(interfaceC3866vMo105a);
            }
            Trace.endSection();
            ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(C2952d.m3775a((InterfaceC3866v) it2.next()));
            }
            for (Object obj : arrayList2) {
                if (AbstractC16544l.m18089b(((C2952d) obj).f8834a.f110a, this.cameraId)) {
                    AbstractC16544l.m18093f(obj, "first(...)");
                    C2952d c2952d = (C2952d) obj;
                    Integer num = (Integer) c2952d.m3776b(CameraCharacteristics.SENSOR_ORIENTATION);
                    this.cameraOrientation = num == null ? -1 : num.intValue();
                    Integer num2 = (Integer) c2952d.m3776b(CameraCharacteristics.LENS_FACING);
                    this.isCameraFrontFacing = num2 != null && num2.intValue() == 0;
                    findCaptureFormat(c2952d);
                    findStabilizationMode(c2952d);
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    private final void openCamera() {
        checkIsOnCameraThread();
        Logging.m18742d(TAG, "Opening camera " + this.cameraId);
        this.events.onCameraOpening();
        Context context = this.context;
        C8408d c8408d = C8408d.f26139g;
        RunnableC5220b runnableC5220bM10565b = AbstractC9900h3.m10565b(context);
        Executor executor = new Executor() { // from class: livekit.org.webrtc.e
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                CameraXSession.openCamera$lambda$3(this.f54481Y, runnable);
            }
        };
        runnableC5220bM10565b.mo5766a(new RunnableC0066i(this, runnableC5220bM10565b, executor, 25), executor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openCamera$lambda$12(final CameraXSession this$0, InterfaceFutureC13608b cameraProviderFuture, final Executor helperExecutor) throws ExecutionException, InterruptedException {
        AbstractC16544l.m18094g(this$0, "this$0");
        AbstractC16544l.m18094g(cameraProviderFuture, "$cameraProviderFuture");
        AbstractC16544l.m18094g(helperExecutor, "$helperExecutor");
        Object obj = cameraProviderFuture.get();
        AbstractC16544l.m18093f(obj, "get(...)");
        this$0.cameraProvider = (C8408d) obj;
        this$0.obtainCameraConfiguration();
        SurfaceTextureHelper surfaceTextureHelper = this$0.surfaceTextureHelper;
        CameraEnumerationAndroid.CaptureFormat captureFormat = this$0.captureFormat;
        surfaceTextureHelper.setTextureSize(captureFormat != null ? captureFormat.width : this$0.width, captureFormat != null ? captureFormat.height : this$0.height);
        this$0.surface = new Surface(this$0.surfaceTextureHelper.getSurfaceTexture());
        this$0.surfaceProvider = new InterfaceC3140d0() { // from class: livekit.org.webrtc.f
            @Override // p178H.InterfaceC3140d0
            /* JADX INFO: renamed from: a */
            public final void mo3482a(C3170s0 c3170s0) {
                CameraXSession.openCamera$lambda$12$lambda$6(this.f54482Y, helperExecutor, c3170s0);
            }
        };
        C3112E imageAnalysis = this$0.setImageAnalysis();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new InterfaceC3161o() { // from class: livekit.org.webrtc.g
            @Override // p178H.InterfaceC3161o
            /* JADX INFO: renamed from: a */
            public final C3830d mo3990a() {
                return InterfaceC3161o.f9508a;
            }

            @Override // p178H.InterfaceC3161o
            /* JADX INFO: renamed from: b */
            public final List mo3991b(List list) {
                return CameraXSession.openCamera$lambda$12$lambda$8(this.f54484b, list);
            }
        });
        try {
            AbstractC17803d.m19557d(this$0.context).execute(new RunnableC0066i(this$0, new C3163p(linkedHashSet), imageAnalysis, 26));
        } catch (Exception e10) {
            this$0.reportError("Failed to open camera: " + e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openCamera$lambda$12$lambda$11(CameraXSession this$0, C3163p cameraSelector, C3112E imageAnalysis) {
        AbstractC16544l.m18094g(this$0, "this$0");
        AbstractC16544l.m18094g(cameraSelector, "$cameraSelector");
        AbstractC16544l.m18094g(imageAnalysis, "$imageAnalysis");
        C3142e0 c3142e0M3778a = new C2953e(2).m3778a();
        InterfaceC3140d0 interfaceC3140d0 = this$0.surfaceProvider;
        if (interfaceC3140d0 == null) {
            AbstractC16544l.m18103p("surfaceProvider");
            throw null;
        }
        c3142e0M3778a.m3983C(interfaceC3140d0);
        C8408d c8408d = this$0.cameraProvider;
        if (c8408d == null) {
            AbstractC16544l.m18103p("cameraProvider");
            throw null;
        }
        c8408d.m8961g();
        C8408d c8408d2 = this$0.cameraProvider;
        if (c8408d2 == null) {
            AbstractC16544l.m18103p("cameraProvider");
            throw null;
        }
        InterfaceC11112u interfaceC11112u = this$0.lifecycleOwner;
        C9642z c9642z = new C9642z(3);
        c9642z.m10200L(imageAnalysis);
        c9642z.m10200L(c3142e0M3778a);
        c9642z.m10201M(this$0.useCases);
        ArrayList arrayList = (ArrayList) c9642z.f29064Z;
        this$0.camera = c8408d2.m8957c(interfaceC11112u, cameraSelector, (AbstractC3174u0[]) arrayList.toArray(new AbstractC3174u0[arrayList.size()]));
        this$0.cameraThreadHandler.post(new RunnableC17038h(this$0, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openCamera$lambda$12$lambda$11$lambda$10(CameraXSession this$0) {
        AbstractC16544l.m18094g(this$0, "this$0");
        this$0.sessionCallback.onDone(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openCamera$lambda$12$lambda$6(CameraXSession this$0, Executor helperExecutor, C3170s0 request) {
        AbstractC16544l.m18094g(this$0, "this$0");
        AbstractC16544l.m18094g(helperExecutor, "$helperExecutor");
        AbstractC16544l.m18094g(request, "request");
        Surface surface = this$0.surface;
        if (surface != null) {
            request.m3999a(surface, helperExecutor, new C1761a(3));
        } else {
            request.m4001c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openCamera$lambda$3(CameraXSession this$0, Runnable runnable) {
        AbstractC16544l.m18094g(this$0, "this$0");
        Handler handler = this$0.surfaceTextureHelper.getHandler();
        if (handler.getLooper().getThread().isAlive()) {
            handler.post(runnable);
        }
    }

    private final void reportError(String error) {
        checkIsOnCameraThread();
        Logging.m18743e(TAG, "Error: " + error);
        boolean z6 = this.camera == null && this.state != SessionState.STOPPED;
        this.state = SessionState.STOPPED;
        stopInternal();
        if (z6) {
            this.sessionCallback.onFailure(CameraSession.FailureType.ERROR, error);
        } else {
            this.events.onCameraError(this, error);
        }
    }

    private final C3112E setImageAnalysis() {
        C19506i c19506i = new C19506i(9, (byte) 0);
        CameraEnumerationAndroid.CaptureFormat captureFormat = this.captureFormat;
        android.util.Size size = new android.util.Size(captureFormat != null ? captureFormat.width : this.width, captureFormat != null ? captureFormat.height : this.height);
        C3828c c3828c = InterfaceC3818U.f11567p;
        C3825a0 c3825a0 = (C3825a0) c19506i.f61960Z;
        c3825a0.m4561x(c3828c, size);
        c3825a0.m4561x(C3814P.f11541Z, 0);
        C13288c c13288c = new C13288c();
        c13288c.f42001Y = c19506i;
        CameraEnumerationAndroid.CaptureFormat captureFormat2 = this.captureFormat;
        if (captureFormat2 != null) {
            c13288c.m14924d0(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(captureFormat2.framerate.min / this.fpsUnitFactor), Integer.valueOf(captureFormat2.framerate.max / this.fpsUnitFactor)));
            c13288c.m14924d0(CaptureRequest.CONTROL_AE_MODE, 1);
            c13288c.m14924d0(CaptureRequest.CONTROL_AE_LOCK, Boolean.FALSE);
            int i10 = WhenMappings.$EnumSwitchMapping$0[this.stabilizationMode.ordinal()];
            if (i10 == 1) {
                c13288c.m14924d0(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                c13288c.m14924d0(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
            } else if (i10 == 2) {
                c13288c.m14924d0(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                c13288c.m14924d0(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 0);
            }
        }
        C3814P c3814p = new C3814P(C3835f0.m4568a(c3825a0));
        AbstractC3817T.m4557e(c3814p);
        return new C3112E(c3814p);
    }

    private final void start() {
        checkIsOnCameraThread();
        Logging.m18742d(TAG, "start");
        this.surfaceTextureHelper.startListening(new C17028a(this.surfaceTextureListener, 2));
        openCamera();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$1(InterfaceC1436k tmp0, VideoFrame videoFrame) {
        AbstractC16544l.m18094g(tmp0, "$tmp0");
        tmp0.invoke(videoFrame);
    }

    private final void stopInternal() {
        Logging.m18742d(TAG, "Stop internal");
        checkIsOnCameraThread();
        this.surfaceTextureHelper.stopListening();
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
            this.surface = null;
        }
        AbstractC17803d.m19557d(this.context).execute(new RunnableC17038h(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stopInternal$lambda$16(CameraXSession this$0) {
        AbstractC16544l.m18094g(this$0, "this$0");
        C8408d c8408d = this$0.cameraProvider;
        if (c8408d == null) {
            AbstractC16544l.m18103p("cameraProvider");
            throw null;
        }
        c8408d.m8961g();
        this$0.cameraThreadHandler.postAtFrontOfQueue(new RunnableC17038h(this$0, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stopInternal$lambda$16$lambda$15(CameraXSession this$0) {
        AbstractC16544l.m18094g(this$0, "this$0");
        this$0.events.onCameraClosed(this$0);
        Logging.m18742d(TAG, "Stop done");
    }

    public final InterfaceC3153k getCamera() {
        return this.camera;
    }

    @Override // livekit.org.webrtc.CameraSession
    public void stop() {
        Logging.m18742d(TAG, "Stop cameraX session on camera " + this.cameraId);
        checkIsOnCameraThread();
        SessionState sessionState = this.state;
        SessionState sessionState2 = SessionState.STOPPED;
        if (sessionState != sessionState2) {
            long jNanoTime = System.nanoTime();
            this.state = sessionState2;
            stopInternal();
            cameraXStopTimeMsHistogram.addSample((int) TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime));
        }
    }

    private final void findCaptureFormat(C2952d camera) {
        Range[] rangeArr = (Range[]) camera.m3776b(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        int fpsUnitFactor = Camera2Enumerator.getFpsUnitFactor(rangeArr);
        this.fpsUnitFactor = fpsUnitFactor;
        List<CameraEnumerationAndroid.CaptureFormat.FramerateRange> listConvertFramerates = Camera2Enumerator.convertFramerates(rangeArr, fpsUnitFactor);
        List<Size> supportedSizes = CameraXEnumerator.INSTANCE.getSupportedSizes(camera);
        String str = ahZQMZ.aJoZcHtoTc;
        Logging.m18742d(str, "Available preview sizes: " + supportedSizes);
        Logging.m18742d(str, qffLJgOYizGmMj.TqnLpBqXdMd + listConvertFramerates);
        if (listConvertFramerates.isEmpty() || supportedSizes.isEmpty()) {
            reportError("No supported capture formats.");
            return;
        }
        CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange = CameraEnumerationAndroid.getClosestSupportedFramerateRange(listConvertFramerates, this.frameRate);
        Size closestSupportedSize = CameraEnumerationAndroid.getClosestSupportedSize(supportedSizes, this.width, this.height);
        CameraEnumerationAndroid.reportCameraResolution(cameraXResolutionHistogram, closestSupportedSize);
        this.captureFormat = new CameraEnumerationAndroid.CaptureFormat(closestSupportedSize.width, closestSupportedSize.height, closestSupportedFramerateRange);
        Logging.m18742d(str, "Using capture format: " + this.captureFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List openCamera$lambda$12$lambda$8(CameraXSession cameraXSession, List cameraInfo) {
        AbstractC16544l.m18094g(cameraXSession, wNrQXvwLiB.dZI);
        AbstractC16544l.m18094g(cameraInfo, "cameraInfo");
        ArrayList arrayList = new ArrayList();
        for (Object obj : cameraInfo) {
            if (AbstractC16544l.m18089b(C2952d.m3775a((InterfaceC3866v) obj).f8834a.f110a, cameraXSession.cameraId)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public /* synthetic */ CameraXSession(CameraSession.CreateSessionCallback createSessionCallback, CameraSession.Events events, Context context, InterfaceC11112u interfaceC11112u, SurfaceTextureHelper surfaceTextureHelper, String str, int i10, int i11, int i12, AbstractC3174u0[] abstractC3174u0Arr, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(createSessionCallback, events, context, interfaceC11112u, surfaceTextureHelper, str, i10, i11, i12, (i13 & 512) != 0 ? new AbstractC3174u0[0] : abstractC3174u0Arr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openCamera$lambda$12$lambda$6$lambda$5$lambda$4(AbstractC3166q0 abstractC3166q0) {
    }
}
