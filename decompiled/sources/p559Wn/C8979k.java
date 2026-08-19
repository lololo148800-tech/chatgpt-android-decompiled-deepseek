package p559Wn;

import java.util.ArrayList;
import p049Bm.InterfaceC1426a;
import p225Im.InterfaceC3777y;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.C17689w;

/* JADX INFO: renamed from: Wn.k */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8979k implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f27422Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ArrayList f27423Z;

    public /* synthetic */ C8979k(int i10, ArrayList arrayList) {
        this.f27422Y = i10;
        this.f27423Z = arrayList;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f27422Y) {
            case 0:
                return ((InterfaceC3777y) this.f27423Z.get(0)).getClassifier();
            default:
                ArrayList arrayList = this.f27423Z;
                if (arrayList.isEmpty()) {
                    return C17689w.f56480Y;
                }
                return arrayList.subList((((CharSequence) AbstractC17680n.m19341Q(arrayList)).length() != 0 || arrayList.size() <= 1) ? 0 : 1, ((CharSequence) AbstractC17680n.m19351a0(arrayList)).length() == 0 ? AbstractC17681o.m19381j(arrayList) : 1 + AbstractC17681o.m19381j(arrayList));
        }
    }
}
