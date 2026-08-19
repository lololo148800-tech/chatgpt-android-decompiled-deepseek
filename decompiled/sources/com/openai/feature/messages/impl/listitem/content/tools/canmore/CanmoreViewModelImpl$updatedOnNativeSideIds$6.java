package com.openai.feature.messages.impl.listitem.content.tools.canmore;

import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p103Dn.AbstractC2124C;
import p103Dn.C2207t0;
import p216Id.C3694b;
import p216Id.InterfaceC3698f;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;
import ye.C21514c;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl$updatedOnNativeSideIds$6", m20656f = "CanmoreViewModel.kt", m20657l = {149}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lye/c;", "it", "Lmm/C;", "<anonymous>", "(Lye/c;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class CanmoreViewModelImpl$updatedOnNativeSideIds$6 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f38935Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ CanmoreViewModelImpl f38936Z;

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl$updatedOnNativeSideIds$6$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl$updatedOnNativeSideIds$6$1", m20656f = "CanmoreViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LId/b;", "s", "", "<anonymous>", "(LId/b;)Z"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124401 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f38937Y;

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C124401 c124401 = new C124401(2, interfaceC18770c);
            c124401.f38937Y = obj;
            return c124401;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C124401) create((C3694b) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            return Boolean.valueOf(!(((C3694b) this.f38937Y).f11220e instanceof InterfaceC3698f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CanmoreViewModelImpl$updatedOnNativeSideIds$6(CanmoreViewModelImpl canmoreViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f38936Z = canmoreViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new CanmoreViewModelImpl$updatedOnNativeSideIds$6(this.f38936Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        String str = ((C21514c) obj).f68131a;
        return new CanmoreViewModelImpl$updatedOnNativeSideIds$6(this.f38936Z, (InterfaceC18770c) obj2).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f38935Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C2207t0 c2207t0 = this.f38936Z.f38868l.f45526y;
            C124401 c124401 = new C124401(2, null);
            this.f38935Y = 1;
            if (AbstractC2124C.m3220s(c2207t0, c124401, this) == enumC19250a) {
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
