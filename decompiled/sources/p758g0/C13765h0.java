package p758g0;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: g0.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C13765h0 implements InterfaceC13763g0 {

    /* JADX INFO: renamed from: a */
    public final Object f43459a;

    /* JADX INFO: renamed from: b */
    public final Object f43460b;

    public C13765h0(Object obj, Object obj2) {
        this.f43459a = obj;
        this.f43460b = obj2;
    }

    @Override // p758g0.InterfaceC13763g0
    /* JADX INFO: renamed from: a */
    public final Object mo15004a() {
        return this.f43459a;
    }

    @Override // p758g0.InterfaceC13763g0
    /* JADX INFO: renamed from: b */
    public final boolean mo15005b(Object obj, Object obj2) {
        return obj.equals(mo15004a()) && obj2.equals(mo15006c());
    }

    @Override // p758g0.InterfaceC13763g0
    /* JADX INFO: renamed from: c */
    public final Object mo15006c() {
        return this.f43460b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC13763g0) {
            InterfaceC13763g0 interfaceC13763g0 = (InterfaceC13763g0) obj;
            if (AbstractC16544l.m18089b(this.f43459a, interfaceC13763g0.mo15004a())) {
                if (AbstractC16544l.m18089b(this.f43460b, interfaceC13763g0.mo15006c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f43459a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f43460b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
