package p221Ii;

import android.content.Context;
import androidx.lifecycle.AbstractC11105n;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p003A1.C0254h0;
import p049Bm.InterfaceC1436k;
import p308M6.C5299a;
import p308M6.C5303e;
import p308M6.C5305g;
import p308M6.InterfaceC5300b;
import p544W9.AbstractC8748z;
import p960q9.C18655i;

/* JADX INFO: renamed from: Ii.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C3728g extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C3734m f11312Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC11105n f11313Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f11314o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f11315p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ long f11316q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3728g(C3734m c3734m, AbstractC11105n abstractC11105n, boolean z6, boolean z10, long j10) {
        super(1);
        this.f11312Y = c3734m;
        this.f11313Z = abstractC11105n;
        this.f11314o0 = z6;
        this.f11315p0 = z10;
        this.f11316q0 = j10;
    }

    /* JADX INFO: renamed from: a */
    public static final void m4430a(boolean z6, boolean z10, long j10, C18655i c18655i) {
        C18655i.m20021c(c18655i, "time");
        C18655i.m20021c(c18655i, "micLevel");
        C18655i.m20021c(c18655i, "stateListen");
        C18655i.m20021c(c18655i, "listenTimestamp");
        C18655i.m20021c(c18655i, "stateThink");
        C18655i.m20021c(c18655i, "thinkTimestamp");
        C18655i.m20021c(c18655i, "stateSpeak");
        C18655i.m20021c(c18655i, "speakTimestamp");
        C18655i.m20021c(c18655i, "readyTimestamp");
        C18655i.m20021c(c18655i, "stateHalt");
        C18655i.m20021c(c18655i, "haltTimestamp");
        C18655i.m20021c(c18655i, "stateFailedToConnect");
        C18655i.m20021c(c18655i, "failedToConnectTimestamp");
        c18655i.m20026f("avgMag", null);
        c18655i.m20026f("cumulativeAudio", null);
        C18655i.m20021c(c18655i, "touchDownTimestamp");
        C18655i.m20021c(c18655i, "touchUpTimestamp");
        C18655i.m20021c(c18655i, "silenceAmount");
        C18655i.m20021c(c18655i, "silenceTimestamp");
        C5299a c5299a = new C5299a(3, Boolean.valueOf(z6));
        InterfaceC5300b interfaceC5300b = (InterfaceC5300b) c18655i.f59414Z;
        ((C5303e) interfaceC5300b).m5837a("fadeBloopWhileListening", c5299a);
        ((C5303e) interfaceC5300b).m5837a("isNewBloop", new C5299a(3, Boolean.valueOf(z10)));
        c18655i.m20025e("baseColor", AbstractC8748z.m9501b(j10));
        c18655i.m20025e("bloopColorsMain", null);
        c18655i.m20025e("bloopColorsLow", null);
        c18655i.m20025e("bloopColorsMid", null);
        c18655i.m20025e("bloopColorsHigh", null);
        C18655i.m20021c(c18655i, "strawFactor");
        if (z10) {
            ((C5303e) interfaceC5300b).m5837a("noiseTexture", new C5299a(13, new C5305g(Integer.valueOf(R.drawable.noise_watercolor), null, null, true, 33984)));
        }
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        AbstractC16544l.m18094g(context, "context");
        C0254h0 c0254h0 = new C0254h0(this.f11312Y, 27);
        C3725d c3725d = new C3725d(context);
        c3725d.setPrepassShaderRawResId(Integer.valueOf(R.raw.voice_prepass));
        c3725d.setFragmentShaderRawResId(Integer.valueOf(R.raw.voice_main));
        c3725d.setVertexShaderRawResId(Integer.valueOf(R.raw.voice_vert));
        c3725d.setUpdateContinuously(true);
        C18655i c18655i = new C18655i(12);
        boolean z6 = this.f11314o0;
        boolean z10 = this.f11315p0;
        long j10 = this.f11316q0;
        m4430a(z6, z10, j10, c18655i);
        c3725d.setShaderParams((InterfaceC5300b) c18655i.f59414Z);
        C18655i c18655i2 = new C18655i(12);
        m4430a(z6, z10, j10, c18655i2);
        c3725d.setPrepassShaderParams((InterfaceC5300b) c18655i2.f59414Z);
        c3725d.setOnDrawFrameListener(c0254h0);
        this.f11313Z.mo7806a(new C3727f(c3725d, 0));
        return c3725d;
    }
}
