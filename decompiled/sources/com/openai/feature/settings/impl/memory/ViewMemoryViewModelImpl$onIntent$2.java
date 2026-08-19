package com.openai.feature.settings.impl.memory;

import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p406Qg.C6693D;
import p406Qg.InterfaceC6699J;
import p506Ug.C7671f;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.settings.impl.memory.ViewMemoryViewModelImpl$onIntent$2", m20656f = "ViewMemoryViewModel.kt", m20657l = {99}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ViewMemoryViewModelImpl$onIntent$2 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f39681Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ViewMemoryViewModelImpl f39682Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC6699J f39683o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewMemoryViewModelImpl$onIntent$2(ViewMemoryViewModelImpl viewMemoryViewModelImpl, InterfaceC6699J interfaceC6699J, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f39682Z = viewMemoryViewModelImpl;
        this.f39683o0 = interfaceC6699J;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new ViewMemoryViewModelImpl$onIntent$2(this.f39682Z, this.f39683o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((ViewMemoryViewModelImpl$onIntent$2) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f39681Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C7671f c7671f = ((C6693D) this.f39683o0).f21522a;
            this.f39681Y = 1;
            if (ViewMemoryViewModelImpl.m14359n(this.f39682Z, c7671f, this) == enumC19250a) {
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
