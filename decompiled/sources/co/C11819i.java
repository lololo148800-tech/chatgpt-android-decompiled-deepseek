package co;

import kotlin.jvm.internal.AbstractC16544l;
import p001A.C0095w0;
import p826j6.C16137F;

/* JADX INFO: renamed from: co.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C11819i extends C0095w0 {

    /* JADX INFO: renamed from: p0 */
    public final boolean f35827p0;

    public C11819i(C16137F c16137f, boolean z6) {
        super(c16137f);
        this.f35827p0 = z6;
    }

    @Override // p001A.C0095w0
    /* JADX INFO: renamed from: y */
    public final void mo387y(String value) {
        AbstractC16544l.m18094g(value, "value");
        if (this.f35827p0) {
            super.mo387y(value);
        } else {
            m385w(value);
        }
    }
}
