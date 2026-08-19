package com.openai.feature.gizmoshome.impl.details;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p1155zi.C21936L0;
import p726ef.C13377d;
import p909nm.AbstractC17659D;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"Lef/d;", "state", "invoke", "(Lef/d;)Lef/d;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class SnorlaxHomeViewModelImpl$updateCache$2 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ String f38377Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f38378Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnorlaxHomeViewModelImpl$updateCache$2(String str, List list) {
        super(1);
        this.f38377Y = str;
        this.f38378Z = list;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C13377d state = (C13377d) obj;
        AbstractC16544l.m18094g(state, "state");
        return new C13377d(AbstractC17659D.m19249k(state.f42416a, new C17309l(new C21936L0(this.f38377Y), this.f38378Z)));
    }
}
