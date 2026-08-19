package co;

import ao.AbstractC11154b;
import bo.AbstractC11516d;
import bo.AbstractC11523k;
import bo.C11521i;
import bo.C11524l;
import bo.EnumC11513a;
import bo.InterfaceC11526n;
import io.sentry.config.AbstractC15340a;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.C16644c;
import p001A.C0042V0;
import p001A.C0095w0;
import p025An.C0644w;
import p283L5.AbstractC4941g;
import p594Y9.AbstractC9810T3;
import p606Yn.C10110k;
import p631Zn.InterfaceC10429b;
import p826j6.C16137F;

/* JADX INFO: renamed from: co.F */
/* JADX INFO: loaded from: classes2.dex */
public final class C11805F extends AbstractC4941g implements InterfaceC11526n {

    /* JADX INFO: renamed from: a */
    public final C0095w0 f35785a;

    /* JADX INFO: renamed from: b */
    public final AbstractC11516d f35786b;

    /* JADX INFO: renamed from: c */
    public final EnumC11810K f35787c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC11526n[] f35788d;

    /* JADX INFO: renamed from: e */
    public final C0042V0 f35789e;

    /* JADX INFO: renamed from: f */
    public final C11521i f35790f;

    /* JADX INFO: renamed from: g */
    public boolean f35791g;

    /* JADX INFO: renamed from: h */
    public String f35792h;

    /* JADX INFO: renamed from: i */
    public String f35793i;

    public C11805F(C0095w0 composer, AbstractC11516d json, EnumC11810K enumC11810K, InterfaceC11526n[] interfaceC11526nArr) {
        AbstractC16544l.m18094g(composer, "composer");
        AbstractC16544l.m18094g(json, "json");
        this.f35785a = composer;
        this.f35786b = json;
        this.f35787c = enumC11810K;
        this.f35788d = interfaceC11526nArr;
        this.f35789e = json.f34844b;
        this.f35790f = json.f34843a;
        int iOrdinal = enumC11810K.ordinal();
        if (interfaceC11526nArr != null) {
            InterfaceC11526n interfaceC11526n = interfaceC11526nArr[iOrdinal];
            if (interfaceC11526n == null && interfaceC11526n == this) {
                return;
            }
            interfaceC11526nArr[iOrdinal] = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    @Override // p283L5.AbstractC4941g, kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: A */
    public final void mo5560A(KSerializer serializer, Object obj) {
        String strM13105k;
        AbstractC16544l.m18094g(serializer, "serializer");
        AbstractC11516d abstractC11516d = this.f35786b;
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
            this.f35792h = strM13105k;
            this.f35793i = strMo10679a;
        }
        serializer.serialize(this, obj);
    }

    @Override // p283L5.AbstractC4941g, kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: C */
    public final void mo5562C(long j10) {
        if (this.f35791g) {
            mo5566G(String.valueOf(j10));
        } else {
            this.f35785a.mo383t(j10);
        }
    }

    @Override // p283L5.AbstractC4941g, p631Zn.InterfaceC10429b
    /* JADX INFO: renamed from: F */
    public final boolean mo5565F(SerialDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return this.f35790f.f34869a;
    }

    @Override // p283L5.AbstractC4941g, kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: G */
    public final void mo5566G(String value) {
        AbstractC16544l.m18094g(value, "value");
        this.f35785a.mo387y(value);
    }

    @Override // p283L5.AbstractC4941g
    /* JADX INFO: renamed from: S */
    public final void mo5567S(SerialDescriptor descriptor, int i10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        int iOrdinal = this.f35787c.ordinal();
        boolean z6 = true;
        C0095w0 c0095w0 = this.f35785a;
        if (iOrdinal == 1) {
            if (!c0095w0.f410Z) {
                c0095w0.m380q(',');
            }
            c0095w0.mo377n();
            return;
        }
        if (iOrdinal == 2) {
            if (c0095w0.f410Z) {
                this.f35791g = true;
                c0095w0.mo377n();
                return;
            }
            if (i10 % 2 == 0) {
                c0095w0.m380q(',');
                c0095w0.mo377n();
            } else {
                c0095w0.m380q(':');
                c0095w0.mo359C();
                z6 = false;
            }
            this.f35791g = z6;
            return;
        }
        if (iOrdinal != 3) {
            if (!c0095w0.f410Z) {
                c0095w0.m380q(',');
            }
            c0095w0.mo377n();
            mo5566G(AbstractC11828r.m13108n(descriptor, this.f35786b, i10));
            c0095w0.m380q(':');
            c0095w0.mo359C();
            return;
        }
        if (i10 == 0) {
            this.f35791g = true;
        }
        if (i10 == 1) {
            c0095w0.m380q(',');
            c0095w0.mo359C();
            this.f35791g = false;
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: a */
    public final C0042V0 mo13069a() {
        return this.f35789e;
    }

    @Override // p283L5.AbstractC4941g, p631Zn.InterfaceC10429b
    /* JADX INFO: renamed from: b */
    public final void mo5569b(SerialDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        EnumC11810K enumC11810K = this.f35787c;
        C0095w0 c0095w0 = this.f35785a;
        c0095w0.mo361E();
        c0095w0.mo378o();
        c0095w0.m380q(enumC11810K.f35805Z);
    }

    @Override // p283L5.AbstractC4941g, kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: c */
    public final InterfaceC10429b mo5570c(SerialDescriptor descriptor) {
        InterfaceC11526n interfaceC11526n;
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC11516d abstractC11516d = this.f35786b;
        EnumC11810K enumC11810KM13116v = AbstractC11828r.m13116v(abstractC11516d, descriptor);
        char c9 = enumC11810KM13116v.f35804Y;
        C0095w0 c0095w0 = this.f35785a;
        c0095w0.m380q(c9);
        c0095w0.mo372i();
        String str = this.f35792h;
        if (str != null) {
            String strMo10679a = this.f35793i;
            if (strMo10679a == null) {
                strMo10679a = descriptor.mo10679a();
            }
            c0095w0.mo377n();
            mo5566G(str);
            c0095w0.m380q(':');
            c0095w0.mo359C();
            mo5566G(strMo10679a);
            this.f35792h = null;
            this.f35793i = null;
        }
        if (this.f35787c == enumC11810KM13116v) {
            return this;
        }
        InterfaceC11526n[] interfaceC11526nArr = this.f35788d;
        return (interfaceC11526nArr == null || (interfaceC11526n = interfaceC11526nArr[enumC11810KM13116v.ordinal()]) == null) ? new C11805F(c0095w0, abstractC11516d, enumC11810KM13116v, interfaceC11526nArr) : interfaceC11526n;
    }

    @Override // bo.InterfaceC11526n
    /* JADX INFO: renamed from: d */
    public final AbstractC11516d mo12920d() {
        return this.f35786b;
    }

    @Override // p283L5.AbstractC4941g, kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: f */
    public final void mo5572f() {
        this.f35785a.m385w("null");
    }

    @Override // p283L5.AbstractC4941g, kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: g */
    public final void mo5573g(double d10) {
        boolean z6 = this.f35791g;
        C0095w0 c0095w0 = this.f35785a;
        if (z6) {
            mo5566G(String.valueOf(d10));
        } else {
            c0095w0.getClass();
            ((C16137F) c0095w0.f411o0).m17700u(String.valueOf(d10));
        }
        if (this.f35790f.f34879k) {
            return;
        }
        if (Double.isInfinite(d10) || Double.isNaN(d10)) {
            throw AbstractC11828r.m13095a(Double.valueOf(d10), ((C16137F) c0095w0.f411o0).toString());
        }
    }

    @Override // p283L5.AbstractC4941g, kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: h */
    public final void mo5574h(short s10) {
        if (this.f35791g) {
            mo5566G(String.valueOf((int) s10));
        } else {
            this.f35785a.mo386x(s10);
        }
    }

    @Override // p283L5.AbstractC4941g, kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: j */
    public final void mo5576j(byte b) {
        if (this.f35791g) {
            mo5566G(String.valueOf((int) b));
        } else {
            this.f35785a.mo379p(b);
        }
    }

    @Override // p283L5.AbstractC4941g, kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: k */
    public final void mo5577k(boolean z6) {
        if (this.f35791g) {
            mo5566G(String.valueOf(z6));
            return;
        }
        C0095w0 c0095w0 = this.f35785a;
        c0095w0.getClass();
        ((C16137F) c0095w0.f411o0).m17700u(String.valueOf(z6));
    }

    @Override // p283L5.AbstractC4941g, kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: n */
    public final void mo5580n(float f10) {
        boolean z6 = this.f35791g;
        C0095w0 c0095w0 = this.f35785a;
        if (z6) {
            mo5566G(String.valueOf(f10));
        } else {
            c0095w0.getClass();
            ((C16137F) c0095w0.f411o0).m17700u(String.valueOf(f10));
        }
        if (this.f35790f.f34879k) {
            return;
        }
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            throw AbstractC11828r.m13095a(Float.valueOf(f10), ((C16137F) c0095w0.f411o0).toString());
        }
    }

    @Override // p283L5.AbstractC4941g, kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: p */
    public final void mo5582p(char c9) {
        mo5566G(String.valueOf(c9));
    }

    @Override // p283L5.AbstractC4941g, p631Zn.InterfaceC10429b
    /* JADX INFO: renamed from: s */
    public final void mo5585s(SerialDescriptor descriptor, int i10, KSerializer serializer, Object obj) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(serializer, "serializer");
        if (obj != null || this.f35790f.f34874f) {
            super.mo5585s(descriptor, i10, serializer, obj);
        }
    }

    @Override // p283L5.AbstractC4941g, kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: v */
    public final void mo5588v(SerialDescriptor enumDescriptor, int i10) {
        AbstractC16544l.m18094g(enumDescriptor, "enumDescriptor");
        mo5566G(enumDescriptor.mo10683f(i10));
    }

    @Override // bo.InterfaceC11526n
    /* JADX INFO: renamed from: w */
    public final void mo12921w(AbstractC16643b element) {
        AbstractC16544l.m18094g(element, "element");
        if (this.f35792h == null || (element instanceof C16644c)) {
            mo5560A(C11524l.f34887a, element);
        } else {
            AbstractC11828r.m13118x(this.f35793i, element);
            throw null;
        }
    }

    @Override // p283L5.AbstractC4941g, kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: x */
    public final void mo5589x(int i10) {
        if (this.f35791g) {
            mo5566G(String.valueOf(i10));
        } else {
            this.f35785a.mo382s(i10);
        }
    }

    @Override // p283L5.AbstractC4941g, kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: y */
    public final Encoder mo5590y(SerialDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        boolean zM13070a = AbstractC11806G.m13070a(descriptor);
        EnumC11810K enumC11810K = this.f35787c;
        AbstractC11516d abstractC11516d = this.f35786b;
        C0095w0 c11819i = this.f35785a;
        if (zM13070a) {
            if (!(c11819i instanceof C11820j)) {
                c11819i = new C11820j((C16137F) c11819i.f411o0, this.f35791g);
            }
            return new C11805F(c11819i, abstractC11516d, enumC11810K, null);
        }
        if (descriptor.isInline() && descriptor.equals(AbstractC11523k.f34886a)) {
            if (!(c11819i instanceof C11819i)) {
                c11819i = new C11819i((C16137F) c11819i.f411o0, this.f35791g);
            }
            return new C11805F(c11819i, abstractC11516d, enumC11810K, null);
        }
        if (this.f35792h != null) {
            this.f35793i = descriptor.mo10679a();
        }
        return this;
    }
}
