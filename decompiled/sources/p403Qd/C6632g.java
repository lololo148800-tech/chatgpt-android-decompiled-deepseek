package p403Qd;

import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p381Pe.C6397h;
import p909nm.AbstractC17680n;
import p925oe.C18108d0;
import p925oe.C18120j0;

/* JADX INFO: renamed from: Qd.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C6632g extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f21368Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C6636i f21369Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6632g(C6636i c6636i, int i10) {
        super(1);
        this.f21368Y = i10;
        this.f21369Z = c6636i;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f21368Y) {
            case 0:
                C6397h node = (C6397h) obj;
                AbstractC16544l.m18094g(node, "node");
                return this.f21369Z.f21399u.m7029e(new C6630f(node, 0));
            default:
                C18120j0 state = (C18120j0) obj;
                AbstractC16544l.m18094g(state, "state");
                Set set = state.f57802b;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : set) {
                    if (!AbstractC16544l.m18089b(((C18108d0) obj2).f57761a, this.f21369Z.f21379a)) {
                        arrayList.add(obj2);
                    }
                }
                return C18120j0.m19715a(state, AbstractC17680n.m19328G0(arrayList));
        }
    }
}
