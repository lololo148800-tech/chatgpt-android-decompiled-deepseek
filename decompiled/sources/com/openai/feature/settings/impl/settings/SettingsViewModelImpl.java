package com.openai.feature.settings.impl.settings;

import android.app.Application;
import android.content.Intent;
import androidx.lifecycle.ViewModel;
import bh.C11434h;
import com.openai.chatgpt.R;
import com.squareup.anvil.annotations.ContributesMultibinding;
import gd.C13888R0;
import gd.C14005w2;
import gd.C14010y0;
import gd.InterfaceC13849E;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mh.C17263k;
import mh.EnumC17264l;
import mm.C17309l;
import p020Ai.C0515d;
import p049Bm.InterfaceC1439n;
import p059C5.C1592j;
import p072Ci.C1699d;
import p072Ci.C1705j;
import p072Ci.EnumC1696a;
import p098Di.C2055d;
import p098Di.C2058g;
import p098Di.InterfaceC2053b;
import p103Dn.C2207t0;
import p1081wc.C20897p;
import p1081wc.C20906y;
import p1081wc.InterfaceC20904w;
import p1149zc.AbstractC21864z;
import p1155zi.C21891A;
import p1155zi.C22038o;
import p1155zi.EnumC22026l;
import p172Gi.C3077j;
import p318Mh.C5357D;
import p318Mh.C5358D0;
import p318Mh.C5359E;
import p318Mh.C5363G;
import p318Mh.C5371K;
import p318Mh.C5384X;
import p318Mh.C5386Z;
import p318Mh.C5391c;
import p318Mh.C5397f;
import p318Mh.C5401h;
import p318Mh.C5404i0;
import p318Mh.C5409l;
import p318Mh.C5420q0;
import p318Mh.C5437z;
import p482Tg.C7417A;
import p482Tg.C7418B;
import p482Tg.C7419C;
import p482Tg.C7420D;
import p482Tg.C7421E;
import p482Tg.C7422F;
import p482Tg.C7423G;
import p482Tg.C7424H;
import p482Tg.C7425I;
import p482Tg.C7426J;
import p482Tg.C7427K;
import p482Tg.C7428L;
import p482Tg.C7429M;
import p482Tg.C7430N;
import p482Tg.C7431O;
import p482Tg.C7432P;
import p482Tg.C7433Q;
import p482Tg.C7434S;
import p482Tg.C7435T;
import p482Tg.C7439X;
import p482Tg.C7464u;
import p482Tg.C7466w;
import p482Tg.C7467x;
import p482Tg.C7468y;
import p482Tg.C7469z;
import p482Tg.InterfaceC7436U;
import p571X9.AbstractC9186P;
import p571X9.AbstractC9327m3;
import p620Zc.InterfaceC10277b;
import p708dh.C13132J;
import p708dh.C13133K;
import p708dh.C13166t;
import p811ih.C15000g;
import p873lh.C16950a;
import p873lh.C16961l;
import p909nm.AbstractC17660E;
import p909nm.C17690x;
import p972qm.InterfaceC18770c;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/settings/impl/settings/SettingsViewModelImpl;", "Lcom/openai/feature/settings/impl/settings/SettingsViewModel;", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SettingsViewModelImpl extends SettingsViewModel {

    /* JADX INFO: renamed from: i */
    public final AbstractC21864z f39718i;

    /* JADX INFO: renamed from: j */
    public final C13133K f39719j;

    /* JADX INFO: renamed from: k */
    public final C13132J f39720k;

    /* JADX INFO: renamed from: l */
    public final Application f39721l;

    /* JADX INFO: renamed from: m */
    public final AbstractC21864z f39722m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC20904w f39723n;

    /* JADX INFO: renamed from: o */
    public final C11434h f39724o;

    /* JADX INFO: renamed from: com.openai.feature.settings.impl.settings.SettingsViewModelImpl$1 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LTg/X;", "LAi/d;", "it", "invoke", "(LTg/X;LAi/d;)LTg/X;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125011 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C125011 f39725Y = new C125011();

        public C125011() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C7439X setOnEach = (C7439X) obj;
            C0515d it = (C0515d) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            return C7439X.m7801e(setOnEach, null, it, false, null, false, null, false, null, 1021);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.settings.impl.settings.SettingsViewModelImpl$2 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LTg/X;", "Lzi/A;", "it", "invoke", "(LTg/X;Lzi/A;)LTg/X;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125022 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C125022 f39726Y = new C125022();

        public C125022() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            Set set;
            C7439X setOnEach = (C7439X) obj;
            C21891A it = (C21891A) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            C22038o c22038o = it.f69415a;
            return C7439X.m7801e(setOnEach, it, null, (c22038o == null || (set = c22038o.f69717g) == null) ? false : set.contains(EnumC22026l.ChatPreferencesAvailable), null, false, null, false, null, 1014);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.settings.impl.settings.SettingsViewModelImpl$3 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LTg/X;", "LCi/j;", "it", "invoke", "(LTg/X;LCi/j;)LTg/X;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125033 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C125033 f39727Y = new C125033();

        public C125033() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C7439X setOnEach = (C7439X) obj;
            C1705j it = (C1705j) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            return C7439X.m7801e(setOnEach, null, null, false, null, false, null, false, it, 511);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.settings.impl.settings.SettingsViewModelImpl$4 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LTg/X;", "LGi/j;", "it", "invoke", "(LTg/X;LGi/j;)LTg/X;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125044 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C125044 f39728Y = new C125044();

        public C125044() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C7439X setOnEach = (C7439X) obj;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            return C7439X.m7801e(setOnEach, null, null, false, (C3077j) obj2, false, null, false, null, 991);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.settings.impl.settings.SettingsViewModelImpl$5 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LTg/X;", "LCi/d;", "it", "invoke", "(LTg/X;LCi/d;)LTg/X;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125055 extends AbstractC16546n implements InterfaceC1439n {
        public C125055() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C7439X setOnEach = (C7439X) obj;
            C1699d it = (C1699d) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(it, "it");
            C17263k c17263k = EnumC17264l.f55058o0;
            Application application = SettingsViewModelImpl.this.f39721l;
            c17263k.getClass();
            EnumC17264l enumC17264lM18970a = C17263k.m18970a(it, application);
            Boolean bool = it.f4834h;
            return C7439X.m7801e(setOnEach, null, null, false, null, false, enumC17264lM18970a, bool != null ? bool.booleanValue() : false, null, 639);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.settings.impl.settings.SettingsViewModelImpl$6 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LTg/X;", "", "it", "invoke", "(LTg/X;Z)LTg/X;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125066 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C125066 f39730Y = new C125066();

        public C125066() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C7439X setOnEach = (C7439X) obj;
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            return C7439X.m7801e(setOnEach, null, null, false, null, zBooleanValue, null, false, null, 959);
        }
    }

    public SettingsViewModelImpl(InterfaceC10277b interfaceC10277b, C15000g c15000g, InterfaceC13849E interfaceC13849E, C16961l c16961l, C13166t c13166t, AbstractC21864z abstractC21864z, C13133K c13133k, C13132J c13132j, Application application, AbstractC21864z abstractC21864z2, InterfaceC20904w interfaceC20904w, C11434h c11434h) {
        super(new C7439X(null, null, interfaceC10277b.mo10873c(), false, ((C14005w2) interfaceC13849E).m15481a(C14010y0.f44092c), null, false, EnumC17264l.Auto, false, null));
        this.f39718i = abstractC21864z;
        this.f39719j = c13133k;
        this.f39720k = c13132j;
        this.f39721l = application;
        this.f39722m = abstractC21864z2;
        this.f39723n = interfaceC20904w;
        this.f39724o = c11434h;
        m14396l(C125011.f39725Y, c13166t.f41801e);
        m14396l(C125022.f39726Y, c13166t.f41802f);
        m14396l(C125033.f39727Y, c13133k.f41697b);
        C13132J c13132j2 = c16961l.f54439o0;
        C16950a c16950a = c16961l.f54438Z;
        m14396l(C125044.f39728Y, new C2207t0(c13132j2.f41695r0, c16950a.f64176f, new C1592j(c16961l, (InterfaceC18770c) null, 19), 0));
        m14396l(new C125055(), c13132j.f41695r0);
        m14396l(C125066.f39730Y, c15000g.m16134a(EnumC22026l.MemoryAvailable, C13888R0.f43936c));
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC7436U intent = (InterfaceC7436U) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C7434S) {
            m14394i(new SettingsViewModelImpl$onIntent$1(this, null));
            return;
        }
        if (intent instanceof C7424H) {
            m14394i(new SettingsViewModelImpl$onIntent$2(this, null));
            return;
        }
        boolean zEquals = intent.equals(C7419C.f23503a);
        C5391c c5391c = C5391c.f17646Z;
        InterfaceC20904w interfaceC20904w = this.f39723n;
        if (zEquals) {
            interfaceC20904w.mo21447a(C20897p.f66603c, C17690x.f56481Y);
            C5359E c5359e = C5359E.f17591h;
            c5359e.getClass();
            m14363n(c5359e.m5885a(c5391c));
            return;
        }
        if (intent.equals(C7426J.f23510a)) {
            C5404i0 c5404i0 = C5404i0.f17671h;
            c5404i0.getClass();
            m14363n(c5404i0.m5885a(c5391c));
            return;
        }
        if (intent.equals(C7468y.f23724a)) {
            C5409l c5409l = C5409l.f17683h;
            c5409l.getClass();
            m14363n(c5409l.m5885a(c5391c));
            return;
        }
        if (intent.equals(C7417A.f23501a)) {
            C5437z c5437z = C5437z.f17776h;
            c5437z.getClass();
            m14363n(c5437z.m5885a(c5391c));
            return;
        }
        if (intent.equals(C7422F.f23506a)) {
            String string = this.f39721l.getResources().getString(R.string.url_help_center);
            AbstractC16544l.m18093f(string, "getString(...)");
            m14364o(string);
            return;
        }
        if (intent.equals(C7433Q.f23517a)) {
            m14364o("https://openai.com/terms/");
            return;
        }
        if (intent.equals(C7427K.f23511a)) {
            m14364o("https://openai.com/privacy/");
            return;
        }
        if (intent.equals(C7423G.f23507a)) {
            C5384X c5384x = C5384X.f17638h;
            c5384x.getClass();
            m14363n(c5384x.m5885a(c5391c));
            return;
        }
        if (intent.equals(C7435T.f23519a)) {
            C5358D0 c5358d0 = C5358D0.f17590h;
            c5358d0.getClass();
            m14363n(c5358d0.m5885a(c5391c));
            return;
        }
        if (intent.equals(C7432P.f23516a)) {
            C5420q0 c5420q0 = C5420q0.f17708h;
            c5420q0.getClass();
            m14363n(c5420q0.m5885a(c5391c));
            return;
        }
        if (intent.equals(C7425I.f23509a)) {
            C5386Z c5386z = C5386Z.f17640h;
            c5386z.getClass();
            m14363n(c5386z.m5885a(c5391c));
            return;
        }
        if (intent.equals(C7418B.f23502a)) {
            C5357D c5357d = C5357D.f17589h;
            c5357d.getClass();
            m14363n(c5357d.m5885a(c5391c));
            return;
        }
        if (intent.equals(C7467x.f23723a)) {
            C5401h c5401h = C5401h.f17666h;
            c5401h.getClass();
            m14363n(c5401h.m5885a(c5391c));
            return;
        }
        if (intent.equals(C7466w.f23722a)) {
            C5397f c5397f = C5397f.f17660h;
            c5397f.getClass();
            m14363n(c5397f.m5885a(c5391c));
            return;
        }
        if (intent.equals(C7421E.f23505a)) {
            C5371K c5371k = C5371K.f17620h;
            c5371k.getClass();
            m14363n(c5371k.m5885a(c5391c));
            return;
        }
        if (intent.equals(C7420D.f23504a)) {
            C5363G c5363g = C5363G.f17602h;
            c5363g.getClass();
            m14363n(c5363g.m5885a(c5391c));
            return;
        }
        boolean z6 = intent instanceof C7429M;
        C13133K c13133k = this.f39719j;
        if (z6) {
            C20906y c20906y = C20906y.f66637g;
            EnumC1696a enumC1696a = ((C7429M) intent).f23513a;
            interfaceC20904w.mo21447a(c20906y, AbstractC17660E.m19258c(new C17309l("colorScheme", enumC1696a.f4824Y)));
            m14392g(new C7464u(enumC1696a));
            c13133k.m14817a(new SettingsViewModelImpl$setNightMode$1(enumC1696a));
            return;
        }
        if (intent instanceof C7431O) {
            m14394i(new SettingsViewModelImpl$onIntent$3(this, intent, null));
            return;
        }
        if (intent instanceof C7428L) {
            boolean z10 = ((C7428L) intent).f23512a;
            interfaceC20904w.mo21447a(z10 ? C20906y.f66635e : C20906y.f66634d, C17690x.f56481Y);
            c13133k.m14817a(new SettingsViewModelImpl$setHapticFeedback$1(z10));
        } else if (intent instanceof C7430N) {
            m14394i(new SettingsViewModelImpl$onIntent$4(this, intent, null));
        } else if (intent.equals(C7469z.f23725a)) {
            m14394i(new SettingsViewModelImpl$onIntent$5(this, null));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m14363n(String str) {
        m14393h(new C2058g(str, true));
    }

    /* JADX INFO: renamed from: o */
    public final void m14364o(String str) {
        Intent intent = new Intent();
        AbstractC9186P.m9748b(intent, str);
        m14393h(new C2055d(intent));
    }
}
