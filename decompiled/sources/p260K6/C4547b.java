package p260K6;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.SurfaceTexture;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p308M6.C5303e;
import p308M6.InterfaceC5300b;
import p331N6.C5676a;
import p375P6.AbstractTextureViewSurfaceTextureListenerC6373j;
import p375P6.C6364a;
import p571X9.AbstractC9141H2;
import p720e6.C13287b;
import p826j6.C16137F;

/* JADX INFO: renamed from: K6.b */
/* JADX INFO: loaded from: classes.dex */
public final class C4547b extends AbstractTextureViewSurfaceTextureListenerC6373j {

    /* JADX INFO: renamed from: J0 */
    public Integer f14856J0;

    /* JADX INFO: renamed from: K0 */
    public Integer f14857K0;

    /* JADX INFO: renamed from: L0 */
    public InterfaceC5300b f14858L0;

    /* JADX INFO: renamed from: M0 */
    public InterfaceC1436k f14859M0;

    /* JADX INFO: renamed from: N0 */
    public InterfaceC1436k f14860N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f14861O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f14862P0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f14863Q0;

    /* JADX INFO: renamed from: R0 */
    public final C5676a f14864R0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4547b(Context context) {
        super(context, null, 0);
        AbstractC16544l.m18094g(context, "context");
        C13287b c13287b = new C13287b(this, 15);
        C5676a c5676a = new C5676a(new C16137F(new C5303e()));
        this.f14864R0 = c5676a;
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(null, AbstractC4546a.f14855a, 0, 0);
        try {
            setFragmentShaderRawResId(Integer.valueOf(typedArrayObtainStyledAttributes.getResourceId(0, R.raw.default_frag)));
            setVertexShaderRawResId(Integer.valueOf(typedArrayObtainStyledAttributes.getResourceId(1, R.raw.quad_vert)));
            typedArrayObtainStyledAttributes.recycle();
            setEGLContextClientVersion(3);
            c5676a.f18433d = c13287b;
            setEGLConfigChooser(new C6364a(this, 8, 16));
            setRenderer(c5676a);
            setOpaque(false);
            setRenderMode(0);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final boolean getDebugMode() {
        return this.f14862P0;
    }

    public final Integer getFragmentShaderRawResId() {
        return this.f14857K0;
    }

    public final InterfaceC1436k getOnDrawFrameListener() {
        return this.f14860N0;
    }

    public final InterfaceC1436k getOnViewReadyListener() {
        return this.f14859M0;
    }

    public final InterfaceC5300b getShaderParams() {
        return this.f14858L0;
    }

    public final boolean getUpdateContinuously() {
        return this.f14863Q0;
    }

    public final Integer getVertexShaderRawResId() {
        return this.f14856J0;
    }

    @Override // p375P6.AbstractTextureViewSurfaceTextureListenerC6373j, android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        AbstractC16544l.m18094g(surface, "surface");
        ((C16137F) this.f14864R0.f18432c).m17697r();
        super.onSurfaceTextureDestroyed(surface);
        return true;
    }

    public final void setDebugMode(boolean z6) {
        this.f14862P0 = z6;
        AbstractC9141H2.f27918a = z6;
        if (z6) {
            setDebugFlags(0);
            setEnableLogPauseResume$lib_release(true);
            setEnableLogEgl$lib_release(true);
            setEnableLogSurface$lib_release(true);
        }
    }

    public final void setFragmentShaderRawResId(Integer num) {
        this.f14861O0 = true;
        this.f14857K0 = num;
    }

    public final void setOnDrawFrameListener(InterfaceC1436k interfaceC1436k) {
        this.f14860N0 = interfaceC1436k;
    }

    public final void setOnViewReadyListener(InterfaceC1436k interfaceC1436k) {
        this.f14859M0 = interfaceC1436k;
    }

    public final void setShaderParams(InterfaceC5300b interfaceC5300b) {
        this.f14858L0 = interfaceC5300b;
        if (this.f14861O0 || interfaceC5300b == null) {
            return;
        }
        C16137F c16137f = (C16137F) this.f14864R0.f18432c;
        c16137f.getClass();
        c16137f.f50064o0 = interfaceC5300b;
    }

    public final void setUpdateContinuously(boolean z6) {
        if (this.f14863Q0 == z6) {
            return;
        }
        this.f14863Q0 = z6;
        if (z6) {
            setRenderMode(1);
        } else {
            setRenderMode(0);
        }
    }

    public final void setVertexShaderRawResId(Integer num) {
        this.f14861O0 = true;
        this.f14856J0 = num;
    }
}
