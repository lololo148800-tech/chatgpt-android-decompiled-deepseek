package p274Km;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC16544l;
import p225Im.InterfaceC3759g;
import p225Im.InterfaceC3776x;
import p298Lm.AbstractC5147J0;
import p298Lm.AbstractC5202t;
import p298Lm.AbstractC5203t0;
import p323Mm.InterfaceC5500g;

/* JADX INFO: renamed from: Km.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4812a {
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, mm.i] */
    /* JADX INFO: renamed from: a */
    public static final Field m5445a(InterfaceC3776x interfaceC3776x) {
        AbstractC16544l.m18094g(interfaceC3776x, "<this>");
        AbstractC5203t0 abstractC5203t0M5715c = AbstractC5147J0.m5715c(interfaceC3776x);
        if (abstractC5203t0M5715c != null) {
            return (Field) abstractC5203t0M5715c.f16914w0.getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final Method m5446b(InterfaceC3759g interfaceC3759g) {
        InterfaceC5500g interfaceC5500gMo5735i;
        AbstractC16544l.m18094g(interfaceC3759g, "<this>");
        AbstractC5202t abstractC5202tM5713a = AbstractC5147J0.m5713a(interfaceC3759g);
        Member memberMo5917b = (abstractC5202tM5713a == null || (interfaceC5500gMo5735i = abstractC5202tM5713a.mo5735i()) == null) ? null : interfaceC5500gMo5735i.mo5917b();
        if (memberMo5917b instanceof Method) {
            return (Method) memberMo5917b;
        }
        return null;
    }
}
