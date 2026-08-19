package com.openai.feature.conversations.impl.input;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1025te.C19866Q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lte/Q;", "invoke", "(Lte/Q;)Lte/Q;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class InputViewModelImpl$imageSelect$5 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ Uri f37937Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputViewModelImpl$imageSelect$5(Uri uri) {
        super(1);
        this.f37937Y = uri;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C19866Q setState = (C19866Q) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return C19866Q.m20782e(setState, null, null, null, this.f37937Y, false, null, null, null, false, null, null, null, false, false, null, false, null, false, false, false, 8388599);
    }
}
