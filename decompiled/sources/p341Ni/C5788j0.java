package p341Ni;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p103Dn.C2217y0;
import p1081wc.AbstractC20882b;
import p1081wc.C20862H;
import p1081wc.InterfaceC20904w;
import p1155zi.EnumC22033m2;
import p148Fi.AbstractC2788S0;
import p148Fi.AbstractC2792U0;
import p148Fi.C2864y0;
import p172Gi.EnumC3062D;
import p172Gi.EnumC3064F;
import p228J.AbstractC3794B0;
import p324Mn.C5551u;
import p523V9.AbstractC8160o6;
import p728ei.C13406b;
import p909nm.AbstractC17659D;
import p909nm.C17690x;

/* JADX INFO: renamed from: Ni.j0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5788j0 {

    /* JADX INFO: renamed from: a */
    public final String f18897a;

    /* JADX INFO: renamed from: b */
    public final EnumC3062D f18898b;

    /* JADX INFO: renamed from: c */
    public final C13406b f18899c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC20904w f18900d;

    /* JADX INFO: renamed from: e */
    public final C2864y0 f18901e;

    /* JADX INFO: renamed from: f */
    public final C5551u f18902f;

    /* JADX INFO: renamed from: g */
    public C5551u f18903g;

    /* JADX INFO: renamed from: h */
    public C5551u f18904h;

    /* JADX INFO: renamed from: i */
    public C5551u f18905i;

    /* JADX INFO: renamed from: j */
    public int f18906j;

    /* JADX INFO: renamed from: k */
    public boolean f18907k;

    /* JADX INFO: renamed from: l */
    public final C2153Q0 f18908l;

    /* JADX INFO: renamed from: m */
    public final C2217y0 f18909m;

    /* JADX INFO: renamed from: n */
    public final C2153Q0 f18910n;

    /* JADX INFO: renamed from: o */
    public final C2217y0 f18911o;

    public C5788j0(String sessionId, EnumC3062D surface, C5792l0 initialTokenParams, C13406b foregroundDetector, InterfaceC20904w analyticsService) {
        AbstractC16544l.m18094g(sessionId, "sessionId");
        AbstractC16544l.m18094g(surface, "surface");
        AbstractC16544l.m18094g(initialTokenParams, "initialTokenParams");
        AbstractC16544l.m18094g(foregroundDetector, "foregroundDetector");
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        this.f18897a = sessionId;
        this.f18898b = surface;
        this.f18899c = foregroundDetector;
        this.f18900d = analyticsService;
        this.f18901e = AbstractC2792U0.m3712c("VoiceSessionTracker");
        C5551u.Companion.getClass();
        this.f18902f = new C5551u(AbstractC3794B0.m4501z("instant(...)"));
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(C17690x.f56481Y);
        this.f18908l = c2153q0M3204c;
        this.f18909m = new C2217y0(c2153q0M3204c);
        C2153Q0 c2153q0M3204c2 = AbstractC2124C.m3204c(initialTokenParams);
        this.f18910n = c2153q0M3204c2;
        this.f18911o = new C2217y0(c2153q0M3204c2);
    }

    /* JADX INFO: renamed from: a */
    public final void m6188a(EnumC22033m2 mode) {
        C5788j0 c5788j0 = this;
        AbstractC16544l.m18094g(mode, "mode");
        c5788j0.m6189b(C20862H.f66402j, C17690x.f56481Y);
        while (true) {
            C2153Q0 c2153q0 = c5788j0.f18910n;
            Object value = c2153q0.getValue();
            C5792l0 c5792l0 = (C5792l0) value;
            String str = c5792l0.f18915a;
            EnumC3064F enumC3064F = c5792l0.f18926l;
            String modelSlug = c5792l0.f18917c;
            AbstractC16544l.m18094g(modelSlug, "modelSlug");
            if (c2153q0.m3250k(value, new C5792l0(str, c5792l0.f18916b, modelSlug, c5792l0.f18918d, c5792l0.f18919e, c5792l0.f18920f, c5792l0.f18921g, c5792l0.f18922h, c5792l0.f18923i, c5792l0.f18924j, mode, enumC3064F, c5792l0.f18927m))) {
                return;
            } else {
                c5788j0 = this;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6189b(AbstractC20882b voiceEvent, Map properties) {
        AbstractC16544l.m18094g(voiceEvent, "voiceEvent");
        AbstractC16544l.m18094g(properties, "properties");
        C5792l0 c5792l0 = (C5792l0) this.f18911o.f6797Y.getValue();
        String str = c5792l0.f18915a;
        if (str == null) {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        C17309l c17309l = new C17309l("conversation_id", str);
        String str2 = c5792l0.f18916b;
        if (str2 == null) {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        C17309l c17309l2 = new C17309l("parent_message_id", str2);
        C17309l c17309l3 = new C17309l("voice_session_id", this.f18897a);
        C17309l c17309l4 = new C17309l("voice_model_slug", c5792l0.f18917c);
        String str3 = c5792l0.f18919e;
        if (str3 == null) {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        C17309l c17309l5 = new C17309l("voice_gizmo_id", str3);
        C17309l c17309l6 = new C17309l("voice_get_token_with_params", Boolean.TRUE);
        C17309l c17309l7 = new C17309l("surface", this.f18898b.f9238Y);
        EnumC3064F enumC3064F = c5792l0.f18926l;
        C17309l c17309l8 = new C17309l("system_prompt_name", enumC3064F.name());
        EnumC22033m2 enumC22033m2 = c5792l0.f18925k;
        C17309l c17309l9 = new C17309l("voice_mode", enumC22033m2.f69696Y);
        C17309l c17309l10 = new C17309l("voice_advanced_mode", Boolean.valueOf(enumC22033m2 == EnumC22033m2.Advanced));
        C17309l c17309l11 = new C17309l("foreground", this.f18899c.f42469c.f6797Y.getValue());
        C17309l c17309l12 = new C17309l("system_prompt_type", enumC3064F.name());
        C17309l c17309l13 = new C17309l("number_of_model_responses", Integer.valueOf(this.f18906j));
        C17309l c17309l14 = new C17309l("voice_training_allowed", Boolean.valueOf(c5792l0.f18921g));
        C17309l c17309l15 = new C17309l("video_training_allowed", Boolean.valueOf(c5792l0.f18922h));
        String str4 = c5792l0.f18920f;
        if (str4 == null) {
            str4 = "";
        }
        LinkedHashMap linkedHashMapM19248j = AbstractC17659D.m19248j(properties, AbstractC17659D.m19244f(c17309l, c17309l2, c17309l3, c17309l4, c17309l5, c17309l6, c17309l7, c17309l8, c17309l9, c17309l10, c17309l11, c17309l12, c17309l13, c17309l14, c17309l15, new C17309l("voice", str4), new C17309l("has_video_enabled", Boolean.valueOf(this.f18907k))));
        this.f18900d.mo21447a(voiceEvent, linkedHashMapM19248j);
        if (AbstractC2788S0.f8511a.contains(voiceEvent)) {
            AbstractC8160o6.m8731f(this.f18901e, voiceEvent.toString(), null, linkedHashMapM19248j, 2);
        }
    }
}
