package com.openai.feature.settings.impl.settings;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p072Ci.C1705j;
import p072Ci.EnumC1696a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LCi/j;", "invoke", "(LCi/j;)LCi/j;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class SettingsViewModelImpl$setNightMode$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ EnumC1696a f39746Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModelImpl$setNightMode$1(EnumC1696a enumC1696a) {
        super(1);
        this.f39746Y = enumC1696a;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C1705j update = (C1705j) obj;
        AbstractC16544l.m18094g(update, "$this$update");
        return C1705j.m2512a(update, false, this.f39746Y, false, false, false, false, false, false, false, false, false, false, false, false, null, false, false, false, false, 2097147);
    }
}
