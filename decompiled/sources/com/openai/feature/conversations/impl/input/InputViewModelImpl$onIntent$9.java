package com.openai.feature.conversations.impl.input;

import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1025te.C19864O;
import p1025te.C19866Q;
import p1025te.C19867S;
import p1025te.C19868T;
import p1025te.C19889t;
import p1025te.InterfaceC19862M;
import p523V9.AbstractC7845A4;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.input.InputViewModelImpl$onIntent$9", m20656f = "InputViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class InputViewModelImpl$onIntent$9 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InputViewModelImpl f37953Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC19862M f37954Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputViewModelImpl$onIntent$9(InputViewModelImpl inputViewModelImpl, InterfaceC19862M interfaceC19862M, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f37953Y = inputViewModelImpl;
        this.f37954Z = interfaceC19862M;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new InputViewModelImpl$onIntent$9(this.f37953Y, this.f37954Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        InputViewModelImpl$onIntent$9 inputViewModelImpl$onIntent$9 = (InputViewModelImpl$onIntent$9) create((InterfaceC18770c) obj);
        C17296C c17296c = C17296C.f55119a;
        inputViewModelImpl$onIntent$9.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        boolean z6 = ((C19889t) this.f37954Z).f63034a;
        int i10 = InputViewModelImpl.f37880t;
        InputViewModelImpl inputViewModelImpl = this.f37953Y;
        if (z6) {
            AbstractC7845A4 abstractC7845A4 = ((C19866Q) inputViewModelImpl.m14391f()).f62987r;
            boolean z10 = abstractC7845A4 instanceof C19867S;
            C19864O c19864o = inputViewModelImpl.f37883k;
            if (z10) {
                c19864o.m20781a(new InputViewModelImpl$onPendingImageToReplaceResponse$1$1(abstractC7845A4));
            } else if (abstractC7845A4 instanceof C19868T) {
                c19864o.m20781a(new InputViewModelImpl$onPendingImageToReplaceResponse$1$2(abstractC7845A4));
            }
        } else {
            inputViewModelImpl.getClass();
        }
        inputViewModelImpl.m14397m(InputViewModelImpl$onPendingImageToReplaceResponse$2.f37957Y);
        return C17296C.f55119a;
    }
}
