package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17681o;

/* JADX INFO: loaded from: classes2.dex */
public final class PropertiesConventionUtilKt {
    /* JADX INFO: renamed from: a */
    public static Name m18176a(Name name, String str, String str2, int i10) {
        char cCharAt;
        boolean z6 = (i10 & 4) != 0;
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        if (!name.isSpecial()) {
            String identifier = name.getIdentifier();
            AbstractC16544l.m18093f(identifier, "getIdentifier(...)");
            if (AbstractC21329w.m21734u(identifier, str, false) && identifier.length() != str.length() && ('a' > (cCharAt = identifier.charAt(str.length())) || cCharAt >= '{')) {
                if (str2 != null) {
                    return Name.identifier(str2.concat(AbstractC21322p.m21688V(identifier, str)));
                }
                if (!z6) {
                    return name;
                }
                String strDecapitalizeSmartForCompiler = CapitalizeDecapitalizeKt.decapitalizeSmartForCompiler(AbstractC21322p.m21688V(identifier, str), true);
                if (Name.isValidIdentifier(strDecapitalizeSmartForCompiler)) {
                    return Name.identifier(strDecapitalizeSmartForCompiler);
                }
            }
        }
        return null;
    }

    public static final List<Name> getPropertyNamesCandidatesByAccessorName(Name name) {
        AbstractC16544l.m18094g(name, "name");
        String strAsString = name.asString();
        AbstractC16544l.m18093f(strAsString, "asString(...)");
        if (JvmAbi.isGetterName(strAsString)) {
            return AbstractC17681o.m19383l(propertyNameByGetMethodName(name));
        }
        return JvmAbi.isSetterName(strAsString) ? propertyNamesBySetMethodName(name) : BuiltinSpecialProperties.INSTANCE.getPropertyNameCandidatesBySpecialGetterName(name);
    }

    public static final Name propertyNameByGetMethodName(Name methodName) {
        AbstractC16544l.m18094g(methodName, "methodName");
        Name nameM18176a = m18176a(methodName, "get", null, 12);
        return nameM18176a == null ? m18176a(methodName, "is", null, 8) : nameM18176a;
    }

    public static final Name propertyNameBySetMethodName(Name methodName, boolean z6) {
        AbstractC16544l.m18094g(methodName, "methodName");
        return m18176a(methodName, "set", z6 ? "is" : null, 4);
    }

    public static final List<Name> propertyNamesBySetMethodName(Name methodName) {
        AbstractC16544l.m18094g(methodName, "methodName");
        return AbstractC17678l.m19315v(new Name[]{propertyNameBySetMethodName(methodName, false), propertyNameBySetMethodName(methodName, true)});
    }
}
