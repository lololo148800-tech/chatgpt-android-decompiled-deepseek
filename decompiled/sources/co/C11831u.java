package co;

import ao.AbstractC11154b;
import ao.C11159d0;
import ao.C11164g;
import bo.AbstractC11516d;
import bo.AbstractC11523k;
import bo.C11521i;
import bo.C11524l;
import bo.EnumC11513a;
import bo.InterfaceC11526n;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.sentry.config.AbstractC15340a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.C16642a;
import kotlinx.serialization.json.C16644c;
import kotlinx.serialization.json.JsonNull;
import p001A.C0042V0;
import p008A6.C0386f;
import p025An.C0644w;
import p037B9.MeDP.MpoABj;
import p049Bm.InterfaceC1436k;
import p295Lj.AbstractC5103c;
import p559Wn.C8976h;
import p594Y9.AbstractC9810T3;
import p606Yn.AbstractC10103d;
import p606Yn.AbstractC10105f;
import p606Yn.C10109j;
import p606Yn.C10110k;
import p631Zn.InterfaceC10429b;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: co.u */
/* JADX INFO: loaded from: classes2.dex */
public class C11831u implements InterfaceC11526n, Encoder, InterfaceC10429b {

    /* JADX INFO: renamed from: a */
    public final ArrayList f35847a;

    /* JADX INFO: renamed from: b */
    public final AbstractC11516d f35848b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1436k f35849c;

    /* JADX INFO: renamed from: d */
    public final C11521i f35850d;

    /* JADX INFO: renamed from: e */
    public String f35851e;

    /* JADX INFO: renamed from: f */
    public String f35852f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f35853g;

    /* JADX INFO: renamed from: h */
    public Object f35854h;

    public C11831u(AbstractC11516d abstractC11516d, InterfaceC1436k interfaceC1436k, char c9) {
        this.f35847a = new ArrayList();
        this.f35848b = abstractC11516d;
        this.f35849c = interfaceC1436k;
        this.f35850d = abstractC11516d.f34843a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0079  */
    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: A */
    public final void mo5560A(KSerializer serializer, Object obj) {
        String strM13105k;
        AbstractC16544l.m18094g(serializer, "serializer");
        Object objM19353c0 = AbstractC17680n.m19353c0(this.f35847a);
        AbstractC11516d abstractC11516d = this.f35848b;
        if (objM19353c0 == null) {
            SerialDescriptor serialDescriptorM13102h = AbstractC11828r.m13102h(serializer.getDescriptor(), abstractC11516d.f34844b);
            if ((serialDescriptorM13102h.getKind() instanceof AbstractC10105f) || serialDescriptorM13102h.getKind() == C10109j.f29934b) {
                new C11831u(abstractC11516d, this.f35849c, 0).mo5560A(serializer, obj);
                return;
            }
        }
        C11521i c11521i = abstractC11516d.f34843a;
        if (c11521i.f34877i) {
            serializer.serialize(this, obj);
            return;
        }
        boolean z6 = serializer instanceof AbstractC11154b;
        if (!z6) {
            int iOrdinal = c11521i.f34885q.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    AbstractC15340a kind = serializer.getDescriptor().getKind();
                    strM13105k = (AbstractC16544l.m18089b(kind, C10110k.f29935b) || AbstractC16544l.m18089b(kind, C10110k.f29938e)) ? AbstractC11828r.m13105k(abstractC11516d, serializer.getDescriptor()) : null;
                } else if (iOrdinal != 2) {
                    throw new C0644w();
                }
            }
        } else if (c11521i.f34885q != EnumC11513a.f34836Y) {
        }
        if (z6) {
            AbstractC11154b abstractC11154b = (AbstractC11154b) serializer;
            if (obj == null) {
                throw new IllegalArgumentException(("Value for serializer " + abstractC11154b.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            KSerializer kSerializerM10438b = AbstractC9810T3.m10438b(abstractC11154b, this, obj);
            if (strM13105k != null) {
                AbstractC11828r.m13100f(serializer, kSerializerM10438b, strM13105k);
            }
            AbstractC11828r.m13104j(kSerializerM10438b.getDescriptor().getKind());
            serializer = kSerializerM10438b;
        }
        if (strM13105k != null) {
            String strMo10679a = serializer.getDescriptor().mo10679a();
            this.f35851e = strM13105k;
            this.f35852f = strMo10679a;
        }
        serializer.serialize(this, obj);
    }

    @Override // p631Zn.InterfaceC10429b
    /* JADX INFO: renamed from: B */
    public final void mo5561B(SerialDescriptor descriptor, int i10, double d10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        m13122I(m13126M(descriptor, i10), d10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: C */
    public final void mo5562C(long j10) {
        String tag = (String) m13127N();
        AbstractC16544l.m18094g(tag, "tag");
        mo13128O(tag, AbstractC11523k.m12909b(Long.valueOf(j10)));
    }

    @Override // p631Zn.InterfaceC10429b
    /* JADX INFO: renamed from: D */
    public final void mo5563D(C11159d0 descriptor, int i10, byte b) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        mo13128O(m13126M(descriptor, i10), AbstractC11523k.m12909b(Byte.valueOf(b)));
    }

    @Override // p631Zn.InterfaceC10429b
    /* JADX INFO: renamed from: E */
    public final void mo5564E(SerialDescriptor descriptor, int i10, long j10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        mo13128O(m13126M(descriptor, i10), AbstractC11523k.m12909b(Long.valueOf(j10)));
    }

    @Override // p631Zn.InterfaceC10429b
    /* JADX INFO: renamed from: F */
    public final boolean mo5565F(SerialDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return this.f35850d.f34869a;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: G */
    public final void mo5566G(String value) {
        AbstractC16544l.m18094g(value, "value");
        String tag = (String) m13127N();
        AbstractC16544l.m18094g(tag, "tag");
        mo13128O(tag, AbstractC11523k.m12910c(value));
    }

    /* JADX INFO: renamed from: H */
    public final void m13121H(SerialDescriptor descriptor, int i10, KSerializer serializer, Object obj) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(serializer, "serializer");
        this.f35847a.add(m13126M(descriptor, i10));
        AbstractC5103c.m5668d(this, serializer, obj);
    }

    /* JADX INFO: renamed from: I */
    public final void m13122I(Object obj, double d10) {
        String tag = (String) obj;
        AbstractC16544l.m18094g(tag, "tag");
        mo13128O(tag, AbstractC11523k.m12909b(Double.valueOf(d10)));
        if (this.f35850d.f34879k) {
            return;
        }
        if (Double.isInfinite(d10) || Double.isNaN(d10)) {
            Double dValueOf = Double.valueOf(d10);
            String output = mo13125L().toString();
            AbstractC16544l.m18094g(output, "output");
            throw new C11825o(AbstractC11828r.m13120z(dValueOf, tag, output));
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m13123J(Object obj, float f10) {
        String tag = (String) obj;
        AbstractC16544l.m18094g(tag, "tag");
        mo13128O(tag, AbstractC11523k.m12909b(Float.valueOf(f10)));
        if (this.f35850d.f34879k) {
            return;
        }
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            Float fValueOf = Float.valueOf(f10);
            String output = mo13125L().toString();
            AbstractC16544l.m18094g(output, "output");
            throw new C11825o(AbstractC11828r.m13120z(fValueOf, tag, output));
        }
    }

    /* JADX INFO: renamed from: K */
    public final Encoder m13124K(Object obj, SerialDescriptor inlineDescriptor) {
        String tag = (String) obj;
        AbstractC16544l.m18094g(tag, "tag");
        AbstractC16544l.m18094g(inlineDescriptor, "inlineDescriptor");
        if (AbstractC11806G.m13070a(inlineDescriptor)) {
            return new C11812b(this, tag);
        }
        if (inlineDescriptor.isInline() && inlineDescriptor.equals(AbstractC11523k.f34886a)) {
            return new C11812b(this, tag, inlineDescriptor);
        }
        this.f35847a.add(tag);
        return this;
    }

    /* JADX INFO: renamed from: L */
    public AbstractC16643b mo13125L() {
        switch (this.f35853g) {
            case 0:
                AbstractC16643b abstractC16643b = (AbstractC16643b) this.f35854h;
                if (abstractC16643b != null) {
                    return abstractC16643b;
                }
                throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
            case 1:
                return new C16644c((LinkedHashMap) this.f35854h);
            default:
                return new C16642a((ArrayList) this.f35854h);
        }
    }

    /* JADX INFO: renamed from: M */
    public final String m13126M(SerialDescriptor descriptor, int i10) {
        String nestedName;
        AbstractC16544l.m18094g(descriptor, "<this>");
        switch (this.f35853g) {
            case 2:
                AbstractC16544l.m18094g(descriptor, "descriptor");
                nestedName = String.valueOf(i10);
                break;
            default:
                AbstractC16544l.m18094g(descriptor, "descriptor");
                nestedName = AbstractC11828r.m13108n(descriptor, this.f35848b, i10);
                break;
        }
        AbstractC16544l.m18094g(nestedName, "nestedName");
        return nestedName;
    }

    /* JADX INFO: renamed from: N */
    public final Object m13127N() {
        ArrayList arrayList = this.f35847a;
        if (arrayList.isEmpty()) {
            throw new C8976h("No tag in stack for requested element");
        }
        return arrayList.remove(AbstractC17681o.m19381j(arrayList));
    }

    /* JADX INFO: renamed from: O */
    public void mo13128O(String key, AbstractC16643b element) {
        switch (this.f35853g) {
            case 0:
                AbstractC16544l.m18094g(key, "key");
                AbstractC16544l.m18094g(element, "element");
                if (key != "primitive") {
                    throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag");
                }
                if (((AbstractC16643b) this.f35854h) != null) {
                    throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
                }
                this.f35854h = element;
                this.f35849c.invoke(element);
                return;
            case 1:
                AbstractC16544l.m18094g(key, "key");
                AbstractC16544l.m18094g(element, "element");
                ((LinkedHashMap) this.f35854h).put(key, element);
                return;
            default:
                AbstractC16544l.m18094g(key, "key");
                AbstractC16544l.m18094g(element, "element");
                ((ArrayList) this.f35854h).add(Integer.parseInt(key), element);
                return;
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: a */
    public final C0042V0 mo13069a() {
        return this.f35848b.f34844b;
    }

    @Override // p631Zn.InterfaceC10429b
    /* JADX INFO: renamed from: b */
    public final void mo5569b(SerialDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        if (!this.f35847a.isEmpty()) {
            m13127N();
        }
        this.f35849c.invoke(mo13125L());
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: c */
    public final InterfaceC10429b mo5570c(SerialDescriptor descriptor) {
        C11831u c11831u;
        AbstractC16544l.m18094g(descriptor, "descriptor");
        InterfaceC1436k nodeConsumer = AbstractC17680n.m19353c0(this.f35847a) == null ? this.f35849c : new C0386f(this, 23);
        AbstractC15340a kind = descriptor.getKind();
        boolean zM18089b = AbstractC16544l.m18089b(kind, C10110k.f29936c);
        AbstractC11516d abstractC11516d = this.f35848b;
        if (zM18089b || (kind instanceof AbstractC10103d)) {
            c11831u = new C11831u(abstractC11516d, nodeConsumer, 2);
        } else if (AbstractC16544l.m18089b(kind, C10110k.f29937d)) {
            SerialDescriptor serialDescriptorM13102h = AbstractC11828r.m13102h(descriptor.mo10685h(0), abstractC11516d.f34844b);
            AbstractC15340a kind2 = serialDescriptorM13102h.getKind();
            if ((kind2 instanceof AbstractC10105f) || AbstractC16544l.m18089b(kind2, C10109j.f29934b)) {
                AbstractC16544l.m18094g(nodeConsumer, "nodeConsumer");
                C11835y c11835y = new C11835y(abstractC11516d, nodeConsumer, 1);
                c11835y.f35867j = true;
                c11831u = c11835y;
            } else {
                if (!abstractC11516d.f34843a.f34872d) {
                    throw AbstractC11828r.m13096b(serialDescriptorM13102h);
                }
                c11831u = new C11831u(abstractC11516d, nodeConsumer, 2);
            }
        } else {
            c11831u = new C11831u(abstractC11516d, nodeConsumer, 1);
        }
        String str = this.f35851e;
        if (str != null) {
            if (c11831u instanceof C11835y) {
                C11835y c11835y2 = (C11835y) c11831u;
                c11835y2.mo13128O(SubscriberAttributeKt.JSON_NAME_KEY, AbstractC11523k.m12910c(str));
                String strMo10679a = this.f35852f;
                if (strMo10679a == null) {
                    strMo10679a = descriptor.mo10679a();
                }
                c11835y2.mo13128O("value", AbstractC11523k.m12910c(strMo10679a));
            } else {
                String strMo10679a2 = this.f35852f;
                if (strMo10679a2 == null) {
                    strMo10679a2 = descriptor.mo10679a();
                }
                c11831u.mo13128O(str, AbstractC11523k.m12910c(strMo10679a2));
            }
            this.f35851e = null;
            this.f35852f = null;
        }
        return c11831u;
    }

    @Override // bo.InterfaceC11526n
    /* JADX INFO: renamed from: d */
    public final AbstractC11516d mo12920d() {
        return this.f35848b;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: e */
    public final void mo5571e(Boolean bool) {
        AbstractC5103c.m5668d(this, C11164g.f33804a, bool);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: f */
    public final void mo5572f() {
        String str = (String) AbstractC17680n.m19353c0(this.f35847a);
        if (str == null) {
            this.f35849c.invoke(JsonNull.INSTANCE);
        } else {
            mo13128O(str, JsonNull.INSTANCE);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: g */
    public final void mo5573g(double d10) {
        m13122I(m13127N(), d10);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: h */
    public final void mo5574h(short s10) {
        String tag = (String) m13127N();
        AbstractC16544l.m18094g(tag, "tag");
        mo13128O(tag, AbstractC11523k.m12909b(Short.valueOf(s10)));
    }

    @Override // p631Zn.InterfaceC10429b
    /* JADX INFO: renamed from: i */
    public final void mo5575i(SerialDescriptor descriptor, int i10, KSerializer serializer, Object obj) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(serializer, "serializer");
        this.f35847a.add(m13126M(descriptor, i10));
        mo5560A(serializer, obj);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: j */
    public final void mo5576j(byte b) {
        String tag = (String) m13127N();
        AbstractC16544l.m18094g(tag, "tag");
        mo13128O(tag, AbstractC11523k.m12909b(Byte.valueOf(b)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: k */
    public final void mo5577k(boolean z6) {
        String tag = (String) m13127N();
        AbstractC16544l.m18094g(tag, "tag");
        mo13128O(tag, AbstractC11523k.m12908a(Boolean.valueOf(z6)));
    }

    @Override // p631Zn.InterfaceC10429b
    /* JADX INFO: renamed from: l */
    public final void mo5578l(SerialDescriptor descriptor, int i10, float f10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        m13123J(m13126M(descriptor, i10), f10);
    }

    @Override // p631Zn.InterfaceC10429b
    /* JADX INFO: renamed from: m */
    public final void mo5579m(int i10, int i11, SerialDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        mo13128O(m13126M(descriptor, i10), AbstractC11523k.m12909b(Integer.valueOf(i11)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: n */
    public final void mo5580n(float f10) {
        m13123J(m13127N(), f10);
    }

    @Override // p631Zn.InterfaceC10429b
    /* JADX INFO: renamed from: o */
    public final Encoder mo5581o(C11159d0 descriptor, int i10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return m13124K(m13126M(descriptor, i10), descriptor.mo10685h(i10));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: p */
    public final void mo5582p(char c9) {
        String tag = (String) m13127N();
        AbstractC16544l.m18094g(tag, "tag");
        mo13128O(tag, AbstractC11523k.m12910c(String.valueOf(c9)));
    }

    @Override // p631Zn.InterfaceC10429b
    /* JADX INFO: renamed from: q */
    public final void mo5583q(SerialDescriptor descriptor, int i10, boolean z6) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        mo13128O(m13126M(descriptor, i10), AbstractC11523k.m12908a(Boolean.valueOf(z6)));
    }

    @Override // p631Zn.InterfaceC10429b
    /* JADX INFO: renamed from: r */
    public final void mo5584r(SerialDescriptor descriptor, int i10, String value) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(value, "value");
        mo13128O(m13126M(descriptor, i10), AbstractC11523k.m12910c(value));
    }

    @Override // p631Zn.InterfaceC10429b
    /* JADX INFO: renamed from: s */
    public void mo5585s(SerialDescriptor descriptor, int i10, KSerializer serializer, Object obj) {
        switch (this.f35853g) {
            case 1:
                AbstractC16544l.m18094g(descriptor, "descriptor");
                AbstractC16544l.m18094g(serializer, "serializer");
                if (obj != null || this.f35850d.f34874f) {
                    m13121H(descriptor, i10, serializer, obj);
                }
                break;
            default:
                m13121H(descriptor, i10, serializer, obj);
                break;
        }
    }

    @Override // p631Zn.InterfaceC10429b
    /* JADX INFO: renamed from: t */
    public final void mo5586t(C11159d0 descriptor, int i10, char c9) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        mo13128O(m13126M(descriptor, i10), AbstractC11523k.m12910c(String.valueOf(c9)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: u */
    public final InterfaceC10429b mo5587u(SerialDescriptor descriptor, int i10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return mo5570c(descriptor);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: v */
    public final void mo5588v(SerialDescriptor enumDescriptor, int i10) {
        AbstractC16544l.m18094g(enumDescriptor, "enumDescriptor");
        String tag = (String) m13127N();
        AbstractC16544l.m18094g(tag, "tag");
        mo13128O(tag, AbstractC11523k.m12910c(enumDescriptor.mo10683f(i10)));
    }

    @Override // bo.InterfaceC11526n
    /* JADX INFO: renamed from: w */
    public final void mo12921w(AbstractC16643b element) {
        AbstractC16544l.m18094g(element, "element");
        if (this.f35851e == null || (element instanceof C16644c)) {
            mo5560A(C11524l.f34887a, element);
        } else {
            AbstractC11828r.m13118x(this.f35852f, element);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: x */
    public final void mo5589x(int i10) {
        String tag = (String) m13127N();
        AbstractC16544l.m18094g(tag, "tag");
        mo13128O(tag, AbstractC11523k.m12909b(Integer.valueOf(i10)));
    }

    @Override // p631Zn.InterfaceC10429b
    /* JADX INFO: renamed from: z */
    public final void mo5591z(C11159d0 descriptor, int i10, short s10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        mo13128O(m13126M(descriptor, i10), AbstractC11523k.m12909b(Short.valueOf(s10)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: y */
    public final Encoder mo5590y(SerialDescriptor serialDescriptor) {
        AbstractC16544l.m18094g(serialDescriptor, MpoABj.jHiYH);
        if (AbstractC17680n.m19353c0(this.f35847a) == null) {
            return new C11831u(this.f35848b, this.f35849c, 0).mo5590y(serialDescriptor);
        }
        if (this.f35851e != null) {
            this.f35852f = serialDescriptor.mo10679a();
        }
        return m13124K(m13127N(), serialDescriptor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11831u(AbstractC11516d json, InterfaceC1436k nodeConsumer, int i10) {
        this(json, nodeConsumer, (char) 0);
        this.f35853g = i10;
        switch (i10) {
            case 1:
                AbstractC16544l.m18094g(json, "json");
                AbstractC16544l.m18094g(nodeConsumer, "nodeConsumer");
                this(json, nodeConsumer, (char) 0);
                this.f35854h = new LinkedHashMap();
                break;
            case 2:
                AbstractC16544l.m18094g(json, "json");
                AbstractC16544l.m18094g(nodeConsumer, "nodeConsumer");
                this(json, nodeConsumer, (char) 0);
                this.f35854h = new ArrayList();
                break;
            default:
                AbstractC16544l.m18094g(json, "json");
                AbstractC16544l.m18094g(nodeConsumer, "nodeConsumer");
                this.f35847a.add("primitive");
                break;
        }
    }
}
