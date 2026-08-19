package com.openai.feature.conversationhistory.impl.history;

import kotlin.Metadata;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p576Xe.C9473F;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl$refresh$4", m20656f = "GizmosAndHistoryViewModel.kt", m20657l = {301}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class GizmosAndHistoryViewModelImpl$refresh$4 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f37464Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ GizmosAndHistoryViewModelImpl f37465Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GizmosAndHistoryViewModelImpl$refresh$4(GizmosAndHistoryViewModelImpl gizmosAndHistoryViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f37465Z = gizmosAndHistoryViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new GizmosAndHistoryViewModelImpl$refresh$4(this.f37465Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((GizmosAndHistoryViewModelImpl$refresh$4) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f37464Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C9473F c9473f = this.f37465Z.f37371k;
            this.f37464Y = 1;
            if (c9473f.m10017p(this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
