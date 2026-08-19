package p168Gd;

import ao.C11135I;
import ao.C11163f0;
import ao.C11181o0;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p606Yn.C10100a;
import p909nm.C17689w;

/* JADX INFO: renamed from: Gd.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3035c extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public static final C3035c f9131Y = new C3035c(1);

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C10100a buildClassSerialDescriptor = (C10100a) obj;
        AbstractC16544l.m18094g(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        C17689w c17689w = C17689w.f56480Y;
        C11181o0 c11181o0 = C11181o0.f33827a;
        C11163f0 c11163f0 = C11181o0.f33828b;
        buildClassSerialDescriptor.m10678a("textdoc_id", c11163f0, c17689w, false);
        buildClassSerialDescriptor.m10678a(UiComponentConfig.Title.type, c11163f0, c17689w, false);
        C11135I c11135i = C11135I.f33763a;
        buildClassSerialDescriptor.m10678a("version", C11135I.f33764b, c17689w, false);
        return C17296C.f55119a;
    }
}
