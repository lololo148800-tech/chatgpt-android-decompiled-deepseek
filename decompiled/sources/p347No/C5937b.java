package p347No;

import java.util.List;
import p049Bm.InterfaceC1439n;
import p078Co.InterfaceC1760b;
import p104Do.InterfaceC2220a;
import p523V9.AbstractC8038Z3;
import p523V9.AbstractC8086f4;
import p544W9.AbstractC8735w4;

/* JADX INFO: renamed from: No.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C5937b implements InterfaceC1760b, InterfaceC2220a, InterfaceC5938c {

    /* JADX INFO: renamed from: b */
    public static final C5937b f19318b = new C5937b(0);

    /* JADX INFO: renamed from: c */
    public static final C5937b f19319c = new C5937b(1);

    /* JADX INFO: renamed from: d */
    public static final C5937b f19320d = new C5937b(2);

    /* JADX INFO: renamed from: e */
    public static final C5937b f19321e = new C5937b(3);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f19322a;

    public /* synthetic */ C5937b(int i10) {
        this.f19322a = i10;
    }

    @Override // p104Do.InterfaceC2220a
    /* JADX INFO: renamed from: a */
    public final Boolean mo3259a(Comparable comparable) {
        switch (this.f19322a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return AbstractC8086f4.m8531r(comparable);
    }

    @Override // p078Co.InterfaceC1760b
    /* JADX INFO: renamed from: d */
    public final Object mo2570d(Object obj, Object obj2) {
        switch (this.f19322a) {
            case 0:
                return Boolean.valueOf(AbstractC8086f4.m8524k(this, AbstractC8038Z3.m8396e(obj), C5936a.f19313Z));
            case 1:
                return Boolean.valueOf(AbstractC8086f4.m8524k(this, AbstractC8038Z3.m8396e(obj), C5936a.f19314o0));
            case 2:
                return Boolean.valueOf(AbstractC8735w4.m9468b(this, AbstractC8038Z3.m8396e(obj), C5936a.f19315p0));
            default:
                return Boolean.valueOf(AbstractC8735w4.m9468b(this, AbstractC8038Z3.m8396e(obj), C5936a.f19316q0));
        }
    }

    @Override // p104Do.InterfaceC2220a
    /* JADX INFO: renamed from: e */
    public final List mo3260e(Comparable comparable, Comparable comparable2) {
        switch (this.f19322a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return AbstractC8086f4.m8529p(this, comparable, comparable2);
    }

    @Override // p104Do.InterfaceC2220a
    /* JADX INFO: renamed from: f */
    public final boolean mo3261f(List list, InterfaceC1439n interfaceC1439n) {
        switch (this.f19322a) {
            case 0:
                throw null;
            case 1:
                throw null;
            case 2:
                return AbstractC8086f4.m8524k(this, list, interfaceC1439n);
            default:
                return AbstractC8086f4.m8524k(this, list, interfaceC1439n);
        }
    }

    @Override // p104Do.InterfaceC2220a
    /* JADX INFO: renamed from: g */
    public final List mo3262g(Comparable comparable, Comparable comparable2) {
        switch (this.f19322a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return AbstractC8086f4.m8530q(comparable, comparable2);
    }
}
