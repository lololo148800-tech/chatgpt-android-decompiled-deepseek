package com.openai.feature.notification.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p1155zi.AbstractC21933K1;
import p1155zi.C21913F1;
import p1155zi.C21941M1;
import p455Sf.C7126k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LSf/k;", "invoke", "(LSf/k;)LSf/k;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class NotificationSettingsViewModelImpl$getNotificationSettings$1$1$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC21933K1 f39006Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSettingsViewModelImpl$getNotificationSettings$1$1$1(AbstractC21933K1 abstractC21933K1) {
        super(1);
        this.f39006Y = abstractC21933K1;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C7126k setState = (C7126k) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return new C7126k(new C21913F1(new C21941M1(this.f39006Y.f69485a)));
    }
}
