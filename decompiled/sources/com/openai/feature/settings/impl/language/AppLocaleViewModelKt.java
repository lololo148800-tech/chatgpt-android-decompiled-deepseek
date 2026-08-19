package com.openai.feature.settings.impl.language;

import android.content.Context;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1072w2.C20793e;
import p171Gh.EnumC3058a;
import p383Pg.C6405b;
import p383Pg.C6408e;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import tm.C20007b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18067d2 = {"impl_googlePlayRelease"}, m18068k = 2, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public abstract class AppLocaleViewModelKt {
    /* JADX INFO: renamed from: a */
    public static final C6405b m14358a(Context context, C6408e c6408e) {
        C20793e c20793e;
        C20793e c20793e2 = C20793e.f66055b;
        AbstractC16544l.m18093f(c20793e2, "getEmptyLocaleList(...)");
        String string = context.getString(R.string.settings_app_language_dialog_system_default_option);
        AbstractC16544l.m18093f(string, "getString(...)");
        C6408e c6408e2 = new C6408e(c20793e2, string);
        C6408e c6408e3 = c6408e == null ? c6408e2 : c6408e;
        if (AbstractC16544l.m18089b(c6408e, c6408e2)) {
            c6408e = null;
        }
        ArrayList arrayListM19315v = AbstractC17678l.m19315v(new C6408e[]{c6408e2, c6408e});
        C20007b c20007b = EnumC3058a.f9225s0;
        ArrayList<EnumC3058a> arrayList = new ArrayList();
        for (Object obj : c20007b) {
            EnumC3058a enumC3058a = (EnumC3058a) obj;
            if (enumC3058a.f9227Z) {
                if (!AbstractC16544l.m18089b(enumC3058a.f9226Y, (c6408e == null || (c20793e = c6408e.f20847a) == null) ? null : c20793e.f66056a.get(0))) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        for (EnumC3058a enumC3058a2 : arrayList) {
            C20793e c20793eM21310b = C20793e.m21310b(enumC3058a2.f9226Y.toLanguageTag());
            AbstractC16544l.m18093f(c20793eM21310b, "forLanguageTags(...)");
            arrayList2.add(new C6408e(c20793eM21310b, enumC3058a2.m3926a()));
        }
        return new C6405b(AbstractC17680n.m19361k0(arrayList2, arrayListM19315v), c6408e3);
    }
}
