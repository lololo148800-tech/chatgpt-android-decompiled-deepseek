package p559Wn;

import ao.AbstractC11154b;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import mm.EnumC17307j;
import p033B5.C0821e;
import p225Im.InterfaceC3756d;
import p571X9.AbstractC9227W;
import p631Zn.InterfaceC10428a;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17678l;
import p909nm.C17689w;

/* JADX INFO: renamed from: Wn.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C8974f extends AbstractC11154b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3756d f27411a;

    /* JADX INFO: renamed from: b */
    public final List f27412b;

    /* JADX INFO: renamed from: c */
    public final Object f27413c;

    /* JADX INFO: renamed from: d */
    public final Map f27414d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f27415e;

    public C8974f(String str, InterfaceC3756d baseClass, InterfaceC3756d[] interfaceC3756dArr, KSerializer[] kSerializerArr) {
        AbstractC16544l.m18094g(baseClass, "baseClass");
        this.f27411a = baseClass;
        this.f27412b = C17689w.f56480Y;
        this.f27413c = AbstractC9227W.m9799b(EnumC17307j.f55133Y, new C0821e(str, 2, this));
        if (interfaceC3756dArr.length != kSerializerArr.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + baseClass.mo4448c() + " should be marked @Serializable");
        }
        Map mapM19253o = AbstractC17659D.m19253o(AbstractC17678l.m19294Q(interfaceC3756dArr, kSerializerArr));
        this.f27414d = mapM19253o;
        Set<Map.Entry> setEntrySet = mapM19253o.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : setEntrySet) {
            String strMo10679a = ((KSerializer) entry.getValue()).getDescriptor().mo10679a();
            Object obj = linkedHashMap.get(strMo10679a);
            if (obj == null) {
                linkedHashMap.containsKey(strMo10679a);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + this.f27411a + "' have the same serial name '" + strMo10679a + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(strMo10679a, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC17660E.m19257b(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (KSerializer) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.f27415e = linkedHashMap2;
    }

    @Override // ao.AbstractC11154b
    /* JADX INFO: renamed from: a */
    public final KSerializer mo7537a(InterfaceC10428a interfaceC10428a, String str) {
        KSerializer kSerializer = (KSerializer) this.f27415e.get(str);
        return kSerializer != null ? kSerializer : super.mo7537a(interfaceC10428a, str);
    }

    @Override // ao.AbstractC11154b
    /* JADX INFO: renamed from: b */
    public final KSerializer mo7538b(Encoder encoder, Object value) {
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        KSerializer kSerializerMo7538b = (KSerializer) this.f27414d.get(AbstractC16526C.f51263a.mo5693b(value.getClass()));
        if (kSerializerMo7538b == null) {
            kSerializerMo7538b = super.mo7538b(encoder, value);
        }
        if (kSerializerMo7538b != null) {
            return kSerializerMo7538b;
        }
        return null;
    }

    @Override // ao.AbstractC11154b
    /* JADX INFO: renamed from: c */
    public final InterfaceC3756d mo7539c() {
        return this.f27411a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f27413c.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8974f(String str, InterfaceC3756d baseClass, InterfaceC3756d[] interfaceC3756dArr, KSerializer[] kSerializerArr, Annotation[] annotationArr) {
        this(str, baseClass, interfaceC3756dArr, kSerializerArr);
        AbstractC16544l.m18094g(baseClass, "baseClass");
        this.f27412b = AbstractC17678l.m19296c(annotationArr);
    }
}
