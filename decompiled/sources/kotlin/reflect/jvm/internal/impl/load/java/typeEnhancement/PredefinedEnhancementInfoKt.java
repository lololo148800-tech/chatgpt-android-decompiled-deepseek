package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import p077Cn.C1756x;
import p648an.C10756d;
import p648an.C10757e;
import p648an.C10758f;
import p648an.C10760h;

/* JADX INFO: loaded from: classes2.dex */
public final class PredefinedEnhancementInfoKt {

    /* JADX INFO: renamed from: a */
    public static final JavaTypeQualifiers f51989a = new JavaTypeQualifiers(NullabilityQualifier.NULLABLE, null, false, false, 8, null);

    /* JADX INFO: renamed from: b */
    public static final JavaTypeQualifiers f51990b;

    /* JADX INFO: renamed from: c */
    public static final JavaTypeQualifiers f51991c;

    /* JADX INFO: renamed from: d */
    public static final LinkedHashMap f51992d;

    static {
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        f51990b = new JavaTypeQualifiers(nullabilityQualifier, null, false, false, 8, null);
        f51991c = new JavaTypeQualifiers(nullabilityQualifier, null, true, false, 8, null);
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        String strJavaLang = signatureBuildingComponents.javaLang("Object");
        String strJavaFunction = signatureBuildingComponents.javaFunction("Predicate");
        String strJavaFunction2 = signatureBuildingComponents.javaFunction("Function");
        String strJavaFunction3 = signatureBuildingComponents.javaFunction("Consumer");
        String strJavaFunction4 = signatureBuildingComponents.javaFunction("BiFunction");
        String strJavaFunction5 = signatureBuildingComponents.javaFunction("BiConsumer");
        String strJavaFunction6 = signatureBuildingComponents.javaFunction("UnaryOperator");
        String strJavaUtil = signatureBuildingComponents.javaUtil("stream/Stream");
        String strJavaUtil2 = signatureBuildingComponents.javaUtil("Optional");
        C10760h c10760h = new C10760h();
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder$ClassEnhancementBuilder(c10760h, signatureBuildingComponents.javaUtil("Iterator")), "forEachRemaining", null, new C10756d(strJavaFunction3, 0), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder$ClassEnhancementBuilder(c10760h, signatureBuildingComponents.javaLang("Iterable")), "spliterator", null, new C1756x(signatureBuildingComponents, 17), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder signatureEnhancementBuilder$ClassEnhancementBuilder = new SignatureEnhancementBuilder$ClassEnhancementBuilder(c10760h, signatureBuildingComponents.javaUtil("Collection"));
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder, "removeIf", null, new C10756d(strJavaFunction, 17), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder, "stream", null, new C10756d(strJavaUtil, 26), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder, "parallelStream", null, new C10758f(strJavaUtil, 1), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder signatureEnhancementBuilder$ClassEnhancementBuilder2 = new SignatureEnhancementBuilder$ClassEnhancementBuilder(c10760h, signatureBuildingComponents.javaUtil("List"));
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder2, "replaceAll", null, new C10758f(strJavaFunction6, 2), 2, null);
        signatureEnhancementBuilder$ClassEnhancementBuilder2.function("addFirst", "2.1", new C10758f(strJavaLang, 3));
        signatureEnhancementBuilder$ClassEnhancementBuilder2.function("addLast", "2.1", new C10758f(strJavaLang, 4));
        signatureEnhancementBuilder$ClassEnhancementBuilder2.function("removeFirst", "2.1", new C10758f(strJavaLang, 5));
        signatureEnhancementBuilder$ClassEnhancementBuilder2.function("removeLast", "2.1", new C10758f(strJavaLang, 6));
        SignatureEnhancementBuilder$ClassEnhancementBuilder signatureEnhancementBuilder$ClassEnhancementBuilder3 = new SignatureEnhancementBuilder$ClassEnhancementBuilder(c10760h, signatureBuildingComponents.javaUtil("LinkedList"));
        signatureEnhancementBuilder$ClassEnhancementBuilder3.function("addFirst", "2.1", new C10756d(strJavaLang, 1));
        signatureEnhancementBuilder$ClassEnhancementBuilder3.function("addLast", "2.1", new C10756d(strJavaLang, 2));
        signatureEnhancementBuilder$ClassEnhancementBuilder3.function("removeFirst", "2.1", new C10756d(strJavaLang, 3));
        signatureEnhancementBuilder$ClassEnhancementBuilder3.function("removeLast", "2.1", new C10756d(strJavaLang, 4));
        SignatureEnhancementBuilder$ClassEnhancementBuilder signatureEnhancementBuilder$ClassEnhancementBuilder4 = new SignatureEnhancementBuilder$ClassEnhancementBuilder(c10760h, signatureBuildingComponents.javaUtil("LinkedHashSet"));
        signatureEnhancementBuilder$ClassEnhancementBuilder4.function("addFirst", "2.2", new C10756d(strJavaLang, 5));
        signatureEnhancementBuilder$ClassEnhancementBuilder4.function("addLast", "2.2", new C10756d(strJavaLang, 6));
        signatureEnhancementBuilder$ClassEnhancementBuilder4.function("removeFirst", "2.2", new C10756d(strJavaLang, 7));
        signatureEnhancementBuilder$ClassEnhancementBuilder4.function("removeLast", "2.2", new C10756d(strJavaLang, 8));
        signatureEnhancementBuilder$ClassEnhancementBuilder4.function("getFirst", "2.2", new C10756d(strJavaLang, 9));
        signatureEnhancementBuilder$ClassEnhancementBuilder4.function("getLast", "2.2", new C10756d(strJavaLang, 10));
        SignatureEnhancementBuilder$ClassEnhancementBuilder signatureEnhancementBuilder$ClassEnhancementBuilder5 = new SignatureEnhancementBuilder$ClassEnhancementBuilder(c10760h, signatureBuildingComponents.javaUtil("Map"));
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder5, "forEach", null, new C10756d(strJavaFunction5, 11), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder5, "putIfAbsent", null, new C10756d(strJavaLang, 12), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder5, "replace", null, new C10756d(strJavaLang, 13), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder5, "replace", null, new C10756d(strJavaLang, 14), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder5, "replaceAll", null, new C10756d(strJavaFunction4, 15), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder5, "compute", null, new C10757e(0, strJavaLang, strJavaFunction4), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder5, "computeIfAbsent", null, new C10757e(1, strJavaLang, strJavaFunction2), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder5, "computeIfPresent", null, new C10757e(2, strJavaLang, strJavaFunction4), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder5, "merge", null, new C10757e(3, strJavaLang, strJavaFunction4), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder signatureEnhancementBuilder$ClassEnhancementBuilder6 = new SignatureEnhancementBuilder$ClassEnhancementBuilder(c10760h, signatureBuildingComponents.javaUtil("LinkedHashMap"));
        signatureEnhancementBuilder$ClassEnhancementBuilder6.function("putFirst", "2.2", new C10756d(strJavaLang, 16));
        signatureEnhancementBuilder$ClassEnhancementBuilder6.function("putLast", "2.2", new C10756d(strJavaLang, 18));
        SignatureEnhancementBuilder$ClassEnhancementBuilder signatureEnhancementBuilder$ClassEnhancementBuilder7 = new SignatureEnhancementBuilder$ClassEnhancementBuilder(c10760h, strJavaUtil2);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder7, "empty", null, new C10756d(strJavaUtil2, 19), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder7, "of", null, new C10757e(4, strJavaLang, strJavaUtil2), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder7, "ofNullable", null, new C10757e(5, strJavaLang, strJavaUtil2), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder7, "get", null, new C10756d(strJavaLang, 20), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(signatureEnhancementBuilder$ClassEnhancementBuilder7, "ifPresent", null, new C10756d(strJavaFunction3, 21), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder$ClassEnhancementBuilder(c10760h, signatureBuildingComponents.javaLang("ref/Reference")), "get", null, new C10756d(strJavaLang, 22), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder$ClassEnhancementBuilder(c10760h, strJavaFunction), "test", null, new C10756d(strJavaLang, 23), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder$ClassEnhancementBuilder(c10760h, signatureBuildingComponents.javaFunction("BiPredicate")), "test", null, new C10756d(strJavaLang, 24), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder$ClassEnhancementBuilder(c10760h, strJavaFunction3), "accept", null, new C10756d(strJavaLang, 25), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder$ClassEnhancementBuilder(c10760h, strJavaFunction5), "accept", null, new C10756d(strJavaLang, 27), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder$ClassEnhancementBuilder(c10760h, strJavaFunction2), "apply", null, new C10756d(strJavaLang, 28), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder$ClassEnhancementBuilder(c10760h, strJavaFunction4), "apply", null, new C10756d(strJavaLang, 29), 2, null);
        SignatureEnhancementBuilder$ClassEnhancementBuilder.function$default(new SignatureEnhancementBuilder$ClassEnhancementBuilder(c10760h, signatureBuildingComponents.javaFunction("Supplier")), "get", null, new C10758f(strJavaLang, 0), 2, null);
        f51992d = c10760h.f31972a;
    }

    public static final Map<String, PredefinedFunctionEnhancementInfo> getPREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE() {
        return f51992d;
    }
}
