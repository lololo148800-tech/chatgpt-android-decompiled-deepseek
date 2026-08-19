package p968qi;

import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p296Lk.C5107d;
import p492U1.C7540e;

/* JADX INFO: renamed from: qi.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C18733p extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C18733p f59588Z = new C18733p(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C18733p f59589o0 = new C18733p(1, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f59590Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18733p(int i10, int i11) {
        super(i10);
        this.f59590Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f59590Y) {
            case 0:
                ((Number) obj).intValue();
                return new C7540e(48);
            default:
                return new C5107d(((Number) obj).intValue(), 0);
        }
    }
}
