package kotlin.reflect.jvm.internal.impl.name;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p1113xn.AbstractC21329w;
import p711dn.EnumC13184a;

/* JADX INFO: loaded from: classes2.dex */
public final class FqNamesUtilKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC13184a.values().length];
            try {
                EnumC13184a enumC13184a = EnumC13184a.f41839Y;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnumC13184a enumC13184a2 = EnumC13184a.f41839Y;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EnumC13184a enumC13184a3 = EnumC13184a.f41839Y;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final <V> V findValueForMostSpecificFqname(FqName fqName, Map<FqName, ? extends V> values) {
        Object next;
        AbstractC16544l.m18094g(fqName, "<this>");
        AbstractC16544l.m18094g(values, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<FqName, ? extends V> entry : values.entrySet()) {
            FqName key = entry.getKey();
            if (fqName.equals(key) || isChildOf(fqName, key)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length = tail((FqName) ((Map.Entry) next).getKey(), fqName).asString().length();
                do {
                    Object next2 = it.next();
                    int length2 = tail((FqName) ((Map.Entry) next2).getKey(), fqName).asString().length();
                    if (length > length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return (V) entry2.getValue();
        }
        return null;
    }

    public static final boolean isChildOf(FqName fqName, FqName packageName) {
        AbstractC16544l.m18094g(fqName, "<this>");
        AbstractC16544l.m18094g(packageName, "packageName");
        return AbstractC16544l.m18089b(parentOrNull(fqName), packageName);
    }

    public static final boolean isSubpackageOf(FqName fqName, FqName packageName) {
        AbstractC16544l.m18094g(fqName, "<this>");
        AbstractC16544l.m18094g(packageName, "packageName");
        if (fqName.equals(packageName) || packageName.isRoot()) {
            return true;
        }
        String strAsString = fqName.asString();
        String strAsString2 = packageName.asString();
        return AbstractC21329w.m21734u(strAsString, strAsString2, false) && strAsString.charAt(strAsString2.length()) == '.';
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0039  */
    /* JADX WARN: Code duplicated, block: B:34:0x0038 A[SYNTHETIC] */
    public static final boolean isValidJavaFqName(String str) {
        if (str == null) {
            return false;
        }
        EnumC13184a enumC13184a = EnumC13184a.f41839Y;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            int iOrdinal = enumC13184a.ordinal();
            if (iOrdinal == 0) {
                if (!Character.isJavaIdentifierStart(cCharAt)) {
                    return false;
                }
                enumC13184a = EnumC13184a.f41840Z;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new C0644w();
                }
                if (!Character.isJavaIdentifierStart(cCharAt)) {
                    return false;
                }
                enumC13184a = EnumC13184a.f41840Z;
            } else if (cCharAt == '.') {
                enumC13184a = EnumC13184a.f41841o0;
            } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                return false;
            }
        }
        return enumC13184a != EnumC13184a.f41841o0;
    }

    public static final FqName parentOrNull(FqName fqName) {
        AbstractC16544l.m18094g(fqName, "<this>");
        if (fqName.isRoot()) {
            return null;
        }
        return fqName.parent();
    }

    public static final FqName tail(FqName fqName, FqName prefix) {
        AbstractC16544l.m18094g(fqName, "<this>");
        AbstractC16544l.m18094g(prefix, "prefix");
        if (!isSubpackageOf(fqName, prefix) || prefix.isRoot()) {
            return fqName;
        }
        if (fqName.equals(prefix)) {
            return FqName.ROOT;
        }
        String strSubstring = fqName.asString().substring(prefix.asString().length() + 1);
        AbstractC16544l.m18093f(strSubstring, "substring(...)");
        return new FqName(strSubstring);
    }
}
