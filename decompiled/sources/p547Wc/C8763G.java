package p547Wc;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p042Bf.C1278t;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1440o;
import p349O0.InterfaceC5985X;
import p537W0.C8410b;
import p936p0.C18265e;

/* JADX INFO: renamed from: Wc.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C8763G extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ List f26708Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ List f26709Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f26710o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC16546n f26711p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f26712q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8763G(List list, List list2, InterfaceC5985X interfaceC5985X, InterfaceC1440o interfaceC1440o, int i10) {
        super(1);
        this.f26708Y = list;
        this.f26709Z = list2;
        this.f26710o0 = interfaceC5985X;
        this.f26711p0 = (AbstractC16546n) interfaceC1440o;
        this.f26712q0 = i10;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [Bm.o, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C18265e LazyColumn = (C18265e) obj;
        AbstractC16544l.m18094g(LazyColumn, "$this$LazyColumn");
        List list = this.f26708Y;
        LazyColumn.m19803p(list.size(), null, new C1278t(5, list), new C8410b(new C8762F(list, this.f26709Z, this.f26710o0, this.f26711p0, this.f26712q0), true, -632812321));
        return C17296C.f55119a;
    }
}
