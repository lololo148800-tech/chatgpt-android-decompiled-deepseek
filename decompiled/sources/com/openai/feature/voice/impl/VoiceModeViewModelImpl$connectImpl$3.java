package com.openai.feature.voice.impl;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p124Ei.C2532n1;
import p172Gi.C3077j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LEi/n1;", "invoke", "(LEi/n1;)LEi/n1;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VoiceModeViewModelImpl$connectImpl$3 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ VoiceModeViewModelImpl f40095Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f40096Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceModeViewModelImpl$connectImpl$3(VoiceModeViewModelImpl voiceModeViewModelImpl, String str) {
        super(1);
        this.f40095Y = voiceModeViewModelImpl;
        this.f40096Z = str;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        Object next;
        C2532n1 setState = (C2532n1) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        Iterator it = ((C2532n1) this.f40095Y.m14391f()).f7876H.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (AbstractC16544l.m18089b(((C3077j) next).f9279b, this.f40096Z)) {
                return C2532n1.m3605e(setState, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, null, (C3077j) next, false, false, false, false, null, -1, 2043);
            }
        }
        next = null;
        return C2532n1.m3605e(setState, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, null, (C3077j) next, false, false, false, false, null, -1, 2043);
    }
}
