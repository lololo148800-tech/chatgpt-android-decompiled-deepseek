package p1114xp;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p225Im.InterfaceC3756d;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: xp.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C21342m extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C21346q f67794Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC3756d f67795Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21342m(C21346q c21346q, InterfaceC3756d interfaceC3756d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f67794Y = c21346q;
        this.f67795Z = interfaceC3756d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c completion) {
        AbstractC16544l.m18094g(completion, "completion");
        return new C21342m(this.f67794Y, this.f67795Z, completion);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C21342m) create(obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        ArrayList arrayList = this.f67794Y.f67807a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (AbstractC16526C.f51263a.mo5693b(((C21332c) obj2).f67763a.getClass()).equals(this.f67795Z)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }
}
