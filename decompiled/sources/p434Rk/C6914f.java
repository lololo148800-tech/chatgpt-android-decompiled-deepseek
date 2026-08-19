package p434Rk;

import io.ktor.utils.p815io.AbstractC15070F;
import kotlin.jvm.internal.AbstractC16544l;
import p409Qk.C6752c;
import p544W9.AbstractC8651i4;
import p754fl.InterfaceC13692b;
import p792hl.AbstractC14527b;
import p857kl.C16438E;

/* JADX INFO: renamed from: Rk.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C6914f extends C6911c {

    /* JADX INFO: renamed from: r0 */
    public final byte[] f22172r0;

    /* JADX INFO: renamed from: s0 */
    public final boolean f22173s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6914f(C6752c client, InterfaceC13692b interfaceC13692b, AbstractC14527b abstractC14527b, byte[] bArr) {
        super(client);
        AbstractC16544l.m18094g(client, "client");
        this.f22172r0 = bArr;
        this.f22165Z = new C6915g(this, interfaceC13692b);
        this.f22166o0 = new C6916h(this, bArr, abstractC14527b);
        Long lM9324b = AbstractC8651i4.m9324b(abstractC14527b);
        long length = bArr.length;
        C16438E method = interfaceC13692b.getMethod();
        AbstractC16544l.m18094g(method, "method");
        if (lM9324b == null || lM9324b.longValue() < 0 || method.equals(C16438E.f50989g) || lM9324b.longValue() == length) {
            this.f22173s0 = true;
            return;
        }
        throw new IllegalStateException("Content-Length mismatch: expected " + lM9324b + " bytes, but received " + length + " bytes");
    }

    @Override // p434Rk.C6911c
    /* JADX INFO: renamed from: b */
    public final boolean mo7295b() {
        return this.f22173s0;
    }

    @Override // p434Rk.C6911c
    /* JADX INFO: renamed from: e */
    public final Object mo7298e() {
        return AbstractC15070F.m16173a(this.f22172r0);
    }
}
