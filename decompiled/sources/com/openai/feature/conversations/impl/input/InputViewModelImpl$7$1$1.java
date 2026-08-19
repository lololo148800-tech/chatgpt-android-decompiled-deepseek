package com.openai.feature.conversations.impl.input;

import bf.AbstractC11372a0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1025te.C19866Q;
import p1042uh.C20263a0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lte/Q;", "invoke", "(Lte/Q;)Lte/Q;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class InputViewModelImpl$7$1$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ List f37916Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputViewModelImpl$7$1$1(List list) {
        super(1);
        this.f37916Y = list;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C19866Q setState = (C19866Q) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        List list = this.f37916Y;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!AbstractC11372a0.m12784c((C20263a0) obj2)) {
                arrayList.add(obj2);
            }
        }
        return C19866Q.m20782e(setState, null, null, null, null, false, null, null, null, false, null, arrayList, null, false, false, null, false, null, false, false, false, 8386559);
    }
}
