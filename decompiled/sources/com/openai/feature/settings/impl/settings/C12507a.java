package com.openai.feature.settings.impl.settings;

import android.content.Context;
import androidx.lifecycle.ViewModelKt;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1426a;
import p349O0.InterfaceC5985X;

/* JADX INFO: renamed from: com.openai.feature.settings.impl.settings.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C12507a extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ SettingsViewModel f39760Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Context f39761Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f39762o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12507a(SettingsViewModel settingsViewModel, Context context, InterfaceC5985X interfaceC5985X) {
        super(0);
        this.f39760Y = settingsViewModel;
        this.f39761Z = context;
        this.f39762o0 = interfaceC5985X;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        this.f39762o0.setValue(Boolean.TRUE);
        SettingsViewModelImpl settingsViewModelImpl = (SettingsViewModelImpl) this.f39760Y;
        Context activity = this.f39761Z;
        AbstractC16544l.m18094g(activity, "activity");
        AbstractC0575H.m1156D(ViewModelKt.m12143a(settingsViewModelImpl), null, null, new SettingsViewModelImpl$logout$1(settingsViewModelImpl, activity, null), 3);
        return C17296C.f55119a;
    }
}
