package p556Wk;

import kotlin.jvm.internal.AbstractC16544l;
import p011A9.p012Ra.ahZQMZ;
import p792hl.AbstractC14527b;

/* JADX INFO: renamed from: Wk.b0 */
/* JADX INFO: loaded from: classes3.dex */
public class C8915b0 extends IllegalStateException {

    /* JADX INFO: renamed from: Y */
    public final transient AbstractC14527b f27285Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8915b0(AbstractC14527b response, String cachedResponseText) {
        super("Bad response: " + response + ahZQMZ.PSVGBG + cachedResponseText + '\"');
        AbstractC16544l.m18094g(response, "response");
        AbstractC16544l.m18094g(cachedResponseText, "cachedResponseText");
        this.f27285Y = response;
    }
}
