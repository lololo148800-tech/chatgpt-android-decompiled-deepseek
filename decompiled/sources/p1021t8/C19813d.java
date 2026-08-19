package p1021t8;

import hm.InterfaceC14539d;
import java.security.SecureRandom;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p062C8.C1614b;
import p138F8.InterfaceC2677a;
import p164G8.AbstractC3010d;
import p164G8.C3009c;
import p262K8.C4550a;
import p571X9.AbstractC9306j0;
import p765g7.InterfaceC13823a;
import p885m4.C17155e;

/* JADX INFO: renamed from: t8.d */
/* JADX INFO: loaded from: classes.dex */
public final class C19813d extends AbstractC3010d {

    /* JADX INFO: renamed from: E0 */
    public final InterfaceC13823a f62860E0;

    /* JADX INFO: renamed from: F0 */
    public final C17155e f62861F0;

    /* JADX INFO: renamed from: G0 */
    public final boolean f62862G0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19813d(InterfaceC13823a sdkCore, C1614b c1614b, InterfaceC2677a interfaceC2677a, SecureRandom random, C17155e c17155e, boolean z6) {
        super(c1614b, interfaceC2677a, random);
        AbstractC16544l.m18094g(sdkCore, "sdkCore");
        AbstractC16544l.m18094g(random, "random");
        this.f62860E0 = sdkCore;
        this.f62861F0 = c17155e;
        this.f62862G0 = z6;
        C19810a c19810a = new C19810a(this);
        C4550a c4550a = this.f9067p0;
        if (c4550a instanceof C4550a) {
            c4550a.f14874b.add(c19810a);
        }
    }

    @Override // hm.InterfaceC14540e
    /* JADX INFO: renamed from: J */
    public final InterfaceC14539d mo16040J(String operationName) {
        AbstractC16544l.m18094g(operationName, "operationName");
        C3009c c3009c = new C3009c(this, operationName, this.f9067p0);
        if (this.f62862G0) {
            Map mapMo15448d = this.f62860E0.mo15448d("rum");
            Object obj = mapMo15448d.get("application_id");
            c3009c.m3849d("application_id", obj instanceof String ? (String) obj : null);
            Object obj2 = mapMo15448d.get("session_id");
            c3009c.m3849d("session_id", obj2 instanceof String ? (String) obj2 : null);
            Object obj3 = mapMo15448d.get("view_id");
            c3009c.m3849d("view.id", obj3 instanceof String ? (String) obj3 : null);
            Object obj4 = mapMo15448d.get("action_id");
            c3009c.m3849d("user_action.id", obj4 instanceof String ? (String) obj4 : null);
        }
        return c3009c;
    }

    @Override // p164G8.AbstractC3010d
    public final String toString() {
        return AbstractC9306j0.m9889h("AndroidTracer/", super.toString());
    }
}
