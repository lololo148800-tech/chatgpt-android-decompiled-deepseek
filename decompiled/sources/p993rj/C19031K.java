package p993rj;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0564B0;
import p153Fn.C2925c;
import p874lj.C17057a;

/* JADX INFO: renamed from: rj.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C19031K {

    /* JADX INFO: renamed from: j */
    public static final C17057a f60659j = new C17057a(4);

    /* JADX INFO: renamed from: a */
    public final C19032L f60660a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f60661b;

    /* JADX INFO: renamed from: c */
    public final Handler f60662c;

    /* JADX INFO: renamed from: d */
    public final CameraCharacteristics f60663d;

    /* JADX INFO: renamed from: e */
    public final C2925c f60664e = AbstractC0575H.m1174c(AbstractC0593T.f1824a.plus(AbstractC0575H.m1176e()));

    /* JADX INFO: renamed from: f */
    public boolean f60665f;

    /* JADX INFO: renamed from: g */
    public MeteringRectangle f60666g;

    /* JADX INFO: renamed from: h */
    public C0564B0 f60667h;

    /* JADX INFO: renamed from: i */
    public CameraCaptureSession f60668i;

    public C19031K(C19032L c19032l, ArrayList arrayList, Handler handler, CameraCharacteristics cameraCharacteristics) {
        this.f60660a = c19032l;
        this.f60661b = arrayList;
        this.f60662c = handler;
        this.f60663d = cameraCharacteristics;
    }

    /* JADX INFO: renamed from: a */
    public final void m20293a() {
        CameraCaptureSession cameraCaptureSession = this.f60668i;
        if (cameraCaptureSession == null) {
            AbstractC16544l.m18103p(ParameterNames.SESSION);
            throw null;
        }
        C19032L c19032l = this.f60660a;
        C19035O c19035o = c19032l.f60675g;
        CaptureRequest.Builder builderCreateCaptureRequest = cameraCaptureSession.getDevice().createCaptureRequest(1);
        Iterator it = this.f60661b.iterator();
        while (it.hasNext()) {
            builderCreateCaptureRequest.addTarget((Surface) it.next());
        }
        builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, c19032l.f60672d);
        if (c19035o.f60683b && Build.VERSION.SDK_INT >= 33) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
        }
        if (this.f60665f) {
            builderCreateCaptureRequest.set(CaptureRequest.FLASH_MODE, 2);
        }
        MeteringRectangle meteringRectangle = this.f60666g;
        if (meteringRectangle != null) {
            Integer num = (Integer) this.f60663d.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
            if (num == null) {
                num = 0;
            }
            if (num.intValue() >= 1) {
                builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{meteringRectangle});
            }
        }
        CaptureRequest captureRequestBuild = builderCreateCaptureRequest.build();
        AbstractC16544l.m18093f(captureRequestBuild, "build(...)");
        CameraCaptureSession cameraCaptureSession2 = this.f60668i;
        if (cameraCaptureSession2 != null) {
            cameraCaptureSession2.setRepeatingRequest(captureRequestBuild, null, this.f60662c);
        } else {
            AbstractC16544l.m18103p(ParameterNames.SESSION);
            throw null;
        }
    }
}
