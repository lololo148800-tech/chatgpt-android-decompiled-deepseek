package p646aj;

import ao.AbstractC11153a0;
import bo.C11519g;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p001A.C0042V0;
import p016Ae.C0439a;
import p049Bm.InterfaceC1436k;
import p225Im.InterfaceC3756d;
import p733eo.AbstractC13455c;
import p733eo.C13454b;

/* JADX INFO: renamed from: aj.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C10622b extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C10622b f31519Z = new C10622b(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C10622b f31520o0 = new C10622b(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C10622b f31521p0 = new C10622b(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C10622b f31522q0 = new C10622b(1, 3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f31523Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10622b(int i10, int i11) {
        super(i10);
        this.f31523Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f31523Y) {
            case 0:
                List it = (List) obj;
                AbstractC16544l.m18094g(it, "it");
                return C10621a.f31517a;
            case 1:
                C11519g Json = (C11519g) obj;
                AbstractC16544l.m18094g(Json, "$this$Json");
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                HashMap map4 = new HashMap();
                HashMap map5 = new HashMap();
                InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(Object.class);
                C13454b c13454b = new C13454b(f31519Z);
                AbstractC13455c abstractC13455c = (AbstractC13455c) map.get(interfaceC3756dMo5693b);
                if (abstractC13455c == null || abstractC13455c.equals(c13454b)) {
                    map.put(interfaceC3756dMo5693b, c13454b);
                    Json.f34868r = new C0042V0(map, map2, map3, map4, map5, AbstractC11153a0.m12386i(interfaceC3756dMo5693b));
                    return C17296C.f55119a;
                }
                throw new C0439a("Contextual serializer or serializer provider for " + interfaceC3756dMo5693b + " already registered in this module", 4);
            case 2:
                C11519g Json2 = (C11519g) obj;
                AbstractC16544l.m18094g(Json2, "$this$Json");
                Json2.f34851a = true;
                return C17296C.f55119a;
            default:
                C11519g Json3 = (C11519g) obj;
                AbstractC16544l.m18094g(Json3, "$this$Json");
                Json3.f34853c = true;
                Json3.f34854d = true;
                return C17296C.f55119a;
        }
    }
}
