package com.openai.feature.jawbone.impl.tools;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21917G1;
import p1155zi.C21921H1;
import p1155zi.InterfaceC21925I1;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p871lf.C16934r;
import p891mf.C17244e;
import p891mf.C17247h;
import p891mf.InterfaceC17246g;
import p909nm.AbstractC17659D;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.jawbone.impl.tools.JawboneToolViewModelImpl$onIntent$1", m20656f = "JawboneToolViewModelImpl.kt", m20657l = {82}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class JawboneToolViewModelImpl$onIntent$1 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f38453Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ JawboneToolViewModelImpl f38454Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC17246g f38455o0;

    /* JADX INFO: renamed from: com.openai.feature.jawbone.impl.tools.JawboneToolViewModelImpl$onIntent$1$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmf/h;", "invoke", "(Lmf/h;)Lmf/h;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123871 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ InterfaceC17246g f38456Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123871(InterfaceC17246g interfaceC17246g) {
            super(1);
            this.f38456Y = interfaceC17246g;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C17247h setState = (C17247h) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return C17247h.m18969e(setState, AbstractC17659D.m19249k(setState.f55026a, new C17309l(new C16934r(((C17244e) this.f38456Y).f55023a), C21917G1.f69468a)), null, false, 14);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JawboneToolViewModelImpl$onIntent$1(JawboneToolViewModelImpl jawboneToolViewModelImpl, InterfaceC17246g interfaceC17246g, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f38454Z = jawboneToolViewModelImpl;
        this.f38455o0 = interfaceC17246g;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new JawboneToolViewModelImpl$onIntent$1(this.f38454Z, this.f38455o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((JawboneToolViewModelImpl$onIntent$1) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f38453Y;
        InterfaceC17246g interfaceC17246g = this.f38455o0;
        JawboneToolViewModelImpl jawboneToolViewModelImpl = this.f38454Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C17244e c17244e = (C17244e) interfaceC17246g;
            if (!(((C17247h) jawboneToolViewModelImpl.m14391f()).f55026a.get(new C16934r(c17244e.f55023a)) instanceof C21921H1)) {
                jawboneToolViewModelImpl.m14397m(new C123871(interfaceC17246g));
            }
            String str = c17244e.f55023a;
            this.f38453Y = 1;
            obj = jawboneToolViewModelImpl.f38435i.m17972b(str, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) obj;
        if (abstractC21955Q1 instanceof AbstractC21933K1) {
            AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
            AbstractC8160o6.m8727b(jawboneToolViewModelImpl.f38442p, "Jawbone tool failed to fetch", abstractC21933K1.f69485a, 4);
            InterfaceC21925I1 interfaceC21925I1 = (InterfaceC21925I1) ((C17247h) jawboneToolViewModelImpl.m14391f()).f55026a.get(new C16934r(((C17244e) interfaceC17246g).f55023a));
            if (interfaceC21925I1 == null || (interfaceC21925I1 instanceof C21917G1)) {
                jawboneToolViewModelImpl.m14397m(new JawboneToolViewModelImpl$onIntent$1$2$1(interfaceC17246g, abstractC21933K1));
            }
        }
        return C17296C.f55119a;
    }
}
