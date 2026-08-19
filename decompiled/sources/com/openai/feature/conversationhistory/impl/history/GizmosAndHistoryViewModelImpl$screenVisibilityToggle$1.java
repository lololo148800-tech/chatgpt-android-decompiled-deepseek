package com.openai.feature.conversationhistory.impl.history;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1062vd.C20549b0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl$screenVisibilityToggle$1", m20656f = "GizmosAndHistoryViewModel.kt", m20657l = {268}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class GizmosAndHistoryViewModelImpl$screenVisibilityToggle$1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f37476Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ GizmosAndHistoryViewModelImpl f37477Z;

    /* JADX INFO: renamed from: com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl$screenVisibilityToggle$1$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lvd/b0;", "invoke", "(Lvd/b0;)Lvd/b0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C122481 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public static final C122481 f37478Y = new C122481();

        public C122481() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C20549b0 setState = (C20549b0) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return C20549b0.m21187e(setState, true, false, false, null, null, null, null, false, null, null, false, null, null, null, null, null, null, false, 2097150);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl$screenVisibilityToggle$1$2 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lvd/b0;", "invoke", "(Lvd/b0;)Lvd/b0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C122492 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public static final C122492 f37479Y = new C122492();

        public C122492() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C20549b0 setState = (C20549b0) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return C20549b0.m21187e(setState, false, false, false, null, null, null, null, false, null, null, false, null, null, null, null, null, null, false, 2097150);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GizmosAndHistoryViewModelImpl$screenVisibilityToggle$1(GizmosAndHistoryViewModelImpl gizmosAndHistoryViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f37477Z = gizmosAndHistoryViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new GizmosAndHistoryViewModelImpl$screenVisibilityToggle$1(this.f37477Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((GizmosAndHistoryViewModelImpl$screenVisibilityToggle$1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f37476Y;
        GizmosAndHistoryViewModelImpl gizmosAndHistoryViewModelImpl = this.f37477Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C122481 c122481 = C122481.f37478Y;
            int i11 = GizmosAndHistoryViewModelImpl.f37368r;
            gizmosAndHistoryViewModelImpl.m14397m(c122481);
            this.f37476Y = 1;
            if (gizmosAndHistoryViewModelImpl.m14243t(null, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        C122492 c122492 = C122492.f37479Y;
        int i12 = GizmosAndHistoryViewModelImpl.f37368r;
        gizmosAndHistoryViewModelImpl.m14397m(c122492);
        return C17296C.f55119a;
    }
}
