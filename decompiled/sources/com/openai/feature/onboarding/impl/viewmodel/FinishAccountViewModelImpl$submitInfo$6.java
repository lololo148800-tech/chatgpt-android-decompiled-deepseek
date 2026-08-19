package com.openai.feature.onboarding.impl.viewmodel;

import kg.C16404j;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p324Mn.C5554x;
import p623Zf.C10307c;
import p623Zf.C10330z;
import p872lg.C16946f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LZf/z;", "s", "invoke", "(LZf/z;)LZf/z;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class FinishAccountViewModelImpl$submitInfo$6 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C16404j f39150Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C5554x f39151Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinishAccountViewModelImpl$submitInfo$6(C16404j c16404j, C5554x c5554x) {
        super(1);
        this.f39150Y = c16404j;
        this.f39151Z = c5554x;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C10330z s10 = (C10330z) obj;
        AbstractC16544l.m18094g(s10, "s");
        C16404j c16404j = this.f39150Y;
        String str = c16404j.f50916a;
        if (str == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String str2 = c16404j.f50917b;
        if (str2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        C16946f c16946f = c16404j.f50921f;
        if (c16946f == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        return C10330z.m10884a(s10, null, new C10307c(str, str2, c16404j.f50919d, c16946f, this.f39151Z.toString()), null, null, null, 29);
    }
}
