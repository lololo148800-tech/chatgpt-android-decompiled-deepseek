package p995rl;

import io.ktor.utils.p815io.InterfaceC15066B;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p103Dn.InterfaceC2184i;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: rl.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C19247g extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f61019Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f61020Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C19249i f61021o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f61022p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ KSerializer f61023q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Charset f61024r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19247g(C19249i c19249i, Object obj, KSerializer kSerializer, Charset charset, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f61021o0 = c19249i;
        this.f61022p0 = obj;
        this.f61023q0 = kSerializer;
        this.f61024r0 = charset;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C19247g c19247g = new C19247g(this.f61021o0, this.f61022p0, this.f61023q0, this.f61024r0, interfaceC18770c);
        c19247g.f61020Z = obj;
        return c19247g;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C19247g) create((InterfaceC15066B) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f61019Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC15066B interfaceC15066B = (InterfaceC15066B) this.f61020Z;
            Object obj2 = this.f61022p0;
            AbstractC16544l.m18092e(obj2, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<*>");
            KSerializer kSerializer = this.f61023q0;
            AbstractC16544l.m18092e(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            this.f61019Y = 1;
            if (C19249i.m20330a(this.f61021o0, (InterfaceC2184i) obj2, kSerializer, this.f61024r0, interfaceC15066B, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
