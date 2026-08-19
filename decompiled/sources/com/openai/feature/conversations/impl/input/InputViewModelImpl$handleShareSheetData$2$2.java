package com.openai.feature.conversations.impl.input;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p991rh.EnumC18991F;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "invoke", "()V", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class InputViewModelImpl$handleShareSheetData$2$2 extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ InputViewModelImpl f37926Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Uri f37927Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputViewModelImpl$handleShareSheetData$2$2(InputViewModelImpl inputViewModelImpl, Uri uri) {
        super(0);
        this.f37926Y = inputViewModelImpl;
        this.f37927Z = uri;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        InputViewModelImpl.m14261p(this.f37926Y, this.f37927Z, EnumC18991F.f60566p0, null, 60);
        return C17296C.f55119a;
    }
}
