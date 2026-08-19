package p812ii;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import bo.AbstractC11523k;
import bo.C11527o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.AbstractC16645d;
import kotlinx.serialization.json.C16642a;
import kotlinx.serialization.json.C16644c;
import kotlinx.serialization.json.JsonNull;
import p025An.C0644w;
import p174Gk.uSfJ.HpucjswO;
import p559Wn.C8976h;
import p571X9.AbstractC9306j0;
import p571X9.AbstractC9393x3;
import p594Y9.AbstractC9961r4;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17686t;
import p909nm.C17689w;
import p909nm.C17690x;

/* JADX INFO: renamed from: ii.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C15014n {

    /* JADX INFO: renamed from: a */
    public static final C15014n f46708a = new C15014n();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: b */
    public static AbstractC16643b m16137b(AbstractC16643b abstractC16643b, C15012l c15012l, int i10) {
        ?? r6 = c15012l.f46706a;
        if (i10 == r6.size()) {
            return abstractC16643b;
        }
        AbstractC15010j abstractC15010j = (AbstractC15010j) r6.get(i10);
        if (abstractC15010j instanceof C15009i) {
            if (!(abstractC16643b instanceof C16644c)) {
                throw new C15001a(AbstractC10763a.m11054l("Expected JsonObject at path '", c15012l.m16136a(), Separators.QUOTE), null);
            }
            String str = ((C15009i) abstractC15010j).f46702a;
            AbstractC16643b abstractC16643b2 = (AbstractC16643b) ((C16644c) abstractC16643b).get(str);
            if (abstractC16643b2 != null) {
                return m16137b(abstractC16643b2, c15012l, i10 + 1);
            }
            throw new C15001a("Key not found: ".concat(str), null);
        }
        if (!(abstractC15010j instanceof C15008h)) {
            throw new C0644w();
        }
        if (!(abstractC16643b instanceof C16642a)) {
            throw new C15001a(AbstractC10763a.m11054l("Expected JsonArray at path '", c15012l.m16136a(), Separators.QUOTE), null);
        }
        AbstractC16643b abstractC16643b3 = (AbstractC16643b) AbstractC17680n.m19344T(((C15008h) abstractC15010j).f46701a, (List) abstractC16643b);
        if (abstractC16643b3 != null) {
            return m16137b(abstractC16643b3, c15012l, i10 + 1);
        }
        throw new C15001a(AbstractC10763a.m11054l("Index out of bounds at path '", c15012l.m16136a(), Separators.QUOTE), null);
    }

    /* JADX INFO: renamed from: d */
    public static C15012l m16139d(C15014n c15014n, C15006f c15006f) {
        c15014n.getClass();
        C15012l c15012l = c15006f.f46697b;
        if (c15012l != null) {
            return c15012l;
        }
        throw new C15001a("Missing path", null);
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC16643b m16140e(C15006f c15006f, String str) {
        AbstractC16643b abstractC16643b = c15006f.f46698c;
        if (abstractC16643b != null) {
            return abstractC16643b;
        }
        throw new C15001a(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: f */
    public static AbstractC16643b m16141f(AbstractC16643b abstractC16643b, C15012l c15012l, AbstractC16643b abstractC16643b2, boolean z6, int i10) {
        ?? r6 = c15012l.f46706a;
        if (i10 == r6.size()) {
            return abstractC16643b2;
        }
        AbstractC15010j abstractC15010j = (AbstractC15010j) r6.get(i10);
        if (abstractC15010j instanceof C15009i) {
            LinkedHashMap linkedHashMapM19256r = abstractC16643b instanceof C16644c ? AbstractC17659D.m19256r((Map) abstractC16643b) : new LinkedHashMap();
            String str = ((C15009i) abstractC15010j).f46702a;
            if (i10 == r6.size() - 1) {
                linkedHashMapM19256r.put(str, abstractC16643b2);
            } else {
                AbstractC16643b c16644c = (AbstractC16643b) linkedHashMapM19256r.get(str);
                if (c16644c == null) {
                    c16644c = new C16644c(C17690x.f56481Y);
                }
                linkedHashMapM19256r.put(str, m16141f(c16644c, c15012l, abstractC16643b2, z6, i10 + 1));
            }
            return new C16644c(linkedHashMapM19256r);
        }
        if (!(abstractC15010j instanceof C15008h)) {
            throw new C0644w();
        }
        ArrayList arrayListM19323D0 = abstractC16643b instanceof C16642a ? AbstractC17680n.m19323D0((Collection) abstractC16643b) : new ArrayList();
        int i11 = ((C15008h) abstractC15010j).f46701a;
        if ((i11 - arrayListM19323D0.size()) + 1 > 0) {
            int size = (i11 - arrayListM19323D0.size()) + 1;
            JsonNull[] jsonNullArr = new JsonNull[size];
            for (int i12 = 0; i12 < size; i12++) {
                jsonNullArr[i12] = JsonNull.INSTANCE;
            }
            AbstractC17686t.m19399w(arrayListM19323D0, jsonNullArr);
        }
        if (i10 == r6.size() - 1) {
            arrayListM19323D0.set(i11, abstractC16643b2);
        } else {
            arrayListM19323D0.set(i11, m16141f((AbstractC16643b) arrayListM19323D0.get(i11), c15012l, abstractC16643b2, z6, i10 + 1));
        }
        return new C16642a(arrayListM19323D0);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ AbstractC16643b m16142g(C15014n c15014n, AbstractC16643b abstractC16643b, C15012l c15012l, AbstractC16643b abstractC16643b2, boolean z6, int i10) {
        if ((i10 & 8) != 0) {
            z6 = false;
        }
        c15014n.getClass();
        return m16141f(abstractC16643b, c15012l, abstractC16643b2, z6, 0);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x022b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0235  */
    /* JADX WARN: Code duplicated, block: B:104:0x023b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0245  */
    /* JADX WARN: Code duplicated, block: B:109:0x0249  */
    /* JADX WARN: Code duplicated, block: B:114:0x026c  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:93:0x0209  */
    /* JADX WARN: Code duplicated, block: B:94:0x020b  */
    /* JADX INFO: renamed from: a */
    public final AbstractC16643b m16143a(AbstractC16643b abstractC16643b, C15006f c15006f, C11527o json) {
        Object c16644c;
        boolean z6;
        AbstractC16643b c16644c2;
        AbstractC16643b abstractC16643b2;
        ArrayList arrayListM19323D0;
        AbstractC16645d abstractC16645dM12910c;
        AbstractC16645d abstractC16645d;
        Integer numM12915h;
        AbstractC16643b c16642a;
        List operations;
        EnumC15004d enumC15004d = c15006f.f46696a;
        int i10 = enumC15004d == null ? -1 : AbstractC15013m.f46707a[enumC15004d.ordinal()];
        C15012l c15012l = c15006f.f46697b;
        switch (i10) {
            case -1:
                throw new C15001a("Missing operation", null);
            case 0:
            default:
                throw new C0644w();
            case 1:
                return m16142g(this, abstractC16643b, m16139d(this, c15006f), m16140e(c15006f, "Missing value"), true, 16);
            case 2:
                return m16138c(abstractC16643b, m16139d(this, c15006f), 0);
            case 3:
                return m16142g(this, abstractC16643b, m16139d(this, c15006f), m16140e(c15006f, "Missing value"), false, 24);
            case 4:
                if (c15012l == null) {
                    throw new C15001a("Missing path for append operation", null);
                }
                Object objM16140e = m16140e(c15006f, "Missing value for append operation at path '" + c15012l.m16136a() + Separators.QUOTE);
                try {
                    c16644c = m16137b(abstractC16643b, c15012l, 0);
                    break;
                } catch (C15001a e10) {
                    if (objM16140e instanceof AbstractC16645d) {
                        c16644c = AbstractC11523k.m12910c("");
                    } else if (objM16140e instanceof C16642a) {
                        c16644c = new C16642a(C17689w.f56480Y);
                    } else {
                        if (!(objM16140e instanceof C16644c)) {
                            throw new C15001a(AbstractC10763a.m11054l("Invalid type for append operation at path '", c15012l.m16136a(), Separators.QUOTE), e10);
                        }
                        c16644c = new C16644c(C17690x.f56481Y);
                    }
                }
                boolean z10 = c16644c instanceof AbstractC16645d;
                if (z10) {
                    AbstractC16645d abstractC16645d2 = (AbstractC16645d) c16644c;
                    if (abstractC16645d2.mo12923j() && (objM16140e instanceof AbstractC16645d)) {
                        AbstractC16645d abstractC16645d3 = (AbstractC16645d) objM16140e;
                        if (abstractC16645d3.mo12923j()) {
                            abstractC16645dM12910c = AbstractC11523k.m12910c(abstractC16645d2.mo12922f() + abstractC16645d3.mo12922f());
                        } else if (z10) {
                            abstractC16645d = (AbstractC16645d) c16644c;
                            if (!abstractC16645d.mo12923j()) {
                                if (!z10) {
                                }
                                if (c16644c instanceof C16642a) {
                                    z6 = c16644c instanceof C16644c;
                                    if (z6) {
                                    }
                                    if (z6) {
                                    }
                                    throw new C15001a(AbstractC10763a.m11054l("Invalid type for append operation at path '", c15012l.m16136a(), Separators.QUOTE), null);
                                }
                                arrayListM19323D0 = AbstractC17680n.m19323D0((Collection) c16644c);
                                if (objM16140e instanceof C16642a) {
                                    arrayListM19323D0.addAll((Collection) objM16140e);
                                } else {
                                    arrayListM19323D0.add(objM16140e);
                                }
                                c16644c2 = new C16642a(arrayListM19323D0);
                                abstractC16643b2 = c16644c2;
                            } else {
                                if (!z10) {
                                }
                                if (c16644c instanceof C16642a) {
                                    z6 = c16644c instanceof C16644c;
                                    if (z6) {
                                    }
                                    if (z6) {
                                    }
                                    throw new C15001a(AbstractC10763a.m11054l("Invalid type for append operation at path '", c15012l.m16136a(), Separators.QUOTE), null);
                                }
                                arrayListM19323D0 = AbstractC17680n.m19323D0((Collection) c16644c);
                                if (objM16140e instanceof C16642a) {
                                    arrayListM19323D0.addAll((Collection) objM16140e);
                                } else {
                                    arrayListM19323D0.add(objM16140e);
                                }
                                c16644c2 = new C16642a(arrayListM19323D0);
                                abstractC16643b2 = c16644c2;
                            }
                        } else {
                            if (!z10) {
                            }
                            if (c16644c instanceof C16642a) {
                                z6 = c16644c instanceof C16644c;
                                if (z6) {
                                }
                                if (z6) {
                                }
                                throw new C15001a(AbstractC10763a.m11054l("Invalid type for append operation at path '", c15012l.m16136a(), Separators.QUOTE), null);
                            }
                            arrayListM19323D0 = AbstractC17680n.m19323D0((Collection) c16644c);
                            if (objM16140e instanceof C16642a) {
                                arrayListM19323D0.addAll((Collection) objM16140e);
                            } else {
                                arrayListM19323D0.add(objM16140e);
                            }
                            c16644c2 = new C16642a(arrayListM19323D0);
                            abstractC16643b2 = c16644c2;
                        }
                        abstractC16643b2 = abstractC16645dM12910c;
                    } else if (z10) {
                        abstractC16645d = (AbstractC16645d) c16644c;
                        if (!abstractC16645d.mo12923j() && (objM16140e instanceof AbstractC16645d)) {
                            AbstractC16645d abstractC16645d4 = (AbstractC16645d) objM16140e;
                            if (abstractC16645d4.mo12923j()) {
                                if (!z10) {
                                }
                                if (c16644c instanceof C16642a) {
                                    z6 = c16644c instanceof C16644c;
                                    if (z6) {
                                    }
                                    if (z6) {
                                    }
                                    throw new C15001a(AbstractC10763a.m11054l("Invalid type for append operation at path '", c15012l.m16136a(), Separators.QUOTE), null);
                                }
                                arrayListM19323D0 = AbstractC17680n.m19323D0((Collection) c16644c);
                                if (objM16140e instanceof C16642a) {
                                    arrayListM19323D0.addAll((Collection) objM16140e);
                                } else {
                                    arrayListM19323D0.add(objM16140e);
                                }
                                c16644c2 = new C16642a(arrayListM19323D0);
                                abstractC16643b2 = c16644c2;
                            } else {
                                abstractC16645dM12910c = AbstractC11523k.m12910c(abstractC16645d.mo12922f() + abstractC16645d4.mo12922f());
                            }
                            abstractC16643b2 = abstractC16645dM12910c;
                        } else if (!z10 && AbstractC16544l.m18089b(((AbstractC16645d) c16644c).mo12922f(), "") && (objM16140e instanceof AbstractC16645d)) {
                            abstractC16645dM12910c = AbstractC11523k.m12910c(((AbstractC16645d) objM16140e).mo12922f());
                            abstractC16643b2 = abstractC16645dM12910c;
                        } else {
                            if (c16644c instanceof C16642a) {
                                arrayListM19323D0 = AbstractC17680n.m19323D0((Collection) c16644c);
                                if (objM16140e instanceof C16642a) {
                                    arrayListM19323D0.addAll((Collection) objM16140e);
                                } else {
                                    arrayListM19323D0.add(objM16140e);
                                }
                                c16644c2 = new C16642a(arrayListM19323D0);
                            } else {
                                z6 = c16644c instanceof C16644c;
                                if (z6 || !(objM16140e instanceof C16644c)) {
                                    if (z6 || !(objM16140e instanceof C16642a)) {
                                        throw new C15001a(AbstractC10763a.m11054l("Invalid type for append operation at path '", c15012l.m16136a(), Separators.QUOTE), null);
                                    }
                                    throw new C15001a(AbstractC10763a.m11054l("Cannot append array to object at path '", c15012l.m16136a(), Separators.QUOTE), null);
                                }
                                LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r((Map) c16644c);
                                linkedHashMapM19256r.putAll((Map) objM16140e);
                                c16644c2 = new C16644c(linkedHashMapM19256r);
                            }
                            abstractC16643b2 = c16644c2;
                        }
                    } else {
                        if (!z10) {
                        }
                        if (c16644c instanceof C16642a) {
                            z6 = c16644c instanceof C16644c;
                            if (z6) {
                            }
                            if (z6) {
                            }
                            throw new C15001a(AbstractC10763a.m11054l("Invalid type for append operation at path '", c15012l.m16136a(), Separators.QUOTE), null);
                        }
                        arrayListM19323D0 = AbstractC17680n.m19323D0((Collection) c16644c);
                        if (objM16140e instanceof C16642a) {
                            arrayListM19323D0.addAll((Collection) objM16140e);
                        } else {
                            arrayListM19323D0.add(objM16140e);
                        }
                        c16644c2 = new C16642a(arrayListM19323D0);
                        abstractC16643b2 = c16644c2;
                    }
                } else if (z10) {
                    abstractC16645d = (AbstractC16645d) c16644c;
                    if (!abstractC16645d.mo12923j()) {
                        if (!z10) {
                        }
                        if (c16644c instanceof C16642a) {
                            z6 = c16644c instanceof C16644c;
                            if (z6) {
                            }
                            if (z6) {
                            }
                            throw new C15001a(AbstractC10763a.m11054l("Invalid type for append operation at path '", c15012l.m16136a(), Separators.QUOTE), null);
                        }
                        arrayListM19323D0 = AbstractC17680n.m19323D0((Collection) c16644c);
                        if (objM16140e instanceof C16642a) {
                            arrayListM19323D0.addAll((Collection) objM16140e);
                        } else {
                            arrayListM19323D0.add(objM16140e);
                        }
                        c16644c2 = new C16642a(arrayListM19323D0);
                        abstractC16643b2 = c16644c2;
                    } else {
                        if (!z10) {
                        }
                        if (c16644c instanceof C16642a) {
                            z6 = c16644c instanceof C16644c;
                            if (z6) {
                            }
                            if (z6) {
                            }
                            throw new C15001a(AbstractC10763a.m11054l("Invalid type for append operation at path '", c15012l.m16136a(), Separators.QUOTE), null);
                        }
                        arrayListM19323D0 = AbstractC17680n.m19323D0((Collection) c16644c);
                        if (objM16140e instanceof C16642a) {
                            arrayListM19323D0.addAll((Collection) objM16140e);
                        } else {
                            arrayListM19323D0.add(objM16140e);
                        }
                        c16644c2 = new C16642a(arrayListM19323D0);
                        abstractC16643b2 = c16644c2;
                    }
                } else {
                    if (!z10) {
                    }
                    if (c16644c instanceof C16642a) {
                        z6 = c16644c instanceof C16644c;
                        if (z6) {
                        }
                        if (z6) {
                        }
                        throw new C15001a(AbstractC10763a.m11054l("Invalid type for append operation at path '", c15012l.m16136a(), Separators.QUOTE), null);
                    }
                    arrayListM19323D0 = AbstractC17680n.m19323D0((Collection) c16644c);
                    if (objM16140e instanceof C16642a) {
                        arrayListM19323D0.addAll((Collection) objM16140e);
                    } else {
                        arrayListM19323D0.add(objM16140e);
                    }
                    c16644c2 = new C16642a(arrayListM19323D0);
                    abstractC16643b2 = c16644c2;
                }
                return m16142g(this, abstractC16643b, c15012l, abstractC16643b2, false, 24);
            case 5:
                C15012l c15012lM16139d = m16139d(this, c15006f);
                AbstractC16643b abstractC16643b3 = c15006f.f46698c;
                if (abstractC16643b3 == null || (numM12915h = AbstractC11523k.m12915h(AbstractC11523k.m12918k(abstractC16643b3))) == null) {
                    throw new C15001a("Invalid or missing value for truncate operation", null);
                }
                int iIntValue = numM12915h.intValue();
                Object objM16137b = m16137b(abstractC16643b, c15012lM16139d, 0);
                if (objM16137b instanceof AbstractC16645d) {
                    AbstractC16645d abstractC16645d5 = (AbstractC16645d) objM16137b;
                    if (!abstractC16645d5.mo12923j()) {
                        throw new C15001a(AbstractC10763a.m11054l("Invalid type for truncate operation at path '", c15012lM16139d.m16136a(), Separators.QUOTE), null);
                    }
                    if (iIntValue < 0 || iIntValue > abstractC16645d5.mo12922f().length()) {
                        throw new C15001a(AbstractC10763a.m11054l("Index out of bounds for truncate operation at path '", c15012lM16139d.m16136a(), Separators.QUOTE), null);
                    }
                    String strSubstring = abstractC16645d5.mo12922f().substring(0, iIntValue);
                    AbstractC16544l.m18093f(strSubstring, "substring(...)");
                    c16642a = AbstractC11523k.m12910c(strSubstring);
                } else {
                    if (!(objM16137b instanceof C16642a)) {
                        throw new C15001a(AbstractC10763a.m11054l("Invalid type for truncate operation at path '", c15012lM16139d.m16136a(), Separators.QUOTE), null);
                    }
                    if (iIntValue < 0 || iIntValue > ((C16642a) objM16137b).f53330Y.size()) {
                        throw new C15001a(AbstractC10763a.m11054l("Index out of bounds for truncate operation at path '", c15012lM16139d.m16136a(), Separators.QUOTE), null);
                    }
                    c16642a = new C16642a(AbstractC17680n.m19373w0((Iterable) objM16137b, iIntValue));
                }
                return m16142g(this, abstractC16643b, c15012lM16139d, c16642a, false, 24);
            case 6:
                AbstractC16643b abstractC16643bM16140e = m16140e(c15006f, "Missing value for patch operation");
                try {
                    if (abstractC16643bM16140e instanceof C16642a) {
                        operations = (List) json.m12902a(AbstractC9961r4.m10614a(C15006f.Companion.serializer()), abstractC16643bM16140e);
                    } else {
                        if (!(abstractC16643bM16140e instanceof C16644c)) {
                            throw new C15001a("Invalid sub-patch format", null);
                        }
                        operations = AbstractC9393x3.m9974d(json.m12902a(C15006f.Companion.serializer(), abstractC16643bM16140e));
                    }
                    C15012l c15012l2 = c15012l == null ? new C15012l("") : c15012l;
                    AbstractC16643b target = m16137b(abstractC16643b, c15012l2, 0);
                    AbstractC16544l.m18094g(target, "target");
                    AbstractC16544l.m18094g(operations, "operations");
                    AbstractC16544l.m18094g(json, "json");
                    Iterator it = operations.iterator();
                    while (it.hasNext()) {
                        target = m16143a(target, (C15006f) it.next(), json);
                    }
                    return m16142g(this, abstractC16643b, c15012l2, target, false, 24);
                } catch (C8976h e11) {
                    throw new C15001a(AbstractC9306j0.m9889h("Invalid sub-patch format: ", e11.getMessage()), e11);
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: c */
    public static AbstractC16643b m16138c(AbstractC16643b abstractC16643b, C15012l c15012l, int i10) {
        ?? r6 = c15012l.f46706a;
        if (i10 == r6.size()) {
            throw new C15001a("Cannot remove the root element", null);
        }
        AbstractC15010j abstractC15010j = (AbstractC15010j) r6.get(i10);
        if (abstractC15010j instanceof C15009i) {
            if (!(abstractC16643b instanceof C16644c)) {
                throw new C15001a(AbstractC10763a.m11054l("Expected JsonObject at path '", c15012l.m16136a(), Separators.QUOTE), null);
            }
            LinkedHashMap linkedHashMapM19256r = AbstractC17659D.m19256r((Map) abstractC16643b);
            String str = ((C15009i) abstractC15010j).f46702a;
            if (i10 != r6.size() - 1) {
                AbstractC16643b abstractC16643b2 = (AbstractC16643b) linkedHashMapM19256r.get(str);
                if (abstractC16643b2 == null) {
                    throw new C15001a("Key not found: ".concat(str), null);
                }
                linkedHashMapM19256r.put(str, m16138c(abstractC16643b2, c15012l, i10 + 1));
            } else {
                if (!linkedHashMapM19256r.containsKey(str)) {
                    throw new C15001a("Key not found: ".concat(str), null);
                }
                linkedHashMapM19256r.remove(str);
            }
            return new C16644c(linkedHashMapM19256r);
        }
        if (!(abstractC15010j instanceof C15008h)) {
            throw new C0644w();
        }
        if (!(abstractC16643b instanceof C16642a)) {
            throw new C15001a(AbstractC10763a.m11054l("Expected JsonArray at path '", c15012l.m16136a(), Separators.QUOTE), null);
        }
        int i11 = ((C15008h) abstractC15010j).f46701a;
        ArrayList arrayListM19323D0 = AbstractC17680n.m19323D0((Collection) abstractC16643b);
        if (i11 < 0 || i11 >= arrayListM19323D0.size()) {
            throw new C15001a(AbstractC10763a.m11054l(HpucjswO.VTZbkfiC, c15012l.m16136a(), Separators.QUOTE), null);
        }
        if (i10 == r6.size() - 1) {
            arrayListM19323D0.remove(i11);
        } else {
            arrayListM19323D0.set(i11, m16138c((AbstractC16643b) arrayListM19323D0.get(i11), c15012l, i10 + 1));
        }
        return new C16642a(arrayListM19323D0);
    }
}
