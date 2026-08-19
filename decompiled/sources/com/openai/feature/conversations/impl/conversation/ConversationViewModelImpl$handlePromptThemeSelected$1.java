package com.openai.feature.conversations.impl.conversation;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1025te.C19863N;
import p350O1.C6045C;
import p544W9.AbstractC8676n;
import p990rg.C18982i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lte/N;", "invoke", "(Lte/N;)Lte/N;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ConversationViewModelImpl$handlePromptThemeSelected$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ String f37727Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C18982i f37728Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationViewModelImpl$handlePromptThemeSelected$1(String str, C18982i c18982i) {
        super(1);
        this.f37727Y = str;
        this.f37728Z = c18982i;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C19863N update = (C19863N) obj;
        AbstractC16544l.m18094g(update, "$this$update");
        int length = this.f37728Z.f60542a.length();
        return C19863N.m20780a(update, new C6045C(AbstractC8676n.m9365b(length, length), this.f37727Y, 4), false, null, null, false, null, null, null, 254);
    }
}
