package io.sentry.config;

import io.sentry.util.AbstractC15503h;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import p544W9.AbstractC8483G3;
import p571X9.AbstractC9306j0;

/* JADX INFO: renamed from: io.sentry.config.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C15344e implements InterfaceC15343d {

    /* JADX INFO: renamed from: a */
    public final String f47902a;

    /* JADX INFO: renamed from: b */
    public final Properties f47903b;

    public C15344e(String str, Properties properties) {
        this.f47902a = str;
        AbstractC8483G3.m9133c(properties, "properties are required");
        this.f47903b = properties;
    }

    @Override // io.sentry.config.InterfaceC15343d
    /* JADX INFO: renamed from: a */
    public final String mo16569a(String str) {
        return AbstractC15503h.m16688b(this.f47903b.getProperty(AbstractC9306j0.m9891j(this.f47902a, str, new StringBuilder())));
    }

    @Override // io.sentry.config.InterfaceC15343d
    /* JADX INFO: renamed from: b */
    public final Map mo16570b() {
        String strM9891j = AbstractC9306j0.m9891j(this.f47902a, "tags.", new StringBuilder());
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f47903b.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str = (String) entry.getKey();
                if (str.startsWith(strM9891j)) {
                    map.put(str.substring(strM9891j.length()), AbstractC15503h.m16688b((String) entry.getValue()));
                }
            }
        }
        return map;
    }

    public C15344e(Properties properties) {
        this("", properties);
    }
}
