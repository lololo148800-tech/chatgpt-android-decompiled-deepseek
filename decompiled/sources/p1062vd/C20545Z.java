package p1062vd;

import com.google.protobuf.AbstractC12107L1;
import com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModel;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p547Wc.C8775T;
import p547Wc.EnumC8776U;
import p571X9.AbstractC9233X;
import p737f1.InterfaceC13515g;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: vd.Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C20545Z extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C8775T f65180Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC13515g f65181Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ GizmosAndHistoryViewModel f65182o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20545Z(C8775T c8775t, InterfaceC13515g interfaceC13515g, GizmosAndHistoryViewModel gizmosAndHistoryViewModel, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f65180Y = c8775t;
        this.f65181Z = interfaceC13515g;
        this.f65182o0 = gizmosAndHistoryViewModel;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C20545Z(this.f65180Y, this.f65181Z, this.f65182o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C20545Z c20545z = (C20545Z) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c20545z.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C8775T c8775t = this.f65180Y;
        if (c8775t != null && c8775t.m9529a() != EnumC8776U.f26771o0) {
            AbstractC12107L1.m13813d(this.f65181Z);
        }
        this.f65182o0.m14395k(new C20532L((c8775t != null ? c8775t.m9529a() : null) != EnumC8776U.f26769Y));
        return C17296C.f55119a;
    }
}
