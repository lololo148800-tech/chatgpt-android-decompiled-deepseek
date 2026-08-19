package p547Wc;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import pf.C18388d;
import tf.C19932q;
import tf.C19934s;
import tf.C19936u;

/* JADX INFO: renamed from: Wc.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C8804n extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f26939Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f26940Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1426a f26941o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8804n(InterfaceC1426a interfaceC1426a, InterfaceC1436k interfaceC1436k, int i10) {
        super(0);
        this.f26939Y = i10;
        this.f26941o0 = interfaceC1426a;
        this.f26940Z = interfaceC1436k;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f26939Y) {
            case 0:
                this.f26940Z.invoke(Boolean.TRUE);
                this.f26941o0.invoke();
                break;
            case 1:
                this.f26940Z.invoke(Boolean.FALSE);
                this.f26941o0.invoke();
                break;
            case 2:
                this.f26940Z.invoke(Boolean.FALSE);
                this.f26941o0.invoke();
                break;
            case 3:
                this.f26940Z.invoke(Boolean.FALSE);
                this.f26941o0.invoke();
                break;
            case 4:
                this.f26940Z.invoke(C18388d.f58668a);
                this.f26941o0.invoke();
                break;
            case 5:
                this.f26941o0.invoke();
                this.f26940Z.invoke(new C19936u(true));
                break;
            case 6:
                this.f26941o0.invoke();
                this.f26940Z.invoke(new C19934s(true));
                break;
            case 7:
                this.f26941o0.invoke();
                this.f26940Z.invoke(new C19934s(false));
                break;
            default:
                this.f26941o0.invoke();
                this.f26940Z.invoke(C19932q.f63190a);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8804n(InterfaceC1436k interfaceC1436k, InterfaceC1426a interfaceC1426a, int i10) {
        super(0);
        this.f26939Y = i10;
        this.f26940Z = interfaceC1436k;
        this.f26941o0 = interfaceC1426a;
    }
}
