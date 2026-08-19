package com.openai.feature.auth.impl;

import android.content.Context;
import kotlin.Metadata;
import mm.C17296C;
import p014Ac.AbstractC0424a;
import p049Bm.InterfaceC1436k;
import p1155zi.AbstractC22014i;
import p1155zi.C22010h;
import p552Wg.C8847i;
import p571X9.AbstractC9233X;
import p708dh.C13166t;
import p905nd.C17589q;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.auth.impl.SwitchAccountViewModelImpl$switchAccount$1", m20656f = "SwitchAccountViewModelImpl.kt", m20657l = {58, 59, 60}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class SwitchAccountViewModelImpl$switchAccount$1 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f37288Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC22014i f37289Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ SwitchAccountViewModelImpl f37290o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f37291p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Context f37292q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchAccountViewModelImpl$switchAccount$1(AbstractC22014i abstractC22014i, SwitchAccountViewModelImpl switchAccountViewModelImpl, String str, Context context, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f37289Z = abstractC22014i;
        this.f37290o0 = switchAccountViewModelImpl;
        this.f37291p0 = str;
        this.f37292q0 = context;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new SwitchAccountViewModelImpl$switchAccount$1(this.f37289Z, this.f37290o0, this.f37291p0, this.f37292q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((SwitchAccountViewModelImpl$switchAccount$1) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f37288Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            SwitchAccountViewModelImpl switchAccountViewModelImpl = this.f37290o0;
            AbstractC22014i abstractC22014i = this.f37289Z;
            if (abstractC22014i == null || !abstractC22014i.f69662a) {
                boolean z6 = abstractC22014i instanceof C22010h;
                Context context = this.f37292q0;
                if (z6) {
                    this.f37288Y = 2;
                    if (SwitchAccountViewModelImpl.m14232p(switchAccountViewModelImpl, context, (C22010h) abstractC22014i, this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    AbstractC0424a abstractC0424a = switchAccountViewModelImpl.f37264j;
                    this.f37288Y = 3;
                    if (((C17589q) abstractC0424a).m19224j(context, this) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            } else {
                C13166t c13166t = switchAccountViewModelImpl.f37263i;
                this.f37288Y = 1;
                c13166t.getClass();
                Object objM21029b = c13166t.f41797a.m21029b(new C8847i(c13166t, 20, this.f37291p0), this);
                if (objM21029b != enumC19250a) {
                    objM21029b = c17296c;
                }
                if (objM21029b == enumC19250a) {
                    return enumC19250a;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
