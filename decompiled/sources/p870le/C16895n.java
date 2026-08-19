package p870le;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1025te.C19890u;
import p1040ue.C20206d;
import p1040ue.InterfaceC20204b;
import p225Im.InterfaceC3759g;

/* JADX INFO: renamed from: le.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C16895n extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54246Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC3759g f54247Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C20206d f54248o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16895n(InterfaceC3759g interfaceC3759g, C20206d c20206d, int i10) {
        super(1);
        this.f54246Y = i10;
        this.f54247Z = interfaceC3759g;
        this.f54248o0 = c20206d;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f54246Y) {
            case 0:
                InterfaceC20204b it = (InterfaceC20204b) obj;
                AbstractC16544l.m18094g(it, "it");
                ((InterfaceC1436k) this.f54247Z).invoke(new C19890u(this.f54248o0.f63973a, it));
                break;
            case 1:
                InterfaceC20204b it2 = (InterfaceC20204b) obj;
                AbstractC16544l.m18094g(it2, "it");
                ((InterfaceC1436k) this.f54247Z).invoke(new C19890u(this.f54248o0.f63973a, it2));
                break;
            case 2:
                InterfaceC20204b it3 = (InterfaceC20204b) obj;
                AbstractC16544l.m18094g(it3, "it");
                ((InterfaceC1436k) this.f54247Z).invoke(new C19890u(this.f54248o0.f63973a, it3));
                break;
            default:
                InterfaceC20204b it4 = (InterfaceC20204b) obj;
                AbstractC16544l.m18094g(it4, "it");
                ((InterfaceC1436k) this.f54247Z).invoke(new C19890u(this.f54248o0.f63973a, it4));
                break;
        }
        return C17296C.f55119a;
    }
}
