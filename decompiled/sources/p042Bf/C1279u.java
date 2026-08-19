package p042Bf;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p006A4.C0364y;
import p040Bd.C0893B;
import p040Bd.C1166t;
import p049Bm.InterfaceC1436k;
import p349O0.InterfaceC5985X;
import p537W0.C8410b;
import p936p0.C18265e;

/* JADX INFO: renamed from: Bf.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C1279u extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3403Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C0893B f3404Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f3405o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1279u(C0893B c0893b, InterfaceC5985X interfaceC5985X, int i10) {
        super(1);
        this.f3403Y = i10;
        this.f3404Z = c0893b;
        this.f3405o0 = interfaceC5985X;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C17296C c17296c = C17296C.f55119a;
        InterfaceC5985X interfaceC5985X = this.f3405o0;
        Object obj2 = null;
        C0893B c0893b = this.f3404Z;
        switch (this.f3403Y) {
            case 0:
                C18265e LazyColumn = (C18265e) obj;
                AbstractC16544l.m18094g(LazyColumn, "$this$LazyColumn");
                List list = c0893b.f2620c;
                LazyColumn.m19803p(list.size(), null, new C1278t(0, list), new C8410b(new C0364y(list, 3, interfaceC5985X), true, -1091073711));
                break;
            default:
                String id2 = (String) obj;
                AbstractC16544l.m18094g(id2, "id");
                for (Object obj3 : c0893b.f2620c) {
                    if (AbstractC16544l.m18089b(((C1166t) obj3).f3091a, id2)) {
                        obj2 = obj3;
                        float f10 = AbstractC1283y.f3415a;
                        interfaceC5985X.setValue((C1166t) obj2);
                        break;
                    }
                }
                float f11 = AbstractC1283y.f3415a;
                interfaceC5985X.setValue((C1166t) obj2);
                break;
        }
        return c17296c;
    }
}
