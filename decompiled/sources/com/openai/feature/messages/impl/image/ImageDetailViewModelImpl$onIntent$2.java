package com.openai.feature.messages.impl.image;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import tf.C19906K;
import tf.C19933r;
import tf.InterfaceC19938w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Ltf/K;", "invoke", "(Ltf/K;)Ltf/K;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ImageDetailViewModelImpl$onIntent$2 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InterfaceC19938w f38769Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageDetailViewModelImpl$onIntent$2(InterfaceC19938w interfaceC19938w) {
        super(1);
        this.f38769Y = interfaceC19938w;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C19906K setState = (C19906K) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return C19906K.m20796e(setState, null, 0, ((C19933r) this.f38769Y).f63191a, false, false, false, null, false, false, null, false, null, false, 65531);
    }
}
