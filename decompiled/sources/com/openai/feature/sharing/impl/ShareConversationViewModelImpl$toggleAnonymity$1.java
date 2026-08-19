package com.openai.feature.sharing.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1155zi.C22013h2;
import p552Wg.C8856r;
import p621Zd.C10282c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LWg/r;", "invoke", "(LWg/r;)LWg/r;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ShareConversationViewModelImpl$toggleAnonymity$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final ShareConversationViewModelImpl$toggleAnonymity$1 f39814Y = new ShareConversationViewModelImpl$toggleAnonymity$1();

    public ShareConversationViewModelImpl$toggleAnonymity$1() {
        super(1);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C8856r setState = (C8856r) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        C10282c c10282c = null;
        if (setState.f27116g == null) {
            C10282c.Companion.getClass();
            C22013h2 c22013h2 = setState.f27114e;
            if (c22013h2 != null) {
                c10282c = new C10282c(c22013h2.f69658d, false, false, c22013h2.f69659e, false, 18);
            }
        }
        return C8856r.m9546e(setState, null, null, false, null, null, null, c10282c, false, null, false, 959);
    }
}
