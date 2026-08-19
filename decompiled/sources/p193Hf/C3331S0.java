package p193Hf;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p269Kh.C4688o;
import p586Y0.AbstractC9562n;
import p586Y0.C9550b;
import p586Y0.C9560l;

/* JADX INFO: renamed from: Hf.S0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3331S0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10179Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f10180Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f10181o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3331S0(InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, int i10) {
        super(1);
        this.f10179Y = i10;
        this.f10180Z = interfaceC1436k;
        this.f10181o0 = interfaceC1436k2;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        int i10;
        switch (this.f10179Y) {
            case 0:
                C3324O0 view = (C3324O0) obj;
                AbstractC16544l.m18094g(view, "view");
                view.setOnMessage(this.f10180Z);
                view.setOnFailure(this.f10181o0);
                return C17296C.f55119a;
            case 1:
                C9560l c9560l = (C9560l) obj;
                synchronized (AbstractC9562n.f28759b) {
                    i10 = AbstractC9562n.f28761d;
                    AbstractC9562n.f28761d = i10 + 1;
                }
                return new C9550b(i10, c9560l, this.f10180Z, this.f10181o0);
            case 2:
                this.f10180Z.invoke(obj);
                this.f10181o0.invoke(obj);
                return C17296C.f55119a;
            case 3:
                this.f10180Z.invoke(obj);
                this.f10181o0.invoke(obj);
                return C17296C.f55119a;
            default:
                C4688o model = (C4688o) obj;
                AbstractC16544l.m18094g(model, "model");
                this.f10180Z.invoke(model);
                this.f10181o0.invoke(Boolean.FALSE);
                return C17296C.f55119a;
        }
    }
}
