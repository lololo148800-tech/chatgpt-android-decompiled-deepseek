package p562X0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p769gj.C14183y;

/* JADX INFO: renamed from: X0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9006a extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f27482Y = 1;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC16546n f27483Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C9006a(InterfaceC1436k interfaceC1436k) {
        super(2);
        this.f27483Z = (AbstractC16546n) interfaceC1436k;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Bm.n, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r1v3, types: [Bm.k, kotlin.jvm.internal.n] */
    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object outer, Object obj) {
        InterfaceC9016k interfaceC9016k;
        switch (this.f27482Y) {
            case 0:
                C9008c c9008c = (C9008c) outer;
                List list = (List) this.f27483Z.invoke(c9008c, obj);
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj2 = list.get(i10);
                    if (obj2 != null && (interfaceC9016k = c9008c.f27492Z) != null && !interfaceC9016k.mo609a(obj2)) {
                        throw new IllegalArgumentException("item can't be saved");
                    }
                }
                List list2 = list;
                if (list2.isEmpty()) {
                    return null;
                }
                return new ArrayList(list2);
            default:
                C14183y viewEnvironment = (C14183y) obj;
                AbstractC16544l.m18094g(outer, "outer");
                AbstractC16544l.m18094g(viewEnvironment, "viewEnvironment");
                return new C17309l(this.f27483Z.invoke(outer), viewEnvironment);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C9006a(InterfaceC1439n interfaceC1439n) {
        super(2);
        this.f27483Z = (AbstractC16546n) interfaceC1439n;
    }
}
