package p080D0;

import kotlin.jvm.internal.AbstractC16544l;
import p1071w0.C20710G0;
import p1071w0.C20750g0;
import p1071w0.EnumC20729S;
import p1071w0.InterfaceC20772r0;
import p1095x1.InterfaceC21098s;
import p349O0.C6002f0;
import p350O1.C6045C;
import p523V9.AbstractC8088f6;
import p759g1.C13800b;

/* JADX INFO: renamed from: D0.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1799d0 implements InterfaceC20772r0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5163a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f5164b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f5165c;

    public C1799d0(C1837w0 c1837w0, boolean z6) {
        this.f5165c = c1837w0;
        this.f5164b = z6;
    }

    @Override // p1071w0.InterfaceC20772r0
    /* JADX INFO: renamed from: a */
    public final void mo464a() {
        switch (this.f5163a) {
            case 0:
                C1803f0 c1803f0 = (C1803f0) this.f5165c;
                c1803f0.f5196s = true;
                c1803f0.m2604p();
                c1803f0.f5193p.setValue(null);
                c1803f0.f5194q.setValue(null);
                break;
            default:
                C1837w0 c1837w0 = (C1837w0) this.f5165c;
                c1837w0.f5319o.setValue(null);
                c1837w0.f5320p.setValue(null);
                c1837w0.m2692p(true);
                break;
        }
    }

    @Override // p1071w0.InterfaceC20772r0
    /* JADX INFO: renamed from: b */
    public final void mo465b(long j10) {
        switch (this.f5163a) {
            case 0:
                C1803f0 c1803f0 = (C1803f0) this.f5165c;
                if (c1803f0.m2591c() == null) {
                    return;
                }
                C1824q c1824qM2593e = c1803f0.m2593e();
                AbstractC16544l.m18091d(c1824qM2593e);
                boolean z6 = this.f5164b;
                Object objM14712e = c1803f0.f5178a.f5244c.m14712e((z6 ? c1824qM2593e.f5257a : c1824qM2593e.f5258b).f5255c);
                if (objM14712e == null) {
                    throw new IllegalStateException("SelectionRegistrar should contain the current selection's selectableIds");
                }
                C1816m c1816m = (C1816m) objM14712e;
                InterfaceC21098s interfaceC21098sM2644c = c1816m.m2644c();
                if (interfaceC21098sM2644c == null) {
                    throw new IllegalStateException("Current selectable should have layout coordinates.");
                }
                long jM2642a = c1816m.m2642a(c1824qM2593e, z6);
                if (AbstractC8088f6.m8539e(jM2642a)) {
                    return;
                }
                c1803f0.f5189l.setValue(new C13800b(c1803f0.m2598j().mo21521e(interfaceC21098sM2644c, AbstractC1783Q.m2572a(jM2642a))));
                c1803f0.f5190m.setValue(new C13800b(0L));
                return;
            default:
                return;
        }
    }

    @Override // p1071w0.InterfaceC20772r0
    /* JADX INFO: renamed from: c */
    public final void mo466c() {
        switch (this.f5163a) {
            case 0:
                C1803f0 c1803f0 = (C1803f0) this.f5165c;
                c1803f0.f5196s = true;
                c1803f0.m2604p();
                c1803f0.f5193p.setValue(null);
                c1803f0.f5194q.setValue(null);
                break;
            default:
                C1837w0 c1837w0 = (C1837w0) this.f5165c;
                c1837w0.f5319o.setValue(null);
                c1837w0.f5320p.setValue(null);
                c1837w0.m2692p(true);
                break;
        }
    }

    @Override // p1071w0.InterfaceC20772r0
    /* JADX INFO: renamed from: d */
    public final void mo467d() {
        C1824q c1824qM2593e;
        InterfaceC21098s interfaceC21098sM2644c;
        C20710G0 c20710g0M21294d;
        switch (this.f5163a) {
            case 0:
                C1803f0 c1803f0 = (C1803f0) this.f5165c;
                boolean z6 = this.f5164b;
                if ((z6 ? (C13800b) c1803f0.f5191n.getValue() : (C13800b) c1803f0.f5192o.getValue()) != null && (c1824qM2593e = c1803f0.m2593e()) != null) {
                    C1816m c1816m = (C1816m) c1803f0.f5178a.f5244c.m14712e((z6 ? c1824qM2593e.f5257a : c1824qM2593e.f5258b).f5255c);
                    if (c1816m != null && (interfaceC21098sM2644c = c1816m.m2644c()) != null) {
                        long jM2642a = c1816m.m2642a(c1824qM2593e, z6);
                        if (!AbstractC8088f6.m8539e(jM2642a)) {
                            c1803f0.f5194q.setValue(new C13800b(c1803f0.m2598j().mo21521e(interfaceC21098sM2644c, AbstractC1783Q.m2572a(jM2642a))));
                            c1803f0.f5193p.setValue(z6 ? EnumC20729S.f65725Z : EnumC20729S.f65726o0);
                            c1803f0.f5196s = false;
                            c1803f0.m2604p();
                            break;
                        }
                    }
                }
                break;
            default:
                boolean z10 = this.f5164b;
                EnumC20729S enumC20729S = z10 ? EnumC20729S.f65725Z : EnumC20729S.f65726o0;
                C1837w0 c1837w0 = (C1837w0) this.f5165c;
                c1837w0.f5319o.setValue(enumC20729S);
                long jM2572a = AbstractC1783Q.m2572a(c1837w0.m2685i(z10));
                C20750g0 c20750g0 = c1837w0.f5308d;
                if (c20750g0 != null && (c20710g0M21294d = c20750g0.m21294d()) != null) {
                    long jM21219e = c20710g0M21294d.m21219e(jM2572a);
                    c1837w0.f5316l = jM21219e;
                    c1837w0.f5320p.setValue(new C13800b(jM21219e));
                    c1837w0.f5318n = 0L;
                    c1837w0.f5321q = -1;
                    C20750g0 c20750g1 = c1837w0.f5308d;
                    if (c20750g1 != null) {
                        c20750g1.f65826q.setValue(Boolean.TRUE);
                    }
                    c1837w0.m2692p(false);
                    break;
                }
                break;
        }
    }

    @Override // p1071w0.InterfaceC20772r0
    /* JADX INFO: renamed from: e */
    public final void mo468e(long j10) {
        switch (this.f5163a) {
            case 0:
                C1803f0 c1803f0 = (C1803f0) this.f5165c;
                if (c1803f0.m2591c() != null) {
                    C6002f0 c6002f0 = c1803f0.f5190m;
                    c6002f0.setValue(new C13800b(C13800b.m15311l(((C13800b) c6002f0.getValue()).f43584a, j10)));
                    C6002f0 c6002f1 = c1803f0.f5189l;
                    long jM15311l = C13800b.m15311l(((C13800b) c6002f1.getValue()).f43584a, ((C13800b) c6002f0.getValue()).f43584a);
                    if (c1803f0.m2603o(jM15311l, ((C13800b) c6002f1.getValue()).f43584a, this.f5164b, C1828s.f5270h)) {
                        c6002f1.setValue(new C13800b(jM15311l));
                        c6002f0.setValue(new C13800b(0L));
                    }
                    break;
                }
                break;
            default:
                C1837w0 c1837w0 = (C1837w0) this.f5165c;
                long jM15311l2 = C13800b.m15311l(c1837w0.f5318n, j10);
                c1837w0.f5318n = jM15311l2;
                c1837w0.f5320p.setValue(new C13800b(C13800b.m15311l(c1837w0.f5316l, jM15311l2)));
                C6045C c6045cM2686j = c1837w0.m2686j();
                C13800b c13800bM2683g = c1837w0.m2683g();
                AbstractC16544l.m18091d(c13800bM2683g);
                C1826r c1826r = C1828s.f5270h;
                C1837w0.m2677a(c1837w0, c6045cM2686j, c13800bM2683g.f43584a, false, this.f5164b, c1826r, true);
                c1837w0.m2692p(false);
                break;
        }
    }

    @Override // p1071w0.InterfaceC20772r0
    public final void onCancel() {
        switch (this.f5163a) {
            case 0:
                C1803f0 c1803f0 = (C1803f0) this.f5165c;
                c1803f0.f5196s = true;
                c1803f0.m2604p();
                c1803f0.f5193p.setValue(null);
                c1803f0.f5194q.setValue(null);
                break;
        }
    }

    public C1799d0(boolean z6, C1803f0 c1803f0) {
        this.f5164b = z6;
        this.f5165c = c1803f0;
    }

    /* JADX INFO: renamed from: f */
    private final void m2587f() {
    }

    /* JADX INFO: renamed from: g */
    private final void m2588g(long j10) {
    }
}
