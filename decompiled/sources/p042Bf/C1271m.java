package p042Bf;

import com.openai.feature.messages.MessagesViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p593Y8.C9683j;
import p825j5.C16126c;
import p909nm.AbstractC17682p;
import p926of.C18146I;
import p926of.C18173j;

/* JADX INFO: renamed from: Bf.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C1271m extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f3376Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f3377Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f3378o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f3379p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1271m(Object obj, Object obj2, int i10, int i11) {
        super(0);
        this.f3376Y = i11;
        this.f3378o0 = obj;
        this.f3379p0 = obj2;
        this.f3377Z = i10;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        switch (this.f3376Y) {
            case 0:
                List<String> list = (List) this.f3378o0;
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
                for (String value : list) {
                    AbstractC16544l.m18094g(value, "value");
                    arrayList.add(new C18173j(value, null, null, null, null, null, null, null, null, 510));
                }
                ((MessagesViewModel) this.f3379p0).m14395k(new C18146I(arrayList, this.f3377Z, 4));
                return C17296C.f55119a;
            default:
                C9683j c9683j = (C9683j) this.f3379p0;
                return new C16126c((String) this.f3378o0, c9683j.m10271E(), this.f3377Z, (Long) c9683j.f29193o0);
        }
    }
}
