package com.openai.feature.voice.impl;

import com.openai.chatgpt.R;
import com.withpersona.sdk2.inquiry.network.HttpStatusCode;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p092Dc.C1991h;
import p1155zi.C22057s2;
import p124Ei.C2532n1;
import p204I1.C3590f;
import p429Re.C6877k;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LEi/n1;", "invoke", "(LEi/n1;)LEi/n1;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VoiceModeViewModelImpl$onIntent$9$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ VoiceModeViewModelImpl f40188Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C22057s2 f40189Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceModeViewModelImpl$onIntent$9$1(VoiceModeViewModelImpl voiceModeViewModelImpl, C22057s2 c22057s2) {
        super(1);
        this.f40188Y = voiceModeViewModelImpl;
        this.f40189Z = c22057s2;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C2532n1 setState = (C2532n1) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        C1991h c1991h = this.f40188Y.f39990q;
        AbstractC16544l.m18094g(c1991h, "<this>");
        C22057s2 c22057s2 = this.f40189Z;
        C3590f c3590f = new C3590f(6, c22057s2.f69748b, null);
        String strM3160b = c1991h.m3160b(R.string.design_selection_dialog_ok);
        return C2532n1.m3605e(setState, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, new C6877k(c22057s2.f69747a, null, c3590f, C17689w.f56480Y, null, strM3160b, null, HttpStatusCode.UNPROCESSABLE_ENTITY_422), null, null, false, false, false, false, false, null, null, null, null, false, false, null, null, null, false, false, false, false, null, -262145, 2047);
    }
}
