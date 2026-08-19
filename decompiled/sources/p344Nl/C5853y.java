package p344Nl;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17309l;
import p049Bm.InterfaceC1426a;
import p103Dn.InterfaceC2184i;
import p566X4.AbstractC9045c;

/* JADX INFO: renamed from: Nl.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C5853y extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f19147Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC2184i[] f19148Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5853y(InterfaceC2184i[] interfaceC2184iArr, int i10) {
        super(0);
        this.f19147Y = i10;
        this.f19148Z = interfaceC2184iArr;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f19147Y) {
            case 0:
                return new C17309l[this.f19148Z.length];
            default:
                return new AbstractC9045c[this.f19148Z.length];
        }
    }
}
