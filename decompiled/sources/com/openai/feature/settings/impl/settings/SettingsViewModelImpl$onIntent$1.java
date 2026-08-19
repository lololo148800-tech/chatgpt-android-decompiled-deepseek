package com.openai.feature.settings.impl.settings;

import kotlin.Metadata;
import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p098Di.C2058g;
import p1081wc.C20856B;
import p1155zi.C21891A;
import p1155zi.C21957R1;
import p1155zi.EnumC21905D1;
import p318Mh.EnumC5424s0;
import p482Tg.C7439X;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17660E;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.settings.impl.settings.SettingsViewModelImpl$onIntent$1", m20656f = "SettingsViewModel.kt", m20657l = {173}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class SettingsViewModelImpl$onIntent$1 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f39734Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ SettingsViewModelImpl f39735Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModelImpl$onIntent$1(SettingsViewModelImpl settingsViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f39735Z = settingsViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new SettingsViewModelImpl$onIntent$1(this.f39735Z, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((SettingsViewModelImpl$onIntent$1) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Object objM12798c;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f39734Y;
        SettingsViewModelImpl settingsViewModelImpl = this.f39735Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C21891A c21891a = ((C7439X) settingsViewModelImpl.m14391f()).f23540a;
            EnumC21905D1 enumC21905D1M22327f = c21891a != null ? c21891a.m22327f() : null;
            C20856B c20856b = C20856B.f66313p;
            String str = enumC21905D1M22327f != null ? enumC21905D1M22327f.f69449Y : null;
            if (str == null) {
                str = "";
            }
            settingsViewModelImpl.f39723n.mo21447a(c20856b, AbstractC17660E.m19258c(new C17309l("current_plan", str)));
            EnumC5424s0 enumC5424s0 = EnumC5424s0.Settings;
            this.f39734Y = 1;
            objM12798c = settingsViewModelImpl.f39724o.m12798c(enumC5424s0, this);
            if (objM12798c == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            objM12798c = ((C21957R1) obj).f69517a;
        }
        settingsViewModelImpl.m14393h(new C2058g((String) objM12798c, true));
        return C17296C.f55119a;
    }
}
