package p946pc;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C6021p;
import p537W0.C8410b;

/* JADX INFO: renamed from: pc.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C18339e extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f58541Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C8410b f58542Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C18320E f58543o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18339e(C8410b c8410b, C18320E c18320e, int i10) {
        super(2);
        this.f58541Y = i10;
        this.f58542Z = c8410b;
        this.f58543o0 = c18320e;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f58541Y) {
            case 0:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    this.f58542Z.invoke(this.f58543o0, c6021p, 0);
                }
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    this.f58542Z.invoke(this.f58543o0, c6021p2, 0);
                }
                break;
        }
        return C17296C.f55119a;
    }
}
