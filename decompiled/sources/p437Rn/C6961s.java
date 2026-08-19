package p437Rn;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9113C4;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17680n;
import p968qi.C18726i;
import p968qi.C18739v;

/* JADX INFO: renamed from: Rn.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C6961s extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22261Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f22262Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f22263o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f22264p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f22265q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6961s(int i10, int i11, int i12, Object obj, Object obj2) {
        super(0);
        this.f22261Y = i12;
        this.f22264p0 = obj;
        this.f22265q0 = obj2;
        this.f22262Z = i10;
        this.f22263o0 = i11;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        InterfaceC1436k interfaceC1436k;
        switch (this.f22261Y) {
            case 0:
                StringBuilder sb2 = new StringBuilder("Expected ");
                sb2.append(((C6962t) this.f22264p0).f22266a);
                sb2.append(" but got ");
                int i10 = this.f22263o0;
                int i11 = this.f22262Z;
                sb2.append(((String) this.f22265q0).subSequence(i11, i10 + i11 + 1).toString());
                return sb2.toString();
            default:
                C18739v c18739v = (C18739v) this.f22264p0;
                if (c18739v != null && (interfaceC1436k = (InterfaceC1436k) this.f22265q0) != null) {
                    int i12 = this.f22262Z;
                    int i13 = this.f22263o0;
                    C18726i c18726i = new C18726i(AbstractC9113C4.m9643a(i12, i13));
                    Set set = c18739v.f59612d;
                    LinkedHashSet linkedHashSetM19263c = set.contains(c18726i) ? AbstractC17665J.m19263c(set, c18726i) : AbstractC17665J.m19267g(set, c18726i);
                    Set set2 = c18739v.f59610b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : set2) {
                        if (((Number) obj).intValue() != i13) {
                            arrayList.add(obj);
                        }
                    }
                    Set setM19328G0 = AbstractC17680n.m19328G0(arrayList);
                    Set set3 = c18739v.f59611c;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : set3) {
                        if (((Number) obj2).intValue() != i12) {
                            arrayList2.add(obj2);
                        }
                    }
                    interfaceC1436k.invoke(C18739v.m20045a(c18739v, setM19328G0, AbstractC17680n.m19328G0(arrayList2), linkedHashSetM19263c, 1));
                }
                return C17296C.f55119a;
        }
    }
}
