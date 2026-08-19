package p070Cg;

import com.openai.feature.serverstatus.impl.failwhale.FailwhaleViewModel;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Cg.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C1658f extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f4682Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ FailwhaleViewModel f4683Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1658f(FailwhaleViewModel failwhaleViewModel, int i10) {
        super(0);
        this.f4682Y = i10;
        this.f4683Z = failwhaleViewModel;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f4682Y) {
            case 0:
                this.f4683Z.m14395k(C1655c.f4680a);
                break;
            default:
                this.f4683Z.m14395k(C1656d.f4681a);
                break;
        }
        return C17296C.f55119a;
    }
}
