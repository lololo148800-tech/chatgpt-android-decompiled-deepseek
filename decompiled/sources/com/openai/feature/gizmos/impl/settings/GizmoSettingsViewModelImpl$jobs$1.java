package com.openai.feature.gizmos.impl.settings;

import bf.C11349D;
import kotlin.Metadata;
import mm.C17296C;
import p025An.C0644w;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p098Di.C2059h;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p571X9.AbstractC9233X;
import p576Xe.C9473F;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.gizmos.impl.settings.GizmoSettingsViewModelImpl$jobs$1", m20656f = "GizmoSettingsViewModel.kt", m20657l = {65}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class GizmoSettingsViewModelImpl$jobs$1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f38148Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ GizmoSettingsViewModelImpl f38149Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GizmoSettingsViewModelImpl$jobs$1(GizmoSettingsViewModelImpl gizmoSettingsViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f38149Z = gizmoSettingsViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new GizmoSettingsViewModelImpl$jobs$1(this.f38149Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((GizmoSettingsViewModelImpl$jobs$1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f38148Y;
        GizmoSettingsViewModelImpl gizmoSettingsViewModelImpl = this.f38149Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C9473F c9473f = gizmoSettingsViewModelImpl.f38141i;
            this.f38148Y = 1;
            obj = c9473f.m10005d(gizmoSettingsViewModelImpl.f38143k, true, this);
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
            gizmoSettingsViewModelImpl.m14397m(new GizmoSettingsViewModelImpl$jobs$1$1$1((C11349D) ((C21952P1) abstractC21955Q1).f69511a));
        } else if (abstractC21955Q1 instanceof AbstractC21933K1) {
            gizmoSettingsViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
        } else {
            if (!(abstractC21955Q1 instanceof C21929J1)) {
                throw new C0644w();
            }
            gizmoSettingsViewModelImpl.m14397m(new GizmoSettingsViewModelImpl$jobs$1$1$1(null));
        }
        return C17296C.f55119a;
    }
}
