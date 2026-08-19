package com.openai.feature.conversations.impl.input;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1025te.C19856G;
import p1025te.C19863N;
import p1025te.InterfaceC19862M;
import p1081wc.C20859E;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17659D;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.input.InputViewModelImpl$onIntent$5", m20656f = "InputViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class InputViewModelImpl$onIntent$5 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InputViewModelImpl f37948Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC19862M f37949Z;

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.input.InputViewModelImpl$onIntent$5$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lte/N;", "invoke", "(Lte/N;)Lte/N;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123331 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ InterfaceC19862M f37950Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123331(InterfaceC19862M interfaceC19862M) {
            super(1);
            this.f37950Y = interfaceC19862M;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C19863N update = (C19863N) obj;
            AbstractC16544l.m18094g(update, "$this$update");
            return C19863N.m20780a(update, null, false, AbstractC17659D.m19245g(update.f62956c, ((C19856G) this.f37950Y).f62948a), null, false, null, null, null, 251);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputViewModelImpl$onIntent$5(InputViewModelImpl inputViewModelImpl, InterfaceC19862M interfaceC19862M, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f37948Y = inputViewModelImpl;
        this.f37949Z = interfaceC19862M;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new InputViewModelImpl$onIntent$5(this.f37948Y, this.f37949Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        InputViewModelImpl$onIntent$5 inputViewModelImpl$onIntent$5 = (InputViewModelImpl$onIntent$5) create((InterfaceC18770c) obj);
        C17296C c17296c = C17296C.f55119a;
        inputViewModelImpl$onIntent$5.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        InputViewModelImpl inputViewModelImpl = this.f37948Y;
        inputViewModelImpl.f37890r.mo21447a(C20859E.f66357k, C17690x.f56481Y);
        inputViewModelImpl.f37883k.m20781a(new C123331(this.f37949Z));
        return C17296C.f55119a;
    }
}
