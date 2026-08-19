package p043Bg;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p003A1.InterfaceC0309z1;
import p037B9.MeDP.MpoABj;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Bg.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C1286b extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3421Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC0309z1 f3422Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1286b(InterfaceC0309z1 interfaceC0309z1, int i10) {
        super(0);
        this.f3421Y = i10;
        this.f3422Z = interfaceC0309z1;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f3421Y) {
            case 0:
                this.f3422Z.mo877a(MpoABj.qYGZvKcGgmyEd);
                break;
            default:
                this.f3422Z.mo877a("https://help.openai.com/en/articles/9247338-network-recommendations-for-chatgpt-errors-on-web-and-apps");
                break;
        }
        return C17296C.f55119a;
    }
}
