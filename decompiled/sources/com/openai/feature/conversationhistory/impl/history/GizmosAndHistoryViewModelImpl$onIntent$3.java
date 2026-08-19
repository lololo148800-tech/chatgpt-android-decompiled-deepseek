package com.openai.feature.conversationhistory.impl.history;

import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1062vd.C20523C;
import p1062vd.C20572v;
import p1062vd.InterfaceC20539T;
import p1081wc.C20857C;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl$onIntent$3", m20656f = "GizmosAndHistoryViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class GizmosAndHistoryViewModelImpl$onIntent$3 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ GizmosAndHistoryViewModelImpl f37437Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC20539T f37438Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GizmosAndHistoryViewModelImpl$onIntent$3(GizmosAndHistoryViewModelImpl gizmosAndHistoryViewModelImpl, InterfaceC20539T interfaceC20539T, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f37437Y = gizmosAndHistoryViewModelImpl;
        this.f37438Z = interfaceC20539T;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new GizmosAndHistoryViewModelImpl$onIntent$3(this.f37437Y, this.f37438Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        GizmosAndHistoryViewModelImpl$onIntent$3 gizmosAndHistoryViewModelImpl$onIntent$3 = (GizmosAndHistoryViewModelImpl$onIntent$3) create((InterfaceC18770c) obj);
        C17296C c17296c = C17296C.f55119a;
        gizmosAndHistoryViewModelImpl$onIntent$3.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        String str = ((C20523C) this.f37438Z).f65150a;
        C20857C c20857c = C20857C.f66334p;
        GizmosAndHistoryViewModelImpl gizmosAndHistoryViewModelImpl = this.f37437Y;
        gizmosAndHistoryViewModelImpl.f37374n.mo21447a(c20857c, C17690x.f56481Y);
        if (str != null) {
            gizmosAndHistoryViewModelImpl.m14392g(new C20572v(str));
        } else {
            AbstractC8160o6.m8727b(gizmosAndHistoryViewModelImpl.f37376p, "Conversation does not have a known remote ID", null, 6);
        }
        return C17296C.f55119a;
    }
}
