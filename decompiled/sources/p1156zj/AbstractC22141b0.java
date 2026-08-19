package p1156zj;

import com.withpersona.sdk2.inquiry.governmentid.capture_tips.CaptureTipsViewModel;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureConfig;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mk.C17280a;
import p006A4.C0350k;
import p042Bf.C1268j;
import p045Bj.C1311i;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p149Fj.EnumC2883q;
import p949pj.C18433F;
import p993rj.C19026F;
import tj.EnumC19999a;

/* JADX INFO: renamed from: zj.b0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC22141b0 {
    /* JADX INFO: renamed from: a */
    public static C22172l1 m22376a(C22195t0 renderProps, String str, String message, EnumC22169k1 captureButtonState, AbstractC22196t1 overlay, EnumC2883q idClass, EnumC22128V0 captureSide, C17280a navigationState, InterfaceC1439n interfaceC1439n, InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, boolean z6, List autoCaptureRules, AbstractC22180o0 state, int i10, C18433F cameraXControllerFactory, C19026F camera2ManagerFactoryFactory, C0350k c0350k, InterfaceC1436k interfaceC1436k, C1311i c1311i, EnumC19999a enumC19999a, boolean z10, boolean z11, C1268j c1268j, InterfaceC1426a interfaceC1426a3, InterfaceC1426a interfaceC1426a4, int i11, String str2, CaptureTipsViewModel captureTipsViewModel, int i12) {
        InterfaceC1439n manuallyCapture = (i12 & 256) != 0 ? C22135Z.f69973Z : interfaceC1439n;
        InterfaceC1439n autoCapture = (131072 & i12) != 0 ? C22135Z.f69974o0 : c0350k;
        boolean z12 = (2097152 & i12) != 0;
        boolean z13 = (4194304 & i12) != 0 ? false : z10;
        boolean z14 = (8388608 & i12) != 0 ? false : z11;
        InterfaceC1439n onLocalVideoFinalized = (16777216 & i12) != 0 ? C22135Z.f69975p0 : c1268j;
        InterfaceC1426a manualCaptureClicked = (33554432 & i12) != 0 ? C22138a0.f69982Z : interfaceC1426a3;
        int i13 = (134217728 & i12) != 0 ? renderProps.f70346l : i11;
        String str3 = (268435456 & i12) != 0 ? null : str2;
        CaptureTipsViewModel captureTipsViewModel2 = (i12 & 536870912) != 0 ? null : captureTipsViewModel;
        AbstractC16544l.m18094g(renderProps, "renderProps");
        AbstractC16544l.m18094g(message, "message");
        AbstractC16544l.m18094g(captureButtonState, "captureButtonState");
        AbstractC16544l.m18094g(overlay, "overlay");
        AbstractC16544l.m18094g(idClass, "idClass");
        AbstractC16544l.m18094g(captureSide, "captureSide");
        AbstractC16544l.m18094g(navigationState, "navigationState");
        AbstractC16544l.m18094g(manuallyCapture, "manuallyCapture");
        AbstractC16544l.m18094g(autoCaptureRules, "autoCaptureRules");
        AbstractC16544l.m18094g(state, "state");
        AbstractC16544l.m18094g(cameraXControllerFactory, "cameraXControllerFactory");
        AbstractC16544l.m18094g(camera2ManagerFactoryFactory, "camera2ManagerFactoryFactory");
        AbstractC16544l.m18094g(autoCapture, "autoCapture");
        AbstractC16544l.m18094g(onLocalVideoFinalized, "onLocalVideoFinalized");
        AbstractC16544l.m18094g(manualCaptureClicked, "manualCaptureClicked");
        String str4 = renderProps.f70345k.f70299i;
        VideoCaptureConfig videoCaptureConfig = renderProps.f70351q;
        return new C22172l1(str, message, str4, captureButtonState, overlay, idClass, captureSide, navigationState, manuallyCapture, interfaceC1426a, interfaceC1426a2, z6, autoCaptureRules, state, i10, renderProps.f70344j, autoCapture, interfaceC1436k, c1311i, i13, manualCaptureClicked, interfaceC1426a4, enumC19999a, z14, onLocalVideoFinalized, z12, videoCaptureConfig.f40638a, z13, str3, captureTipsViewModel2, renderProps.f70352r.getCapturePage(), renderProps.f70353s, videoCaptureConfig.f40642e, cameraXControllerFactory, camera2ManagerFactoryFactory);
    }
}
