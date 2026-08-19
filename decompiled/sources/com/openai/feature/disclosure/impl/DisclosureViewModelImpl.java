package com.openai.feature.disclosure.impl;

import androidx.lifecycle.C11082S;
import androidx.lifecycle.ViewModel;
import com.openai.chatgpt.R;
import com.openai.feature.disclosure.DisclosureViewModel;
import com.openai.feature.disclosure.DisclosureViewModelKt;
import com.squareup.anvil.annotations.ContributesMultibinding;
import com.withpersona.sdk2.inquiry.network.HttpStatusCode;
import gd.C13860H1;
import gd.C13886Q0;
import gd.C14005w2;
import gd.InterfaceC13849E;
import id.C14968g;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17309l;
import p025An.C0644w;
import p072Ci.EnumC1702g;
import p092Dc.C1991h;
import p098Di.C2056e;
import p098Di.C2058g;
import p098Di.InterfaceC2053b;
import p1081wc.AbstractC20882b;
import p1081wc.C20859E;
import p1081wc.C20862H;
import p1081wc.C20880a;
import p1081wc.InterfaceC20904w;
import p1155zi.C21891A;
import p1155zi.C22038o;
import p1155zi.EnumC21896B0;
import p204I1.C3590f;
import p318Mh.C5365H;
import p318Mh.C5386Z;
import p318Mh.C5391c;
import p429Re.C6870d;
import p429Re.C6871e;
import p429Re.C6875i;
import p429Re.C6876j;
import p429Re.C6877k;
import p429Re.C6878l;
import p429Re.InterfaceC6872f;
import p478Tc.EnumC7310n;
import p544W9.AbstractC8537P3;
import p571X9.AbstractC9327m3;
import p708dh.C13132J;
import p708dh.C13133K;
import p708dh.C13141T;
import p749fd.C13628m;
import p834jd.C16197f;
import p834jd.C16200i;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17681o;
import p909nm.C17689w;
import p909nm.C17690x;
import p948pi.C18418a;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/disclosure/impl/DisclosureViewModelImpl;", "Lcom/openai/feature/disclosure/DisclosureViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class DisclosureViewModelImpl extends DisclosureViewModel {

    /* JADX INFO: renamed from: i */
    public final C14968g f38117i;

    /* JADX INFO: renamed from: j */
    public final C13141T f38118j;

    /* JADX INFO: renamed from: k */
    public final C13132J f38119k;

    /* JADX INFO: renamed from: l */
    public final C13133K f38120l;

    /* JADX INFO: renamed from: m */
    public final C18418a f38121m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC13849E f38122n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC20904w f38123o;

    /* JADX WARN: Code duplicated, block: B:72:0x056d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0571  */
    /* JADX WARN: Code duplicated, block: B:76:0x0579  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Illegal instructions before constructor call */
    public DisclosureViewModelImpl(C1991h c1991h, C11082S c11082s, C14968g c14968g, C13141T c13141t, C13132J c13132j, C13133K c13133k, C18418a c18418a, InterfaceC13849E interfaceC13849E, InterfaceC20904w interfaceC20904w) {
        C6877k c6877k;
        C6877k c6877k2;
        int iOrdinal;
        C5365H.f17604g.getClass();
        EnumC21896B0 type = (EnumC21896B0) C5365H.f17605h.m5892c(c11082s);
        AbstractC16544l.m18094g(type, "type");
        int iOrdinal2 = type.ordinal();
        C17689w c17689w = C17689w.f56480Y;
        C21891A c21891a = c18418a.f58774b;
        boolean z6 = c18418a.f58779g;
        switch (iOrdinal2) {
            case 0:
                if (c18418a.f58773a.f58783b) {
                    boolean zM9201b = AbstractC8537P3.m9201b(c18418a);
                    String strM3160b = c1991h.m3160b(R.string.disclosure_title);
                    C3590f c3590fM3159a = c1991h.m3159a(R.string.disclosure_subheading, c17689w);
                    String strM3160b2 = c1991h.m3160b(R.string.disclosure_inaccurate_title);
                    C3590f c3590fM3159a2 = c1991h.m3159a(R.string.disclosure_inaccurate_subtitle, c17689w);
                    EnumC7310n enumC7310n = EnumC7310n.f23157E0;
                    c6877k2 = new C6877k(strM3160b, null, c3590fM3159a, AbstractC17681o.m19382k(new C6876j(strM3160b2, c3590fM3159a2, R.drawable.search, enumC7310n), new C6876j(c1991h.m3160b(R.string.disclosure_sensitive_title), c1991h.m3159a(zM9201b ? R.string.disclosure_abuse_prevention_subtitle : R.string.disclosure_sensitive_subtitle, c17689w), R.drawable.lock_key_hole, enumC7310n)), new C6875i(c1991h.m3159a(R.string.disclosure_anonymous_footer, c17689w), 0, true, 2), c1991h.m3160b(R.string.disclosure_continue), null, 390);
                } else if (z6) {
                    C22038o c22038o = c21891a.f69415a;
                    String strM3160b3 = (c22038o == null || (strM3160b3 = c22038o.f69715e) == null) ? c1991h.m3160b(R.string.disclosure_workspace_fallback_name) : strM3160b3;
                    String strM3160b4 = c1991h.m3160b(R.string.disclosure_workspace_title);
                    String strM3161c = c1991h.m3161c(R.string.disclosure_workspace_heading, strM3160b3);
                    C3590f c3590fM3159a3 = c1991h.m3159a(R.string.disclosure_workspace_subheading, c17689w);
                    String strM3160b5 = c1991h.m3160b(R.string.disclosure_workspace_work_title);
                    C3590f c3590fM3159a4 = c1991h.m3159a(R.string.disclosure_workspace_work_subtitle, c17689w);
                    EnumC7310n enumC7310n2 = EnumC7310n.f23157E0;
                    c6877k2 = new C6877k(strM3160b4, strM3161c, c3590fM3159a3, AbstractC17681o.m19382k(new C6876j(strM3160b5, c3590fM3159a4, R.drawable.lock_key_hole, enumC7310n2), new C6876j(c1991h.m3160b(R.string.disclosure_workspace_ask_away_title), c1991h.m3159a(R.string.disclosure_workspace_ask_away_subtitle, c17689w), R.drawable.chat, enumC7310n2), new C6876j(c1991h.m3160b(R.string.disclosure_workspace_check_title), c1991h.m3159a(R.string.disclosure_workspace_check_subtitle, c17689w), R.drawable.search, enumC7310n2)), null, c1991h.m3160b(R.string.disclosure_continue), null, 418);
                } else {
                    String strM3160b6 = c1991h.m3160b(R.string.disclosure_title);
                    C3590f c3590fM3159a5 = c1991h.m3159a(R.string.disclosure_subheading, c17689w);
                    String strM3160b7 = c1991h.m3160b(R.string.disclosure_inaccurate_title);
                    C3590f c3590fM3159a6 = c1991h.m3159a(R.string.disclosure_inaccurate_subtitle, c17689w);
                    EnumC7310n enumC7310n3 = EnumC7310n.f23157E0;
                    c6877k = new C6877k(strM3160b6, null, c3590fM3159a5, AbstractC17681o.m19382k(new C6876j(strM3160b7, c3590fM3159a6, R.drawable.search, enumC7310n3), new C6876j(c1991h.m3160b(R.string.disclosure_sensitive_title), c1991h.m3159a(R.string.disclosure_sensitive_subtitle, c17689w), R.drawable.lock_key_hole, enumC7310n3), new C6876j(c1991h.m3160b(R.string.disclosure_controls_title), c1991h.m3159a(R.string.disclosure_controls_subtitle, c17689w), R.drawable.tuning, enumC7310n3)), null, c1991h.m3160b(R.string.disclosure_continue), null, HttpStatusCode.UNPROCESSABLE_ENTITY_422);
                    c6877k2 = c6877k;
                }
                super(new C6878l(type, c6877k2));
                this.f38117i = c14968g;
                this.f38118j = c13141t;
                this.f38119k = c13132j;
                this.f38120l = c13133k;
                this.f38121m = c18418a;
                this.f38122n = interfaceC13849E;
                this.f38123o = interfaceC20904w;
                iOrdinal = ((C6878l) m14391f()).f22061a.ordinal();
                if (iOrdinal != 0) {
                    m14276n(C20880a.f66496d);
                    return;
                } else {
                    if (iOrdinal != 2) {
                        return;
                    }
                    interfaceC20904w.mo21447a(C20862H.f66399g, C17690x.f56481Y);
                    return;
                }
            case 1:
                c6877k2 = DisclosureViewModelKt.m14275b(c1991h);
                super(new C6878l(type, c6877k2));
                this.f38117i = c14968g;
                this.f38118j = c13141t;
                this.f38119k = c13132j;
                this.f38120l = c13133k;
                this.f38121m = c18418a;
                this.f38122n = interfaceC13849E;
                this.f38123o = interfaceC20904w;
                iOrdinal = ((C6878l) m14391f()).f22061a.ordinal();
                if (iOrdinal != 0) {
                    m14276n(C20880a.f66496d);
                    return;
                } else {
                    if (iOrdinal != 2) {
                        return;
                    }
                    interfaceC20904w.mo21447a(C20862H.f66399g, C17690x.f56481Y);
                    return;
                }
            case 2:
                boolean zM15481a = ((C14005w2) interfaceC13849E).m15481a(C13860H1.f43898c);
                if (z6) {
                    String strM3160b8 = c1991h.m3160b(R.string.disclosure_adv_voice_ga_title);
                    String strM3160b9 = c1991h.m3160b(R.string.disclosure_continue);
                    String strM3160b10 = c1991h.m3160b(R.string.disclosure_adv_voice_item_natural);
                    C3590f c3590fM3159a7 = c1991h.m3159a(R.string.disclosure_adv_voice_item_natural_desc, c17689w);
                    EnumC7310n enumC7310n4 = EnumC7310n.f23174r0;
                    c6877k2 = new C6877k(strM3160b8, null, null, AbstractC17681o.m19382k(new C6876j(strM3160b10, c3590fM3159a7, R.drawable.chats, enumC7310n4), zM15481a ? new C6876j(c1991h.m3160b(R.string.disclosure_adv_voice_camera), c1991h.m3159a(R.string.disclosure_adv_voice_camera_desc, c17689w), R.drawable.video, enumC7310n4) : new C6876j(c1991h.m3160b(R.string.disclosure_adv_voice_item_multiple), c1991h.m3159a(R.string.disclosure_adv_voice_item_multiple_desc, c17689w), R.drawable.speak, enumC7310n4), new C6876j(c1991h.m3160b(R.string.disclosure_adv_voice_item_personal), c1991h.m3159a(R.string.disclosure_adv_voice_item_personal_desc, c17689w), R.drawable.avatar, enumC7310n4), new C6876j(c1991h.m3160b(R.string.disclosure_adv_voice_item_control), c1991h.m3159a(zM15481a ? R.string.disclosure_adv_voice_item_control_video_desc_enterprise : R.string.disclosure_adv_voice_item_control_desc_enterprise, c17689w), R.drawable.lock_key_hole, enumC7310n4)), new C6875i(c1991h.m3159a(R.string.disclosure_adv_voice_footer, c17689w), 3, false, 4), strM3160b9, null, 142);
                } else if (c21891a.m22325d()) {
                    String strM3160b11 = c1991h.m3160b(R.string.disclosure_adv_voice_ga_title);
                    String strM3160b12 = c1991h.m3160b(R.string.disclosure_continue);
                    String strM3160b13 = c1991h.m3160b(R.string.disclosure_adv_voice_item_natural);
                    C3590f c3590fM3159a8 = c1991h.m3159a(R.string.disclosure_adv_voice_item_natural_desc, c17689w);
                    EnumC7310n enumC7310n5 = EnumC7310n.f23174r0;
                    c6877k2 = new C6877k(strM3160b11, null, null, AbstractC17681o.m19382k(new C6876j(strM3160b13, c3590fM3159a8, R.drawable.chats, enumC7310n5), zM15481a ? new C6876j(c1991h.m3160b(R.string.disclosure_adv_voice_camera), c1991h.m3159a(R.string.disclosure_adv_voice_camera_desc, c17689w), R.drawable.video, enumC7310n5) : new C6876j(c1991h.m3160b(R.string.disclosure_adv_voice_item_multiple), c1991h.m3159a(R.string.disclosure_adv_voice_item_multiple_desc, c17689w), R.drawable.speak, enumC7310n5), new C6876j(c1991h.m3160b(R.string.disclosure_adv_voice_item_personal), c1991h.m3159a(R.string.disclosure_adv_voice_item_personal_desc, c17689w), R.drawable.avatar, enumC7310n5), new C6876j(c1991h.m3160b(R.string.disclosure_adv_voice_item_control), c1991h.m3159a(zM15481a ? R.string.disclosure_adv_voice_item_control_video_desc : R.string.disclosure_adv_voice_item_control_desc, c17689w), R.drawable.lock_key_hole, enumC7310n5)), new C6875i(c1991h.m3159a(R.string.disclosure_adv_voice_footer, c17689w), 3, false, 4), strM3160b12, null, 142);
                } else {
                    String strM3160b14 = c1991h.m3160b(R.string.disclosure_adv_voice_ga_title_free);
                    String strM3160b15 = c1991h.m3160b(R.string.disclosure_continue);
                    String strM3160b16 = c1991h.m3160b(R.string.disclosure_adv_voice_free_preview);
                    C3590f c3590fM3159a9 = c1991h.m3159a(R.string.disclosure_adv_voice_free_preview_desc, c17689w);
                    EnumC7310n enumC7310n6 = EnumC7310n.f23174r0;
                    c6877k2 = new C6877k(strM3160b14, null, null, AbstractC17681o.m19382k(new C6876j(strM3160b16, c3590fM3159a9, R.drawable.recent, enumC7310n6), zM15481a ? new C6876j(c1991h.m3160b(R.string.disclosure_adv_voice_camera), c1991h.m3159a(R.string.disclosure_adv_voice_camera_desc, c17689w), R.drawable.video, enumC7310n6) : new C6876j(c1991h.m3160b(R.string.disclosure_adv_voice_item_multiple), c1991h.m3159a(R.string.disclosure_adv_voice_item_multiple_desc, c17689w), R.drawable.speak, enumC7310n6), new C6876j(c1991h.m3160b(R.string.disclosure_adv_voice_item_personal), c1991h.m3159a(R.string.disclosure_adv_voice_item_personal_desc, c17689w), R.drawable.avatar, enumC7310n6), new C6876j(c1991h.m3160b(R.string.disclosure_adv_voice_item_control), c1991h.m3159a(zM15481a ? R.string.disclosure_adv_voice_item_control_video_desc : R.string.disclosure_adv_voice_item_control_desc, c17689w), R.drawable.lock_key_hole, enumC7310n6)), new C6875i(c1991h.m3159a(R.string.disclosure_adv_voice_footer, c17689w), 3, false, 4), strM3160b15, null, 142);
                }
                super(new C6878l(type, c6877k2));
                this.f38117i = c14968g;
                this.f38118j = c13141t;
                this.f38119k = c13132j;
                this.f38120l = c13133k;
                this.f38121m = c18418a;
                this.f38122n = interfaceC13849E;
                this.f38123o = interfaceC20904w;
                iOrdinal = ((C6878l) m14391f()).f22061a.ordinal();
                if (iOrdinal != 0) {
                    m14276n(C20880a.f66496d);
                    return;
                } else {
                    if (iOrdinal != 2) {
                        return;
                    }
                    interfaceC20904w.mo21447a(C20862H.f66399g, C17690x.f56481Y);
                    return;
                }
            case 3:
                String strM3160b17 = c1991h.m3160b(R.string.disclosure_vision_title);
                String strM3160b18 = c1991h.m3160b(R.string.disclosure_vision_photo_title);
                C3590f c3590fM3159a10 = c1991h.m3159a(R.string.disclosure_vision_photo_subtitle, c17689w);
                EnumC7310n enumC7310n7 = EnumC7310n.f23169Y;
                c6877k = new C6877k(strM3160b17, null, null, AbstractC17681o.m19382k(new C6876j(strM3160b18, c3590fM3159a10, R.drawable.camera, enumC7310n7), new C6876j(c1991h.m3160b(R.string.disclosure_vision_picture_title), c1991h.m3159a(R.string.disclosure_vision_picture_subtitle, c17689w), R.drawable.remix_images, enumC7310n7)), null, c1991h.m3160b(R.string.disclosure_continue), null, 430);
                c6877k2 = c6877k;
                super(new C6878l(type, c6877k2));
                this.f38117i = c14968g;
                this.f38118j = c13141t;
                this.f38119k = c13132j;
                this.f38120l = c13133k;
                this.f38121m = c18418a;
                this.f38122n = interfaceC13849E;
                this.f38123o = interfaceC20904w;
                iOrdinal = ((C6878l) m14391f()).f22061a.ordinal();
                if (iOrdinal != 0) {
                    m14276n(C20880a.f66496d);
                    return;
                } else {
                    if (iOrdinal != 2) {
                        return;
                    }
                    interfaceC20904w.mo21447a(C20862H.f66399g, C17690x.f56481Y);
                    return;
                }
            case 4:
                boolean zM15481a2 = ((C14005w2) interfaceC13849E).m15481a(C13886Q0.f43934c);
                String strM3160b19 = c1991h.m3160b(R.string.disclosure_memory_title);
                String strM3160b20 = c1991h.m3160b(R.string.disclosure_memory_more_title);
                C3590f c3590fM3159a11 = c1991h.m3159a(R.string.disclosure_memory_more_subtitle, c17689w);
                EnumC7310n enumC7310n8 = EnumC7310n.f23155C0;
                c6877k2 = new C6877k(strM3160b19, null, null, AbstractC17681o.m19382k(new C6876j(strM3160b20, c3590fM3159a11, R.drawable.chat, enumC7310n8), new C6876j(c1991h.m3160b(R.string.disclosure_memory_controls_title), c1991h.m3159a(R.string.disclosure_memory_controls_subtitle, c17689w), R.drawable.lightbulb_glow, enumC7310n8), new C6876j(c1991h.m3160b(R.string.disclosure_memory_privacy_title), c1991h.m3159a(R.string.disclosure_memory_privacy_subtitle, c17689w), R.drawable.data_controls, enumC7310n8)), null, c1991h.m3160b(zM15481a2 ? R.string.disclosure_enable : R.string.disclosure_continue), zM15481a2 ? c1991h.m3160b(R.string.disclosure_not_now) : null, 302);
                super(new C6878l(type, c6877k2));
                this.f38117i = c14968g;
                this.f38118j = c13141t;
                this.f38119k = c13132j;
                this.f38120l = c13133k;
                this.f38121m = c18418a;
                this.f38122n = interfaceC13849E;
                this.f38123o = interfaceC20904w;
                iOrdinal = ((C6878l) m14391f()).f22061a.ordinal();
                if (iOrdinal != 0) {
                    m14276n(C20880a.f66496d);
                    return;
                } else {
                    if (iOrdinal != 2) {
                        return;
                    }
                    interfaceC20904w.mo21447a(C20862H.f66399g, C17690x.f56481Y);
                    return;
                }
            case 5:
                String strM3160b21 = c1991h.m3160b(R.string.disclosure_memory_in_search_title);
                String strM3160b22 = c1991h.m3160b(R.string.disclosure_memory_in_search_smarter_title);
                C3590f c3590fM3159a12 = c1991h.m3159a(R.string.disclosure_memory_in_search_smarter_subtitle, c17689w);
                EnumC7310n enumC7310n9 = EnumC7310n.f23155C0;
                c6877k2 = new C6877k(strM3160b21, null, null, AbstractC17681o.m19382k(new C6876j(strM3160b22, c3590fM3159a12, R.drawable.lightbulb_glow, enumC7310n9), new C6876j(c1991h.m3160b(R.string.disclosure_memory_in_search_controls_title), c1991h.m3159a(R.string.disclosure_memory_in_search_controls_subtitle, c17689w), R.drawable.data_controls, enumC7310n9)), null, c1991h.m3160b(R.string.disclosure_continue), c1991h.m3160b(R.string.disclosure_memory_in_search_settings), 302);
                super(new C6878l(type, c6877k2));
                this.f38117i = c14968g;
                this.f38118j = c13141t;
                this.f38119k = c13132j;
                this.f38120l = c13133k;
                this.f38121m = c18418a;
                this.f38122n = interfaceC13849E;
                this.f38123o = interfaceC20904w;
                iOrdinal = ((C6878l) m14391f()).f22061a.ordinal();
                if (iOrdinal != 0) {
                    m14276n(C20880a.f66496d);
                    return;
                } else {
                    if (iOrdinal != 2) {
                        return;
                    }
                    interfaceC20904w.mo21447a(C20862H.f66399g, C17690x.f56481Y);
                    return;
                }
            case 6:
                c6877k2 = DisclosureViewModelKt.m14274a(c1991h, true, c18418a);
                super(new C6878l(type, c6877k2));
                this.f38117i = c14968g;
                this.f38118j = c13141t;
                this.f38119k = c13132j;
                this.f38120l = c13133k;
                this.f38121m = c18418a;
                this.f38122n = interfaceC13849E;
                this.f38123o = interfaceC20904w;
                iOrdinal = ((C6878l) m14391f()).f22061a.ordinal();
                if (iOrdinal != 0) {
                    m14276n(C20880a.f66496d);
                    return;
                } else {
                    if (iOrdinal != 2) {
                        return;
                    }
                    interfaceC20904w.mo21447a(C20862H.f66399g, C17690x.f56481Y);
                    return;
                }
            case 7:
                c6877k2 = DisclosureViewModelKt.m14274a(c1991h, false, c18418a);
                super(new C6878l(type, c6877k2));
                this.f38117i = c14968g;
                this.f38118j = c13141t;
                this.f38119k = c13132j;
                this.f38120l = c13133k;
                this.f38121m = c18418a;
                this.f38122n = interfaceC13849E;
                this.f38123o = interfaceC20904w;
                iOrdinal = ((C6878l) m14391f()).f22061a.ordinal();
                if (iOrdinal != 0) {
                    m14276n(C20880a.f66496d);
                    return;
                } else {
                    if (iOrdinal != 2) {
                        return;
                    }
                    interfaceC20904w.mo21447a(C20862H.f66399g, C17690x.f56481Y);
                    return;
                }
            case 8:
            case 9:
                throw new IllegalStateException("Unsupported disclosure type");
            default:
                throw new C0644w();
        }
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        C22038o c22038o;
        InterfaceC6872f intent = (InterfaceC6872f) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        boolean zEquals = intent.equals(C6870d.f22039a);
        C2056e c2056e = C2056e.f6277a;
        String str = null;
        InterfaceC13849E interfaceC13849E = this.f38122n;
        C13141T c13141t = this.f38118j;
        if (!zEquals) {
            if (intent.equals(C6871e.f22040a)) {
                int iOrdinal = ((C6878l) m14391f()).f22061a.ordinal();
                if (iOrdinal != 4) {
                    if (iOrdinal != 5) {
                        m14393h(c2056e);
                        return;
                    }
                    c13141t.m14818a(EnumC1702g.MemoryInSearch);
                    C5386Z c5386z = C5386Z.f17640h;
                    c5386z.getClass();
                    m14393h(new C2058g(c5386z.m5885a(C5391c.f17646Z), true));
                    return;
                }
                if (((C14005w2) interfaceC13849E).m15481a(C13886Q0.f43934c)) {
                    m14394i(new DisclosureViewModelImpl$onIntent$3(this, null));
                }
                m14393h(c2056e);
            }
            return;
        }
        m14393h(c2056e);
        int iOrdinal2 = ((C6878l) m14391f()).f22061a.ordinal();
        if (iOrdinal2 == 0) {
            m14276n(C20880a.f66495c);
            C14968g c14968g = this.f38117i;
            C21891A c21891a = c14968g.f46619Y.f58774b;
            if (c21891a.m22331j() && (c22038o = c21891a.f69415a) != null) {
                str = c22038o.f69711a;
            }
            c14968g.mo15971c(new C13628m(str == null ? C16197f.INSTANCE : new C16200i(str), 18));
            return;
        }
        InterfaceC20904w interfaceC20904w = this.f38123o;
        switch (iOrdinal2) {
            case 2:
                interfaceC20904w.mo21447a(C20862H.f66398f, C17690x.f56481Y);
                c13141t.m14818a(EnumC1702g.AdvancedVoice);
                if (((C14005w2) interfaceC13849E).m15481a(C13860H1.f43898c)) {
                    c13141t.m14818a(EnumC1702g.AdvancedVoiceVideo);
                }
                break;
            case 3:
                interfaceC20904w.mo21447a(C20859E.f66359m, C17690x.f56481Y);
                this.f38120l.m14817a(DisclosureViewModelImpl$onIntent$2.f38126Y);
                break;
            case 4:
                if (!((C14005w2) interfaceC13849E).m15481a(C13886Q0.f43934c)) {
                    c13141t.m14818a(EnumC1702g.MemoryOnboarding);
                } else {
                    m14394i(new DisclosureViewModelImpl$onIntent$1(this, null));
                }
                break;
            case 5:
                c13141t.m14818a(EnumC1702g.MemoryInSearch);
                break;
            case 6:
            case 7:
                c13141t.m14818a(EnumC1702g.TemporaryChatOnboarding);
                break;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m14276n(AbstractC20882b abstractC20882b) {
        this.f38123o.mo21447a(abstractC20882b, AbstractC17659D.m19244f(new C17309l("type", ((C6878l) m14391f()).f22061a.f69430Y), new C17309l("auth_status", this.f38121m.f58773a.f58783b ? "logged_out" : "logged_in")));
    }
}
