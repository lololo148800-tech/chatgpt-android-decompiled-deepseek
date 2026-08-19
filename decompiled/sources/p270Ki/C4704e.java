package p270Ki;

import android.content.Context;
import com.auth0.android.provider.lcl.qffLJgOYizGmMj;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.org.webrtc.EglBase;
import livekit.org.webrtc.GlRectDrawer;
import livekit.org.webrtc.RendererCommon;
import livekit.org.webrtc.ThreadUtils;
import p049Bm.InterfaceC1436k;
import p1160zp.AbstractC22225a;
import p249Jl.SurfaceHolderCallbackC4482b;
import p273Kl.C4727J0;
import p349O0.InterfaceC5985X;
import p387Pl.C6501u;
import p533Vl.AbstractC8396h;
import p533Vl.C8395g;
import p533Vl.EnumC8397i;
import p544W9.AbstractC8553S2;
import p867l8.C16831c;

/* JADX INFO: renamed from: Ki.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C4704e extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C4727J0 f15293Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C6501u f15294Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C4700a f15295o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC5985X f15296p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC5985X f15297q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4704e(C4727J0 c4727j0, C6501u c6501u, C4700a c4700a, InterfaceC5985X interfaceC5985X, InterfaceC5985X interfaceC5985X2) {
        super(1);
        this.f15293Y = c4727j0;
        this.f15294Z = c6501u;
        this.f15295o0 = c4700a;
        this.f15296p0 = interfaceC5985X;
        this.f15297q0 = interfaceC5985X2;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        AbstractC16544l.m18094g(context, qffLJgOYizGmMj.UUdoMbiFVmo);
        SurfaceHolderCallbackC4482b surfaceHolderCallbackC4482b = new SurfaceHolderCallbackC4482b(context);
        EglBase.Context eglBaseContext = this.f15293Y.f15377b.getEglBaseContext();
        int[] iArr = EglBase.CONFIG_PLAIN;
        GlRectDrawer glRectDrawer = new GlRectDrawer();
        ThreadUtils.checkIsOnMainThread();
        if (surfaceHolderCallbackC4482b.f14633w0) {
            C8395g c8395g = AbstractC8396h.Companion;
            EnumC8397i enumC8397i = EnumC8397i.f26119p0;
            AbstractC8396h.Companion.getClass();
            if (enumC8397i.compareTo(AbstractC8396h.f26115a) >= 0 && AbstractC22225a.m22419a() > 0) {
                AbstractC22225a.f70470a.getClass();
                C16831c.m18571j(new Object[0]);
            }
        }
        surfaceHolderCallbackC4482b.f14633w0 = true;
        surfaceHolderCallbackC4482b.f14628r0 = 0;
        surfaceHolderCallbackC4482b.f14629s0 = 0;
        surfaceHolderCallbackC4482b.f14627q0.init(eglBaseContext, surfaceHolderCallbackC4482b, iArr, glRectDrawer);
        surfaceHolderCallbackC4482b.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        surfaceHolderCallbackC4482b.setEnableHardwareScaler(false);
        C6501u c6501u = this.f15294Z;
        InterfaceC5985X interfaceC5985X = this.f15297q0;
        AbstractC8553S2.m9212b(this.f15295o0, this.f15296p0, interfaceC5985X, c6501u, surfaceHolderCallbackC4482b);
        surfaceHolderCallbackC4482b.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL);
        interfaceC5985X.setValue(surfaceHolderCallbackC4482b);
        return surfaceHolderCallbackC4482b;
    }
}
