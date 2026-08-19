package p1114xp;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: xp.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C21344o extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C21346q f67803Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C21333d f67804Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21344o(C21346q c21346q, C21333d c21333d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f67803Y = c21346q;
        this.f67804Z = c21333d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c completion) {
        AbstractC16544l.m18094g(completion, "completion");
        return new C21344o(this.f67803Y, this.f67804Z, completion);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C21344o c21344o = (C21344o) create(obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c21344o.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f67803Y.f67808b.add(this.f67804Z);
        return C17296C.f55119a;
    }
}
