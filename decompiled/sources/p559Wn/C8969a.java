package p559Wn;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import ao.AbstractC11153a0;
import ao.C11200y;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import mm.C17314q;
import mm.EnumC17307j;
import p001A.C0042V0;
import p008A6.C0386f;
import p033B5.C0821e;
import p225Im.InterfaceC3756d;
import p571X9.AbstractC9227W;
import p606Yn.C10101b;
import p606Yn.C10108i;
import p631Zn.InterfaceC10428a;
import p664bc.AbstractC11336c;
import p909nm.AbstractC17678l;
import p909nm.C17689w;

/* JADX INFO: renamed from: Wn.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C8969a implements KSerializer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f27401a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f27402b;

    /* JADX INFO: renamed from: c */
    public final Object f27403c;

    /* JADX INFO: renamed from: d */
    public final Object f27404d;

    public C8969a(String str, Object objectInstance) {
        AbstractC16544l.m18094g(objectInstance, "objectInstance");
        this.f27402b = objectInstance;
        this.f27403c = C17689w.f56480Y;
        this.f27404d = AbstractC9227W.m9799b(EnumC17307j.f55133Y, new C0821e(str, 4, this));
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        switch (this.f27401a) {
            case 0:
                AbstractC16544l.m18094g(decoder, "decoder");
                C0042V0 c0042v0Mo10913a = decoder.mo10913a();
                List list = (List) this.f27403c;
                InterfaceC3756d interfaceC3756d = (InterfaceC3756d) this.f27402b;
                KSerializer kSerializerM213g = c0042v0Mo10913a.m213g(interfaceC3756d, list);
                if (kSerializerM213g != null) {
                    return decoder.mo5482p(kSerializerM213g);
                }
                AbstractC11153a0.m12388k(interfaceC3756d);
                throw null;
            case 1:
                AbstractC16544l.m18094g(decoder, "decoder");
                int iMo5475h = decoder.mo5475h(getDescriptor());
                Enum[] enumArr = (Enum[]) this.f27402b;
                if (iMo5475h >= 0 && iMo5475h < enumArr.length) {
                    return enumArr[iMo5475h];
                }
                throw new C8976h(iMo5475h + " is not among valid " + getDescriptor().mo10679a() + " enum values, values size is " + enumArr.length);
            default:
                AbstractC16544l.m18094g(decoder, "decoder");
                SerialDescriptor descriptor = getDescriptor();
                InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(descriptor);
                int iMo10914s = interfaceC10428aMo5471c.mo10914s(getDescriptor());
                if (iMo10914s != -1) {
                    throw new C8976h(AbstractC10763a.m11048f(iMo10914s, "Unexpected index "));
                }
                interfaceC10428aMo5471c.mo5470b(descriptor);
                return this.f27402b;
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, mm.i] */
    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.f27401a) {
            case 0:
                return (C10101b) this.f27404d;
            case 1:
                return (SerialDescriptor) ((C17314q) this.f27404d).getValue();
            default:
                return (SerialDescriptor) this.f27404d.getValue();
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object value) {
        switch (this.f27401a) {
            case 0:
                AbstractC16544l.m18094g(encoder, "encoder");
                AbstractC16544l.m18094g(value, "value");
                C0042V0 c0042v0Mo13069a = encoder.mo13069a();
                List list = (List) this.f27403c;
                InterfaceC3756d interfaceC3756d = (InterfaceC3756d) this.f27402b;
                KSerializer kSerializerM213g = c0042v0Mo13069a.m213g(interfaceC3756d, list);
                if (kSerializerM213g != null) {
                    encoder.mo5560A(kSerializerM213g, value);
                    return;
                } else {
                    AbstractC11153a0.m12388k(interfaceC3756d);
                    throw null;
                }
            case 1:
                Enum value2 = (Enum) value;
                AbstractC16544l.m18094g(encoder, "encoder");
                AbstractC16544l.m18094g(value2, "value");
                Enum[] enumArr = (Enum[]) this.f27402b;
                int iM19279B = AbstractC17678l.m19279B(value2, enumArr);
                if (iM19279B != -1) {
                    encoder.mo5588v(getDescriptor(), iM19279B);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(value2);
                sb2.append(" is not a valid enum ");
                sb2.append(getDescriptor().mo10679a());
                sb2.append(", must be one of ");
                String string = Arrays.toString(enumArr);
                AbstractC16544l.m18093f(string, "toString(...)");
                sb2.append(string);
                throw new C8976h(sb2.toString());
            default:
                AbstractC16544l.m18094g(encoder, "encoder");
                AbstractC16544l.m18094g(value, "value");
                encoder.mo5570c(getDescriptor()).mo5569b(getDescriptor());
                return;
        }
    }

    public String toString() {
        switch (this.f27401a) {
            case 1:
                return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().mo10679a() + '>';
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8969a(String str, Object objectInstance, Annotation[] annotationArr) {
        this(str, objectInstance);
        AbstractC16544l.m18094g(objectInstance, "objectInstance");
        this.f27403c = AbstractC17678l.m19296c(annotationArr);
    }

    public C8969a(InterfaceC3756d serializableClass, KSerializer[] kSerializerArr) {
        AbstractC16544l.m18094g(serializableClass, "serializableClass");
        this.f27402b = serializableClass;
        this.f27403c = AbstractC17678l.m19296c(kSerializerArr);
        this.f27404d = new C10101b(AbstractC11336c.m12774d("kotlinx.serialization.ContextualSerializer", C10108i.f29933b, new SerialDescriptor[0], new C0386f(this, 17)), serializableClass);
    }

    public C8969a(String str, Enum[] values) {
        AbstractC16544l.m18094g(values, "values");
        this.f27402b = values;
        this.f27404d = AbstractC9227W.m9800c(new C0821e(this, 3, str));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8969a(String str, Enum[] values, C11200y c11200y) {
        this(str, values);
        AbstractC16544l.m18094g(values, "values");
        this.f27403c = c11200y;
    }
}
