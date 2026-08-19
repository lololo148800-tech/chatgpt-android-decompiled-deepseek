package p040Bd;

import ao.C11163f0;
import bo.AbstractC11523k;
import bo.InterfaceC11522j;
import bo.InterfaceC11526n;
import com.openai.serialization.Fallback;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p225Im.InterfaceC3773u;
import p228J.AbstractC3794B0;
import p559Wn.C8976h;
import p606Yn.C10104e;
import p664bc.AbstractC11336c;
import p909nm.AbstractC17680n;
import tm.InterfaceC20006a;

/* JADX INFO: renamed from: Bd.M1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0961M1 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public final InterfaceC20006a f2730a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3773u f2731b;

    /* JADX INFO: renamed from: c */
    public final Enum f2732c;

    /* JADX INFO: renamed from: d */
    public final C11163f0 f2733d;

    public C0961M1(InterfaceC20006a enumValues, InterfaceC3773u valueProp) throws IllegalAccessException {
        AbstractC16544l.m18094g(enumValues, "enumValues");
        AbstractC16544l.m18094g(valueProp, "valueProp");
        this.f2730a = enumValues;
        this.f2731b = valueProp;
        Field[] declaredFields = AbstractC17680n.m19341Q(enumValues).getClass().getDeclaredFields();
        AbstractC16544l.m18093f(declaredFields, "getDeclaredFields(...)");
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : declaredFields) {
            if (field.isEnumConstant()) {
                arrayList.add(field);
            }
        }
        for (Field field2 : arrayList) {
            if (field2.isAnnotationPresent(Fallback.class)) {
                Object obj = field2.get(null);
                AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type E of com.openai.serialization.EnumWithFallbackSerializer");
                this.f2732c = (Enum) obj;
                String strMo4447a = AbstractC16526C.f51263a.mo5693b(this.f2730a.get(0).getClass()).mo4447a();
                this.f2733d = AbstractC11336c.m12772b(strMo4447a == null ? AbstractC3794B0.m4498w("toString(...)") : strMo4447a, C10104e.f29918j);
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        Object obj = null;
        InterfaceC11522j interfaceC11522j = decoder instanceof InterfaceC11522j ? (InterfaceC11522j) decoder : null;
        Enum r6 = this.f2732c;
        if (interfaceC11522j == null) {
            return r6;
        }
        String strMo5479m = interfaceC11522j.mo5479m();
        for (Object obj2 : this.f2730a) {
            if (AbstractC16544l.m18089b(this.f2731b.get((Enum) obj2), strMo5479m)) {
                obj = obj2;
                break;
            }
        }
        Enum r10 = (Enum) obj;
        return r10 == null ? r6 : r10;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f2733d;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Enum value = (Enum) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        InterfaceC11526n interfaceC11526n = encoder instanceof InterfaceC11526n ? (InterfaceC11526n) encoder : null;
        if (interfaceC11526n == null) {
            throw new C8976h("LeagueSerializer can only be used with JSON format");
        }
        interfaceC11526n.mo12921w(AbstractC11523k.m12910c((String) this.f2731b.get(value)));
    }
}
