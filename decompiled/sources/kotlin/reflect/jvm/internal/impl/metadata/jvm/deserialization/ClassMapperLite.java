package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21329w;
import p523V9.AbstractC7965P4;
import p571X9.AbstractC9306j0;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;

/* JADX INFO: loaded from: classes2.dex */
public final class ClassMapperLite {
    public static final ClassMapperLite INSTANCE = new ClassMapperLite();

    /* JADX INFO: renamed from: a */
    public static final String f52656a = AbstractC17680n.m19349Y(AbstractC17681o.m19382k('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62);

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f52657b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listM19382k = AbstractC17681o.m19382k("Boolean", "Z", "Char", TokenNames.f32009C, "Byte", "B", "Short", TokenNames.f32018S, "Int", TokenNames.f32012I, "Float", TokenNames.f32011F, "Long", "J", "Double", "D");
        int iM8252c = AbstractC7965P4.m8252c(0, listM19382k.size() - 1, 2);
        if (iM8252c >= 0) {
            int i10 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                String str = f52656a;
                sb2.append(str);
                sb2.append('/');
                sb2.append((String) listM19382k.get(i10));
                int i11 = i10 + 1;
                linkedHashMap.put(sb2.toString(), listM19382k.get(i11));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append('/');
                linkedHashMap.put(AbstractC9306j0.m9891j((String) listM19382k.get(i10), "Array", sb3), "[" + ((String) listM19382k.get(i11)));
                if (i10 == iM8252c) {
                    break;
                } else {
                    i10 += 2;
                }
            }
        }
        linkedHashMap.put(f52656a + "/Unit", TokenNames.f32021V);
        m18259a(linkedHashMap, "Any", "java/lang/Object");
        m18259a(linkedHashMap, "Nothing", "java/lang/Void");
        m18259a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : AbstractC17681o.m19382k("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            m18259a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : AbstractC17681o.m19382k("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            m18259a(linkedHashMap, AbstractC9306j0.m9889h("collections/", str3), "java/util/" + str3);
            m18259a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        m18259a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        m18259a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        m18259a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        m18259a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i12 = 0; i12 < 23; i12++) {
            String strM11048f = AbstractC10763a.m11048f(i12, "Function");
            StringBuilder sb4 = new StringBuilder();
            String str4 = f52656a;
            sb4.append(str4);
            sb4.append("/jvm/functions/Function");
            sb4.append(i12);
            m18259a(linkedHashMap, strM11048f, sb4.toString());
            m18259a(linkedHashMap, "reflect/KFunction" + i12, str4 + "/reflect/KFunction");
        }
        for (String str5 : AbstractC17681o.m19382k("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            m18259a(linkedHashMap, AbstractC10763a.m11052j(str5, ".Companion"), f52656a + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f52657b = linkedHashMap;
    }

    /* JADX INFO: renamed from: a */
    public static final void m18259a(LinkedHashMap linkedHashMap, String str, String str2) {
        linkedHashMap.put(f52656a + '/' + str, TokenNames.f32014L + str2 + ';');
    }

    public static final String mapClass(String classId) {
        AbstractC16544l.m18094g(classId, "classId");
        String str = (String) f52657b.get(classId);
        if (str != null) {
            return str;
        }
        return TokenNames.f32014L + AbstractC21329w.m21730q(classId, '.', '$') + ';';
    }
}
