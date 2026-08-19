package com.openai.feature.onboarding.impl.viewmodel;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1436k;
import p324Mn.C5554x;
import p623Zf.C10327w;
import p623Zf.C10330z;
import p872lg.AbstractC16943c;
import p872lg.C16942b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LZf/z;", "state", "invoke", "(LZf/z;)LZf/z;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class CreateAccountViewModelImpl$createAccount$3$1 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ AbstractC16943c f39094Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateAccountViewModelImpl$createAccount$3$1(AbstractC16943c abstractC16943c) {
        super(1);
        this.f39094Y = abstractC16943c;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C10327w c10327w;
        C10330z state = (C10330z) obj;
        AbstractC16544l.m18094g(state, "state");
        AbstractC16943c abstractC16943c = this.f39094Y;
        C10327w c10327w2 = state.f30661e;
        if (c10327w2 != null) {
            C16942b c16942b = (C16942b) abstractC16943c;
            c10327w = C10327w.m10883a(c10327w2, false, c16942b.f54391a, c16942b.f54392b, 511);
        } else {
            C16942b c16942b2 = (C16942b) abstractC16943c;
            c10327w = new C10327w((String) null, (String) null, false, (String) null, false, false, (String) null, (C5554x) null, (List) null, c16942b2.f54391a, c16942b2.f54392b, 511);
        }
        return C10330z.m10884a(state, null, null, null, null, c10327w, 15);
    }
}
