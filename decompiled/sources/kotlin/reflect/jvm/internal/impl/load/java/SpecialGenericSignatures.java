package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import mm.C17309l;
import p003A1.AbstractC0168G;
import p523V9.AbstractC7877E4;
import p571X9.AbstractC9306j0;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes2.dex */
public class SpecialGenericSignatures {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    public static final ArrayList f51781a;

    /* JADX INFO: renamed from: b */
    public static final ArrayList f51782b;

    /* JADX INFO: renamed from: c */
    public static final Object f51783c;

    /* JADX INFO: renamed from: d */
    public static final LinkedHashMap f51784d;

    /* JADX INFO: renamed from: e */
    public static final Set f51785e;

    /* JADX INFO: renamed from: f */
    public static final Set f51786f;

    /* JADX INFO: renamed from: g */
    public static final Companion.NameAndSignature f51787g;

    /* JADX INFO: renamed from: h */
    public static final Object f51788h;

    /* JADX INFO: renamed from: i */
    public static final LinkedHashMap f51789i;

    /* JADX INFO: renamed from: j */
    public static final HashSet f51790j;

    /* JADX INFO: renamed from: k */
    public static final LinkedHashMap f51791k;

    public static final class Companion {

        public static final class NameAndSignature {

            /* JADX INFO: renamed from: a */
            public final String f51792a;

            /* JADX INFO: renamed from: b */
            public final Name f51793b;

            /* JADX INFO: renamed from: c */
            public final String f51794c;

            /* JADX INFO: renamed from: d */
            public final String f51795d;

            /* JADX INFO: renamed from: e */
            public final String f51796e;

            public NameAndSignature(String classInternalName, Name name, String parameters, String returnType) {
                AbstractC16544l.m18094g(classInternalName, "classInternalName");
                AbstractC16544l.m18094g(name, "name");
                AbstractC16544l.m18094g(parameters, "parameters");
                AbstractC16544l.m18094g(returnType, "returnType");
                this.f51792a = classInternalName;
                this.f51793b = name;
                this.f51794c = parameters;
                this.f51795d = returnType;
                this.f51796e = SignatureBuildingComponents.INSTANCE.signature(classInternalName, name + '(' + parameters + ')' + returnType);
            }

            public static /* synthetic */ NameAndSignature copy$default(NameAndSignature nameAndSignature, String str, Name name, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = nameAndSignature.f51792a;
                }
                if ((i10 & 2) != 0) {
                    name = nameAndSignature.f51793b;
                }
                if ((i10 & 4) != 0) {
                    str2 = nameAndSignature.f51794c;
                }
                if ((i10 & 8) != 0) {
                    str3 = nameAndSignature.f51795d;
                }
                return nameAndSignature.copy(str, name, str2, str3);
            }

            public final NameAndSignature copy(String classInternalName, Name name, String parameters, String returnType) {
                AbstractC16544l.m18094g(classInternalName, "classInternalName");
                AbstractC16544l.m18094g(name, "name");
                AbstractC16544l.m18094g(parameters, "parameters");
                AbstractC16544l.m18094g(returnType, "returnType");
                return new NameAndSignature(classInternalName, name, parameters, returnType);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NameAndSignature)) {
                    return false;
                }
                NameAndSignature nameAndSignature = (NameAndSignature) obj;
                return AbstractC16544l.m18089b(this.f51792a, nameAndSignature.f51792a) && AbstractC16544l.m18089b(this.f51793b, nameAndSignature.f51793b) && AbstractC16544l.m18089b(this.f51794c, nameAndSignature.f51794c) && AbstractC16544l.m18089b(this.f51795d, nameAndSignature.f51795d);
            }

            public final Name getName() {
                return this.f51793b;
            }

            public final String getSignature() {
                return this.f51796e;
            }

            public int hashCode() {
                return this.f51795d.hashCode() + AbstractC0168G.m527p((this.f51793b.hashCode() + (this.f51792a.hashCode() * 31)) * 31, 31, this.f51794c);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("NameAndSignature(classInternalName=");
                sb2.append(this.f51792a);
                sb2.append(", name=");
                sb2.append(this.f51793b);
                sb2.append(", parameters=");
                sb2.append(this.f51794c);
                sb2.append(", returnType=");
                return AbstractC9306j0.m9892k(sb2, this.f51795d, ')');
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final NameAndSignature access$method(Companion companion, String str, String str2, String str3, String str4) {
            companion.getClass();
            Name nameIdentifier = Name.identifier(str2);
            AbstractC16544l.m18093f(nameIdentifier, "identifier(...)");
            return new NameAndSignature(str, nameIdentifier, str3, str4);
        }

        public final Name getBuiltinFunctionNamesByJvmName(Name name) {
            AbstractC16544l.m18094g(name, "name");
            return getJVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP().get(name);
        }

        public final List<String> getERASED_COLLECTION_PARAMETER_SIGNATURES() {
            return SpecialGenericSignatures.f51782b;
        }

        public final Set<Name> getERASED_VALUE_PARAMETERS_SHORT_NAMES() {
            return SpecialGenericSignatures.f51785e;
        }

        public final Set<String> getERASED_VALUE_PARAMETERS_SIGNATURES() {
            return SpecialGenericSignatures.f51786f;
        }

        public final Map<Name, Name> getJVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP() {
            return SpecialGenericSignatures.f51791k;
        }

        public final Set<Name> getORIGINAL_SHORT_NAMES() {
            return SpecialGenericSignatures.f51790j;
        }

        public final NameAndSignature getREMOVE_AT_NAME_AND_SIGNATURE() {
            return SpecialGenericSignatures.f51787g;
        }

        public final Map<String, TypeSafeBarrierDescription> getSIGNATURE_TO_DEFAULT_VALUES_MAP() {
            return SpecialGenericSignatures.f51784d;
        }

        public final Map<String, Name> getSIGNATURE_TO_JVM_REPRESENTATION_NAME() {
            return SpecialGenericSignatures.f51789i;
        }

        public final boolean getSameAsRenamedInJvmBuiltin(Name name) {
            AbstractC16544l.m18094g(name, "<this>");
            return getORIGINAL_SHORT_NAMES().contains(name);
        }

        public final SpecialSignatureInfo getSpecialSignatureInfo(String builtinSignature) {
            AbstractC16544l.m18094g(builtinSignature, "builtinSignature");
            if (getERASED_COLLECTION_PARAMETER_SIGNATURES().contains(builtinSignature)) {
                return SpecialSignatureInfo.ONE_COLLECTION_PARAMETER;
            }
            return ((TypeSafeBarrierDescription) AbstractC17659D.m19243e(getSIGNATURE_TO_DEFAULT_VALUES_MAP(), builtinSignature)) == TypeSafeBarrierDescription.NULL ? SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC : SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SpecialSignatureInfo {
        public static final SpecialSignatureInfo OBJECT_PARAMETER_GENERIC;
        public static final SpecialSignatureInfo OBJECT_PARAMETER_NON_GENERIC;
        public static final SpecialSignatureInfo ONE_COLLECTION_PARAMETER;

        /* JADX INFO: renamed from: Y */
        public static final /* synthetic */ SpecialSignatureInfo[] f51797Y;

        static {
            SpecialSignatureInfo specialSignatureInfo = new SpecialSignatureInfo("ONE_COLLECTION_PARAMETER", 0);
            ONE_COLLECTION_PARAMETER = specialSignatureInfo;
            SpecialSignatureInfo specialSignatureInfo2 = new SpecialSignatureInfo("OBJECT_PARAMETER_NON_GENERIC", 1);
            OBJECT_PARAMETER_NON_GENERIC = specialSignatureInfo2;
            SpecialSignatureInfo specialSignatureInfo3 = new SpecialSignatureInfo("OBJECT_PARAMETER_GENERIC", 2);
            OBJECT_PARAMETER_GENERIC = specialSignatureInfo3;
            SpecialSignatureInfo[] specialSignatureInfoArr = {specialSignatureInfo, specialSignatureInfo2, specialSignatureInfo3};
            f51797Y = specialSignatureInfoArr;
            AbstractC7877E4.m8156j(specialSignatureInfoArr);
        }

        public static SpecialSignatureInfo valueOf(String str) {
            return (SpecialSignatureInfo) Enum.valueOf(SpecialSignatureInfo.class, str);
        }

        public static SpecialSignatureInfo[] values() {
            return (SpecialSignatureInfo[]) f51797Y.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TypeSafeBarrierDescription {
        public static final TypeSafeBarrierDescription FALSE;
        public static final TypeSafeBarrierDescription INDEX;
        public static final TypeSafeBarrierDescription MAP_GET_OR_DEFAULT;
        public static final TypeSafeBarrierDescription NULL;

        /* JADX INFO: renamed from: Z */
        public static final /* synthetic */ TypeSafeBarrierDescription[] f51798Z;

        /* JADX INFO: renamed from: Y */
        public final Object f51799Y;

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            TypeSafeBarrierDescription typeSafeBarrierDescription = new TypeSafeBarrierDescription("NULL", 0, null);
            NULL = typeSafeBarrierDescription;
            TypeSafeBarrierDescription typeSafeBarrierDescription2 = new TypeSafeBarrierDescription("INDEX", 1, -1);
            INDEX = typeSafeBarrierDescription2;
            TypeSafeBarrierDescription typeSafeBarrierDescription3 = new TypeSafeBarrierDescription("FALSE", 2, Boolean.FALSE);
            FALSE = typeSafeBarrierDescription3;
            C16563a c16563a = new C16563a("MAP_GET_OR_DEFAULT", 3, defaultConstructorMarker, defaultConstructorMarker);
            MAP_GET_OR_DEFAULT = c16563a;
            TypeSafeBarrierDescription[] typeSafeBarrierDescriptionArr = {typeSafeBarrierDescription, typeSafeBarrierDescription2, typeSafeBarrierDescription3, c16563a};
            f51798Z = typeSafeBarrierDescriptionArr;
            AbstractC7877E4.m8156j(typeSafeBarrierDescriptionArr);
        }

        public /* synthetic */ TypeSafeBarrierDescription(String str, int i10, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10, obj);
        }

        public static TypeSafeBarrierDescription valueOf(String str) {
            return (TypeSafeBarrierDescription) Enum.valueOf(TypeSafeBarrierDescription.class, str);
        }

        public static TypeSafeBarrierDescription[] values() {
            return (TypeSafeBarrierDescription[]) f51798Z.clone();
        }

        public TypeSafeBarrierDescription(String str, int i10, Object obj) {
            super(str, i10);
            this.f51799Y = obj;
        }
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, java.util.Map] */
    static {
        Set<String> setM19293P = AbstractC17678l.m19293P(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(setM19293P, 10));
        for (String str : setM19293P) {
            Companion companion = Companion;
            String desc = JvmPrimitiveType.BOOLEAN.getDesc();
            AbstractC16544l.m18093f(desc, "getDesc(...)");
            arrayList.add(Companion.access$method(companion, "java/util/Collection", str, "Ljava/util/Collection;", desc));
        }
        f51781a = arrayList;
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Companion.NameAndSignature) it.next()).getSignature());
        }
        f51782b = arrayList2;
        ArrayList arrayList3 = f51781a;
        ArrayList arrayList4 = new ArrayList(AbstractC17682p.m19389r(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((Companion.NameAndSignature) it2.next()).getName().asString());
        }
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        Companion companion2 = Companion;
        String strJavaUtil = signatureBuildingComponents.javaUtil("Collection");
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BOOLEAN;
        String desc2 = jvmPrimitiveType.getDesc();
        AbstractC16544l.m18093f(desc2, "getDesc(...)");
        Companion.NameAndSignature nameAndSignatureAccess$method = Companion.access$method(companion2, strJavaUtil, "contains", "Ljava/lang/Object;", desc2);
        TypeSafeBarrierDescription typeSafeBarrierDescription = TypeSafeBarrierDescription.FALSE;
        C17309l c17309l = new C17309l(nameAndSignatureAccess$method, typeSafeBarrierDescription);
        String strJavaUtil2 = signatureBuildingComponents.javaUtil("Collection");
        String desc3 = jvmPrimitiveType.getDesc();
        AbstractC16544l.m18093f(desc3, "getDesc(...)");
        C17309l c17309l2 = new C17309l(Companion.access$method(companion2, strJavaUtil2, "remove", "Ljava/lang/Object;", desc3), typeSafeBarrierDescription);
        String strJavaUtil3 = signatureBuildingComponents.javaUtil("Map");
        String desc4 = jvmPrimitiveType.getDesc();
        AbstractC16544l.m18093f(desc4, "getDesc(...)");
        C17309l c17309l3 = new C17309l(Companion.access$method(companion2, strJavaUtil3, "containsKey", "Ljava/lang/Object;", desc4), typeSafeBarrierDescription);
        String strJavaUtil4 = signatureBuildingComponents.javaUtil("Map");
        String desc5 = jvmPrimitiveType.getDesc();
        AbstractC16544l.m18093f(desc5, "getDesc(...)");
        C17309l c17309l4 = new C17309l(Companion.access$method(companion2, strJavaUtil4, "containsValue", "Ljava/lang/Object;", desc5), typeSafeBarrierDescription);
        String strJavaUtil5 = signatureBuildingComponents.javaUtil("Map");
        String desc6 = jvmPrimitiveType.getDesc();
        AbstractC16544l.m18093f(desc6, "getDesc(...)");
        C17309l c17309l5 = new C17309l(Companion.access$method(companion2, strJavaUtil5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", desc6), typeSafeBarrierDescription);
        C17309l c17309l6 = new C17309l(Companion.access$method(companion2, signatureBuildingComponents.javaUtil("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT);
        Companion.NameAndSignature nameAndSignatureAccess$method2 = Companion.access$method(companion2, signatureBuildingComponents.javaUtil("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        TypeSafeBarrierDescription typeSafeBarrierDescription2 = TypeSafeBarrierDescription.NULL;
        C17309l c17309l7 = new C17309l(nameAndSignatureAccess$method2, typeSafeBarrierDescription2);
        C17309l c17309l8 = new C17309l(Companion.access$method(companion2, signatureBuildingComponents.javaUtil("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), typeSafeBarrierDescription2);
        String strJavaUtil6 = signatureBuildingComponents.javaUtil("List");
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.INT;
        String desc7 = jvmPrimitiveType2.getDesc();
        AbstractC16544l.m18093f(desc7, "getDesc(...)");
        Companion.NameAndSignature nameAndSignatureAccess$method3 = Companion.access$method(companion2, strJavaUtil6, "indexOf", "Ljava/lang/Object;", desc7);
        TypeSafeBarrierDescription typeSafeBarrierDescription3 = TypeSafeBarrierDescription.INDEX;
        C17309l c17309l9 = new C17309l(nameAndSignatureAccess$method3, typeSafeBarrierDescription3);
        String strJavaUtil7 = signatureBuildingComponents.javaUtil("List");
        String desc8 = jvmPrimitiveType2.getDesc();
        AbstractC16544l.m18093f(desc8, "getDesc(...)");
        Map mapM19244f = AbstractC17659D.m19244f(c17309l, c17309l2, c17309l3, c17309l4, c17309l5, c17309l6, c17309l7, c17309l8, c17309l9, new C17309l(Companion.access$method(companion2, strJavaUtil7, "lastIndexOf", "Ljava/lang/Object;", desc8), typeSafeBarrierDescription3));
        f51783c = mapM19244f;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC17660E.m19257b(mapM19244f.size()));
        for (Map.Entry entry : mapM19244f.entrySet()) {
            linkedHashMap.put(((Companion.NameAndSignature) entry.getKey()).getSignature(), entry.getValue());
        }
        f51784d = linkedHashMap;
        LinkedHashSet linkedHashSetM19266f = AbstractC17665J.m19266f(f51783c.keySet(), f51781a);
        ArrayList arrayList5 = new ArrayList(AbstractC17682p.m19389r(linkedHashSetM19266f, 10));
        Iterator it3 = linkedHashSetM19266f.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((Companion.NameAndSignature) it3.next()).getName());
        }
        f51785e = AbstractC17680n.m19328G0(arrayList5);
        ArrayList arrayList6 = new ArrayList(AbstractC17682p.m19389r(linkedHashSetM19266f, 10));
        Iterator it4 = linkedHashSetM19266f.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((Companion.NameAndSignature) it4.next()).getSignature());
        }
        f51786f = AbstractC17680n.m19328G0(arrayList6);
        Companion companion3 = Companion;
        JvmPrimitiveType jvmPrimitiveType3 = JvmPrimitiveType.INT;
        String desc9 = jvmPrimitiveType3.getDesc();
        AbstractC16544l.m18093f(desc9, "getDesc(...)");
        Companion.NameAndSignature nameAndSignatureAccess$method4 = Companion.access$method(companion3, "java/util/List", "removeAt", desc9, "Ljava/lang/Object;");
        f51787g = nameAndSignatureAccess$method4;
        SignatureBuildingComponents signatureBuildingComponents2 = SignatureBuildingComponents.INSTANCE;
        String strJavaLang = signatureBuildingComponents2.javaLang("Number");
        String desc10 = JvmPrimitiveType.BYTE.getDesc();
        AbstractC16544l.m18093f(desc10, "getDesc(...)");
        C17309l c17309l10 = new C17309l(Companion.access$method(companion3, strJavaLang, "toByte", "", desc10), Name.identifier("byteValue"));
        String strJavaLang2 = signatureBuildingComponents2.javaLang("Number");
        String desc11 = JvmPrimitiveType.SHORT.getDesc();
        AbstractC16544l.m18093f(desc11, "getDesc(...)");
        C17309l c17309l11 = new C17309l(Companion.access$method(companion3, strJavaLang2, "toShort", "", desc11), Name.identifier("shortValue"));
        String strJavaLang3 = signatureBuildingComponents2.javaLang("Number");
        String desc12 = jvmPrimitiveType3.getDesc();
        AbstractC16544l.m18093f(desc12, "getDesc(...)");
        C17309l c17309l12 = new C17309l(Companion.access$method(companion3, strJavaLang3, "toInt", "", desc12), Name.identifier("intValue"));
        String strJavaLang4 = signatureBuildingComponents2.javaLang("Number");
        String desc13 = JvmPrimitiveType.LONG.getDesc();
        AbstractC16544l.m18093f(desc13, "getDesc(...)");
        C17309l c17309l13 = new C17309l(Companion.access$method(companion3, strJavaLang4, "toLong", "", desc13), Name.identifier("longValue"));
        String strJavaLang5 = signatureBuildingComponents2.javaLang("Number");
        String desc14 = JvmPrimitiveType.FLOAT.getDesc();
        AbstractC16544l.m18093f(desc14, "getDesc(...)");
        C17309l c17309l14 = new C17309l(Companion.access$method(companion3, strJavaLang5, "toFloat", "", desc14), Name.identifier("floatValue"));
        String strJavaLang6 = signatureBuildingComponents2.javaLang("Number");
        String desc15 = JvmPrimitiveType.DOUBLE.getDesc();
        AbstractC16544l.m18093f(desc15, "getDesc(...)");
        C17309l c17309l15 = new C17309l(Companion.access$method(companion3, strJavaLang6, "toDouble", "", desc15), Name.identifier("doubleValue"));
        C17309l c17309l16 = new C17309l(nameAndSignatureAccess$method4, Name.identifier("remove"));
        String strJavaLang7 = signatureBuildingComponents2.javaLang("CharSequence");
        String desc16 = jvmPrimitiveType3.getDesc();
        AbstractC16544l.m18093f(desc16, "getDesc(...)");
        String desc17 = JvmPrimitiveType.CHAR.getDesc();
        AbstractC16544l.m18093f(desc17, "getDesc(...)");
        Map mapM19244f2 = AbstractC17659D.m19244f(c17309l10, c17309l11, c17309l12, c17309l13, c17309l14, c17309l15, c17309l16, new C17309l(Companion.access$method(companion3, strJavaLang7, "get", desc16, desc17), Name.identifier("charAt")));
        f51788h = mapM19244f2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC17660E.m19257b(mapM19244f2.size()));
        for (Map.Entry entry2 : mapM19244f2.entrySet()) {
            linkedHashMap2.put(((Companion.NameAndSignature) entry2.getKey()).getSignature(), entry2.getValue());
        }
        f51789i = linkedHashMap2;
        ?? r6 = f51788h;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r6.entrySet()) {
            linkedHashSet.add(Companion.NameAndSignature.copy$default((Companion.NameAndSignature) entry3.getKey(), null, (Name) entry3.getValue(), null, null, 13, null).getSignature());
        }
        Set setKeySet = f51788h.keySet();
        HashSet hashSet = new HashSet();
        Iterator it5 = setKeySet.iterator();
        while (it5.hasNext()) {
            hashSet.add(((Companion.NameAndSignature) it5.next()).getName());
        }
        f51790j = hashSet;
        Set<Map.Entry> setEntrySet = f51788h.entrySet();
        ArrayList<C17309l> arrayList7 = new ArrayList(AbstractC17682p.m19389r(setEntrySet, 10));
        for (Map.Entry entry4 : setEntrySet) {
            arrayList7.add(new C17309l(((Companion.NameAndSignature) entry4.getKey()).getName(), entry4.getValue()));
        }
        int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(arrayList7, 10));
        if (iM19257b < 16) {
            iM19257b = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iM19257b);
        for (C17309l c17309l17 : arrayList7) {
            linkedHashMap3.put((Name) c17309l17.f55137Z, (Name) c17309l17.f55136Y);
        }
        f51791k = linkedHashMap3;
    }
}
