package p480Te;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p857kl.C16477y;

/* JADX INFO: renamed from: Te.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C7389n extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C7389n f23413Y = new C7389n(1);

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C16477y headers = (C16477y) obj;
        AbstractC16544l.m18094g(headers, "$this$headers");
        headers.m4529e("x-ms-blob-type", "BlockBlob");
        headers.m4529e("x-ms-version", "2020-04-08");
        return C17296C.f55119a;
    }
}
