package eg;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC16526C;
import kotlinx.serialization.KSerializer;
import p1111xl.C21296a;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p434Rk.C6911c;
import p523V9.AbstractC8160o6;
import p556Wk.C8915b0;
import p571X9.AbstractC9233X;
import p996rm.EnumC19250a;
import pl.C18506a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: eg.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C13392o {
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public final Serializable m14947a(C8915b0 c8915b0, AbstractC19687c abstractC19687c) {
        C13391n c13391n;
        InterfaceC3777y interfaceC3777yM18075c;
        if (abstractC19687c instanceof C13391n) {
            c13391n = (C13391n) abstractC19687c;
            int i10 = c13391n.f42440o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c13391n.f42440o0 = i10 - Integer.MIN_VALUE;
            } else {
                c13391n = new C13391n(this, abstractC19687c);
            }
        } else {
            c13391n = new C13391n(this, abstractC19687c);
        }
        Object objM7294a = c13391n.f42438Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c13391n.f42440o0;
        try {
            try {
                if (i11 == 0) {
                    AbstractC9233X.m9807c(objM7294a);
                    C6911c c6911cMo7303b = c8915b0.f27285Y.mo7303b();
                    InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C13396s.class);
                    try {
                        interfaceC3777yM18075c = AbstractC16526C.m18075c(C13396s.class);
                    } catch (Throwable unused) {
                        interfaceC3777yM18075c = null;
                    }
                    C21296a c21296a = new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c);
                    c13391n.f42440o0 = 1;
                    objM7294a = c6911cMo7303b.m7294a(c21296a, c13391n);
                    if (objM7294a == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(objM7294a);
                }
                if (objM7294a != null) {
                    return (C13396s) objM7294a;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.openai.feature.onboarding.impl.api.model.response.OpenAIApiError");
            } catch (Exception e10) {
                AbstractC8160o6.m8731f(C13396s.f42446o0, "Unexpected exception parsing OpenAIApiError response", e10, null, 4);
                return null;
            }
        } catch (IllegalArgumentException | C18506a unused2) {
            return null;
        }
    }

    public final KSerializer serializer() {
        return C13390m.f42437a;
    }
}
