package sg;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p229J0.AbstractC3947L4;
import p229J0.AbstractC4124r4;
import p229J0.C3941K4;
import p349O0.C6021p;

/* JADX INFO: renamed from: sg.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C19543G extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f62085Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19578t f62086Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19543G(C19578t c19578t, int i10) {
        super(2);
        this.f62085Y = i10;
        this.f62086Z = c19578t;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f62085Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC4124r4.m4768b(this.f62086Z.f62168b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p.m6548k(AbstractC3947L4.f12183a)).f12152h, c6021p, 0, 0, 65534);
                }
                break;
            case 1:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    String str = this.f62086Z.f62172f;
                    if (str == null) {
                        str = "";
                    }
                    AbstractC4124r4.m4768b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c6021p2, 0, 0, 131070);
                }
                break;
            case 2:
                C6021p c6021p3 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p3.m6562y()) {
                    c6021p3.m6517L();
                } else {
                    AbstractC4124r4.m4768b(this.f62086Z.f62168b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p3.m6548k(AbstractC3947L4.f12183a)).f12155k, c6021p3, 0, 0, 65534);
                }
                break;
            default:
                C6021p c6021p4 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p4.m6562y()) {
                    c6021p4.m6517L();
                } else {
                    AbstractC4124r4.m4768b(this.f62086Z.f62168b, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((C3941K4) c6021p4.m6548k(AbstractC3947L4.f12183a)).f12155k, c6021p4, 0, 0, 65534);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
