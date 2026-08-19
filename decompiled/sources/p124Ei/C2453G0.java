package p124Ei;

import androidx.compose.animation.AbstractC10831a;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C6021p;
import p523V9.AbstractC7925K4;
import p523V9.AbstractC8223w5;
import p736f0.AbstractC13508z;
import p758g0.AbstractC13758e;
import p855kj.AbstractC16428g;

/* JADX INFO: renamed from: Ei.G0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2453G0 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7624Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C2532n1 f7625Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2453G0(C2532n1 c2532n1, int i10) {
        super(2);
        this.f7624Y = i10;
        this.f7625Z = c2532n1;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7624Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC16428g abstractC16428g = this.f7625Z.f7882N.f7790c;
                    AbstractC8223w5.m8850b(Integer.valueOf(abstractC16428g != null ? AbstractC7925K4.m8215f(abstractC16428g) : R.drawable.sound_on), null, C2527m.f7853u0, null, "audio routing", null, AbstractC2547v.f7956i, c6021p, 1597824, 42);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC10831a.m11201d(this.f7625Z.f7873E, null, AbstractC13508z.m15013e(AbstractC13758e.m15255t(600, 0, null, 6), 2), AbstractC13508z.m15014f(AbstractC13758e.m15255t(600, 0, null, 6), 2), null, AbstractC2547v.f7954g, c6021p2, 200064, 18);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
