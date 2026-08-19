package p341Ni;

import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17309l;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p103Dn.C2127D0;
import p1113xn.C21307a;
import p148Fi.AbstractC2841n;
import p148Fi.C2770J;
import p148Fi.C2775L0;
import p148Fi.C2791U;
import p148Fi.C2807b0;
import p148Fi.C2855u;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17660E;
import p929oi.AbstractC18201b;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ni.T */
/* JADX INFO: loaded from: classes3.dex */
public final class C5762T extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public String f18759Y;

    /* JADX INFO: renamed from: Z */
    public int f18760Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ byte[] f18761o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C5784h0 f18762p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5762T(byte[] bArr, C5784h0 c5784h0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f18761o0 = bArr;
        this.f18762p0 = c5784h0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C5762T(this.f18761o0, this.f18762p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5762T) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r2v3, types: [bo.d, bo.o] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r6;
        Exception e10;
        Object objM6171e;
        Object objM6169c;
        Object objM6170d;
        Object objMo395a;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f18760Z;
        C5784h0 c5784h0 = this.f18762p0;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            ?? str = new String(this.f18761o0, C21307a.f67720a);
            AbstractC8160o6.m8726a(c5784h0.f18872x, "Received message: ".concat(str), null, 6);
            try {
                C2775L0 c2775l0 = (C2775L0) AbstractC18201b.f58034a.m12903b(str, C2775L0.Companion.serializer());
                AbstractC8160o6.m8726a(c5784h0.f18872x, "Decoded message type: " + c2775l0.f8482a, null, 6);
                int iOrdinal = c2775l0.f8482a.ordinal();
                AbstractC2841n abstractC2841n = c2775l0.f8483b;
                if (iOrdinal == 1) {
                    AbstractC16544l.m18092e(abstractC2841n, "null cannot be cast to non-null type com.openai.voice.api.StateUpdate");
                    C5784h0.m6172f(c5784h0, (C2770J) abstractC2841n);
                    str = str;
                } else if (iOrdinal == 2) {
                    AbstractC16544l.m18092e(abstractC2841n, "null cannot be cast to non-null type com.openai.voice.api.UsageUpdate");
                    this.f18759Y = str;
                    this.f18760Z = 1;
                    objM6171e = C5784h0.m6171e(c5784h0, (C2807b0) abstractC2841n, this);
                    if (objM6171e == enumC19250a) {
                        str = objM6171e;
                        return enumC19250a;
                    }
                } else if (iOrdinal == 6) {
                    AbstractC16544l.m18092e(abstractC2841n, "null cannot be cast to non-null type com.openai.voice.api.Performance");
                    this.f18759Y = str;
                    this.f18760Z = 2;
                    objM6169c = C5784h0.m6169c(c5784h0, (C2855u) abstractC2841n, this);
                    if (objM6169c == enumC19250a) {
                        str = objM6169c;
                        return enumC19250a;
                    }
                } else if (iOrdinal != 7) {
                    C2127D0 c2127d0 = c5784h0.f18828B;
                    this.f18759Y = str;
                    this.f18760Z = 4;
                    objMo395a = c2127d0.mo395a(abstractC2841n, this);
                    if (objMo395a == enumC19250a) {
                        str = objMo395a;
                        return enumC19250a;
                    }
                } else {
                    AbstractC16544l.m18092e(abstractC2841n, "null cannot be cast to non-null type com.openai.voice.api.ToolUpdate");
                    this.f18759Y = str;
                    this.f18760Z = 3;
                    objM6170d = C5784h0.m6170d(c5784h0, (C2791U) abstractC2841n, this);
                    if (objM6170d == enumC19250a) {
                        str = objM6170d;
                        return enumC19250a;
                    }
                }
                str = objM6171e;
                str = objM6169c;
                str = objM6170d;
                str = objMo395a;
            } catch (Exception e11) {
                r6 = str;
                e10 = e11;
                c5784h0.f18872x.mo4186a("Unable to handle voice mode message", e10, AbstractC17660E.m19258c(new C17309l("message", r6)));
            }
        } else {
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r6 = this.f18759Y;
            try {
                AbstractC9233X.m9807c(obj);
            } catch (Exception e12) {
                e10 = e12;
                c5784h0.f18872x.mo4186a("Unable to handle voice mode message", e10, AbstractC17660E.m19258c(new C17309l("message", r6)));
            }
        }
        return C17296C.f55119a;
    }
}
