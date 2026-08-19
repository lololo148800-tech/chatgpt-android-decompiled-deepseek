package com.openai.viewmodel;

import android.gov.nist.javax.sip.parser.TokenNames;
import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p098Di.InterfaceC2052a;
import p103Dn.C2127D0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.viewmodel.BaseViewModel$emitEffect$2", m20656f = "BaseViewModel.kt", m20657l = {124}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\b\b\u0002\u0010\u0005*\u00020\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, m18067d2 = {"LDi/k;", TokenNames.f32018S, "LDi/b;", TokenNames.f32012I, "LDi/a;", TokenNames.f32010E, "Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class BaseViewModel$emitEffect$2 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f40354Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ BaseViewModel f40355Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC2052a f40356o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewModel$emitEffect$2(BaseViewModel baseViewModel, InterfaceC2052a interfaceC2052a, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f40355Z = baseViewModel;
        this.f40356o0 = interfaceC2052a;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new BaseViewModel$emitEffect$2(this.f40355Z, this.f40356o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((BaseViewModel$emitEffect$2) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f40354Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C2127D0 c2127d0 = this.f40355Z.f40345e;
            this.f40354Y = 1;
            if (c2127d0.mo395a(this.f40356o0, this) == enumC19250a) {
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
