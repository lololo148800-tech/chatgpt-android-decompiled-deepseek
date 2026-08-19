package coil.compose;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import com.google.accompanist.drawablepainter.DrawablePainter;
import io.ktor.client.plugins.auth.C15058c;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import p007A5.AbstractC0369d;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.C0566C0;
import p049Bm.InterfaceC1436k;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p1075w5.AbstractC20832j;
import p1075w5.C20830h;
import p1075w5.C20831i;
import p1075w5.C20838p;
import p1095x1.C21089j;
import p1095x1.InterfaceC21090k;
import p1144z5.C21798b;
import p1144z5.InterfaceC21802f;
import p153Fn.AbstractC2935m;
import p153Fn.C2925c;
import p201Hn.C3516e;
import p334Na.AbstractC5695b;
import p349O0.C5975S;
import p349O0.C5994b0;
import p349O0.C5997d;
import p349O0.C6002f0;
import p349O0.InterfaceC6034v0;
import p544W9.AbstractC8532O4;
import p759g1.C13803e;
import p774h1.C14351g;
import p774h1.C14356l;
import p821j1.InterfaceC16039d;
import p864l5.C16826m;
import p864l5.InterfaceC16818e;
import p882m1.AbstractC17140a;
import p886m5.AbstractC17167b;
import p886m5.AbstractC17172g;
import p886m5.C17166a;
import p886m5.C17169d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m18067d2 = {"Lcoil/compose/AsyncImagePainter;", "Lm1/a;", "LO0/v0;", "m5/b", "coil-compose-base_release"}, m18068k = 1, m18069mv = {2, 0, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class AsyncImagePainter extends AbstractC17140a implements InterfaceC6034v0 {

    /* JADX INFO: renamed from: G0 */
    public static final C15058c f35871G0 = new C15058c(9);

    /* JADX INFO: renamed from: A0 */
    public InterfaceC21090k f35872A0;

    /* JADX INFO: renamed from: B0 */
    public int f35873B0;

    /* JADX INFO: renamed from: C0 */
    public boolean f35874C0;

    /* JADX INFO: renamed from: D0 */
    public final C6002f0 f35875D0;

    /* JADX INFO: renamed from: E0 */
    public final C6002f0 f35876E0;

    /* JADX INFO: renamed from: F0 */
    public final C6002f0 f35877F0;

    /* JADX INFO: renamed from: r0 */
    public C2925c f35878r0;

    /* JADX INFO: renamed from: s0 */
    public final C2153Q0 f35879s0 = AbstractC2124C.m3204c(new C13803e(0));

    /* JADX INFO: renamed from: t0 */
    public final C6002f0 f35880t0;

    /* JADX INFO: renamed from: u0 */
    public final C5994b0 f35881u0;

    /* JADX INFO: renamed from: v0 */
    public final C6002f0 f35882v0;

    /* JADX INFO: renamed from: w0 */
    public AbstractC17167b f35883w0;

    /* JADX INFO: renamed from: x0 */
    public AbstractC17140a f35884x0;

    /* JADX INFO: renamed from: y0 */
    public InterfaceC1436k f35885y0;

    /* JADX INFO: renamed from: z0 */
    public InterfaceC1436k f35886z0;

    public AsyncImagePainter(C20831i c20831i, InterfaceC16818e interfaceC16818e) {
        C5975S c5975s = C5975S.f19448r0;
        this.f35880t0 = C5997d.m6430Q(null, c5975s);
        this.f35881u0 = C5997d.m6428O(1.0f);
        this.f35882v0 = C5997d.m6430Q(null, c5975s);
        C17166a c17166a = C17166a.f54847a;
        this.f35883w0 = c17166a;
        this.f35885y0 = f35871G0;
        this.f35872A0 = C21089j.f67012o0;
        this.f35873B0 = 1;
        this.f35875D0 = C5997d.m6430Q(c17166a, c5975s);
        this.f35876E0 = C5997d.m6430Q(c20831i, c5975s);
        this.f35877F0 = C5997d.m6430Q(interfaceC16818e, c5975s);
    }

    @Override // p349O0.InterfaceC6034v0
    /* JADX INFO: renamed from: a */
    public final void mo2149a() {
        C2925c c2925c = this.f35878r0;
        if (c2925c != null) {
            AbstractC0575H.m1180i(c2925c, null);
        }
        this.f35878r0 = null;
        Object obj = this.f35884x0;
        InterfaceC6034v0 interfaceC6034v0 = obj instanceof InterfaceC6034v0 ? (InterfaceC6034v0) obj : null;
        if (interfaceC6034v0 != null) {
            interfaceC6034v0.mo2149a();
        }
    }

    @Override // p882m1.AbstractC17140a
    /* JADX INFO: renamed from: b */
    public final boolean mo11307b(float f10) {
        this.f35881u0.m6410h(f10);
        return true;
    }

    @Override // p349O0.InterfaceC6034v0
    /* JADX INFO: renamed from: c */
    public final void mo2150c() {
        C2925c c2925c = this.f35878r0;
        if (c2925c != null) {
            AbstractC0575H.m1180i(c2925c, null);
        }
        this.f35878r0 = null;
        Object obj = this.f35884x0;
        InterfaceC6034v0 interfaceC6034v0 = obj instanceof InterfaceC6034v0 ? (InterfaceC6034v0) obj : null;
        if (interfaceC6034v0 != null) {
            interfaceC6034v0.mo2150c();
        }
    }

    @Override // p349O0.InterfaceC6034v0
    /* JADX INFO: renamed from: d */
    public final void mo2151d() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            if (this.f35878r0 == null) {
                C0566C0 c0566c0M1176e = AbstractC0575H.m1176e();
                C3516e c3516e = AbstractC0593T.f1824a;
                C2925c c2925cM1174c = AbstractC0575H.m1174c(AbstractC5695b.m6138e(c0566c0M1176e, AbstractC2935m.f8797a.f3819q0));
                this.f35878r0 = c2925cM1174c;
                Object obj = this.f35884x0;
                InterfaceC6034v0 interfaceC6034v0 = obj instanceof InterfaceC6034v0 ? (InterfaceC6034v0) obj : null;
                if (interfaceC6034v0 != null) {
                    interfaceC6034v0.mo2151d();
                }
                if (this.f35874C0) {
                    C20830h c20830hM21439a = C20831i.m21439a((C20831i) this.f35876E0.getValue());
                    c20830hM21439a.f66186b = ((C16826m) ((InterfaceC16818e) this.f35877F0.getValue())).f53989b;
                    c20830hM21439a.f66205u = null;
                    C20831i c20831iM21435a = c20830hM21439a.m21435a();
                    Drawable drawableM1000b = AbstractC0369d.m1000b(c20831iM21435a, c20831iM21435a.f66207B, c20831iM21435a.f66206A, c20831iM21435a.f66209D.f66170j);
                    m13131k(new AsyncImagePainter$State$Loading(drawableM1000b != null ? m13130j(drawableM1000b) : null));
                } else {
                    AbstractC0575H.m1156D(c2925cM1174c, null, null, new C17169d(this, null), 3);
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // p882m1.AbstractC17140a
    /* JADX INFO: renamed from: e */
    public final boolean mo11308e(C14356l c14356l) {
        this.f35882v0.setValue(c14356l);
        return true;
    }

    @Override // p882m1.AbstractC17140a
    /* JADX INFO: renamed from: h */
    public final long getF38830r0() {
        AbstractC17140a abstractC17140a = (AbstractC17140a) this.f35880t0.getValue();
        if (abstractC17140a != null) {
            return abstractC17140a.getF38830r0();
        }
        return 9205357640488583168L;
    }

    @Override // p882m1.AbstractC17140a
    /* JADX INFO: renamed from: i */
    public final void mo11310i(InterfaceC16039d interfaceC16039d) {
        C13803e c13803e = new C13803e(interfaceC16039d.mo17602i());
        C2153Q0 c2153q0 = this.f35879s0;
        c2153q0.getClass();
        c2153q0.m3251l(null, c13803e);
        AbstractC17140a abstractC17140a = (AbstractC17140a) this.f35880t0.getValue();
        if (abstractC17140a != null) {
            abstractC17140a.m18904g(interfaceC16039d, interfaceC16039d.mo17602i(), this.f35881u0.m6409g(), (C14356l) this.f35882v0.getValue());
        }
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC17140a m13130j(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? AbstractC8532O4.m9194a(new C14351g(((BitmapDrawable) drawable).getBitmap()), this.f35873B0) : new DrawablePainter(drawable.mutate());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0099  */
    /* JADX WARN: Code duplicated, block: B:41:0x009e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    public final void m13131k(AbstractC17167b abstractC17167b) {
        AbstractC20832j abstractC20832j;
        AbstractC17140a painter;
        InterfaceC1436k interfaceC1436k;
        Object painter2;
        InterfaceC6034v0 interfaceC6034v0;
        InterfaceC6034v0 interfaceC6034v1;
        AbstractC17167b abstractC17167b2 = this.f35883w0;
        AbstractC17167b abstractC17167b3 = (AbstractC17167b) this.f35885y0.invoke(abstractC17167b);
        this.f35883w0 = abstractC17167b3;
        this.f35875D0.setValue(abstractC17167b3);
        if (!(abstractC17167b3 instanceof AsyncImagePainter$State$Success)) {
            if (abstractC17167b3 instanceof AsyncImagePainter$State$Error) {
                abstractC20832j = ((AsyncImagePainter$State$Error) abstractC17167b3).f35887a;
            } else {
                painter = null;
            }
            if (painter == null) {
                painter = abstractC17167b3.getPainter();
            }
            this.f35884x0 = painter;
            this.f35880t0.setValue(painter);
            if (this.f35878r0 != null && abstractC17167b2.getPainter() != abstractC17167b3.getPainter()) {
                painter2 = abstractC17167b2.getPainter();
                if (painter2 instanceof InterfaceC6034v0) {
                    interfaceC6034v0 = (InterfaceC6034v0) painter2;
                } else {
                    interfaceC6034v0 = null;
                }
                if (interfaceC6034v0 != null) {
                    interfaceC6034v0.mo2150c();
                }
                Object painter3 = abstractC17167b3.getPainter();
                interfaceC6034v1 = painter3 instanceof InterfaceC6034v0 ? (InterfaceC6034v0) painter3 : null;
                if (interfaceC6034v1 != null) {
                    interfaceC6034v1.mo2151d();
                }
            }
            interfaceC1436k = this.f35886z0;
            if (interfaceC1436k != null) {
                interfaceC1436k.invoke(abstractC17167b3);
            }
        }
        abstractC20832j = ((AsyncImagePainter$State$Success) abstractC17167b3).f35888a;
        InterfaceC21802f interfaceC21802fMo22287a = abstractC20832j.mo21434b().f66218i.mo22287a(AbstractC17172g.f54856a, abstractC20832j);
        if (interfaceC21802fMo22287a instanceof C21798b) {
            C21798b c21798b = (C21798b) interfaceC21802fMo22287a;
            painter = new CrossfadePainter(abstractC17167b2 instanceof AsyncImagePainter$State$Loading ? abstractC17167b2.getPainter() : null, abstractC17167b3.getPainter(), this.f35872A0, c21798b.f69159c, ((abstractC20832j instanceof C20838p) && ((C20838p) abstractC20832j).f66261g) ? false : true, c21798b.f69160d);
        } else {
            painter = null;
        }
        if (painter == null) {
            painter = abstractC17167b3.getPainter();
        }
        this.f35884x0 = painter;
        this.f35880t0.setValue(painter);
        if (this.f35878r0 != null) {
            painter2 = abstractC17167b2.getPainter();
            if (painter2 instanceof InterfaceC6034v0) {
                interfaceC6034v0 = (InterfaceC6034v0) painter2;
            } else {
                interfaceC6034v0 = null;
            }
            if (interfaceC6034v0 != null) {
                interfaceC6034v0.mo2150c();
            }
            Object painter4 = abstractC17167b3.getPainter();
            if (painter4 instanceof InterfaceC6034v0) {
            }
            if (interfaceC6034v1 != null) {
                interfaceC6034v1.mo2151d();
            }
        }
        interfaceC1436k = this.f35886z0;
        if (interfaceC1436k != null) {
            interfaceC1436k.invoke(abstractC17167b3);
        }
    }
}
