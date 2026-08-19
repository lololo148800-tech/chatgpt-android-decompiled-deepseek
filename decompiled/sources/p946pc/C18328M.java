package p946pc;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p049Bm.InterfaceC1440o;
import p349O0.C6021p;
import p635a1.InterfaceC10459q;
import p658b5.AbstractC11235f;

/* JADX INFO: renamed from: pc.M */
/* JADX INFO: loaded from: classes3.dex */
public final class C18328M extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f58506Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC10459q f58507Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1440o f58508o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18328M(InterfaceC10459q interfaceC10459q, InterfaceC1440o interfaceC1440o, int i10) {
        super(2);
        this.f58506Y = i10;
        this.f58507Z = interfaceC10459q;
        this.f58508o0 = interfaceC1440o;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f58506Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    AbstractC11235f.m12525a(this.f58507Z, null, this.f58508o0, c6021p, 0, 2);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    AbstractC11235f.m12525a(this.f58507Z, null, this.f58508o0, c6021p2, 0, 2);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
