package com.openai.feature.conversations.impl.anonymous;

import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p1149zc.AbstractC21864z;
import p571X9.AbstractC9233X;
import p905nd.C17589q;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.anonymous.AnonymousSidebarViewModelImpl$onIntent$1", m20656f = "AnonymousSidebarViewModel.kt", m20657l = {51}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class AnonymousSidebarViewModelImpl$onIntent$1 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f37544Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AnonymousSidebarViewModelImpl f37545Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousSidebarViewModelImpl$onIntent$1(AnonymousSidebarViewModelImpl anonymousSidebarViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f37545Z = anonymousSidebarViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new AnonymousSidebarViewModelImpl$onIntent$1(this.f37545Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((AnonymousSidebarViewModelImpl$onIntent$1) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f37544Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            AbstractC21864z abstractC21864z = this.f37545Z.f37542i;
            this.f37544Y = 1;
            if (((C17589q) abstractC21864z).m19226l(this) == enumC19250a) {
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
