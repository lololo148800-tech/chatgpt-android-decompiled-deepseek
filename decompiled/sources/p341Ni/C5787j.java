package p341Ni;

import java.util.ArrayList;
import java.util.Iterator;
import mm.C17296C;
import p013Ab.C0420b;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ni.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C5787j extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public C0420b f18890Y;

    /* JADX INFO: renamed from: Z */
    public Iterator f18891Z;

    /* JADX INFO: renamed from: o0 */
    public int f18892o0;

    /* JADX INFO: renamed from: p0 */
    public int f18893p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ ArrayList f18894q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C0420b f18895r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ int f18896s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5787j(ArrayList arrayList, C0420b c0420b, int i10, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f18894q0 = arrayList;
        this.f18895r0 = c0420b;
        this.f18896s0 = i10;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C5787j(this.f18894q0, this.f18895r0, this.f18896s0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5787j) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C0420b c0420b;
        int i10;
        Iterator it;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = this.f18893p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            Iterator it2 = this.f18894q0.iterator();
            c0420b = this.f18895r0;
            i10 = this.f18896s0;
            it = it2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.f18892o0;
            it = this.f18891Z;
            c0420b = this.f18890Y;
            AbstractC9233X.m9807c(obj);
        }
        while (it.hasNext()) {
            ((InterfaceC1436k) c0420b.f1383p0).invoke((byte[]) it.next());
            this.f18890Y = c0420b;
            this.f18891Z = it;
            this.f18892o0 = i10;
            this.f18893p0 = 1;
            if (AbstractC0575H.m1184m(((long) i10) / ((long) 2), this) == enumC19250a) {
                return enumC19250a;
            }
        }
        return C17296C.f55119a;
    }
}
