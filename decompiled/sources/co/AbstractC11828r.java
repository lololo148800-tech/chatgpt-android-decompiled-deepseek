package co;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import ao.AbstractC11153a0;
import bo.AbstractC11516d;
import bo.C11521i;
import bo.C11531s;
import bo.InterfaceC11520h;
import bo.InterfaceC11526n;
import io.sentry.config.AbstractC15340a;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.C16644c;
import p001A.C0042V0;
import p001A.C0095w0;
import p033B5.C0821e;
import p1155zi.C22019j0;
import p138F8.vJO.vRJidSveZHcTw;
import p174Gk.uSfJ.HpucjswO;
import p225Im.InterfaceC3756d;
import p279L1.VOxZ.sVoFrD;
import p372P3.AbstractC6327i;
import p559Wn.C8974f;
import p559Wn.C8976h;
import p559Wn.C8981m;
import p571X9.AbstractC9306j0;
import p606Yn.AbstractC10103d;
import p606Yn.AbstractC10105f;
import p606Yn.C10108i;
import p606Yn.C10109j;
import p606Yn.C10110k;
import p658b5.AbstractC11235f;
import p806ia.nJAW.FpwNpGDhomXHZ;
import p817j$.util.concurrent.ConcurrentHashMap;
import p826j6.C16137F;
import p909nm.AbstractC17659D;
import p909nm.C17689w;
import p960q9.C18655i;

/* JADX INFO: renamed from: co.r */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC11828r {

    /* JADX INFO: renamed from: a */
    public static final C11829s f35843a = new C11829s();

    /* JADX INFO: renamed from: b */
    public static final C11829s f35844b = new C11829s();

    /* JADX INFO: renamed from: a */
    public static final C11825o m13095a(Number number, String str) {
        return new C11825o("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m13113s(-1, str)));
    }

    /* JADX INFO: renamed from: b */
    public static final C11825o m13096b(SerialDescriptor keyDescriptor) {
        AbstractC16544l.m18094g(keyDescriptor, "keyDescriptor");
        return new C11825o("Value of type '" + keyDescriptor.mo10679a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    /* JADX INFO: renamed from: c */
    public static final C11823m m13097c(int i10, CharSequence input, String message) {
        AbstractC16544l.m18094g(message, "message");
        AbstractC16544l.m18094g(input, "input");
        return m13098d(i10, message + "\nJSON input: " + ((Object) m13113s(i10, input)));
    }

    /* JADX INFO: renamed from: d */
    public static final C11823m m13098d(int i10, String message) {
        AbstractC16544l.m18094g(message, "message");
        if (i10 >= 0) {
            message = "Unexpected JSON token at offset " + i10 + ": " + message;
        }
        AbstractC16544l.m18094g(message, "message");
        return new C11823m(message);
    }

    /* JADX INFO: renamed from: e */
    public static final C11807H m13099e(AbstractC11516d json, String source) {
        AbstractC16544l.m18094g(json, "json");
        AbstractC16544l.m18094g(source, "source");
        return !json.f34843a.f34884p ? new C11807H(source) : new C11808I(source);
    }

    /* JADX INFO: renamed from: f */
    public static final void m13100f(KSerializer kSerializer, KSerializer kSerializer2, String str) {
        if (kSerializer instanceof C8974f) {
            SerialDescriptor descriptor = kSerializer2.getDescriptor();
            AbstractC16544l.m18094g(descriptor, "<this>");
            if (AbstractC11153a0.m12379b(descriptor).contains(str)) {
                StringBuilder sbM9896o = AbstractC9306j0.m9896o("Sealed class '", kSerializer2.getDescriptor().mo10679a(), "' cannot be serialized as base class '", ((C8974f) kSerializer).getDescriptor().mo10679a(), "' because it has property name that conflicts with JSON class discriminator '");
                sbM9896o.append(str);
                sbM9896o.append("'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                throw new IllegalStateException(sbM9896o.toString().toString());
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m13101g(LinkedHashMap linkedHashMap, SerialDescriptor serialDescriptor, String str, int i10) {
        String str2 = AbstractC16544l.m18089b(serialDescriptor.getKind(), C10109j.f29934b) ? "enum value" : "property";
        if (!linkedHashMap.containsKey(str)) {
            linkedHashMap.put(str, Integer.valueOf(i10));
            return;
        }
        String message = "The suggested name '" + str + "' for " + str2 + ' ' + serialDescriptor.mo10683f(i10) + " is already one of the names for " + str2 + ' ' + serialDescriptor.mo10683f(((Number) AbstractC17659D.m19243e(linkedHashMap, str)).intValue()) + " in " + serialDescriptor;
        AbstractC16544l.m18094g(message, "message");
        throw new C8981m(message);
    }

    /* JADX INFO: renamed from: i */
    public static final byte m13103i(char c9) {
        if (c9 < '~') {
            return C11817g.f35821b[c9];
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: j */
    public static final void m13104j(AbstractC15340a kind) {
        AbstractC16544l.m18094g(kind, "kind");
        if (kind instanceof C10109j) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof AbstractC10105f) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof AbstractC10103d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    /* JADX INFO: renamed from: k */
    public static final String m13105k(AbstractC11516d json, SerialDescriptor serialDescriptor) {
        AbstractC16544l.m18094g(serialDescriptor, "<this>");
        AbstractC16544l.m18094g(json, "json");
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof InterfaceC11520h) {
                ((C22019j0) ((InterfaceC11520h) annotation)).getClass();
                return "kind";
            }
        }
        return json.f34843a.f34878j;
    }

    /* JADX INFO: renamed from: l */
    public static final Map m13106l(AbstractC11516d abstractC11516d, SerialDescriptor descriptor) {
        AbstractC16544l.m18094g(abstractC11516d, "<this>");
        AbstractC16544l.m18094g(descriptor, "descriptor");
        C11829s c11829s = f35843a;
        C0821e c0821e = new C0821e(descriptor, 5, abstractC11516d);
        C18655i c18655i = abstractC11516d.f34845c;
        c18655i.getClass();
        AbstractC16544l.m18094g(descriptor, "descriptor");
        Object value = c18655i.m20030m(descriptor, c11829s);
        if (value == null) {
            value = c0821e.invoke();
            AbstractC16544l.m18094g(value, "value");
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c18655i.f59414Z;
            Object concurrentHashMap2 = concurrentHashMap.get(descriptor);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(descriptor, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(c11829s, value);
        }
        return (Map) value;
    }

    /* JADX INFO: renamed from: m */
    public static final void m13107m(AbstractC11516d json, C16137F c16137f, KSerializer serializer, Object obj) {
        AbstractC16544l.m18094g(json, "json");
        AbstractC16544l.m18094g(serializer, "serializer");
        new C11805F(json.f34843a.f34873e ? new C11821k(c16137f, json) : new C0095w0(c16137f), json, EnumC11810K.OBJ, new InterfaceC11526n[EnumC11810K.f35803t0.mo1316f()]).mo5560A(serializer, obj);
    }

    /* JADX INFO: renamed from: n */
    public static final String m13108n(SerialDescriptor serialDescriptor, AbstractC11516d json, int i10) {
        AbstractC16544l.m18094g(serialDescriptor, "<this>");
        AbstractC16544l.m18094g(json, "json");
        C11531s c11531sM13114t = m13114t(json, serialDescriptor);
        if (c11531sM13114t == null) {
            return serialDescriptor.mo10683f(i10);
        }
        C11829s c11829s = f35844b;
        C18655i c18655i = json.f34845c;
        c18655i.getClass();
        Object objM20030m = c18655i.m20030m(serialDescriptor, c11829s);
        if (objM20030m == null) {
            int iMo10682e = serialDescriptor.mo10682e();
            String[] strArr = new String[iMo10682e];
            for (int i11 = 0; i11 < iMo10682e; i11++) {
                strArr[i11] = c11531sM13114t.m12924a(serialDescriptor, serialDescriptor.mo10683f(i11));
            }
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c18655i.f59414Z;
            Object concurrentHashMap2 = concurrentHashMap.get(serialDescriptor);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(serialDescriptor, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(c11829s, strArr);
            objM20030m = strArr;
        }
        return ((String[]) objM20030m)[i10];
    }

    /* JADX INFO: renamed from: o */
    public static final int m13109o(SerialDescriptor serialDescriptor, AbstractC11516d json, String name) {
        AbstractC16544l.m18094g(serialDescriptor, "<this>");
        AbstractC16544l.m18094g(json, "json");
        AbstractC16544l.m18094g(name, "name");
        C11521i c11521i = json.f34843a;
        if (c11521i.f34882n && AbstractC16544l.m18089b(serialDescriptor.getKind(), C10109j.f29934b)) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            AbstractC16544l.m18093f(lowerCase, "toLowerCase(...)");
            return m13111q(serialDescriptor, json, lowerCase);
        }
        if (m13114t(json, serialDescriptor) != null) {
            return m13111q(serialDescriptor, json, name);
        }
        int iMo10681d = serialDescriptor.mo10681d(name);
        return (iMo10681d == -3 && c11521i.f34880l) ? m13111q(serialDescriptor, json, name) : iMo10681d;
    }

    /* JADX INFO: renamed from: q */
    public static final int m13111q(SerialDescriptor serialDescriptor, AbstractC11516d abstractC11516d, String str) {
        Integer num = (Integer) m13106l(abstractC11516d, serialDescriptor).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    /* JADX INFO: renamed from: r */
    public static final void m13112r(AbstractC6327i abstractC6327i, String entity) {
        AbstractC16544l.m18094g(entity, "entity");
        abstractC6327i.m6933q(abstractC6327i.f20528b - 1, "Trailing comma before the end of JSON ".concat(entity), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    /* JADX INFO: renamed from: s */
    public static final CharSequence m13113s(int i10, CharSequence charSequence) {
        AbstractC16544l.m18094g(charSequence, "<this>");
        if (charSequence.length() < 200) {
            return charSequence;
        }
        if (i10 == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i11 = i10 - 30;
        int i12 = i10 + 30;
        String str = i11 <= 0 ? "" : ".....";
        String str2 = i12 >= charSequence.length() ? "" : ".....";
        StringBuilder sbM9893l = AbstractC9306j0.m9893l(str);
        if (i11 < 0) {
            i11 = 0;
        }
        int length2 = charSequence.length();
        if (i12 > length2) {
            i12 = length2;
        }
        sbM9893l.append(charSequence.subSequence(i11, i12).toString());
        sbM9893l.append(str2);
        return sbM9893l.toString();
    }

    /* JADX INFO: renamed from: t */
    public static final C11531s m13114t(AbstractC11516d json, SerialDescriptor serialDescriptor) {
        AbstractC16544l.m18094g(serialDescriptor, "<this>");
        AbstractC16544l.m18094g(json, "json");
        if (AbstractC16544l.m18089b(serialDescriptor.getKind(), C10110k.f29935b)) {
            return json.f34843a.f34881m;
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static final Object m13115u(AbstractC11516d abstractC11516d, String discriminator, C16644c c16644c, KSerializer kSerializer) {
        AbstractC16544l.m18094g(abstractC11516d, "<this>");
        AbstractC16544l.m18094g(discriminator, "discriminator");
        return new C11832v(abstractC11516d, c16644c, discriminator, kSerializer.getDescriptor()).mo5482p(kSerializer);
    }

    /* JADX INFO: renamed from: v */
    public static final EnumC11810K m13116v(AbstractC11516d abstractC11516d, SerialDescriptor desc) {
        AbstractC16544l.m18094g(abstractC11516d, "<this>");
        AbstractC16544l.m18094g(desc, "desc");
        AbstractC15340a kind = desc.getKind();
        if (kind instanceof AbstractC10103d) {
            return EnumC11810K.POLY_OBJ;
        }
        if (AbstractC16544l.m18089b(kind, C10110k.f29936c)) {
            return EnumC11810K.f35799p0;
        }
        if (!AbstractC16544l.m18089b(kind, C10110k.f29937d)) {
            return EnumC11810K.OBJ;
        }
        SerialDescriptor serialDescriptorM13102h = m13102h(desc.mo10685h(0), abstractC11516d.f34844b);
        AbstractC15340a kind2 = serialDescriptorM13102h.getKind();
        if ((kind2 instanceof AbstractC10105f) || AbstractC16544l.m18089b(kind2, C10109j.f29934b)) {
            return EnumC11810K.MAP;
        }
        if (abstractC11516d.f34843a.f34872d) {
            return EnumC11810K.f35799p0;
        }
        throw m13096b(serialDescriptorM13102h);
    }

    /* JADX INFO: renamed from: w */
    public static final void m13117w(AbstractC6327i abstractC6327i, Number number) {
        AbstractC6327i.m6908r(abstractC6327i, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    /* JADX INFO: renamed from: x */
    public static final void m13118x(String str, AbstractC16643b element) {
        AbstractC16544l.m18094g(element, "element");
        StringBuilder sbM11058p = AbstractC10763a.m11058p("Class with serial name ", str, " cannot be serialized polymorphically because it is represented as ");
        sbM11058p.append(AbstractC16526C.f51263a.mo5693b(element.getClass()).mo4448c());
        sbM11058p.append(". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
        throw new C11825o(sbM11058p.toString());
    }

    /* JADX INFO: renamed from: y */
    public static final String m13119y(byte b) {
        if (b == 1) {
            return "quotation mark '\"'";
        }
        if (b == 2) {
            return "string escape sequence '\\'";
        }
        if (b == 4) {
            return "comma ','";
        }
        if (b == 5) {
            return vRJidSveZHcTw.TyNnvC;
        }
        if (b == 6) {
            return "start of the object '{'";
        }
        if (b == 7) {
            return "end of the object '}'";
        }
        if (b == 8) {
            return "start of the array '['";
        }
        if (b == 9) {
            return "end of the array ']'";
        }
        if (b == 10) {
            return "end of the input";
        }
        return b == 127 ? "invalid token" : "valid token";
    }

    /* JADX INFO: renamed from: h */
    public static final SerialDescriptor m13102h(SerialDescriptor serialDescriptor, C0042V0 module) {
        SerialDescriptor serialDescriptorM13102h;
        KSerializer kSerializerM213g;
        AbstractC16544l.m18094g(serialDescriptor, sVoFrD.tXE);
        AbstractC16544l.m18094g(module, "module");
        if (!AbstractC16544l.m18089b(serialDescriptor.getKind(), C10108i.f29933b)) {
            return serialDescriptor.isInline() ? m13102h(serialDescriptor.mo10685h(0), module) : serialDescriptor;
        }
        InterfaceC3756d interfaceC3756dM12526b = AbstractC11235f.m12526b(serialDescriptor);
        SerialDescriptor descriptor = null;
        if (interfaceC3756dM12526b != null && (kSerializerM213g = module.m213g(interfaceC3756dM12526b, C17689w.f56480Y)) != null) {
            descriptor = kSerializerM213g.getDescriptor();
        }
        return (descriptor == null || (serialDescriptorM13102h = m13102h(descriptor, module)) == null) ? serialDescriptor : serialDescriptorM13102h;
    }

    /* JADX INFO: renamed from: p */
    public static final int m13110p(SerialDescriptor serialDescriptor, AbstractC11516d json, String str, String suffix) {
        AbstractC16544l.m18094g(serialDescriptor, "<this>");
        AbstractC16544l.m18094g(json, "json");
        AbstractC16544l.m18094g(str, HpucjswO.TVs);
        AbstractC16544l.m18094g(suffix, "suffix");
        int iM13109o = m13109o(serialDescriptor, json, str);
        if (iM13109o != -3) {
            return iM13109o;
        }
        throw new C8976h(serialDescriptor.mo10679a() + " does not contain element with name '" + str + '\'' + suffix);
    }

    /* JADX INFO: renamed from: z */
    public static final String m13120z(Number number, String str, String str2) {
        return FpwNpGDhomXHZ.EZpUOxCcSH + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m13113s(-1, str2));
    }
}
