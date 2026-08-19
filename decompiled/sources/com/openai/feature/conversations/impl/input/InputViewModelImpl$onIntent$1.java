package com.openai.feature.conversations.impl.input;

import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1025te.C19852C;
import p1025te.EnumC19873d;
import p1025te.InterfaceC19862M;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.input.InputViewModelImpl$onIntent$1", m20656f = "InputViewModelImpl.kt", m20657l = {326}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class InputViewModelImpl$onIntent$1 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f37942Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InputViewModelImpl f37943Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC19862M f37944o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputViewModelImpl$onIntent$1(InputViewModelImpl inputViewModelImpl, InterfaceC19862M interfaceC19862M, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f37943Z = inputViewModelImpl;
        this.f37944o0 = interfaceC19862M;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new InputViewModelImpl$onIntent$1(this.f37943Z, this.f37944o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((InputViewModelImpl$onIntent$1) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f37942Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19852C c19852c = (C19852C) this.f37944o0;
            EnumC19873d enumC19873d = c19852c.f62943a;
            boolean z6 = c19852c.f62944b;
            this.f37942Y = 1;
            int i11 = InputViewModelImpl.f37880t;
            if (this.f37943Z.m14262n(enumC19873d, z6, this) == enumC19250a) {
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
