package p803i7;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1436k;
import p1113xn.AbstractC21322p;
import p200Hm.C3504c;

/* JADX INFO: renamed from: i7.b */
/* JADX INFO: loaded from: classes.dex */
public final class C14939b extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C14939b f46542Z = new C14939b(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C14939b f46543o0 = new C14939b(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C14939b f46544p0 = new C14939b(1, 2);

    /* JADX INFO: renamed from: q0 */
    public static final C14939b f46545q0 = new C14939b(1, 3);

    /* JADX INFO: renamed from: r0 */
    public static final C14939b f46546r0 = new C14939b(1, 4);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f46547Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14939b(int i10, int i11) {
        super(i10);
        this.f46547Y = i11;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f46547Y) {
            case 0:
                String it = (String) obj;
                AbstractC16544l.m18094g(it, "it");
                Locale locale = Locale.US;
                return AbstractC0168G.m534w(locale, "US", it, locale, "toLowerCase(...)");
            case 1:
                String it2 = (String) obj;
                AbstractC16544l.m18094g(it2, "it");
                C3504c c3504c = new C3504c('a', 'z');
                Character chValueOf = it2.length() > 0 ? Character.valueOf(it2.charAt(0)) : null;
                if (chValueOf != null) {
                    char cCharValue = chValueOf.charValue();
                    if (AbstractC16544l.m18096i(97, cCharValue) <= 0 && AbstractC16544l.m18096i(cCharValue, c3504c.f10583Z) <= 0) {
                        return it2;
                    }
                }
                return null;
            case 2:
                String it3 = (String) obj;
                AbstractC16544l.m18094g(it3, "it");
                Pattern patternCompile = Pattern.compile("[^a-z0-9_:./-]");
                AbstractC16544l.m18093f(patternCompile, "compile(...)");
                String strReplaceAll = patternCompile.matcher(it3).replaceAll("_");
                AbstractC16544l.m18093f(strReplaceAll, "replaceAll(...)");
                return strReplaceAll;
            case 3:
                String it4 = (String) obj;
                AbstractC16544l.m18094g(it4, "it");
                if (!AbstractC21322p.m21671E(it4, ':')) {
                    return it4;
                }
                String strSubstring = it4.substring(0, AbstractC21322p.m21674H(it4));
                AbstractC16544l.m18093f(strSubstring, "substring(...)");
                return strSubstring;
            default:
                String it5 = (String) obj;
                AbstractC16544l.m18094g(it5, "it");
                if (it5.length() <= 200) {
                    return it5;
                }
                String strSubstring2 = it5.substring(0, RCHTTPStatusCodes.SUCCESS);
                AbstractC16544l.m18093f(strSubstring2, "substring(...)");
                return strSubstring2;
        }
    }
}
