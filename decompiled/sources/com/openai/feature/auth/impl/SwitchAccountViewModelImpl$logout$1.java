package com.openai.feature.auth.impl;

import android.content.Context;
import kotlin.Metadata;
import mm.C17296C;
import p014Ac.AbstractC0424a;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9233X;
import p905nd.C17589q;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.auth.impl.SwitchAccountViewModelImpl$logout$1", m20656f = "SwitchAccountViewModelImpl.kt", m20657l = {45}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class SwitchAccountViewModelImpl$logout$1 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f37285Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ SwitchAccountViewModelImpl f37286Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Context f37287o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchAccountViewModelImpl$logout$1(SwitchAccountViewModelImpl switchAccountViewModelImpl, Context context, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f37286Z = switchAccountViewModelImpl;
        this.f37287o0 = context;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new SwitchAccountViewModelImpl$logout$1(this.f37286Z, this.f37287o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((SwitchAccountViewModelImpl$logout$1) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f37285Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            AbstractC0424a abstractC0424a = this.f37286Z.f37264j;
            this.f37285Y = 1;
            if (((C17589q) abstractC0424a).m19224j(this.f37287o0, this) == enumC19250a) {
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
