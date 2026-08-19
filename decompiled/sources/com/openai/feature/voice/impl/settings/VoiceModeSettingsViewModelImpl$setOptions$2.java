package com.openai.feature.voice.impl.settings;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1155zi.C21921H1;
import p148Fi.C2786R0;
import p172Gi.C3077j;
import p294Li.C5100v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LLi/v;", "invoke", "(LLi/v;)LLi/v;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VoiceModeSettingsViewModelImpl$setOptions$2 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C2786R0 f40283Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f40284Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceModeSettingsViewModelImpl$setOptions$2(C2786R0 c2786r0, String str) {
        super(1);
        this.f40283Y = c2786r0;
        this.f40284Z = str;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        Object next;
        C5100v setState = (C5100v) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        C2786R0 c2786r0 = this.f40283Y;
        C21921H1 c21921h1 = new C21921H1(c2786r0);
        Iterator it = c2786r0.f8502a.iterator();
        while (it.hasNext()) {
            next = it.next();
            String str = ((C3077j) next).f9279b;
            String str2 = this.f40284Z;
            if (str2 == null ? false : str2.equals(str)) {
                return C5100v.m5663e(setState, c21921h1, (C3077j) next, false, 26);
            }
        }
        next = null;
        return C5100v.m5663e(setState, c21921h1, (C3077j) next, false, 26);
    }
}
