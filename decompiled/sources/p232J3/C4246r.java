package p232J3;

import p1016t3.AbstractC19764N;
import p1016t3.C19762L;
import p1016t3.C19763M;
import p1073w3.AbstractC20817s;

/* JADX INFO: renamed from: J3.r */
/* JADX INFO: loaded from: classes.dex */
public final class C4246r extends AbstractC4242n {

    /* JADX INFO: renamed from: e */
    public static final Object f13879e = new Object();

    /* JADX INFO: renamed from: c */
    public final Object f13880c;

    /* JADX INFO: renamed from: d */
    public final Object f13881d;

    public C4246r(AbstractC19764N abstractC19764N, Object obj, Object obj2) {
        super(abstractC19764N);
        this.f13880c = obj;
        this.f13881d = obj2;
    }

    @Override // p232J3.AbstractC4242n, p1016t3.AbstractC19764N
    /* JADX INFO: renamed from: b */
    public final int mo2413b(Object obj) {
        Object obj2;
        if (f13879e.equals(obj) && (obj2 = this.f13881d) != null) {
            obj = obj2;
        }
        return this.f13864b.mo2413b(obj);
    }

    @Override // p232J3.AbstractC4242n, p1016t3.AbstractC19764N
    /* JADX INFO: renamed from: f */
    public final C19762L mo2410f(int i10, C19762L c19762l, boolean z6) {
        this.f13864b.mo2410f(i10, c19762l, z6);
        if (AbstractC20817s.m21400a(c19762l.f62578b, this.f13881d) && z6) {
            c19762l.f62578b = f13879e;
        }
        return c19762l;
    }

    @Override // p232J3.AbstractC4242n, p1016t3.AbstractC19764N
    /* JADX INFO: renamed from: l */
    public final Object mo2419l(int i10) {
        Object objMo2419l = this.f13864b.mo2419l(i10);
        return AbstractC20817s.m21400a(objMo2419l, this.f13881d) ? f13879e : objMo2419l;
    }

    @Override // p232J3.AbstractC4242n, p1016t3.AbstractC19764N
    /* JADX INFO: renamed from: m */
    public final C19763M mo2411m(int i10, C19763M c19763m, long j10) {
        this.f13864b.mo2411m(i10, c19763m, j10);
        if (AbstractC20817s.m21400a(c19763m.f62586a, this.f13880c)) {
            c19763m.f62586a = C19763M.f62584p;
        }
        return c19763m;
    }
}
