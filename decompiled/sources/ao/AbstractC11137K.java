package ao;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import bo.InterfaceC11522j;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.AbstractC16643b;
import p001A.AbstractC0010F;
import p001A.C0042V0;
import p008A6.C0383c;
import p225Im.InterfaceC3756d;
import p523V9.AbstractC8017W3;
import p559Wn.C8976h;
import p594Y9.AbstractC9816U3;
import p606Yn.C10102c;
import p606Yn.C10106g;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;
import p664bc.AbstractC11336c;

/* JADX INFO: renamed from: ao.K */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC11137K implements KSerializer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33766a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f33767b;

    /* JADX INFO: renamed from: c */
    public final Object f33768c;

    public AbstractC11137K(KSerializer kSerializer, KSerializer kSerializer2) {
        this.f33767b = kSerializer;
        this.f33768c = kSerializer2;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo12373a(Object obj);

    /* JADX INFO: renamed from: b */
    public abstract Object mo12374b(Object obj);

    /* JADX INFO: renamed from: c */
    public abstract KSerializer mo1967c(AbstractC16643b abstractC16643b);

    /* JADX INFO: renamed from: d */
    public abstract Object mo12375d(Object obj, Object obj2);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        switch (this.f33766a) {
            case 0:
                AbstractC16544l.m18094g(decoder, "decoder");
                SerialDescriptor descriptor = getDescriptor();
                InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(descriptor);
                Object obj = AbstractC11153a0.f33791c;
                Object objMo5490y = obj;
                Object objMo5490y2 = objMo5490y;
                while (true) {
                    int iMo10914s = interfaceC10428aMo5471c.mo10914s(getDescriptor());
                    if (iMo10914s == -1) {
                        if (objMo5490y == obj) {
                            throw new C8976h("Element 'key' is missing");
                        }
                        if (objMo5490y2 == obj) {
                            throw new C8976h("Element 'value' is missing");
                        }
                        Object objMo12375d = mo12375d(objMo5490y, objMo5490y2);
                        interfaceC10428aMo5471c.mo5470b(descriptor);
                        return objMo12375d;
                    }
                    if (iMo10914s == 0) {
                        objMo5490y = interfaceC10428aMo5471c.mo5490y(getDescriptor(), 0, (KSerializer) this.f33767b, null);
                    } else {
                        if (iMo10914s != 1) {
                            throw new C8976h(AbstractC10763a.m11048f(iMo10914s, "Invalid index: "));
                        }
                        objMo5490y2 = interfaceC10428aMo5471c.mo5490y(getDescriptor(), 1, (KSerializer) this.f33768c, null);
                    }
                }
                break;
            default:
                AbstractC16544l.m18094g(decoder, "decoder");
                InterfaceC11522j interfaceC11522jM8339c = AbstractC8017W3.m8339c(decoder);
                AbstractC16643b abstractC16643bMo12907j = interfaceC11522jM8339c.mo12907j();
                KSerializer kSerializerMo1967c = mo1967c(abstractC16643bMo12907j);
                AbstractC16544l.m18092e(kSerializerMo1967c, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>");
                return interfaceC11522jM8339c.mo12906d().m12902a(kSerializerMo1967c, abstractC16643bMo12907j);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return (C10106g) this.f33768c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object value) {
        switch (this.f33766a) {
            case 0:
                AbstractC16544l.m18094g(encoder, "encoder");
                InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(getDescriptor());
                interfaceC10429bMo5570c.mo5575i(getDescriptor(), 0, (KSerializer) this.f33767b, mo12373a(value));
                interfaceC10429bMo5570c.mo5575i(getDescriptor(), 1, (KSerializer) this.f33768c, mo12374b(value));
                interfaceC10429bMo5570c.mo5569b(getDescriptor());
                return;
            default:
                AbstractC16544l.m18094g(encoder, "encoder");
                AbstractC16544l.m18094g(value, "value");
                C0042V0 c0042v0Mo13069a = encoder.mo13069a();
                InterfaceC3756d interfaceC3756d = (InterfaceC3756d) this.f33767b;
                KSerializer kSerializerM214h = c0042v0Mo13069a.m214h(interfaceC3756d, value);
                if (kSerializerM214h == null) {
                    Class<?> cls = value.getClass();
                    C16527D c16527d = AbstractC16526C.f51263a;
                    kSerializerM214h = AbstractC9816U3.m10454e(c16527d.mo5693b(cls));
                    if (kSerializerM214h == null) {
                        InterfaceC3756d interfaceC3756dMo5693b = c16527d.mo5693b(value.getClass());
                        String strMo4448c = interfaceC3756dMo5693b.mo4448c();
                        if (strMo4448c == null) {
                            strMo4448c = String.valueOf(interfaceC3756dMo5693b);
                        }
                        throw new C8976h(AbstractC0010F.m20d("Class '", strMo4448c, "' is not registered for polymorphic serialization ", "in the scope of '" + interfaceC3756d.mo4448c() + '\'', ".\nMark the base class as 'sealed' or register the serializer explicitly."));
                    }
                }
                kSerializerM214h.serialize(encoder, value);
                return;
        }
    }

    public AbstractC11137K(InterfaceC3756d baseClass) {
        AbstractC16544l.m18094g(baseClass, "baseClass");
        this.f33767b = baseClass;
        this.f33768c = AbstractC11336c.m12774d("JsonContentPolymorphicSerializer<" + baseClass.mo4448c() + '>', C10102c.f29909c, new SerialDescriptor[0], new C0383c(24));
    }
}
