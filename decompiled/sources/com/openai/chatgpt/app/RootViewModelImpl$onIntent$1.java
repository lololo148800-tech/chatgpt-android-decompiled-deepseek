package com.openai.chatgpt.app;

import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p092Dc.C2005v;
import p190Hc.InterfaceC3283d;
import p571X9.AbstractC9233X;
import p708dh.C13166t;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.chatgpt.app.RootViewModelImpl$onIntent$1", m20656f = "RootViewModelImpl.kt", m20657l = {145}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class RootViewModelImpl$onIntent$1 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f37200Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ RootViewModelImpl f37201Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RootViewModelImpl$onIntent$1(RootViewModelImpl rootViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f37201Z = rootViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new RootViewModelImpl$onIntent$1(this.f37201Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((RootViewModelImpl$onIntent$1) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        C13166t c13166t;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f37200Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC3283d interfaceC3283d = (InterfaceC3283d) this.f37201Z.f37187i.f10025s0.f6797Y.getValue();
            C2005v c2005v = interfaceC3283d instanceof C2005v ? (C2005v) interfaceC3283d : null;
            if (c2005v != null && (c13166t = (C13166t) c2005v.f6148p.get()) != null) {
                this.f37200Y = 1;
                if (c13166t.m14826a(this) == enumC19250a) {
                    return enumC19250a;
                }
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
