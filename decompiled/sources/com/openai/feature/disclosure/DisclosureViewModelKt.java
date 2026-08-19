package com.openai.feature.disclosure;

import com.openai.chatgpt.R;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p092Dc.C1991h;
import p204I1.C3590f;
import p429Re.C6876j;
import p429Re.C6877k;
import p478Tc.EnumC7310n;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17681o;
import p909nm.C17689w;
import p948pi.C18418a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18067d2 = {"disclosure_release"}, m18068k = 2, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public abstract class DisclosureViewModelKt {
    /* JADX INFO: renamed from: a */
    public static final C6877k m14274a(C1991h c1991h, boolean z6, C18418a c18418a) {
        String strM3160b = c1991h.m3160b(R.string.disclosure_temporary_title);
        String strM3160b2 = c1991h.m3160b(R.string.disclosure_temporary_history_title);
        boolean z10 = c18418a.f58779g;
        int i10 = z10 ? R.string.disclosure_temporary_history_subtitle_enterprise : R.string.disclosure_temporary_history_subtitle;
        C17689w c17689w = C17689w.f56480Y;
        C3590f c3590fM3159a = c1991h.m3159a(i10, c17689w);
        EnumC7310n enumC7310n = EnumC7310n.f23155C0;
        C6876j c6876j = new C6876j(strM3160b2, c3590fM3159a, R.drawable.chat_temporary, enumC7310n);
        C6876j c6876j2 = new C6876j(z6 ? c1991h.m3160b(R.string.disclosure_temporary_training_title) : c1991h.m3160b(R.string.disclosure_temporary_no_memory_training_title), z6 ? c1991h.m3159a(R.string.disclosure_temporary_training_subtitle, c17689w) : c1991h.m3159a(R.string.disclosure_temporary_no_memory_training_subtitle, c17689w), R.drawable.file_blank, enumC7310n);
        C6876j c6876j3 = new C6876j(c1991h.m3160b(R.string.disclosure_temporary_learning_title), c1991h.m3159a(R.string.disclosure_temporary_learning_subtitle, c17689w), R.drawable.memory, enumC7310n);
        if (z10) {
            c6876j3 = null;
        }
        return new C6877k(strM3160b, null, null, AbstractC17678l.m19315v(new C6876j[]{c6876j, c6876j2, c6876j3}), null, c1991h.m3160b(R.string.disclosure_continue), null, 430);
    }

    /* JADX INFO: renamed from: b */
    public static final C6877k m14275b(C1991h c1991h) {
        AbstractC16544l.m18094g(c1991h, "<this>");
        String strM3160b = c1991h.m3160b(R.string.disclosure_dalle_title);
        String strM3160b2 = c1991h.m3160b(R.string.disclosure_dalle_edit_title);
        C17689w c17689w = C17689w.f56480Y;
        C3590f c3590fM3159a = c1991h.m3159a(R.string.disclosure_dalle_edit_subtitle, c17689w);
        EnumC7310n enumC7310n = EnumC7310n.f23169Y;
        return new C6877k(strM3160b, null, null, AbstractC17681o.m19382k(new C6876j(strM3160b2, c3590fM3159a, R.drawable.transform, enumC7310n), new C6876j(c1991h.m3160b(R.string.disclosure_dalle_inpaint_title), c1991h.m3159a(R.string.disclosure_dalle_inpaint_subtitle, c17689w), R.drawable.inpaint, enumC7310n)), null, c1991h.m3160b(R.string.disclosure_dalle_started), c1991h.m3160b(R.string.disclosure_dalle_learn), 302);
    }
}
