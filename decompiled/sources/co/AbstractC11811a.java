package co;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import ao.AbstractC11154b;
import ao.C11159d0;
import ao.C11164g;
import bo.AbstractC11516d;
import bo.AbstractC11523k;
import bo.C11521i;
import bo.C11528p;
import bo.InterfaceC11522j;
import io.sentry.config.AbstractC15340a;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.InlineClassDescriptor;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.AbstractC16645d;
import kotlinx.serialization.json.C16642a;
import kotlinx.serialization.json.C16644c;
import kotlinx.serialization.json.JsonNull;
import p001A.C0042V0;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p279L1.VOxZ.sVoFrD;
import p559Wn.C8976h;
import p582Xk.HXHG.bQBnquXS;
import p594Y9.AbstractC9810T3;
import p606Yn.AbstractC10103d;
import p606Yn.AbstractC10105f;
import p606Yn.C10109j;
import p606Yn.C10110k;
import p631Zn.InterfaceC10428a;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: co.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC11811a implements InterfaceC11522j, Decoder, InterfaceC10428a {

    /* JADX INFO: renamed from: a */
    public final ArrayList f35806a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public boolean f35807b;

    /* JADX INFO: renamed from: c */
    public final AbstractC11516d f35808c;

    /* JADX INFO: renamed from: d */
    public final String f35809d;

    /* JADX INFO: renamed from: e */
    public final C11521i f35810e;

    public AbstractC11811a(AbstractC11516d abstractC11516d, String str) {
        this.f35808c = abstractC11516d;
        this.f35809d = str;
        this.f35810e = abstractC11516d.f34843a;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: A */
    public final byte mo5463A() {
        return m13076J(m13088V());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: B */
    public final short mo5464B() {
        return m13083Q(m13088V());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: C */
    public final float mo5465C() {
        return m13079M(m13088V());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: D */
    public final Object mo5466D() {
        C11164g c11164g = C11164g.f33804a;
        C11164g.f33805b.getClass();
        if (mo5484r()) {
            return mo5482p(c11164g);
        }
        return null;
    }

    @Override // p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: E */
    public final float mo5467E(SerialDescriptor descriptor, int i10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return m13079M(m13086T(descriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: F */
    public final double mo5468F() {
        return m13078L(m13088V());
    }

    /* JADX INFO: renamed from: G */
    public abstract AbstractC16643b mo13073G(String str);

    /* JADX INFO: renamed from: H */
    public final AbstractC16643b m13074H() {
        AbstractC16643b abstractC16643bMo13073G;
        String str = (String) AbstractC17680n.m19353c0(this.f35806a);
        return (str == null || (abstractC16643bMo13073G = mo13073G(str)) == null) ? mo13087U() : abstractC16643bMo13073G;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m13075I(Object obj) {
        Boolean bool;
        String tag = (String) obj;
        AbstractC16544l.m18094g(tag, "tag");
        AbstractC16643b abstractC16643bMo13073G = mo13073G(tag);
        if (!(abstractC16643bMo13073G instanceof AbstractC16645d)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            C16527D c16527d = AbstractC16526C.f51263a;
            sb2.append(c16527d.mo5693b(AbstractC16645d.class).mo4448c());
            sb2.append(", but had ");
            sb2.append(c16527d.mo5693b(abstractC16643bMo13073G.getClass()).mo4448c());
            sb2.append(" as the serialized body of boolean at element: ");
            sb2.append(m13090X(tag));
            throw AbstractC11828r.m13097c(-1, abstractC16643bMo13073G.toString(), sb2.toString());
        }
        AbstractC16645d abstractC16645d = (AbstractC16645d) abstractC16643bMo13073G;
        try {
            InlineClassDescriptor inlineClassDescriptor = AbstractC11523k.f34886a;
            AbstractC16544l.m18094g(abstractC16645d, "<this>");
            String strMo12922f = abstractC16645d.mo12922f();
            String[] strArr = AbstractC11809J.f35796a;
            AbstractC16544l.m18094g(strMo12922f, "<this>");
            if (strMo12922f.equalsIgnoreCase("true")) {
                bool = Boolean.TRUE;
            } else {
                bool = strMo12922f.equalsIgnoreCase("false") ? Boolean.FALSE : null;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            m13091Y(abstractC16645d, "boolean", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            m13091Y(abstractC16645d, "boolean", tag);
            throw null;
        }
    }

    /* JADX INFO: renamed from: J */
    public final byte m13076J(Object obj) {
        String tag = (String) obj;
        AbstractC16544l.m18094g(tag, "tag");
        AbstractC16643b abstractC16643bMo13073G = mo13073G(tag);
        if (!(abstractC16643bMo13073G instanceof AbstractC16645d)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            C16527D c16527d = AbstractC16526C.f51263a;
            sb2.append(c16527d.mo5693b(AbstractC16645d.class).mo4448c());
            sb2.append(", but had ");
            sb2.append(c16527d.mo5693b(abstractC16643bMo13073G.getClass()).mo4448c());
            sb2.append(" as the serialized body of byte at element: ");
            sb2.append(m13090X(tag));
            throw AbstractC11828r.m13097c(-1, abstractC16643bMo13073G.toString(), sb2.toString());
        }
        AbstractC16645d abstractC16645d = (AbstractC16645d) abstractC16643bMo13073G;
        try {
            int iM12914g = AbstractC11523k.m12914g(abstractC16645d);
            Byte bValueOf = (-128 > iM12914g || iM12914g > 127) ? null : Byte.valueOf((byte) iM12914g);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            m13091Y(abstractC16645d, "byte", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            m13091Y(abstractC16645d, "byte", tag);
            throw null;
        }
    }

    /* JADX INFO: renamed from: K */
    public final char m13077K(Object obj) {
        String tag = (String) obj;
        AbstractC16544l.m18094g(tag, "tag");
        AbstractC16643b abstractC16643bMo13073G = mo13073G(tag);
        if (abstractC16643bMo13073G instanceof AbstractC16645d) {
            AbstractC16645d abstractC16645d = (AbstractC16645d) abstractC16643bMo13073G;
            try {
                return AbstractC21322p.m21694b0(abstractC16645d.mo12922f());
            } catch (IllegalArgumentException unused) {
                m13091Y(abstractC16645d, "char", tag);
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        C16527D c16527d = AbstractC16526C.f51263a;
        sb2.append(c16527d.mo5693b(AbstractC16645d.class).mo4448c());
        sb2.append(", but had ");
        sb2.append(c16527d.mo5693b(abstractC16643bMo13073G.getClass()).mo4448c());
        sb2.append(" as the serialized body of char at element: ");
        sb2.append(m13090X(tag));
        throw AbstractC11828r.m13097c(-1, abstractC16643bMo13073G.toString(), sb2.toString());
    }

    /* JADX INFO: renamed from: L */
    public final double m13078L(Object obj) {
        String tag = (String) obj;
        AbstractC16544l.m18094g(tag, "tag");
        AbstractC16643b abstractC16643bMo13073G = mo13073G(tag);
        if (!(abstractC16643bMo13073G instanceof AbstractC16645d)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            C16527D c16527d = AbstractC16526C.f51263a;
            sb2.append(c16527d.mo5693b(AbstractC16645d.class).mo4448c());
            sb2.append(", but had ");
            sb2.append(c16527d.mo5693b(abstractC16643bMo13073G.getClass()).mo4448c());
            sb2.append(" as the serialized body of double at element: ");
            sb2.append(m13090X(tag));
            throw AbstractC11828r.m13097c(-1, abstractC16643bMo13073G.toString(), sb2.toString());
        }
        AbstractC16645d abstractC16645d = (AbstractC16645d) abstractC16643bMo13073G;
        try {
            InlineClassDescriptor inlineClassDescriptor = AbstractC11523k.f34886a;
            AbstractC16544l.m18094g(abstractC16645d, "<this>");
            double d10 = Double.parseDouble(abstractC16645d.mo12922f());
            if (this.f35808c.f34843a.f34879k || !(Double.isInfinite(d10) || Double.isNaN(d10))) {
                return d10;
            }
            Double dValueOf = Double.valueOf(d10);
            String output = m13074H().toString();
            AbstractC16544l.m18094g(output, "output");
            throw AbstractC11828r.m13098d(-1, AbstractC11828r.m13120z(dValueOf, tag, output));
        } catch (IllegalArgumentException unused) {
            m13091Y(abstractC16645d, "double", tag);
            throw null;
        }
    }

    /* JADX INFO: renamed from: O */
    public final int m13081O(Object obj) {
        String tag = (String) obj;
        AbstractC16544l.m18094g(tag, "tag");
        AbstractC16643b abstractC16643bMo13073G = mo13073G(tag);
        if (abstractC16643bMo13073G instanceof AbstractC16645d) {
            AbstractC16645d abstractC16645d = (AbstractC16645d) abstractC16643bMo13073G;
            try {
                return AbstractC11523k.m12914g(abstractC16645d);
            } catch (IllegalArgumentException unused) {
                m13091Y(abstractC16645d, "int", tag);
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        C16527D c16527d = AbstractC16526C.f51263a;
        sb2.append(c16527d.mo5693b(AbstractC16645d.class).mo4448c());
        sb2.append(", but had ");
        sb2.append(c16527d.mo5693b(abstractC16643bMo13073G.getClass()).mo4448c());
        sb2.append(" as the serialized body of int at element: ");
        sb2.append(m13090X(tag));
        throw AbstractC11828r.m13097c(-1, abstractC16643bMo13073G.toString(), sb2.toString());
    }

    /* JADX INFO: renamed from: P */
    public final long m13082P(Object obj) {
        String tag = (String) obj;
        AbstractC16544l.m18094g(tag, "tag");
        AbstractC16643b abstractC16643bMo13073G = mo13073G(tag);
        if (abstractC16643bMo13073G instanceof AbstractC16645d) {
            AbstractC16645d abstractC16645d = (AbstractC16645d) abstractC16643bMo13073G;
            try {
                InlineClassDescriptor inlineClassDescriptor = AbstractC11523k.f34886a;
                AbstractC16544l.m18094g(abstractC16645d, "<this>");
                try {
                    return new C11807H(abstractC16645d.mo12922f()).m6925i();
                } catch (C11823m e10) {
                    throw new NumberFormatException(e10.getMessage());
                }
            } catch (IllegalArgumentException unused) {
                m13091Y(abstractC16645d, "long", tag);
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        C16527D c16527d = AbstractC16526C.f51263a;
        sb2.append(c16527d.mo5693b(AbstractC16645d.class).mo4448c());
        sb2.append(", but had ");
        sb2.append(c16527d.mo5693b(abstractC16643bMo13073G.getClass()).mo4448c());
        sb2.append(" as the serialized body of long at element: ");
        sb2.append(m13090X(tag));
        throw AbstractC11828r.m13097c(-1, abstractC16643bMo13073G.toString(), sb2.toString());
    }

    /* JADX INFO: renamed from: Q */
    public final short m13083Q(Object obj) {
        String tag = (String) obj;
        AbstractC16544l.m18094g(tag, "tag");
        AbstractC16643b abstractC16643bMo13073G = mo13073G(tag);
        if (!(abstractC16643bMo13073G instanceof AbstractC16645d)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            C16527D c16527d = AbstractC16526C.f51263a;
            sb2.append(c16527d.mo5693b(AbstractC16645d.class).mo4448c());
            sb2.append(", but had ");
            sb2.append(c16527d.mo5693b(abstractC16643bMo13073G.getClass()).mo4448c());
            sb2.append(" as the serialized body of short at element: ");
            sb2.append(m13090X(tag));
            throw AbstractC11828r.m13097c(-1, abstractC16643bMo13073G.toString(), sb2.toString());
        }
        AbstractC16645d abstractC16645d = (AbstractC16645d) abstractC16643bMo13073G;
        try {
            int iM12914g = AbstractC11523k.m12914g(abstractC16645d);
            Short shValueOf = (-32768 > iM12914g || iM12914g > 32767) ? null : Short.valueOf((short) iM12914g);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            m13091Y(abstractC16645d, "short", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            m13091Y(abstractC16645d, "short", tag);
            throw null;
        }
    }

    /* JADX INFO: renamed from: R */
    public final String m13084R(Object obj) {
        String tag = (String) obj;
        AbstractC16544l.m18094g(tag, "tag");
        AbstractC16643b abstractC16643bMo13073G = mo13073G(tag);
        if (!(abstractC16643bMo13073G instanceof AbstractC16645d)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            C16527D c16527d = AbstractC16526C.f51263a;
            sb2.append(c16527d.mo5693b(AbstractC16645d.class).mo4448c());
            sb2.append(", but had ");
            sb2.append(c16527d.mo5693b(abstractC16643bMo13073G.getClass()).mo4448c());
            sb2.append(" as the serialized body of string at element: ");
            sb2.append(m13090X(tag));
            throw AbstractC11828r.m13097c(-1, abstractC16643bMo13073G.toString(), sb2.toString());
        }
        AbstractC16645d abstractC16645d = (AbstractC16645d) abstractC16643bMo13073G;
        if (!(abstractC16645d instanceof C11528p)) {
            StringBuilder sbM11058p = AbstractC10763a.m11058p("Expected string value for a non-null key '", tag, "', got null literal instead at element: ");
            sbM11058p.append(m13090X(tag));
            throw AbstractC11828r.m13097c(-1, m13074H().toString(), sbM11058p.toString());
        }
        C11528p c11528p = (C11528p) abstractC16645d;
        if (c11528p.f34890Y || this.f35808c.f34843a.f34871c) {
            return c11528p.f34892o0;
        }
        StringBuilder sbM11058p2 = AbstractC10763a.m11058p("String literal for key '", tag, "' should be quoted at element: ");
        sbM11058p2.append(m13090X(tag));
        sbM11058p2.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
        throw AbstractC11828r.m13097c(-1, m13074H().toString(), sbM11058p2.toString());
    }

    /* JADX INFO: renamed from: S */
    public String mo13085S(SerialDescriptor descriptor, int i10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return descriptor.mo10683f(i10);
    }

    /* JADX INFO: renamed from: T */
    public final String m13086T(SerialDescriptor serialDescriptor, int i10) {
        AbstractC16544l.m18094g(serialDescriptor, "<this>");
        String nestedName = mo13085S(serialDescriptor, i10);
        AbstractC16544l.m18094g(nestedName, "nestedName");
        return nestedName;
    }

    /* JADX INFO: renamed from: U */
    public abstract AbstractC16643b mo13087U();

    /* JADX INFO: renamed from: V */
    public final Object m13088V() {
        ArrayList arrayList = this.f35806a;
        Object objRemove = arrayList.remove(AbstractC17681o.m19381j(arrayList));
        this.f35807b = true;
        return objRemove;
    }

    /* JADX INFO: renamed from: W */
    public final String m13089W() {
        ArrayList arrayList = this.f35806a;
        return arrayList.isEmpty() ? "$" : AbstractC17680n.m19349Y(arrayList, Separators.DOT, "$.", null, 0, null, null, 60);
    }

    /* JADX INFO: renamed from: X */
    public final String m13090X(String currentTag) {
        AbstractC16544l.m18094g(currentTag, "currentTag");
        return m13089W() + '.' + currentTag;
    }

    /* JADX INFO: renamed from: Y */
    public final void m13091Y(AbstractC16645d abstractC16645d, String str, String str2) {
        throw AbstractC11828r.m13097c(-1, m13074H().toString(), "Failed to parse literal '" + abstractC16645d + "' as " + (AbstractC21329w.m21734u(str, "i", false) ? "an " : "a ").concat(str) + " value at element: " + m13090X(str2));
    }

    @Override // kotlinx.serialization.encoding.Decoder, p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: a */
    public final C0042V0 mo10913a() {
        return this.f35808c.f34844b;
    }

    @Override // p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: b */
    public void mo5470b(SerialDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: c */
    public InterfaceC10428a mo5471c(SerialDescriptor descriptor) {
        InterfaceC10428a c11833w;
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16643b abstractC16643bM13074H = m13074H();
        AbstractC15340a kind = descriptor.getKind();
        boolean zM18089b = AbstractC16544l.m18089b(kind, C10110k.f29936c);
        AbstractC11516d abstractC11516d = this.f35808c;
        if (zM18089b || (kind instanceof AbstractC10103d)) {
            String strMo10679a = descriptor.mo10679a();
            if (!(abstractC16643bM13074H instanceof C16642a)) {
                StringBuilder sb2 = new StringBuilder("Expected ");
                C16527D c16527d = AbstractC16526C.f51263a;
                sb2.append(c16527d.mo5693b(C16642a.class).mo4448c());
                sb2.append(", but had ");
                sb2.append(c16527d.mo5693b(abstractC16643bM13074H.getClass()).mo4448c());
                sb2.append(" as the serialized body of ");
                sb2.append(strMo10679a);
                sb2.append(" at element: ");
                sb2.append(m13089W());
                throw AbstractC11828r.m13097c(-1, abstractC16643bM13074H.toString(), sb2.toString());
            }
            c11833w = new C11833w(abstractC11516d, (C16642a) abstractC16643bM13074H);
        } else if (AbstractC16544l.m18089b(kind, C10110k.f29937d)) {
            SerialDescriptor serialDescriptorM13102h = AbstractC11828r.m13102h(descriptor.mo10685h(0), abstractC11516d.f34844b);
            AbstractC15340a kind2 = serialDescriptorM13102h.getKind();
            if ((kind2 instanceof AbstractC10105f) || AbstractC16544l.m18089b(kind2, C10109j.f29934b)) {
                String strMo10679a2 = descriptor.mo10679a();
                if (!(abstractC16643bM13074H instanceof C16644c)) {
                    StringBuilder sb3 = new StringBuilder("Expected ");
                    C16527D c16527d2 = AbstractC16526C.f51263a;
                    sb3.append(c16527d2.mo5693b(C16644c.class).mo4448c());
                    sb3.append(", but had ");
                    sb3.append(c16527d2.mo5693b(abstractC16643bM13074H.getClass()).mo4448c());
                    sb3.append(" as the serialized body of ");
                    sb3.append(strMo10679a2);
                    sb3.append(" at element: ");
                    sb3.append(m13089W());
                    throw AbstractC11828r.m13097c(-1, abstractC16643bM13074H.toString(), sb3.toString());
                }
                c11833w = new C11834x(abstractC11516d, (C16644c) abstractC16643bM13074H);
            } else {
                if (!abstractC11516d.f34843a.f34872d) {
                    throw AbstractC11828r.m13096b(serialDescriptorM13102h);
                }
                String strMo10679a3 = descriptor.mo10679a();
                if (!(abstractC16643bM13074H instanceof C16642a)) {
                    StringBuilder sb4 = new StringBuilder("Expected ");
                    C16527D c16527d3 = AbstractC16526C.f51263a;
                    sb4.append(c16527d3.mo5693b(C16642a.class).mo4448c());
                    sb4.append(", but had ");
                    sb4.append(c16527d3.mo5693b(abstractC16643bM13074H.getClass()).mo4448c());
                    sb4.append(" as the serialized body of ");
                    sb4.append(strMo10679a3);
                    sb4.append(" at element: ");
                    sb4.append(m13089W());
                    throw AbstractC11828r.m13097c(-1, abstractC16643bM13074H.toString(), sb4.toString());
                }
                c11833w = new C11833w(abstractC11516d, (C16642a) abstractC16643bM13074H);
            }
        } else {
            String strMo10679a4 = descriptor.mo10679a();
            if (!(abstractC16643bM13074H instanceof C16644c)) {
                StringBuilder sb5 = new StringBuilder("Expected ");
                C16527D c16527d4 = AbstractC16526C.f51263a;
                sb5.append(c16527d4.mo5693b(C16644c.class).mo4448c());
                sb5.append(", but had ");
                sb5.append(c16527d4.mo5693b(abstractC16643bM13074H.getClass()).mo4448c());
                sb5.append(" as the serialized body of ");
                sb5.append(strMo10679a4);
                sb5.append(" at element: ");
                sb5.append(m13089W());
                throw AbstractC11828r.m13097c(-1, abstractC16643bM13074H.toString(), sb5.toString());
            }
            c11833w = new C11832v(abstractC11516d, (C16644c) abstractC16643bM13074H, this.f35809d, 8);
        }
        return c11833w;
    }

    @Override // bo.InterfaceC11522j
    /* JADX INFO: renamed from: d */
    public final AbstractC11516d mo12906d() {
        return this.f35808c;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: e */
    public final boolean mo5472e() {
        return m13075I(m13088V());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: f */
    public final char mo5473f() {
        return m13077K(m13088V());
    }

    @Override // p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: g */
    public final Decoder mo5474g(C11159d0 descriptor, int i10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return m13080N(m13086T(descriptor, i10), descriptor.mo10685h(i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: h */
    public final int mo5475h(SerialDescriptor enumDescriptor) {
        AbstractC16544l.m18094g(enumDescriptor, "enumDescriptor");
        String tag = (String) m13088V();
        AbstractC16544l.m18094g(tag, "tag");
        AbstractC16643b abstractC16643bMo13073G = mo13073G(tag);
        String strMo10679a = enumDescriptor.mo10679a();
        if (abstractC16643bMo13073G instanceof AbstractC16645d) {
            return AbstractC11828r.m13110p(enumDescriptor, this.f35808c, ((AbstractC16645d) abstractC16643bMo13073G).mo12922f(), "");
        }
        StringBuilder sb2 = new StringBuilder("Expected ");
        C16527D c16527d = AbstractC16526C.f51263a;
        sb2.append(c16527d.mo5693b(AbstractC16645d.class).mo4448c());
        sb2.append(", but had ");
        sb2.append(c16527d.mo5693b(abstractC16643bMo13073G.getClass()).mo4448c());
        sb2.append(" as the serialized body of ");
        sb2.append(strMo10679a);
        sb2.append(" at element: ");
        sb2.append(m13090X(tag));
        throw AbstractC11828r.m13097c(-1, abstractC16643bMo13073G.toString(), sb2.toString());
    }

    @Override // p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: i */
    public final long mo5476i(SerialDescriptor descriptor, int i10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return m13082P(m13086T(descriptor, i10));
    }

    @Override // bo.InterfaceC11522j
    /* JADX INFO: renamed from: j */
    public final AbstractC16643b mo12907j() {
        return m13074H();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: k */
    public final int mo5477k() {
        return m13081O(m13088V());
    }

    @Override // p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: l */
    public final int mo5478l(SerialDescriptor descriptor, int i10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return m13081O(m13086T(descriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: m */
    public final String mo5479m() {
        return m13084R(m13088V());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: n */
    public final long mo5480n() {
        return m13082P(m13088V());
    }

    @Override // p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: o */
    public final boolean mo5481o(SerialDescriptor descriptor, int i10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return m13075I(m13086T(descriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: p */
    public final Object mo5482p(KSerializer deserializer) {
        AbstractC16544l.m18094g(deserializer, "deserializer");
        if (deserializer instanceof AbstractC11154b) {
            AbstractC11516d abstractC11516d = this.f35808c;
            if (!abstractC11516d.f34843a.f34877i) {
                AbstractC11154b abstractC11154b = (AbstractC11154b) deserializer;
                String strM13105k = AbstractC11828r.m13105k(abstractC11516d, abstractC11154b.getDescriptor());
                AbstractC16643b abstractC16643bM13074H = m13074H();
                String strMo10679a = abstractC11154b.getDescriptor().mo10679a();
                if (abstractC16643bM13074H instanceof C16644c) {
                    C16644c c16644c = (C16644c) abstractC16643bM13074H;
                    AbstractC16643b abstractC16643b = (AbstractC16643b) c16644c.get(strM13105k);
                    try {
                        return AbstractC11828r.m13115u(abstractC11516d, strM13105k, c16644c, AbstractC9810T3.m10437a((AbstractC11154b) deserializer, this, abstractC16643b != null ? AbstractC11523k.m12913f(AbstractC11523k.m12918k(abstractC16643b)) : null));
                    } catch (C8976h e10) {
                        String message = e10.getMessage();
                        AbstractC16544l.m18091d(message);
                        throw AbstractC11828r.m13097c(-1, c16644c.toString(), message);
                    }
                }
                StringBuilder sb2 = new StringBuilder("Expected ");
                C16527D c16527d = AbstractC16526C.f51263a;
                sb2.append(c16527d.mo5693b(C16644c.class).mo4448c());
                sb2.append(", but had ");
                sb2.append(c16527d.mo5693b(abstractC16643bM13074H.getClass()).mo4448c());
                sb2.append(" as the serialized body of ");
                sb2.append(strMo10679a);
                sb2.append(" at element: ");
                sb2.append(m13089W());
                throw AbstractC11828r.m13097c(-1, abstractC16643bM13074H.toString(), sb2.toString());
            }
        }
        return deserializer.deserialize(this);
    }

    @Override // p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: q */
    public final String mo5483q(SerialDescriptor descriptor, int i10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return m13084R(m13086T(descriptor, i10));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: r */
    public boolean mo5484r() {
        return !(m13074H() instanceof JsonNull);
    }

    @Override // p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: t */
    public final char mo5485t(C11159d0 descriptor, int i10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return m13077K(m13086T(descriptor, i10));
    }

    @Override // p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: u */
    public final Object mo5486u(SerialDescriptor descriptor, int i10, KSerializer deserializer, Object obj) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(deserializer, "deserializer");
        this.f35806a.add(m13086T(descriptor, i10));
        Object objMo5482p = (deserializer.getDescriptor().mo10680c() || mo5484r()) ? mo5482p(deserializer) : null;
        if (!this.f35807b) {
            m13088V();
        }
        this.f35807b = false;
        return objMo5482p;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: v */
    public final Decoder mo5487v(SerialDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        if (AbstractC17680n.m19353c0(this.f35806a) != null) {
            return m13080N(m13088V(), descriptor);
        }
        return new C11830t(this.f35808c, mo13087U(), this.f35809d).mo5487v(descriptor);
    }

    @Override // p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: w */
    public final short mo5488w(C11159d0 descriptor, int i10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return m13083Q(m13086T(descriptor, i10));
    }

    @Override // p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: x */
    public final double mo5489x(SerialDescriptor descriptor, int i10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return m13078L(m13086T(descriptor, i10));
    }

    @Override // p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: y */
    public final Object mo5490y(SerialDescriptor descriptor, int i10, KSerializer deserializer, Object obj) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(deserializer, "deserializer");
        this.f35806a.add(m13086T(descriptor, i10));
        AbstractC16544l.m18094g(deserializer, "deserializer");
        Object objMo5482p = mo5482p(deserializer);
        if (!this.f35807b) {
            m13088V();
        }
        this.f35807b = false;
        return objMo5482p;
    }

    @Override // p631Zn.InterfaceC10428a
    /* JADX INFO: renamed from: z */
    public final byte mo5491z(C11159d0 descriptor, int i10) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        return m13076J(m13086T(descriptor, i10));
    }

    /* JADX INFO: renamed from: M */
    public final float m13079M(Object obj) {
        String tag = (String) obj;
        AbstractC16544l.m18094g(tag, "tag");
        AbstractC16643b abstractC16643bMo13073G = mo13073G(tag);
        if (!(abstractC16643bMo13073G instanceof AbstractC16645d)) {
            StringBuilder sb2 = new StringBuilder("Expected ");
            C16527D c16527d = AbstractC16526C.f51263a;
            sb2.append(c16527d.mo5693b(AbstractC16645d.class).mo4448c());
            sb2.append(sVoFrD.yAaWXkx);
            sb2.append(c16527d.mo5693b(abstractC16643bMo13073G.getClass()).mo4448c());
            sb2.append(" as the serialized body of float at element: ");
            sb2.append(m13090X(tag));
            throw AbstractC11828r.m13097c(-1, abstractC16643bMo13073G.toString(), sb2.toString());
        }
        AbstractC16645d abstractC16645d = (AbstractC16645d) abstractC16643bMo13073G;
        try {
            InlineClassDescriptor inlineClassDescriptor = AbstractC11523k.f34886a;
            AbstractC16544l.m18094g(abstractC16645d, "<this>");
            float f10 = Float.parseFloat(abstractC16645d.mo12922f());
            if (this.f35808c.f34843a.f34879k || !(Float.isInfinite(f10) || Float.isNaN(f10))) {
                return f10;
            }
            Float fValueOf = Float.valueOf(f10);
            String output = m13074H().toString();
            AbstractC16544l.m18094g(output, "output");
            throw AbstractC11828r.m13098d(-1, AbstractC11828r.m13120z(fValueOf, tag, output));
        } catch (IllegalArgumentException unused) {
            m13091Y(abstractC16645d, "float", tag);
            throw null;
        }
    }

    /* JADX INFO: renamed from: N */
    public final Decoder m13080N(Object obj, SerialDescriptor inlineDescriptor) {
        String tag = (String) obj;
        AbstractC16544l.m18094g(tag, "tag");
        AbstractC16544l.m18094g(inlineDescriptor, "inlineDescriptor");
        if (!AbstractC11806G.m13070a(inlineDescriptor)) {
            this.f35806a.add(tag);
            return this;
        }
        AbstractC16643b abstractC16643bMo13073G = mo13073G(tag);
        String strMo10679a = inlineDescriptor.mo10679a();
        if (abstractC16643bMo13073G instanceof AbstractC16645d) {
            String strMo12922f = ((AbstractC16645d) abstractC16643bMo13073G).mo12922f();
            AbstractC11516d abstractC11516d = this.f35808c;
            return new C11822l(AbstractC11828r.m13099e(abstractC11516d, strMo12922f), abstractC11516d);
        }
        StringBuilder sb2 = new StringBuilder(bQBnquXS.rbJx);
        C16527D c16527d = AbstractC16526C.f51263a;
        sb2.append(c16527d.mo5693b(AbstractC16645d.class).mo4448c());
        sb2.append(", but had ");
        sb2.append(c16527d.mo5693b(abstractC16643bMo13073G.getClass()).mo4448c());
        sb2.append(" as the serialized body of ");
        sb2.append(strMo10679a);
        sb2.append(" at element: ");
        sb2.append(m13090X(tag));
        throw AbstractC11828r.m13097c(-1, abstractC16643bMo13073G.toString(), sb2.toString());
    }
}
