package p1106xf;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p479Td.C7351f0;
import p926of.C18138A;
import p926of.C18149L;
import p926of.C18151N;
import p926of.C18158V;
import p926of.C18183t;
import ye.EnumC21517f;

/* JADX INFO: renamed from: xf.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C21200h extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f67404Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f67405Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C7351f0 f67406o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21200h(InterfaceC1436k interfaceC1436k, C7351f0 c7351f0, int i10) {
        super(0);
        this.f67404Y = i10;
        this.f67405Z = interfaceC1436k;
        this.f67406o0 = c7351f0;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f67404Y) {
            case 0:
                this.f67405Z.invoke(new C18183t(this.f67406o0));
                break;
            case 1:
                this.f67405Z.invoke(new C18149L(this.f67406o0, null, EnumC21517f.f68140p0, 2));
                break;
            case 2:
                this.f67405Z.invoke(new C18149L(this.f67406o0, null, EnumC21517f.f68139o0, 2));
                break;
            case 3:
                this.f67405Z.invoke(new C18149L(this.f67406o0, null, null, 6));
                break;
            case 4:
                this.f67405Z.invoke(new C18151N(this.f67406o0));
                break;
            case 5:
                this.f67405Z.invoke(new C18138A(this.f67406o0));
                break;
            default:
                this.f67405Z.invoke(new C18158V(this.f67406o0));
                break;
        }
        return C17296C.f55119a;
    }
}
