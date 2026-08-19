package p594Y9;

import ao.AbstractC11153a0;
import ao.AbstractC11154b;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Encoder;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p225Im.InterfaceC3756d;
import p631Zn.InterfaceC10428a;
import p919o8.C17887C1;
import p919o8.C17943V1;

/* JADX INFO: renamed from: Y9.T3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9810T3 {
    /* JADX INFO: renamed from: a */
    public static final KSerializer m10437a(AbstractC11154b abstractC11154b, InterfaceC10428a interfaceC10428a, String str) {
        AbstractC16544l.m18094g(abstractC11154b, "<this>");
        KSerializer kSerializerMo7537a = abstractC11154b.mo7537a(interfaceC10428a, str);
        if (kSerializerMo7537a != null) {
            return kSerializerMo7537a;
        }
        AbstractC11153a0.m12390m(abstractC11154b.mo7539c(), str);
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static final KSerializer m10438b(AbstractC11154b abstractC11154b, Encoder encoder, Object value) {
        AbstractC16544l.m18094g(abstractC11154b, "<this>");
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        KSerializer kSerializerMo7538b = abstractC11154b.mo7538b(encoder, value);
        if (kSerializerMo7538b != null) {
            return kSerializerMo7538b;
        }
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(value.getClass());
        InterfaceC3756d baseClass = abstractC11154b.mo7539c();
        AbstractC16544l.m18094g(baseClass, "baseClass");
        String strMo4448c = interfaceC3756dMo5693b.mo4448c();
        if (strMo4448c == null) {
            strMo4448c = String.valueOf(interfaceC3756dMo5693b);
        }
        AbstractC11153a0.m12390m(baseClass, strMo4448c);
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static C17887C1 m10439c(C3676s c3676s) {
        try {
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("viewport");
            C17943V1 c17943v1M10608b = abstractC3673pM4395w != null ? AbstractC9949p4.m10608b(abstractC3673pM4395w.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("scroll");
            return new C17887C1(c17943v1M10608b, abstractC3673pM4395w2 != null ? AbstractC9888f4.m10541d(abstractC3673pM4395w2.m4390m()) : null);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Display", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Display", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Display", e12);
        }
    }
}
