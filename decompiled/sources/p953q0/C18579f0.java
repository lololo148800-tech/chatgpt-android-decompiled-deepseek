package p953q0;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p562X0.InterfaceC9016k;

/* JADX INFO: renamed from: q0.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C18579f0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59180Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC9016k f59181Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18579f0(InterfaceC9016k interfaceC9016k, int i10) {
        super(1);
        this.f59180Y = i10;
        this.f59181Z = interfaceC9016k;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f59180Y) {
            case 0:
                InterfaceC9016k interfaceC9016k = this.f59181Z;
                return Boolean.valueOf(interfaceC9016k != null ? interfaceC9016k.mo609a(obj) : true);
            default:
                return new C18583h0(this.f59181Z, (Map) obj);
        }
    }
}
