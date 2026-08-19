package p409Qk;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mo.C17355v;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: Qk.d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6753d implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21678Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f21679Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1436k f21680o0;

    public /* synthetic */ C6753d(InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2, int i10) {
        this.f21678Y = i10;
        this.f21679Z = interfaceC1436k;
        this.f21680o0 = interfaceC1436k2;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f21678Y) {
            case 0:
                AbstractC16544l.m18094g(obj, "<this>");
                InterfaceC1436k interfaceC1436k = this.f21679Z;
                if (interfaceC1436k != null) {
                    interfaceC1436k.invoke(obj);
                }
                this.f21680o0.invoke(obj);
                break;
            default:
                C17355v c17355v = (C17355v) obj;
                AbstractC16544l.m18094g(c17355v, "<this>");
                this.f21679Z.invoke(c17355v);
                this.f21680o0.invoke(c17355v);
                break;
        }
        return C17296C.f55119a;
    }
}
