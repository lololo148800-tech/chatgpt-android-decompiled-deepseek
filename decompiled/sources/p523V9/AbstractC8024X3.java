package p523V9;

import bo.AbstractC11516d;
import bo.C11519g;
import bo.C11521i;
import bo.C11527o;
import bo.C11531s;
import bo.EnumC11513a;
import io.sentry.config.AbstractC15340a;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p001A.C0042V0;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p077Cn.InterfaceC1730B;
import p1008s8.C19492u;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p225Im.InterfaceC3756d;
import p606Yn.AbstractC10103d;
import p606Yn.AbstractC10105f;
import p606Yn.C10108i;
import p606Yn.C10109j;
import p606Yn.C10110k;
import p733eo.AbstractC13453a;
import p733eo.AbstractC13455c;
import p733eo.AbstractC13456d;
import p733eo.C13454b;

/* JADX INFO: renamed from: V9.X3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8024X3 {
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public static final C11527o m8363a(AbstractC11516d from, InterfaceC1436k builderAction) {
        AbstractC16544l.m18094g(from, "from");
        AbstractC16544l.m18094g(builderAction, "builderAction");
        C11519g c11519g = new C11519g();
        C11521i c11521i = from.f34843a;
        c11519g.f34851a = c11521i.f34869a;
        c11519g.f34852b = c11521i.f34874f;
        c11519g.f34853c = c11521i.f34870b;
        c11519g.f34854d = c11521i.f34871c;
        c11519g.f34855e = c11521i.f34873e;
        String str = c11521i.f34875g;
        c11519g.f34856f = str;
        c11519g.f34857g = c11521i.f34876h;
        String str2 = c11521i.f34878j;
        c11519g.f34858h = str2;
        EnumC11513a enumC11513a = c11521i.f34885q;
        c11519g.f34859i = enumC11513a;
        c11519g.f34860j = c11521i.f34880l;
        c11519g.f34861k = c11521i.f34881m;
        c11519g.f34862l = c11521i.f34882n;
        c11519g.f34863m = c11521i.f34883o;
        c11519g.f34864n = c11521i.f34884p;
        c11519g.f34865o = c11521i.f34879k;
        c11519g.f34866p = c11521i.f34872d;
        boolean z6 = c11521i.f34877i;
        c11519g.f34867q = z6;
        c11519g.f34868r = from.f34844b;
        builderAction.invoke(c11519g);
        if (z6) {
            if (!AbstractC16544l.m18089b(str2, "type")) {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
            }
            if (enumC11513a != EnumC11513a.f34837Z) {
                throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
            }
        }
        if (c11519g.f34855e) {
            if (!AbstractC16544l.m18089b(str, "    ")) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        throw new IllegalArgumentException("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str).toString());
                    }
                }
            }
        } else if (!AbstractC16544l.m18089b(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        boolean z10 = c11519g.f34851a;
        boolean z11 = c11519g.f34853c;
        boolean z12 = c11519g.f34854d;
        boolean z13 = c11519g.f34866p;
        boolean z14 = c11519g.f34855e;
        boolean z15 = c11519g.f34852b;
        boolean z16 = c11519g.f34857g;
        C11531s c11531s = c11519g.f34861k;
        boolean z17 = c11519g.f34864n;
        EnumC11513a enumC11513a2 = c11519g.f34859i;
        String str3 = c11519g.f34856f;
        boolean z18 = c11519g.f34867q;
        String str4 = c11519g.f34858h;
        C11521i c11521i2 = new C11521i(z10, z11, z12, z13, z14, z15, str3, z16, z18, str4, c11519g.f34865o, c11519g.f34860j, c11531s, c11519g.f34862l, c11519g.f34863m, z17, enumC11513a2);
        C0042V0 module = c11519g.f34868r;
        AbstractC16544l.m18094g(module, "module");
        C11527o c11527o = new C11527o(c11521i2, module);
        if (!module.equals(AbstractC13456d.f42591a)) {
            for (Map.Entry entry : module.f205Z.entrySet()) {
                InterfaceC3756d kClass = (InterfaceC3756d) entry.getKey();
                AbstractC13455c abstractC13455c = (AbstractC13455c) entry.getValue();
                if (abstractC13455c instanceof AbstractC13453a) {
                    AbstractC16544l.m18092e(kClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    throw null;
                }
                if (!(abstractC13455c instanceof C13454b)) {
                    throw new C0644w();
                }
                InterfaceC1436k interfaceC1436k = ((C13454b) abstractC13455c).f42590a;
                AbstractC16544l.m18094g(kClass, "kClass");
            }
            for (Map.Entry entry2 : module.f206o0.entrySet()) {
                InterfaceC3756d interfaceC3756d = (InterfaceC3756d) entry2.getKey();
                for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                    InterfaceC3756d interfaceC3756d2 = (InterfaceC3756d) entry3.getKey();
                    KSerializer kSerializer = (KSerializer) entry3.getValue();
                    AbstractC16544l.m18092e(interfaceC3756d, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    AbstractC16544l.m18092e(interfaceC3756d2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    AbstractC16544l.m18092e(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                    SerialDescriptor descriptor = kSerializer.getDescriptor();
                    AbstractC15340a kind = descriptor.getKind();
                    if ((kind instanceof AbstractC10103d) || AbstractC16544l.m18089b(kind, C10108i.f29933b)) {
                        throw new IllegalArgumentException("Serializer for " + interfaceC3756d2.mo4448c() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
                    }
                    if (!z18 && (AbstractC16544l.m18089b(kind, C10110k.f29936c) || AbstractC16544l.m18089b(kind, C10110k.f29937d) || (kind instanceof AbstractC10105f) || (kind instanceof C10109j))) {
                        throw new IllegalArgumentException("Serializer for " + interfaceC3756d2.mo4448c() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
                    }
                    if (!z18) {
                        int iMo10682e = descriptor.mo10682e();
                        for (int i11 = 0; i11 < iMo10682e; i11++) {
                            String strMo10683f = descriptor.mo10683f(i11);
                            if (AbstractC16544l.m18089b(strMo10683f, str4)) {
                                throw new IllegalArgumentException("Polymorphic serializer for " + interfaceC3756d2 + " has property '" + strMo10683f + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                            }
                        }
                    }
                }
            }
            for (Map.Entry entry4 : module.f207p0.entrySet()) {
                InterfaceC3756d interfaceC3756d3 = (InterfaceC3756d) entry4.getKey();
                InterfaceC1436k interfaceC1436k2 = (InterfaceC1436k) entry4.getValue();
                AbstractC16544l.m18092e(interfaceC3756d3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                AbstractC16544l.m18092e(interfaceC1436k2, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
                AbstractC16529F.m18081e(1, interfaceC1436k2);
            }
            for (Map.Entry entry5 : module.f209r0.entrySet()) {
                InterfaceC3756d interfaceC3756d4 = (InterfaceC3756d) entry5.getKey();
                InterfaceC1436k interfaceC1436k3 = (InterfaceC1436k) entry5.getValue();
                AbstractC16544l.m18092e(interfaceC3756d4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                AbstractC16544l.m18092e(interfaceC1436k3, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
                AbstractC16529F.m18081e(1, interfaceC1436k3);
            }
        }
        return c11527o;
    }

    /* JADX INFO: renamed from: b */
    public static final void m8364b(InterfaceC1730B interfaceC1730B, Throwable th2) {
        CancellationException cancellationExceptionM1172a = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (cancellationExceptionM1172a == null) {
            cancellationExceptionM1172a = AbstractC0575H.m1172a("Channel was consumed, consumer had failed", th2);
        }
        interfaceC1730B.mo2516e(cancellationExceptionM1172a);
    }

    /* JADX INFO: renamed from: c */
    public static C19492u m8365c(C3676s c3676s) {
        try {
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("architecture");
            String strMo4384r = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("brand");
            String strMo4384r2 = abstractC3673pM4395w2 != null ? abstractC3673pM4395w2.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w("model");
            return new C19492u(strMo4384r, strMo4384r2, abstractC3673pM4395w3 != null ? abstractC3673pM4395w3.mo4384r() : null);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Device", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Device", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Device", e12);
        }
    }
}
