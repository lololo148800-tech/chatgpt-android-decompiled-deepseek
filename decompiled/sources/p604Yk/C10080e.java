package p604Yk;

import java.util.ArrayList;
import java.util.Set;
import mm.C17296C;
import p049Bm.InterfaceC1442q;
import p109E3.C2292p;
import p571X9.AbstractC9233X;
import p582Xk.C9525b;
import p754fl.C13693c;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Yk.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C10080e extends AbstractC19694j implements InterfaceC1442q {

    /* JADX INFO: renamed from: Y */
    public int f29837Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ C13693c f29838Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f29839o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ ArrayList f29840p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Set f29841q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C9525b f29842r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10080e(C9525b c9525b, ArrayList arrayList, Set set, InterfaceC18770c interfaceC18770c) {
        super(5, interfaceC18770c);
        this.f29840p0 = arrayList;
        this.f29841q0 = set;
        this.f29842r0 = c9525b;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws C2292p {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f29837Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C13693c c13693c = this.f29838Z;
            Object obj2 = this.f29839o0;
            this.f29838Z = null;
            this.f29837Y = 1;
            obj = AbstractC10084i.m10676a(this.f29840p0, this.f29841q0, c13693c, obj2, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return obj;
    }

    @Override // p049Bm.InterfaceC1442q
    /* JADX INFO: renamed from: j */
    public final Object mo2052j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ArrayList arrayList = this.f29840p0;
        Set set = this.f29841q0;
        C10080e c10080e = new C10080e(this.f29842r0, arrayList, set, (InterfaceC18770c) obj5);
        c10080e.f29838Z = (C13693c) obj2;
        c10080e.f29839o0 = obj3;
        return c10080e.invokeSuspend(C17296C.f55119a);
    }
}
