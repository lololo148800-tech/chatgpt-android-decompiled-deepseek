package p434Rk;

import io.ktor.utils.p815io.AbstractC15070F;
import io.ktor.utils.p815io.C15087m;
import io.ktor.utils.p815io.InterfaceC15088n;
import kotlin.jvm.internal.AbstractC16544l;
import p1045ul.C20387d;
import p509Uk.C7717j;
import p754fl.C13697g;
import p792hl.AbstractC14527b;
import p857kl.C16439F;
import p857kl.C16440G;
import p857kl.InterfaceC16476x;
import p972qm.InterfaceC18776i;

/* JADX INFO: renamed from: Rk.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C6916h extends AbstractC14527b {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22176Y = 1;

    /* JADX INFO: renamed from: Z */
    public final InterfaceC18776i f22177Z;

    /* JADX INFO: renamed from: o0 */
    public final C16440G f22178o0;

    /* JADX INFO: renamed from: p0 */
    public final C16439F f22179p0;

    /* JADX INFO: renamed from: q0 */
    public final C20387d f22180q0;

    /* JADX INFO: renamed from: r0 */
    public final C20387d f22181r0;

    /* JADX INFO: renamed from: s0 */
    public final C6911c f22182s0;

    /* JADX INFO: renamed from: t0 */
    public final Object f22183t0;

    /* JADX INFO: renamed from: u0 */
    public final InterfaceC16476x f22184u0;

    public C6916h(C6911c c6911c, C13697g c13697g) {
        this.f22182s0 = c6911c;
        this.f22177Z = c13697g.f43226f;
        this.f22178o0 = c13697g.f43221a;
        this.f22179p0 = c13697g.f43224d;
        this.f22180q0 = c13697g.f43222b;
        this.f22181r0 = c13697g.f43227g;
        Object obj = c13697g.f43225e;
        InterfaceC15088n interfaceC15088n = obj instanceof InterfaceC15088n ? (InterfaceC15088n) obj : null;
        if (interfaceC15088n == null) {
            InterfaceC15088n.f46873a.getClass();
            interfaceC15088n = C15087m.f46872b;
        }
        this.f22183t0 = interfaceC15088n;
        this.f22184u0 = c13697g.f43223c;
    }

    @Override // p857kl.InterfaceC16436C
    /* JADX INFO: renamed from: a */
    public final InterfaceC16476x mo7301a() {
        switch (this.f22176Y) {
            case 0:
                return this.f22184u0;
            default:
                return (C7717j) this.f22184u0;
        }
    }

    @Override // p792hl.AbstractC14527b
    /* JADX INFO: renamed from: b */
    public final C6911c mo7303b() {
        switch (this.f22176Y) {
            case 0:
                return (C6914f) this.f22182s0;
            default:
                return this.f22182s0;
        }
    }

    @Override // p792hl.AbstractC14527b
    /* JADX INFO: renamed from: c */
    public final InterfaceC15088n mo7304c() {
        switch (this.f22176Y) {
            case 0:
                return AbstractC15070F.m16173a((byte[]) this.f22183t0);
            default:
                return (InterfaceC15088n) this.f22183t0;
        }
    }

    @Override // p792hl.AbstractC14527b
    /* JADX INFO: renamed from: d */
    public final C20387d mo7305d() {
        switch (this.f22176Y) {
            case 0:
                break;
        }
        return this.f22180q0;
    }

    @Override // p792hl.AbstractC14527b
    /* JADX INFO: renamed from: e */
    public final C20387d mo7306e() {
        switch (this.f22176Y) {
            case 0:
                break;
        }
        return this.f22181r0;
    }

    @Override // p792hl.AbstractC14527b
    /* JADX INFO: renamed from: f */
    public final C16440G mo7307f() {
        switch (this.f22176Y) {
            case 0:
                break;
        }
        return this.f22178o0;
    }

    @Override // p792hl.AbstractC14527b
    /* JADX INFO: renamed from: g */
    public final C16439F mo7308g() {
        switch (this.f22176Y) {
            case 0:
                break;
        }
        return this.f22179p0;
    }

    @Override // p025An.InterfaceC0571F
    public final InterfaceC18776i getCoroutineContext() {
        switch (this.f22176Y) {
            case 0:
                break;
        }
        return this.f22177Z;
    }

    public C6916h(C6914f call, byte[] bArr, AbstractC14527b abstractC14527b) {
        AbstractC16544l.m18094g(call, "call");
        this.f22182s0 = call;
        this.f22183t0 = bArr;
        this.f22178o0 = abstractC14527b.mo7307f();
        this.f22179p0 = abstractC14527b.mo7308g();
        this.f22180q0 = abstractC14527b.mo7305d();
        this.f22181r0 = abstractC14527b.mo7306e();
        this.f22184u0 = abstractC14527b.mo7301a();
        this.f22177Z = abstractC14527b.getCoroutineContext();
    }
}
