package p091Db;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC16544l;
import lb.InterfaceC16837a;
import lb.InterfaceC16838b;
import lb.InterfaceC16839c;
import lb.InterfaceC16840d;
import p025An.AbstractC0575H;
import p658b5.C11238i;
import p890mb.C17220q;
import p890mb.InterfaceC17207d;

/* JADX INFO: renamed from: Db.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1983a implements InterfaceC17207d {

    /* JADX INFO: renamed from: Z */
    public static final C1983a f5856Z = new C1983a(0);

    /* JADX INFO: renamed from: o0 */
    public static final C1983a f5857o0 = new C1983a(1);

    /* JADX INFO: renamed from: p0 */
    public static final C1983a f5858p0 = new C1983a(2);

    /* JADX INFO: renamed from: q0 */
    public static final C1983a f5859q0 = new C1983a(3);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f5860Y;

    public /* synthetic */ C1983a(int i10) {
        this.f5860Y = i10;
    }

    @Override // p890mb.InterfaceC17207d
    /* JADX INFO: renamed from: g */
    public final Object mo391g(C11238i c11238i) {
        switch (this.f5860Y) {
            case 0:
                Object objMo12534C = c11238i.mo12534C(new C17220q(InterfaceC16837a.class, Executor.class));
                AbstractC16544l.m18093f(objMo12534C, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return AbstractC0575H.m1189r((Executor) objMo12534C);
            case 1:
                Object objMo12534C2 = c11238i.mo12534C(new C17220q(InterfaceC16839c.class, Executor.class));
                AbstractC16544l.m18093f(objMo12534C2, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return AbstractC0575H.m1189r((Executor) objMo12534C2);
            case 2:
                Object objMo12534C3 = c11238i.mo12534C(new C17220q(InterfaceC16838b.class, Executor.class));
                AbstractC16544l.m18093f(objMo12534C3, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return AbstractC0575H.m1189r((Executor) objMo12534C3);
            default:
                Object objMo12534C4 = c11238i.mo12534C(new C17220q(InterfaceC16840d.class, Executor.class));
                AbstractC16544l.m18093f(objMo12534C4, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return AbstractC0575H.m1189r((Executor) objMo12534C4);
        }
    }
}
