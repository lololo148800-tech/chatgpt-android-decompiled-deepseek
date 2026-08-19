package com.openai.feature.messages.impl.image;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p093Dd.C2017i;
import tf.C19906K;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Ltf/K;", "invoke", "(Ltf/K;)Ltf/K;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ImageDetailViewModelImpl$makeShareLink$3$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C2017i f38765Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageDetailViewModelImpl$makeShareLink$3$1(C2017i c2017i) {
        super(1);
        this.f38765Y = c2017i;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C19906K setState = (C19906K) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        C2017i c2017i = this.f38765Y;
        return C19906K.m20796e(setState, null, 0, 0, false, false, false, null, false, false, c2017i.f6181b, c2017i.f6182c, c2017i.f6180a, false, 36863);
    }
}
