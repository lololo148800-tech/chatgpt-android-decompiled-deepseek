package ao;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p001A.C0042V0;
import p049Bm.InterfaceC1436k;
import p225Im.InterfaceC3756d;
import p559Wn.C8976h;
import p571X9.AbstractC9306j0;
import p594Y9.AbstractC9810T3;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: ao.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC11154b implements KSerializer {
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public KSerializer mo7537a(InterfaceC10428a interfaceC10428a, String str) {
        C0042V0 c0042v0Mo10913a = interfaceC10428a.mo10913a();
        InterfaceC3756d baseClass = mo7539c();
        c0042v0Mo10913a.getClass();
        AbstractC16544l.m18094g(baseClass, "baseClass");
        Map map = (Map) c0042v0Mo10913a.f208q0.get(baseClass);
        KSerializer kSerializer = map != null ? (KSerializer) map.get(str) : null;
        if (!(kSerializer instanceof KSerializer)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        Object obj = c0042v0Mo10913a.f209r0.get(baseClass);
        InterfaceC1436k interfaceC1436k = AbstractC16529F.m18082f(1, obj) ? (InterfaceC1436k) obj : null;
        return interfaceC1436k != null ? (KSerializer) interfaceC1436k.invoke(str) : null;
    }

    /* JADX INFO: renamed from: b */
    public KSerializer mo7538b(Encoder encoder, Object value) {
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        return encoder.mo13069a().m214h(mo7539c(), value);
    }

    /* JADX INFO: renamed from: c */
    public abstract InterfaceC3756d mo7539c();

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(descriptor);
        Object objMo5490y = null;
        String strMo5483q = null;
        while (true) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(getDescriptor());
            if (iMo10914s == -1) {
                if (objMo5490y == null) {
                    throw new IllegalArgumentException(AbstractC9306j0.m9889h("Polymorphic value has not been read for class ", strMo5483q).toString());
                }
                interfaceC10428aMo5471c.mo5470b(descriptor);
                return objMo5490y;
            }
            if (iMo10914s == 0) {
                strMo5483q = interfaceC10428aMo5471c.mo5483q(getDescriptor(), iMo10914s);
            } else {
                if (iMo10914s != 1) {
                    StringBuilder sb2 = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    if (strMo5483q == null) {
                        strMo5483q = "unknown class";
                    }
                    sb2.append(strMo5483q);
                    sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb2.append(iMo10914s);
                    throw new C8976h(sb2.toString());
                }
                if (strMo5483q == null) {
                    throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                }
                objMo5490y = interfaceC10428aMo5471c.mo5490y(getDescriptor(), iMo10914s, AbstractC9810T3.m10437a(this, interfaceC10428aMo5471c, strMo5483q), null);
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object value) {
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        KSerializer kSerializerM10438b = AbstractC9810T3.m10438b(this, encoder, value);
        SerialDescriptor descriptor = getDescriptor();
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(descriptor);
        interfaceC10429bMo5570c.mo5584r(getDescriptor(), 0, kSerializerM10438b.getDescriptor().mo10679a());
        interfaceC10429bMo5570c.mo5575i(getDescriptor(), 1, kSerializerM10438b, value);
        interfaceC10429bMo5570c.mo5569b(descriptor);
    }
}
