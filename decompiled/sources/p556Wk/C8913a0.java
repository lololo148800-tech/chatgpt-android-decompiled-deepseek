package p556Wk;

import kotlin.jvm.internal.AbstractC16544l;
import p792hl.AbstractC14527b;

/* JADX INFO: renamed from: Wk.a0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8913a0 extends C8915b0 {

    /* JADX INFO: renamed from: Z */
    public final String f27279Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8913a0(AbstractC14527b response, String cachedResponseText) {
        super(response, cachedResponseText);
        AbstractC16544l.m18094g(response, "response");
        AbstractC16544l.m18094g(cachedResponseText, "cachedResponseText");
        this.f27279Z = "Unhandled redirect: " + response.mo7303b().m7296c().getMethod().f50992a + ' ' + response.mo7303b().m7296c().mo7300S() + ". Status: " + response.mo7307f() + ". Text: \"" + cachedResponseText + '\"';
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f27279Z;
    }
}
