package com.openai.feature.settings.impl.memory;

import kotlin.Metadata;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p098Di.C2059h;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p406Qg.C6717m;
import p406Qg.InterfaceC6721q;
import p571X9.AbstractC9233X;
import p708dh.C13132J;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.settings.impl.memory.MemorySettingsViewModelImpl$onIntent$2", m20656f = "MemorySettingsViewModel.kt", m20657l = {103}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class MemorySettingsViewModelImpl$onIntent$2 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f39632Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ MemorySettingsViewModelImpl f39633Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC6721q f39634o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemorySettingsViewModelImpl$onIntent$2(MemorySettingsViewModelImpl memorySettingsViewModelImpl, InterfaceC6721q interfaceC6721q, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f39633Z = memorySettingsViewModelImpl;
        this.f39634o0 = interfaceC6721q;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new MemorySettingsViewModelImpl$onIntent$2(this.f39633Z, this.f39634o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((MemorySettingsViewModelImpl$onIntent$2) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f39632Y;
        InterfaceC6721q interfaceC6721q = this.f39634o0;
        MemorySettingsViewModelImpl memorySettingsViewModelImpl = this.f39633Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C13132J c13132j = memorySettingsViewModelImpl.f39620i;
            boolean z6 = ((C6717m) interfaceC6721q).f21585a;
            this.f39632Y = 1;
            obj = c13132j.m14808e(z6, this);
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
        if (abstractC21955Q1 instanceof C21952P1) {
            memorySettingsViewModelImpl.m14397m(new MemorySettingsViewModelImpl$onIntent$2$1$1(interfaceC6721q));
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            memorySettingsViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
        } else if (!(abstractC21955Q1 instanceof C21929J1)) {
            throw new C0644w();
        }
        return C17296C.f55119a;
    }
}
