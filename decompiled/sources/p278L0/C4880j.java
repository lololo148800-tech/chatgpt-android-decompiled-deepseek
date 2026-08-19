package p278L0;

import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p025An.AbstractC0575H;
import p025An.EnumC0573G;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0627n0;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2186j;
import p571X9.AbstractC9233X;
import p860l0.C16722a;
import p860l0.C16740g;
import p860l0.C16743h;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: L0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C4880j implements InterfaceC2186j {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f15908Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C16525B f15909Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC0571F f15910o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ AbstractC19694j f15911p0;

    /* JADX WARN: Multi-variable type inference failed */
    public C4880j(C16525B c16525b, InterfaceC0571F interfaceC0571F, InterfaceC1439n interfaceC1439n, int i10) {
        this.f15908Y = i10;
        switch (i10) {
            case 1:
                this.f15909Z = c16525b;
                this.f15910o0 = interfaceC0571F;
                this.f15911p0 = (AbstractC19694j) interfaceC1439n;
                break;
            default:
                this.f15909Z = c16525b;
                this.f15910o0 = interfaceC0571F;
                this.f15911p0 = (AbstractC19694j) interfaceC1439n;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r4v0, types: [Bm.n, sm.j] */
    /* JADX WARN: Type inference failed for: r4v1, types: [Bm.n, sm.j] */
    @Override // p103Dn.InterfaceC2186j
    /* JADX INFO: renamed from: a */
    public final Object mo395a(Object obj, InterfaceC18770c interfaceC18770c) {
        C4878i c4878i;
        C4880j c4880j;
        C16743h c16743h;
        C4880j c4880j2;
        switch (this.f15908Y) {
            case 0:
                if (interfaceC18770c instanceof C4878i) {
                    c4878i = (C4878i) interfaceC18770c;
                    int i10 = c4878i.f15898r0;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c4878i.f15898r0 = i10 - Integer.MIN_VALUE;
                    } else {
                        c4878i = new C4878i(this, interfaceC18770c);
                    }
                } else {
                    c4878i = new C4878i(this, interfaceC18770c);
                }
                Object obj2 = c4878i.f15896p0;
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i11 = c4878i.f15898r0;
                if (i11 == 0) {
                    AbstractC9233X.m9807c(obj2);
                    InterfaceC0627n0 interfaceC0627n0 = (InterfaceC0627n0) this.f15909Z.f51262Y;
                    if (interfaceC0627n0 != null) {
                        interfaceC0627n0.mo1275e(new C4866c());
                        c4878i.f15893Y = this;
                        c4878i.f15894Z = obj;
                        c4878i.f15895o0 = interfaceC0627n0;
                        c4878i.f15898r0 = 1;
                        if (interfaceC0627n0.mo1272P(c4878i) == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                    c4880j = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    InterfaceC0627n0 interfaceC0627n1 = c4878i.f15895o0;
                    obj = c4878i.f15894Z;
                    c4880j = c4878i.f15893Y;
                    AbstractC9233X.m9807c(obj2);
                }
                C16525B c16525b = c4880j.f15909Z;
                EnumC0573G enumC0573G = EnumC0573G.f1793p0;
                ?? r6 = c4880j.f15911p0;
                InterfaceC0571F interfaceC0571F = c4880j.f15910o0;
                c16525b.f51262Y = AbstractC0575H.m1156D(interfaceC0571F, null, enumC0573G, new C4876h(r6, obj, interfaceC0571F, null), 1);
                return C17296C.f55119a;
            default:
                if (interfaceC18770c instanceof C16743h) {
                    c16743h = (C16743h) interfaceC18770c;
                    int i12 = c16743h.f53698r0;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c16743h.f53698r0 = i12 - Integer.MIN_VALUE;
                    } else {
                        c16743h = new C16743h(this, interfaceC18770c);
                    }
                } else {
                    c16743h = new C16743h(this, interfaceC18770c);
                }
                Object obj3 = c16743h.f53696p0;
                EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
                int i13 = c16743h.f53698r0;
                if (i13 == 0) {
                    AbstractC9233X.m9807c(obj3);
                    InterfaceC0627n0 interfaceC0627n2 = (InterfaceC0627n0) this.f15909Z.f51262Y;
                    if (interfaceC0627n2 != null) {
                        interfaceC0627n2.mo1275e(new C16722a());
                        c16743h.f53693Y = this;
                        c16743h.f53694Z = obj;
                        c16743h.f53695o0 = interfaceC0627n2;
                        c16743h.f53698r0 = 1;
                        if (interfaceC0627n2.mo1272P(c16743h) == enumC19250a2) {
                            return enumC19250a2;
                        }
                    }
                    c4880j2 = this;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    InterfaceC0627n0 interfaceC0627n3 = c16743h.f53695o0;
                    obj = c16743h.f53694Z;
                    c4880j2 = c16743h.f53693Y;
                    AbstractC9233X.m9807c(obj3);
                }
                C16525B c16525b2 = c4880j2.f15909Z;
                EnumC0573G enumC0573G2 = EnumC0573G.f1793p0;
                ?? r10 = c4880j2.f15911p0;
                InterfaceC0571F interfaceC0571F2 = c4880j2.f15910o0;
                c16525b2.f51262Y = AbstractC0575H.m1156D(interfaceC0571F2, null, enumC0573G2, new C16740g(r10, obj, interfaceC0571F2, null), 1);
                return C17296C.f55119a;
        }
    }
}
