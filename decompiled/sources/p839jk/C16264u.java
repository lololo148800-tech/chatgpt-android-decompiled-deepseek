package p839jk;

import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p544W9.AbstractC8548R3;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: jk.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C16264u extends AbstractC8548R3 {

    /* JADX INFO: renamed from: a */
    public final String f50392a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC16261r f50393b;

    public C16264u(String stepName, InterfaceC16261r interfaceC16261r) {
        AbstractC16544l.m18094g(stepName, "stepName");
        this.f50392a = stepName;
        this.f50393b = interfaceC16261r;
    }

    @Override // p544W9.AbstractC8548R3
    /* JADX INFO: renamed from: b */
    public final String mo9209b() {
        return this.f50392a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16264u)) {
            return false;
        }
        C16264u c16264u = (C16264u) obj;
        return AbstractC16544l.m18089b(this.f50392a, c16264u.f50392a) && AbstractC16544l.m18089b(this.f50393b, c16264u.f50393b);
    }

    public final int hashCode() {
        return this.f50393b.hashCode() + (this.f50392a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        C16253j c16253j = C16253j.f50381a;
        InterfaceC16261r interfaceC16261r = this.f50393b;
        if (AbstractC16544l.m18089b(interfaceC16261r, c16253j)) {
            str = "autoclassification-failure";
        } else if (AbstractC16544l.m18089b(interfaceC16261r, C16254k.f50382a)) {
            str = "autoclassification-select";
        } else if (AbstractC16544l.m18089b(interfaceC16261r, C16259p.f50387a)) {
            str = "select";
        } else if (AbstractC16544l.m18089b(interfaceC16261r, C16257n.f50385a)) {
            str = "pending";
        } else if (interfaceC16261r instanceof C16255l) {
            str = ((C16255l) interfaceC16261r).f50383a + "/check";
        } else if (interfaceC16261r instanceof C16256m) {
            str = ((C16256m) interfaceC16261r).f50384a + "/check-upload";
        } else if (interfaceC16261r instanceof C16258o) {
            str = ((C16258o) interfaceC16261r).f50386a + "/prompt";
        } else {
            if (!(interfaceC16261r instanceof C16260q)) {
                throw new C0644w();
            }
            str = ((C16260q) interfaceC16261r).f50388a + "/capture";
        }
        return AbstractC9306j0.m9889h("/inquiry/government-id/", str);
    }
}
