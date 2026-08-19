package cl;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1426a;
import p409Qk.C6752c;
import p434Rk.C6911c;
import p434Rk.C6915g;
import p857kl.InterfaceC16476x;

/* JADX INFO: renamed from: cl.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C11776c extends C6911c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11776c(C6752c client, InterfaceC1426a interfaceC1426a, C6911c originCall, InterfaceC16476x responseHeaders) {
        super(client);
        AbstractC16544l.m18094g(client, "client");
        AbstractC16544l.m18094g(originCall, "originCall");
        AbstractC16544l.m18094g(responseHeaders, "responseHeaders");
        this.f22165Z = new C6915g(this, originCall.m7296c());
        this.f22166o0 = new C11777d(this, interfaceC1426a, originCall.m7297d(), responseHeaders);
    }
}
