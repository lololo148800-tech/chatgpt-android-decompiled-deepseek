package com.openai.feature.messages.impl.listitem.content.spreadsheet;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p1155zi.C21920H0;
import p145Ff.C2730h;
import p364Oh.AbstractC6224C;
import p909nm.AbstractC17659D;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LFf/h;", "invoke", "(LFf/h;)LFf/h;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
final class MessageSpreadsheetViewModelImpl$getDownloadLink$2 extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ String f38861Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ AbstractC6224C f38862Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageSpreadsheetViewModelImpl$getDownloadLink$2(String str, AbstractC6224C abstractC6224C) {
        super(1);
        this.f38861Y = str;
        this.f38862Z = abstractC6224C;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C2730h setState = (C2730h) obj;
        AbstractC16544l.m18094g(setState, "$this$setState");
        return new C2730h(AbstractC17659D.m19249k(setState.f8383a, new C17309l(new C21920H0(this.f38861Y), this.f38862Z)));
    }
}
