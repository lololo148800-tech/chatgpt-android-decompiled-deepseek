package p039Bc;

import com.openai.feature.rootviewmodel.RootViewModel;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import ug.C20222e;
import ug.C20223f;

/* JADX INFO: renamed from: Bc.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C0874h extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f2568Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ RootViewModel f2569Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0874h(RootViewModel rootViewModel, int i10) {
        super(0);
        this.f2568Y = i10;
        this.f2569Z = rootViewModel;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f2568Y) {
            case 0:
                this.f2569Z.m14395k(C20223f.f64015a);
                break;
            default:
                this.f2569Z.m14395k(C20222e.f64014a);
                break;
        }
        return C17296C.f55119a;
    }
}
