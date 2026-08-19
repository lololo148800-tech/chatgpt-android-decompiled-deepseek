package p929oi;

import bo.AbstractC11523k;
import bo.C11519g;
import bo.C11532t;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlinx.serialization.json.AbstractC16645d;
import kotlinx.serialization.json.JsonNull;
import mm.C17296C;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: oi.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C18200a extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C18200a f58028Z = new C18200a(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C18200a f58029o0 = new C18200a(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C18200a f58030p0 = new C18200a(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C18200a f58031q0 = new C18200a(1, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C18200a f58032r0 = new C18200a(1, 4);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f58033Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18200a(int i10, int i11) {
        super(i10);
        this.f58033Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f58033Y) {
            case 0:
                C11519g Json = (C11519g) obj;
                AbstractC16544l.m18094g(Json, "$this$Json");
                Json.f34854d = true;
                Json.f34853c = true;
                Json.f34861k = C11532t.f34895a;
                Json.f34851a = true;
                Json.f34852b = false;
                Json.f34857g = true;
                Json.f34866p = true;
                return C17296C.f55119a;
            case 1:
                C18216q it = (C18216q) obj;
                AbstractC16544l.m18094g(it, "it");
                Object obj2 = C18216q.f58050d;
                return AbstractC11523k.m12910c(it.m19726f(false).f58054a);
            case 2:
                C18216q it2 = (C18216q) obj;
                AbstractC16544l.m18094g(it2, "it");
                AbstractC16645d abstractC16645dM12908a = AbstractC11523k.m12908a(Boolean.FALSE);
                C18216q.m19721a(it2, "false", abstractC16645dM12908a);
                return abstractC16645dM12908a;
            case 3:
                C18216q it3 = (C18216q) obj;
                AbstractC16544l.m18094g(it3, "it");
                AbstractC16645d abstractC16645dM12908a2 = AbstractC11523k.m12908a(Boolean.TRUE);
                C18216q.m19721a(it3, "true", abstractC16645dM12908a2);
                return abstractC16645dM12908a2;
            default:
                C18216q it4 = (C18216q) obj;
                AbstractC16544l.m18094g(it4, "it");
                JsonNull jsonNull = JsonNull.INSTANCE;
                C18216q.m19721a(it4, "null", jsonNull);
                return jsonNull;
        }
    }
}
