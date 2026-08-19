package com.openai.feature.settings.impl.settings;

import kotlin.Metadata;
import mh.EnumC17264l;
import mm.C17296C;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1436k;
import p1081wc.C20906y;
import p482Tg.C7431O;
import p482Tg.InterfaceC7436U;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.settings.impl.settings.SettingsViewModelImpl$onIntent$3", m20656f = "SettingsViewModel.kt", m20657l = {220}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class SettingsViewModelImpl$onIntent$3 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f39737Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ SettingsViewModelImpl f39738Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC7436U f39739o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModelImpl$onIntent$3(SettingsViewModelImpl settingsViewModelImpl, InterfaceC7436U interfaceC7436U, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f39738Z = settingsViewModelImpl;
        this.f39739o0 = interfaceC7436U;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new SettingsViewModelImpl$onIntent$3(this.f39738Z, this.f39739o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((SettingsViewModelImpl$onIntent$3) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f39737Y;
        C17296C c17296c = C17296C.f55119a;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            EnumC17264l enumC17264l = ((C7431O) this.f39739o0).f23515a;
            this.f39737Y = 1;
            SettingsViewModelImpl settingsViewModelImpl = this.f39738Z;
            settingsViewModelImpl.getClass();
            settingsViewModelImpl.f39723n.mo21447a(C20906y.f66638h, AbstractC0168G.m535x("code", enumC17264l.f55064Y));
            Object objM14815l = settingsViewModelImpl.f39720k.m14815l(enumC17264l.f55064Y, this);
            if (objM14815l != enumC19250a) {
                objM14815l = c17296c;
            }
            if (objM14815l == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return c17296c;
    }
}
