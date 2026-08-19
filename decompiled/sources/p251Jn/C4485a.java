package p251Jn;

import java.util.Map;
import np.AbstractC17713e;
import p025An.InterfaceC0568D0;
import p1061vb.C20513d;
import p972qm.AbstractC18768a;
import p975qp.InterfaceC18797a;

/* JADX INFO: renamed from: Jn.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C4485a extends AbstractC18768a implements InterfaceC0568D0 {

    /* JADX INFO: renamed from: Z */
    public static final C20513d f14636Z = new C20513d();

    /* JADX INFO: renamed from: Y */
    public final Map f14637Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4485a() {
        super(f14636Z);
        InterfaceC18797a interfaceC18797a = AbstractC17713e.f56550a;
        if (interfaceC18797a == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        Map mapMo16558n = interfaceC18797a.mo16558n();
        this.f14637Y = mapMo16558n;
    }

    /* JADX INFO: renamed from: V0 */
    public static void m5212V0(Map map) {
        if (map == null) {
            InterfaceC18797a interfaceC18797a = AbstractC17713e.f56550a;
            if (interfaceC18797a == null) {
                throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
            }
            interfaceC18797a.clear();
            return;
        }
        InterfaceC18797a interfaceC18797a2 = AbstractC17713e.f56550a;
        if (interfaceC18797a2 == null) {
            throw new IllegalStateException("MDCAdapter cannot be null. See also http://www.slf4j.org/codes.html#null_MDCA");
        }
        interfaceC18797a2.mo16557i(map);
    }
}
