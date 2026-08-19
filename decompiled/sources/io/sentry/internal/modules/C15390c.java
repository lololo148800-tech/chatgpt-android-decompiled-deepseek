package io.sentry.internal.modules;

import io.sentry.EnumC15375i1;
import io.sentry.InterfaceC15127H;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: io.sentry.internal.modules.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C15390c extends AbstractC15391d {

    /* JADX INFO: renamed from: d */
    public final Pattern f47976d;

    /* JADX INFO: renamed from: e */
    public final Pattern f47977e;

    /* JADX INFO: renamed from: f */
    public final ClassLoader f47978f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15390c(InterfaceC15127H interfaceC15127H) {
        super(interfaceC15127H);
        ClassLoader classLoader = C15390c.class.getClassLoader();
        this.f47976d = Pattern.compile(".*/(.+)!/META-INF/MANIFEST.MF");
        this.f47977e = Pattern.compile("(.*?)-(\\d+\\.\\d+.*).jar");
        this.f47978f = classLoader == null ? ClassLoader.getSystemClassLoader() : classLoader;
    }

    @Override // io.sentry.internal.modules.AbstractC15391d
    /* JADX INFO: renamed from: b */
    public final Map mo16644b() {
        HashMap map = new HashMap();
        ArrayList<C15389b> arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.f47978f.getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                Matcher matcher = this.f47976d.matcher(resources.nextElement().toString());
                C15389b c15389b = null;
                String strGroup = (matcher.matches() && matcher.groupCount() == 1) ? matcher.group(1) : null;
                if (strGroup != null) {
                    Matcher matcher2 = this.f47977e.matcher(strGroup);
                    if (matcher2.matches() && matcher2.groupCount() == 2) {
                        c15389b = new C15389b(matcher2.group(1), matcher2.group(2));
                    }
                }
                if (c15389b != null) {
                    arrayList.add(c15389b);
                }
            }
        } catch (Throwable th2) {
            this.f47980a.mo16297h(EnumC15375i1.ERROR, "Unable to detect modules via manifest files.", th2);
        }
        for (C15389b c15389b2 : arrayList) {
            map.put(c15389b2.f47974a, c15389b2.f47975b);
        }
        return map;
    }
}
