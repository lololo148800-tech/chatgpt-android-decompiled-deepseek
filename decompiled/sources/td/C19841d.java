package td;

import bf.C11349D;
import bf.InterfaceC11374b0;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p911o0.AbstractC17792x;
import p936p0.C18265e;

/* JADX INFO: renamed from: td.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C19841d extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C19841d f62922Z = new C19841d(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C19841d f62923o0 = new C19841d(1, 1);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f62924Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19841d(int i10, int i11) {
        super(i10);
        this.f62924Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f62924Y) {
            case 0:
                C18265e LazyColumn = (C18265e) obj;
                AbstractC16544l.m18094g(LazyColumn, "$this$LazyColumn");
                AbstractC17792x.m19528k(LazyColumn, null, AbstractC19840c.f62918c, 3);
                return C17296C.f55119a;
            default:
                InterfaceC11374b0 it = (InterfaceC11374b0) obj;
                AbstractC16544l.m18094g(it, "it");
                return ((C11349D) it).f34318a;
        }
    }
}
