package p624Zg;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p349O0.C5996c0;
import p349O0.InterfaceC5985X;
import p553Wh.C8870f;

/* JADX INFO: renamed from: Zg.d0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10363d0 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f30713Y = 0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C8870f f30714Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C5996c0 f30715o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC5985X f30716p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10363d0(C8870f c8870f, InterfaceC5985X interfaceC5985X, C5996c0 c5996c0) {
        super(1);
        this.f30714Z = c8870f;
        this.f30716p0 = interfaceC5985X;
        this.f30715o0 = c5996c0;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f30713Y) {
            case 0:
                ((Boolean) obj).getClass();
                if (((Boolean) this.f30716p0.getValue()).booleanValue()) {
                    this.f30714Z.f27149b.m12195o();
                }
                this.f30715o0.m6413h(0);
                break;
            default:
                AbstractC10371h0 effect = (AbstractC10371h0) obj;
                AbstractC16544l.m18094g(effect, "effect");
                if (effect.equals(C10367f0.f30723a)) {
                    this.f30714Z.f27149b.m12195o();
                } else if (effect instanceof C10369g0) {
                    C10369g0 c10369g0 = (C10369g0) effect;
                    this.f30715o0.m6413h(c10369g0.f30727a);
                    this.f30716p0.setValue(Boolean.valueOf(c10369g0.f30728b));
                }
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10363d0(C8870f c8870f, C5996c0 c5996c0, InterfaceC5985X interfaceC5985X) {
        super(1);
        this.f30714Z = c8870f;
        this.f30715o0 = c5996c0;
        this.f30716p0 = interfaceC5985X;
    }
}
