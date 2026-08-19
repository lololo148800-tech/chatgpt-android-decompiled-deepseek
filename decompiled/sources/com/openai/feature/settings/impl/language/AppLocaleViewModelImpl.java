package com.openai.feature.settings.impl.language;

import android.app.Application;
import android.os.Build;
import androidx.lifecycle.ViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import p025An.C0644w;
import p098Di.InterfaceC2053b;
import p1072w2.C20793e;
import p1072w2.C20796h;
import p1081wc.C20906y;
import p1081wc.InterfaceC20904w;
import p171Gh.EnumC3058a;
import p383Pg.C6404a;
import p383Pg.C6405b;
import p383Pg.C6408e;
import p501Ub.ExecutorC7613o;
import p523V9.AbstractC8012V5;
import p571X9.AbstractC9327m3;
import p571X9.AbstractC9339o3;
import p817j$.util.Objects;
import p893n.AbstractC17377i;
import p893n.AbstractC17378j;
import p893n.AbstractC17379k;
import p909nm.AbstractC17659D;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding.Container({@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class), @ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9339o3.class)})
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/settings/impl/language/AppLocaleViewModelImpl;", "Lcom/openai/feature/settings/impl/language/AppLocaleViewModel;", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class AppLocaleViewModelImpl extends AppLocaleViewModel {

    /* JADX INFO: renamed from: i */
    public final Application f39613i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC20904w f39614j;

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    public AppLocaleViewModelImpl(Application application, InterfaceC20904w interfaceC20904w) {
        C20793e c20793e;
        Object next;
        Object next2;
        Object next3;
        if (Build.VERSION.SDK_INT >= 33) {
            Object objM19060b = AbstractC17379k.m19060b();
            if (objM19060b != null) {
                c20793e = new C20793e(new C20796h(AbstractC17378j.m19057a(objM19060b)));
            } else {
                c20793e = C20793e.f66055b;
            }
        } else {
            c20793e = AbstractC17379k.f55486o0;
            if (c20793e == null) {
                c20793e = C20793e.f66055b;
            }
        }
        AbstractC16544l.m18093f(c20793e, "getApplicationLocales(...)");
        boolean zIsEmpty = c20793e.f66056a.isEmpty();
        C6408e c6408e = null;
        Locale localeM8334g = zIsEmpty ? null : AbstractC8012V5.m8334g(application);
        if (localeM8334g != null) {
            Iterator it = EnumC3058a.f9225s0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                EnumC3058a enumC3058a = (EnumC3058a) next;
                if (AbstractC16544l.m18089b(enumC3058a.f9226Y.getLanguage(), localeM8334g.getLanguage()) && AbstractC16544l.m18089b(enumC3058a.f9226Y.getCountry(), localeM8334g.getCountry())) {
                    break;
                }
            }
            EnumC3058a enumC3058a2 = (EnumC3058a) next;
            if (enumC3058a2 == null) {
                Iterator it2 = EnumC3058a.f9225s0.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    EnumC3058a enumC3058a3 = (EnumC3058a) next2;
                    if (AbstractC16544l.m18089b(enumC3058a3.f9226Y.getLanguage(), localeM8334g.getLanguage()) && AbstractC16544l.m18089b(enumC3058a3.f9226Y.getScript(), localeM8334g.getScript())) {
                        break;
                    }
                }
                enumC3058a2 = (EnumC3058a) next2;
                if (enumC3058a2 == null) {
                    Iterator it3 = EnumC3058a.f9225s0.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it3.next();
                    } while (!AbstractC16544l.m18089b(((EnumC3058a) next3).f9226Y.getLanguage(), localeM8334g.getLanguage()));
                    enumC3058a2 = (EnumC3058a) next3;
                }
            }
            if (enumC3058a2 != null) {
                C20793e c20793eM21310b = C20793e.m21310b(enumC3058a2.f9226Y.toLanguageTag());
                AbstractC16544l.m18093f(c20793eM21310b, "forLanguageTags(...)");
                c6408e = new C6408e(c20793eM21310b, enumC3058a2.m3926a());
            }
        }
        super(AppLocaleViewModelKt.m14358a(application, c6408e));
        this.f39613i = application;
        this.f39614j = interfaceC20904w;
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        C6404a intent = (C6404a) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (!(intent instanceof C6404a)) {
            throw new C0644w();
        }
        this.f39614j.mo21447a(C20906y.f66633c, AbstractC17659D.m19244f(new C17309l("entryPoint", intent.f20837b.name()), new C17309l("from", ((C6405b) m14391f()).f20839b.f20848b), new C17309l("to", intent.f20836a.f20848b)));
        C20793e c20793e = intent.f20836a.f20847a;
        ExecutorC7613o executorC7613o = AbstractC17379k.f55484Y;
        Objects.requireNonNull(c20793e);
        if (Build.VERSION.SDK_INT >= 33) {
            Object objM19060b = AbstractC17379k.m19060b();
            if (objM19060b != null) {
                AbstractC17378j.m19058b(objM19060b, AbstractC17377i.m19056a(c20793e.f66056a.mo21311a()));
            }
        } else if (!c20793e.equals(AbstractC17379k.f55486o0)) {
            synchronized (AbstractC17379k.f55491t0) {
                AbstractC17379k.f55486o0 = c20793e;
                AbstractC17379k.m19059a();
            }
        }
        m14397m(new AppLocaleViewModelImpl$onIntent$1(this, intent));
    }
}
