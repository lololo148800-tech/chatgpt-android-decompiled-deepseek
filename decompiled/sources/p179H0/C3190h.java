package p179H0;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p1140z1.C21660F;
import p174Gk.uSfJ.HpucjswO;
import p193Hf.C3324O0;
import p193Hf.C3337V0;
import p758g0.AbstractC13725A;
import p759g1.C13803e;
import p774h1.C14327E;
import p774h1.C14336N;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: H0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C3190h extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9622Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f9623Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f9624o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3190h(C3196n c3196n, boolean z6) {
        super(1);
        this.f9622Y = 0;
        this.f9624o0 = c3196n;
        this.f9623Z = z6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3190h(boolean z6, Object obj, int i10) {
        super(1);
        this.f9622Y = i10;
        this.f9623Z = z6;
        this.f9624o0 = obj;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f9622Y) {
            case 0:
                C14336N c14336n = (C14336N) obj;
                C3196n c3196n = (C3196n) this.f9624o0;
                c14336n.m15662p(c3196n.f9642e.m6409g() - C13803e.m15331c(c14336n.f44980D0));
                if (this.f9623Z && !c3196n.m4043b()) {
                    float fMo9579a = AbstractC13725A.f43289b.mo9579a(c3196n.f9642e.m6409g() / c3196n.f9644g.m6409g());
                    if (fMo9579a < 0.0f) {
                        fMo9579a = 0.0f;
                    }
                    if (fMo9579a > 1.0f) {
                        fMo9579a = 1.0f;
                    }
                    c14336n.m15655g(fMo9579a);
                    c14336n.m15656h(fMo9579a);
                }
                return C17296C.f55119a;
            case 1:
                Context context = (Context) obj;
                AbstractC16544l.m18094g(context, HpucjswO.vFZXXeXbHgfoQOF);
                C3324O0 c3324o0 = new C3324O0(context, this.f9623Z);
                ((C3337V0) this.f9624o0).f10189a.setValue(c3324o0);
                c3324o0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return c3324o0;
            case 2:
                C21660F drawWithContent = (C21660F) obj;
                AbstractC16544l.m18094g(drawWithContent, "$this$drawWithContent");
                drawWithContent.m22080a();
                if (this.f9623Z) {
                    AbstractC14376f.m15849o(drawWithContent, (C14327E) this.f9624o0, 0L, 0L, 0.0f, null, 6, 62);
                }
                return C17296C.f55119a;
            default:
                ((C14336N) obj).m15651c(!this.f9623Z && ((Boolean) ((InterfaceC1426a) this.f9624o0).invoke()).booleanValue());
                return C17296C.f55119a;
        }
    }
}
