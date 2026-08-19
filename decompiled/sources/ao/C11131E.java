package ao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import p160G5.p161rK.TVCuK;
import p606Yn.AbstractC10105f;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;
import p909nm.AbstractC17659D;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: ao.E */
/* JADX INFO: loaded from: classes2.dex */
public final class C11131E extends AbstractC11152a {

    /* JADX INFO: renamed from: a */
    public final KSerializer f33755a;

    /* JADX INFO: renamed from: b */
    public final KSerializer f33756b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f33757c;

    /* JADX INFO: renamed from: d */
    public final C11129D f33758d;

    public C11131E(KSerializer kSerializer, KSerializer kSerializer2, byte b) {
        this.f33755a = kSerializer;
        this.f33756b = kSerializer2;
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: a */
    public final Object mo12366a() {
        switch (this.f33757c) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: b */
    public final int mo12367b(Object obj) {
        switch (this.f33757c) {
            case 0:
                HashMap map = (HashMap) obj;
                AbstractC16544l.m18094g(map, "<this>");
                return map.size() * 2;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                AbstractC16544l.m18094g(linkedHashMap, "<this>");
                return linkedHashMap.size() * 2;
        }
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: c */
    public final Iterator mo12368c(Object obj) {
        switch (this.f33757c) {
            case 0:
                Map map = (Map) obj;
                AbstractC16544l.m18094g(map, "<this>");
                return map.entrySet().iterator();
            default:
                Map map2 = (Map) obj;
                AbstractC16544l.m18094g(map2, "<this>");
                return map2.entrySet().iterator();
        }
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: f */
    public final void mo12362f(InterfaceC10428a interfaceC10428a, int i10, Object obj, boolean z6) {
        int iMo10914s;
        Map builder = (Map) obj;
        AbstractC16544l.m18094g(builder, "builder");
        Object objMo5490y = interfaceC10428a.mo5490y(getDescriptor(), i10, this.f33755a, null);
        if (z6) {
            iMo10914s = interfaceC10428a.mo10914s(getDescriptor());
            if (iMo10914s != i10 + 1) {
                throw new IllegalArgumentException(AbstractC17792x.m19534q("Value must follow key in a map, index for key: ", i10, iMo10914s, ", returned index for value: ").toString());
            }
        } else {
            iMo10914s = i10 + 1;
        }
        boolean zContainsKey = builder.containsKey(objMo5490y);
        KSerializer kSerializer = this.f33756b;
        builder.put(objMo5490y, (!zContainsKey || (kSerializer.getDescriptor().getKind() instanceof AbstractC10105f)) ? interfaceC10428a.mo5490y(getDescriptor(), iMo10914s, kSerializer, null) : interfaceC10428a.mo5490y(getDescriptor(), iMo10914s, kSerializer, AbstractC17659D.m19243e(builder, objMo5490y)));
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: g */
    public final Object mo12363g(Object obj) {
        switch (this.f33757c) {
            case 0:
                AbstractC16544l.m18094g(null, "<this>");
                return new HashMap((Map) null);
            default:
                AbstractC16544l.m18094g(null, "<this>");
                return new LinkedHashMap((Map) null);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.f33757c) {
            case 0:
                break;
        }
        return this.f33758d;
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: h */
    public final Object mo12369h(Object obj) {
        switch (this.f33757c) {
            case 0:
                HashMap map = (HashMap) obj;
                AbstractC16544l.m18094g(map, "<this>");
                return map;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                AbstractC16544l.m18094g(linkedHashMap, "<this>");
                return linkedHashMap;
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        AbstractC16544l.m18094g(encoder, "encoder");
        int iMo12361d = mo12361d(obj);
        SerialDescriptor descriptor = getDescriptor();
        InterfaceC10429b interfaceC10429bMo5587u = encoder.mo5587u(descriptor, iMo12361d);
        Iterator itMo12368c = mo12368c(obj);
        int i10 = 0;
        while (itMo12368c.hasNext()) {
            Map.Entry entry = (Map.Entry) itMo12368c.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i11 = i10 + 1;
            interfaceC10429bMo5587u.mo5575i(getDescriptor(), i10, this.f33755a, key);
            i10 += 2;
            interfaceC10429bMo5587u.mo5575i(getDescriptor(), i11, this.f33756b, value);
        }
        interfaceC10429bMo5587u.mo5569b(descriptor);
    }

    @Override // ao.AbstractC11152a
    /* JADX INFO: renamed from: d */
    public final int mo12361d(Object obj) {
        switch (this.f33757c) {
            case 0:
                Map map = (Map) obj;
                AbstractC16544l.m18094g(map, "<this>");
                return map.size();
            default:
                Map map2 = (Map) obj;
                AbstractC16544l.m18094g(map2, TVCuK.JcOtrHc);
                return map2.size();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11131E(KSerializer kSerializer, KSerializer vSerializer, int i10) {
        this(kSerializer, vSerializer, (byte) 0);
        this.f33757c = i10;
        switch (i10) {
            case 1:
                AbstractC16544l.m18094g(kSerializer, "kSerializer");
                AbstractC16544l.m18094g(vSerializer, "vSerializer");
                this(kSerializer, vSerializer, (byte) 0);
                SerialDescriptor keyDesc = kSerializer.getDescriptor();
                SerialDescriptor valueDesc = vSerializer.getDescriptor();
                AbstractC16544l.m18094g(keyDesc, "keyDesc");
                AbstractC16544l.m18094g(valueDesc, "valueDesc");
                this.f33758d = new C11129D("kotlin.collections.LinkedHashMap", keyDesc, valueDesc);
                break;
            default:
                AbstractC16544l.m18094g(kSerializer, "kSerializer");
                AbstractC16544l.m18094g(vSerializer, "vSerializer");
                SerialDescriptor keyDesc2 = kSerializer.getDescriptor();
                SerialDescriptor valueDesc2 = vSerializer.getDescriptor();
                AbstractC16544l.m18094g(keyDesc2, "keyDesc");
                AbstractC16544l.m18094g(valueDesc2, "valueDesc");
                this.f33758d = new C11129D("kotlin.collections.HashMap", keyDesc2, valueDesc2);
                break;
        }
    }
}
