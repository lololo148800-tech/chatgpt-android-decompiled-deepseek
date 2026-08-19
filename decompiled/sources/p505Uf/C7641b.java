package p505Uf;

import kotlin.jvm.internal.AbstractC16546n;
import p040Bd.C0961M1;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Uf.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C7641b extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Z */
    public static final C7641b f24153Z = new C7641b(0, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C7641b f24154o0 = new C7641b(0, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f24155Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7641b(int i10, int i11) {
        super(i10);
        this.f24155Y = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f24155Y) {
            case 0:
                return new C0961M1(EnumC7643d.f24158p0, C7644e.f24160Y);
            default:
                return new C0961M1(EnumC7649j.f24167p0, C7645f.f24161Y);
        }
    }
}
