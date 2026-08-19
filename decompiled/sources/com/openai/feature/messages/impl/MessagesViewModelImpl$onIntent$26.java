package com.openai.feature.messages.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17309l;
import p049Bm.InterfaceC1439n;
import p095Df.C2037g;
import p909nm.AbstractC17659D;
import p926of.C18160X;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lof/X;", "LDf/g;", "it", "invoke", "(Lof/X;LDf/g;)Lof/X;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class MessagesViewModelImpl$onIntent$26 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public static final MessagesViewModelImpl$onIntent$26 f38592Y = new MessagesViewModelImpl$onIntent$26();

    public MessagesViewModelImpl$onIntent$26() {
        super(2);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C18160X setOnEach = (C18160X) obj;
        C2037g it = (C2037g) obj2;
        AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
        AbstractC16544l.m18094g(it, "it");
        return C18160X.m19717e(setOnEach, false, null, null, false, null, null, AbstractC17659D.m19249k(setOnEach.f57919j, new C17309l(it.f6244b, it.f6243a)), null, 1535);
    }
}
