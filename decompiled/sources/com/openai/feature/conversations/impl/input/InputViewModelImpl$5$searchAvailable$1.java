package com.openai.feature.conversations.impl.input;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p269Kh.C4688o;
import p269Kh.EnumC4691r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LKh/o;", "model", "", "invoke", "(LKh/o;)Ljava/lang/Boolean;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class InputViewModelImpl$5$searchAvailable$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final InputViewModelImpl$5$searchAvailable$1 f37912Y = new InputViewModelImpl$5$searchAvailable$1();

    public InputViewModelImpl$5$searchAvailable$1() {
        super(1);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C4688o model = (C4688o) obj;
        AbstractC16544l.m18094g(model, "model");
        return Boolean.valueOf(model.f15258g.contains(EnumC4691r.Search));
    }
}
