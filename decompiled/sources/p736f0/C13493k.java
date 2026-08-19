package p736f0;

import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p492U1.C7545j;
import p492U1.EnumC7546k;
import p523V9.AbstractC8231x5;
import p635a1.InterfaceC10446d;
import p692d0.AbstractC12957J;
import p692d0.C12951D;
import p758g0.C13759e0;
import p758g0.C13771k0;
import p758g0.InterfaceC13763g0;

/* JADX INFO: renamed from: f0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C13493k implements InterfaceC13763g0 {

    /* JADX INFO: renamed from: a */
    public final C13771k0 f42710a;

    /* JADX INFO: renamed from: b */
    public InterfaceC10446d f42711b;

    /* JADX INFO: renamed from: c */
    public EnumC7546k f42712c;

    /* JADX INFO: renamed from: d */
    public final C6002f0 f42713d = C5997d.m6430Q(new C7545j(0), C5975S.f19448r0);

    /* JADX INFO: renamed from: e */
    public final C12951D f42714e;

    /* JADX INFO: renamed from: f */
    public C13759e0 f42715f;

    public C13493k(C13771k0 c13771k0, InterfaceC10446d interfaceC10446d, EnumC7546k enumC7546k) {
        this.f42710a = c13771k0;
        this.f42711b = interfaceC10446d;
        this.f42712c = enumC7546k;
        long[] jArr = AbstractC12957J.f41150a;
        this.f42714e = new C12951D();
    }

    /* JADX INFO: renamed from: d */
    public static final long m15002d(C13493k c13493k, long j10, long j11) {
        return c13493k.f42711b.mo10925a(j10, j11, EnumC7546k.f23904Y);
    }

    /* JADX INFO: renamed from: e */
    public static final long m15003e(C13493k c13493k) {
        C13759e0 c13759e0 = c13493k.f42715f;
        return c13759e0 != null ? ((C7545j) c13759e0.getValue()).f23903a : ((C7545j) c13493k.f42713d.getValue()).f23903a;
    }

    @Override // p758g0.InterfaceC13763g0
    /* JADX INFO: renamed from: a */
    public final Object mo15004a() {
        return this.f42710a.m15275f().mo15004a();
    }

    @Override // p758g0.InterfaceC13763g0
    /* JADX INFO: renamed from: b */
    public final boolean mo15005b(Object obj, Object obj2) {
        return obj.equals(mo15004a()) && obj2.equals(mo15006c());
    }

    @Override // p758g0.InterfaceC13763g0
    /* JADX INFO: renamed from: c */
    public final Object mo15006c() {
        return this.f42710a.m15275f().mo15006c();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m15007f(int i10) {
        return AbstractC8231x5.m8867c(i10, 0) || (AbstractC8231x5.m8867c(i10, 4) && this.f42712c == EnumC7546k.f23904Y) || (AbstractC8231x5.m8867c(i10, 5) && this.f42712c == EnumC7546k.f23905Z);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m15008g(int i10) {
        if (AbstractC8231x5.m8867c(i10, 1)) {
            return true;
        }
        if (AbstractC8231x5.m8867c(i10, 4) && this.f42712c == EnumC7546k.f23905Z) {
            return true;
        }
        return AbstractC8231x5.m8867c(i10, 5) && this.f42712c == EnumC7546k.f23904Y;
    }
}
