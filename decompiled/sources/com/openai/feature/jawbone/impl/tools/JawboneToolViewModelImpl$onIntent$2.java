package com.openai.feature.jawbone.impl.tools;

import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9233X;
import p891mf.C17243d;
import p891mf.InterfaceC17246g;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.jawbone.impl.tools.JawboneToolViewModelImpl$onIntent$2", m20656f = "JawboneToolViewModelImpl.kt", m20657l = {97}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class JawboneToolViewModelImpl$onIntent$2 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f38459Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ JawboneToolViewModelImpl f38460Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC17246g f38461o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JawboneToolViewModelImpl$onIntent$2(JawboneToolViewModelImpl jawboneToolViewModelImpl, InterfaceC17246g interfaceC17246g, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f38460Z = jawboneToolViewModelImpl;
        this.f38461o0 = interfaceC17246g;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new JawboneToolViewModelImpl$onIntent$2(this.f38460Z, this.f38461o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((JawboneToolViewModelImpl$onIntent$2) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f38459Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C17243d c17243d = (C17243d) this.f38461o0;
            String str = c17243d.f55021a;
            boolean z6 = c17243d.f55022b;
            this.f38459Y = 1;
            if (JawboneToolViewModelImpl.m14293n(this.f38460Z, str, z6, this) == enumC19250a) {
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
