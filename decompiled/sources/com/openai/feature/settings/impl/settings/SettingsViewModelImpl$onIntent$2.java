package com.openai.feature.settings.impl.settings;

import bh.C11434h;
import kotlin.Metadata;
import mm.C17296C;
import mm.C17309l;
import p017Af.C0491v;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p098Di.C2055d;
import p098Di.C2058g;
import p098Di.InterfaceC2061j;
import p1081wc.C20856B;
import p1155zi.C21891A;
import p1155zi.EnumC21905D1;
import p165G9.AbstractC3021g;
import p318Mh.C5391c;
import p318Mh.C5413n;
import p318Mh.C5428u0;
import p482Tg.C7439X;
import p571X9.AbstractC9233X;
import p624Zg.AbstractC10392x;
import p624Zg.C10388t;
import p624Zg.C10389u;
import p909nm.AbstractC17660E;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.settings.impl.settings.SettingsViewModelImpl$onIntent$2", m20656f = "SettingsViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class SettingsViewModelImpl$onIntent$2 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ SettingsViewModelImpl f39736Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModelImpl$onIntent$2(SettingsViewModelImpl settingsViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f39736Y = settingsViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new SettingsViewModelImpl$onIntent$2(this.f39736Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        SettingsViewModelImpl$onIntent$2 settingsViewModelImpl$onIntent$2 = (SettingsViewModelImpl$onIntent$2) create((InterfaceC18770c) obj);
        C17296C c17296c = C17296C.f55119a;
        settingsViewModelImpl$onIntent$2.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        AbstractC3021g c10388t;
        InterfaceC2061j c2058g;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        SettingsViewModelImpl settingsViewModelImpl = this.f39736Y;
        C21891A c21891a = ((C7439X) settingsViewModelImpl.m14391f()).f23540a;
        EnumC21905D1 enumC21905D1M22327f = c21891a != null ? c21891a.m22327f() : null;
        C20856B c20856b = C20856B.f66306i;
        String str = enumC21905D1M22327f != null ? enumC21905D1M22327f.f69449Y : null;
        if (str == null) {
            str = "";
        }
        settingsViewModelImpl.f39723n.mo21447a(c20856b, AbstractC17660E.m19258c(new C17309l("current_plan", str)));
        C11434h c11434h = settingsViewModelImpl.f39724o;
        String strM12796a = c11434h.m12796a();
        if (strM12796a != null) {
            C5428u0 c5428u0 = C5428u0.f17738g;
            c5428u0.getClass();
            c10388t = new C10389u(c5428u0.m5885a(new C0491v(strM12796a, 28)));
        } else if (c11434h.f34547a.f58774b.m22327f() == EnumC21905D1.PRO) {
            C5413n c5413n = C5413n.f17693h;
            c5413n.getClass();
            c10388t = new C10389u(c5413n.m5885a(C5391c.f17646Z));
        } else {
            c10388t = new C10388t(AbstractC10392x.f30801a);
        }
        if (c10388t instanceof C10388t) {
            c2058g = new C2055d(((C10388t) c10388t).f30789c);
        } else {
            if (!(c10388t instanceof C10389u)) {
                throw new C0644w();
            }
            c2058g = new C2058g(((C10389u) c10388t).f30790c, true);
        }
        settingsViewModelImpl.m14393h(c2058g);
        return C17296C.f55119a;
    }
}
