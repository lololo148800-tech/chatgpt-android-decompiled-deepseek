package sg;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p349O0.C6021p;

/* JADX INFO: renamed from: sg.N */
/* JADX INFO: loaded from: classes3.dex */
public final class C19550N extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f62101Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19581w f62102Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19550N(C19581w c19581w, int i10) {
        super(2);
        this.f62101Y = i10;
        this.f62102Z = c19581w;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f62101Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4124r4.m4768b(this.f62102Z.f62179a, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12152h, c6021p, 0, 0, 65534);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC4124r4.m4768b(this.f62102Z.f62180b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p2.m6548k(AbstractC3947L4.f12183a)).f12158n, c6021p2, 0, 0, 65534);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
