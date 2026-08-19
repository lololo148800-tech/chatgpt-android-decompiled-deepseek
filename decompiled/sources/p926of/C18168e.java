package p926of;

import cd.C11709i;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: of.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C18168e extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f57946Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f57947Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C11709i f57948o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18168e(InterfaceC1436k interfaceC1436k, C11709i c11709i, int i10) {
        super(1);
        this.f57946Y = i10;
        this.f57947Z = interfaceC1436k;
        this.f57948o0 = c11709i;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f57946Y) {
            case 0:
                InterfaceC18159W action = (InterfaceC18159W) obj;
                AbstractC16544l.m18094g(action, "action");
                this.f57947Z.invoke(action);
                this.f57948o0.m13031a();
                break;
            default:
                InterfaceC18159W action2 = (InterfaceC18159W) obj;
                AbstractC16544l.m18094g(action2, "action");
                this.f57947Z.invoke(action2);
                this.f57948o0.m13031a();
                break;
        }
        return C17296C.f55119a;
    }
}
