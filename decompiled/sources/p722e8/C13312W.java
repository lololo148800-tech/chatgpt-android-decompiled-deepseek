package p722e8;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p544W9.AbstractC8595Z2;
import p677c8.C11689a;
import p804i8.InterfaceC14942a;

/* JADX INFO: renamed from: e8.W */
/* JADX INFO: loaded from: classes.dex */
public final class C13312W extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f42131Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C11689a f42132Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC8595Z2 f42133o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13312W(C11689a c11689a, AbstractC8595Z2 abstractC8595Z2, int i10) {
        super(1);
        this.f42131Y = i10;
        this.f42132Z = c11689a;
        this.f42133o0 = abstractC8595Z2;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f42131Y) {
            case 0:
                InterfaceC14942a it = (InterfaceC14942a) obj;
                AbstractC16544l.m18094g(it, "it");
                String str = this.f42132Z.f35460d;
                if (str == null) {
                    str = "";
                }
                it.mo16105g(str, this.f42133o0);
                break;
            default:
                InterfaceC14942a it2 = (InterfaceC14942a) obj;
                AbstractC16544l.m18094g(it2, "it");
                String str2 = this.f42132Z.f35460d;
                if (str2 == null) {
                    str2 = "";
                }
                it2.mo16102d(str2, this.f42133o0);
                break;
        }
        return C17296C.f55119a;
    }
}
