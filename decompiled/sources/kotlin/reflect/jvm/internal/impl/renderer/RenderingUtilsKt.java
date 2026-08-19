package kotlin.reflect.jvm.internal.impl.renderer;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import p1113xn.AbstractC21329w;
import p628Zk.GwZB.tpXhEMGxfXFVSh;

/* JADX INFO: loaded from: classes2.dex */
public final class RenderingUtilsKt {
    public static final String render(Name name) {
        AbstractC16544l.m18094g(name, "<this>");
        String strAsString = name.asString();
        AbstractC16544l.m18093f(strAsString, "asString(...)");
        if (!KeywordStringsGenerated.KEYWORDS.contains(strAsString)) {
            for (int i10 = 0; i10 < strAsString.length(); i10++) {
                char cCharAt = strAsString.charAt(i10);
                if (Character.isLetterOrDigit(cCharAt) || cCharAt == '_') {
                }
            }
            if (strAsString.length() != 0 && Character.isJavaIdentifierStart(strAsString.codePointAt(0))) {
                String strAsString2 = name.asString();
                AbstractC16544l.m18093f(strAsString2, "asString(...)");
                return strAsString2;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        String strAsString3 = name.asString();
        AbstractC16544l.m18093f(strAsString3, "asString(...)");
        sb2.append(tpXhEMGxfXFVSh.Xjh.concat(strAsString3));
        sb2.append('`');
        return sb2.toString();
    }

    public static final String renderFqName(List<Name> pathSegments) {
        AbstractC16544l.m18094g(pathSegments, "pathSegments");
        StringBuilder sb2 = new StringBuilder();
        for (Name name : pathSegments) {
            if (sb2.length() > 0) {
                sb2.append(Separators.DOT);
            }
            sb2.append(render(name));
        }
        return sb2.toString();
    }

    public static final String replacePrefixesInTypeRepresentations(String lowerRendered, String lowerPrefix, String upperRendered, String upperPrefix, String foldedPrefix) {
        AbstractC16544l.m18094g(lowerRendered, "lowerRendered");
        AbstractC16544l.m18094g(lowerPrefix, "lowerPrefix");
        AbstractC16544l.m18094g(upperRendered, "upperRendered");
        AbstractC16544l.m18094g(upperPrefix, "upperPrefix");
        AbstractC16544l.m18094g(foldedPrefix, "foldedPrefix");
        if (!AbstractC21329w.m21734u(lowerRendered, lowerPrefix, false) || !AbstractC21329w.m21734u(upperRendered, upperPrefix, false)) {
            return null;
        }
        String strSubstring = lowerRendered.substring(lowerPrefix.length());
        AbstractC16544l.m18093f(strSubstring, "substring(...)");
        String strSubstring2 = upperRendered.substring(upperPrefix.length());
        AbstractC16544l.m18093f(strSubstring2, "substring(...)");
        String strConcat = foldedPrefix.concat(strSubstring);
        if (strSubstring.equals(strSubstring2)) {
            return strConcat;
        }
        if (!typeStringsDifferOnlyInNullability(strSubstring, strSubstring2)) {
            return null;
        }
        return strConcat + '!';
    }

    public static final boolean typeStringsDifferOnlyInNullability(String lower, String upper) {
        AbstractC16544l.m18094g(lower, "lower");
        AbstractC16544l.m18094g(upper, "upper");
        if (!lower.equals(AbstractC21329w.m21731r(upper, Separators.QUESTION, "")) && (!AbstractC21329w.m21725l(upper, Separators.QUESTION, false) || !AbstractC16544l.m18089b(lower.concat(Separators.QUESTION), upper))) {
            if (!AbstractC16544l.m18089b(Separators.LPAREN + lower + ")?", upper)) {
                return false;
            }
        }
        return true;
    }

    public static final String render(FqNameUnsafe fqNameUnsafe) {
        AbstractC16544l.m18094g(fqNameUnsafe, "<this>");
        return renderFqName(fqNameUnsafe.pathSegments());
    }
}
