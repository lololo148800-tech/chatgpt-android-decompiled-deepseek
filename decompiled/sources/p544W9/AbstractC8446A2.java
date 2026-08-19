package p544W9;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p087D7.AbstractC1977d;
import p437Rn.C6959q;
import p523V9.AbstractC7889G0;
import p661b7.EnumC11255b;
import p780h7.C14424f;

/* JADX INFO: renamed from: W9.A2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8446A2 {
    /* JADX INFO: renamed from: a */
    public static void m9048a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m9049b(String str, List hosts) {
        AbstractC16544l.m18094g(hosts, "hosts");
        Pattern patternCompile = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$|^(([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]*[a-zA-Z0-9])\\.)+([A-Za-z]|[A-Za-z][A-Za-z0-9-]*[A-Za-z0-9])$");
        AbstractC16544l.m18093f(patternCompile, "compile(...)");
        Pattern patternCompile2 = Pattern.compile("^(http|https)://(.*)");
        AbstractC16544l.m18093f(patternCompile2, "compile(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = hosts.iterator();
        while (it.hasNext()) {
            String input = (String) it.next();
            AbstractC16544l.m18094g(input, "input");
            boolean zMatches = patternCompile2.matcher(input).matches();
            EnumC11255b enumC11255b = EnumC11255b.f34098Y;
            if (zMatches) {
                try {
                    URL url = new URL(input);
                    AbstractC7889G0.m8184b(AbstractC1977d.f5849a, 4, enumC11255b, new C6959q(input, str, url), null, false, 56);
                    input = url.getHost();
                } catch (MalformedURLException e10) {
                    AbstractC7889G0.m8184b(AbstractC1977d.f5849a, 5, enumC11255b, new C14424f(0, input, str), e10, false, 48);
                    input = null;
                }
            } else if (!patternCompile.matcher(input).matches()) {
                Locale locale = Locale.US;
                if (!AbstractC0168G.m534w(locale, "US", input, locale, "toLowerCase(...)").equals("localhost")) {
                    AbstractC7889G0.m8184b(AbstractC1977d.f5849a, 5, enumC11255b, new C14424f(1, input, str), null, false, 56);
                    input = null;
                }
            }
            if (input != null) {
                arrayList.add(input);
            }
        }
        return arrayList;
    }
}
