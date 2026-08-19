package p509Uk;

import io.ktor.utils.p815io.AbstractC15070F;
import io.ktor.utils.p815io.C15074J;
import io.ktor.utils.p815io.C15085k;
import io.ktor.utils.p815io.InterfaceC15066B;
import java.io.Closeable;
import kotlin.jvm.internal.C16558z;
import mm.C17296C;
import p025An.AbstractC0575H;
import p026Ao.InterfaceC0677k;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9221V;
import p571X9.AbstractC9233X;
import p754fl.C13694d;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Uk.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C7716i extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public Closeable f24315Y;

    /* JADX INFO: renamed from: Z */
    public InterfaceC18776i f24316Z;

    /* JADX INFO: renamed from: o0 */
    public C13694d f24317o0;

    /* JADX INFO: renamed from: p0 */
    public InterfaceC0677k f24318p0;

    /* JADX INFO: renamed from: q0 */
    public C16558z f24319q0;

    /* JADX INFO: renamed from: r0 */
    public int f24320r0;

    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ Object f24321s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ InterfaceC0677k f24322t0;

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ InterfaceC18776i f24323u0;

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ C13694d f24324v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7716i(InterfaceC0677k interfaceC0677k, InterfaceC18776i interfaceC18776i, C13694d c13694d, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f24322t0 = interfaceC0677k;
        this.f24323u0 = interfaceC18776i;
        this.f24324v0 = c13694d;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C7716i c7716i = new C7716i(this.f24322t0, this.f24323u0, this.f24324v0, interfaceC18770c);
        c7716i.f24321s0 = obj;
        return c7716i;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C7716i) create((C15074J) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a4 -> B:8:0x001f). Please report as a decompilation issue!!! */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Closeable closeable;
        C15074J c15074j;
        InterfaceC0677k interfaceC0677k;
        C16558z c16558z;
        InterfaceC18776i interfaceC18776i;
        C13694d c13694d;
        Closeable closeable2;
        C15074J c15074j2;
        InterfaceC18776i interfaceC18776i2;
        InterfaceC0677k interfaceC0677k2;
        InterfaceC15066B interfaceC15066B;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f24320r0;
        try {
            try {
                if (i10 == 0) {
                    AbstractC9233X.m9807c(obj);
                    c15074j = (C15074J) this.f24321s0;
                    interfaceC0677k = this.f24322t0;
                    c16558z = new C16558z();
                    interfaceC18776i = this.f24323u0;
                    c13694d = this.f24324v0;
                    closeable2 = interfaceC0677k;
                    if (interfaceC0677k.isOpen() || !AbstractC0575H.m1197z(interfaceC18776i) || c16558z.f51287Y < 0) {
                        if (closeable2 != null) {
                            try {
                                closeable2.close();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        th = null;
                    } else {
                        InterfaceC15066B interfaceC15066B2 = c15074j.f46837Y;
                        C7715h c7715h = new C7715h(c16558z, interfaceC0677k, c13694d, interfaceC18776i);
                        this.f24321s0 = c15074j;
                        this.f24315Y = closeable2;
                        this.f24316Z = interfaceC18776i;
                        this.f24317o0 = c13694d;
                        this.f24318p0 = interfaceC0677k;
                        this.f24319q0 = c16558z;
                        this.f24320r0 = 1;
                        if (AbstractC15070F.m16190r(interfaceC15066B2, c7715h, this) == enumC19250a) {
                            return enumC19250a;
                        }
                        c15074j2 = c15074j;
                        Closeable closeable3 = closeable2;
                        interfaceC18776i2 = interfaceC18776i;
                        interfaceC0677k2 = interfaceC0677k;
                        closeable = closeable3;
                        interfaceC15066B = c15074j2.f46837Y;
                        this.f24321s0 = c15074j2;
                        this.f24315Y = closeable;
                        this.f24316Z = interfaceC18776i2;
                        this.f24317o0 = c13694d;
                        this.f24318p0 = interfaceC0677k2;
                        this.f24319q0 = c16558z;
                        this.f24320r0 = 2;
                        if (((C15085k) interfaceC15066B).m16203h(this) == enumC19250a) {
                            return enumC19250a;
                        }
                    }
                    if (th == null) {
                        return C17296C.f55119a;
                    }
                    throw th;
                }
                if (i10 == 1) {
                    c16558z = this.f24319q0;
                    interfaceC0677k2 = this.f24318p0;
                    c13694d = this.f24317o0;
                    interfaceC18776i2 = this.f24316Z;
                    closeable = this.f24315Y;
                    c15074j2 = (C15074J) this.f24321s0;
                    AbstractC9233X.m9807c(obj);
                    interfaceC15066B = c15074j2.f46837Y;
                    this.f24321s0 = c15074j2;
                    this.f24315Y = closeable;
                    this.f24316Z = interfaceC18776i2;
                    this.f24317o0 = c13694d;
                    this.f24318p0 = interfaceC0677k2;
                    this.f24319q0 = c16558z;
                    this.f24320r0 = 2;
                    if (((C15085k) interfaceC15066B).m16203h(this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c16558z = this.f24319q0;
                    interfaceC0677k2 = this.f24318p0;
                    c13694d = this.f24317o0;
                    interfaceC18776i2 = this.f24316Z;
                    closeable = this.f24315Y;
                    c15074j2 = (C15074J) this.f24321s0;
                    AbstractC9233X.m9807c(obj);
                }
                c15074j = c15074j2;
                Closeable closeable4 = closeable;
                interfaceC0677k = interfaceC0677k2;
                interfaceC18776i = interfaceC18776i2;
                closeable2 = closeable4;
                if (interfaceC0677k.isOpen()) {
                }
                if (closeable2 != null) {
                    closeable2.close();
                }
                th = null;
            } catch (Throwable th3) {
                th = th3;
                closeable = closeable2;
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (Throwable th4) {
                        AbstractC9221V.m9789a(th, th4);
                    }
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
        if (th == null) {
            return C17296C.f55119a;
        }
        throw th;
    }
}
