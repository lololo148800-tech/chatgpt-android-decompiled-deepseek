package p594Y9;

import kotlin.jvm.internal.AbstractC16529F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1139z0.C21585H;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p562X0.AbstractC9020o;
import p562X0.C9006a;
import p919o8.C17896F1;

/* JADX INFO: renamed from: Y9.W3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9828W3 {
    /* JADX INFO: renamed from: a */
    public static C17896F1 m10470a(C3676s c3676s) {
        try {
            return new C17896F1(c3676s.m4395w("count").mo4382p());
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type FrozenFrame", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type FrozenFrame", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type FrozenFrame", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C21585H m10471b(InterfaceC1439n interfaceC1439n, InterfaceC1436k interfaceC1436k) {
        C9006a c9006a = new C9006a(interfaceC1439n);
        AbstractC16529F.m18081e(1, interfaceC1436k);
        C21585H c21585h = AbstractC9020o.f27518a;
        return new C21585H(c9006a, 10, interfaceC1436k);
    }
}
