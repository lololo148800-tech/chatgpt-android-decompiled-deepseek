package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import cn.UfGr.EhBykzn;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import p160G5.p161rK.TVCuK;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17686t;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmBuiltInsSignatures {
    public static final JvmBuiltInsSignatures INSTANCE = new JvmBuiltInsSignatures();

    /* JADX INFO: renamed from: a */
    public static final LinkedHashSet f51384a;

    /* JADX INFO: renamed from: b */
    public static final LinkedHashSet f51385b;

    /* JADX INFO: renamed from: c */
    public static final Set f51386c;

    /* JADX INFO: renamed from: d */
    public static final LinkedHashSet f51387d;

    /* JADX INFO: renamed from: e */
    public static final LinkedHashSet f51388e;

    /* JADX INFO: renamed from: f */
    public static final LinkedHashSet f51389f;

    /* JADX INFO: renamed from: g */
    public static final Set f51390g;

    static {
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        f51384a = AbstractC17665J.m19267g(signatureBuildingComponents.inJavaUtil("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        List<JvmPrimitiveType> listM19382k = AbstractC17681o.m19382k(JvmPrimitiveType.BOOLEAN, JvmPrimitiveType.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JvmPrimitiveType jvmPrimitiveType : listM19382k) {
            String strAsString = jvmPrimitiveType.getWrapperFqName().shortName().asString();
            AbstractC16544l.m18093f(strAsString, "asString(...)");
            AbstractC17686t.m19398v(signatureBuildingComponents.inJavaLang(strAsString, jvmPrimitiveType.getJavaKeywordName() + "Value()" + jvmPrimitiveType.getDesc()), linkedHashSet);
        }
        f51385b = AbstractC17665J.m19266f(AbstractC17665J.m19266f(AbstractC17665J.m19266f(AbstractC17665J.m19266f(AbstractC17665J.m19266f(AbstractC17665J.m19266f(linkedHashSet, signatureBuildingComponents.inJavaUtil("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), signatureBuildingComponents.inJavaLang("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), signatureBuildingComponents.inJavaLang("Double", "isInfinite()Z", "isNaN()Z")), signatureBuildingComponents.inJavaLang("Float", "isInfinite()Z", "isNaN()Z")), signatureBuildingComponents.inJavaLang("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), signatureBuildingComponents.inJavaLang("CharSequence", "isEmpty()Z"));
        SignatureBuildingComponents signatureBuildingComponents2 = SignatureBuildingComponents.INSTANCE;
        f51386c = signatureBuildingComponents2.inJavaUtil("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        f51387d = AbstractC17665J.m19266f(AbstractC17665J.m19266f(AbstractC17665J.m19266f(AbstractC17665J.m19266f(AbstractC17665J.m19266f(AbstractC17665J.m19266f(signatureBuildingComponents2.inJavaLang("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), signatureBuildingComponents2.inJavaUtil("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), signatureBuildingComponents2.inJavaLang("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), signatureBuildingComponents2.inJavaLang("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), signatureBuildingComponents2.inJavaUtil("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), signatureBuildingComponents2.inJavaUtil("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), signatureBuildingComponents2.inJavaUtil("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f51388e = AbstractC17665J.m19266f(AbstractC17665J.m19266f(signatureBuildingComponents2.inJavaUtil("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), signatureBuildingComponents2.inJavaUtil("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), signatureBuildingComponents2.inJavaUtil("Map", EhBykzn.aJiRYvGVdEB, "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        INSTANCE.getClass();
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.BYTE;
        List listM19382k2 = AbstractC17681o.m19382k(JvmPrimitiveType.BOOLEAN, jvmPrimitiveType2, JvmPrimitiveType.DOUBLE, JvmPrimitiveType.FLOAT, jvmPrimitiveType2, JvmPrimitiveType.INT, JvmPrimitiveType.LONG, JvmPrimitiveType.SHORT);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = listM19382k2.iterator();
        while (it.hasNext()) {
            String strAsString2 = ((JvmPrimitiveType) it.next()).getWrapperFqName().shortName().asString();
            AbstractC16544l.m18093f(strAsString2, "asString(...)");
            String[] strArrConstructors = signatureBuildingComponents2.constructors("Ljava/lang/String;");
            AbstractC17686t.m19398v(signatureBuildingComponents2.inJavaLang(strAsString2, (String[]) Arrays.copyOf(strArrConstructors, strArrConstructors.length)), linkedHashSet2);
        }
        String[] strArrConstructors2 = signatureBuildingComponents2.constructors("D");
        LinkedHashSet linkedHashSetM19266f = AbstractC17665J.m19266f(linkedHashSet2, signatureBuildingComponents2.inJavaLang("Float", (String[]) Arrays.copyOf(strArrConstructors2, strArrConstructors2.length)));
        String[] strArrConstructors3 = signatureBuildingComponents2.constructors("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f51389f = AbstractC17665J.m19266f(linkedHashSetM19266f, signatureBuildingComponents2.inJavaLang("String", (String[]) Arrays.copyOf(strArrConstructors3, strArrConstructors3.length)));
        SignatureBuildingComponents signatureBuildingComponents3 = SignatureBuildingComponents.INSTANCE;
        String[] strArrConstructors4 = signatureBuildingComponents3.constructors("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f51390g = signatureBuildingComponents3.inJavaLang("Throwable", (String[]) Arrays.copyOf(strArrConstructors4, strArrConstructors4.length));
    }

    public final Set<String> getDEPRECATED_LIST_METHODS() {
        return f51386c;
    }

    public final Set<String> getDROP_LIST_METHOD_SIGNATURES() {
        return f51384a;
    }

    public final Set<String> getHIDDEN_CONSTRUCTOR_SIGNATURES() {
        return f51389f;
    }

    public final Set<String> getHIDDEN_METHOD_SIGNATURES() {
        return f51385b;
    }

    public final Set<String> getMUTABLE_METHOD_SIGNATURES() {
        return f51388e;
    }

    public final Set<String> getVISIBLE_CONSTRUCTOR_SIGNATURES() {
        return f51390g;
    }

    public final Set<String> getVISIBLE_METHOD_SIGNATURES() {
        return f51387d;
    }

    public final boolean isArrayOrPrimitiveArray(FqNameUnsafe fqName) {
        AbstractC16544l.m18094g(fqName, "fqName");
        return fqName.equals(StandardNames.FqNames.array) || StandardNames.isPrimitiveArray(fqName);
    }

    public final boolean isSerializableInJava(FqNameUnsafe fqNameUnsafe) {
        AbstractC16544l.m18094g(fqNameUnsafe, TVCuK.czloEezvHpOkN);
        if (isArrayOrPrimitiveArray(fqNameUnsafe)) {
            return true;
        }
        ClassId classIdMapKotlinToJava = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(fqNameUnsafe);
        if (classIdMapKotlinToJava == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(classIdMapKotlinToJava.asSingleFqName().asString()));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
