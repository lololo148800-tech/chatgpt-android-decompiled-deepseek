package p221Ii;

import android.content.Context;
import android.graphics.SurfaceTexture;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p308M6.C5303e;
import p308M6.InterfaceC5300b;
import p375P6.AbstractTextureViewSurfaceTextureListenerC6373j;
import p375P6.C6364a;
import p571X9.AbstractC9141H2;
import p720e6.C13287b;
import p826j6.C16137F;

/* JADX INFO: renamed from: Ii.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C3725d extends AbstractTextureViewSurfaceTextureListenerC6373j {

    /* JADX INFO: renamed from: J0 */
    public Integer f11296J0;

    /* JADX INFO: renamed from: K0 */
    public Integer f11297K0;

    /* JADX INFO: renamed from: L0 */
    public Integer f11298L0;

    /* JADX INFO: renamed from: M0 */
    public InterfaceC5300b f11299M0;

    /* JADX INFO: renamed from: N0 */
    public InterfaceC5300b f11300N0;

    /* JADX INFO: renamed from: O0 */
    public InterfaceC1436k f11301O0;

    /* JADX INFO: renamed from: P0 */
    public InterfaceC1436k f11302P0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f11303Q0;

    /* JADX INFO: renamed from: R0 */
    public boolean f11304R0;

    /* JADX INFO: renamed from: S0 */
    public boolean f11305S0;

    /* JADX INFO: renamed from: T0 */
    public final C3723b f11306T0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3725d(Context context) {
        super(context, null, 0);
        AbstractC16544l.m18094g(context, "context");
        C13287b c13287b = new C13287b(this, 13);
        C3723b c3723b = new C3723b(new C16137F(new C5303e()), new C16137F(new C5303e()));
        this.f11306T0 = c3723b;
        setEGLContextClientVersion(3);
        c3723b.f11284c = c13287b;
        setEGLConfigChooser(new C6364a(this, 8, 16));
        setRenderer(c3723b);
        setOpaque(false);
        setRenderMode(0);
    }

    /* JADX INFO: renamed from: c */
    public final void m4429c() {
        if (this.f11303Q0) {
            return;
        }
        InterfaceC5300b interfaceC5300b = this.f11299M0;
        C3723b c3723b = this.f11306T0;
        if (interfaceC5300b != null) {
            C16137F c16137f = c3723b.f11282a;
            c16137f.getClass();
            c16137f.f50064o0 = interfaceC5300b;
        }
        InterfaceC5300b interfaceC5300b2 = this.f11300N0;
        if (interfaceC5300b2 != null) {
            C16137F c16137f2 = c3723b.f11283b;
            c16137f2.getClass();
            c16137f2.f50064o0 = interfaceC5300b2;
        }
    }

    public final boolean getDebugMode() {
        return this.f11304R0;
    }

    public final Integer getFragmentShaderRawResId() {
        return this.f11298L0;
    }

    public final InterfaceC1436k getOnDrawFrameListener() {
        return this.f11302P0;
    }

    public final InterfaceC1436k getOnViewReadyListener() {
        return this.f11301O0;
    }

    public final InterfaceC5300b getPrepassShaderParams() {
        return this.f11300N0;
    }

    public final Integer getPrepassShaderRawResId() {
        return this.f11297K0;
    }

    public final InterfaceC5300b getShaderParams() {
        return this.f11299M0;
    }

    public final boolean getUpdateContinuously() {
        return this.f11305S0;
    }

    public final Integer getVertexShaderRawResId() {
        return this.f11296J0;
    }

    @Override // p375P6.AbstractTextureViewSurfaceTextureListenerC6373j, android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        AbstractC16544l.m18094g(surface, "surface");
        C3723b c3723b = this.f11306T0;
        c3723b.f11282a.m17697r();
        c3723b.f11283b.m17697r();
        c3723b.m4424e();
        super.onSurfaceTextureDestroyed(surface);
        return true;
    }

    public final void setDebugMode(boolean z6) {
        this.f11304R0 = z6;
        AbstractC9141H2.f27918a = z6;
        if (z6) {
            setDebugFlags(0);
        }
    }

    public final void setFragmentShaderRawResId(Integer num) {
        this.f11303Q0 = true;
        this.f11298L0 = num;
    }

    public final void setOnDrawFrameListener(InterfaceC1436k interfaceC1436k) {
        this.f11302P0 = interfaceC1436k;
    }

    public final void setOnViewReadyListener(InterfaceC1436k interfaceC1436k) {
        this.f11301O0 = interfaceC1436k;
    }

    public final void setPrepassShaderParams(InterfaceC5300b interfaceC5300b) {
        this.f11300N0 = interfaceC5300b;
        m4429c();
    }

    public final void setPrepassShaderRawResId(Integer num) {
        this.f11303Q0 = true;
        this.f11297K0 = num;
    }

    public final void setShaderParams(InterfaceC5300b interfaceC5300b) {
        this.f11299M0 = interfaceC5300b;
        m4429c();
    }

    public final void setUpdateContinuously(boolean z6) {
        if (this.f11305S0 == z6) {
            return;
        }
        this.f11305S0 = z6;
        if (z6) {
            setRenderMode(1);
        } else {
            setRenderMode(0);
        }
    }

    public final void setVertexShaderRawResId(Integer num) {
        this.f11303Q0 = true;
        this.f11296J0 = num;
    }
}
