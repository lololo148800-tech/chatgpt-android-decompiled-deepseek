package p221Ii;

import android.content.Context;
import androidx.compose.p650ui.draw.AbstractC10861a;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p017Af.C0478i;
import p049Bm.InterfaceC1436k;
import p1045ul.C20387d;
import p193Hf.C3350b0;
import p260K6.C4547b;
import p308M6.C5299a;
import p308M6.C5303e;
import p308M6.InterfaceC5300b;
import p364Oh.C6244r;
import p432Rh.C6906s;
import p492U1.C7543h;
import p571X9.AbstractC9248Z2;
import p635a1.C10456n;
import p758g0.C13756d;
import p774h1.C14365u;
import p857kl.C16464l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17686t;
import p946pc.C18329N;
import p946pc.C18331P;
import p946pc.C18333S;
import p953q0.C18546D;
import p960q9.C18655i;

/* JADX INFO: renamed from: Ii.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C3726e extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f11307Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ long f11308Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f11309o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3726e(long j10, C3734m c3734m) {
        super(1);
        this.f11307Y = 0;
        this.f11308Z = j10;
        this.f11309o0 = c3734m;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        int i10 = 3;
        Object obj2 = this.f11309o0;
        long j10 = this.f11308Z;
        switch (this.f11307Y) {
            case 0:
                Context context = (Context) obj;
                AbstractC16544l.m18094g(context, "context");
                C4547b c4547b = new C4547b(context);
                c4547b.setFragmentShaderRawResId(Integer.valueOf(R.raw.user_mic_frag));
                c4547b.setVertexShaderRawResId(Integer.valueOf(R.raw.voice_vert));
                c4547b.setUpdateContinuously(true);
                C18655i c18655i = new C18655i(12);
                C18655i.m20021c(c18655i, "time");
                C18655i.m20021c(c18655i, "stateListen");
                C18655i.m20021c(c18655i, "listenTimestamp");
                C18655i.m20021c(c18655i, "readyTimestamp");
                c18655i.m20026f("userMagnitudes", null);
                C5299a c5299a = new C5299a(4, null);
                InterfaceC5300b interfaceC5300b = (InterfaceC5300b) c18655i.f59414Z;
                ((C5303e) interfaceC5300b).m5837a("viewport", c5299a);
                c18655i.m20026f("displayColor", new float[]{C14365u.m15780h(j10), C14365u.m15779g(j10), C14365u.m15777e(j10), C14365u.m15776d(j10)});
                c4547b.setShaderParams(interfaceC5300b);
                c4547b.setOnDrawFrameListener(new C3350b0((C3734m) obj2, 5, c4547b));
                return c4547b;
            case 1:
                C6244r current = (C6244r) obj;
                AbstractC16544l.m18094g(current, "current");
                ArrayList arrayListM19323D0 = AbstractC17680n.m19323D0(AbstractC9248Z2.m9822b(current));
                AbstractC17686t.m19393A(arrayListM19323D0, new C0478i(j10, i10));
                Iterator it = arrayListM19323D0.iterator();
                long jMin = Long.MAX_VALUE;
                while (it.hasNext()) {
                    C20387d c20387d = ((C16464l) it.next()).f51074e;
                    if (c20387d != null) {
                        jMin = Math.min(jMin, c20387d.f64480u0);
                    }
                }
                ((C6906s) obj2).f22144Z.set(jMin);
                return AbstractC9248Z2.m9821a(arrayListM19323D0);
            case 2:
                C18331P layoutResult = (C18331P) obj;
                AbstractC16544l.m18094g(layoutResult, "layoutResult");
                C10456n c10456n = C10456n.f30959Y;
                C18333S c18333s = (C18333S) obj2;
                C14365u c14365u = c18333s.f58522c;
                AbstractC16544l.m18091d(c14365u);
                long j11 = C14365u.f45060j;
                long j12 = c14365u.f45062a;
                return AbstractC10861a.m11295a(c10456n, new C18329N(layoutResult.f58516a, layoutResult.f58517b, j12 != j11 ? j12 : j10, c18333s.f58523d.floatValue()));
            default:
                long jM7881c = C7543h.m7881c(((C7543h) ((C13756d) obj).m15224e()).f23897a, j10);
                int i11 = C18546D.f59080t;
                C18546D c18546d = (C18546D) obj2;
                c18546d.m19917g(jM7881c);
                c18546d.f59083c.invoke();
                return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3726e(Object obj, long j10, int i10) {
        super(1);
        this.f11307Y = i10;
        this.f11309o0 = obj;
        this.f11308Z = j10;
    }
}
