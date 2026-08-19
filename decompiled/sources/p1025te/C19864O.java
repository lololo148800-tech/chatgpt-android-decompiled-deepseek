package p1025te;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p195Hh.C3430e;
import p228J.AbstractC3794B0;
import p324Mn.C5551u;
import p523V9.AbstractC8128k6;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;

/* JADX INFO: renamed from: te.O */
/* JADX INFO: loaded from: classes3.dex */
public final class C19864O {

    /* JADX INFO: renamed from: a */
    public final C3430e f62962a = AbstractC8168p6.m8749b("InputStateFlow", null);

    /* JADX INFO: renamed from: b */
    public final C2153Q0 f62963b;

    /* JADX INFO: renamed from: c */
    public final C2153Q0 f62964c;

    /* JADX INFO: renamed from: d */
    public String f62965d;

    /* JADX INFO: renamed from: e */
    public C5551u f62966e;

    /* JADX INFO: renamed from: f */
    public final long f62967f;

    /* JADX WARN: Multi-variable type inference failed */
    public C19864O() {
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(new C19863N(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255));
        this.f62963b = c2153q0M3204c;
        this.f62964c = c2153q0M3204c;
        C5551u.Companion.getClass();
        this.f62966e = new C5551u(AbstractC3794B0.m4501z("instant(...)"));
        C21554a c21554a = C21555b.f68260Z;
        this.f62967f = AbstractC8128k6.m8644j(RCHTTPStatusCodes.SUCCESS, EnumC21557d.MILLISECONDS);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0069  */
    /* JADX INFO: renamed from: a */
    public final void m20781a(InterfaceC1436k block) {
        C2153Q0 c2153q0;
        Object value;
        Object obj;
        AbstractC16544l.m18094g(block, "block");
        do {
            c2153q0 = this.f62963b;
            value = c2153q0.getValue();
            obj = (C19863N) value;
            C19863N c19863n = (C19863N) block.invoke(obj);
            String str = this.f62965d;
            if (str == null || str.length() <= 0 || !AbstractC16544l.m18089b(c19863n.f62954a.f19682a.f10934Y, this.f62965d) || AbstractC16544l.m18089b(c19863n.f62954a.f19682a.f10934Y, "\u200b")) {
                obj = c19863n;
            } else {
                C5551u.Companion.getClass();
                if (C21555b.m21833c(new C5551u(AbstractC3794B0.m4501z("instant(...)")).m5946b(this.f62966e), this.f62967f) < 0) {
                    AbstractC8160o6.m8731f(this.f62962a, "Detected suspicious revert of input text!", new IllegalStateException("Input text reverted too soon after submit."), null, 4);
                } else {
                    obj = c19863n;
                }
            }
        } while (!c2153q0.m3250k(value, obj));
    }
}
