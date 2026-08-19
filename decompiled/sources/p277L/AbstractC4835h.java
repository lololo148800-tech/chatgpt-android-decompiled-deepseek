package p277L;

import android.content.Context;
import androidx.compose.p650ui.draw.AbstractC10861a;
import ao.C11159d0;
import ao.C11164g;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import p001A.AbstractC0010F;
import p025An.C0644w;
import p1071w0.AbstractC20740b0;
import p1139z0.C21578C0;
import p1139z0.C21582E0;
import p1139z0.C21595S;
import p204I1.C3581L;
import p349O0.C5944C;
import p349O0.C5960K;
import p349O0.C6002f0;
import p544W9.AbstractC8676n;
import p559Wn.C8976h;
import p571X9.AbstractC9113C4;
import p631Zn.InterfaceC10428a;
import p635a1.InterfaceC10459q;
import p968qi.C18718a;
import p968qi.C18726i;
import p968qi.C18739v;
import p968qi.EnumC18738u;

/* JADX INFO: renamed from: L.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4835h implements Decoder, InterfaceC10428a {

    /* JADX INFO: renamed from: a */
    public static volatile ScheduledExecutorServiceC4831d f15737a;

    /* JADX INFO: renamed from: G */
    public static final int m5455G(String str, int i10, boolean z6, C21582E0 c21582e0) {
        int i11;
        C21578C0 c21578c0;
        int iM21278s = z6 ? AbstractC20740b0.m21278s(i10, str) : AbstractC20740b0.m21281v(i10, str);
        if (iM21278s == -1) {
            return i10;
        }
        C5944C c5944c = c21582e0.f68339c;
        C5960K c5960k = (c5944c == null || (c21578c0 = (C21578C0) c5944c.getValue()) == null) ? null : c21578c0.f68332b;
        long jM6395a = c5960k != null ? c5960k.m6395a(iM21278s, false) : AbstractC8676n.m9365b(iM21278s, iM21278s);
        long jM21883e = c21582e0.m21883e(jM6395a);
        if (C3581L.m4267c(jM6395a) && C3581L.m4267c(jM21883e)) {
            i11 = 1;
        } else if (C3581L.m4267c(jM6395a) || C3581L.m4267c(jM21883e)) {
            i11 = (!C3581L.m4267c(jM6395a) || C3581L.m4267c(jM21883e)) ? 4 : 2;
        } else {
            i11 = 3;
        }
        int iM24h = AbstractC0010F.m24h(i11);
        if (iM24h != 0) {
            if (iM24h == 1) {
                C6002f0 c6002f0 = c21582e0.f68340d;
                if (z6) {
                    if (iM21278s == ((int) (jM21883e >> 32))) {
                        c6002f0.setValue(new C21595S(1));
                        return iM21278s;
                    }
                    c6002f0.setValue(new C21595S(2));
                    return i10;
                }
                if (iM21278s == ((int) (jM21883e & 4294967295L))) {
                    c6002f0.setValue(new C21595S(2));
                    return iM21278s;
                }
                c6002f0.setValue(new C21595S(1));
                return i10;
            }
            if (iM24h == 2) {
                return (int) (z6 ? jM21883e & 4294967295L : jM21883e >> 32);
            }
            if (iM24h != 3) {
                throw new C0644w();
            }
        }
        return iM21278s;
    }

    /* JADX INFO: renamed from: H */
    public static final boolean m5456H(C18739v c18739v, int i10, int i11) {
        Set set;
        if (m5462N(c18739v, i10 + 1, i11)) {
            return false;
        }
        if (m5461M(c18739v, i10, i11)) {
            return true;
        }
        if (c18739v == null || (set = c18739v.f59611c) == null) {
            return false;
        }
        return set.contains(Integer.valueOf(i10));
    }

    /* JADX INFO: renamed from: I */
    public static InterfaceC10459q m5457I(InterfaceC10459q interfaceC10459q, Context context, EnumC18738u palette, boolean z6, boolean z10, boolean z11, boolean z12) {
        AbstractC16544l.m18094g(interfaceC10459q, "<this>");
        AbstractC16544l.m18094g(context, "context");
        AbstractC16544l.m18094g(palette, "palette");
        return AbstractC10861a.m11297c(interfaceC10459q, new C18718a(palette, z6, context, z12, z10, z11, false, false, false, false));
    }

    /* JADX INFO: renamed from: J */
    public static final boolean m5458J(C18739v c18739v, int i10, int i11) {
        Set set;
        Set set2;
        if (((c18739v == null || (set2 = c18739v.f59611c) == null) ? false : set2.contains(Integer.valueOf(i10))) && i11 == 0) {
            return true;
        }
        if (m5462N(c18739v, i10, i11 - 1)) {
            return false;
        }
        if (m5461M(c18739v, i10, i11)) {
            return true;
        }
        if (c18739v == null || (set = c18739v.f59610b) == null) {
            return false;
        }
        return set.contains(Integer.valueOf(i11));
    }

    /* JADX INFO: renamed from: K */
    public static final boolean m5459K(C18739v c18739v, int i10, int i11) {
        Set set;
        if (m5462N(c18739v, i10, i11 + 1)) {
            return false;
        }
        if (m5461M(c18739v, i10, i11)) {
            return true;
        }
        if (c18739v == null || (set = c18739v.f59610b) == null) {
            return false;
        }
        return set.contains(Integer.valueOf(i11));
    }

    /* JADX INFO: renamed from: L */
    public static final boolean m5460L(C18739v c18739v, int i10, int i11) {
        Set set;
        Set set2;
        if (((c18739v == null || (set2 = c18739v.f59610b) == null) ? false : set2.contains(Integer.valueOf(i11))) && i10 == 0) {
            return true;
        }
        if (m5462N(c18739v, i10 - 1, i11)) {
            return false;
        }
        if (m5461M(c18739v, i10, i11)) {
            return true;
        }
        if (c18739v == null || (set = c18739v.f59611c) == null) {
            return false;
        }
        return set.contains(Integer.valueOf(i10));
    }

    /* JADX INFO: renamed from: M */
    public static final boolean m5461M(C18739v c18739v, int i10, int i11) {
        Set set;
        if (c18739v == null || (set = c18739v.f59612d) == null) {
            return false;
        }
        return set.contains(new C18726i(AbstractC9113C4.m9643a(i10, i11)));
    }

    /* JADX INFO: renamed from: N */
    public static final boolean m5462N(C18739v c18739v, int i10, int i11) {
        if (c18739v == null) {
            return false;
        }
        if (!c18739v.f59611c.contains(Integer.valueOf(i10))) {
            if (!c18739v.f59610b.contains(Integer.valueOf(i11))) {
                if (!c18739v.f59612d.contains(new C18726i(AbstractC9113C4.m9643a(i10, i11)))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: A */
    public abstract byte mo5463A();

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: B */
    public abstract short mo5464B();

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: C */
    public float mo5465C() {
        m5469O();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: D */
    public Object mo5466D() {
        C11164g c11164g = C11164g.f33804a;
        C11164g.f33805b.getClass();
        if (mo5484r()) {
            return mo5482p(c11164g);
        }
        return null;
    }

    @Override // p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: E */
    public float mo5467E(SerialDescriptor descriptor, int i10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return mo5465C();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: F */
    public double mo5468F() {
        m5469O();
        throw null;
    }

    /* JADX INFO: renamed from: O */
    public void m5469O() {
        throw new C8976h(AbstractC16526C.f51263a.mo5693b(getClass()) + " can't retrieve untyped values");
    }

    @Override // p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: b */
    public void mo5470b(SerialDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: c */
    public InterfaceC10428a mo5471c(SerialDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: e */
    public boolean mo5472e() {
        m5469O();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: f */
    public char mo5473f() {
        m5469O();
        throw null;
    }

    @Override // p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: g */
    public Decoder mo5474g(C11159d0 descriptor, int i10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return mo5487v(descriptor.mo10685h(i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: h */
    public int mo5475h(SerialDescriptor enumDescriptor) {
        AbstractC16544l.m18094g(enumDescriptor, "enumDescriptor");
        m5469O();
        throw null;
    }

    @Override // p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: i */
    public long mo5476i(SerialDescriptor descriptor, int i10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return mo5480n();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: k */
    public abstract int mo5477k();

    @Override // p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: l */
    public int mo5478l(SerialDescriptor descriptor, int i10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return mo5477k();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: m */
    public String mo5479m() {
        m5469O();
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: n */
    public abstract long mo5480n();

    @Override // p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: o */
    public boolean mo5481o(SerialDescriptor descriptor, int i10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return mo5472e();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: p */
    public Object mo5482p(KSerializer deserializer) {
        AbstractC16544l.m18094g(deserializer, "deserializer");
        return deserializer.deserialize(this);
    }

    @Override // p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: q */
    public String mo5483q(SerialDescriptor descriptor, int i10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return mo5479m();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: r */
    public boolean mo5484r() {
        return true;
    }

    @Override // p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: t */
    public char mo5485t(C11159d0 descriptor, int i10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return mo5473f();
    }

    @Override // p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: u */
    public Object mo5486u(SerialDescriptor descriptor, int i10, KSerializer deserializer, Object obj) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(deserializer, "deserializer");
        if (deserializer.getDescriptor().mo10680c() || mo5484r()) {
            return mo5482p(deserializer);
        }
        return null;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: v */
    public Decoder mo5487v(SerialDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return this;
    }

    @Override // p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: w */
    public short mo5488w(C11159d0 descriptor, int i10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return mo5464B();
    }

    @Override // p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: x */
    public double mo5489x(SerialDescriptor descriptor, int i10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return mo5468F();
    }

    @Override // p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: y */
    public Object mo5490y(SerialDescriptor descriptor, int i10, KSerializer deserializer, Object obj) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(deserializer, "deserializer");
        return mo5482p(deserializer);
    }

    @Override // p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: z */
    public byte mo5491z(C11159d0 descriptor, int i10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return mo5463A();
    }
}
